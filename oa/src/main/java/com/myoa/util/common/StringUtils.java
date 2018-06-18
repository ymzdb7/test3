 package com.myoa.util.common;
 
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;
 
 public class StringUtils
 {
   public static String checkNullUtils(CheckCallBack callBack, Object[] args)
   {
     if ((args == null) || (args.length == 0)) {
       L.e(new Object[] { "be sure you param is not null" });
       throw new RuntimeException("be sure you param is not null");
     }
 
     if (args.length % 2 != 0) {
       L.e(new Object[] { "params must be pair" });
       throw new RuntimeException("params must be pair");
     }
 
     for (int i = 0; i < args.length - 1; i += 2) {
       if (callBack.isNull(args)) {
         return args[(i + 1)].toString();
       }
 
       if (args[i] == null) {
         return args[(i + 1)].toString();
       }
     }
     return null;
   }
 
   public static Boolean checkNull(String str) {
     if (str == null) return Boolean.valueOf(true);
     if (("".equals(str.trim())) || (str.trim().length() == 0)) return Boolean.valueOf(true);
     return Boolean.valueOf(false);
   }
 
   public static String underline2Camel(String line, boolean smallCamel)
   {
     if ((line == null) || ("".equals(line))) {
       return "";
     }
     StringBuffer sb = new StringBuffer();
     Pattern pattern = Pattern.compile("([A-Za-z\\d]+)(_)?");
     Matcher matcher = pattern.matcher(line);
     while (matcher.find()) {
       String word = matcher.group();
       sb.append((smallCamel) && (matcher.start() == 0) ? Character.toLowerCase(word.charAt(0)) : Character.toUpperCase(word.charAt(0)));
       int index = word.lastIndexOf('_');
       if (index > 0)
         sb.append(word.substring(1, index).toLowerCase());
       else {
         sb.append(word.substring(1).toLowerCase());
       }
     }
     return sb.toString();
   }
 
   public static String camel2Underline(String line)
   {
     if ((line == null) || ("".equals(line))) {
       return "";
     }
     line = String.valueOf(line.charAt(0)).toUpperCase().concat(line.substring(1));
     StringBuffer sb = new StringBuffer();
     Pattern pattern = Pattern.compile("[A-Z]([a-z\\d]+)?");
     Matcher matcher = pattern.matcher(line);
     while (matcher.find()) {
       String word = matcher.group();
       sb.append(word.toUpperCase());
       sb.append(matcher.end() == line.length() ? "" : "_");
     }
     return sb.toString();
   }
 
   public static int getInteger(Object o, int def)
   {
     String s = getString(o);
 
     int print = s.indexOf(".");
     if (print != -1) {
       s = s.substring(0, print);
     }
     if (!"".equals(s)) {
       try {
         return Integer.valueOf(s).intValue();
       } catch (Exception e) {
         return def;
       }
     }
     return def;
   }
 
   public static String getString(Object o)
   {
     if (o == null) {
       return "";
     }
     return String.valueOf(o);
   }
 }

