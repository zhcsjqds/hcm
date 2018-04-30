package cn.zouhuachao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.common.pojo.EasyUIDataGridDimission;
import cn.zouhuachao.mapper.StaffDimissionMapper;
import cn.zouhuachao.mapper.StaffMapper;
import cn.zouhuachao.pojo.Staff;
import cn.zouhuachao.pojo.StaffDimission;
import cn.zouhuachao.pojo.StaffDimissionExample;
import cn.zouhuachao.service.IDepartmentService;
import cn.zouhuachao.service.IStaffDimissionService;
import cn.zouhuachao.service.IStaffPositionService;

@Service
public class StaffDimissionServiceImpl implements IStaffDimissionService {

	@Autowired
	private StaffDimissionMapper staffDimissionMapper;
	
	@Autowired
	private StaffMapper staffMapper;
	
	@Autowired
	private IDepartmentService departmentService;
	
	@Autowired
	private IStaffPositionService positionService;
	
	/**
	 * 添加员工离职记录
	 */
	@Override
	public boolean addStaffDimission(StaffDimission staffDimission) {
		int insert = staffDimissionMapper.insert(staffDimission);
		return insert>0?true:false;
	}
	
	/**
	 * 离职记录分页查询
	 */
	@Override
	public EasyUIDataGirdResult getDimissionList(Integer page, Integer rows, String realname) {
		List<EasyUIDataGridDimission> sl = new ArrayList<>();
		// 设置分页信息
		PageHelper.startPage(page, rows);
		StaffDimissionExample example = new StaffDimissionExample();
		if(realname!=null&&realname!="") {
			example.createCriteria().andStaffrealnameLike("%"+realname+"%");
		}
		
		List<StaffDimission> dimissionList = staffDimissionMapper.selectByExample(example);
		for (StaffDimission dimission : dimissionList) {
			EasyUIDataGridDimission d = new EasyUIDataGridDimission();
			//id（该员工）
			String staffid = dimission.getStaffid();
			d.setStaffid(staffid);
			//staffno
			Staff staff = staffMapper.selectByPrimaryKey(staffid);
			d.setStaffno(staff.getStaffno());
			//staffrealname
			d.setStaffrealname(dimission.getStaffrealname());
			//department
			String department = departmentService.getDepartmentNameById(staff.getDepartmentid());
			d.setDepartment(department);
			//position
			String position = positionService.getPositionNameById(staff.getPositionid());
			d.setPosition(position);
			//dimissionreason
			d.setDimissionreason(dimission.getDimissionreason());
			//dimissionidtime
			d.setDimissionidtime(dimission.getDimissionidtime());
			//applicant申请人
			String applicantid = dimission.getApplicant();
			Staff applicant = staffMapper.selectByPrimaryKey(applicantid);
			d.setApplicant(applicant.getRealname());
			//approver审批人
			String approverid = dimission.getApprover();
			Staff approver = staffMapper.selectByPrimaryKey(approverid);
			d.setApprover(approver.getRealname());
			sl.add(d);
		}
		//创建一个返回值对象
		EasyUIDataGirdResult result = new EasyUIDataGirdResult();
		result.setRows(sl);
		//取分页结果（根据list记录数获得条数）
		PageInfo<StaffDimission> pageInfo = new PageInfo<>(dimissionList);
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}

}
