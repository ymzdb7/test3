 package com.myoa.util;
 
 import com.myoa.model.attend.AttendSet;
import com.myoa.model.users.Users;
import com.myoa.service.attend.AttendSetService;
import com.myoa.service.calender.CalenderService;
import com.myoa.service.users.UsersService;
import com.myoa.util.common.StringUtils;
import com.myoa.util.ipUtil.MachineCode;
import com.tencent.xinge.ClickAction;
 import com.tencent.xinge.Message;
 import com.tencent.xinge.MessageIOS;
 import com.tencent.xinge.Style;
 import com.tencent.xinge.XingeApp;
 import java.io.PrintStream;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 import java.util.Timer;
 import org.json.JSONException;
 import org.json.JSONObject;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
 @Component
 public class SpringQtz
 {
   Timer timer;
 
   @Autowired
   AttendSetService articleService;
 
   @Autowired
   CalenderService calenderService;
 
   @Autowired
   UsersService usersService;
   String androidKey;
   String androidSercetKey;
   String iosKey;
   String iosSercetKey;
 
   public String getAndroidKey()
   {
     return this.androidKey;
   }
 
   public void setAndroidKey(String androidKey) {
     this.androidKey = androidKey;
   }
 
   public String getAndroidSercetKey() {
     return this.androidSercetKey;
   }
 
   public void setAndroidSercetKey(String androidSercetKey) {
     this.androidSercetKey = androidSercetKey;
   }
 
   public String getIosKey() {
     return this.iosKey;
   }
 
   public void setIosKey(String iosKey) {
     this.iosKey = iosKey;
   }
 
   public String getIosSercetKey() {
     return this.iosSercetKey;
   }
 
   public void setIosSercetKey(String iosSercetKey) {
     this.iosSercetKey = iosSercetKey;
   }
 
   public void springQtzBean(Integer oid, Date date)
     throws Exception
   {
     SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
     String dateto = dateFormat.format(date);
     String jixiema = (String)MachineCode.get16CharMacs().get(0);
     List<Users> users = this.usersService.LoginUserList();
     for (Users users1 : users)
       if (users1.getDutyType().shortValue() != 0) {
         AttendSet attendSet = this.articleService.queryAttendSetByTuiSongId(users1.getUid());
         if (attendSet != null) {
           java.util.Calendar nowDate = java.util.Calendar.getInstance();
 
           if (("1".equals(attendSet.getAtime1Setother())) && 
             ("1".equals(attendSet.getCommute1()))) {
             Date date2 = DateFormat.getDateTimes(attendSet.getAtime1());
             nowDate.setTime(date2);
             nowDate.add(12, -10);
             String dateStr = dateFormat.format(nowDate.getTime());
             if (dateto.equals(dateStr))
             {
               String account = jixiema + users1.getUserId() + oid;
               tuiSongXhH(account);
             }
 
           }
 
           if (("1".equals(attendSet.getAtime2Setother())) && 
             ("1".equals(attendSet.getCommute2()))) {
             Date date2 = DateFormat.getDateTimes(attendSet.getAtime2());
             nowDate.setTime(date2);
             nowDate.add(12, -10);
             String dateStr = dateFormat.format(nowDate.getTime());
             if (dateto.equals(dateStr))
             {
               String account = jixiema + users1.getUserId() + oid;
               tuiSongXhH(account);
             }
 
           }
 
           if (("1".equals(attendSet.getAtime3Setother())) && 
             ("1".equals(attendSet.getCommute3()))) {
             Date date2 = DateFormat.getDateTimes(attendSet.getAtime3());
             nowDate.setTime(date2);
             nowDate.add(12, -10);
             String dateStr = dateFormat.format(nowDate.getTime());
             if (dateto.equals(dateStr))
             {
               String account = jixiema + users1.getUserId() + oid;
               tuiSongXhH(account);
             }
 
           }
 
           if (("1".equals(attendSet.getAtime4Setother())) && 
             ("1".equals(attendSet.getCommute4()))) {
             Date date2 = DateFormat.getDateTimes(attendSet.getAtime4());
             nowDate.setTime(date2);
             nowDate.add(12, -10);
             String dateStr = dateFormat.format(nowDate.getTime());
             if (dateto.equals(dateStr))
             {
               String account = jixiema + users1.getUserId() + oid;
               tuiSongXhH(account);
             }
 
           }
 
           if (("1".equals(attendSet.getAtime5Setother())) && 
             ("1".equals(attendSet.getCommute5()))) {
             Date date2 = DateFormat.getDateTimes(attendSet.getAtime5());
             nowDate.setTime(date2);
             nowDate.add(12, -10);
             String dateStr = dateFormat.format(nowDate.getTime());
             if (dateto.equals(dateStr))
             {
               String account = jixiema + users1.getUserId() + oid;
               tuiSongXhH(account);
             }
 
           }
 
           if (("1".equals(attendSet.getAtime6Setother())) && 
             ("1".equals(attendSet.getCommute6()))) {
             Date date2 = DateFormat.getDateTimes(attendSet.getAtime6());
             nowDate.setTime(date2);
             nowDate.add(12, -10);
             String dateStr = dateFormat.format(nowDate.getTime());
             if (dateto.equals(dateStr))
             {
               String account = jixiema + users1.getUserId() + oid;
               tuiSongXhH(account);
             }
           }
         }
       }
   }
 
   public void riCheng(Integer oid, Date date)
     throws Exception
   {
     List<com.myoa.model.calender.Calendar> attendSet = this.calenderService.rChSelect();
     java.util.Calendar calendar = java.util.Calendar.getInstance();
     String jixiema = (String)MachineCode.get16CharMacs().get(0);
     for (com.myoa.model.calender.Calendar calendar1 : attendSet) {
       String[] account = null;
       String content = calendar1.getContent();
       String beforeRemaind = calendar1.getBeforeRemaind();
       if (beforeRemaind != null) {
         String[] time = beforeRemaind.split("\\|");
         if ((!StringUtils.checkNull(time[0]).booleanValue()) && (!time[0].equals("0")) && (time[0] != null)) {
           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
           calendar.setTime(date);
           calendar.add(5, Integer.valueOf(time[0]).intValue());
           Date date1 = calendar.getTime();
           String dateString = dateFormat.format(date1);
           if ((!StringUtils.checkNull(time[1]).booleanValue()) && (!time[1].equals("0")) && (time[1] != null)) {
             calendar.setTime(date1);
             calendar.add(11, Integer.valueOf(time[1]).intValue());
             date1 = calendar.getTime();
             String date1String = dateFormat.format(date1);
             if ((!time[2].equals("0")) && (time[2] != null)) {
               calendar.setTime(date1);
               calendar.add(12, Integer.valueOf(time[2]).intValue());
               date1 = calendar.getTime();
               date1String = dateFormat.format(date1);
 
               if (calendar1.getCalTime() != null) {
                 String sd = dateFormat.format(new Date(Long.parseLong(calendar1.getCalTime().toString()) * 1000L));
                 if (sd.equals(date1String)) {
                   account = xunHuanPingJie(calendar1.getOwner(), calendar1.getUserId(), calendar1.getTaker(), oid, jixiema);
                   tuiSongXh(account, content);
                 }
               }
             }
             else if (calendar1.getCalTime() != null) {
               String sd = dateFormat.format(new Date(Long.parseLong(calendar1.getCalTime().toString()) * 1000L));
               if (sd.equals(date1String)) {
                 account = xunHuanPingJie(calendar1.getOwner(), calendar1.getUserId(), calendar1.getTaker(), oid, jixiema);
                 tuiSongXh(account, content);
               }
             }
           }
           else if ((!StringUtils.checkNull(time[2]).booleanValue()) && (!time[2].equals("0")) && (time[2] != null)) {
             calendar.setTime(date1);
             calendar.add(12, -Integer.valueOf(time[2]).intValue());
             date1 = calendar.getTime();
             String date1String = dateFormat.format(date1);
 
             if (calendar1.getCalTime() != null) {
               String sd = dateFormat.format(new Date(Long.parseLong(calendar1.getCalTime().toString()) * 1000L));
               if (sd.equals(date1String)) {
                 account = xunHuanPingJie(calendar1.getOwner(), calendar1.getUserId(), calendar1.getTaker(), oid, jixiema);
                 tuiSongXh(account, content);
               }
             }
           } else if (calendar1.getCalTime() != null) {
             String sd = dateFormat.format(new Date(Long.parseLong(calendar1.getCalTime().toString()) * 1000L));
             if (sd.equals(dateString)) {
               account = xunHuanPingJie(calendar1.getOwner(), calendar1.getUserId(), calendar1.getTaker(), oid, jixiema);
               tuiSongXh(account, content);
             }
           }
         }
         else if ((!StringUtils.checkNull(time[1]).booleanValue()) && (!time[1].equals("0")) && (time[1] != null)) {
           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
           calendar.setTime(date);
           calendar.add(11, Integer.valueOf(time[1]).intValue());
           Date date1 = calendar.getTime();
           String date1String = dateFormat.format(date1);
           if ((!time[2].equals("0")) && (time[2] != null)) {
             calendar.setTime(date1);
             calendar.add(12, Integer.valueOf(time[2]).intValue());
             date1 = calendar.getTime();
             date1String = dateFormat.format(date1);
             date1 = dateFormat.parse(date1String);
             date1String = dateFormat.format(date1);
 
             if (calendar1.getCalTime() != null) {
               String sd = dateFormat.format(new Date(Long.parseLong(calendar1.getCalTime().toString()) * 1000L));
               if (sd.equals(date1String)) {
                 account = xunHuanPingJie(calendar1.getOwner(), calendar1.getUserId(), calendar1.getTaker(), oid, jixiema);
                 tuiSongXh(account, content);
               }
             }
           } else if (calendar1.getCalTime() != null) {
             String sd = dateFormat.format(new Date(Long.parseLong(calendar1.getCalTime().toString()) * 1000L));
             if (sd.equals(date1String)) {
               account = xunHuanPingJie(calendar1.getOwner(), calendar1.getUserId(), calendar1.getTaker(), oid, jixiema);
               tuiSongXh(account, content);
             }
           }
         } else if ((!StringUtils.checkNull(time[2]).booleanValue()) && (!time[2].equals("0")) && (time[2] != null)) {
           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
           calendar.setTime(date);
           calendar.add(12, Integer.valueOf(time[2]).intValue());
           Date date1 = calendar.getTime();
           String date1String = dateFormat.format(date1);
 
           if (calendar1.getCalTime() != null) {
             String sd = dateFormat.format(new Date(Long.parseLong(calendar1.getCalTime().toString()) * 1000L));
             if (sd.equals(date1String)) {
               account = xunHuanPingJie(calendar1.getOwner(), calendar1.getUserId(), calendar1.getTaker(), oid, jixiema);
               tuiSongXh(account, content);
             }
           }
         } else {
           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
           calendar.setTime(date);
           String dateString = dateFormat.format(date);
 
           if (calendar1.getCalTime() != null) {
             String sd = dateFormat.format(new Date(Long.parseLong(calendar1.getCalTime().toString()) * 1000L));
             if (sd.equals(dateString)) {
               account = xunHuanPingJie(calendar1.getOwner(), calendar1.getUserId(), calendar1.getTaker(), oid, jixiema);
               tuiSongXh(account, content);
             }
           }
         }
       }
     }
   }
 
   public Date getTime(String datemon) {
     Date time = null;
     try {
       java.util.Calendar calendar = java.util.Calendar.getInstance();
 
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
       SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
 
       Date date = dateFormat.parse(dateFormat1.format(new Date()) + " " + datemon);
 
       calendar.add(12, 10);
       calendar.setTime(date);
       time = calendar.getTime();
     } catch (Exception e) {
       e.printStackTrace();
     }
     return time;
   }
 
   public static String getTimeByMinute(int minute)
   {
     java.util.Calendar calendar = java.util.Calendar.getInstance();
 
     calendar.add(12, minute);
 
     return new SimpleDateFormat("yyyy-MM-dd HH:mm").format(calendar.getTime());
   }
 
   public String[] xunHuanPingJie(String owner, String userId, String taker, Integer oid, String jixiema)
   {
     String[] contGet = null;
     String[] owners = null;
     owner = owner + taker + "," + userId;
     if (owner != null) {
       owners = owner.split(",");
       owners = getDistinct(owners);
     }
     contGet = new String[owners.length + 1];
     for (int i = 0; i < owners.length; i++) {
       contGet[i] = (jixiema + owners[i] + oid);
     }
     return contGet;
   }
 
   public void tuiSongXh(String[] account, String content)
     throws JSONException
   {
     JSONObject ret3;
     for (int i = 0; i < account.length; i++) {
       if (account[i] == null)
         continue;
       XingeApp pushAndroid = new XingeApp(2100270598L, "82378f499570aeb8c169fa570cc33508");
       XingeApp push = new XingeApp(2200269915L, "6778710490d921b42565e1b3711a3458");
       ClickAction clickAction = new ClickAction();
       clickAction.setActionType(1);
       clickAction.setActivity("123");
       Style style = new Style(0, 0, 0, 1, 1, 1, 0, 1);
       Message mess = new Message();
       mess.setType(1);
       mess.setStyle(style);
       mess.setTitle("日程提醒");
       mess.setContent(content);
       mess.setAction(clickAction);
       JSONObject ret = pushAndroid.pushSingleAccount(0, account[i], mess);
       JSONObject contentTest = new JSONObject();
       JSONObject obj = new JSONObject();
       JSONObject aps = new JSONObject();
       contentTest.put("title", "日程提醒");
       contentTest.put("body", content);
       aps.put("badge", 1);
       aps.put("alert", contentTest);
       obj.put("aps", aps);
       MessageIOS messageIOS = new MessageIOS();
       messageIOS.setRaw(obj.toString());
       ret3 = push.pushSingleAccount(0, account[i], messageIOS, 1);
     }
   }
 
   public void tuiSongXhH(String account)
     throws JSONException
   {
     System.out.println(account);
 
     XingeApp pushAndroid = new XingeApp(2100270598L, "82378f499570aeb8c169fa570cc33508");
     XingeApp push = new XingeApp(2200269915L, "6778710490d921b42565e1b3711a3458");
     ClickAction clickAction = new ClickAction();
     clickAction.setActionType(1);
     clickAction.setActivity("123");
     Style style = new Style(0, 0, 0, 1, 1, 1, 0, 1);
     Message mess = new Message();
     mess.setType(1);
     mess.setStyle(style);
     mess.setTitle("考勤签到提醒");
     mess.setContent("离上班时间还有10分钟");
     mess.setAction(clickAction);
     JSONObject ret = pushAndroid.pushSingleAccount(0, account, mess);
 
     JSONObject contentTest = new JSONObject();
     JSONObject obj = new JSONObject();
     JSONObject aps = new JSONObject();
     contentTest.put("title", "考勤签到提醒");
     contentTest.put("body", "离上班时间还有10分钟");
     aps.put("badge", 1);
     aps.put("alert", contentTest);
     obj.put("aps", aps);
     MessageIOS messageIOS = new MessageIOS();
     messageIOS.setRaw(obj.toString());
     JSONObject ret3 = push.pushSingleAccount(0, account, messageIOS, 1);
   }
 
   public void rcAp()
   {
     this.timer = new Timer();
     this.timer.schedule(new TimeRchSpringQtz(), new Date());
     this.timer.cancel();
   }
 
   static String[] getDistinct(String[] num)
   {
     List list = new ArrayList();
     for (int i = 0; i < num.length; i++) {
       if (!list.contains(num[i])) {
         list.add(num[i]);
       }
     }
     return (String[])list.toArray(new String[0]);
   }
 }