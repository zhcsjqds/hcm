package cn.zouhuachao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zouhuachao.mapper.StaffPositionMapper;
import cn.zouhuachao.pojo.StaffPosition;
import cn.zouhuachao.pojo.StaffPositionExample;
import cn.zouhuachao.service.IStaffPositionService;

@Service
public class StaffPositionServiceImpl implements IStaffPositionService {

	@Autowired
	private StaffPositionMapper staffPositionMapper;
	
	
	/**
	 * 查询职位列表
	 */
	@Override
	public List<StaffPosition> getPosition(String departmentid) {
		StaffPositionExample example = new StaffPositionExample();
		example.createCriteria().andDepartmentidEqualTo(departmentid);
		List<StaffPosition> list = staffPositionMapper.selectByExample(example);
		return list;
	}

	/**
	 * 根据职位id查询对应的权限id
	 */
	@Override
	public String getRoleidById(String positionid) {
		StaffPosition staffPosition = staffPositionMapper.selectByPrimaryKey(positionid);
		String roleid = staffPosition.getRoleid();
		return roleid;
	}
	
	/**
	 * 根据职位id查询对应的职位名称
	 */
	@Override
	public String getPositionNameById(String positionid) {
		StaffPosition staffPosition = staffPositionMapper.selectByPrimaryKey(positionid);
		String positionname = staffPosition.getPositionname();
		return positionname;
	}

	/**
	 * 根据职位id查询对应的部门id
	 */
	@Override
	public String findDepartmentByPositionid(String positionid) {
		StaffPosition staffPosition = staffPositionMapper.selectByPrimaryKey(positionid);
		String departmentid = staffPosition.getDepartmentid();
		return departmentid;
	}

}
