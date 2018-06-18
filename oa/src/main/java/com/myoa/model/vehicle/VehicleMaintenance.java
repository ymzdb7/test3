 package com.myoa.model.vehicle;
 
 import com.alibaba.fastjson.annotation.JSONField;
 import java.math.BigDecimal;
 import java.util.Date;
 import org.springframework.format.annotation.DateTimeFormat;
 
 public class VehicleMaintenance
 {
   private Integer vmId;
   private String vId;
   private String vIdNumber;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date vmRequestDate;
   private String vmType;
   private String vmTypeName;
   private BigDecimal vmFee;
   private String vmPerson;
   private String vmPersonName;
 
   public Integer getVmId()
   {
     return this.vmId;
   }
 
   public void setVmId(Integer vmId)
   {
     this.vmId = vmId;
   }
 
   public String getvId()
   {
     return this.vId;
   }
 
   public void setvId(String vId)
   {
     this.vId = (vId == null ? null : vId.trim());
   }
 
   public String getvIdNumber() {
     return this.vIdNumber == null ? "" : this.vIdNumber;
   }
 
   public void setvIdNumber(String vIdNumber) {
     this.vIdNumber = vIdNumber;
   }
 
   public String getVmPersonName() {
     return this.vmPersonName == null ? "" : this.vmPersonName;
   }
 
   public void setVmPersonName(String vmPersonName) {
     this.vmPersonName = vmPersonName;
   }
 
   public String getVmTypeName() {
     return this.vmTypeName == null ? "" : this.vmTypeName;
   }
 
   public void setVmTypeName(String vmTypeName) {
     this.vmTypeName = vmTypeName;
   }
 
   public Date getVmRequestDate()
   {
     return this.vmRequestDate;
   }
 
   public void setVmRequestDate(Date vmRequestDate)
   {
     this.vmRequestDate = vmRequestDate;
   }
 
   public String getVmType()
   {
     return this.vmType;
   }
 
   public void setVmType(String vmType)
   {
     this.vmType = (vmType == null ? null : vmType.trim());
   }
 
   public BigDecimal getVmFee()
   {
     return this.vmFee;
   }
 
   public void setVmFee(BigDecimal vmFee)
   {
     this.vmFee = vmFee;
   }
 
   public String getVmPerson()
   {
     return this.vmPerson == null ? "" : this.vmPerson;
   }
 
   public void setVmPerson(String vmPerson)
   {
     this.vmPerson = (vmPerson == null ? null : vmPerson.trim());
   }
 }

