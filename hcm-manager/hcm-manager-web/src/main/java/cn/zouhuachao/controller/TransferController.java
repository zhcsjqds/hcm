package cn.zouhuachao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.service.IStaffTransferService;

@Controller
public class TransferController {

	@Autowired
	private IStaffTransferService transferService;
	
	@RequestMapping("/transferList")
	@ResponseBody
	public EasyUIDataGirdResult transferList(Integer page, Integer rows,String realname) {
		EasyUIDataGirdResult transferList = transferService.getTransferList(page, rows, realname);
		return transferList;
	}
}
