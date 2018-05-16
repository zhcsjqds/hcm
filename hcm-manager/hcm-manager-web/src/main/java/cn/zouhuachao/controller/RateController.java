package cn.zouhuachao.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zouhuachao.pojo.InsRate;
import cn.zouhuachao.service.IRateService;

@Controller
public class RateController {

	@Autowired
	private IRateService rateService;
	
	/**
	 * 获取四金代扣比例
	 */
	@RequestMapping("/getRate")
	@ResponseBody
	public InsRate getRate() {
		InsRate insRate = rateService.getRate();
		return insRate;
	}
	
	/**
	 * 更新设置四金代扣比例
	 * @param request
	 * @param response
	 */
	@RequestMapping("/updateRate")
	@ResponseBody
	public void updateRate(HttpServletRequest request,HttpServletResponse response) {
		@SuppressWarnings("unchecked")
		Map<String,String[]> parameterMap = request.getParameterMap();
		InsRate insRate = new InsRate();
		try {
			BeanUtils.populate(insRate, parameterMap);
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		boolean isSuccess = rateService.updateRate(insRate);
		if(isSuccess) {
			try {
				response.getWriter().write("{\"status\":200}");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
