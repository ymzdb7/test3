 package com.myoa.util;
 
 import net.sourceforge.pinyin4j.PinyinHelper;
 import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
 import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
 import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
 import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
 import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
 import org.apache.commons.lang.CharUtils;
 import org.apache.commons.lang.StringUtils;
 
 public class PinYinUtil
 {
   public static String getPingYin(String inputString)
   {
     HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
     format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
     format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
     format.setVCharType(HanyuPinyinVCharType.WITH_V);
 
     char[] input = inputString.trim().toCharArray();
     String output = "";
     try
     {
       for (int i = 0; i < input.length; i++)
         if (Character.toString(input[i]).matches("[\\u4E00-\\u9FA5]+")) {
           String[] temp = PinyinHelper.toHanyuPinyinStringArray(input[i], format);
           output = output + temp[0];
         } else {
           output = output + Character.toString(input[i]);
         }
     } catch (BadHanyuPinyinOutputFormatCombination e) {
       e.printStackTrace();
     }
     return output;
   }
 
   public static String getFirstSpell(String chinese)
   {
     StringBuffer pybf = new StringBuffer();
     char[] arr = chinese.toCharArray();
     HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
     defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
     defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
     for (int i = 0; i < arr.length; i++) {
       if (arr[i] > '')
         try {
           String[] temp = PinyinHelper.toHanyuPinyinStringArray(arr[i], defaultFormat);
           if (temp != null)
             pybf.append(temp[0].charAt(0));
         }
         catch (BadHanyuPinyinOutputFormatCombination e) {
           e.printStackTrace();
         }
       else {
         pybf.append(arr[i]);
       }
     }
     return pybf.toString().replaceAll("\\W", "").trim();
   }
 
   public static String getFullSpell(String chinese)
   {
     StringBuffer pybf = new StringBuffer();
     char[] arr = chinese.toCharArray();
     HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();
     defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
     defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
     for (int i = 0; i < arr.length; i++) {
       if (arr[i] > '')
         try {
           pybf.append(PinyinHelper.toHanyuPinyinStringArray(arr[i], defaultFormat)[0]);
         } catch (BadHanyuPinyinOutputFormatCombination e) {
           e.printStackTrace();
         }
       else {
         pybf.append(arr[i]);
       }
     }
     return pybf.toString();
   }
 
   public static String propertyToField(String property)
   {
     if (null == property) {
       return "";
     }
     char[] chars = property.toCharArray();
     StringBuffer sb = new StringBuffer();
     for (char c : chars) {
       if (CharUtils.isAsciiAlphaUpper(c))
         sb.append("_" + StringUtils.lowerCase(CharUtils.toString(c)));
       else {
         sb.append(c);
       }
     }
     return sb.toString();
   }
 
   public static String fieldToProperty(String field)
   {
     if (null == field) {
       return "";
     }
     char[] chars = field.toCharArray();
     StringBuffer sb = new StringBuffer();
     for (int i = 0; i < chars.length; i++) {
       char c = chars[i];
       if (c == '_') {
         int j = i + 1;
         if (j < chars.length) {
           sb.append(StringUtils.upperCase(CharUtils.toString(chars[j])));
           i++;
         }
       } else {
         sb.append(c);
       }
     }
     return sb.toString();
   }
 }

