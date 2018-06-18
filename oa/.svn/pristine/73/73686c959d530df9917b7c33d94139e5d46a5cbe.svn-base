 package com.myoa.service.documentOrg;
 
 import com.myoa.dao.documentOrg.DocumentOrgMapper;
import com.myoa.dao.enclosure.AttachmentMapper;
import com.myoa.model.document.DocumentModelWithBLOBs;
import com.myoa.model.documentOrg.DocumentOrg;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.users.Users;
import com.myoa.service.document.DocumentSerivce;
import com.myoa.util.Constant;
import com.myoa.util.DateFormat;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ModuleEnum;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.dataSource.ContextHolder;
import com.myoa.util.page.PageParams;

 import java.io.File;
 import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.text.SimpleDateFormat;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.ResourceBundle;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class DocumentOrgService
 {
 
   @Autowired
   DocumentOrgMapper documentOrgMapper;
 
   @Autowired
   DocumentSerivce documentSerivce;
 
   @Autowired
   AttachmentMapper attachmentMapper;
 
   public ToJson<Object> saveToDocument(HttpServletRequest request, Integer id, Integer flowId, String documentType)
   {
     ToJson<Object> json = new ToJson<Object>();
     try {
       Users nowUser = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
 
       DocumentModelWithBLOBs documentModelWithBLOBs = this.documentOrgMapper.selDocumentOrgById(id);
       documentModelWithBLOBs.setDocumentType(documentType);
       documentModelWithBLOBs.setFlowId(flowId);
       documentModelWithBLOBs.setCreater(nowUser.getUserId());
       documentModelWithBLOBs.setCurUserId(nowUser.getUserId());
       documentModelWithBLOBs.setCreater(nowUser.getUserId());
       documentModelWithBLOBs.setCreateDept(nowUser.getDeptId().toString());
       String cureTime = DateFormat.getCurrentTime2();
       documentModelWithBLOBs.setPrintDate(cureTime);
       if (documentModelWithBLOBs != null) {
         json = this.documentSerivce.saveDocument(nowUser, flowId, Integer.valueOf(1), "1", documentModelWithBLOBs.getTitle(), documentModelWithBLOBs, request);
 
         this.documentOrgMapper.updateTransferFlag(id, Integer.valueOf(1));
       }
 
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<DocumentOrg> selDocumentOrg(DocumentOrg documentOrg, HttpServletRequest request, PageParams pageParams)
   {
     ToJson<DocumentOrg> json = new ToJson<DocumentOrg>();
     try {
       Map<String,Object> map = new HashMap<String,Object>();
       map.put("page", pageParams);
       List<DocumentOrg> documentOrgs = this.documentOrgMapper.selDocumentOrg(map);
       json.setTotleNum(pageParams.getTotal());
       json.setObj(documentOrgs);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err:" + e);
       json.setFlag(1);
     }
     return json;
   }
 
   public ToJson<DocumentOrg> saveDoc(Integer id, DocumentOrg documentOrg, HttpServletRequest request)
   {
     ToJson<DocumentOrg> json = new ToJson<DocumentOrg>();
     try {
       DocumentOrg oldDocumentOrg = this.documentOrgMapper.selOldDocById(id);
 
       String firstDBSource = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
       Users nowUser = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
 
       oldDocumentOrg.setOrgFlag(Integer.valueOf(1));
       oldDocumentOrg.setTransferFlag(Integer.valueOf(0));
 
       oldDocumentOrg.setTransferOrg(firstDBSource.replace(Constant.MYOA, ""));
       oldDocumentOrg.setTransferUser(nowUser.getUserId());
 
       oldDocumentOrg.setTransferReceiveOrg(documentOrg.getTransferReceiveOrg());
       oldDocumentOrg.setTransferReceiveUser(documentOrg.getTransferReceiveUser());
 
       oldDocumentOrg.setTransferTime(new Date());
 
       this.documentOrgMapper.insertSelective(oldDocumentOrg);
 
       oldDocumentOrg.setOrgFlag(Integer.valueOf(0));
 
       if (!StringUtils.checkNull(oldDocumentOrg.getTransferReceiveOrg()).booleanValue()) {
         String[] split = oldDocumentOrg.getTransferReceiveOrg().split(",");
         for (String loginId : split)
         {
           String dbSource = Constant.MYOA + loginId;
           if (firstDBSource.equals(dbSource))
             continue;
           copyWordAndAIPFile(oldDocumentOrg, firstDBSource, dbSource);
 
           ContextHolder.setConsumerType(dbSource);
 
           this.documentOrgMapper.insertSelective(oldDocumentOrg);
         }
 
         ContextHolder.setConsumerType(firstDBSource);
       }
 
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err:" + e);
       json.setFlag(1);
     }
     return json;
   }
 
   private void copyWordAndAIPFile(DocumentOrg documentOrg, String firstDBSource, String dbSource)
     throws IOException
   {
     ResourceBundle rb = ResourceBundle.getBundle("upload");
     String osName = System.getProperty("os.name");
     StringBuffer sb = new StringBuffer();
     if (osName.toLowerCase().startsWith("win"))
       sb = sb.append(rb.getString("upload.win"));
     else {
       sb = sb.append(rb.getString("upload.linux"));
     }
 
     if ((!StringUtils.checkNull(documentOrg.getMainFile()).booleanValue()) && (!StringUtils.checkNull(documentOrg.getMainFileName()).booleanValue())) {
       List<Attachment> attachments = GetAttachmentListUtil.returnAttachment(documentOrg.getMainFileName(), documentOrg.getMainFile(), firstDBSource, "document");
       if ((attachments != null) && (attachments.size() > 0)) {
         Attachment attachment = (Attachment)attachments.get(0);
 
         String path = sb.toString() + System.getProperty("file.separator") + "attach" + System.getProperty("file.separator") + firstDBSource + System.getProperty("file.separator") + "document" + System.getProperty("file.separator") + attachment.getYm() + System.getProperty("file.separator") + attachment.getAttachId() + "." + attachment.getAttachName();
 
         File file = new File(path);
 
         if (!file.exists()) {
           documentOrg.setMainFile("");
           documentOrg.setMainFileName("");
         } else {
           int attachID = Math.abs((int)System.currentTimeMillis());
 
           String ym = new SimpleDateFormat("yyMM").format(new Date());
 
           int moduleID = 0;
           for (ModuleEnum em : ModuleEnum.values()) {
             if (em.getName().equals("document")) {
               moduleID = em.getIndex();
             }
           }
 
           byte mid = (byte)moduleID;
 
           Attachment attachment1 = new Attachment();
 
           attachment1 = new Attachment();
           attachment1.setAttachId(Integer.valueOf(attachID));
           attachment1.setModule(Byte.valueOf(mid));
           attachment1.setAttachFile(attachment.getAttachName());
           attachment1.setAttachName(attachment.getAttachName());
           attachment1.setYm(ym);
           attachment1.setAttachSign(new Long(0L));
           attachment1.setDelFlag(Byte.valueOf((byte) 0));
           attachment1.setPosition(Byte.valueOf((byte) 2));
           attachment1.setIsImage(Byte.valueOf((byte) 0));
           attachment1.setFileSize(String.valueOf(file.length()));
           attachment1.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
 
           ContextHolder.setConsumerType(dbSource);
           this.attachmentMapper.insertSelective(attachment1);
           ContextHolder.setConsumerType(firstDBSource);
 
           String toPath = sb.toString() + System.getProperty("file.separator") + "attach" + System.getProperty("file.separator") + dbSource + System.getProperty("file.separator") + "document" + System.getProperty("file.separator") + attachment1.getYm();
 
           File file1 = new File(toPath);
 
           if (!file1.exists()) {
             file1.mkdirs();
           }
           copyFile(path, toPath + System.getProperty("file.separator") + attachment1.getAttachId() + "." + attachment1.getAttachName());
           documentOrg.setMainFile(attachment1.getAid() + "@" + attachment1.getYm() + "_" + attachment1.getAttachId());
         }
       }
     }
 
     if ((!StringUtils.checkNull(documentOrg.getMainAipFile()).booleanValue()) && (!StringUtils.checkNull(documentOrg.getMainAipFileName()).booleanValue())) {
       List<Attachment>  attachments = GetAttachmentListUtil.returnAttachment(documentOrg.getMainAipFileName(), documentOrg.getMainAipFile(), firstDBSource, "document");
       if ((attachments != null) && (attachments.size() > 0)) {
         Attachment attachment = (Attachment)attachments.get(0);
 
         String path = sb.toString() + System.getProperty("file.separator") + "attach" + System.getProperty("file.separator") + firstDBSource + System.getProperty("file.separator") + "document" + System.getProperty("file.separator") + attachment.getYm() + System.getProperty("file.separator") + attachment.getAttachId() + "." + attachment.getAttachName();
 
         File file = new File(path);
 
         if (!file.exists()) {
           documentOrg.setMainAipFile("");
           documentOrg.setMainAipFileName("");
         } else {
           int attachID = Math.abs((int)System.currentTimeMillis());
 
           String ym = new SimpleDateFormat("yyMM").format(new Date());
 
           int moduleID = 0;
           for (ModuleEnum em : ModuleEnum.values()) {
             if (em.getName().equals("document")) {
               moduleID = em.getIndex();
             }
           }
 
           byte mid = (byte)moduleID;
 
           Attachment attachment1 = new Attachment();
 
           attachment1 = new Attachment();
           attachment1.setAttachId(Integer.valueOf(attachID));
           attachment1.setModule(Byte.valueOf(mid));
           attachment1.setAttachFile(attachment.getAttachName());
           attachment1.setAttachName(attachment.getAttachName());
           attachment1.setYm(ym);
           attachment1.setAttachSign(new Long(0L));
           attachment1.setDelFlag(Byte.valueOf((byte) 0));
           attachment1.setPosition(Byte.valueOf((byte) 2));
           attachment1.setIsImage(Byte.valueOf((byte) 0));
           attachment1.setFileSize(String.valueOf(file.length()));
           attachment1.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
 
           ContextHolder.setConsumerType(dbSource);
           this.attachmentMapper.insertSelective(attachment1);
           ContextHolder.setConsumerType(firstDBSource);
 
           String toPath = sb.toString() + System.getProperty("file.separator") + "attach" + System.getProperty("file.separator") + dbSource + System.getProperty("file.separator") + "document" + System.getProperty("file.separator") + attachment1.getYm();
 
           File file1 = new File(toPath);
 
           if (!file1.exists()) {
             file1.mkdirs();
           }
           copyFile(path, toPath + System.getProperty("file.separator") + attachment1.getAttachId() + "." + attachment1.getAttachName());
           documentOrg.setMainAipFile(attachment1.getAid() + "@" + attachment1.getYm() + "_" + attachment1.getAttachId());
         }
       }
     }
   }
 
   public void copyFile(String from, String to)
     throws IOException
   {
     FileInputStream ins = new FileInputStream(new File(from));
     FileOutputStream out = new FileOutputStream(new File(to));
     byte[] b = new byte[1024];
     int n = 0;
     while ((n = ins.read(b)) != -1) {
       out.write(b, 0, n);
     }
 
     ins.close();
     out.close();
   }
 }

