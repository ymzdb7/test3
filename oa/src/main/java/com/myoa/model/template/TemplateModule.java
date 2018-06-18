 package com.myoa.model.template;
 
 public class TemplateModule
 {
   private Integer id;
   private String name;
   private String type;
   private String privUser;
   private String privUserName;
   private String privOrg;
   private String privOrgName;
   private String privRole;
   private String privRoleName;
   private String categoryId;
   private String categoryName;
   private Integer createTime;
   private Integer createUser;
   private String attUrl;
 
   public Integer getId()
   {
     return this.id;
   }
 
   public void setId(Integer id)
   {
     this.id = id;
   }
 
   public String getName()
   {
     return this.name;
   }
 
   public void setName(String name)
   {
     this.name = (name == null ? null : name.trim());
   }
 
   public String getType()
   {
     return this.type;
   }
 
   public void setType(String type)
   {
     this.type = (type == null ? null : type.trim());
   }
 
   public String getPrivUser()
   {
     return this.privUser;
   }
 
   public void setPrivUser(String privUser)
   {
     this.privUser = (privUser == null ? null : privUser.trim());
   }
 
   public String getPrivOrg()
   {
     return this.privOrg;
   }
 
   public void setPrivOrg(String privOrg)
   {
     this.privOrg = (privOrg == null ? null : privOrg.trim());
   }
 
   public String getPrivRole()
   {
     return this.privRole;
   }
 
   public void setPrivRole(String privRole)
   {
     this.privRole = (privRole == null ? null : privRole.trim());
   }
 
   public String getCategoryId()
   {
     return this.categoryId;
   }
 
   public void setCategoryId(String categoryId)
   {
     this.categoryId = (categoryId == null ? null : categoryId.trim());
   }
 
   public Integer getCreateTime()
   {
     return this.createTime;
   }
 
   public void setCreateTime(Integer createTime)
   {
     this.createTime = createTime;
   }
 
   public Integer getCreateUser()
   {
     return this.createUser;
   }
 
   public void setCreateUser(Integer createUser)
   {
     this.createUser = createUser;
   }
 
   public String getAttUrl()
   {
     return this.attUrl;
   }
 
   public void setAttUrl(String attUrl) {
     this.attUrl = (attUrl == null ? null : attUrl.trim());
   }
 
   public String getCategoryName() {
     return this.categoryName;
   }
 
   public void setCategoryName(String categoryName) {
     this.categoryName = categoryName;
   }
 
   public String getPrivUserName() {
     return this.privUserName;
   }
 
   public void setPrivUserName(String privUserName) {
     this.privUserName = privUserName;
   }
 
   public String getPrivOrgName() {
     return this.privOrgName;
   }
 
   public void setPrivOrgName(String privOrgName) {
     this.privOrgName = privOrgName;
   }
 
   public String getPrivRoleName() {
     return this.privRoleName;
   }
 
   public void setPrivRoleName(String privRoleName) {
     this.privRoleName = privRoleName;
   }
 }

