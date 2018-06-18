 package com.myoa.util;
 
 import java.util.HashMap;
 import java.util.Map;
 import java.util.ResourceBundle;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
 
 public class DBPropertiesUtils
 {
   public static Map<String, String> getDbMsg(HttpServletRequest request)
   {
     String db = (String)request.getSession().getAttribute("loginDateSouse");
 
     String ip = "";
     String username = "";
     String password = "";
     ResourceBundle rb = ResourceBundle.getBundle("jdbc-sql");
     String string = rb.getString("url" + db);
     String[] urlArr = string.split(":");
     String url = urlArr[2];
     url = url.substring(2, url.length());
     ip = url;
     username = rb.getString("uname" + db);
     password = rb.getString("password" + db);
     Map map = new HashMap();
     map.put("ip", ip);
     map.put("username", username);
     map.put("password", password);
     return map;
   }
 }

