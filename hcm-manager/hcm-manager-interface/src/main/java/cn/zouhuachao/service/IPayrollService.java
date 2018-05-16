package cn.zouhuachao.service;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;

public interface IPayrollService {

	boolean addPayroll(String attYearMonth, String[] ids);

	EasyUIDataGirdResult getPayroll(Integer page, Integer rows,String attYearMonth, String[] ids);

}
