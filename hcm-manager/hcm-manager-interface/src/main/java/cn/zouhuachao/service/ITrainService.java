package cn.zouhuachao.service;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.pojo.StaffTrain;

public interface ITrainService {

	boolean addTrain(StaffTrain staffTrain);

	EasyUIDataGirdResult getTrainList(Integer page, Integer rows, String trainname, String status, String realname);

	boolean updateTraingrade(String trainid, String traingrade);

	boolean updateTrainStatusTocancel(String ids);

}
