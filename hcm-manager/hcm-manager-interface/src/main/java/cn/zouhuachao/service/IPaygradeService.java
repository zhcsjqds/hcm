package cn.zouhuachao.service;

import java.util.List;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.pojo.Paygrade;

public interface IPaygradeService {

	EasyUIDataGirdResult getPaygradelist(Integer page, Integer rows, String headship);

	boolean addPaygrade(Paygrade paygrade);

	boolean updatePaygrade(Paygrade paygrade);

	boolean deletePaygradeById(String paygradeid);

	List<Paygrade> findPaygradeListByPosition(String position);

	Paygrade findPaygradeByPaygradeno(String paygradeno);

}
