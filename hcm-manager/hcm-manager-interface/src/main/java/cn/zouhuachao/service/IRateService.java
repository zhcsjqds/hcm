package cn.zouhuachao.service;

import cn.zouhuachao.pojo.InsRate;

public interface IRateService {

	boolean updateRate(InsRate insRate);

	InsRate getRate();

}
