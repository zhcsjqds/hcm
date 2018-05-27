package cn.zouhuachao.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.pojo.Staff;
import cn.zouhuachao.pojo.StaffTrain;
import cn.zouhuachao.service.IStaffService;
import cn.zouhuachao.service.ITrainService;
import cn.zouhuachao.utils.CommonsUtils;

@Controller
public class TrainController {

	@Autowired
	private ITrainService trainService;
	@Autowired
	private IStaffService staffService;
	
	/**
	 * 培训记录添加
	 * @param request
	 * @param response
	 */
	@RequestMapping("/trainAdd")
	public void trainAdd(HttpServletRequest request,HttpServletResponse response) {
		//List<StaffTrain> trainList = new ArrayList<>();
		String trainname = request.getParameter("trainname");
		String starttimeStr = request.getParameter("starttime");
		String endtimeStr = request.getParameter("endtime");
		String[] ids = request.getParameterValues("staffs");
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Date starttime=null;
		Date endtime=null;
		try {
			starttime = simpleDateFormat.parse(starttimeStr);
			endtime = simpleDateFormat.parse(endtimeStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		for (String id : ids) {
			Staff staff = staffService.getStaffById(id);
			if(staff!=null) {
				StaffTrain staffTrain = new StaffTrain();
				//封装数据
				staffTrain.setTrainid(CommonsUtils.getUUID());
				String staffno = staff.getStaffno();
				staffTrain.setStaffno(staffno);
				staffTrain.setRealname(staff.getRealname());
				staffTrain.setTrainname(trainname);
				staffTrain.setStarttime(starttime);
				staffTrain.setEndtime(endtime);
				//根据开始时间和当前时间判断，状态是未开始，进行中。（也可以不存数据库，显示的时间才比较时间。但是想添加手动取消课程功能，修改为已取消状态）
				//比较两个日期
	            int result=starttime.compareTo(new Date());
	            int result2=endtime.compareTo(new Date());
	            //如果日期相等返回0
	            if(result<=0&&result2>=0){
	            	//进行中
	            	staffTrain.setTrainstatus("进行中");
	            }else if(result>0){
	                //大于0，参数date1就是在date2之前,未开始
	            	staffTrain.setTrainstatus("未开始");
	            }else if(result2<0){
	                //已结束
	            	staffTrain.setTrainstatus("已结束");
	            }
	            //可以把false的结果放进一个集合，提示谁的添加失败（待定）
	            boolean isSuccess = trainService.addTrain(staffTrain);
			}
		}
		try {
			response.getWriter().write("{\"status\":200}");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/trainlist")
	@ResponseBody
	public EasyUIDataGirdResult getTrainList(Integer page, Integer rows,String trainname,String realname,String trainstatus) {
		EasyUIDataGirdResult trainList = trainService.getTrainList(page, rows,trainname, trainstatus, realname);
		return trainList;
	}
	
	/**
	 * 更新，录入成绩
	 * @param trainid
	 * @param traingrade
	 * @return
	 */
	@RequestMapping("/updateTraingrade")
	@ResponseBody
	public boolean updateTraingrade(String trainid,String traingrade) {
		boolean isSuccess = trainService.updateTraingrade(trainid,traingrade);
		return isSuccess;
	}
	
	@RequestMapping("/cancelTrain")
	@ResponseBody
	public boolean cancelTrain(String ids) {
		boolean isSuccess = trainService.updateTrainStatusTocancel(ids);
		return isSuccess;
	}
}
