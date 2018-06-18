 package com.myoa.service.ThreadSerivice;
 
 import com.myoa.util.sendUtil.send;

 import java.io.PrintStream;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;
 
 @Service
 public class SendThreadService
 {
 
   @Autowired
   ThreadPoolTaskExecutor threadPoolTaskExecutor;
 
   public void sendSms(StringBuffer mobileString, StringBuffer contextString, String protocol, String host, String port, String username, String pwd, String content_field, String code, String mobile, String time_content, String sign, String location, String extend_1, String extend_2, String extend_3, String extend_4, String extend_5, String startTime)
   {
     this.threadPoolTaskExecutor.execute(new Runnable()
     {
       public void run() {
         try {
           //send.doPost(this.val$mobileString, this.val$contextString, this.val$protocol, this.val$host, this.val$port, this.val$username, this.val$pwd, this.val$content_field, this.val$code, this.val$mobile, this.val$time_content, this.val$sign, this.val$location, this.val$extend_1, this.val$extend_2, this.val$extend_3, this.val$extend_4, this.val$extend_5, this.val$startTime);
         }
         catch (Exception e)
         {
           e.printStackTrace();
         }
       }
     });
   }
 }
