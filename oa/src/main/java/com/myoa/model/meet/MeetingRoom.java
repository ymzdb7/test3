 package com.myoa.model.meet;
 
 import java.util.List;
 
 public class MeetingRoom
 {
   private Integer sid;
   private String managerids;
   private String managetnames;
   private String mrCapacity;
   private String mrName;
   private String mrPlace;
   private String meetroomperson;
   private String meetroomdept;
   private String meetroompersonName;
   private String meetroomdeptName;
   private String equipmentIds;
   private List<MeetingWithBLOBs> meetingWithBLOBs;
   private String equipmentNames;
 
   public List<MeetingWithBLOBs> getMeetingWithBLOBs()
   {
     return this.meetingWithBLOBs;
   }
 
   public void setMeetingWithBLOBs(List<MeetingWithBLOBs> meetingWithBLOBs) {
     this.meetingWithBLOBs = meetingWithBLOBs;
   }
 
   public Integer getSid()
   {
     return this.sid;
   }
 
   public void setSid(Integer sid)
   {
     this.sid = sid;
   }
 
   public String getManagerids()
   {
     return this.managerids;
   }
 
   public void setManagerids(String managerids)
   {
     this.managerids = (managerids == null ? null : managerids.trim());
   }
 
   public String getManagetnames() {
     return this.managetnames;
   }
 
   public void setManagetnames(String managetnames) {
     this.managetnames = managetnames;
   }
 
   public String getMrCapacity()
   {
     return this.mrCapacity;
   }
 
   public void setMrCapacity(String mrCapacity)
   {
     this.mrCapacity = (mrCapacity == null ? null : mrCapacity.trim());
   }
 
   public String getMrName()
   {
     return this.mrName;
   }
 
   public void setMrName(String mrName)
   {
     this.mrName = (mrName == null ? null : mrName.trim());
   }
 
   public String getMrPlace()
   {
     return this.mrPlace;
   }
 
   public void setMrPlace(String mrPlace)
   {
     this.mrPlace = (mrPlace == null ? null : mrPlace.trim());
   }
 
   public String getEquipmentIds()
   {
     return this.equipmentIds;
   }
 
   public void setEquipmentIds(String equipmentIds)
   {
     this.equipmentIds = (equipmentIds == null ? null : equipmentIds.trim());
   }
 
   public String getEquipmentNames()
   {
     return this.equipmentNames;
   }
 
   public void setEquipmentNames(String equipmentNames)
   {
     this.equipmentNames = (equipmentNames == null ? null : equipmentNames.trim());
   }
 
   public String getMeetroomperson() {
     return this.meetroomperson;
   }
 
   public void setMeetroomperson(String meetroomperson) {
     this.meetroomperson = meetroomperson;
   }
 
   public String getMeetroomdept() {
     return this.meetroomdept;
   }
 
   public void setMeetroomdept(String meetroomdept) {
     this.meetroomdept = meetroomdept;
   }
 
   public String getMeetroompersonName() {
     return this.meetroompersonName;
   }
 
   public void setMeetroompersonName(String meetroompersonName) {
     this.meetroompersonName = meetroompersonName;
   }
 
   public String getMeetroomdeptName() {
     return this.meetroomdeptName;
   }
 
   public void setMeetroomdeptName(String meetroomdeptName) {
     this.meetroomdeptName = meetroomdeptName;
   }
 }

