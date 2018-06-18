 package com.myoa.model.workflow;
 
 public class FlowDetailInfo extends FlowTypeModel
 {
   private String sortName;
   private String formName;
   private String deptName;
   private String runName;
   private Integer procNum;
   private Integer endRun;
   private Integer runAll;
   private Integer archiveRun;
   private Integer runIngCount;
   private Integer cutNumber;
   private Integer canBack;
   private Integer canSign;
   private Integer canSync;
 
   public Integer getCanBack()
   {
     return this.canBack;
   }
 
   public void setCanBack(Integer canBack) {
     this.canBack = canBack;
   }
 
   public Integer getCanSign() {
     return this.canSign;
   }
 
   public void setCanSign(Integer canSign) {
     this.canSign = canSign;
   }
 
   public Integer getCanSync() {
     return this.canSync;
   }
 
   public void setCanSync(Integer canSync) {
     this.canSync = canSync;
   }
 
   public String getSortName() {
     return this.sortName;
   }
 
   public void setSortName(String sortName) {
     this.sortName = sortName;
   }
 
   public String getFormName() {
     return this.formName;
   }
 
   public void setFormName(String formName) {
     this.formName = formName;
   }
 
   public String getDeptName() {
     return this.deptName == null ? "全部部门" : this.deptName;
   }
 
   public void setDeptName(String deptName) {
     this.deptName = deptName;
   }
 
   public String getRunName()
   {
     return this.runName;
   }
 
   public void setRunName(String runName)
   {
     this.runName = runName;
   }
 
   public Integer getProcNum() {
     return this.procNum;
   }
 
   public void setProcNum(Integer procNum) {
     this.procNum = procNum;
   }
 
   public Integer getEndRun() {
     return this.endRun;
   }
 
   public void setEndRun(Integer endRun) {
     this.endRun = endRun;
   }
 
   public Integer getRunAll() {
     return this.runAll;
   }
 
   public void setRunAll(Integer runAll) {
     this.runAll = runAll;
   }
 
   public Integer getArchiveRun() {
     return Integer.valueOf(this.archiveRun == null ? 0 : this.archiveRun.intValue());
   }
 
   public void setArchiveRun(Integer archiveRun) {
     this.archiveRun = archiveRun;
   }
 
   public Integer getRunIngCount() {
     return this.runIngCount;
   }
 
   public void setRunIngCount(Integer runIngCount) {
     this.runIngCount = runIngCount;
   }
 
   public Integer getCutNumber() {
     return this.cutNumber;
   }
 
   public void setCutNumber(Integer cutNumber) {
     this.cutNumber = cutNumber;
   }
 }

