package cn.zouhuachao.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.pojo.Staff;
import cn.zouhuachao.pojo.StaffDimission;
import cn.zouhuachao.pojo.StaffTransfer;
import cn.zouhuachao.pojo.User;
import cn.zouhuachao.service.IDepartmentService;
import cn.zouhuachao.service.IStaffPositionService;
import cn.zouhuachao.service.IStaffService;
import cn.zouhuachao.service.IUserService;
import cn.zouhuachao.utils.CommonsUtils;

@Controller
public class StaffController {

	@Autowired
	private IStaffService staffService;
	
	@Autowired
	private IDepartmentService departmentService;
	
	@Autowired
	@Qualifier("userService")
	private IUserService userService;
	
	@Autowired
	private IStaffPositionService staffPositionService;
	
	
	/**
	 * 修改员工信息
	 * @param request
	 * @param response
	 */
	@RequestMapping("/staffEdit")
	@ResponseBody
	public void staffEdit(HttpServletRequest request,HttpServletResponse response) {
		Staff staff = new Staff();
		Map<String, String[]> parameterMap = request.getParameterMap();
		
		try {
			//自己指定一个类型转换器（将String转成Date）
			ConvertUtils.register(new Converter() {
				@Override
				public Object convert(@SuppressWarnings("rawtypes") Class clazz, Object value) {
					//将string转成date
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
					Date parse = null;
					try {
						parse = format.parse(value.toString());
					} catch (ParseException e) {
						e.printStackTrace();
					}
					return parse;
				}
			}, Date.class);
			BeanUtils.populate(staff, parameterMap);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		boolean editStaff = staffService.editStaff(staff);
		
		if(editStaff) {
			try {
				response.getWriter().write("{\"status\":200}");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 员工录入
	 * @param request
	 * @return
	 */
	@SuppressWarnings("unused")
	@RequestMapping("/staffAdd")
	@ResponseBody
	public void addStaff(HttpServletRequest request,HttpServletResponse response) {
		Staff staff = new Staff();
		Map<String, String[]> parameterMap = request.getParameterMap();
		
		try {
			//自己指定一个类型转换器（将String转成Date）
			ConvertUtils.register(new Converter() {
				@Override
				public Object convert(@SuppressWarnings("rawtypes") Class clazz, Object value) {
					//将string转成date
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
					Date parse = null;
					try {
						parse = format.parse(value.toString());
					} catch (ParseException e) {
						e.printStackTrace();
					}
					return parse;
				}
			}, Date.class);
			BeanUtils.populate(staff, parameterMap);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
		//手动封装表单中没有的数据
		staff.setStaffid(CommonsUtils.getUUID());
		staff.setStatus("在职");
		String departmentid =staffPositionService.findDepartmentByPositionid(staff.getPositionid());
		staff.setDepartmentid(departmentid);
		
		boolean addStaff = staffService.addStaff(staff);
		
		if(addStaff) {
			//查询当前员工的no
			String staffid = staff.getStaffid();
			Staff staffById = findStaffById(staffid);
			//格式化no
			String formatString = String.format("%04d", staffById.getNo());
			//查询员工部门
			//String departmentid = staffById.getDepartmentid();
			//Department department = departmentService.findDepartmentById(departmentid);
			//获取部门编号
			//String departmentno = department.getDepartmentno();
			//查询员工职位对应的用户权限
			String positionid = staffById.getPositionid();
			String roleid = staffPositionService.getRoleidById(positionid);
			//拼接成员工编号
			String staffno = "no"+formatString;
			//设置员工编号
			boolean isok = staffService.setStaffno(staffno,staffid);
			//如果设置成功，为员工生成账号
			if(isok) {
				Staff s = findStaffById(staffid);
				boolean isAddUser = userService.autoAddUser(s,roleid);
			}
		}
		if(addStaff) {
			try {
				response.getWriter().write("{\"status\":200}");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 根据Id查询员工
	 * @param id
	 * @return
	 */
	public Staff findStaffById(String id) {
		Staff staff = staffService.getStaffById(id);
		return staff;
	}
	
	/**
	 * 员工花名册
	 * @return
	 */
	@RequestMapping("/stafflist")
	@ResponseBody
	public EasyUIDataGirdResult findStaffList(Integer page, Integer rows,String paygrade,String realname,String status) {
		EasyUIDataGirdResult staffList = staffService.getStaffList(page, rows,paygrade, status, realname);
		return staffList;
	}
	
	/**
	 * 解雇一名员工
	 */
	@RequestMapping("/fireStaff")
	@ResponseBody
	public void fireStaff(HttpServletRequest request,HttpServletResponse response,HttpSession session) {
		User user = (User) session.getAttribute("user");
		StaffDimission staffDimission = new StaffDimission();
		String appid = user.getStaffid();
		String staffid = request.getParameter("staffid");
		String positionid = request.getParameter("positionid");
		String departmentid = request.getParameter("departmentid");
		Date date = new Date();
		Staff staffById = staffService.getStaffById(staffid);
		
		//封装
		staffDimission.setDimissionid(CommonsUtils.getUUID());
		staffDimission.setStaffid(staffid);
		staffDimission.setStaffrealname(staffById.getRealname());
		staffDimission.setLastdepartment(departmentid);
		staffDimission.setLastjob(positionid);
		staffDimission.setApplicant(appid);
		staffDimission.setApprover(appid);
		staffDimission.setApplicantiontime(date);
		staffDimission.setDimissionidtime(date);
		staffDimission.setDimissionreason("辞退");
		staffDimission.setStatus("已通过");
		
		boolean isSuccess = staffService.updateStaffForDimission(staffid,staffDimission);
		if(isSuccess) {
			try {
				response.getWriter().write("{\"status\":200}");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 员工调职
	 */
	@RequestMapping("/staffTransfer")
	@ResponseBody
	public void staffTransfer(HttpServletRequest request,HttpServletResponse response,HttpSession session) {
		Staff staff = new Staff();
		User user = (User) session.getAttribute("user");
		String appid = user.getStaffid();
		String appname = staffService.getStaffNameById(appid);
		StaffTransfer staffTransfer = new StaffTransfer();
		String department = request.getParameter("department");
		String position = request.getParameter("position");
		String transreason = request.getParameter("transreason");
		String staffid = request.getParameter("staffid");
		String staffname = staffService.getStaffNameById(staffid);
		String staffno = staffService.getStaffNoById(staffid);
		String newdepartmentid = request.getParameter("newdepartmentid");
		String newpositionid = request.getParameter("newpositionid");
		String newdepartmentname = departmentService.getDepartmentNameById(newdepartmentid);
		String newpositionname = staffPositionService.getPositionNameById(newpositionid);

		//手动封装staff
		staff.setStaffid(staffid);
		staff.setDepartmentid(newdepartmentid);
		staff.setPositionid(newpositionid);
		
		Date date = new Date();
		//手动封装staffTransfer
		staffTransfer.setTransid(CommonsUtils.getUUID());
		staffTransfer.setStaffid(staffno);
		staffTransfer.setStaffrealname(staffname);
		staffTransfer.setLastdepartment(department);
		staffTransfer.setLastjob(position);
		staffTransfer.setTransreason(transreason);
		staffTransfer.setApplicant(appname);
		staffTransfer.setApprover(appname);
		staffTransfer.setApplicantiontime(date);
		staffTransfer.setNewdepartment(newdepartmentname);
		staffTransfer.setNewjob(newpositionname);
		staffTransfer.setTranstime(date);
		staffTransfer.setTranstatus("已通过");
		
		boolean isSuccess = staffService.updateStaffForTransfer(staff,staffTransfer);
		if(isSuccess) {
			try {
				response.getWriter().write("{\"status\":200}");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 工资定级
	 */
	@RequestMapping("/setPayGrade")
	@ResponseBody
	public void setPayGrade(String paygrade,String staffid,HttpServletResponse response) {
		boolean isSuccess = staffService.updateStaffForPaygrade(paygrade,staffid);
		if(isSuccess) {
			try {
				response.getWriter().write("{\"status\":200}");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 工资升级
	 */
	@RequestMapping("/updatePayGrade")
	@ResponseBody
	public void updatePayGrade(String newpaygrade,String staffid,HttpServletResponse response) {
		boolean isSuccess = staffService.updateStaffForPaygrade(newpaygrade,staffid);
		if(isSuccess) {
			try {
				response.getWriter().write("{\"status\":200}");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
