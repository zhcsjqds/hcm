package cn.zouhuachao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zouhuachao.mapper.InsRateMapper;
import cn.zouhuachao.pojo.InsRate;
import cn.zouhuachao.service.IRateService;

@Service
public class RateServiceImpl implements IRateService {

	@Autowired
	private InsRateMapper insRateMapper;
	
	/**
	 * 设置四金代扣比例
	 */
	@Override
	public boolean updateRate(InsRate insRate) {
		insRate.setId(1);
		int update = insRateMapper.updateByPrimaryKeySelective(insRate);
		return update>0?true:false;
	}

	/**
	 * 获取四金代扣比例
	 */
	@Override
	public InsRate getRate() {
		InsRate insRate = insRateMapper.selectByPrimaryKey(1);
		return insRate;
	}

}
