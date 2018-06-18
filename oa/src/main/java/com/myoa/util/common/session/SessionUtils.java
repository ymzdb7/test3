 package com.myoa.util.common.session;
 
 import com.myoa.util.common.StringUtils;

 import java.lang.reflect.Field;
 import java.lang.reflect.Method;
 import java.util.Enumeration;
 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.Map;
 import java.util.Map.Entry;
 import java.util.Set;
import javax.servlet.http.HttpSession;
 
 public class SessionUtils
 {
   public static void putSession(HttpSession session, Map<String, Object> params)
   {
     if (session == null)
       throw new SessionException("session is null");
     if ((params == null) || (params.size() == 0))
       return;
     for (Map.Entry entry : params.entrySet())
       session.setAttribute((String)entry.getKey(), entry.getValue());
   }
 
   public static void putSession(HttpSession session, Object obj)
   {
     if (session == null)
       throw new SessionException("session is null");
     if (obj == null)
       return;
     try {
       Field[] fields = Class.forName(obj.getClass().getName()).getDeclaredFields();
 
       for (int i = 0; i < fields.length; i++) {
         fields[i].setAccessible(true);
         session.setAttribute(fields[i].getName(), fields[i].get(obj));
       }
     }
     catch (Exception e) {
       e.printStackTrace();
       throw new SessionException("session is null");
     }
   }
 
   public static void putSession(HttpSession session, String key, Object value)
   {
     if (session == null)
       throw new SessionException("session is null");
     if (StringUtils.checkNull(key).booleanValue())
       throw new SessionException("key is null");
     session.setAttribute(key, value);
   }
 
   public static <T> T getSessionInfo(HttpSession session, String key, Class<T> clazz)
   {
     Object ret = null;
     Object value = session.getAttribute(key);
     if (value != null) ret = clazz.cast(value);
     return (T)ret;
   }
 
   public static Map<String, Object> getSessionInfo(HttpSession session, Set<String> keys)
   {
     Map map = new HashMap();
 
     Iterator iterator = keys.iterator();
     while (iterator.hasNext()) {
       String key = (String)iterator.next();
       Object value = session.getAttribute(key);
       if (value != null) map.put(key, value);
     }
     return map;
   }
 
   public static <T> T getSessionInfo(HttpSession session, Class<T> clazz, T deffault)
   {
     Object ret = null;
     if (deffault == null)
       return null;
     try {
       Field[] fields = Class.forName(clazz.getName()).getDeclaredFields();
       ret = clazz.cast(deffault);
       for (int i = 0; i < fields.length; i++) {
         fields[i].setAccessible(true);
         Method set_Method = clazz.getMethod("set" + getMethodName(fields[i].getName()), new Class[] { fields[i].getType() });
 
         set_Method.setAccessible(true);
         Object value = session.getAttribute(fields[i].getName());
         if (value != null) {
           set_Method.invoke(ret, new Object[] { value });
         }
       }
     }
     catch (Exception e)
     {
       e.printStackTrace();
       throw new SessionException("session is null");
     }
     return (T)ret;
   }
 
   public static void cleanUserSession(HttpSession session) {
     if (session == null) {
       throw new SessionException("session is null");
     }
 
     Enumeration enumeration = session.getAttributeNames();
 
     while (enumeration.hasMoreElements())
     {
       session.removeAttribute(((String)enumeration.nextElement()).toString());
     }
   }
 
   public static String getMethodName(String fildeName)
   {
     byte[] items = fildeName.getBytes();
     items[0] = (byte)((char)items[0] - 'a' + 65);
     return new String(items);
   }
 }

