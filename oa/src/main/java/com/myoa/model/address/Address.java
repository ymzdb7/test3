 package com.myoa.model.address;
 
 import com.alibaba.fastjson.annotation.JSONField;
 import java.util.Date;
 import org.springframework.format.annotation.DateTimeFormat;
 
 public class Address
 {
   private Integer addId;
   private String userId;
   private Integer groupId;
   private String psnName;
   private String sex;
   private String nickName;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date birthday;
   private String ministration;
   private String mate;
   private String child;
   private String deptName;
   private String addDept;
   private String postNoDept;
   private String telNoDept;
   private String faxNoDept;
   private String addHome;
   private String postNoHome;
   private String telNoHome;
   private String mobilNo;
   private String bpNo;
   private String email;
   private String oicqNo;
   private String icqNo;
   private Integer psnNo;
   private String smsFlag;
   private String addShareName;
   private Date addStart;
   private Date addEnd;
   private String perWeb;
   private String notes;
   private String avatar;
   private String userName;
   private Integer uid;
   private String groupName;
 
   public String getNotes()
   {
     return this.notes == null ? "" : this.notes;
   }
 
   public void setNotes(String notes) {
     this.notes = notes;
   }
 
   public String getGroupName()
   {
     return this.groupName == null ? "" : this.groupName;
   }
 
   public void setGroupName(String groupName) {
     this.groupName = groupName;
   }
 
   public String getUserName() {
     return this.userName == null ? "" : this.userName;
   }
 
   public void setUserName(String userName) {
     this.userName = userName;
   }
 
   public Integer getUid() {
     return this.uid;
   }
 
   public void setUid(Integer uid) {
     this.uid = uid;
   }
 
   public String getAvatar() {
     return this.avatar == null ? "" : this.avatar;
   }
 
   public void setAvatar(String avatar) {
     this.avatar = avatar;
   }
 
   public Integer getAddId()
   {
     return this.addId;
   }
 
   public void setAddId(Integer addId)
   {
     this.addId = addId;
   }
 
   public String getUserId()
   {
     return this.userId == null ? "" : this.userId;
   }
 
   public void setUserId(String userId)
   {
     this.userId = (userId == null ? null : userId.trim());
   }
 
   public Integer getGroupId()
   {
     return this.groupId;
   }
 
   public void setGroupId(Integer groupId)
   {
     this.groupId = groupId;
   }
 
   public String getPsnName()
   {
     return this.psnName == null ? "" : this.psnName;
   }
 
   public void setPsnName(String psnName)
   {
     this.psnName = (psnName == null ? null : psnName.trim());
   }
 
   public String getSex()
   {
     return this.sex == null ? "" : this.sex;
   }
 
   public void setSex(String sex)
   {
     this.sex = (sex == null ? null : sex.trim());
   }
 
   public String getNickName()
   {
     return this.nickName == null ? "" : this.nickName;
   }
 
   public void setNickName(String nickName)
   {
     this.nickName = (nickName == null ? null : nickName.trim());
   }
 
   public Date getBirthday()
   {
     return this.birthday;
   }
 
   public void setBirthday(Date birthday)
   {
     this.birthday = birthday;
   }
 
   public String getMinistration()
   {
     return this.ministration;
   }
 
   public void setMinistration(String ministration)
   {
     this.ministration = (ministration == null ? null : ministration.trim());
   }
 
   public String getMate()
   {
     return this.mate;
   }
 
   public void setMate(String mate)
   {
     this.mate = (mate == null ? null : mate.trim());
   }
 
   public String getChild()
   {
     return this.child == null ? "" : this.child;
   }
 
   public void setChild(String child)
   {
     this.child = (child == null ? null : child.trim());
   }
 
   public String getDeptName()
   {
     return this.deptName == null ? "" : this.deptName;
   }
 
   public void setDeptName(String deptName)
   {
     this.deptName = (deptName == null ? null : deptName.trim());
   }
 
   public String getAddDept()
   {
     return this.addDept == null ? "" : this.addDept;
   }
 
   public void setAddDept(String addDept)
   {
     this.addDept = (addDept == null ? null : addDept.trim());
   }
 
   public String getPostNoDept()
   {
     return this.postNoDept == null ? "" : this.postNoDept;
   }
 
   public void setPostNoDept(String postNoDept)
   {
     this.postNoDept = (postNoDept == null ? null : postNoDept.trim());
   }
 
   public String getTelNoDept()
   {
     return this.telNoDept == null ? "" : this.telNoDept;
   }
 
   public void setTelNoDept(String telNoDept)
   {
     this.telNoDept = (telNoDept == null ? null : telNoDept.trim());
   }
 
   public String getFaxNoDept()
   {
     return this.faxNoDept == null ? "" : this.faxNoDept;
   }
 
   public void setFaxNoDept(String faxNoDept)
   {
     this.faxNoDept = (faxNoDept == null ? null : faxNoDept.trim());
   }
 
   public String getAddHome()
   {
     return this.addHome == null ? "" : this.addHome;
   }
 
   public void setAddHome(String addHome)
   {
     this.addHome = (addHome == null ? null : addHome.trim());
   }
 
   public String getPostNoHome()
   {
     return this.postNoHome == null ? "" : this.postNoHome;
   }
 
   public void setPostNoHome(String postNoHome)
   {
    this.postNoHome = (postNoHome == null ? null : postNoHome.trim());
   }
 
   public String getTelNoHome()
   {
     return this.telNoHome == null ? "" : this.telNoHome;
   }
 
   public void setTelNoHome(String telNoHome)
   {
     this.telNoHome = (telNoHome == null ? null : telNoHome.trim());
   }
 
   public String getMobilNo()
   {
     return this.mobilNo == null ? "" : this.mobilNo;
   }
 
   public void setMobilNo(String mobilNo)
   {
     this.mobilNo = (mobilNo == null ? null : mobilNo.trim());
   }
 
   public String getBpNo()
   {
     return this.bpNo == null ? "" : this.bpNo;
   }
 
   public void setBpNo(String bpNo)
   {
     this.bpNo = (bpNo == null ? null : bpNo.trim());
   }
 
   public String getEmail()
   {
     return this.email == null ? "" : this.email;
   }
 
   public void setEmail(String email)
   {
     this.email = (email == null ? null : email.trim());
   }
 
   public String getOicqNo()
   {
     return this.oicqNo == null ? "" : this.oicqNo;
   }
 
   public void setOicqNo(String oicqNo)
   {
     this.oicqNo = (oicqNo == null ? null : oicqNo.trim());
   }
 
   public String getIcqNo()
   {
     return this.icqNo == null ? "" : this.icqNo;
   }
 
   public void setIcqNo(String icqNo)
   {
     this.icqNo = (icqNo == null ? null : icqNo.trim());
   }
 
   public Integer getPsnNo()
   {
     return this.psnNo;
   }
 
   public void setPsnNo(Integer psnNo)
   {
     this.psnNo = psnNo;
   }
 
   public String getSmsFlag()
   {
     return this.smsFlag == null ? "" : this.smsFlag;
   }
 
   public void setSmsFlag(String smsFlag)
   {
     this.smsFlag = (smsFlag == null ? null : smsFlag.trim());
   }
 
   public String getAddShareName()
   {
     return this.addShareName == null ? "" : this.addShareName;
   }
 
   public void setAddShareName(String addShareName)
   {
     this.addShareName = (addShareName == null ? null : addShareName.trim());
   }
 
   public Date getAddStart()
   {
     return this.addStart;
   }
 
   public void setAddStart(Date addStart)
   {
     this.addStart = addStart;
   }
 
   public Date getAddEnd()
   {
     return this.addEnd;
   }
 
   public void setAddEnd(Date addEnd)
   {
     this.addEnd = addEnd;
   }
 
   public String getPerWeb()
   {
     return this.perWeb == null ? "" : this.perWeb;
   }
 
   public void setPerWeb(String perWeb)
   {
     this.perWeb = (perWeb == null ? null : perWeb.trim());
   }
 }

