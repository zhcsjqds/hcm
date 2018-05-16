package cn.zouhuachao.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.zouhuachao.common.pojo.EasyUIDataGirdResult;
import cn.zouhuachao.mapper.PayrollMapper;
import cn.zouhuachao.pojo.InsRate;
import cn.zouhuachao.pojo.Paygrade;
import cn.zouhuachao.pojo.Payroll;
import cn.zouhuachao.pojo.PayrollExample;
import cn.zouhuachao.pojo.Staff;
import cn.zouhuachao.service.IPaygradeService;
import cn.zouhuachao.service.IPayrollService;
import cn.zouhuachao.service.IRateService;
import cn.zouhuachao.service.IStaffPositionService;
import cn.zouhuachao.service.IStaffService;
import cn.zouhuachao.utils.CommonsUtils;

@Service
public class PayrollServiceImpl implements IPayrollService {

	@Autowired
	private IStaffService staffService;
	
	@Autowired
	private IStaffPositionService positionService;
	
	@Autowired
	private IPaygradeService paygradeService;
	
	@Autowired
	private IRateService rateService;
	
	@Autowired
	public PayrollMapper payrollMapper;

	/**
	 * 添加工资记录
	 */
	@Override
	public boolean addPayroll(String attYearMonth, String[] ids) {
		//根据id查询员工
		for (String id : ids) {
			Staff staff = staffService.getStaffById(id);
			//查询到员工，并且该员工已工资定级
			if(staff!=null&&(staff.getPaygrade()!=null&&staff.getPaygrade()!="")) {
				Payroll payroll = new Payroll();
				payroll.setPayid(CommonsUtils.getUUID());
				payroll.setStaffno(staff.getStaffno());
				//员工姓名
				payroll.setRealname(staff.getRealname());
				//员工部门
				String positionName = positionService.getPositionNameById(staff.getPositionid());
				payroll.setPosition(positionName);
				//工资等级
				Paygrade paygrade = paygradeService.findPaygradeByPaygradeno(staff.getPaygrade());
				payroll.setPaygrade(staff.getPaygrade());
				//基本工资
				payroll.setPay(paygrade.getHeadshippay());
				//职位补贴
				payroll.setAllowance(paygrade.getAllowance());
				//奖金待完善
				payroll.setBonus(new BigDecimal(0));
				//加班费待完善
				payroll.setOvertime(new BigDecimal(0));
				//考勤待完善
				payroll.setAttendance(new BigDecimal(0));
				//代扣比例
				InsRate rate = rateService.getRate();
				BigDecimal toPercent=new BigDecimal(Float.toString(0.01f));
				//代扣养老保险
				BigDecimal endowmentinsFloat=new BigDecimal(Float.toString(rate.getEndowmentins()));
				BigDecimal endowmentinsRate = endowmentinsFloat.multiply(toPercent);
				payroll.setEndowmentins(payroll.getPay().multiply(endowmentinsRate));
				//代扣医疗保险
				BigDecimal medicalinsFloat=new BigDecimal(Float.toString(rate.getMedicalins()));
				BigDecimal medicalinsRate = medicalinsFloat.multiply(toPercent);
				payroll.setMedicalins(payroll.getPay().multiply(medicalinsRate));
				//代扣失业保险
				BigDecimal unemploymentinsFloat=new BigDecimal(Float.toString(rate.getUnemploymentins()));
				BigDecimal unemploymentinsRate = unemploymentinsFloat.multiply(toPercent);
				payroll.setUnemploymentins(payroll.getPay().multiply(unemploymentinsRate));
				//住房公积金
				BigDecimal housingfundFloat=new BigDecimal(Float.toString(rate.getHousingfund()));
				BigDecimal housingfundRate = housingfundFloat.multiply(toPercent);
				payroll.setHousingfund(payroll.getPay().multiply(housingfundRate));
				//工龄工资
				//1.在本公司连续工作满一年的员工每月工龄工资为￥50元整。
				//2.在本公司连续工作满两年的员工每月工龄工资为￥100元整。
				//3.在本公司连续工作满三年的员工每月工龄工资为￥150元整。
				//4.在本公司连续工作满四年的员工每月工龄工资为￥180元整。
				//5.以此类推，之后在本公司工作每增加一年，每月工龄工资相应增加￥30元整。累计十年封顶。
				//1.在本公司连续工作满一年的办公室(包括采购、仓管、文员、销售、业务、设计)人员每月工龄工资为100元钱。
				//2.在本公司连续工作满一年的B级主管级人员每月工龄工资为￥100元整。
				//3.在本公司连续工作满一年的A级主管级人员每月工龄工资为￥150元整。
				//4.在本公司连续工作满一年的项目经理助理、厂长助理级人员每月工龄工资为￥200元整。
				//5.在本公司连续工作满一年的项目经理级人员每月工龄工资为￥250元整。
				//6.在本公司连续工作满一年的经理(不含)级以上人员每月工龄工资为￥300元整。
				//7.以此类推，之后在本公司工作每增加一年，每月工龄工资按照相关职位相应增加;满三年后，所有级别管理人员在本公司工作每增加一年，每月工龄工资增加￥50元整，累计十年封顶。
				Integer workage = staffService.getWorkage(id);
				if(workage>=0&&workage<=3) {
					BigDecimal workagepay = new BigDecimal(workage*50);
					payroll.setWorkagepay(workagepay);
				} else if(workage>=4&&workage<=10) {
					BigDecimal workagepay = new BigDecimal(3*50+(workage-3)*30);
					payroll.setWorkagepay(workagepay);
				} else if(workage>10) {
					BigDecimal workagepay = new BigDecimal(3*50+(10-3)*30);
					payroll.setWorkagepay(workagepay);
				}
				//应发工资=基本工资+奖金+津贴和补贴+加班加点工资+特殊情况下支付的工资－劳动者因个人原因缺勤或矿工造成的工资或者奖金减少的部分。
				//应发工资=基本工资+加班费+全勤奖+技术津贴+行政奖励+职务津贴+工龄奖金+绩效奖+其它补助+.... 
				//应发工资=基本工资+补贴+奖金+加班费-考勤应扣+工龄工资
				BigDecimal tsalary=payroll.getPay().add(payroll.getAllowance()).add(payroll.getBonus()).add(payroll.getOvertime()).subtract(payroll.getAttendance()).add(payroll.getWorkagepay());
				payroll.setTsalary(tsalary);
				//个人所得税
				//四金
				BigDecimal fourFunds = payroll.getEndowmentins().add(payroll.getMedicalins()).add(payroll.getUnemploymentins()).add(payroll.getHousingfund());
				//全月应纳税所得额=(应发工资-四金)-3500---->待完善外籍人员
				BigDecimal taxable = tsalary.subtract(fourFunds).subtract(new BigDecimal(3500));
				//调用税务计算方法
				BigDecimal incomeTax = incomeTax(taxable);
				payroll.setIncometax(incomeTax);
				//实发工资=应发工资－五险一金个人缴纳部分(四金)－应缴个人所得税。
				BigDecimal fsalary = tsalary.subtract(fourFunds).subtract(incomeTax);
				payroll.setFsalary(fsalary);
				//发放时间--->改为所属月份
				SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM");
				try {
					Date yearMonth = simpleDateFormat.parse(attYearMonth);
					payroll.setPaytime(yearMonth);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				//发放方式
				payroll.setPayway("银行转账");
				//银行账号(待完善)
				//发放状态(待完善)
				payroll.setPaystatus(null);
				payrollMapper.insert(payroll);
			}
		}
		return true;
	}
	
	/**
	 * 通过全月应纳税所得额计算个人所得税
	 */
	public BigDecimal incomeTax(BigDecimal taxable) {
		//征缴个人所得税的计算方法，个税起征点目前是3500元，使用超额累进税率的计算方法如下：
		//缴税=全月应纳税所得额*税率-速算扣除数
		//全月应纳税所得额=(应发工资-四金)-个税起征点
		//如果计算的是外籍人士（包括港、澳、台），则个税起征点应设为4800元。
		/**
		 * 级数  全月应纳税所得额（含税级距）                   全月应纳税所得额（不含税级距）                 税率(%) 速算扣除数
		 * 1               不超过1,500元                                             不超过1455元的                       		3       0
		 * 2               超过1,500元至4,500元的部分	         超过1455元至4155元的部分 			10 		105
		 * 3 	     超过4,500元至9,000元的部分 	超过4155元至7755元的部分 		20 		555
		 * 4 	     超过9,000元至35,000元的部分 	超过7755元至27255元的部分 		25 		1,005
		 * 5	     超过35,000元至55,000元的部分	超过27255元至41255元的部分 		30 		2,755
		 * 6 	     超过55,000元至80,000元的部分 	超过41255元至57505元的部分 		35 		5,505
		 * 7 	     超过80,000元的部分 			超过57505元的部分 				45 		13,505
		 */
		//定义税率
		BigDecimal taxRate1 = new BigDecimal("0.03");
		BigDecimal taxRate2 = new BigDecimal("0.10");
		BigDecimal taxRate3 = new BigDecimal("0.20");
		BigDecimal taxRate4 = new BigDecimal("0.25");
		BigDecimal taxRate5 = new BigDecimal("0.30");
		BigDecimal taxRate6 = new BigDecimal("0.35");
		BigDecimal taxRate7 = new BigDecimal("0.45");
		//判断全月应纳税所得额的级数,根据级数计算所得税
		if(taxable.compareTo(BigDecimal.ZERO)==1&&(taxable.compareTo(new BigDecimal(1500))==-1||taxable.compareTo(new BigDecimal(1500))==0)) {
			//不超过1,500元,税率(3%),速算扣除数:0
			BigDecimal income = taxable.multiply(taxRate1);
			return income;
		} else if(taxable.compareTo(new BigDecimal(1500))==1&&(taxable.compareTo(new BigDecimal(4500))==-1||taxable.compareTo(new BigDecimal(4500))==0)) {
			//不超过4,500元,税率(10%),速算扣除数:105
			taxable.subtract(new BigDecimal(1500)).multiply(taxRate2).subtract(new BigDecimal(105)).add(new BigDecimal(45));
		} else if(taxable.compareTo(new BigDecimal(4500))==1&&(taxable.compareTo(new BigDecimal(9000))==-1||taxable.compareTo(new BigDecimal(9000))==0)) {
			//不超过9000元,税率(20%),速算扣除数:555
			return taxable.subtract(new BigDecimal(4500)).multiply(taxRate3).subtract(new BigDecimal(555)).add(new BigDecimal(240));
		} else if(taxable.compareTo(new BigDecimal(9000))==1&&(taxable.compareTo(new BigDecimal(35000))==-1||taxable.compareTo(new BigDecimal(35000))==0)) {
			//不超过35000元,税率(25%),速算扣除数:1,005
			return taxable.subtract(new BigDecimal(9000)).multiply(taxRate4).subtract(new BigDecimal(1005)).add(new BigDecimal(585));
		} else if(taxable.compareTo(new BigDecimal(35000))==1&&(taxable.compareTo(new BigDecimal(55000))==-1||taxable.compareTo(new BigDecimal(55000))==0)) {
			//不超过55,000元,税率(30%),速算扣除数:2,755
			return taxable.subtract(new BigDecimal(35000)).multiply(taxRate5).subtract(new BigDecimal(2755)).add(new BigDecimal(6080));
		} else if(taxable.compareTo(new BigDecimal(55000))==1&&(taxable.compareTo(new BigDecimal(80000))==-1||taxable.compareTo(new BigDecimal(80000))==0)) {
			//不超过80,000元,税率(35%),速算扣除数:5,505
			return taxable.subtract(new BigDecimal(55000)).multiply(taxRate6).subtract(new BigDecimal(5505)).add(new BigDecimal(9325));
		} else if(taxable.compareTo(new BigDecimal(80000))==1) {
			//超过80,000元,税率(45%),速算扣除数:13,505
			return taxable.subtract(new BigDecimal(80000)).multiply(taxRate7).subtract(new BigDecimal(13505)).add(new BigDecimal(12570));
		}
		return new BigDecimal(0);
	}

	/**
	 * 获取工资列表
	 */
	@Override
	public EasyUIDataGirdResult getPayroll(Integer page, Integer rows,String attYearMonth, String[] ids) {
		PageHelper.startPage(page, rows);
		PayrollExample example = new PayrollExample();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM");
		List<Payroll> list = new ArrayList<>();
		if(attYearMonth==null) {
			//加载时查询当前月工资单
			Date date = new Date();
			int year = date.getYear();
			int month = date.getMonth()+1;
			String MM = String.format("%02d",month);
			attYearMonth=year+"-"+MM;
			try {
				Date yearMonth = simpleDateFormat.parse(attYearMonth);
				example.createCriteria().andPaytimeEqualTo(yearMonth);
				list = payrollMapper.selectByExample(example);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}else if(attYearMonth==""&&ids==null){
			//查询所有工资单
			list = payrollMapper.selectByExample(example);
		}else if(attYearMonth==""&&(ids.length!=0||ids!=null)){
			//指定员工的所以工资单
			List<String> staffnoList = new ArrayList<>();
			for (String id : ids) {
				Staff staff = staffService.getStaffById(id);
				String staffno = staff.getStaffno();
				staffnoList.add(staffno);
			}
			example.createCriteria().andStaffnoIn(staffnoList);
			PageHelper.startPage(page, rows);
			list = payrollMapper.selectByExample(example);
		}else if(attYearMonth!=""&&ids!=null){
			//查询指定月份指定员工的工资记录
			try {
				List<String> staffnoList = new ArrayList<>();
				Date yearMonth = simpleDateFormat.parse(attYearMonth);
				for (String id : ids) {
					Staff staff = staffService.getStaffById(id);
					String staffno = staff.getStaffno();
					staffnoList.add(staffno);
				}
				example.createCriteria().andPaytimeEqualTo(yearMonth).andStaffnoIn(staffnoList);
				PageHelper.startPage(page, rows);//只对第一条查询记录分页，上面查询员工了，这是第二条，所以要在这里重新设置查询分页。
				list = payrollMapper.selectByExample(example);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}else if(attYearMonth!=""&&ids==null){
			//查询指定月份的工资记录
			try {
				Date yearMonth = simpleDateFormat.parse(attYearMonth);
				example.createCriteria().andPaytimeEqualTo(yearMonth);
				list = payrollMapper.selectByExample(example);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		//创建一个返回值对象
		EasyUIDataGirdResult result = new EasyUIDataGirdResult();
		result.setRows(list);
		//取分页结果（根据list记录数获得条数）
		PageInfo<Payroll> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		result.setTotal(total);
		//result.setTotal(list.size());
		return result;
	}
}
