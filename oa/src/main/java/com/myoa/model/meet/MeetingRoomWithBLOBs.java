 package com.myoa.model.meet;
 
 public class MeetingRoomWithBLOBs extends MeetingRoom
 {
   private String mrDevice;
   private String mrDesc;
   private String meetingEquip;
 
   public String getMrDevice()
   {
     return this.mrDevice;
   }
 
   public void setMrDevice(String mrDevice)
   {
     this.mrDevice = (mrDevice == null ? null : mrDevice.trim());
   }
 
   public String getMrDesc()
   {
     return this.mrDesc;
   }
 
   public void setMrDesc(String mrDesc)
   {
     this.mrDesc = (mrDesc == null ? null : mrDesc.trim());
   }
 
   public String getMeetingEquip()
   {
     return this.meetingEquip;
   }
 
   public void setMeetingEquip(String meetingEquip)
   {
     this.meetingEquip = (meetingEquip == null ? null : meetingEquip.trim());
   }
 }

