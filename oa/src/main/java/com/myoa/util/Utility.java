 package com.myoa.util;
 
 public class Utility
 {
   public static String encodeSpecialJson(String srcStr)
   {
     if (srcStr == null) {
       return "";
     }
     return srcStr.replace("\r\n", "").replace("\n", "").replace("\r", "");
   }
 }
