 package com.myoa.model.worldnews;
 
 import com.myoa.model.common.SysCode;
import com.myoa.model.department.Department;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.role.Role;
import com.myoa.model.users.Users;

 import java.io.Serializable;
 import java.util.Date;
import java.util.List;
 
 public class News
   implements Serializable
 {
   private static final long serialVersionUID = 6368734497100640940L;
   private Integer newsId;
   private String subject;
   private String provider;
   private Date newsTime;
   private Integer clickCount;
   private String anonymityYn;
   private String format;
   private String typeId;
   private String publish;
   private String top;
   private String lastEditor;
   private Date lastEditTime;
   private String subjectColor;
   private String keyword;
   private String topDays;
   private String content;
   private String attachmentId;
   private String attachmentName;
   private String toId;
   private String privId;
   private String userId;
   private String readers;
   private byte[] compressContent;
   private String summary;
   private Integer read;
   private Users users;
   private Department dep;
   private Role role;
   private SysCode codes;
   private String newsDateTime;
   private String userrange;
   private String rolerange;
   private String deprange;
   private List<Attachment> attachment;
   private String providerName;
   private List<Department> departmentList;
   private Integer readSize;
   private Integer unreadSize;
   private Integer newsCount;
   private String typeName = "";
   private String depName;
 
   public List<Department> getDepartmentList()
   {
     return this.departmentList;
   }
 
   public void setDepartmentList(List<Department> departmentList) {
     this.departmentList = departmentList;
   }
 
   public Integer getReadSize() {
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
 
   public static long getSerialversionuid() {
     return 6368734497100640940L;
   }
 
   public Integer getNewsId()
   {
     return this.newsId;
   }
 
   public void setNewsId(Integer newsId)
   {
     this.newsId = newsId;
   }
 
   public String getSubject()
   {
     return this.subject;
   }
 
   public void setSubject(String subject)
   {
     this.subject = (subject == null ? null : subject.trim());
   }
 
   public String getProvider()
   {
     return this.provider;
   }
 
   public void setProvider(String provider)
   {
     this.provider = (provider == null ? null : provider.trim());
   }
 
   public Date getNewsTime()
   {
     return this.newsTime;
   }
 
   public void setNewsTime(Date newsTime)
   {
     this.newsTime = newsTime;
   }
 
   public Integer getClickCount()
   {
     return Integer.valueOf(this.clickCount == null ? 0 : this.clickCount.intValue());
   }
 
   public void setClickCount(Integer clickCount)
   {
     this.clickCount = clickCount;
   }
 
   public String getAnonymityYn()
   {
     return this.anonymityYn;
   }
 
   public void setAnonymityYn(String anonymityYn)
   {
     this.anonymityYn = (anonymityYn == null ? null : anonymityYn.trim());
   }
 
   public String getFormat()
   {
     return this.format;
   }
 
   public void setFormat(String format)
   {
     this.format = (format == null ? null : format.trim());
   }
 
   public String getTypeId()
   {
     return this.typeId == null ? "" : this.typeId;
   }
 
   public void setTypeId(String typeId)
   {
     this.typeId = (typeId == null ? null : typeId.trim());
   }
 
   public String getPublish()
   {
     return this.publish;
   }
 
   public void setPublish(String publish)
   {
     this.publish = (publish == null ? null : publish.trim());
   }
 
   public String getTop()
   {
     return this.top;
   }
 
   public void setTop(String top)
   {
     this.top = (top == null ? null : top.trim());
   }
 
   public String getLastEditor()
   {
     return this.lastEditor == null ? "" : this.lastEditor;
   }
 
   public void setLastEditor(String lastEditor)
   {
     this.lastEditor = (lastEditor == null ? null : lastEditor.trim());
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
 
   public String getTopDays()
   {
     return this.topDays == null ? "" : this.topDays;
   }
 
   public void setTopDays(String topDays)
   {
     this.topDays = (topDays == null ? null : topDays.trim());
   }
 
   public String getContent()
   {
     return this.content == null ? "" : this.content;
   }
 
   public void setContent(String content)
   {
     this.content = content;
   }
 
   public String getAttachmentId()
   {
     return this.attachmentId == null ? "" : this.attachmentId;
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
 
   public String getToId()
   {
     return this.toId == null ? "" : this.toId;
   }
 
   public void setToId(String toId)
   {
     this.toId = toId;
   }
 
   public String getPrivId()
   {
     return this.privId == null ? "" : this.privId;
   }
 
   public void setPrivId(String privId)
   {
     this.privId = privId;
   }
 
   public String getUserId()
   {
     return this.userId == null ? "" : this.userId;
   }
 
   public void setUserId(String userId)
   {
     this.userId = userId;
   }
 
   public String getReaders()
   {
     return this.readers == null ? "" : this.readers;
   }
 
   public void setReaders(String readers)
   {
     this.readers = readers;
   }
 
   public byte[] getCompressContent()
   {
     return this.compressContent;
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
     this.summary = summary;
   }
 
   public Integer getRead()
   {
     return this.read;
   }
 
   public void setRead(Integer read)
   {
     this.read = read;
   }
 
   public Users getUsers()
   {
     return this.users;
   }
 
   public void setUsers(Users users)
   {
     this.users = users;
   }
 
   public Department getDep()
   {
     return this.dep;
   }
 
   public void setDep(Department dep)
   {
     this.dep = dep;
   }
 
   public Role getRole()
   {
     return this.role;
   }
 
   public void setRole(Role role)
   {
     this.role = role;
   }
 
   public String getNewsDateTime() {
     return this.newsDateTime;
   }
 
   public void setNewsDateTime(String newsDateTime) {
     this.newsDateTime = newsDateTime;
   }
 
   public SysCode getCodes() {
     return this.codes;
   }
 
   public void setCodes(SysCode codes) {
     this.codes = codes;
   }
 
   public String getTypeName()
   {
     return this.typeName;
   }
 
   public void setTypeName(String typeName) {
     this.typeName = typeName;
   }
 
   public String getProviderName() {
     return this.providerName;
   }
 
   public void setProviderName(String providerName) {
     this.providerName = providerName;
   }
 
   public String getDepName()
   {
     return this.depName;
   }
 
   public void setDepName(String depName) {
     this.depName = depName;
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
 
   public String getDeprange() {
     return this.deprange == null ? "" : this.deprange;
   }
 
   public void setDeprange(String deprange) {
     this.deprange = deprange;
   }
 
   public List<Attachment> getAttachment() {
     return this.attachment;
   }
 
   public void setAttachment(List<Attachment> attachment) {
     this.attachment = attachment;
   }
 
   public Integer getNewsCount() {
     return this.newsCount;
   }
 
   public void setNewsCount(Integer newsCount) {
     this.newsCount = newsCount;
   }
 }
