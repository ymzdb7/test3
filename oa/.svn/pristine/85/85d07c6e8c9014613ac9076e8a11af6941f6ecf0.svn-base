 package com.myoa.service.enclosure.impl;
 
 import com.myoa.dao.enclosure.AttachmentMapper;
import com.myoa.model.enclosure.Attachment;
import com.myoa.service.enclosure.EnclosureService;
import com.myoa.util.Constant;
import com.myoa.util.Convert;
import com.myoa.util.ModuleEnum;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;

 import java.io.File;
 import java.io.UnsupportedEncodingException;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.Date;
 import java.util.List;
 import java.util.ResourceBundle;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.stereotype.Service;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.context.request.RequestContextHolder;
 import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class EnclosureServiceImpl
   implements EnclosureService
 {
 
   @Resource
   AttachmentMapper attachmentMapper;
 
   public void saveAttachment(Attachment attachment)
   {
     this.attachmentMapper.insertSelective(attachment);
   }
 
   public Attachment findByAttachId(int attachId)
   {
     Attachment a = this.attachmentMapper.findByAttachId(attachId);
     return a;
   }
 
   public Attachment findByLast()
   {
     Attachment att = this.attachmentMapper.findByLast();
     return att;
   }
 
   public List<Attachment> uploadReturn(MultipartFile[] files, String company, String module)
   {
     if (files.length == 0) {
       return null;
     }
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
 
     HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
     if (StringUtils.checkNull(sb.toString()).booleanValue()) {
       String a = request.getRealPath("");
       sb.append(a);
       sb.append(System.getProperty("file.separator")).append("attach").append(System.getProperty("file.separator")).append(company).append(System.getProperty("file.separator")).append(module).append(System.getProperty("file.separator")).append(ym);
     }
     else
     {
       sb.append(System.getProperty("file.separator")).append("attach").append(System.getProperty("file.separator")).append(company).append(System.getProperty("file.separator")).append(module).append(System.getProperty("file.separator")).append(ym);
     }
 
     String path = sb.toString();
     Attachment attachment = new Attachment();
     for (int i = 0; i < files.length; i++) {
       MultipartFile file = files[i];
       Long filesize = Long.valueOf(file.getSize());
       if (file.isEmpty())
         continue;
       String fileName = file.getOriginalFilename().trim();
 
       int attachID = Math.abs((int)System.currentTimeMillis());
       StringBuffer s = new StringBuffer();
       if (os.toLowerCase().startsWith("win"))
         s = s.append(fileName);
       else {
         try {
           s = s.append(new String(fileName.getBytes(), "UTF-8"));
         } catch (UnsupportedEncodingException e) {
           e.printStackTrace();
         }
       }
       String newFileName = Integer.toString(attachID) + "." + fileName.toString();
 
       if (!file.isEmpty()) {
         try {
           if (!new File(path, newFileName).exists()) {
             new File(path, newFileName).mkdirs();
           }
 
           file.transferTo(new File(path, newFileName));
         } catch (Exception e) {
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
       attachment.setIsImage(Byte.valueOf(isImg));
 
       attachment.setFileSize(Convert.convertFileSize(filesize.longValue()));
       attachment.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
       list.add(attachment);
       try {
         Thread.sleep(17L);
       } catch (InterruptedException e) {
         e.printStackTrace();
       }
     }
 
     return list;
   }
 
   public String attachmenturl(Attachment att, String company, String module)
   {
     String attUrl = "AID=" + att.getAid() + "&" + "MODULE=" + module + "&" + "YM=" + att.getYm() + "&" + "ATTACHMENT_ID=" + att.getAttachId() + "&" + "ATTACHMENT_NAME=" + att.getAttachName();
     return attUrl;
   }
 
   public List<Attachment> upload(MultipartFile[] files, String company, String module) throws UnsupportedEncodingException {
     List<Attachment> list = uploadReturn(files, company, module);
     List attachmentList = new ArrayList();
     for (Attachment attachment : list) {
       attachment.setSize(attachment.getFileSize());
       saveAttachment(attachment);
       String attUrl = "AID=" + attachment.getAid() + "&" + "MODULE=" + module + "&" + "COMPANY=" + company + "&" + "YM=" + attachment.getYm() + "&" + "ATTACHMENT_ID=" + attachment.getAttachId() + "&" + "ATTACHMENT_NAME=" + attachment.getAttachName() + "&" + "FILESIZE=" + attachment.getFileSize();
 
       attachment.setAid(attachment.getAid());
       attachment.setAttUrl(attUrl);
       attachmentList.add(attachment);
     }
     return attachmentList;
   }
 
   public ToJson delete(@RequestParam("AID") String aid, @RequestParam("MODULE") String module, @RequestParam("YM") String ym, @RequestParam("ATTACHMENT_ID") String attachmentId, @RequestParam("ATTACHMENT_NAME") String attachmentName, @RequestParam("COMPANY") String company, HttpServletResponse response, HttpServletRequest request)
   {
     ToJson tj = new ToJson();
     ResourceBundle rb = ResourceBundle.getBundle("upload");
 
     String osName = System.getProperty("os.name");
     StringBuffer sb = new StringBuffer();
     if (osName.toLowerCase().startsWith("win"))
       sb = sb.append(rb.getString("upload.win"));
     else {
       sb = sb.append(rb.getString("upload.linux"));
     }
 
     String path = sb.toString() + System.getProperty("file.separator") + "attach" + System.getProperty("file.separator") + company + System.getProperty("file.separator") + module + System.getProperty("file.separator") + ym + System.getProperty("file.separator") + attachmentId + "." + attachmentName;
 
     boolean flag = false;
     File file = new File(path);
     if (file.exists()) {
       file.delete();
       flag = true;
     }
     if (!flag) {
       tj.setFlag(0);
       tj.setMsg("OK");
     } else {
       tj.setFlag(1);
       tj.setMsg("false");
     }
     return tj;
   }
 
   public ToJson<Attachment> selectByPrimaryKey(Integer aid, String module, HttpServletRequest request)
   {
     ToJson json = new ToJson();
     String company = Constant.MYOA + (String)SessionUtils.getSessionInfo(request.getSession(), "loginDateSouse", String.class);
     try {
       Attachment attachment = this.attachmentMapper.selectByPrimaryKey(aid);
       String attUrl = "AID=" + attachment.getAid() + "&" + "MODULE=" + module + "&" + "COMPANY=" + company + "&" + "YM=" + attachment.getYm() + "&" + "ATTACHMENT_ID=" + attachment.getAttachId() + "&" + "ATTACHMENT_NAME=" + attachment.getAttachName() + "&" + "FILESIZE=" + attachment.getFileSize();
 
       attachment.setAttUrl(attUrl);
       json.setObject(attachment);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 }

