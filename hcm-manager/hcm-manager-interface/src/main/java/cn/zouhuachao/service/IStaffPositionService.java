package cn.zouhuachao.service;

import java.util.List;

import cn.zouhuachao.pojo.StaffPosition;

public interface IStaffPositionService {

	List<StaffPosition> getPosition(String departmentid);

	String getRoleidById(String positionid);

	String getPositionNameById(String positionid);

	String findDepartmentByPositionid(String positionid);
}
