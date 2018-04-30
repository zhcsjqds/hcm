package cn.zouhuachao.utils;

import java.util.Calendar;
import java.util.Date;

import cn.zouhuachao.common.pojo.DayCompare;

public class DateBetweenUtil {

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
    public static Integer dayCompare(Date fromDate,Date toDate){
        Calendar  from  =  Calendar.getInstance();
        from.setTime(fromDate);
        Calendar  to  =  Calendar.getInstance();
        to.setTime(toDate);
        //只要年月
        int fromYear = from.get(Calendar.YEAR);
        int fromMonth = from.get(Calendar.MONTH);
        int toYear = to.get(Calendar.YEAR);
        int toMonth = to.get(Calendar.MONTH);
        int year = toYear  -  fromYear;
        int month = toYear *  12  + toMonth  -  (fromYear  *  12  +  fromMonth);
        int day = (int) ((to.getTimeInMillis()  -  from.getTimeInMillis())  /  (24  *  3600  *  1000));
        //return DayCompare.builder().day(day).month(month).year(year).build();
		return day/365;
    }
}
