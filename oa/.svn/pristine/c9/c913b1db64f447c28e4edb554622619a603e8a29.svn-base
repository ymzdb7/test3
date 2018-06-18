 package com.myoa.util;
 
 import com.alibaba.fastjson.JSON;
 import com.alibaba.fastjson.TypeReference;
 import com.alibaba.fastjson.parser.Feature;
 import java.util.List;
 import java.util.Map;
 
 public class JsonToProptyOrMapAndList
 {
   public static List<Map<String, Object>> protyString(String propty)
   {
     return (List)JSON.parseObject(propty, new TypeReference()
     {
     }
     , new Feature[0]);
   }
 
   public static Map<String, Object> returnMaps(String porpty)
   {
     return (Map)JSON.parseObject(porpty, Map.class);
   }
 }

