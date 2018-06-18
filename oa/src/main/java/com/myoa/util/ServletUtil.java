 package com.myoa.util;
 
 import java.lang.reflect.InvocationTargetException;
 import java.util.Date;
 import java.util.Map;
 import javax.servlet.http.HttpServletRequest;
 import org.apache.commons.beanutils.BeanUtils;
 import org.apache.commons.beanutils.ConvertUtils;
 import org.apache.commons.beanutils.converters.DateConverter;
 
 public class ServletUtil
 {
   public static void requestParamsCopyToObject(HttpServletRequest request, Object target)
   {
     ConvertUtils.register(new DateConverter(null), Date.class);
     Map params = request.getParameterMap();
     try {
       BeanUtils.copyProperties(target, params);
     }
     catch (IllegalAccessException e) {
       e.printStackTrace();
     }
     catch (InvocationTargetException e) {
       e.printStackTrace();
     }
   }
 }

