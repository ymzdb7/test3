 package com.myoa.util.common;
 
 import com.alibaba.fastjson.JSONObject;
 import java.io.PrintStream;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.Map.Entry;
 import org.phprpc.util.AssocArray;
 import org.phprpc.util.Cast;
 import org.phprpc.util.PHPSerializer;
 
 public class PHPSerializerUtils
 {
   public static String unSerializer(String phpStr)
   {
     PHPSerializer p = new PHPSerializer();
     String result = null;
     Map<Object,Object> map = null;
     if (StringUtils.checkNull(phpStr).booleanValue())
       return null;
     try
     {
       AssocArray array = (AssocArray)p.unserialize(phpStr.getBytes());
       map = array.toHashMap();
       if ((map == null) || (map.size() == 0)) {
         return phpStr;
       }
       Map resultMap = new HashMap();
       for (Map.Entry entry : map.entrySet()) {
         List list = new ArrayList();
         entry.getKey();
         AssocArray arrayValue = (AssocArray)entry.getValue();
         for (int i = 0; i < array.size(); i++) {
           String t = (String)Cast.cast(arrayValue.get(i), String.class);
           list.add(t);
         }
         resultMap.put(entry.getKey(), list);
       }
       JSONObject jsonObject = new JSONObject(resultMap);
       result = jsonObject.toJSONString();
     } catch (Exception e) {
       e.printStackTrace();
       System.out.println("反序列化PHPmap: " + phpStr + " 失败！！！");
     }
     return result;
   }
 }