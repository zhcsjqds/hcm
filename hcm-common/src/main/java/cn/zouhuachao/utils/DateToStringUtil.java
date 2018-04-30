package cn.zouhuachao.utils;

import java.util.Calendar;
import java.util.Date;

import cn.zouhuachao.common.pojo.DayCompare;

public class DateToStringUtil {

	/**
     * 输出yyyy-MM-dd
     * @param Date
     * @return
     */
	public static String toString(Date date){
        Calendar  from  =  Calendar.getInstance();
        from.setTime(date);
        int year = from.get(Calendar.YEAR);
        int month = from.get(Calendar.MONTH)+1;
        String monthf = String.format("%02d", from.get(Calendar.MONTH)+1);
        int day = from.get(Calendar.DATE);
        String dayf = String.format("%02d", from.get(Calendar.DATE));
        String thedate = year+"-"+monthf+"-"+dayf;
		return thedate;
    }
}
