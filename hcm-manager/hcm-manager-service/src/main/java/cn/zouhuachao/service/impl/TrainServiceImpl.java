package cn.zouhuachao.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.mapper.StaffTrainMapper;
import cn.zouhuachao.pojo.Staff;
import cn.zouhuachao.pojo.StaffTrain;
import cn.zouhuachao.pojo.StaffTrainExample;
import cn.zouhuachao.service.ITrainService;

@Service
public class TrainServiceImpl implements ITrainService{

	@Autowired
	public StaffTrainMapper trainMapper;
	
	/**
	 * 添加培训
	 */
	@Override
	public boolean addTrain(StaffTrain staffTrain) {
		int insert = trainMapper.insert(staffTrain);
		return insert>0?true:false;
	}

	/**
	 * 查询培训列表
	 */
	@Override
	public EasyUIDataGirdResult getTrainList(Integer page, Integer rows, String trainname, String trainstatus,
			String realname) {
		PageHelper.startPage(page, rows);
		StaffTrainExample example = new StaffTrainExample();
		if(trainname==""&&realname=="") {
			//查询所有
			if("进行中".equals(trainstatus)) {
				example.createCriteria().andTrainstatusEqualTo("进行中");
			} else if("未开始".equals(trainstatus)) {
				example.createCriteria().andTrainstatusEqualTo("未开始");
			} else if("已结束".equals(trainstatus)) {
				example.createCriteria().andTrainstatusEqualTo("已结束");
			} else if("已取消".equals(trainstatus)) {
				example.createCriteria().andTrainstatusEqualTo("已取消");
			}
		} else if(trainname!=""&&realname=="") {
			if("进行中".equals(trainstatus)) {
				example.createCriteria().andTrainstatusEqualTo("进行中").andTrainnameLike("%"+trainname+"%");
			} else if("未开始".equals(trainstatus)) {
				example.createCriteria().andTrainstatusEqualTo("未开始").andTrainnameLike("%"+trainname+"%");
			} else if("已结束".equals(trainstatus)) {
				example.createCriteria().andTrainstatusEqualTo("已结束").andTrainnameLike("%"+trainname+"%");
			} else if("已取消".equals(trainstatus)) {
				example.createCriteria().andTrainstatusEqualTo("已取消").andTrainnameLike("%"+trainname+"%");
			}
		} else if(trainname==""&&realname!="") {
			if("进行中".equals(trainstatus)) {
				example.createCriteria().andTrainstatusEqualTo("进行中").andRealnameLike("%"+realname+"%");
			} else if("未开始".equals(trainstatus)) {
				example.createCriteria().andTrainstatusEqualTo("未开始").andRealnameLike("%"+realname+"%");
			} else if("已结束".equals(trainstatus)) {
				example.createCriteria().andTrainstatusEqualTo("已结束").andRealnameLike("%"+realname+"%");
			} else if("已取消".equals(trainstatus)) {
				example.createCriteria().andTrainstatusEqualTo("已取消").andRealnameLike("%"+realname+"%");
			}
		}
		List<StaffTrain> trainList = trainMapper.selectByExample(example);
		//创建一个返回值对象
		EasyUIDataGirdResult result = new EasyUIDataGirdResult();
		result.setRows(trainList);
		//取分页结果（根据list记录数获得条数）
		PageInfo<StaffTrain> pageInfo = new PageInfo<>(trainList);
		long total = pageInfo.getTotal();
		result.setTotal(total);
		return result;
	}

	/**
	 * 更新，录入成绩
	 */
	@Override
	public boolean updateTraingrade(String trainid, String traingrade) {
		StaffTrain staffTrain = new StaffTrain();
		staffTrain.setTrainid(trainid);
		staffTrain.setTraingrade(traingrade);
		int isSuccess = trainMapper.updateByPrimaryKeySelective(staffTrain);
		return isSuccess>0?true:false;
	}

	/**
	 * 取消课程
	 */
	@Override
	public boolean updateTrainStatusTocancel(String ids) {
		StaffTrain staffTrain = new StaffTrain();
		staffTrain.setTrainstatus("已取消");
		StaffTrainExample example = new StaffTrainExample();
		List<String> idList = Arrays.asList(ids.split(",")); 
		example.createCriteria().andTrainidIn(idList);
		int isSuccess = trainMapper.updateByExampleSelective(staffTrain, example);
		return isSuccess>0?true:false;
	}
}
