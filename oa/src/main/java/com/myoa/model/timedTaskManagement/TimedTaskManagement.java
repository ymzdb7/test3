 package com.myoa.model.timedTaskManagement;
 
 public class TimedTaskManagement extends TimedTaskRecord
 {
   private Integer ttmId;
   private String taskName;
   private String taskDescription;
   private Integer typeMet;
   private String executionTimeat;
   private Integer taskType;
   private Integer execute;
   private String intwevalTime;
 
   public String getExecutionTimeat()
   {
     return this.executionTimeat;
   }
 
   public void setExecutionTimeat(String executionTimeat) {
     this.executionTimeat = executionTimeat;
   }
 
   public Integer getTtmId()
   {
     return this.ttmId;
   }
 
   public void setTtmId(Integer ttmId)
   {
     this.ttmId = ttmId;
   }
 
   public String getTaskName()
   {
     return this.taskName;
   }
 
   public void setTaskName(String taskName)
   {
     this.taskName = (taskName == null ? null : taskName.trim());
   }
 
   public String getTaskDescription()
   {
     return this.taskDescription;
   }
 
   public void setTaskDescription(String taskDescription)
   {
     this.taskDescription = (taskDescription == null ? null : taskDescription.trim());
   }
 
   public Integer getTypeMet()
   {
     return this.typeMet;
   }
 
   public void setTypeMet(Integer typeMet)
   {
     this.typeMet = typeMet;
   }
 
   public Integer getTaskType()
   {
     return this.taskType;
   }
 
   public void setTaskType(Integer taskType)
   {
     this.taskType = taskType;
   }
 
   public Integer getExecute()
   {
     return this.execute;
   }
 
   public void setExecute(Integer execute)
   {
     this.execute = execute;
   }
 
   public String getIntwevalTime()
   {
     return this.intwevalTime;
   }
 
   public void setIntwevalTime(String intwevalTime)
   {
     this.intwevalTime = (intwevalTime == null ? null : intwevalTime.trim());
   }
 }
