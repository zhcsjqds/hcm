package cn.zouhuachao.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.service.IPayrollService;

@Controller
public class PayrollController {

	@Autowired
	private IPayrollService payrollService;
	
	@RequestMapping("/addPayroll")
	@ResponseBody
	public void addPayroll(Integer page, Integer rows,HttpServletRequest request,HttpServletResponse response) {
		String attYearMonth = request.getParameter("attYearMonth");
		String[] ids = request.getParameterValues("staffTree");
		boolean isSuccess = payrollService.addPayroll(attYearMonth,ids);
		if(isSuccess) {
			try {
				response.getWriter().write("{\"status\":200}");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@RequestMapping("/payrollList")
	@ResponseBody
	public EasyUIDataGirdResult getPayroll(Integer page, Integer rows,String attYearMonth,HttpServletRequest request) {
		String[] ids = request.getParameterValues("staffTree[]");
		EasyUIDataGirdResult list = payrollService.getPayroll(page,rows,attYearMonth,ids);
		return list;
	}
}
