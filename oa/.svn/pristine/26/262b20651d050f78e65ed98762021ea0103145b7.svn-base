 package com.myoa.util.common;
 
 import com.alibaba.fastjson.JSONArray;
 import org.apache.log4j.Logger;
 
 public class L extends LoggerBase
 {
   private static volatile L lloader;
   private long startTime = System.currentTimeMillis();
 
   public static L getInstance() { if (lloader == null) {
       synchronized (L.class) {
         if (lloader == null) {
           lloader = new L();
         }
       }
     }
     return lloader;
   }
 
   public static void w(Object[] msgs)
   {
     L lloader = getInstance();
     lloader.loadLogger(17);
     lloader.log.warn(lloader.subString(msgs));
   }
 
   public static void d(Object[] msgs)
   {
     L lloader = getInstance();
     lloader.loadLogger(17);
     lloader.log.debug(lloader.subString(msgs));
   }
 
   public static void e(Object[] msgs)
   {
     L lloader = getInstance();
     lloader.loadLogger(18);
     lloader.log.error(lloader.subString(msgs));
   }
 
   public static void a(Object[] msgs)
   {
     L lloader = getInstance();
     lloader.loadLogger(19);
     lloader.log.info(lloader.subString(msgs));
   }
 
   public static void i(Object[] msgs)
   {
     L lloader = getInstance();
     lloader.loadLogger(19);
     lloader.log.info(lloader.subString(msgs));
   }
 
   public static void s(Object[] msgs) {
     L lloader = getInstance();
     lloader.loadLogger(19);
     lloader.log.info(lloader.subSysUrl(msgs));
   }
 
   public String subSysUrl(Object[] msgs)
   {
     StringBuffer sbBuffer = new StringBuffer("system log :");
     for (Object msg : msgs) {
       sbBuffer.append(JSONArray.toJSON(msg) + "\n ");
     }
     return sbBuffer.toString();
   }
 
   private String subString(Object[] obj)
   {
     StringBuffer sbBuffer = new StringBuffer("------------日志信息开始-------------");
 
     sbBuffer.append("\r\n");
     sbBuffer.append("file:" + getFileName());
     sbBuffer.append("\r\n");
     sbBuffer.append("class:  at " + getClassName() + "(" + getClassName().substring(getClassName().lastIndexOf(".") + 1, getClassName().length()) + ".java:1)");
     sbBuffer.append("\r\n");
     sbBuffer.append("method:" + getMethodName());
     sbBuffer.append("\r\n");
     sbBuffer.append("line:  at " + getLinNumber() + " " + getClassName() + "(" + getClassName().substring(getClassName().lastIndexOf(".") + 1, getClassName().length()) + ".java:" + getLinNumber() + ")");
     sbBuffer.append("\r\n");
     sbBuffer.append("your write info is:");
     sbBuffer.append("\r\n");
     for (Object msg : obj) {
       sbBuffer.append(JSONArray.toJSON(msg) + " ");
     }
     sbBuffer.append("\n [执行：");
     long endTime = System.currentTimeMillis();
     sbBuffer.append(endTime - this.startTime);
     sbBuffer.append("\tms] \n");
     sbBuffer.append("------------日志信息结束-------------");
     return sbBuffer.toString();
   }
 }

