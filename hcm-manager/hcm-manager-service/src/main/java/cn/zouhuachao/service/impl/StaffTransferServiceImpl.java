package cn.zouhuachao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.mapper.StaffTransferMapper;
import cn.zouhuachao.pojo.StaffDimission;
import cn.zouhuachao.pojo.StaffDimissionExample;
import cn.zouhuachao.pojo.StaffTrainExample;
import cn.zouhuachao.pojo.StaffTransfer;
import cn.zouhuachao.pojo.StaffTransferExample;
import cn.zouhuachao.service.IStaffTransferService;

@Service
public class StaffTransferServiceImpl implements IStaffTransferService {

	@Autowired
	private StaffTransferMapper staffTransferMapper;
	
	/**
	 * 添加调职记录
	 */
	@Override
	public boolean addStaffTransfer(StaffTransfer staffTransfer) {
		int insert = staffTransferMapper.insert(staffTransfer);
		return insert>0?true:false;
	}

	/**
	 * 获取调职记录列表
	 */
	@Override
	public EasyUIDataGirdResult getTransferList(Integer page, Integer rows, String realname) {
		// 设置分页信息
		PageHelper.startPage(page, rows);
		StaffTransferExample example = new StaffTransferExample();
		if(realname!=null&&realname!="") {
			example.createCriteria().andStaffrealnameLike("%"+realname+"%");
		}
		
		List<StaffTransfer> list = staffTransferMapper.selectByExample(example);
		
		//创建一个返回值对象
		EasyUIDataGirdResult result = new EasyUIDataGirdResult();
		result.setRows(list);
		//取分页结果（根据list记录数获得条数）
		PageInfo<StaffTransfer> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}
}
