 package com.myoa.service.workflow.customNumber;
 
 import com.myoa.dao.customNumber.CustomNumberMapper;
import com.myoa.dao.customNumber.CustomNumberRecordMapper;
import com.myoa.model.customNumber.CustomNumber;
import com.myoa.model.customNumber.CustomNumberExample;
import com.myoa.model.customNumber.CustomNumberRecord;
import com.myoa.service.workflow.customNumber.wrapper.CustomNumberWrappers;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.wrapper.BaseWrapper;

 import java.util.Calendar;
 import java.util.Date;
 import java.util.List;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class CustomNumberService
 {
 
   @Resource
   private CustomNumberMapper customNumberMapper;
 
   @Resource
   private CustomNumberRecordMapper customNumberRecordMapper;
 
   public BaseWrapper generateCustomNumber(Integer uuid, String model, String modelId)
   {
     CustomNumberWrappers wrappers = new CustomNumberWrappers();
 
     List records = this.customNumberRecordMapper.queryCustomNumberRecordBymodel(String.valueOf(uuid), modelId);
     if (records.size() != 0) {
       wrappers.setFlag(true);
       wrappers.setStatus(true);
       wrappers.setMsg("ok");
       wrappers.setData(((CustomNumberRecord)records.get(0)).getNumberStyle());
       return wrappers;
     }
 
     if (StringUtils.checkNull(String.valueOf(uuid)).booleanValue()) {
       wrappers.setFlag(false);
       wrappers.setStatus(true);
       wrappers.setMsg("传值为空");
       return wrappers;
     }
     CustomNumber customNumber = this.customNumberMapper.selectByPrimaryKey(uuid);
     String userSetStyle = customNumber.getSetStyle();
     String showStr = "";
     int type = customNumber.getTypes().intValue();
     int numBit = customNumber.getNumberBit().intValue();
     int curNUmber = customNumber.getCurrentNumber().intValue() + 1;
     int curNumBit = (curNUmber + "").length();
     Date date1 = customNumber.getLastDate();
     Calendar date = Calendar.getInstance();
     date.setTime(date1);
 
     Calendar now = Calendar.getInstance();
     Date date2 = now.getTime();
     if (type == 1)
     {
       if (userSetStyle.indexOf("YYYY") > -1) {
         userSetStyle = userSetStyle.replaceAll("YYYY", now.get(1) + "");
       }
       if (userSetStyle.indexOf("YY") > -1) {
         userSetStyle = userSetStyle.replaceAll("YY", (now.get(1) + "").substring(2));
       }
 
       if (userSetStyle.indexOf("MM") > -1) {
         int month = now.get(2) + 1;
         String monthStr = "";
         if (month < 10) monthStr = "0";
         monthStr = monthStr + month;
         userSetStyle = userSetStyle.replaceAll("MM", monthStr);
       }
 
       if (userSetStyle.indexOf("DD") > -1) {
         int day = now.get(5);
         String dayStr = "";
         if (day < 10) dayStr = "0";
         dayStr = dayStr + day;
         userSetStyle = userSetStyle.replaceAll("DD", dayStr);
       }
 
       if (userSetStyle.indexOf("##") > -1) {
         String num = "";
         for (int i = 0; i < numBit - curNumBit; i++) {
           num = num + "0";
         }
         num = num + curNUmber;
         userSetStyle = userSetStyle.replaceAll("##", num);
         curNUmber = Integer.parseInt(num);
       }
       showStr = userSetStyle;
     }
 
     if (type == 2) {
       int year = date.get(1);
       int nowYear = now.get(1);
       if (year == nowYear)
       {
         if (userSetStyle.indexOf("YYYY") > -1) {
           userSetStyle = userSetStyle.replaceAll("YYYY", nowYear + "");
         }
         if (userSetStyle.indexOf("YY") > -1) {
           userSetStyle = userSetStyle.replaceAll("YY", (nowYear + "").substring(2));
         }
 
         if (userSetStyle.indexOf("MM") > -1) {
           int month = now.get(2) + 1;
           String monthStr = "";
           if (month < 10) monthStr = "0";
           monthStr = monthStr + month;
           userSetStyle = userSetStyle.replaceAll("MM", monthStr);
         }
 
         if (userSetStyle.indexOf("DD") > -1) {
           int day = now.get(5);
           String dayStr = "";
           if (day < 10) dayStr = "0";
           dayStr = dayStr + day;
           userSetStyle = userSetStyle.replaceAll("DD", dayStr);
         }
 
         if (userSetStyle.indexOf("##") > -1) {
           String num = "";
           for (int i = 0; i < numBit - curNumBit; i++) {
             num = num + "0";
           }
           num = num + curNUmber;
           userSetStyle = userSetStyle.replaceAll("##", num);
           curNUmber = Integer.parseInt(num);
         }
         showStr = userSetStyle;
       }
       else
       {
         if (userSetStyle.indexOf("YYYY") > -1) {
           userSetStyle = userSetStyle.replaceAll("YYYY", nowYear + "");
         }
         if (userSetStyle.indexOf("YY") > -1) {
           userSetStyle = userSetStyle.replaceAll("YY", (nowYear + "").substring(2));
         }
 
         if (userSetStyle.indexOf("MM") > -1) {
           int month = now.get(2) + 1;
           String monthStr = "";
           if (month < 10) monthStr = "0";
           monthStr = monthStr + month;
           userSetStyle = userSetStyle.replaceAll("MM", monthStr);
         }
 
         if (userSetStyle.indexOf("DD") > -1) {
           int day = now.get(5);
           String dayStr = "";
           if (day < 10) dayStr = "0";
           dayStr = dayStr + day;
           userSetStyle = userSetStyle.replaceAll("DD", dayStr);
         }
 
         if (userSetStyle.indexOf("##") > -1) {
           String num = "";
           curNUmber = 1;
           curNumBit = (curNUmber + "").length();
           for (int i = 0; i < numBit - curNumBit; i++) {
             num = num + "0";
           }
           num = num + curNUmber;
           userSetStyle = userSetStyle.replaceAll("##", num);
           curNUmber = Integer.parseInt(num);
         }
         showStr = userSetStyle;
       }
     }
     if (type == 3) {
       int year = date.get(1);
       int nowYear = now.get(1);
       int months = date.get(2);
       int nowMonth = now.get(2);
       if ((year == nowYear) && (months == nowMonth))
       {
         if (userSetStyle.indexOf("YYYY") > -1) {
           userSetStyle = userSetStyle.replaceAll("YYYY", nowYear + "");
         }
         if (userSetStyle.indexOf("YY") > -1) {
           userSetStyle = userSetStyle.replaceAll("YY", (nowYear + "").substring(2));
         }
 
         if (userSetStyle.indexOf("MM") > -1) {
           int month = now.get(2) + 1;
           String monthStr = "";
           if (month < 10) monthStr = "0";
           monthStr = monthStr + month;
           userSetStyle = userSetStyle.replaceAll("MM", monthStr);
         }
 
         if (userSetStyle.indexOf("DD") > -1) {
           int day = now.get(5);
           String dayStr = "";
           if (day < 10) dayStr = "0";
           dayStr = dayStr + day;
           userSetStyle = userSetStyle.replaceAll("DD", dayStr);
         }
 
         if (userSetStyle.indexOf("##") > -1) {
           String num = "";
           for (int i = 0; i < numBit - curNumBit; i++) {
             num = num + "0";
           }
           num = num + curNUmber;
           userSetStyle = userSetStyle.replaceAll("##", num);
           curNUmber = Integer.parseInt(num);
         }
         showStr = userSetStyle;
       }
       else if ((year != nowYear) || (months != nowMonth))
       {
         if (userSetStyle.indexOf("YYYY") > -1) {
           userSetStyle = userSetStyle.replaceAll("YYYY", nowYear + "");
         }
         if (userSetStyle.indexOf("YY") > -1) {
           userSetStyle = userSetStyle.replaceAll("YY", (nowYear + "").substring(2));
         }
 
         if (userSetStyle.indexOf("MM") > -1) {
           int month = now.get(2) + 1;
           String monthStr = "";
           if (month < 10) monthStr = "0";
           monthStr = monthStr + month;
           userSetStyle = userSetStyle.replaceAll("MM", monthStr);
         }
 
         if (userSetStyle.indexOf("DD") > -1) {
           int day = now.get(5);
           String dayStr = "";
           if (day < 10) dayStr = "0";
           dayStr = dayStr + day;
           userSetStyle = userSetStyle.replaceAll("DD", dayStr);
         }
 
         if (userSetStyle.indexOf("##") > -1) {
           String num = "";
           curNUmber = 1;
           curNumBit = (curNUmber + "").length();
           for (int i = 0; i < numBit - curNumBit; i++) {
             num = num + "0";
           }
           num = num + curNUmber;
           userSetStyle = userSetStyle.replaceAll("##", num);
           curNUmber = Integer.parseInt(num);
         }
         showStr = userSetStyle;
       }
 
     }
 
     if (type == 4) {
       int year = date.get(1);
       int nowYear = now.get(1);
       int months = date.get(2);
       int nowMonth = now.get(2);
       int days = date.get(5);
       int nowDay = now.get(5);
       if ((year == nowYear) && (months == nowMonth) && (days == nowDay))
       {
         if (userSetStyle.indexOf("YYYY") > -1) {
           userSetStyle = userSetStyle.replaceAll("YYYY", now.get(1) + "");
         }
         if (userSetStyle.indexOf("YY") > -1) {
           userSetStyle = userSetStyle.replaceAll("YY", (now.get(1) + "").substring(2));
         }
 
         if (userSetStyle.indexOf("MM") > -1) {
           int month = now.get(2) + 1;
           String monthStr = "";
           if (month < 10) monthStr = "0";
           monthStr = monthStr + month;
           userSetStyle = userSetStyle.replaceAll("MM", monthStr);
         }
 
         if (userSetStyle.indexOf("DD") > -1) {
           int day = now.get(5);
           String dayStr = "";
           if (day < 10) dayStr = "0";
           dayStr = dayStr + day;
           userSetStyle = userSetStyle.replaceAll("DD", dayStr);
         }
 
         if (userSetStyle.indexOf("##") > -1) {
           String num = "";
           for (int i = 0; i < numBit - curNumBit; i++) {
             num = num + "0";
           }
           num = num + curNUmber;
           userSetStyle = userSetStyle.replaceAll("##", num);
           curNUmber = Integer.parseInt(num);
         }
         showStr = userSetStyle;
       }
       else if ((year != nowYear) || (months != nowMonth) || (days != nowDay))
       {
         if (userSetStyle.indexOf("YYYY") > -1) {
           userSetStyle = userSetStyle.replaceAll("YYYY", nowYear + "");
         }
         if (userSetStyle.indexOf("YY") > -1) {
           userSetStyle = userSetStyle.replaceAll("YY", (nowYear + "").substring(2));
         }
 
         if (userSetStyle.indexOf("MM") > -1) {
           int month = now.get(2) + 1;
           String monthStr = "";
           if (month < 10) monthStr = "0";
           monthStr = monthStr + month;
           userSetStyle = userSetStyle.replaceAll("MM", monthStr);
         }
 
         if (userSetStyle.indexOf("DD") > -1) {
           int day = now.get(5);
           String dayStr = "";
           if (day < 10) dayStr = "0";
           dayStr = dayStr + day;
           userSetStyle = userSetStyle.replaceAll("DD", dayStr);
         }
 
         if (userSetStyle.indexOf("##") > -1) {
           String num = "";
           curNUmber = 1;
           curNumBit = (curNUmber + "").length();
           for (int i = 0; i < numBit - curNumBit; i++) {
             num = num + "0";
           }
           num = num + curNUmber;
           userSetStyle = userSetStyle.replaceAll("##", num);
           curNUmber = Integer.parseInt(num);
         }
         showStr = userSetStyle;
       }
     }
 
     customNumber.setCurrentNumber(Integer.valueOf(curNUmber));
     customNumber.setLastDate(date2);
     CustomNumberRecord customNumberRecord = new CustomNumberRecord();
     customNumberRecord.setCrTime(date2);
     customNumberRecord.setCustomNumberId(customNumber.getUuid());
     customNumberRecord.setNumberValue(Integer.valueOf(curNUmber));
     customNumberRecord.setNumberStyle(showStr);
     customNumberRecord.setModel(model);
     customNumberRecord.setModelId(modelId);
     this.customNumberRecordMapper.insertSelective(customNumberRecord);
     customNumberRecord.setUuid(uuid);
     this.customNumberMapper.updateByPrimaryKey(customNumber);
 
     wrappers.setFlag(true);
     wrappers.setStatus(true);
     wrappers.setMsg("ok");
     wrappers.setData(showStr);
     return wrappers;
   }
 
   public BaseWrapper queryCustomNumber(HttpServletRequest request) {
     CustomNumberWrappers wrappers = new CustomNumberWrappers();
     CustomNumberExample customNumberExample = new CustomNumberExample();
     List customNumbers = this.customNumberMapper.selectByExample(customNumberExample);
     wrappers.setFlag(true);
     wrappers.setStatus(true);
     wrappers.setMsg("ok");
     wrappers.setData(customNumbers);
     return wrappers;
   }
 }

