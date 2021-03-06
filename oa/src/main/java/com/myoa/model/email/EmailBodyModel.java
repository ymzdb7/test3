 package com.myoa.model.email;
 
 import com.alibaba.fastjson.annotation.JSONField;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.users.Users;
import com.myoa.util.DateFormat;

 import java.io.Serializable;
 import java.util.Date;
 import java.util.List;
import java.util.Map;
 
 public class EmailBodyModel
   implements Serializable
 {
   private static final long serialVersionUID = 1076969159692234636L;
   private String probablyDate;
   private Integer startTime;
   private Integer endTime;
   private String firstFlag;
   private String secondFlag;
   private Users users;
   private Integer bodyId;
   private String fromId;
   private String subject;
   private Integer sendTime;
   private String sendFlag;
   private String smsRemind;
   private String important;
   private Long size;
   private Integer fromWebmailId;
   private String fromWebmail;
   private String webmailFlag;
   private String recvFromName;
   private String recvFrom;
   private Integer recvToId;
   private String recvTo;
   private String isWebmail;
   private String isWf;
   private String keyword;
   private Integer secretLevel;
   private String auditMan;
   private String toId2;
   private String toName;
   private String copyToId;
   private String copyName;
   private String secretToId;
   private String secretToName;
   private String content;
   private String attachmentId;
   private String attachmentName;
   private String toWebmail;
   private byte[] compressContent;
   private byte[] webmailContent;
   private String auditRemark;
   private String copyToWebmail;
   private String secretToWebmail;
   private String praise;
   private List<EmailModel> emailList;
   private List<Attachment> attachment;
   private List<Webmail> webmailList;
   private EmailBoxModel emailBoxModel;
   private String fromUserId;
   private String orderByName;
   private String orderWhere;
   private String searchCriteria;
   public List<EmailModel> toUserEmailInfo;
   public List<EmailModel> copyUserEmailInfo;
   public List<EmailModel> sercUserEmailInfo;
   private String deptName;
   private Integer draftsCount;
   private Integer HairboxCount;
   private Date sendTimes;
   private String Months;
   private Integer count1;
   private Integer count2;
   private Integer count3;
   private Integer count4;
   private Integer count5;
   private Integer count6;
   private Integer count7;
   private Integer count8;
   private Integer count9;
   private Integer count10;
   private Integer count11;
   private Integer count12;
   List<Attachment> attachmentList;
   Map<String, String> map;
   private String smsDefault;
 
   public String getDeptName()
   {
     return this.deptName;
   }
 
   public void setDeptName(String deptName) {
     this.deptName = deptName;
   }
 
   public List<EmailModel> getSercUserEmailInfo()
   {
     return this.sercUserEmailInfo;
   }
 
   public void setSercUserEmailInfo(List<EmailModel> sercUserEmailInfo) {
     this.sercUserEmailInfo = sercUserEmailInfo;
   }
 
   public List<EmailModel> getToUserEmailInfo() {
     return this.toUserEmailInfo;
   }
 
   public void setToUserEmailInfo(List<EmailModel> toUserEmailInfo) {
     this.toUserEmailInfo = toUserEmailInfo;
   }
 
   public List<EmailModel> getCopyUserEmailInfo() {
     return this.copyUserEmailInfo;
   }
 
   public void setCopyUserEmailInfo(List<EmailModel> copyUserEmailInfo) {
     this.copyUserEmailInfo = copyUserEmailInfo;
   }
 
   public List<EmailModel> getEmailList()
   {
     return this.emailList;
   }
 
   public void setEmailList(List<EmailModel> emailList)
   {
     this.emailList = emailList;
   }
 
   public String getToId2()
   {
     return this.toId2 == null ? "" : this.toId2.trim();
   }
 
   public void setToId2(String toId2)
   {
     this.toId2 = toId2;
   }
 
   public String getCopyToId()
   {
     return this.copyToId == null ? "" : this.copyToId.trim();
   }
 
   public void setCopyToId(String copyToId)
   {
     this.copyToId = copyToId;
   }
 
   public String getSecretToId()
   {
     return this.secretToId == null ? "" : this.secretToId.trim();
   }
 
   public void setSecretToId(String secretToId)
   {
     this.secretToId = secretToId;
   }
 
   public Users getUsers()
   {
     return this.users;
   }
 
   public void setUsers(Users users)
   {
     this.users = users;
   }
 
   public Integer getStartTime()
   {
     return this.startTime;
   }
 
   public void setStartTime(Integer startTime)
   {
     this.startTime = startTime;
   }
 
   public Integer getEndTime()
   {
     return this.endTime;
   }
 
   public void setEndTime(Integer endTime)
   {
     this.endTime = endTime;
   }
 
   public String getContent()
   {
     return this.content == null ? "" : this.content.trim();
   }
 
   public void setContent(String content)
   {
     this.content = content;
   }
 
   public String getAttachmentId()
   {
     return this.attachmentId == null ? "" : this.attachmentId.trim();
   }
 
   public void setAttachmentId(String attachmentId)
   {
     this.attachmentId = attachmentId;
   }
 
   public String getAttachmentName()
   {
     return this.attachmentName == null ? "" : this.attachmentName.trim();
   }
 
   public void setAttachmentName(String attachmentName)
   {
     this.attachmentName = attachmentName;
   }
 
   public void setRecvFromName(String recvFromName)
   {
     this.recvFromName = recvFromName;
   }
 
   public String getRecvFromName()
   {
     return this.recvFromName == null ? "" : this.recvFromName.trim();
   }
 
   public void From(String recvFromName)
   {
     this.recvFromName = (recvFromName == null ? "" : recvFromName.trim());
   }
 
   public String getToWebmail()
   {
     return this.toWebmail == null ? "" : this.toWebmail.trim();
   }
 
   public void setToWebmail(String toWebmail)
   {
     this.toWebmail = toWebmail;
   }
 
   public byte[] getCompressContent()
   {
     return this.compressContent == null ? new byte[0] : this.compressContent;
   }
 
   public void setCompressContent(byte[] compressContent)
   {
     this.compressContent = compressContent;
   }
 
   public byte[] getWebmailContent()
   {
     return this.webmailContent == null ? new byte[0] : this.webmailContent;
   }
 
   public void setWebmailContent(byte[] webmailContent)
   {
     this.webmailContent = webmailContent;
   }
 
   public String getAuditRemark()
   {
     return this.auditRemark == null ? "" : this.auditRemark.trim();
   }
 
   public void setAuditRemark(String auditRemark)
   {
     this.auditRemark = auditRemark;
   }
 
   public String getCopyToWebmail()
   {
     return this.copyToWebmail == null ? "" : this.copyToWebmail.trim();
   }
 
   public void setCopyToWebmail(String copyToWebmail)
   {
     this.copyToWebmail = copyToWebmail;
   }
 
   public String getSecretToWebmail()
   {
     return this.secretToWebmail == null ? "" : this.secretToWebmail.trim();
   }
 
   public void setSecretToWebmail(String secretToWebmail)
   {
     this.secretToWebmail = secretToWebmail;
   }
 
   public String getPraise()
   {
     return this.praise == null ? "" : this.praise.trim();
   }
 
   public void setPraise(String praise)
   {
     this.praise = praise;
   }
 
   public Integer getBodyId()
   {
     return this.bodyId;
   }
 
   public void setBodyId(Integer bodyId)
   {
     this.bodyId = bodyId;
   }
 
   public String getFromId()
   {
     return this.fromId == null ? "" : this.fromId.trim();
   }
 
   public void setFromId(String fromId)
   {
     this.fromId = (fromId == null ? null : fromId.trim());
   }
 
   public String getSubject()
   {
     return this.subject == null ? "" : this.subject.trim();
   }
 
   public void setSubject(String subject)
   {
     this.subject = (subject == null ? null : subject.trim());
   }
 
   public Integer getSendTime()
   {
     return this.sendTime;
   }
 
   public void setSendTime(Integer sendTime)
   {
     this.sendTime = sendTime;
   }
 
   public String getSendFlag()
   {
     return this.sendFlag;
   }
 
   public void setSendFlag(String sendFlag)
   {
     this.sendFlag = (sendFlag == null ? null : sendFlag.trim());
   }
 
   public String getSmsRemind()
   {
     return this.smsRemind == null ? "0" : this.smsRemind.trim();
   }
 
   public void setSmsRemind(String smsRemind)
   {
     this.smsRemind = (smsRemind == null ? null : smsRemind.trim());
   }
 
   public String getImportant()
   {
     return this.important == null ? "" : this.important.trim();
   }
 
   public void setImportant(String important)
   {
     this.important = (important == null ? null : important.trim());
   }
 
   public Long getSize()
   {
     return Long.valueOf(this.size == null ? 0L : this.size.longValue());
   }
 
   public void setSize(Long size)
   {
     this.size = size;
   }
 
   public Integer getFromWebmailId()
   {
     return Integer.valueOf(this.fromWebmailId == null ? 0 : this.fromWebmailId.intValue());
   }
 
   public void setFromWebmailId(Integer fromWebmailId)
   {
     this.fromWebmailId = fromWebmailId;
   }
 
   public String getFromWebmail()
   {
     return this.fromWebmail == null ? "" : this.fromWebmail.trim();
   }
 
   public void setFromWebmail(String fromWebmail)
   {
     this.fromWebmail = (fromWebmail == null ? null : fromWebmail.trim());
   }
 
   public String getWebmailFlag()
   {
     return this.webmailFlag == null ? "0" : this.webmailFlag.trim();
   }
 
   public void setWebmailFlag(String webmailFlag)
   {
     this.webmailFlag = (webmailFlag == null ? null : webmailFlag.trim());
   }
 
   public String getRecvFrom()
   {
     return this.recvFrom == null ? "" : this.recvFrom.trim();
   }
 
   public void setRecvFrom(String recvFrom)
   {
     this.recvFrom = (recvFrom == null ? null : recvFrom.trim());
   }
 
   public Integer getRecvToId()
   {
     return Integer.valueOf(this.recvToId == null ? 0 : this.recvToId.intValue());
   }
 
   public void setRecvToId(Integer recvToId)
   {
     this.recvToId = recvToId;
   }
 
   public String getRecvTo()
   {
     return this.recvTo == null ? "" : this.recvTo.trim();
   }
 
   public void setRecvTo(String recvTo)
   {
     this.recvTo = (recvTo == null ? null : recvTo.trim());
   }
 
   public String getIsWebmail()
   {
     return this.isWebmail == null ? "0" : this.isWebmail.trim();
   }
 
   public void setIsWebmail(String isWebmail)
   {
     this.isWebmail = (isWebmail == null ? null : isWebmail.trim());
   }
 
   public String getIsWf()
   {
     return this.isWf == null ? "0" : this.isWf.trim();
   }
 
   public void setIsWf(String isWf)
   {
     this.isWf = (isWf == null ? null : isWf.trim());
   }
 
   public String getKeyword()
   {
     return this.keyword == null ? "" : this.keyword.trim();
   }
 
   public void setKeyword(String keyword)
   {
     this.keyword = (keyword == null ? null : keyword.trim());
   }
 
   public Integer getSecretLevel()
   {
     return Integer.valueOf(this.secretLevel == null ? 0 : this.secretLevel.intValue());
   }
 
   public void setSecretLevel(Integer secretLevel)
   {
     this.secretLevel = secretLevel;
   }
 
   public String getAuditMan()
   {
     return this.auditMan == null ? "" : this.auditMan.trim();
   }
 
   public void setAuditMan(String auditMan)
   {
     this.auditMan = (auditMan == null ? null : auditMan.trim());
   }
 
   public String getFirstFlag()
   {
     return this.firstFlag;
   }
 
   public void setFirstFlag(String firstFlag)
   {
     this.firstFlag = firstFlag;
   }
 
   public String getSecondFlag()
   {
     return this.secondFlag;
   }
 
   public void setSecondFlag(String secondFlag)
   {
     this.secondFlag = secondFlag;
   }
 
   public String getToName()
   {
     return this.toName;
   }
 
   public void setToName(String toName)
   {
     this.toName = toName;
   }
 
   public String getCopyName()
   {
     return this.copyName;
   }
 
   public void setCopyName(String copyName)
   {
     this.copyName = copyName;
   }
 
   public String getSecretToName()
   {
     return this.secretToName;
   }
 
   public void setSecretToName(String secretToName)
   {
     this.secretToName = secretToName;
   }
 
   public String getProbablyDate()
   {
     return this.probablyDate;
   }
 
   public void setProbablyDate(String probablyDate)
   {
     this.probablyDate = probablyDate;
   }
 
   public List<Attachment> getAttachment()
   {
     return this.attachment;
   }
 
   public void setAttachment(List<Attachment> attachment)
   {
     this.attachment = attachment;
   }
 
   public EmailBoxModel getEmailBoxModel()
   {
     return this.emailBoxModel;
   }
 
   public void setEmailBoxModel(EmailBoxModel emailBoxModel)
   {
     this.emailBoxModel = emailBoxModel;
   }
 
   public List<Webmail> getWebmailList()
   {
     return this.webmailList;
   }
 
   public void setWebmailList(List<Webmail> webmailList)
   {
     this.webmailList = webmailList;
   }
 
   public String getFromUserId()
   {
     return this.fromUserId;
   }
 
   public void setFromUserId(String fromUserId)
   {
     this.fromUserId = fromUserId;
   }
 
   public String getOrderByName()
   {
     return this.orderByName;
   }
 
   public void setOrderByName(String orderByName)
   {
     this.orderByName = orderByName;
   }
 
   public String getSearchCriteria()
   {
     return this.searchCriteria;
   }
 
   public void setSearchCriteria(String searchCriteria)
   {
     this.searchCriteria = searchCriteria;
   }
 
   public String getOrderWhere()
   {
     return this.orderWhere;
   }
 
   public void setOrderWhere(String orderWhere)
   {
     this.orderWhere = orderWhere;
   }
 
   public EmailBodyModel() {
   }
 
   public EmailBodyModel(String fromId, Date sendTime, String subject, String content, String toId2) {
     this.fromId = fromId;
     this.sendTime = DateFormat.getTime(DateFormat.getStrDate(sendTime));
     this.subject = subject;
     this.content = content;
     this.toId2 = toId2;
   }
 
   public Integer getDraftsCount() {
     return this.draftsCount;
   }
 
   public void setDraftsCount(Integer draftsCount) {
     this.draftsCount = draftsCount;
   }
 
   public Integer getHairboxCount() {
     return this.HairboxCount;
   }
 
   public void setHairboxCount(Integer hairboxCount) {
     this.HairboxCount = hairboxCount;
   }
 
   public void setSendTimes(Date sendTimes) {
     this.sendTimes = sendTimes;
   }
   @JSONField(format="yyyy-MM-dd HH:mm:ss")
   public Date getSendTimes() { return this.sendTimes;
   }
 
   public String getMonths()
   {
     return this.Months;
   }
 
   public void setMonths(String Months)
   {
     this.Months = Months;
   }
 
   public Integer getCount1()
   {
     return this.count1;
   }
 
   public void setCount1(Integer count1) {
     this.count1 = count1;
   }
 
   public Integer getCount2() {
     return this.count2;
   }
 
   public void setCount2(Integer count2) {
     this.count2 = count2;
   }
 
   public Integer getCount3() {
     return this.count3;
   }
 
   public void setCount3(Integer count3) {
     this.count3 = count3;
   }
 
   public Integer getCount4() {
     return this.count4;
   }
 
   public void setCount4(Integer count4) {
     this.count4 = count4;
   }
 
   public Integer getCount5() {
     return this.count5;
   }
 
   public void setCount5(Integer count5) {
     this.count5 = count5;
   }
 
   public Integer getCount6() {
     return this.count6;
   }
 
   public void setCount6(Integer count6) {
     this.count6 = count6;
   }
 
   public Integer getCount7() {
     return this.count7;
   }
 
   public void setCount7(Integer count7) {
     this.count7 = count7;
   }
 
   public Integer getCount8() {
     return this.count8;
   }
 
   public void setCount8(Integer count8) {
     this.count8 = count8;
   }
 
   public Integer getCount9() {
     return this.count9;
   }
 
   public void setCount9(Integer count9) {
     this.count9 = count9;
   }
 
   public Integer getCount10() {
     return this.count10;
   }
 
   public void setCount10(Integer count10) {
     this.count10 = count10;
   }
 
   public Integer getCount11() {
     return this.count11;
   }
 
   public void setCount11(Integer count11) {
     this.count11 = count11;
   }
 
   public Integer getCount12() {
     return this.count12;
   }
 
   public void setCount12(Integer count12) {
     this.count12 = count12;
   }
 
   public void setAttachmentList(List<Attachment> attachmentList)
   {
     this.attachmentList = attachmentList;
   }
 
   public List<Attachment> getAttachmentList() {
     return this.attachmentList;
   }
 
   public void setMaps(Map<String, String> map) {
   }
 
   public Map<String, String> getMap() {
     return this.map;
   }
 
   public void setMap(Map<String, String> map) {
     this.map = map;
   }
 
   public static long getSerialVersionUID()
   {
     return 1076969159692234636L;
   }
 
   public String getSmsDefault() {
     return this.smsDefault;
   }
 
   public void setSmsDefault(String smsDefault) {
     this.smsDefault = smsDefault;
   }
 }

