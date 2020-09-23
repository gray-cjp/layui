package com.cjp.layui.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Date 工具类
 * @author xiangpeng
 *
 */
public class DateUtil {
	
	/** 定义格式化日期 **/
	public static final String DATE_FORMAT = "yyyyMMdd";
	/** 定义格式化日期 **/
	public static final String DATE_FORMAT2 = "yyyy-MM-dd";
	/**
	 * 获取当前系统时间
	 * 
	 * @return 系统时间
	 */
	public static Date getSystemDate() {
		return new Date();
	}
	/**
	 * 获取日期的前/后N个月的日期
	 * @param date 日期
	 * @param n 负数为向前/整数为向后的天数 
	 * @return Date
	 */
	public static Date getNextMonthDay(Date date,int n){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
	
	/**
	 * 将指定时间按照指定格式进行格式化(Date类型)
	 * 
	 * @param date
	 *            指定时间
	 * @param pattern
	 *            指定格式
	 * @return 格式化后的指定时间
	 */
	public static String getDateString(Date date, String pattern) {
		DateFormat dfmt = new SimpleDateFormat(pattern);
		return dfmt.format(date);
	}
	
	/**
	 * 将指定时间按照指定格式进行格式化(String类型)
	 * 
	 * @param dateStr
	 *            指定时间
	 * @param format
	 *            指定格式
	 * @return 格式化后的指定时间
	 */
	public static Date toDate(String dateStr, String format) {
		DateFormat df = new SimpleDateFormat(format);
		try {
			Date date = df.parse(dateStr);
			Date d = new Date(date.getTime());
			return d;
		} catch (ParseException e) {
			throw new RuntimeException("转换日期字符串时出错！", e);
		}
	}
	
	/**
	 * 获取日期的前/后N日的日期
	 * @param date 日期
	 * @param n 负数为向前/整数为向后的天数 
	 * @return Date
	 */
	public static Date getNextDay(Date date,int n){
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DAY_OF_MONTH, n);
		return cal.getTime();
	}
	/**
	 * 获取当前系统时间
	 *
	 * @return 系统时间
	 */
	public static String getSystemDateStr(String pattern) {
		DateFormat dfmt = new SimpleDateFormat(pattern);
		return dfmt.format(new Date());
	}
}
