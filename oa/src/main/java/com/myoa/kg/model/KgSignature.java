 package com.myoa.kg.model;
 
 public class KgSignature
 {
   private Integer signatureId;
   private String signatureName;
   private String signatureKgid;
   private Integer signatureStatus;
   private Integer keyId;
   private String signatureUnit;
   private String signkeyKeysns;
 
   public Integer getKeyId()
   {
     return this.keyId;
   }
 
   public void setKeyId(Integer keyId) {
     this.keyId = keyId;
   }
 
   public Integer getSignatureId()
   {
     return this.signatureId;
   }
 
   public void setSignatureId(Integer signatureId)
   {
     this.signatureId = signatureId;
   }
 
   public String getSignatureName()
   {
    return this.signatureName;
   }
 
   public void setSignatureName(String signatureName)
   {
     this.signatureName = (signatureName == null ? null : signatureName.trim());
   }
 
   public String getSignatureKgid()
   {
     return this.signatureKgid;
   }
 
   public void setSignatureKgid(String signatureKgid)
   {
     this.signatureKgid = (signatureKgid == null ? null : signatureKgid.trim());
   }
 
   public Integer getSignatureStatus()
   {
     return this.signatureStatus;
   }
 
   public void setSignatureStatus(Integer signatureStatus)
   {
     this.signatureStatus = signatureStatus;
   }
 
   public String getSignatureUnit()
   {
     return this.signatureUnit;
   }
 
   public void setSignatureUnit(String signatureUnit) {
     this.signatureUnit = signatureUnit;
   }
 
   public String getSignkeyKeysns()
   {
     return this.signkeyKeysns;
   }
 
   public void setSignkeyKeysns(String signkeyKeysns) {
     this.signkeyKeysns = signkeyKeysns;
   }
 }

