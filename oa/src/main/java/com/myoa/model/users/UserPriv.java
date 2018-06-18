 package com.myoa.model.users;
 
 import java.io.Serializable;
 
 public class UserPriv
   implements Serializable
 {
   private static final long serialVersionUID = 1L;
   private Integer userPriv;
   private String privName;
   private Short privNo;
   private String funcIdStr;
   private Integer privDeptId;
   private String privDeptName;
   private Byte privType;
   private Byte isGlobal;
   private String showCount;
   private Integer insertCounts;
   private Integer failCounts;
   private Integer emptyCount;
   private Integer reapNameCount;
   private String mapList;
 
   public Integer getEmptyCount()
   {
     return Integer.valueOf(this.emptyCount == null ? 0 : this.emptyCount.intValue());
   }
 
   public void setEmptyCount(Integer emptyCount) {
     this.emptyCount = emptyCount;
   }
 
   public Integer getReapNameCount() {
     return Integer.valueOf(this.reapNameCount == null ? 0 : this.reapNameCount.intValue());
   }
 
   public void setReapNameCount(Integer reapNameCount) {
     this.reapNameCount = reapNameCount;
   }
 
   public Integer getFailCounts() {
     return Integer.valueOf(this.failCounts == null ? 0 : this.failCounts.intValue());
   }
 
   public void setFailCounts(Integer failCounts) {
     this.failCounts = failCounts;
   }
 
   public Integer getInsertCounts() {
     return Integer.valueOf(this.insertCounts == null ? 0 : this.insertCounts.intValue());
   }
 
   public void setInsertCounts(Integer insertCounts) {
     this.insertCounts = insertCounts;
   }
 
   public String getShowCount() {
     return this.showCount;
   }
 
   public void setShowCount(String showCount) {
     this.showCount = showCount;
   }
 
   public String getPrivDeptName()
   {
     return this.privDeptName;
   }
 
   public void setPrivDeptName(String privDeptName) {
     this.privDeptName = privDeptName;
   }
 
   public Integer getUserPriv() {
     return this.userPriv;
   }
 
   public void setUserPriv(Integer userPriv) {
     this.userPriv = userPriv;
   }
 
   public String getPrivName() {
     return this.privName;
   }
 
   public void setPrivName(String privName) {
     this.privName = (privName == null ? null : privName.trim());
   }
 
   public Short getPrivNo() {
     return this.privNo;
   }
 
   public void setPrivNo(Short privNo) {
     this.privNo = privNo;
   }
 
   public String getFuncIdStr() {
     return this.funcIdStr;
   }
 
   public void setFuncIdStr(String funcIdStr) {
     this.funcIdStr = (funcIdStr == null ? null : funcIdStr.trim());
   }
 
   public Integer getPrivDeptId() {
     return this.privDeptId;
   }
 
   public void setPrivDeptId(Integer privDeptId) {
     this.privDeptId = privDeptId;
   }
 
   public Byte getPrivType() {
     return this.privType;
   }
 
   public void setPrivType(Byte privType) {
     this.privType = privType;
   }
 
   public Byte getIsGlobal() {
     return this.isGlobal;
   }
 
   public void setIsGlobal(Byte isGlobal) {
     this.isGlobal = isGlobal;
   }
 
   public String getMapList()
   {
     return this.mapList;
   }
 
   public void setMapList(String mapList)
   {
     this.mapList = mapList;
   }
 }
