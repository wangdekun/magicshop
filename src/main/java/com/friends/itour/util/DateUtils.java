package com.friends.itour.util;


import com.alibaba.druid.support.spring.stat.annotation.Stat;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/** 
 * 日期处理工具类 
 * 
 * @date 20140428 
 */
  
public class DateUtils {  
  
    private static String defaultDatePattern = null;
    private static String timePattern = "HH:mm";
    private final static Calendar cale = Calendar.getInstance();
    public static final String TS_FORMAT = DateUtils.getDatePattern() + " HH:mm:ss.S";
    /** 日期格式yyyy-MM字符串常量 */  
    public static final String MONTH_FORMAT = "yyyy-MM";
    /** 日期格式yyyy/MM/dd字符串常量 */
    public static final String DATE_FORMAT_TWO = "yyyy/MM/dd";
    /** 日期格式yyyy-MM-dd字符串常量 */
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    /** 日期格式HH:mm:ss字符串常量 */
    public static final String HOUR_FORMAT = "HH:mm:ss";
    /** 日期格式yyyy-MM-dd HH:mm:ss字符串常量 */  
    public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATETIME_FORMAT1 = "yyyy/MM/dd HH:mm:ss";
    /** 日期无分割**/
    public static final String DATETIME_NOSPLIT = "yyyyMMddHHmmss";
    /** 某天开始时分秒字符串常量  00:00:00 */  
    private static final String DAY_BEGIN_STRING_HHMMSS = " 00:00:00";
    /**  某天结束时分秒字符串常量  23:59:59  */  
    public static final String DAY_END_STRING_HHMMSS = " 23:59:59";
    /** 默认日期 **/
    public static final String DEFAULT_DATE = "0000-00-00";
    public static SimpleDateFormat sdf_date_format = new SimpleDateFormat(DATE_FORMAT);
    public static SimpleDateFormat sdf_hour_format = new SimpleDateFormat(HOUR_FORMAT);
    public static SimpleDateFormat sdf_datetime_format = new SimpleDateFormat(DATETIME_FORMAT);
    public static SimpleDateFormat sdf_datetime_format1 = new SimpleDateFormat(DATETIME_FORMAT1);
    public DateUtils() {  
    }  
  
    /** 
     * 获得服务器当前日期及时间，以格式为：yyyy-MM-dd HH:mm:ss的日期字符串形式返回 
     * 
     * @date 20140428 
     * @return 
     */  
    public String getDateTime() {
        try {  
            return sdf_datetime_format.format(cale.getTime());  
        } catch (Exception e) {
          
            return "";  
        }  
    }  
  
    /** 
     * 获得服务器当前日期，以格式为：yyyy-MM-dd的日期字符串形式返回 
     * 
     * @date 20140428 
     * @return 
     */  
    public static  String getDate() {
        try {  
            return sdf_date_format.format(cale.getTime());  
        } catch (Exception e) {
           
            return "";  
        }  
    }
    /**
     * 获得服务器当前日期，以格式为：yyyy-MM-dd的日期字符串形式返回
     *
     * @date 20140428
     * @return
     */
    public static String getNowDate() {
        try {
            return sdf_date_format.format(new Date());
        } catch (Exception e) {

            return "";
        }
    }

    /** 
     * 获得服务器当前时间，以格式为：HH:mm:ss的日期字符串形式返回 
     * 
     * @date 20140428 
     * @return 
     */  
    public String getTime() {
        String temp = " ";
        try {  
            temp += sdf_hour_format.format(cale.getTime());  
            return temp;  
        } catch (Exception e) {
          
            return "";  
        }  
    }  
  
    /** 
     * 统计时开始日期的默认值 
     * 
     * @date 20140428 
     * @return 
     */  
    public String getStartDate() {
        try {  
            return getYear() + "-01-01";  
        } catch (Exception e) {
          
            return "";  
        }  
    }  
  
    /** 
     * 统计时结束日期的默认值 
     * 
     * @date 20140428 
     * @return 
     */  
    public String getEndDate() {
        try {  
            return getDate();  
        } catch (Exception e) {
            
            return "";  
        }  
    }  
  
    /** 
     * 获得服务器当前日期的年份 
     * 
     * @date 20140428 
     * @return 
     */  
    public String getYear() {
        try {  
            return String.valueOf(cale.get(Calendar.YEAR));
        } catch (Exception e) {
           
            return "";  
        }  
    }  
  
    /** 
     * 获得服务器当前日期的月份 
     * 
     * @date 20140428
     * @return
     */  
    public String getMonth() {
        try {  
            java.text.DecimalFormat df = new java.text.DecimalFormat();  
            df.applyPattern("00;00");  
            return df.format((cale.get(Calendar.MONTH) + 1));
        } catch (Exception e) {
           
            return "";  
        }  
    }  
  
    /** 
     * 获得服务器在当前月中天数 
     * 
     * @date 20140428 
     * @return 
     */  
    public String getDay() {
        try {  
            return String.valueOf(cale.get(Calendar.DAY_OF_MONTH));
        } catch (Exception e) {
            
            return "";  
        }  
    }  
  
    /** 
     * 比较两个日期相差的天数 
     * 
     * @date 20140428 
     * @param date1 
     * @param date2 
     * @return 
     */  
    public  int getMargin(String date1, String date2) throws Exception {
        try {  
 
	        	SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	        	SimpleDateFormat format2 = new SimpleDateFormat("yyyyMMdd");
	        	SimpleDateFormat format3 = new SimpleDateFormat("yyyy-MM-dd");
	        	Date bDate = null;
	        	Date eDate = null;
	        	
	        	bDate = strFormat(date1);
	        	eDate = strFormat(date2);
	        	
	            Calendar d1 = new GregorianCalendar();
	            d1.setTime(bDate);
	            Calendar d2 = new GregorianCalendar();
	           d2.setTime(eDate);
	           int days = d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
	           int y2 = d2.get(Calendar.YEAR);
	           if (d1.get(Calendar.YEAR) != y2)
	           {
	                  d1 = (Calendar) d1.clone();
	                 do   {
	                             days += d1.getActualMaximum(Calendar.DAY_OF_YEAR);//得到当年的实际天数
	                            d1.add(Calendar.YEAR, 1);
	               }    while (d1.get(Calendar.YEAR) != y2);
	          }
	           return days;
        } catch (Exception e) {
           
            throw e;  
        }  
    }  
  
    private static Date strFormat(String date) throws ParseException {
    	SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
    	SimpleDateFormat format2 = new SimpleDateFormat("yyyyMMdd");
    	SimpleDateFormat format3 = new SimpleDateFormat("yyyy-MM-dd");
    	
    	Date returnDate = null;
    	if(date.length() ==10){
    		if(date.substring(4,5).equals(File.separator)){
    			returnDate = format.parse(date);
    		}else if(date.substring(4,5).equals("-")){
    			returnDate = format3.parse(date);
    		}else if(date.substring(4,5).equals("\\/")){
    			returnDate = format.parse(date);
    		}
    	}else if(date.length()==8){
    		returnDate = format2.parse(date);
    	}else{
    		returnDate = null;
    	}
		return returnDate;
	}

	/** 
     * 比较两个日期相差的天数 
     * 
     * @date 20140428 
     * @param date1 
     * @param date2 
     * @return 
     */  
    public static double getDoubleMargin(String date1, String date2) {
        double margin;  
        try {  
            ParsePosition pos = new ParsePosition(0);
            ParsePosition pos1 = new ParsePosition(0);
            Date dt1 = sdf_datetime_format.parse(date1, pos);
            Date dt2 = sdf_datetime_format.parse(date2, pos1);
            long l = dt1.getTime() - dt2.getTime();  
            margin = (l / (24 * 60 * 60 * 1000.00));  
            return margin;  
        } catch (Exception e) {
            
            return 0;  
        }  
    }  
  
    /** 
     * 比较两个日期相差的月数 
     * 
     * @date 20140428 
     * @param date1 
     * @param date2 
     * @return 
     */  
    public static int getMonthMargin(String date1, String date2) {
        int margin;  
        try {  
            margin = (Integer.parseInt(date2.substring(0, 4)) - Integer.parseInt(date1.substring(0, 4))) * 12;
            margin += (Integer.parseInt(date2.substring(4, 7).replaceAll("-0",
                    "-")) - Integer.parseInt(date1.substring(4, 7).replaceAll("-0", "-")));
            return margin;  
        } catch (Exception e) {
     
            return 0;  
        }  
    }  
  
    /** 
     * 返回日期加X天后的日期 
     * 
     * @date 2014-04-28
     * @param date 
     * @param i 
     * @return 
     */  
    public static String addDay(String date, int i) {
        try {  
            GregorianCalendar gCal = new GregorianCalendar(
                    Integer.parseInt(date.substring(0, 4)),
                    Integer.parseInt(date.substring(5, 7)) - 1,
                    Integer.parseInt(date.substring(8, 10)));
            gCal.add(GregorianCalendar.DATE, i);
            return sdf_date_format.format(gCal.getTime());  
        } catch (Exception e) {
            return "";
        }  
    }

    /** 
     * 返回日期加X月后的日期 
     * 
     * @date 20140428 
     * @param date 
     * @param i 
     * @return 
     */  
    public String addMonth(String date, int i) {
        try {  
            GregorianCalendar gCal = new GregorianCalendar(
                    Integer.parseInt(date.substring(0, 4)),
                    Integer.parseInt(date.substring(5, 7)) - 1,
                    Integer.parseInt(date.substring(8, 10)));
            gCal.add(GregorianCalendar.MONTH, i);
            return sdf_date_format.format(gCal.getTime());  
        } catch (Exception e) {
             
            return getDate();  
        }  
    }  
  
    /** 
     * 返回日期加X年后的日期 
     * 
     * @date 20140428 
     * @param date 
     * @param i 
     * @return 
     */  
    public static String addYear(String date, int i) {
        try {  
            GregorianCalendar gCal = new GregorianCalendar(
                    Integer.parseInt(date.substring(0, 4)),
                    Integer.parseInt(date.substring(5, 7)) - 1,
                    Integer.parseInt(date.substring(8, 10)));
            gCal.add(GregorianCalendar.YEAR, i);
            return sdf_date_format.format(gCal.getTime());  
        } catch (Exception e) {
          ;  
            return "";  
        }  
    }  
  
    /** 
     * 返回某年某月中的最大天 
     * 
     * @date 20140428 
     * @param iyear
     * @param imonth
     * @return
     */  
    public static int getMaxDay(int iyear, int imonth) {  
        int day = 0;  
        try {  
            if (imonth == 1 || imonth == 3 || imonth == 5 || imonth == 7  
                    || imonth == 8 || imonth == 10 || imonth == 12) {  
                day = 31;  
            } else if (imonth == 4 || imonth == 6 || imonth == 9 || imonth == 11) {  
                day = 30;  
            } else if ((0 == (iyear % 4)) && (0 != (iyear % 100)) || (0 == (iyear % 400))) {  
                day = 29;  
            } else {  
                day = 28;  
            }  
            return day;  
        } catch (Exception e) {
              
            return 1;  
        }  
    }  
  
    /** 
     * 格式化日期 
     * 
     * @date 20140428 
     * @param orgDate 
     * @param Type 
     * @param Span 
     * @return 
     */  
    @SuppressWarnings("static-access")
    public String rollDate(String orgDate, int Type, int Span) {
        try {  
            String temp = "";
            int iyear, imonth, iday;  
            int iPos = 0;  
            char seperater = '-';  
            if (orgDate == null || orgDate.length() < 6) {  
                return "";  
            }  
  
            iPos = orgDate.indexOf(seperater);  
            if (iPos > 0) {  
                iyear = Integer.parseInt(orgDate.substring(0, iPos));
                temp = orgDate.substring(iPos + 1);  
            } else {  
                iyear = Integer.parseInt(orgDate.substring(0, 4));
                temp = orgDate.substring(4);  
            }  
  
            iPos = temp.indexOf(seperater);  
            if (iPos > 0) {  
                imonth = Integer.parseInt(temp.substring(0, iPos));
                temp = temp.substring(iPos + 1);  
            } else {  
                imonth = Integer.parseInt(temp.substring(0, 2));
                temp = temp.substring(2);  
            }  
  
            imonth--;  
            if (imonth < 0 || imonth > 11) {  
                imonth = 0;  
            }  
  
            iday = Integer.parseInt(temp);
            if (iday < 1 || iday > 31)  
                iday = 1;  
  
            Calendar orgcale = Calendar.getInstance();
            orgcale.set(iyear, imonth, iday);  
            temp = this.rollDate(orgcale, Type, Span);  
            return temp;  
        } catch (Exception e) {
            return "";  
        }  
    }  
  
    public static String rollDate(Calendar cal, int Type, int Span) {
        try {  
            String temp = "";
            Calendar rolcale;
            rolcale = cal;  
            rolcale.add(Type, Span);  
            temp = sdf_date_format.format(rolcale.getTime());  
            return temp;  
        } catch (Exception e) {
            return "";  
        }  
    }  
  
    /** 
     * 返回默认的日期格式 
     * 
     * @date 20140428 
     * @return 
     */  
    public static synchronized String getDatePattern() {
        defaultDatePattern = "yyyy-MM-dd";  
        return defaultDatePattern;  
    }  
  
    /** 
     * 将指定日期按默认格式进行格式代化成字符串后输出如：yyyy-MM-dd 
     * 
     * @date 20140428 
     * @param aDate 
     * @return 
     */  
    public static final String getDate(Date aDate) {
        SimpleDateFormat df = null;
        String returnValue = "";
        if (aDate != null) {  
            df = new SimpleDateFormat(getDatePattern());
            returnValue = df.format(aDate);  
        }  
        return (returnValue);  
    }  
  
    /** 
     * 取得给定日期的时间字符串，格式为当前默认时间格式 
     * 
     * @date 20140428 
     * @param theTime 
     * @return 
     */  
    public static String getTimeNow(Date theTime) {
        return getDateTime(timePattern, theTime);  
    }  
  
    /** 
     * 取得当前时间的Calendar日历对象 
     * 
     * @date 20140428 
     * @return 
     * @throws ParseException
     */  
    public Calendar getToday() throws ParseException {
        Date today = new Date();
        SimpleDateFormat df = new SimpleDateFormat(getDatePattern());
        String todayAsString = df.format(today);
        Calendar cal = new GregorianCalendar();
        cal.setTime(convertStringToDate(todayAsString));  
        return cal;  
    }  
  
    /** 
     * 将日期类转换成指定格式的字符串形式 
     * 
     * @date 20140428 
     * @param aMask 
     * @param aDate 
     * @return 
     */  
    public static final String getDateTime(String aMask, Date aDate) {
        SimpleDateFormat df = null;
        String returnValue = "";
  
        if (aDate == null) {  
           
        } else {  
            df = new SimpleDateFormat(aMask);
            returnValue = df.format(aDate);  
        }  
        return (returnValue);  
    }  
  
    /** 
     * 将指定的日期转换成默认格式的字符串形式 
     * 
     * @date 20140428 
     * @param aDate 
     * @return 
     */  
    public static final String convertDateToString(Date aDate) {
        return getDateTime(getDatePattern(), aDate);  
    }  
  
    /** 
     * 将日期字符串按指定格式转换成日期类型 

     * @param aMask 指定的日期格式，如:yyyy-MM-dd 
     * @param strDate 待转换的日期字符串 
     * @return 
     * @throws ParseException
     */  
    public static final Date convertStringToDate(String aMask, String strDate)
            throws ParseException {
        SimpleDateFormat df = null;
        Date date = null;
        df = new SimpleDateFormat(aMask);
  
        
        try {  
            date = df.parse(strDate);  
        } catch (ParseException pe) {
          
            throw pe;  
        }  
        return (date);  
    }  
  
    /** 
     * 将日期字符串按默认格式转换成日期类型 
     * 
     * @date 20140428 
     * @param strDate 
     * @return 
     * @throws ParseException
     */  
    public static Date convertStringToDate(String strDate)
            throws ParseException {
        Date aDate = null;
  
        try {  
            
            aDate = convertStringToDate(getDatePattern(), strDate);  
        } catch (ParseException pe) {
          
            throw new ParseException(pe.getMessage(), pe.getErrorOffset());
        }  
        return aDate;  
    }  
  
    /** 
     * 返回一个JAVA简单类型的日期字符串 
     * 
     * @date 20140428 
     * @return 
     */  
    public static String getSimpleDateFormat() {
        SimpleDateFormat formatter = new SimpleDateFormat();
        String NDateTime = formatter.format(new Date());
        return NDateTime;  
    }  
      
   
      
    /** 
     * 为查询日期添加最小时间 
     *
     * @return 
     * @throws Exception
     */  
    @SuppressWarnings("deprecation")
    public static Date addStartTime(Date param) throws Exception {
        Date date = param;
        try {  
            date.setHours(0);  
            date.setMinutes(0);  
            date.setSeconds(0);  
            return date;  
        } catch (Exception ex) {
        	throw ex;
        }  
    }  
  
    /** 
     * 为查询日期添加最大时间 
     *
     */  
    @SuppressWarnings("deprecation")
    public static Date addEndTime(Date param) {
        Date date = param;
        try {  
            date.setHours(23);  
            date.setMinutes(59);  
            date.setSeconds(0);  
            return date;  
        } catch (Exception ex) {
            return date;  
        }  
    }  
  
    /** 
     * 返回系统现在年份中指定月份的天数 
     *
     * @return 指定月的总天数 
     */  
    @SuppressWarnings("deprecation")
    public static String getMonthLastDay(int month) {
        Date date = new Date();
        int[][] day = { { 0, 30, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },  
                { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };  
        int year = date.getYear() + 1900;  
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  
            return day[1][month] + "";  
        } else {  
            return day[0][month] + "";  
        }  
    }  
  
    /** 
     * 返回指定年份中指定月份的天数
     * @return 指定月的总天数 
     */  
    public static String getMonthLastDay(int year, int month) {
        int[][] day = { { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },  
                { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };  
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  
            return day[1][month] + "";  
        } else {  
            return day[0][month] + "";  
        }  
    }  
  
    /** 
     * 判断是平年还是闰年 
     * 
     * @date 20140428 
     * @param year 
     * @return 
     */   
    public static boolean isLeapyear(int year) {  
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400) == 0) {  
            return true;  
        } else {  
            return false;  
        }  
    }  
  
    /** 
     * 取得当前时间的日戳 
     * 
     * @date 20140428 
     * @return 
     */  
    @SuppressWarnings("deprecation")
    public String getTimestamp() {
        Date date = cale.getTime();
        String timestamp = "" + (date.getYear() + 1900) + date.getMonth()
                + date.getDate() + date.getMinutes() + date.getSeconds()  
                + date.getTime();  
        return timestamp;  
    }  
  
    /** 
     * 取得指定时间的日戳 
     *  
     * @return 
     */  
    @SuppressWarnings("deprecation")
    public static String getTimestamp(Date date) {
        String timestamp = "" + (date.getYear() + 1900) + date.getMonth()
                + date.getDate() + date.getMinutes() + date.getSeconds()  
                + date.getTime();  
        return timestamp;  
    }  

	/**
	 * 根据日期和格式来获取对应字符串
	 * @param date
	 * @param type
	 * @return
	 */
	public static String getDateStr(Date date, String type){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		SimpleDateFormat sdf = new SimpleDateFormat(type);
		return sdf.format(calendar.getTime());
	}
	
	/**
	 * 将对应字符串转化为日期对象
	 * @param dateStr
	 * @return
	 */
	public static String getDateByStrs(String dateStr){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		String timeStr = null;
		try {
			date = sdf.parse(dateStr);
			timeStr = new SimpleDateFormat("yyyyMMdd").format(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return timeStr;
	}
	/**
	 * 将对应字符串转化为日期对象
	 * @param dateStr
	 * @return
	 */
	public static String getDatetimeByStrs(String dateStr){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		String timeStr = null;
		try {
			date = sdf.parse(dateStr);
			timeStr = new SimpleDateFormat("yyyyMMddHHmmss").format(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return timeStr;
	}
	
	public static String Date2String(Date dateTime, String dateformat) {
		if (dateTime == null) {
			return "";
		}
		SimpleDateFormat curFormat = new SimpleDateFormat(dateformat);
		return curFormat.format(dateTime);
	}
	
	/**
	 * 获取当前时间字符串
	 * 格式 yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getDateStr(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		return sdf.format(calendar.getTime());
	}
	
	public static boolean constructDate(String strDate){
	    Date returnDate = null;
	    
	    if(strDate != null){
	        try{
	            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
	            returnDate = df.parse(strDate);
	        }catch(ParseException pe){
	            pe.printStackTrace();
	            return false;
	        }
	    }
	    return true;
	}
	/**
	 * 获取两个时间之间相差的天数
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws ParseException
	 */
	public static long getDaysBetween(String startDate, Date endDate) {
		if (startDate == null || endDate == null) {
			return 0L;
		}
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		 if(startDate.indexOf("/")>-1){
		  sdf=new SimpleDateFormat("yyyy/MM/dd");
		}
       
		long time1=1l; 
		try {
			time1 = sdf.parse(startDate).getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
        long time2 = endDate.getTime();
        long diff = (time2 - time1);
        long day = diff / (24 * 60 * 60 * 1000);

        //return ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
        return day;
    }
	
	
	//获取前一天的日期Date 
	public static Date getDateBefore(Date d, int day) {
		Calendar now = Calendar.getInstance();
		now.setTime(d);
		now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
		return now.getTime();
	}
	
	//获取后一天的日期String
	public static String parseTime(String time){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String gettime=null;
		try {
			Date dd = df.parse(time);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dd);
			calendar.add(Calendar.DAY_OF_MONTH, +1);//加一天
			
			gettime = df.format(calendar.getTime());
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		return gettime;

	}
	
	/**
	 * 一个日期的day天前或者后  （-1为前一天，+1为后一天）
	 * @param time
	 * @return
	 * @throws ParseException
	 */
	public static String parseTime(String time , int days){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String gettime=null;
		try {
			Date dd = df.parse(time);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(dd);
			calendar.add(Calendar.DAY_OF_MONTH, days);
			
			gettime = df.format(calendar.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return gettime;

	}


    /**
     * 将对应字符串转化为日期对象
     * @param dateStr
     * @return
     */
    public static Date getDateByStr(String dateStr){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /** 获取当前时间之前或之后几分钟 minute */
    public static String getTimeByMinute(int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, minute);
        return sdf_datetime_format.format(calendar.getTime());
    }

    /**
     * dateStr : ****年**月**日
     * @param dateStr
     * @return
     */
    public static String getFormatDate(String dateStr){
        SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("MM");
        SimpleDateFormat sdf2= new SimpleDateFormat("dd");
        Date d1 = null;
        try {
            d1 = new SimpleDateFormat("yyyy年MM月dd日").parse(dateStr);

        }catch (Exception e){
            e.printStackTrace();
        }
        return (sdf0.format(d1)+"-"+sdf1.format(d1)+"-"+sdf2.format(d1));
    }

    /***************************************************************
     * 获取yyyy-MM-dd HH:mm:ss格式的时间串
     * @return
     ***************************************************************/
    public static String getCurrentDateTime(){
        return new SimpleDateFormat(DATETIME_FORMAT).format(new Date());
    }

    /**
     * 获取当前时间 yyyy-MM-dd HH:mm:ss
     *
     * @param date
     * @return
     */
    public static String getDateToStrFormat(Date date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(DATETIME_FORMAT);
        return sdf.format(date);
    }


    /**
     * 比较两个日期相差的分钟
     */
    public static double getDiffMunitus(Date date1, Date date2) {
        double margin;
        try {
            long l = date1.getTime() - date2.getTime();
            margin = (l / (60 * 1000.00));
            return margin;
        } catch (Exception e) {
            return 0;
        }
    }
}
