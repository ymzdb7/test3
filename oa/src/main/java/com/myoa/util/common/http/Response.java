 package com.myoa.util.common.http;
 
 import java.io.PrintStream;
 import java.util.LinkedHashMap;
 import java.util.Map;
 
 public class Response
 {
   private int statusCode;
   private byte[] content;
   private Map<String, String> headers;
 
   public void setHeader(String name, String value)
   {
     if (this.headers == null) {
       this.headers = new LinkedHashMap();
     }
     this.headers.put(name, value);
   }
 
   public String getContentString(String encoding)
   {
     try
     {
       String contentString = new String(getContent(), encoding);
       return contentString;
     } catch (Exception e) {
       System.out.println("不支持编码");
     }
     return null;
   }
 
   public int getStatusCode() {
     return this.statusCode;
   }
 
   public void setStatusCode(int statusCode) {
     this.statusCode = statusCode;
   }
 
   public byte[] getContent() {
     return this.content;
   }
 
   public void setContent(byte[] content) {
     this.content = content;
   }
 
   public Map<String, String> getHeaders() {
     return this.headers;
   }
 
   public void setHeaders(Map<String, String> headers) {
     this.headers = headers;
   }
 }

