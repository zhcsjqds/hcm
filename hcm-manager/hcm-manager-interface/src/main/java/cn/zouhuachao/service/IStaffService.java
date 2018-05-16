package cn.zouhuachao.service;


import java.util.List;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.pojo.Staff;
import cn.zouhuachao.pojo.StaffDimission;
import cn.zouhuachao.pojo.StaffTransfer;

public interface IStaffService {

	EasyUIDataGirdResult getStaffList(int page,int rows,String paygrade,String status, String realname);

	boolean addStaff(Staff staff);

	Staff getStaffById(String id);

	boolean setStaffno(String staffno, String staffid);

	boolean updateStaffByStaffno(String staffno);

	boolean editStaff(Staff staff);
	
	boolean updateStaffForTransfer(Staff staff, StaffTransfer staffTransfer);

	boolean updateStaffForDimission(String staffid, StaffDimission staffDimission);

	String getStaffNameById(String appid);

	String getStaffNoById(String id);

	boolean updateStaffForPaygrade(String paygrade, String staffid);

	Integer getWorkage(String staffid);

	List<String> getStaffNoByIds(String[] ids);
}
