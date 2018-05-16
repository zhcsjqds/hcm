package cn.zouhuachao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.mapper.PaygradeMapper;
import cn.zouhuachao.pojo.Paygrade;
import cn.zouhuachao.pojo.PaygradeExample;
import cn.zouhuachao.service.IPaygradeService;

@Service
public class PaygradeServiceImpl implements IPaygradeService {

	@Autowired
	private PaygradeMapper paygradeMapper;
	
	/**
	 * 工资等级列表
	 */
	@Override
	public EasyUIDataGirdResult getPaygradelist(Integer page, Integer rows, String headship) {
		PageHelper.startPage(page, rows);
		PaygradeExample example = new PaygradeExample();
		if(headship!=null&&headship!="") {
			example.createCriteria().andHeadshipEqualTo(headship);
		}
		List<Paygrade> paygradelist = paygradeMapper.selectByExample(example);
		//创建一个返回值对象
		EasyUIDataGirdResult result = new EasyUIDataGirdResult();
		result.setRows(paygradelist);
		//取分页结果（根据list记录数获得条数）
		PageInfo<Paygrade> pageInfo = new PageInfo<>(paygradelist);
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}

	/**
	 * 添加工资等级
	 */
	@Override
	public boolean addPaygrade(Paygrade paygrade) {
		int insert = paygradeMapper.insert(paygrade);
		return insert>0?true:false;
	}

	/**
	 * 修改工资等级
	 */
	@Override
	public boolean updatePaygrade(Paygrade paygrade) {
		int update = paygradeMapper.updateByPrimaryKeySelective(paygrade);
		return update>0?true:false;
	}

	/**
	 * 根据ID删除工资等级
	 */
	@Override
	public boolean deletePaygradeById(String paygradeid) {
		int delete = paygradeMapper.deleteByPrimaryKey(paygradeid);
		return delete>0?true:false;
	}

	/**
	 * 根据职位查询工资等级
	 */
	@Override
	public List<Paygrade> findPaygradeListByPosition(String position) {
		PaygradeExample example = new PaygradeExample();
		example.createCriteria().andHeadshipEqualTo(position);
		List<Paygrade> list = paygradeMapper.selectByExample(example);
		return list;
	}

	/**
	 * 根据工资等级编号获取工资等级
	 */
	@Override
	public Paygrade findPaygradeByPaygradeno(String paygradeno) {
		PaygradeExample example = new PaygradeExample();
		example.createCriteria().andPaygradenoEqualTo(paygradeno);
		List<Paygrade> list = paygradeMapper.selectByExample(example);
		Paygrade paygrade = list.get(0);
		return paygrade;
	}

}
