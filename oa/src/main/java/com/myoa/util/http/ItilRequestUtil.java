 package com.myoa.util.http;
 
 import com.myoa.util.JsonToProptyOrMapAndList;

 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 import java.io.PrintStream;
 import java.nio.charset.Charset;
 import java.text.SimpleDateFormat;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.Map;
 import org.apache.http.HttpEntity;
 import org.apache.http.HttpResponse;
 import org.apache.http.StatusLine;
 import org.apache.http.client.HttpClient;
 import org.apache.http.client.methods.HttpGet;
 import org.apache.http.client.methods.HttpPost;
 import org.apache.http.conn.ClientConnectionManager;
 import org.apache.http.entity.StringEntity;
 import org.apache.http.impl.client.DefaultHttpClient;
 import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
 
 public class ItilRequestUtil
 {
   public static String httpRequestPost(String userToString, String apiUrl)
     throws Exception
   {
     HttpClient httpClient = new DefaultHttpClient();
 
     int SO_TIMEOUT = 60000;
     HttpParams params = new BasicHttpParams();
     params.setIntParameter("http.socket.timeout", SO_TIMEOUT);
     HttpPost httpPost = new HttpPost(apiUrl);
     StringEntity stringEntity = new StringEntity(userToString, Charset.forName("UTF-8"));
     httpPost.setHeader("Content-Type", "application/json");
     httpPost.setHeader("accept", "application/json");
     httpPost.setEntity(stringEntity);
     HttpResponse response = httpClient.execute(httpPost);
     HttpEntity entity = response.getEntity();
     Integer stats = Integer.valueOf(response.getStatusLine().getStatusCode());
     StringBuffer sb = new StringBuffer();
     String nmae;
     if (stats.intValue() == 200) {
       BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent(), "utf-8"));
       String buffer = "";
       while ((buffer = reader.readLine()) != null) {
         sb.append(buffer);
       }
       reader.close();
       httpPost.releaseConnection();
       System.out.println("entity:" + sb.toString());
       httpClient.getConnectionManager().shutdown();
       nmae = sb.toString();
     } else {
       sb.append("{\"flag\":false,\"msg\":\"" + stats + "\",\"obj\":[]}");
     }
     return sb.toString();
   }
 
   public static String httpRequestGet(HashMap<String, Object> content, String apiUrl)
     throws Exception
   {
     HttpClient httpClient = new DefaultHttpClient();
 
     int SO_TIMEOUT = 60000;
     HttpParams params = new BasicHttpParams();
     params.setIntParameter("http.socket.timeout", SO_TIMEOUT);
     HttpGet httpGet = new HttpGet(apiUrl);
     httpGet.setHeader("Content-Type", "application/json");
     httpGet.setHeader("accept", "application/json");
     HttpResponse response = httpClient.execute(httpGet);
     HttpEntity entity = response.getEntity();
     Integer stats = Integer.valueOf(response.getStatusLine().getStatusCode());
     StringBuffer sb = new StringBuffer();
 
     if (stats.intValue() == 200) {
       System.out.println("StatusCode:" + response.getStatusLine().getStatusCode());
       BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));
       String buffer = "";
       while ((buffer = reader.readLine()) != null) {
         sb.append(buffer);
       }
       reader.close();
       httpGet.releaseConnection();
       httpClient.getConnectionManager().shutdown();
     } else {
       sb.append("{\"flag\":false,\"msg\":\"" + stats + "\",\"obj\":[]}");
     }
     return sb.toString();
   }
 
   public static void main(String[] args)
     throws Exception
   {
     String url = "http:127.0.0.1:8090webServiceTigger";
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     String userToString = "{\"format\":\"0\",\"fromId\":\"admin\",\"sendTime\":\"" + sdf.format(new Date()) + "\",\"subject\":\"法律咨询 2017-06-28 15:57:21\",\"content\":\"测试接口是否可行\",\"toId2\":\"\",\"flowId\":\"96\",\"flowPrcs\":\"1\"}";
     String obj = httpRequestPost(userToString, url);
     Map map = JsonToProptyOrMapAndList.returnMaps(obj);
     System.out.println(map.get("flag"));
     System.out.println(map.get("msg"));
   }
 }

