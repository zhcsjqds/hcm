package cn.zouhuachao.service;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.pojo.StaffDimission;

public interface IStaffDimissionService {
	boolean addStaffDimission(StaffDimission staffDimission);

	EasyUIDataGirdResult getDimissionList(Integer page, Integer rows, String realname);
}
