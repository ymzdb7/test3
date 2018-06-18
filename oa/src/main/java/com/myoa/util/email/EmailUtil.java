 package com.myoa.util.email;
 
 import com.myoa.model.email.EmailBodyModel;
import com.myoa.model.email.Webmail;
import com.myoa.util.common.L;
import com.myoa.util.common.StringUtils;
import com.sun.net.ssl.internal.ssl.Provider;
 import java.io.File;
 import java.io.PrintStream;
 import java.security.Security;
 import java.util.Date;
 import java.util.Properties;
 import javax.activation.DataHandler;
 import javax.activation.DataSource;
 import javax.activation.FileDataSource;
 import javax.mail.Authenticator;
 import javax.mail.BodyPart;
 import javax.mail.Message;
 import javax.mail.Message.RecipientType;
 import javax.mail.MessagingException;
 import javax.mail.Multipart;
 import javax.mail.PasswordAuthentication;
 import javax.mail.Session;
 import javax.mail.Transport;
 import javax.mail.internet.AddressException;
 import javax.mail.internet.InternetAddress;
 import javax.mail.internet.MimeBodyPart;
 import javax.mail.internet.MimeMessage;
 import javax.mail.internet.MimeMultipart;
import sun.misc.BASE64Encoder;
 
 public class EmailUtil
 {
   public static Session webEmailLogin(Webmail webmail)
   {
     String host = webmail.getSmtpServer();
     String port = webmail.getSmtpPort().toString();
     final String username = webmail.getEmailUser();
     final String password = webmail.getEmailPass();
 
     Security.addProvider(new Provider());
     String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
     Properties props = System.getProperties();
 
     props.setProperty("mail.smtp.auth", "true");
     props.setProperty("mail.smtp.host", host);
     props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
     props.setProperty("mail.smtp.socketFactory.fallback", "false");
     if ((port.trim().equals("465")) || (host.trim().equals("smtp.qq.com"))) {
       props.setProperty("mail.smtp.port", port);
       props.setProperty("mail.smtp.socketFactory.port", port);
     } else {
       props.setProperty("mail.port", "25");
       props.setProperty("mail.smtp.socketFactory.port", "25");
     }
     Session session = Session.getInstance(props, new Authenticator()
     {
       protected PasswordAuthentication getPasswordAuthentication() {
         return new PasswordAuthentication(username,password);
       }
     });
     session.setDebug(true);
     return session;
   }
 
   public static boolean sendWEmail(Webmail webmail, EmailBodyModel emailBodyModel, String[] files)
   {
     boolean flag = false;
     Session session = webEmailLogin(webmail);
     try {
       Message message = new MimeMessage(session);
       message.setFrom(new InternetAddress(webmail.getEmail()));
 
       if (!StringUtils.checkNull(emailBodyModel.getToWebmail()).booleanValue()) {
         message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(emailBodyModel.getToWebmail()));
       }
 
       if (!StringUtils.checkNull(emailBodyModel.getSecretToWebmail()).booleanValue()) {
         message.addRecipients(Message.RecipientType.BCC, InternetAddress.parse(emailBodyModel.getSecretToWebmail()));
       }
 
       if (!StringUtils.checkNull(emailBodyModel.getCopyToWebmail()).booleanValue()) {
         message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(emailBodyModel.getCopyToWebmail()));
       }
       message.setSubject(emailBodyModel.getSubject());
 
       int len = files.length;
       if (len > 0)
       {
         message.addHeader("charset", "UTF-8");
         Multipart multipart = new MimeMultipart();
         BodyPart contentPart = new MimeBodyPart();
         contentPart.setText(emailBodyModel.getContent());
         contentPart.setHeader("Content-Type", "text/html; charset=UTF-8");
         multipart.addBodyPart(contentPart);
         for (String file : files) {
           File usFile = new File(file);
           MimeBodyPart fileBody = new MimeBodyPart();
           DataSource source = new FileDataSource(file);
           fileBody.setDataHandler(new DataHandler(source));
           BASE64Encoder enc = new BASE64Encoder();
           fileBody.setFileName("=?GBK?B?" + enc.encode(usFile.getName().getBytes()) + "?=");
 
           multipart.addBodyPart(fileBody);
         }
         message.setContent(multipart);
         message.setSentDate(new Date());
       } else {
         message.setContent(emailBodyModel.getContent(), "text/html;charset=utf-8");
       }
 
       Transport.send(message);
       flag = true;
     } catch (AddressException e) {
       L.e(new Object[] { "setFrom 地址错误：" + e });
     } catch (MessagingException e) {
       L.e(new Object[] { "setFrom 设置message错误：" + e });
     }
     return flag;
   }
 
   public static void main(String[] args)
   {
     Webmail webmail = new Webmail();
     webmail.setSmtpServer("smtp.163.com");
     webmail.setSmtpPort(Integer.valueOf(465));
     webmail.setEmailUser("wyq843209972@163.com");
     webmail.setEmailPass("woaini1122");
     webmail.setEmail("wyq843209972@163.com");
     EmailBodyModel emailBodyModel = new EmailBodyModel();
     emailBodyModel.setToWebmail("843209972@qq.com");
     emailBodyModel.setSubject("测试123131");
     emailBodyModel.setContent("测试是否可行！");
     boolean flag = sendWEmail(webmail, emailBodyModel, new String[0]);
     System.out.println(flag);
   }
 }

