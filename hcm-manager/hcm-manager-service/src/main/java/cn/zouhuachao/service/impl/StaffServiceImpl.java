package cn.zouhuachao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zouhuachao.mapper.StaffMapper;
import cn.zouhuachao.pojo.Staff;
import cn.zouhuachao.pojo.StaffExample;
import cn.zouhuachao.service.IStaffService;

@Service
public class StaffServiceImpl implements IStaffService{

	@Autowired
	private StaffMapper staffMapper;
	
	@Override
	public List<Staff> findAllStaff() {
		StaffExample example = new StaffExample();
		List<Staff> s = staffMapper.selectByExample(example);
		System.out.println(s);
		return null;
	}

}
