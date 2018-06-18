 package com.myoa.util.dingding;
 
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.io.OutputStreamWriter;
 import java.io.PrintStream;
 import java.net.URL;
 import javax.net.ssl.HttpsURLConnection;
 
 public class DingDingTool
 {
   public static String dingdingRequestGet(String dingUrl, String dingRequest)
   {
     BufferedReader in = null;
     StringBuilder result = new StringBuilder();
     try {
       URL url = new URL(new StringBuilder().append(dingUrl).append(dingRequest).toString());
       HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
       conn.setRequestMethod("GET");
       conn.connect();
 
       in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
       String line;
       while ((line = in.readLine()) != null)
         result.append(line);
     }
     catch (Exception ex) {
       ex.printStackTrace();
     } finally {
       try {
         if (in != null)
           in.close();
       }
       catch (IOException ex)
       {
         ex.printStackTrace();
       }
     }
     return result.toString();
   }
 
   public static String dingdingRequestPost(String dingUrl, String accessToken, String postData)
   {
     try {
       URL url = new URL(new StringBuilder().append(dingUrl).append(accessToken).toString());
       HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
       conn.setRequestMethod("POST");
 
       conn.setRequestProperty("Content-Type", "application/json");
 
       conn.setRequestProperty("Connection", "Keep-Alive");
 
       conn.setUseCaches(true);
       conn.setDoOutput(true);
 
       conn.setDoInput(true);
 
       conn.setRequestProperty("Content-Length", new StringBuilder().append("").append(postData.length()).toString());
       OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "utf-8");
 
       out.write(postData);
       out.flush();
       out.close();
 
       if (conn.getResponseCode() != 200) {
         System.out.println("connect failed!");
         return "";
       }
 
       String result = "";
       BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
       String line;
       while ((line = in.readLine()) != null) {
         result = new StringBuilder().append(result).append(line).append("\n").toString();
       }
       in.close();
       return result;
     } catch (IOException e) {
       e.printStackTrace(System.out);
     }
     return "";
   }
 }

