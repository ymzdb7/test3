 package com.myoa.util.common;
 
 public class MobileCheck
 {
   public static boolean isMobileDevice(String requestHeader)
   {
     String[] deviceArray = { "android", "windows phone", "nokia", "sony", "ericsson", "mot", "samsung", "htc", "sgh", "lg", "sharp", "sie-", "philips", "panasonic", "alcatel", "lenovo", "iphone", "ipod", "blackberry", "meizu", "android", "netfront", "symbian", "ucweb", "windowsce", "palm", "operamini", "operamobi", "opera mobi", "openwave", "nexusone", "cldc", "midp", "wap", "mobile" };
 
     if (requestHeader == null)
       return false;
     requestHeader = requestHeader.toLowerCase();
     for (int i = 0; i < deviceArray.length; i++) {
       if (requestHeader.indexOf(deviceArray[i]) > 0) {
         return true;
       }
     }
     return false;
   }
 }

