 package com.myoa.util.common.http;
 
 import java.util.LinkedHashMap;
 import java.util.Map;
 
 public class Request
 {
   private Map<String, String> properties;
   private Map<String, String> params;
   private Map<String, String> headers;
   private byte[] postData;
   private boolean sync = false;
 
   public String getProperty(String property)
   {
     if (this.properties == null) {
       return null;
     }
     return (String)this.properties.get(property);
   }
 
   public void setProperty(String propery, String value)
   {
     if (this.properties == null) {
       this.properties = new LinkedHashMap();
     }
     this.properties.put(propery, value);
   }
 
   public void setParam(String param, String value)
   {
     if (this.params == null) {
       this.params = new LinkedHashMap();
     }
     this.params.put(param, value);
   }
 
   public Map<String, String> getHeaders() {
     return this.headers;
   }
 
   public void setHeader(String header, String value)
   {
     if (this.headers == null) {
       this.headers = new LinkedHashMap();
     }
     this.headers.put(header, value);
   }
 
   public Map<String, String> getParams() {
     return this.params;
   }
 
   public String getHeader(String header) {
     if (this.headers == null) {
       return null;
     }
     return (String)this.headers.get(header);
   }
   public Map<String, String> getProperties() {
     return this.properties;
   }
 
   public void setProperties(Map<String, String> properties) {
     this.properties = properties;
   }
 
   public void setParams(Map<String, String> params) {
     this.params = params;
   }
 
   public void setHeaders(Map<String, String> headers) {
     this.headers = headers;
   }
 
   public byte[] getPostData()
   {
     return this.postData;
   }
 
   public void setPostData(byte[] postData) {
     this.postData = postData;
   }
 
   public boolean isSync() {
     return this.sync;
   }
 
   public void setSync(boolean sync) {
     this.sync = sync;
   }
 }

