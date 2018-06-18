 package com.myoa.model.meet;
 
 public class MeetingEquuipment
 {
   private Integer sid;
   private String equipmentName;
   private String equipmentNo;
   private String groupNo;
   private Integer status;
   private Integer meetingRoomId;
   private String remark;
 
   public Integer getSid()
   {
     return this.sid;
   }
 
   public void setSid(Integer sid)
   {
     this.sid = sid;
   }
 
   public String getEquipmentName()
   {
     return this.equipmentName;
   }
 
   public void setEquipmentName(String equipmentName)
   {
     this.equipmentName = (equipmentName == null ? null : equipmentName.trim());
   }
 
   public String getEquipmentNo()
   {
     return this.equipmentNo;
   }
 
   public void setEquipmentNo(String equipmentNo)
   {
     this.equipmentNo = (equipmentNo == null ? null : equipmentNo.trim());
   }
 
   public String getGroupNo()
   {
     return this.groupNo;
   }
 
   public void setGroupNo(String groupNo)
   {
     this.groupNo = (groupNo == null ? null : groupNo.trim());
   }
 
   public Integer getStatus()
   {
     return this.status;
   }
 
   public void setStatus(Integer status)
   {
     this.status = status;
   }
 
   public Integer getMeetingRoomId()
   {
     return this.meetingRoomId;
   }
 
   public void setMeetingRoomId(Integer meetingRoomId)
   {
     this.meetingRoomId = meetingRoomId;
   }
 
   public String getRemark()
   {
     return this.remark;
   }
 
   public void setRemark(String remark)
   {
     this.remark = (remark == null ? null : remark.trim());
   }
 }

