 package com.myoa.util.common;
 
 import org.apache.log4j.Logger;
 
 public abstract class LoggerBase
 {
   public static final int LOG_TYPE_WARN = 17;
   public static final int LOG_TYPE_ERROR = 18;
   public static final int LOG_TYPE_INFO = 19;
   protected Logger log = null;
   protected String className;
   protected String methodName;
   protected String fileName;
   protected Integer linNumber;
 
   void loadLogger(int type)
   {
     switch (type) {
     case 17:
       this.log = Logger.getLogger("warn");
       break;
     case 18:
       this.log = Logger.getLogger("error");
       break;
     case 19:
       this.log = Logger.getLogger("info");
       break;
     default:
       this.log = Logger.getLogger("info");
     }
 
     StackTraceElement[] stacks = new Throwable().getStackTrace();
     setClassName(stacks[2].getClassName());
     setMethodName(stacks[2].getMethodName());
     setFileName(stacks[2].getFileName());
     setLinNumber(Integer.valueOf(stacks[2].getLineNumber()));
   }
 
   public String getClassName() {
     return this.className;
   }
   public void setClassName(String className) {
     this.className = className;
   }
   public String getMethodName() {
     return this.methodName;
   }
   public void setMethodName(String methodName) {
     this.methodName = methodName;
   }
   public String getFileName() {
     return this.fileName;
   }
   public void setFileName(String fileName) {
     this.fileName = fileName;
   }
   public Integer getLinNumber() {
     return this.linNumber;
   }
   public void setLinNumber(Integer linNumber) {
     this.linNumber = linNumber;
   }
 }

