package cn.zouhuachao.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.pojo.Paygrade;
import cn.zouhuachao.service.IPaygradeService;
import cn.zouhuachao.utils.CommonsUtils;

@Controller
public class PaygradeController {

	@Autowired
	private IPaygradeService paygradeService;
	
	/**
	 * 工资等级列表
	 * @param page
	 * @param rows
	 * @param headship
	 * @return
	 */
	@RequestMapping("/paygradelist")
	@ResponseBody
	public EasyUIDataGirdResult paygradelist(Integer page, Integer rows,String headship) {
		EasyUIDataGirdResult paygradelist = paygradeService.getPaygradelist(page,rows,headship);
		return paygradelist;
	}
	
	/**
	 * 添加工资等级
	 * @param request
	 * @param response
	 */
	@RequestMapping("/paygradeAdd")
	public void paygradeAdd(HttpServletRequest request,HttpServletResponse response) {
		@SuppressWarnings("unchecked")
		Map<String, String[]> parameterMap = request.getParameterMap();
		Paygrade paygrade = new Paygrade();
		try {
			BeanUtils.populate(paygrade, parameterMap);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		paygrade.setPaygradeid(CommonsUtils.getUUID());
		boolean isSuccess = paygradeService.addPaygrade(paygrade);
		if(isSuccess) {
			try {
				response.getWriter().write("{\"status\":200}");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 修改工资等级
	 * @param request
	 * @param response
	 */
	@RequestMapping("/paygradeEdit")
	public void paygradeEdit(HttpServletRequest request,HttpServletResponse response) {
		@SuppressWarnings("unchecked")
		Map<String, String[]> parameterMap = request.getParameterMap();
		Paygrade paygrade = new Paygrade();
		try {
			BeanUtils.populate(paygrade, parameterMap);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		boolean isSuccess = paygradeService.updatePaygrade(paygrade);
		if(isSuccess) {
			try {
				response.getWriter().write("{\"status\":200}");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 根据ID删除工资等级
	 * @param request
	 * @param response
	 */
	@RequestMapping("/deletePaygrade")
	public void deletePaygrade(HttpServletRequest request,HttpServletResponse response) {
		String paygradeid = request.getParameter("paygradeid");
		boolean isSuccess = paygradeService.deletePaygradeById(paygradeid);
		if(isSuccess) {
			try {
				response.getWriter().write("{\"status\":200}");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 根据职位获取工资等级列表
	 * @param position
	 * @return
	 */
	@RequestMapping("/findPaygradenoByPosition")
	@ResponseBody
	public List<Paygrade> findPaygradeByPosition(String position) {
		List<Paygrade> list = paygradeService.findPaygradeListByPosition(position);
		return list;
	}
	
	/**
	 * 根据工资等级编号获取工资等级
	 * @param position
	 * @return
	 */
	@RequestMapping("/findPaygradeByPaygradeno")
	@ResponseBody
	public Paygrade findPaygradeByPaygradeno(String paygradeno) {
		Paygrade paygrade = paygradeService.findPaygradeByPaygradeno(paygradeno);
		return paygrade;
	}
	
}
