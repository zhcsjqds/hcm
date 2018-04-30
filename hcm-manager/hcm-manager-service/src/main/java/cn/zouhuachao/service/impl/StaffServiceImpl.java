package cn.zouhuachao.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.common.pojo.EasyUIDataGirdStaff;
import cn.zouhuachao.mapper.StaffMapper;
import cn.zouhuachao.pojo.Department;
import cn.zouhuachao.pojo.Staff;
import cn.zouhuachao.pojo.StaffDimission;
import cn.zouhuachao.pojo.StaffExample;
import cn.zouhuachao.pojo.StaffTransfer;
import cn.zouhuachao.service.IDepartmentService;
import cn.zouhuachao.service.IStaffDimissionService;
import cn.zouhuachao.service.IStaffPositionService;
import cn.zouhuachao.service.IStaffService;
import cn.zouhuachao.service.IStaffTransferService;
import cn.zouhuachao.utils.DateBetweenUtil;
import cn.zouhuachao.utils.DateToStringUtil;

@Service
public class StaffServiceImpl implements IStaffService{

	@Autowired
	private StaffMapper staffMapper;
	
	@Autowired
	private IStaffPositionService staffPositionService;
	
	@Autowired
	private IDepartmentService departmentService;
	
	@Autowired
	private IStaffTransferService staffTransferService;
	
	@Autowired
	private IStaffDimissionService staffDimissionService;
	/**
	 * 员工分页查询
	 */
	@Override
	public EasyUIDataGirdResult getStaffList(int page, int rows, String status, String realname) {
		List<EasyUIDataGirdStaff> sl = new ArrayList<>();
		// 设置分页信息
		PageHelper.startPage(page, rows);
		//查询(返回一页数据)
		StaffExample example = new StaffExample();
		if((status==null&&realname==null)||(status==""&&realname=="")) {
			example.createCriteria().andStatusBetween("在职", "离职");
		} else if(status!=""&&realname=="") {
			example.createCriteria().andStatusEqualTo(status);
		} else if(status==""&&realname!="") {
			example.createCriteria().andRealnameLike("%"+realname+"%");
		} else if(status!=""&&realname!="") {
			example.createCriteria().andStatusEqualTo(status).andRealnameLike("%"+realname+"%");
		} else if(status!=""&&realname==null) {
			example.createCriteria().andStatusEqualTo(status);
		}
		List<Staff> list = staffMapper.selectByExample(example);
		
		//封装显示的数据
		for (Staff staff : list) {
			EasyUIDataGirdStaff s = new EasyUIDataGirdStaff();
			s.setStaffid(staff.getStaffid());
			s.setStaffno(staff.getStaffno());
			s.setRealname(staff.getRealname());
			String positionName = staffPositionService.getPositionNameById(staff.getPositionid());
			s.setPositionid(staff.getPositionid());
			s.setPosition(positionName);
			Date birthday = staff.getBirthday();
			Integer age = DateBetweenUtil.dayCompare(birthday, new Date());
			s.setAge(age);
			s.setEducation(staff.getEducation());
			s.setPhone(staff.getPhone());
			s.setEmail(staff.getEmail());
			s.setStatus(staff.getStatus());
			s.setEntrydate(DateToStringUtil.toString(staff.getEntrydate()));
			Integer workage = DateBetweenUtil.dayCompare(staff.getEntrydate(), new Date());
			s.setWorkage(workage);
			String gender = staff.getGender();
			s.setGender(gender);
			s.setNativaplace(staff.getProvince()+staff.getCity());
			s.setNation(staff.getNation());
			s.setBloodtype(staff.getBloodtype());
			Department department = departmentService.findDepartmentById(staff.getDepartmentid());
			s.setDepartment(department.getDepartmentname());
			s.setDepartmentid(staff.getDepartmentid());
			s.setPoliticsstatus(staff.getPoliticsstatus());
			s.setBirthday(DateToStringUtil.toString(staff.getBirthday()));
			s.setIdentityid(staff.getIdentityid());
			s.setAddress(staff.getAddress());
			s.setBankcard(staff.getBankcard());
			s.setTitle(staff.getTitle());
			String maritalstatus = staff.getMaritalstatus();
			s.setMaritalstatus(maritalstatus);
			s.setProvince(staff.getProvince());
			s.setCity(staff.getCity());
			sl.add(s);
		}
		//创建一个返回值对象
		EasyUIDataGirdResult result = new EasyUIDataGirdResult();
		result.setRows(sl);
		//取分页结果（根据list记录数获得条数）
		PageInfo<Staff> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}

	/**
	 * 添加一个员工
	 */
	@Override
	public boolean addStaff(Staff staff) {
		int insert = staffMapper.insert(staff);
		return insert>0?true:false;
	}

	/**
	 * 通过Id查询员工
	 */
	@Override
	public Staff getStaffById(String id) {
		Staff staff = staffMapper.selectByPrimaryKey(id);
		return staff;
	}

	/**
	 * 设置员工编号
	 */
	@Override
	public boolean setStaffno(String staffno,String staffid) {
		Staff staff = staffMapper.selectByPrimaryKey(staffid);
		staff.setStaffno(staffno);
		int isupdate = staffMapper.updateByPrimaryKey(staff);
		return isupdate>0?true:false;
	}

	/**
	 * 解雇一名员工(不生成记录）
	 */
	@Override
	public boolean updateStaffByStaffno(String staffno) {
		StaffExample example = new StaffExample();
		example.createCriteria().andStaffnoEqualTo(staffno);
		List<Staff> list = staffMapper.selectByExample(example);
		Staff staff = list.get(0);
		staff.setStatus("离职");
		int isSuccess = staffMapper.updateByPrimaryKey(staff);
		return isSuccess>0?true:false;
	}

	/**
	 * 修改员工信息
	 */
	@Override
	public boolean editStaff(Staff staff) {
		int isSuccess = staffMapper.updateByPrimaryKeySelective(staff);
		return isSuccess>0?true:false;
	}

	/**
	 * 员工调职
	 */
	@Override
	public boolean updateStaffForTransfer(Staff staff, StaffTransfer staffTransfer) {
		int isSuccess = staffMapper.updateByPrimaryKeySelective(staff);
		boolean addStaffTransfer = staffTransferService.addStaffTransfer(staffTransfer);
		boolean updateStaff=isSuccess>0?true:false;
		return (addStaffTransfer==true&&updateStaff==true)?true:false;
	}

	/**
	 * 解雇一名员工(生成记录）
	 */
	@Override
	public boolean updateStaffForDimission(String staffid, StaffDimission staffDimission) {
		Staff staff = staffMapper.selectByPrimaryKey(staffid);
		staff.setStatus("离职");
		int isSuccess = staffMapper.updateByPrimaryKey(staff);
		boolean addStaffDimission = staffDimissionService.addStaffDimission(staffDimission);
		boolean updateStaff=isSuccess>0?true:false;
		return (addStaffDimission==true&&updateStaff==true)?true:false;
	}

	/**
	 * 根据员工id查询姓名
	 */
	@Override
	public String getStaffNameById(String appid) {
		Staff staff = staffMapper.selectByPrimaryKey(appid);
		return staff.getRealname();
	}
	
	/**
	 * 根据员工id查询编号
	 */
	@Override
	public String getStaffNoById(String id) {
		Staff staff = staffMapper.selectByPrimaryKey(id);
		return staff.getStaffno();
	}
}
