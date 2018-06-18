 package com.myoa.service.sysUserPush;
 
 import com.myoa.util.ToJson;
import com.myoa.util.sysUserPush.SysUserPush;
import com.tencent.xinge.XingeApp;
 import java.util.HashMap;
 import java.util.Map;
import org.json.JSONObject;
 
 public class SysUserPushSerive extends SysUserPush
 {
   public JSONObject pushTokenAndroid(int accessId, String secretKey, String title, String content, String token)
   {
     return XingeApp.pushTokenAndroid(accessId, secretKey, title, content, token);
   }
 
   public JSONObject pushAccountAndroid(long accessId, String secretKey, String title, String content, String account)
   {
     return XingeApp.pushAccountAndroid(accessId, secretKey, title, content, account);
   }
 
   public ToJson pushAccountAndroidSum(Long accessId, String secretKey, String title, String content, String[] account)
     throws Exception
   {
     ToJson json = new ToJson();
     int countYes = 0; int countNo = 0; int count = 0;
     for (int i = 0; i < account.length; i++) {
       JSONObject jsonObject = XingeApp.pushAccountAndroid(accessId.longValue(), secretKey, title, content, account[i]);
       if (jsonObject.get("ret_code").equals("0"))
         countYes++;
       else {
         countNo++;
       }
     }
     count = account.length;
     Map[] map = new Map[3];
     map[1] = new HashMap();
     map[1].put("countYes", Integer.valueOf(countYes));
     map[2] = new HashMap();
     map[2].put("countNo", Integer.valueOf(countNo));
     map[3] = new HashMap();
     map[3].put("count", Integer.valueOf(count));
     json.setObject(map);
     return json;
   }
 
   public JSONObject pushAllAndroid(int accessId, String secretKey, String title, String content)
   {
     return XingeApp.pushAllAndroid(accessId, secretKey, title, content);
   }
 
   public JSONObject pushTagAndroid(int accessId, String secretKey, String title, String content, String tag)
   {
     return XingeApp.pushTagAndroid(accessId, secretKey, title, content, tag);
   }
 
   public JSONObject pushTokenIos(int accessId, String secretKey, String content, String token, int environment)
   {
     return XingeApp.pushTokenIos(accessId, secretKey, content, token, environment);
   }
 
   public JSONObject pushAccountIos(long accessId, String secretKey, String content, String account, int environment)
   {
     return XingeApp.pushAccountIos(accessId, secretKey, content, account, environment);
   }
 
   public JSONObject pushAllIos(int accessId, String secretKey, String content, int environment)
   {
     return XingeApp.pushAllIos(accessId, secretKey, content, environment);
   }
 
   public JSONObject pushTagIos(int accessId, String secretKey, String content, String tag, int environment)
   {
     return XingeApp.pushTagIos(accessId, secretKey, content, tag, environment);
   }
 }
