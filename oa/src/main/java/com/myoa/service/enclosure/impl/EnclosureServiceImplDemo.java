 package com.myoa.service.enclosure.impl;
 
 import com.myoa.dao.enclosure.AttachmentMapper;
import com.myoa.model.enclosure.Attachment;
import com.myoa.service.enclosure.EnclosureServiceDemo;
import com.myoa.util.ModuleEnum;

 import java.io.File;
 import java.io.UnsupportedEncodingException;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.Date;
 import java.util.List;
 import java.util.ResourceBundle;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class EnclosureServiceImplDemo
   implements EnclosureServiceDemo
 {
 
   @Resource
   AttachmentMapper attachmentMapper;
 
   public Attachment upload(File file, String company, String module)
     throws UnsupportedEncodingException
   {
     ResourceBundle rb = ResourceBundle.getBundle("upload");
     String os = System.getProperty("os.name");
     StringBuffer sb = new StringBuffer();
     if (os.toLowerCase().startsWith("win"))
       sb = sb.append(rb.getString("upload.win"));
     else {
       sb = sb.append(rb.getString("upload.linux"));
     }
     List list = new ArrayList();
 
     String ym = new SimpleDateFormat("yyMM").format(new Date());
 
     String path = sb.toString() + System.getProperty("file.separator") + "attach" + System.getProperty("file.separator") + company + System.getProperty("file.separator") + module + System.getProperty("file.separator") + ym;
 
     Attachment attachment = new Attachment();
 
     if (file.exists())
     {
       String fileName = file.getName();
 
       int attachID = Math.abs((int)System.currentTimeMillis());
       StringBuffer s = new StringBuffer();
       if (os.toLowerCase().startsWith("win"))
         s = s.append(fileName);
       else {
         s = s.append(new String(fileName.getBytes(), "UTF-8"));
       }
       String newFileName = Integer.toString(attachID) + "." + fileName.toString();
 
       if (!file.exists()) {
         try {
           if (!new File(path, newFileName).exists()) {
             new File(path, newFileName).mkdirs();
           }
         }
         catch (Exception e)
         {
           e.printStackTrace();
         }
       }
 
       File f = new File(path + newFileName);
       f.renameTo(new File(newFileName));
       byte isImg = 3;
 
       String type = fileName.substring(fileName.indexOf(".") + 1);
       String[] imagType = { "jpg", "png", "bmp", "gif", "JPG", "PNG", "BMP", "GIF" };
       List imageTyepLists = Arrays.asList(imagType);
       if (imageTyepLists.contains(type))
         isImg = 0;
       else {
         isImg = 1;
       }
       byte a = 0;
       byte b = 2;
 
       int moduleID = 0;
       for (ModuleEnum em : ModuleEnum.values()) {
         if (em.getName().equals(module.trim())) {
           moduleID = em.getIndex();
         }
       }
 
       byte mid = (byte)moduleID;
       attachment = new Attachment();
       attachment.setAttachId(Integer.valueOf(attachID));
       attachment.setModule(Byte.valueOf(mid));
       attachment.setAttachFile(fileName);
       attachment.setAttachName(fileName);
       attachment.setYm(ym);
       attachment.setAttachSign(new Long(0L));
       attachment.setDelFlag(Byte.valueOf(a));
       attachment.setPosition(Byte.valueOf(b));
       this.attachmentMapper.insertSelective(attachment);
       attachment = findByLast();
       String attUrl = "AID=" + attachment.getAid() + "&" + "MODULE=" + module + "&" + "COMPANY=" + company + "&" + "YM=" + attachment.getYm() + "&" + "ATTACHMENT_ID=" + attachment.getAttachId() + "&" + "ATTACHMENT_NAME=" + attachment.getAttachName();
       attachment.setAttUrl(attUrl);
       String url = path + System.getProperty("file.separator") + file.getName().trim();
       attachment.setUrl(url);
       attachment.setIsImage(Byte.valueOf(isImg));
     }
 
     return attachment;
   }
 
   public Attachment findByLast()
   {
     Attachment att = this.attachmentMapper.findByLast();
     return att;
   }
 }
