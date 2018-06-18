 package com.myoa.util.treeUtil;
 
 import com.myoa.util.common.StringUtils;

 import java.io.IOException;
 import java.io.PrintWriter;
 import javax.servlet.http.HttpServletResponse;
import org.json.JSONException;
 
 public class HtmlUtil
 {
   public static void writerJson(HttpServletResponse response, String jsonStr)
   {
     writer(response, jsonStr);
   }
 
   public static void writerJson(HttpServletResponse response, Object object) {
     try {
       response.setCharacterEncoding("UTF-8");
       response.setContentType("application/json");
       writer(response, JSONUtil.toJSONString(object));
     } catch (JSONException e) {
       e.printStackTrace();
     }
   }
 
   public static void writerHtml(HttpServletResponse response, String htmlStr)
   {
     writer(response, htmlStr);
   }
 
   private static void writer(HttpServletResponse response, String str) {
     try {
       StringBuffer result = new StringBuffer();
 
       response.setHeader("Pragma", "No-cache");
       response.setHeader("Cache-Control", "no-cache");
       response.setContentType("text/html; charset=utf-8");
       PrintWriter out = null;
       out = response.getWriter();
 
       if (StringUtils.checkNull(str).booleanValue()) {
         str = "0";
       }
       out.print(str);
       out.flush();
       out.close();
     } catch (IOException e) {
       e.printStackTrace();
     }
   }
 }

