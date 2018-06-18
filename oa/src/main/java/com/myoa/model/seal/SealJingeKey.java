 package com.myoa.model.seal;
 
 import java.util.Date;
 
 public class SealJingeKey
 {
   private Integer keyId;
   private Integer sealId;
   private String keyNo;
   private String userIdStr;
   private String createUser;
   private Date createTime;
   private String remark1;
   private String remark2;
   private String remark3;
   private String remark4;
   private String remark5;
   private String unitName;
   private String userNames;
 
   public Integer getKeyId()
   {
     return this.keyId;
   }
 
   public void setKeyId(Integer keyId)
   {
     this.keyId = keyId;
   }
 
   public Integer getSealId()
   {
     return this.sealId;
   }
 
   public void setSealId(Integer sealId)
   {
     this.sealId = sealId;
   }
 
   public String getKeyNo()
   {
     return this.keyNo;
   }
 
   public void setKeyNo(String keyNo)
   {
     this.keyNo = (keyNo == null ? null : keyNo.trim());
   }
 
   public String getUserIdStr()
   {
     return this.userIdStr;
   }
 
   public void setUserIdStr(String userIdStr)
   {
     this.userIdStr = (userIdStr == null ? null : userIdStr.trim());
   }
 
   public String getCreateUser()
   {
     return this.createUser;
   }
 
   public void setCreateUser(String createUser)
   {
     this.createUser = (createUser == null ? null : createUser.trim());
   }
 
   public Date getCreateTime()
   {
     return this.createTime;
   }
 
   public void setCreateTime(Date createTime)
   {
     this.createTime = createTime;
   }
 
   public String getRemark1()
   {
     return this.remark1;
   }
 
   public void setRemark1(String remark1)
   {
     this.remark1 = (remark1 == null ? null : remark1.trim());
   }
 
   public String getRemark2()
   {
     return this.remark2;
   }
 
   public void setRemark2(String remark2)
   {
     this.remark2 = (remark2 == null ? null : remark2.trim());
   }
 
   public String getRemark3()
   {
     return this.remark3;
   }
 
   public void setRemark3(String remark3)
   {
     this.remark3 = (remark3 == null ? null : remark3.trim());
   }
 
   public String getRemark4()
   {
     return this.remark4;
   }
 
   public void setRemark4(String remark4)
   {
     this.remark4 = (remark4 == null ? null : remark4.trim());
   }
 
   public String getRemark5()
   {
     return this.remark5;
   }
 
   public void setRemark5(String remark5)
   {
     this.remark5 = (remark5 == null ? null : remark5.trim());
   }
 
   public String getUnitName()
   {
     return this.unitName;
   }
 
   public void setUnitName(String unitName) {
     this.unitName = unitName;
   }
 
   public String getUserNames()
   {
     return this.userNames;
   }
 
   public void setUserNames(String userNames) {
     this.userNames = userNames;
   }
 }

