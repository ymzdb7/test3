 package com.myoa.model.notify;
 
 import com.alibaba.fastjson.annotation.JSONField;
import com.myoa.model.common.SysCode;
import com.myoa.model.department.Department;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.users.Users;

 import java.util.Date;
 import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
 
 public class Notify
 {
   private Integer notifyId;
   private Integer fromDept;
   private String fromId;
   private String subject;
 
   @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
   @JSONField(format="yyyy-MM-dd HH:mm:ss")
   private Date sendTime;
   private Integer beginDate;
   private Integer endDate;
   private String print;
   private String typeId;
   private String top;
   private Integer topDays;
   private String format;
   private String publish;
   private String auditer;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date auditDate;
   private String download;
   private String lastEditor;
   private Date lastEditTime;
   private String subjectColor;
   private String keyword;
   private String isFw;
   private String toId;
   private String content;
   private String attachmentId;
   private String attachmentName;
   private String readers;
   private String privId;
   private String userId;
   private String reason;
   private byte[] compressContent;
   private String summary;
   private Users users;
   private String name;
   private SysCode codes;
   private String notifyDateTime;
   private Integer read;
   private String typeName;
   private String userrange;
   private String rolerange;
   private String deprange;
   private String begin;
   private String end;
   private String auditerName;
   private String depName;
   private String totleNum;
   private List<Department> departmentList;
   private Integer readSize;
   private Integer unreadSize;
   private List<Attachment> attachment;
   private String beginTime;
   private String endTime;
   private int resultCount;
   private String fromDeptStr;
   private String fromIdStr;
   private String range;
   private String thingDefault;
   private String smsDefault;
 
   public String getAuditerName()
   {
     return this.auditerName == null ? "" : this.auditerName;
   }
 
   public void setAuditerName(String auditerName) {
     this.auditerName = auditerName;
   }
 
   public String getDepName() {
     return this.depName == null ? "" : this.depName;
   }
 
   public void setDepName(String depName) {
     this.depName = depName;
   }
 
   public Integer getReadSize()
   {
     return this.readSize;
   }
 
   public void setReadSize(Integer readSize) {
     this.readSize = readSize;
   }
 
   public Integer getUnreadSize() {
     return this.unreadSize;
   }
 
   public void setUnreadSize(Integer unreadSize) {
     this.unreadSize = unreadSize;
   }
 
   public List<Department> getDepartmentList() {
     return this.departmentList;
   }
 
   public void setDepartmentList(List<Department> departmentList) {
     this.departmentList = departmentList;
   }
 
   public String getTotleNum() {
     return this.totleNum;
   }
 
   public void setTotleNum(String totleNum) {
     this.totleNum = totleNum;
   }
 
   public String getBegin() {
     return this.begin;
   }
 
   public void setBegin(String begin) {
     this.begin = begin;
   }
 
   public String getEnd() {
     return this.end;
   }
 
   public void setEnd(String end) {
     this.end = end;
   }
 
   public String getTypeName()
   {
     return this.typeName;
   }
 
   public void setTypeName(String typeName)
   {
     this.typeName = typeName;
   }
 
   public String getName()
   {
     return this.name;
   }
 
   public void setName(String name)
   {
     this.name = name;
   }
 
   public Users getUsers()
   {
     return this.users;
   }
 
   public void setUsers(Users users)
   {
     this.users = users;
   }
 
   public String getToId()
   {
     return this.toId == null ? "" : this.toId;
   }
 
   public void setToId(String toId)
   {
     this.toId = (toId == null ? "" : toId.trim());
   }
 
   public String getContent()
   {
     return this.content == null ? "" : this.content;
   }
 
   public void setContent(String content)
   {
     this.content = (content == null ? "" : content.trim());
   }
 
   public String getAttachmentId()
   {
     if (this.attachmentId == null) {
       this.attachmentId = "";
     }
     return this.attachmentId;
   }
 
   public void setAttachmentId(String attachmentId)
   {
     this.attachmentId = attachmentId;
   }
 
   public String getAttachmentName()
   {
     return this.attachmentName == null ? "" : this.attachmentName;
   }
 
   public void setAttachmentName(String attachmentName)
   {
     this.attachmentName = attachmentName;
   }
 
   public String getReaders()
   {
     return this.readers == null ? "" : this.readers;
   }
 
   public void setReaders(String readers)
   {
     this.readers = (readers == null ? null : readers.trim());
   }
 
   public String getPrivId()
   {
     return this.privId == null ? "" : this.privId;
   }
 
   public void setPrivId(String privId)
   {
     this.privId = (privId == null ? null : privId.trim());
   }
 
   public String getUserId()
   {
     return this.userId == null ? "" : this.userId;
   }
 
   public void setUserId(String userId)
   {
     this.userId = (userId == null ? null : userId.trim());
   }
 
   public String getReason()
   {
     return this.reason == null ? "" : this.reason;
   }
 
   public void setReason(String reason)
   {
     this.reason = (reason == null ? null : reason.trim());
   }
 
   public byte[] getCompressContent()
   {
     return this.compressContent == null ? new byte[0] : this.compressContent;
   }
 
   public void setCompressContent(byte[] compressContent)
   {
     this.compressContent = compressContent;
   }
 
   public String getSummary()
   {
     return this.summary == null ? "" : this.summary;
   }
 
   public void setSummary(String summary)
   {
     this.summary = (summary == null ? null : summary.trim());
   }
 
   public Integer getNotifyId()
   {
     return this.notifyId;
   }
 
   public void setNotifyId(Integer notifyId)
   {
     this.notifyId = notifyId;
   }
 
   public Integer getFromDept()
   {
     return Integer.valueOf(this.fromDept == null ? 0 : this.fromDept.intValue());
   }
 
   public void setFromDept(Integer fromDept)
   {
     this.fromDept = fromDept;
   }
 
   public Integer getRead()
   {
     return this.read;
   }
 
   public void setRead(Integer read)
   {
     this.read = read;
   }
 
   public String getFromId()
   {
     return this.fromId;
   }
 
   public void setFromId(String fromId)
   {
     this.fromId = (fromId == null ? null : fromId.trim());
   }
 
   public String getSubject()
   {
     return this.subject == null ? "" : this.subject;
   }
 
   public void setSubject(String subject)
   {
     this.subject = (subject == null ? null : subject.trim());
   }
 
   public Integer getBeginDate()
   {
     return Integer.valueOf(this.beginDate == null ? 0 : this.beginDate.intValue());
   }
 
   public void setBeginDate(Integer beginDate)
   {
     this.beginDate = beginDate;
   }
 
   public Integer getEndDate()
   {
     return Integer.valueOf(this.endDate == null ? 0 : this.endDate.intValue());
   }
 
   public void setEndDate(Integer endDate)
   {
     this.endDate = endDate;
   }
 
   public String getPrint()
   {
     return this.print == null ? "" : this.print;
   }
 
   public void setPrint(String print)
   {
     this.print = (print == null ? null : print.trim());
   }
 
   public String getTypeId()
   {
     return this.typeId == null ? "" : this.typeId;
   }
 
   public void setTypeId(String typeId)
   {
     this.typeId = (typeId == null ? null : typeId.trim());
   }
 
   public String getTop()
   {
     return this.top == null ? "" : this.top;
   }
 
   public void setTop(String top)
   {
     this.top = (top == null ? null : top.trim());
   }
 
   public Integer getTopDays()
   {
     return Integer.valueOf(this.topDays == null ? 0 : this.topDays.intValue());
   }
 
   public void setTopDays(Integer topDays)
   {
     this.topDays = topDays;
   }
 
   public String getFormat()
   {
     return this.format == null ? "" : this.format;
   }
 
   public void setFormat(String format)
   {
     this.format = (format == null ? null : format.trim());
   }
 
   public String getPublish()
   {
     return this.publish == null ? "" : this.publish;
   }
 
   public void setPublish(String publish)
   {
     this.publish = (publish == null ? null : publish.trim());
   }
 
   public String getAuditer()
   {
     return this.auditer == null ? "" : this.auditer;
   }
 
   public void setAuditer(String auditer)
   {
     this.auditer = (auditer == null ? null : auditer.trim());
   }
 
   public String getDownload()
   {
     return this.download == null ? "" : this.download;
   }
 
   public void setDownload(String download)
   {
     this.download = (download == null ? null : download.trim());
   }
 
   public String getLastEditor()
   {
     return this.lastEditor == null ? "" : this.lastEditor;
   }
 
   public void setLastEditor(String lastEditor)
   {
     this.lastEditor = lastEditor;
   }
 
   public Date getAuditDate()
   {
     return this.auditDate == null ? new Date() : this.auditDate;
   }
 
   public void setAuditDate(Date auditDate)
   {
     this.auditDate = auditDate;
   }
 
   public Date getSendTime()
   {
     return this.sendTime;
   }
 
   public void setSendTime(Date sendTime)
   {
     this.sendTime = sendTime;
   }
 
   public Date getLastEditTime()
   {
     return this.lastEditTime;
   }
 
   public void setLastEditTime(Date lastEditTime)
   {
     this.lastEditTime = lastEditTime;
   }
 
   public String getSubjectColor()
   {
     return this.subjectColor == null ? "" : this.subjectColor;
   }
 
   public void setSubjectColor(String subjectColor)
   {
     this.subjectColor = (subjectColor == null ? null : subjectColor.trim());
   }
 
   public String getKeyword()
   {
     return this.keyword == null ? "" : this.keyword;
   }
 
   public void setKeyword(String keyword)
   {
     this.keyword = (keyword == null ? null : keyword.trim());
   }
 
   public String getIsFw()
   {
     return this.isFw == null ? "" : this.isFw;
   }
 
   public void setIsFw(String isFw)
   {
     this.isFw = (isFw == null ? null : isFw.trim());
   }
 
   public String getNotifyDateTime() {
     return this.notifyDateTime;
   }
 
   public void setNotifyDateTime(String notifyDateTime) {
     this.notifyDateTime = notifyDateTime;
   }
 
   public SysCode getCodes() {
     return this.codes;
   }
 
   public void setCodes(SysCode codes) {
     this.codes = codes;
   }
 
   public String getDeprange() {
     return this.deprange == null ? "" : this.deprange;
   }
 
   public void setDeprange(String deprange) {
     this.deprange = deprange;
   }
 
   public String getUserrange() {
     return this.userrange == null ? "" : this.userrange;
   }
 
   public void setUserrange(String userrange) {
     this.userrange = userrange;
   }
 
   public String getRolerange() {
     return this.rolerange == null ? "" : this.rolerange;
   }
 
   public void setRolerange(String rolerange) {
     this.rolerange = rolerange;
   }
 
   public List<Attachment> getAttachment() {
     return this.attachment;
   }
 
   public void setAttachment(List<Attachment> attachment) {
     this.attachment = attachment;
   }
 
   public Notify() {
   }
 
   public Notify(String format, String fromId, Date sendTime, String subject, String content, String toId, String publish) {
     this.format = format;
     this.fromId = fromId;
     this.sendTime = sendTime;
     this.subject = subject;
     this.content = content;
     this.toId = toId;
     this.publish = publish;
   }
 
   public String getBeginTime()
   {
     return this.beginTime;
   }
 
   public String getEndTime() {
     return this.endTime;
   }
 
   public void setBeginTime(String beginTime) {
     this.beginTime = beginTime;
   }
 
   public void setEndTime(String endTime) {
     this.endTime = endTime;
   }
 
   public int getResultCount()
   {
     return this.resultCount;
   }
 
   public void setResultCount(int resultCount) {
     this.resultCount = resultCount;
   }
 
   public void setFromDeptStr(String fromDeptStr)
   {
     this.fromDeptStr = fromDeptStr;
   }
 
   public void setFromIdStr(String fromIdStr) {
     this.fromIdStr = fromIdStr;
   }
 
   public String getFromDeptStr() {
     return this.fromDeptStr;
   }
 
   public String getFromIdStr() {
     return this.fromIdStr;
   }
 
   public String getRange()
   {
     return this.range;
   }
 
   public void setRange(String range) {
     this.range = range;
   }
 
   public String getThingDefault()
   {
     return this.thingDefault;
   }
 
   public String getSmsDefault() {
     return this.smsDefault;
   }
 
   public void setThingDefault(String thingDefault) {
     this.thingDefault = thingDefault;
   }
 
   public void setSmsDefault(String smsDefault) {
     this.smsDefault = smsDefault;
   }
 }

