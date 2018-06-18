 package com.myoa.service.sys.impl;
 
 
 import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.myoa.dao.common.SysParaMapper;
import com.myoa.dao.unitmanagement.UnitManageMapper;
import com.myoa.model.common.SysPara;
import com.myoa.model.users.OrgManage;
import com.myoa.service.sys.SystemInfoService;
import com.myoa.service.users.OrgManageService;
import com.myoa.service.users.UsersService;
import com.myoa.util.common.L;
import com.myoa.util.ipUtil.MachineCode;
import com.myoa.util.systeminfo.DESUtils;
import com.myoa.util.systeminfo.MachineUtil;
 
 @Service
 public class SystemInfoServiceImpl
   implements SystemInfoService
 {
 
   @Resource
   private UnitManageMapper unitManageMapper;
 
   @Resource
   private UsersService usersService;
 
   @Resource
   private OrgManageService orgManageService;
 
   @Resource
   private SysParaMapper sysParaMapper;
   public static final String MY_KEY = DESUtils.MY_KEY;
/*  45 */   public String softName = "智能OA办公系统";
   public static final String softVersion = "2018.03.16.1";
   public static final String softVersionNO = "1.7";
   public static final String cpright = "oa领跑者";
   public static final String weblocation = "www.baidu.com";
   public static final String webPort = "8080";
   public static final String webServer = "apache-tomcat-7.0.53";
/*  55 */   public static String dbName = "Mysql";
   public static final String dbVersion = "5.6";
   public static final String timezone = "中国标准时间 (8 GMT)";
/*  58 */   public static String isSoftAuth = "未授权";
/*  59 */   public static String useCom = "5";
/*  60 */   public static String dbMysql = "com.mysql.jdbc.Driver";
/*  61 */   public static String dbOracle = "oracle.jdbc.driver.OracleDriver";
 
/*  65 */   public static String serverPath = "";
   public static final String reloadAuthorizationstr = "正式授权信息（正式授权信息，需校验组织机构名称、机器码和软件序列号，务必与授权文件中的信息一致）";
 
   public Map<String, String> getSystemInfo(String path, Object locale)
     throws ParseException
   {
/*  81 */     ResourceBundle rb = ResourceBundle.getBundle("jdbc-sql");
/*  82 */     System.out.println("driver=" + rb.getString("driverClassName"));
/*  83 */     if (dbOracle.equals(rb.getString("driverClassName")))
/*  84 */       dbName = "Oracle";
/*  85 */     else if (dbMysql.equals(rb.getString("driverClassName"))) {
/*  86 */       dbName = "Mysql";
     }
/*  88 */     Map<String,String> map = new HashMap<String,String>();
 
/*  90 */     map.put("cpright", "oa");
 
/*  92 */     map.put("weblocation", "www.baidu.com");
 
/*  94 */     map.put("webPort", "8080");
 
/*  96 */     map.put("webServer", "apache-tomcat-7.0.53");
 
/*  98 */     map.put("dbName", dbName);
 
/* 100 */     map.put("dbVersion", "5.6");
 
/* 102 */     if (locale == null)
/* 103 */       map.put("language", "zh_CN");
     else {
/* 105 */       map.put("language", locale.toString());
     }
 
/* 109 */     map.put("timezone", "中国标准时间 (8 GMT)");
 
/* 112 */     List<OrgManage> orgManageList = this.orgManageService.getOrgManage();
 
/* 114 */     if (orgManageList != null) {
/* 115 */       useCom = orgManageList.size() + "";
     }
 
/* 118 */     map.put("useCom", useCom);
 
/* 122 */     map.put("softVersion", "2018.03.16.1");
 
/* 126 */     map.put("operationSystem", getOperationSystem());
 
/* 133 */     map.put("jdkVersion", getJdkVersion());
 
/* 136 */     int usercount = this.usersService.getUserCount();
 
/* 138 */     int canLoginUser = this.usersService.getCanLoginUser();
/* 139 */     int notLoginUser = usercount - canLoginUser;
 
/* 141 */     map.put("userInfo", "总用户" + usercount + "  (允许登录用户数" + canLoginUser + "人，  禁止登录用户数" + notLoginUser + ")");
 
/* 144 */     map.put("reloadAuthorizationstr", "正式授权信息（正式授权信息，需校验组织机构名称、机器码和软件序列号，务必与授权文件中的信息一致）");
 
/* 146 */     Map<String,String> infoMap = getAuthInfo(path);
 
/* 148 */     if ("true".equals(infoMap.get("isAuthStr"))) {
/* 149 */       map.put("softName", getSoftName(true));
 
/* 151 */       map.put("softSerialNo", infoMap.get("sn_no"));
     } else {
/* 153 */       map.put("softName", getSoftName(false));
 
/* 155 */       map.put("softSerialNo", "无");
     }
 
/* 160 */     map.put("company_num", infoMap.get("company_num"));
 
/* 162 */     map.put("authorizationUnit", infoMap.get("company"));
 
/* 165 */     map.put("oaUserLimit", infoMap.get("users"));
 
/* 175 */     if ((MachineCode.get16CharMacsType() != null) && (MachineCode.get16CharMacsType().size() > 0)) {
/* 176 */       String str = (String)MachineCode.get16CharMacsType().get(0);
/* 177 */       map.put("authorizationCode", str);
     } else {
/* 179 */       map.put("authorizationCode", "");
     }
 
/* 186 */     map.put("installDate", infoMap.get("installDate"));
 
/* 190 */     String isAuthStr = (String)infoMap.get("isAuthStr");
/* 191 */     if ("true".equals(isAuthStr)) {
/* 192 */       map.put("isSoftAuth", "已注册");
     }
     else {
/* 195 */       map.put("isSoftAuth", "未注册（采用系统默认注册文件）");
     }
 
/* 199 */     if ("true".equals(isAuthStr))
     {
/* 201 */       map.put("useEndDate", null);
     } else {
/* 203 */       String installDateStr = (String)infoMap.get("installDate");
/* 204 */       installDateStr = installDateStr + " 00:00:00";
/* 205 */       SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 206 */       Date startDate = sdf1.parse(installDateStr);
/* 207 */       String tryDay = (String)infoMap.get("tryDay");
/* 208 */       int trydayTime = 30;
       try {
/* 210 */         trydayTime = Integer.parseInt(tryDay);
       }
       catch (Exception e) {
       }
/* 214 */       Long addTime = Long.valueOf(trydayTime * 24 * 60 * 60 * 2000L);
/* 215 */       Long time = Long.valueOf(startDate.getTime() + addTime.longValue());
/* 216 */       Date endDate = new Date(time.longValue());
/* 217 */       String endDateStr = sdf1.format(endDate);
/* 218 */       endDateStr = endDateStr.substring(0, 10);
/* 219 */       map.put("useEndDate", endDateStr);
     }
 
/* 228 */     String lecDateStr = (String)infoMap.get("lecDateStr");
/* 229 */     lecDateStr = lecDateStr + " 00:00:00";
/* 230 */     SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 231 */     Date startDate = sdf2.parse(lecDateStr);
/* 232 */     Long addTime = Long.valueOf(31536000000L);
/* 233 */     Long time = Long.valueOf(startDate.getTime() + addTime.longValue());
/* 234 */     Date endDate = new Date(time.longValue());
/* 235 */     String endDateStr = sdf2.format(endDate);
/* 236 */     endDateStr = endDateStr.substring(0, 10);
 
/* 238 */     map.put("endLecDateStr", infoMap.get("endDay"));
 
/* 242 */     map.put("lecDateStr", infoMap.get("lecDateStr"));
 
/* 244 */     return map;
   }
 
   public String getOperationSystem()
   {
/* 256 */     Properties prop = System.getProperties();
/* 257 */     String osName = (String)prop.get("os.name");
/* 258 */     if ((osName.startsWith("Windows")) || (osName.startsWith("windows"))) {
/* 259 */       osName = "Windows";
     }
/* 261 */     return osName;
   }
 
   public String getJdkVersion()
   {
/* 266 */     return System.getProperty("java.version");
   }
 
   public Map<String, String> getAuthInfo(String path)
   {
/* 281 */     StringBuffer sb = new StringBuffer();
/* 282 */     File file = new File(path.concat("/authfiles/lec.txt"));
 
/* 284 */     BufferedReader br = null;
/* 285 */     Map<String,String> hashMap = null;
     try
     {
/* 289 */       br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
       String s;
/* 291 */       while ((s = br.readLine()) != null) {
/* 292 */         sb.append(s);
       }
 
/* 297 */       String decryptData = DESUtils.finalDec(sb.toString());
 
/* 300 */       String[] infoArr = decryptData.split(",");
 
/* 302 */       String company = infoArr[0];
/* 303 */       String company_num = infoArr[1];
/* 304 */       String users = infoArr[2];
/* 305 */       String startTimeInfo = infoArr[3];
/* 306 */       String endDay = infoArr[4];
/* 307 */       String snno = infoArr[5];
/* 308 */       String machineCode = infoArr[6];
 
/* 310 */       writeTimeToFile(infoArr[7], path);
 
/* 312 */       String tryTime = infoArr[7];
/* 313 */       hashMap = new HashMap<String,String>();
 
/* 316 */       hashMap.put("tryDay", tryTime);
 
/* 318 */       File file1 = new File(path.concat("/authfiles/temp"));
/* 319 */       long lastModified1 = file1.lastModified();
/* 320 */       Date installDate1 = new Date(lastModified1);
/* 321 */       SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
/* 322 */       String installDateStr = sdf1.format(installDate1);
/* 323 */       hashMap.put("installDate", installDateStr);
 
/* 326 */       long lastModified = file.lastModified();
/* 327 */       Date installDate = new Date(lastModified);
/* 328 */       String lecDateStr = sdf1.format(installDate);
/* 329 */       hashMap.put("lecDateStr", lecDateStr);
 
/* 331 */       hashMap.put("company", company);
/* 332 */       hashMap.put("company_num", company_num);
 
/* 335 */       if (Integer.parseInt(users) == 0) {
/* 336 */         users = "不限制";
       }
/* 338 */       hashMap.put("users", users);
 
/* 340 */       Date date = new Date();
/* 341 */       hashMap.put("startTime", startTimeInfo);
 
/* 343 */       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
/* 344 */       String startTimeStr = sdf.format(date);
/* 345 */       String startDay = null;
 
/* 347 */       boolean isAuth = checkMachineCode(machineCode);
 
/* 349 */       if (isAuth)
/* 350 */         hashMap.put("isAuthStr", "true");
       else {
/* 352 */         hashMap.put("isAuthStr", "false");
       }
 
/* 356 */       if (!isAuth)
/* 357 */         startDay = startTimeStr.substring(0, 10);
       else {
/* 359 */         startDay = getStartTime(path);
       }
 
/* 362 */       startTimeStr = startDay.concat(" 00:00:00");
///* 363 */       Date startTime = sdf.parse(startTimeStr);
///* 364 */       long todayTime = startTime.getTime();
 
/* 367 */       if (endDay.equals("0000-00-00")) {
/* 368 */         endDay = "永久使用";
/* 369 */         hashMap.put("endDay", endDay);
       } else {
///* 371 */         String endTime = getEndTime(path);
/* 372 */         hashMap.put("endDay", endDay);
       }
 
/* 376 */       hashMap.put("sn_no", snno);
 
/* 378 */       String encryptMaCode = DESUtils.encrypt(machineCode, "gaosuboisnumber1");
 
/* 380 */       while (encryptMaCode.length() < 16) {
/* 381 */         encryptMaCode = encryptMaCode.concat("A");
       }
/* 383 */       while (encryptMaCode.length() > 16) {
/* 384 */         encryptMaCode = encryptMaCode.substring(0, 16);
       }
 
/* 387 */       hashMap.put("ma_code", encryptMaCode);
     }
     catch (Exception e)
     {
/* 392 */       L.e(new Object[] { "sys getAuthInfo:" + e });
     } finally {
       try {
/* 395 */         br.close();
       } catch (IOException e) {
/* 397 */         L.e(new Object[] { "sys getAuthInfo:" + e });
       }
 
     }
 
/* 402 */     return hashMap;
   }
 
   public Map<String, String> getAuthInfo(HttpServletRequest request)
   {
/* 417 */     String path = request.getSession().getServletContext().getRealPath("/");
 
/* 419 */     StringBuffer sb = new StringBuffer();
/* 420 */     File file = new File(path.concat("/authfiles/lec.txt"));
 
/* 422 */     BufferedReader br = null;
/* 423 */     Map<String,String> hashMap = null;
     try
     {
/* 427 */       br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
       String s;
/* 429 */       while ((s = br.readLine()) != null) {
/* 430 */         sb.append(s);
       }
 
///* 435 */       Map<String,String> map = new HashMap<String,String>();
/* 436 */       String decryptData = DESUtils.finalDec(sb.toString());
 
/* 439 */       String[] infoArr = decryptData.split(",");
 
/* 441 */       String company = infoArr[0];
/* 442 */       String company_num = infoArr[1];
/* 443 */       String users = infoArr[2];
/* 444 */       String startTimeInfo = infoArr[3];
/* 445 */       String endDay = infoArr[4];
/* 446 */       String snno = infoArr[5];
/* 447 */       String machineCode = infoArr[6];
 
/* 449 */       writeTimeToFile(infoArr[7], path);
 
/* 451 */       String tryTime = infoArr[7];
/* 452 */       hashMap = new HashMap<String,String>();
 
/* 455 */       hashMap.put("tryDay", tryTime);
 
/* 457 */       File file1 = new File(path.concat("/authfiles/temp"));
/* 458 */       long lastModified1 = file1.lastModified();
/* 459 */       Date installDate1 = new Date(lastModified1);
/* 460 */       SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
/* 461 */       String installDateStr = sdf1.format(installDate1);
/* 462 */       hashMap.put("installDate", installDateStr);
 
/* 465 */       long lastModified = file.lastModified();
/* 466 */       Date installDate = new Date(lastModified);
/* 467 */       String lecDateStr = sdf1.format(installDate);
/* 468 */       hashMap.put("lecDateStr", lecDateStr);
 
/* 470 */       hashMap.put("company", company);
/* 471 */       hashMap.put("company_num", company_num);
 
/* 474 */       if (Integer.parseInt(users) == 0) {
/* 475 */         users = "不限制";
       }
/* 477 */       hashMap.put("users", users);
 
/* 479 */       Date date = new Date();
/* 480 */       hashMap.put("startTime", startTimeInfo);
 
/* 482 */       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
/* 483 */       String startTimeStr = sdf.format(date);
/* 484 */       String startDay = null;
 
/* 487 */       boolean isAuth = checkMachineCode(machineCode);
 
      if (isAuth) {
     hashMap.put("isAuthStr", "true");
       }
       else {
       hashMap.put("isAuthStr", "false");
       }
 
     if (!isAuth)
      startDay = startTimeStr.substring(0, 10);
       else {
      startDay = getStartTime(path);
       }
 
      startTimeStr = startDay.concat(" 00:00:00");
///* 505 */       Date startTime = sdf.parse(startTimeStr);
///* 506 */       long todayTime = startTime.getTime();
 
      if (endDay.equals("0000-00-00")) {
        endDay = "永久使用";
        hashMap.put("endDay", endDay);
     } else {
        String endTime = getEndTime(path);
       hashMap.put("endDay", endDay);
     }

      hashMap.put("sn_no", snno);

       String encryptMaCode = DESUtils.encrypt(machineCode, "gaosuboisnumber1");
 
      while (encryptMaCode.length() < 16) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(encryptMaCode);
       stringBuffer.append(encryptMaCode.substring(0, 1));
         stringBuffer.append(encryptMaCode.substring(2, 3));
        stringBuffer.append(encryptMaCode.substring(4, 5));
       stringBuffer.append(encryptMaCode.substring(6, 7));
        encryptMaCode = stringBuffer.toString();
     }
     while (encryptMaCode.length() > 16) {
       encryptMaCode = encryptMaCode.substring(0, 16);
     }

      hashMap.put("ma_code", encryptMaCode);
     }
   catch (Exception e)
   {
      L.e(new Object[] { "sys getAuthInfo:" + e });
   } finally {
       try {
      br.close();
       } catch (IOException e) {
       L.e(new Object[] { "sys getAuthInfo:" + e });
      }

   }

   return hashMap;
 }
 
 public Map<String, String> getEndLecDate(HttpServletRequest request) throws ParseException
   {
  Map<String,String> map = new HashMap<String,String>();

    Map<String,String> authInfoMap = getAuthInfo(request);
     String endLecDateStr = (String)authInfoMap.get("endLecDateStr");

   String lecDateStr = (String)authInfoMap.get("lecDateStr");
   lecDateStr = lecDateStr + " 00:00:00";
   SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   Date startDate1 = sdf2.parse(lecDateStr);
    Long addTime = Long.valueOf(31536000000L);
     Long time = Long.valueOf(startDate1.getTime() + addTime.longValue());
    Date endDate = new Date(time.longValue());
    String endDateStr = sdf2.format(endDate);
    endDateStr = endDateStr.substring(0, 10);

    String isAuthStr = (String)authInfoMap.get("isAuthStr");

   if ("true".equals(isAuthStr))
   {
       String str1 = "0000-00-00";
     }

   if ("true".equals(isAuthStr))
    {
       map.put("useEndDate", "0000-00-00");
   }
   else {
       String installDateStr = (String)authInfoMap.get("installDate");
      installDateStr = installDateStr + " 00:00:00";
      SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       Date startDate = sdf1.parse(installDateStr);
       String tryDay = (String)authInfoMap.get("tryDay");

       int trydayTime = 30;
      try {
      trydayTime = Integer.parseInt(tryDay);
       }
      catch (Exception e) {
      }
     Long addTime1 = Long.valueOf(trydayTime * 24 * 60 * 60 * 2000L);
      Long time1 = Long.valueOf(startDate.getTime() + addTime1.longValue());
      Date endDate1 = new Date(time1.longValue());
      String endDateStr1 = sdf1.format(endDate1);
      String useEndDate = endDateStr1.substring(0, 10);
       map.put("useEndDate", useEndDate);
    }

     map.put("endLecDateStr", authInfoMap.get("endDay"));

    return map;
 }

  public Map<String, String> getAPPMessage()
  {
   Map<String, String> maps = new HashMap<String, String>();
    SysPara sysPara = this.sysParaMapper.querySysPara("APP_Android_Version");
   SysPara sysPara1 = this.sysParaMapper.querySysPara("APP_IOS_Version");
   SysPara sysPcVesison = this.sysParaMapper.querySysPara("APP_PC_Version");
     SysPara sysPcUrl = this.sysParaMapper.querySysPara("APP_PC_DownUrl");
     maps.put("softVersionAndroidNO", sysPara.getParaValue());
     maps.put("softVersionIOSNO", sysPara1.getParaValue());
   maps.put("filePath", "file/apk/android/Xoa.apk");
    maps.put("softVersionPCNO", sysPcVesison.getParaValue());
    maps.put("pcfilePath", sysPcUrl.getParaValue());
     return maps;
  }
 
  public Map<String, String> getAuthorization(HttpServletRequest request)
  {
   Map<String, String> maps = getAuthInfo(request);

    return maps;
  }

  public boolean checkMachineCode(String authMachineCode)
    throws Exception
  {
    List<String> encryptMacCodeList = MachineUtil.getEncryptMacCode();
  for (String s : encryptMacCodeList) {
       if ((s != null) && (s.equals(DESUtils.encrypt(authMachineCode, DESUtils.MY_KEY)))) {
       return true;
       }
    }
     return false;
   }

  public int getAuthUser(HttpServletRequest request)
  {
    StringBuffer sb = new StringBuffer();
    String realPath = request.getSession().getServletContext().getRealPath("/");
 
    File file = new File(realPath.concat("/authfiles/lec.txt"));
   BufferedReader br = null;
   Map<String, String> hashMap = null;
    try {
      FileReader fileReader = new FileReader(file);
       br = new BufferedReader(fileReader);
      String s;
      while ((s = br.readLine()) != null) {
        sb.append(s);
      }
 
     String decryptData = DESUtils.finalDec(sb.toString());

      String[] infoArr = decryptData.split(",");

      String userCount = infoArr[2];

    if (Integer.parseInt(userCount) == 0) {
        return 99999999;
       }
       return Integer.parseInt(userCount);
   }
    catch (Exception e) {
      e.printStackTrace();
    }

   return 0;
  }

   public int getOrgManage(HttpServletRequest request)
  {
    StringBuffer sb = new StringBuffer();
     String realPath = request.getSession().getServletContext().getRealPath("/");

   File file = new File(realPath.concat("/authfiles/lec.txt"));
    BufferedReader br = null;
    Map<String, String> hashMap = null;
   try {
     FileReader fileReader = new FileReader(file);
      br = new BufferedReader(fileReader);
     String s;
     while ((s = br.readLine()) != null) {
       sb.append(s);
      }

    String decryptData = DESUtils.finalDec(sb.toString());

      String[] infoArr = decryptData.split(",");

     String userCount = infoArr[1];

     if (Integer.parseInt(userCount) == 0) {
       return 99999999;
     }
      return Integer.parseInt(userCount);
     }
    catch (Exception e) {
     e.printStackTrace();
   }

    return 0;
   }

 public String getSoftName(boolean isAuth)
 {
    if (isAuth) {
      if (!"OA网络智能办公系统".equals(this.softName)) {
        this.softName = "OA网络智能办公系统";
     }
 
    }
    else
    {
      if (!"OA网络智能办公系统".equals(this.softName)) {
         this.softName = "OA网络智能办公系统";
     }
   }
    return this.softName;
 }
 
  public void writeTimeToFile(String tryTime, String path)
     throws ParseException, IOException
 {
   String end = getStartTime(path);
    if (end == null)
    {
      int tryDay = Integer.parseInt(tryTime);
      Long millisecond = Long.valueOf(tryDay * 24 * 60 * 60 * 1000L);

       long time = new Date().getTime();

      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      String startDay = sdf.format(new Date());
      startDay = startDay.substring(0, 10);
     Date startDayTime = sdf.parse(startDay.concat(" 00:00:00"));

       long totalMillisecond = time + millisecond.longValue();
      Date endTime = new Date(totalMillisecond);

      String endDay = sdf.format(endTime);
       endDay = endDay.substring(0, 10);
       File file = new File(path.concat("/authfiles/endday.txt"));
      FileWriter fileWriter = new FileWriter(file);
      String startEndDay = startDay + "," + endDay;
       fileWriter.write(startEndDay);
       fileWriter.close();
   }
 }

  public String getEndTime(String path)
    throws IOException
 {
    File file = new File(path.concat("/authfiles/endday.txt"));
     FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String s = bufferedReader.readLine();
    if ((s == null) || (s.length() == 0)) {
       return null;
    }
    String[] startEndDay = s.split(",");
     String endDay = startEndDay[1];
   return endDay;
  }

  public String getStartTime(String path)
    throws IOException
  {
    File file = new File(path.concat("authfiles/endday.txt"));
   FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    String s = bufferedReader.readLine();
   if ((s == null) || (s.length() == 0)) {
      return null;
   }
 String[] startEndDay = s.split(",");
   String startDay = startEndDay[0];
     return startDay;
   }
} 