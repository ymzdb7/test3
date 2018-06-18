 package com.myoa.service.file;
 
 import com.myoa.util.common.StringUtils;

 import java.util.Map;
import org.apache.commons.collections.map.HashedMap;
 
 public class FileSortResetAuth
 {
   public Map<String, String> param;
 
   public Map<String, String> getParam()
   {
     return this.param;
   }
 
   public void setParam(Map<String, String> param) {
     this.param = param;
   }
 
   public FileSortResetAuth() {
     this.param = new HashedMap();
   }
 
   public FileSortResetAuth reset(String key, Map<String, String> mmp) {
     if (mmp == null) {
       return this;
     }
     StringBuffer stringBuffer = new StringBuffer();
 
     if (mmp.containsKey("dept")) {
       String deptstr = (String)mmp.get("dept");
       stringBuffer.append(deptstr);
       stringBuffer.append("|");
     } else {
       stringBuffer.append("|");
     }
     if (mmp.containsKey("role")) {
       String rolestr = (String)mmp.get("role");
       stringBuffer.append(rolestr);
       stringBuffer.append("|");
     } else {
       stringBuffer.append("|");
     }
     if (mmp.containsKey("user")) {
       String userStr = (String)mmp.get("user");
       stringBuffer.append(userStr);
     }
 
     if (mmp.containsKey("isExtends")) {
       String isExtends = (String)mmp.get("isExtends");
       this.param.put("isExtends", isExtends);
     }
 
     this.param.put(key, stringBuffer.toString());
     return this;
   }
   public static String[] getAuthBase(String resource) {
     if (StringUtils.checkNull(resource).booleanValue()) {
       return null;
     }
     return resource.split("\\|");
   }
 }

