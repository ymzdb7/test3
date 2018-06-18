 package com.myoa.model.documentOrg;
 
 import com.alibaba.fastjson.annotation.JSONField;
 import java.util.Date;
 import org.springframework.format.annotation.DateTimeFormat;
 
 public class DocumentOrg
 {
   private Integer id;
   private String title;
   private String keyWord;
   private String unit;
   private String docNo;
   private String urgency;
   private String secrecy;
   private String mainDelivery;
   private String copyDelivery;
   private Integer deadline;
   private Integer copies;
   private String creater;
   private String createDept;
   private String printDept;
   private String printDate;
   private String documentType;
   private String dispatchType;
   private String mainFile;
   private String mainFileName;
   private Integer pages;
   private String mainAipFile;
   private String mainAipFileName;
   private String publicFlag;
   private Integer printCopies;
   private String printUser;
   private Integer flowId;
   private Integer runId;
   private String flowRunName;
   private String flowStatus;
   private String flowPrcs;
   private String curUserId;
   private String allUserId;
   private Integer transferFlag;
   private Integer orgFlag;
   private String transferOrg;
   private String transferUser;
   private String transferReceiveOrg;
   private String transferReceiveUser;
 
   @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
   @JSONField(format="yyyy-MM-dd HH:mm:ss")
   private Date transferTime;
   private String remark;
   private String content;
   private String transferUserName;
 
   public String getTransferUserName()
   {
     return this.transferUserName;
   }
 
   public void setTransferUserName(String transferUserName) {
     this.transferUserName = transferUserName;
   }
 
   public String getRemark() {
     return this.remark;
   }
 
   public void setRemark(String remark) {
     this.remark = remark;
   }
 
   public String getContent() {
     return this.content;
   }
 
   public void setContent(String content) {
     this.content = content;
   }
 
   public Integer getId()
   {
     return this.id;
   }
 
   public void setId(Integer id)
   {
     this.id = id;
   }
 
   public String getTitle()
   {
     return this.title;
   }
 
   public void setTitle(String title)
   {
     this.title = (title == null ? null : title.trim());
   }
 
   public String getKeyWord()
   {
     return this.keyWord;
   }
 
   public void setKeyWord(String keyWord)
   {
     this.keyWord = (keyWord == null ? null : keyWord.trim());
   }
 
   public String getUnit()
   {
     return this.unit;
   }
 
   public void setUnit(String unit)
   {
     this.unit = (unit == null ? null : unit.trim());
   }
 
   public String getDocNo()
   {
     return this.docNo;
   }
 
   public void setDocNo(String docNo)
   {
     this.docNo = (docNo == null ? null : docNo.trim());
   }
 
   public String getUrgency()
   {
     return this.urgency;
   }
 
   public void setUrgency(String urgency)
   {
     this.urgency = (urgency == null ? null : urgency.trim());
   }
 
   public String getSecrecy()
   {
     return this.secrecy;
   }
 
   public void setSecrecy(String secrecy)
   {
     this.secrecy = (secrecy == null ? null : secrecy.trim());
   }
 
   public String getMainDelivery()
   {
     return this.mainDelivery;
   }
 
   public void setMainDelivery(String mainDelivery)
   {
     this.mainDelivery = (mainDelivery == null ? null : mainDelivery.trim());
   }
 
   public String getCopyDelivery()
   {
     return this.copyDelivery;
   }
 
   public void setCopyDelivery(String copyDelivery)
   {
     this.copyDelivery = (copyDelivery == null ? null : copyDelivery.trim());
   }
 
   public Integer getDeadline()
   {
     return this.deadline;
   }
 
   public void setDeadline(Integer deadline)
   {
     this.deadline = deadline;
   }
 
   public Integer getCopies()
   {
     return this.copies;
   }
 
   public void setCopies(Integer copies)
   {
     this.copies = copies;
   }
 
   public String getCreater()
   {
     return this.creater;
   }
 
   public void setCreater(String creater)
   {
     this.creater = (creater == null ? null : creater.trim());
   }
 
   public String getCreateDept()
   {
     return this.createDept;
   }
 
   public void setCreateDept(String createDept)
   {
     this.createDept = (createDept == null ? null : createDept.trim());
   }
 
   public String getPrintDept()
   {
     return this.printDept;
   }
 
   public void setPrintDept(String printDept)
   {
     this.printDept = (printDept == null ? null : printDept.trim());
   }
 
   public String getPrintDate() {
     return this.printDate;
   }
 
   public void setPrintDate(String printDate) {
     this.printDate = printDate;
   }
 
   public String getDocumentType()
   {
     return this.documentType;
   }
 
   public void setDocumentType(String documentType)
   {
     this.documentType = (documentType == null ? null : documentType.trim());
   }
 
   public String getDispatchType()
   {
     return this.dispatchType;
   }
 
   public void setDispatchType(String dispatchType)
   {
     this.dispatchType = (dispatchType == null ? null : dispatchType.trim());
   }
 
   public String getMainFile()
   {
     return this.mainFile;
   }
 
   public void setMainFile(String mainFile)
   {
     this.mainFile = (mainFile == null ? null : mainFile.trim());
   }
 
   public String getMainFileName()
   {
     return this.mainFileName;
   }
 
   public void setMainFileName(String mainFileName)
   {
     this.mainFileName = (mainFileName == null ? null : mainFileName.trim());
   }
 
   public Integer getPages()
   {
     return this.pages;
   }
 
   public void setPages(Integer pages)
   {
     this.pages = pages;
   }
 
   public String getMainAipFile()
   {
     return this.mainAipFile;
   }
 
   public void setMainAipFile(String mainAipFile)
   {
     this.mainAipFile = (mainAipFile == null ? null : mainAipFile.trim());
   }
 
   public String getMainAipFileName()
   {
     return this.mainAipFileName;
   }
 
   public void setMainAipFileName(String mainAipFileName)
   {
     this.mainAipFileName = (mainAipFileName == null ? null : mainAipFileName.trim());
   }
 
   public String getPublicFlag()
   {
     return this.publicFlag;
   }
 
   public void setPublicFlag(String publicFlag)
   {
     this.publicFlag = (publicFlag == null ? null : publicFlag.trim());
   }
 
   public Integer getPrintCopies()
   {
     return this.printCopies;
   }
 
   public void setPrintCopies(Integer printCopies)
   {
     this.printCopies = printCopies;
   }
 
   public String getPrintUser()
   {
     return this.printUser;
   }
 
   public void setPrintUser(String printUser)
   {
     this.printUser = (printUser == null ? null : printUser.trim());
   }
 
   public Integer getFlowId()
   {
     return this.flowId;
   }
 
   public void setFlowId(Integer flowId)
   {
     this.flowId = flowId;
   }
 
   public Integer getRunId()
   {
     return this.runId;
   }
 
   public void setRunId(Integer runId)
   {
     this.runId = runId;
   }
 
   public String getFlowRunName()
   {
     return this.flowRunName;
   }
 
   public void setFlowRunName(String flowRunName)
   {
     this.flowRunName = (flowRunName == null ? null : flowRunName.trim());
   }
 
   public String getFlowStatus()
   {
     return this.flowStatus;
   }
 
   public void setFlowStatus(String flowStatus)
   {
     this.flowStatus = (flowStatus == null ? null : flowStatus.trim());
   }
 
   public String getFlowPrcs()
   {
     return this.flowPrcs;
   }
 
   public void setFlowPrcs(String flowPrcs)
   {
     this.flowPrcs = (flowPrcs == null ? null : flowPrcs.trim());
   }
 
   public String getCurUserId()
   {
     return this.curUserId;
   }
 
   public void setCurUserId(String curUserId)
   {
     this.curUserId = (curUserId == null ? null : curUserId.trim());
   }
 
   public String getAllUserId()
   {
     return this.allUserId;
   }
 
   public void setAllUserId(String allUserId)
   {
     this.allUserId = (allUserId == null ? null : allUserId.trim());
   }
 
   public Integer getTransferFlag()
   {
     return this.transferFlag;
   }
 
   public void setTransferFlag(Integer transferFlag)
   {
     this.transferFlag = transferFlag;
   }
 
   public Integer getOrgFlag()
   {
     return this.orgFlag;
   }
 
   public void setOrgFlag(Integer orgFlag)
   {
     this.orgFlag = orgFlag;
   }
 
   public String getTransferOrg()
   {
     return this.transferOrg;
   }
 
   public void setTransferOrg(String transferOrg)
   {
     this.transferOrg = (transferOrg == null ? null : transferOrg.trim());
   }
 
   public String getTransferUser()
   {
     return this.transferUser;
   }
 
   public void setTransferUser(String transferUser)
   {
     this.transferUser = (transferUser == null ? null : transferUser.trim());
   }
 
   public String getTransferReceiveOrg()
   {
     return this.transferReceiveOrg;
   }
 
   public void setTransferReceiveOrg(String transferReceiveOrg)
   {
     this.transferReceiveOrg = (transferReceiveOrg == null ? null : transferReceiveOrg.trim());
   }
 
   public String getTransferReceiveUser()
   {
     return this.transferReceiveUser;
   }
 
   public void setTransferReceiveUser(String transferReceiveUser)
   {
     this.transferReceiveUser = (transferReceiveUser == null ? null : transferReceiveUser.trim());
   }
 
   public Date getTransferTime()
   {
     return this.transferTime;
   }
 
   public void setTransferTime(Date transferTime)
   {
     this.transferTime = transferTime;
   }
 }

