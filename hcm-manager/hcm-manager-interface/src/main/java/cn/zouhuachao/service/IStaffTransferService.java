package cn.zouhuachao.service;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.pojo.StaffTransfer;

public interface IStaffTransferService {
	boolean addStaffTransfer(StaffTransfer staffTransfer);

	EasyUIDataGirdResult getTransferList(Integer page, Integer rows, String realname);
}
