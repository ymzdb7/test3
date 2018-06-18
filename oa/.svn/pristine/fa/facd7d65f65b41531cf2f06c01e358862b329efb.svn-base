 package com.myoa.model.rms;
 
 import com.alibaba.fastjson.annotation.JSONField;
import com.myoa.model.enclosure.Attachment;

 import java.util.Date;
 import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
 
 public class RmsFileWithBLOBs extends RmsFile
 {
   private String attachmentId;
   private String attachmentName;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date sendDate2;
   private Integer roomId;
   private String filePage2;
   private String printPage2;
   private Integer delStatus;
   private String rollName;
   private List<Attachment> attachmentList;
   private String importStatus;
   private String secretName;
   private String urgencyName;
   private String fileTypeName;
   private String fileKindName;
 
   public String getSecretName()
   {
     if ("1".equals(getSecret()))
       return "普密";
     if ("4".equals(getSecret()))
       return "秘密";
     if ("3".equals(getSecret()))
       return "机密";
     if ("2".equals(getSecret())) {
       return "绝密";
     }
     return "";
   }
 
   public void setSecretName(String secretName)
   {
     this.secretName = secretName;
   }
 
   public String getUrgencyName() {
     if ("1".equals(getUrgency()))
       return "员工类型";
     if ("2".equals(getUrgency())) {
       return "普级";
     }
     return "";
   }
 
   public void setUrgencyName(String urgencyName)
   {
     this.urgencyName = urgencyName;
   }
 
   public String getFileTypeName() {
     if ("1".equals(getFileType()))
       return "公文";
     if ("2".equals(getFileType())) {
       return "资料";
     }
     return "";
   }
 
   public void setFileTypeName(String fileTypeName)
   {
     this.fileTypeName = fileTypeName;
   }
 
   public String getFileKindName() {
     if ("1".equals(getFileKind()))
       return "A";
     if ("2".equals(getFileKind()))
       return "B";
     if ("3".equals(getFileKind()))
       return "C";
     if ("4".equals(getFileKind())) {
       return "D";
     }
     return "";
   }
 
   public void setFileKindName(String fileKindName)
   {
     this.fileKindName = fileKindName;
   }
 
   public String getImportStatus() {
     return this.importStatus;
   }
 
   public void setImportStatus(String importStatus) {
     this.importStatus = importStatus;
   }
 
   public List<Attachment> getAttachmentList() {
     return this.attachmentList;
   }
 
   public void setAttachmentList(List<Attachment> attachmentList) {
     this.attachmentList = attachmentList;
   }
 
   public String getRollName() {
     return this.rollName;
   }
 
   public void setRollName(String rollName) {
     this.rollName = rollName;
   }
 
   public Integer getDelStatus() {
     return this.delStatus;
   }
 
   public void setDelStatus(Integer delStatus) {
     this.delStatus = delStatus;
   }
 
   public String getPrintPage2() {
     return this.printPage2;
   }
 
   public void setPrintPage2(String printPage2) {
     this.printPage2 = printPage2;
   }
 
   public String getFilePage2() {
     return this.filePage2;
   }
 
   public void setFilePage2(String filePage2) {
     this.filePage2 = filePage2;
   }
 
   public Integer getRoomId() {
     return this.roomId;
   }
 
   public void setRoomId(Integer roomId) {
     this.roomId = roomId;
   }
 
   public Date getSendDate2() {
     return this.sendDate2;
   }
 
   public void setSendDate2(Date sendDate2) {
     this.sendDate2 = sendDate2;
   }
 
   public String getAttachmentId()
   {
     return this.attachmentId;
   }
 
   public void setAttachmentId(String attachmentId)
   {
     this.attachmentId = (attachmentId == null ? null : attachmentId.trim());
   }
 
   public String getAttachmentName()
   {
     return this.attachmentName;
   }
 
   public void setAttachmentName(String attachmentName)
   {
     this.attachmentName = (attachmentName == null ? null : attachmentName.trim());
   }
 }

