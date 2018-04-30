package cn.zouhuachao.test;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import cn.zouhuachao.common.pojo.DayCompare;

public class DateTest {

    /**
     * 计算2个日期之间相差的  以年、月、日为单位，各自计算结果是多少
     * 比如：2011-02-02 到  2017-03-02
     *                                以年为单位相差为：6年
     *                                以月为单位相差为：73个月
     *                                以日为单位相差为：2220天
     * @param fromDate
     * @param toDate
     * @return
     */
	@Test
    public  void dayCompare(){
        Calendar  from  =  Calendar.getInstance();
        from.setTime(new Date());
        Calendar  to  =  Calendar.getInstance();
        to.setTime(new Date());
        //只要年月
        int fromYear = from.get(Calendar.YEAR);
        int fromMonth = from.get(Calendar.MONTH);
        int fromDay = from.get(Calendar.DATE);
        int toYear = to.get(Calendar.YEAR);
        int toMonth = to.get(Calendar.MONTH);
        int year = toYear  -  fromYear;
        int month = toYear *  12  + toMonth  -  (fromYear  *  12  +  fromMonth);
        int day = (int) ((to.getTimeInMillis()  -  from.getTimeInMillis())  /  (24  *  3600  *  1000));
        System.out.println(fromYear);
        System.out.println(fromMonth);
        System.out.println(fromDay);
        //return DayCompare.builder().day(day).month(month).year(year).build();
    }
	
	@Test
    public  void dateToString(){
    
		 	Calendar  from  =  Calendar.getInstance();
	        from.setTime(new Date());
//	        Calendar  to  =  Calendar.getInstance();
//	        to.setTime(toDate);
	        //只要年月
	        int year = from.get(Calendar.YEAR);
	        int month = from.get(Calendar.MONTH)+1;
	        String monthf = String.format("%02d", from.get(Calendar.MONTH)+1);
	        int day = from.get(Calendar.DATE);
	        String dayf = String.format("%02d", from.get(Calendar.DATE));
	        String thedate = year+"-"+monthf+"-"+dayf;
	        System.out.println(thedate);
	        System.out.println(new Date());
    }
}
