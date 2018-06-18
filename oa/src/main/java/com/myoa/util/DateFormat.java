 package com.myoa.util;
 
 import com.myoa.util.common.L;

 import java.io.PrintStream;
 import java.text.ParseException;
 import java.text.SimpleDateFormat;
 import java.util.Calendar;
 import java.util.Date;
import java.util.zip.DataFormatException;
 
 public class DateFormat
 {
   private static SimpleDateFormat wyq = new SimpleDateFormat("HH:mm:ss");
 
   private static SimpleDateFormat wyq1 = new SimpleDateFormat("HH:mm:ss");
 
   private static SimpleDateFormat wyq2 = new SimpleDateFormat("yyyy年MM月dd日");
 
   private static SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
 
   private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 
   private static SimpleDateFormat sdf_hour = new SimpleDateFormat("HH:mm");
   private static SimpleDateFormat sdf_mouth = new SimpleDateFormat("MM月dd日 HH:mm");
 
   private static SimpleDateFormat sdf_year = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
 
   private static final Long THREE_MINUTE_TIME = Long.valueOf(180000L);
   private static final Long ONE_HOUR_TIME = Long.valueOf(3600000L);
   private static final Long ONE_DAY_TIME = Long.valueOf(86400000L);
   private static final Long TWO_DAY_TIME = Long.valueOf(172800000L);
 
   public static String getFormatByUse(String formatStr, Object date)
     throws DataFormatException
   {
     if ((date instanceof String)) {
       date = getDate((String)date);
     }
 
     SimpleDateFormat format = new SimpleDateFormat(formatStr);
 
     return format.format(date);
   }
 
   public static Integer getTime(String time)
   {
     String re_time = null;
     try
     {
       Date d = sdf.parse(time);
       long l = d.getTime();
       String str = String.valueOf(l);
       re_time = str.substring(0, 10);
     } catch (ParseException e) {
       e.printStackTrace();
     }
     return Integer.valueOf(Integer.parseInt(re_time));
   }
 
   public static Integer getDateTime(String time)
   {
     String re_time = null;
     try
     {
       Date d = sdf1.parse(time);
       long l = d.getTime();
       String str = String.valueOf(l);
       re_time = str.substring(0, 10);
     } catch (ParseException e) {
       e.printStackTrace();
     }
     return Integer.valueOf(Integer.parseInt(re_time));
   }
 
   public static Integer getWYQTime(String time)
   {
     String re_time = null;
     try
     {
       Date d = wyq1.parse(time);
       long l = d.getTime();
       String str = String.valueOf(l);
       re_time = str;
     } catch (ParseException e) {
       e.printStackTrace();
     }
     return Integer.valueOf(Integer.parseInt(re_time));
   }
 
   public static String getStrTime(Integer time)
   {
     String re_StrTime = null;
     long lcc_time = Long.valueOf(time.intValue()).longValue();
     re_StrTime = sdf.format(new Date(lcc_time * 1000L));
     return re_StrTime;
   }
 
   public static String getStrDateTime(Integer time) {
     String re_StrTime = null;
     long lcc_time = Long.valueOf(time.intValue()).longValue();
     re_StrTime = sdf1.format(new Date(lcc_time * 1000L));
     return re_StrTime;
   }
 
   public static String getDateStrTime(Integer time)
   {
     String re_StrTime = null;
     long lcc_time = Long.valueOf(time.intValue()).longValue();
     re_StrTime = sdf.format(new Date(lcc_time * 1000L));
     return re_StrTime;
   }
 
   public static String getwyqStrTime(Integer time) {
     String re_StrTime = null;
     long lcc_time = Long.valueOf(time.intValue()).longValue();
     re_StrTime = wyq1.format(time);
     return re_StrTime;
   }
 
   public static Date getDate(String time)
   {
     Date re_time = null;
     try {
       re_time = sdf.parse(time);
     } catch (ParseException e) {
       e.printStackTrace();
     }
     return re_time;
   }
 
   public static Date getDateTimes(String time) {
     Date re_time = null;
     try {
       re_time = wyq.parse(time);
     } catch (ParseException e) {
       e.printStackTrace();
     }
     return re_time;
   }
 
   public static String getStrDate(Date time)
   {
     String re_StrTime = null;
     re_StrTime = sdf.format(time);
     return re_StrTime;
   }
 
   public static String getDatestr(Date time)
   {
     String re_StrTime = null;
     re_StrTime = sdf1.format(time);
     return re_StrTime;
   }
 
   public static String getDatestrTime(Date time)
   {
     String re_StrTime = null;
     re_StrTime = wyq2.format(time);
     return re_StrTime;
   }
 
   public static String getDatestrTimes(Date time) {
     String re_StrTime = null;
     re_StrTime = sdf_year.format(time);
     return re_StrTime;
   }
 
   public static String getDatestrSecondTime(Date time)
   {
     String re_StrTime = null;
     re_StrTime = wyq.format(time);
     return re_StrTime;
   }
 
   public static Date DateToStr(String str)
   {
     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
     Date date = null;
     try {
       date = format.parse(str);
     } catch (ParseException e) {
       e.printStackTrace();
     }
     return date;
   }
 
   public static void main(String[] args) {
     System.out.println(getProbablyDate(Integer.valueOf(1492592887)));
     System.out.println(getProbablyDate(new Date()));
     System.out.println(getProbablyDate("2017-04-27 23:11:22"));
     System.out.println(getProbablyDate("2017-04-28 08:11:22"));
   }
 
   public static String getProbablyDate(Object obj)
   {
     if (obj == null) return null;
     Date nowDate = new Date();
     Long nowTime = Long.valueOf(nowDate.getTime());
     Long formatTime = null;
     if ((obj instanceof String))
     {
       String dateStr = (String)obj;
 
       formatTime = Long.valueOf(getDate(dateStr).getTime());
     }
     if ((obj instanceof Date))
     {
       Date date = (Date)obj;
       formatTime = Long.valueOf(date.getTime());
     }
 
     if ((obj instanceof Integer))
     {
       Integer dateInt = (Integer)obj;
       formatTime = Long.valueOf(dateInt.intValue() * 1000L);
     }
     if ((obj instanceof Long))
     {
       formatTime = (Long)obj;
     }
     if (formatTime == null) return null;
 
     Date formatDate = new Date(formatTime.longValue());
     String hourFat = sdf_hour.format(formatTime);
     String mouthFat = sdf_mouth.format(formatTime);
     String yearFat = sdf_year.format(formatTime);
     String ret = null;
 
     Calendar fotCalendar = Calendar.getInstance();
     fotCalendar.setTime(formatDate);
     int forYear = fotCalendar.get(1);
     int forDay = fotCalendar.get(5);
     fotCalendar.setTime(nowDate);
     int nowDay = fotCalendar.get(5);
     int nowYear = fotCalendar.get(1);
     L.w(new Object[] { "forYear", Integer.valueOf(forYear), "forDay", Integer.valueOf(forDay), "nowDay", Integer.valueOf(nowDay), "nowYear", Integer.valueOf(nowYear) });
     if (nowTime.longValue() - formatTime.longValue() <= THREE_MINUTE_TIME.longValue()) {
       ret = "刚刚";
     }
     if ((THREE_MINUTE_TIME.longValue() < nowTime.longValue() - formatTime.longValue()) && (nowTime.longValue() - formatTime.longValue() <= ONE_HOUR_TIME.longValue())) {
       int minutes = (int)((nowTime.longValue() - formatTime.longValue()) / 60000L);
       ret = minutes + "分钟前";
     }
     if (nowDay - forDay > 0) {
       if ((ONE_DAY_TIME.longValue() < nowTime.longValue() - formatTime.longValue()) && (nowTime.longValue() - formatTime.longValue() <= TWO_DAY_TIME.longValue())) {
         ret = "昨天 " + hourFat;
       }
       if ((ONE_HOUR_TIME.longValue() < nowTime.longValue() - formatTime.longValue()) && (nowTime.longValue() - formatTime.longValue() <= ONE_DAY_TIME.longValue())) {
         ret = "昨天 " + hourFat;
       }
     }
     else if ((ONE_HOUR_TIME.longValue() < nowTime.longValue() - formatTime.longValue()) && (nowTime.longValue() - formatTime.longValue() <= ONE_DAY_TIME.longValue())) {
       ret = "今天 " + hourFat;
     }
 
     if (TWO_DAY_TIME.longValue() < nowTime.longValue() - formatTime.longValue()) {
       ret = mouthFat;
     }
     if (nowYear - forYear > 0) {
       ret = yearFat;
     }
     return ret;
   }
 
   public static String returnTime(Integer time)
   {
     long day = time.intValue() / 86400;
     long hour = time.intValue() / 3600 - day * 24L;
     long min = time.intValue() / 60 - day * 24L * 60L - hour * 60L;
     long s = time.intValue() - day * 24L * 60L * 60L - hour * 60L * 60L - min * 60L;
     StringBuffer sb = new StringBuffer();
     if (day > 0L) {
       sb.append(day);
       sb.append("天");
       sb.append(hour);
       sb.append("小时");
     } else if ((hour > 0L) && (hour < 24L)) {
       sb.append(hour);
       sb.append("小时");
       sb.append(min);
       sb.append("分");
     } else {
       sb.append(min);
       sb.append("分");
       sb.append(s);
       sb.append("秒");
     }
     return sb.toString();
   }
 
   public static String getCurrentTime() {
     SimpleDateFormat matter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     Calendar calendar = Calendar.getInstance();
 
     Date date = calendar.getTime();
     String dateString = matter.format(date);
     return dateString;
   }
 
   public static String getCurrentTime2() {
     SimpleDateFormat matter = new SimpleDateFormat("yyyy-MM-dd");
     Calendar calendar = Calendar.getInstance();
 
     Date date = calendar.getTime();
     String dateString = matter.format(date);
     return dateString;
   }
 
   public static String parseMillisecone(long millisecond)
   {
     String time = null;
     try {
       long yushu_day = millisecond % 86400000L;
       long yushu_hour = millisecond % 86400000L % 3600000L;
 
       long yushu_minute = millisecond % 86400000L % 3600000L % 60000L;
 
       long yushu_second = millisecond % 86400000L % 3600000L % 60000L % 1000L;
 
       if (yushu_day == 0L) {
         return millisecond / 86400000L + "天";
       }
       if (yushu_hour == 0L) {
         return millisecond / 86400000L + "天" + yushu_day / 3600000L + "时";
       }
 
       if (yushu_minute == 0L) {
         return millisecond / 86400000L + "天" + yushu_day / 3600000L + "时" + yushu_hour / 60000L + "分";
       }
 
       long i = millisecond / 86400000L;
       if (i == 0L) {
         return yushu_day / 3600000L + "时" + yushu_hour / 60000L + "分" + yushu_minute / 1000L + "秒";
       }
 
       return millisecond / 86400000L + "天" + yushu_day / 3600000L + "时" + yushu_hour / 60000L + "分" + yushu_minute / 1000L + "秒";
     }
     catch (Exception e)
     {
       e.printStackTrace();
     }
     return time;
   }
 
   public static boolean MoreTime(String passWordTime) throws ParseException {
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     Date now = sdf.parse(passWordTime);
     long time = 60000L;
     Date afterDate = new Date(now.getTime() + time);
 
     return afterDate.getTime() <= getDate(getCurrentTime()).getTime();
   }
 }

