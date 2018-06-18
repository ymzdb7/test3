 package com.myoa.model.workflow;
 
 import com.myoa.model.enclosure.Attachment;
import com.myoa.util.DateFormat;

 import java.io.Serializable;
 import java.util.Date;
import java.util.List;
 
 public class FlowTypeModel
   implements Serializable
 {
   private static final long serialVersionUID = 1L;
   private Integer flowId;
   private String flowName;
   private Integer formId;
   private String flowDoc;
   private String flowType;
   private Integer flowNo;
   private Integer flowSort;
   private Integer autoNum;
   private Integer autoLen;
   private String autoEdit;
   private String commentPriv;
   private Integer deptId;
   private String freePreset;
   private String freeOther;
   private String allowPreSet;
   private String forcePreSet;
   private Integer viewPriv;
   private Integer isVersion;
   private String flowAction;
   private Integer autoNumYear;
   private Integer autoNumMonth;
   private Date autoNumTime;
   private String manageUser;
   private String autoName;
   private String queryUser;
   private String flowDesc;
   private String newUser;
   private String queryItem;
   private String queryUserDept;
   private String manageUserDept;
   private String editPriv;
   private String listFldsStr;
   private String modelId;
   private String modelName;
   private String attachmentId;
   private String attachmentName;
   private String viewUser;
   private String viewDept;
   private String viewRole;
   private String depName;
   private String runName;
   private String viewUserName;
   private String viewDeptName;
   private String viewRoleName;
   private List<Attachment> attachment;
 
   public String getRunName()
   {
     return this.runName;
   }
 
   public void setRunName(String runName) {
     this.runName = runName;
   }
 
   public String getDepName() {
     if (this.depName == null) {
       this.depName = "全部部门";
     }
     return this.depName;
   }
 
   public void setDepName(String depName) {
     this.depName = depName;
   }
 
   public Integer getFlowId()
   {
     return this.flowId;
   }
 
   public void setFlowId(Integer flowId)
   {
     this.flowId = flowId;
   }
 
   public String getFlowName()
   {
     return this.flowName == null ? "" : this.flowName.trim();
   }
 
   public void setFlowName(String flowName)
   {
     this.flowName = flowName;
   }
 
   public Integer getFormId()
   {
     return this.formId;
   }
 
   public void setFormId(Integer formId)
   {
     this.formId = formId;
   }
 
   public String getFlowDoc()
   {
     return this.flowDoc == null ? "1" : this.flowDoc.trim();
   }
 
   public void setFlowDoc(String flowDoc)
   {
     this.flowDoc = flowDoc;
   }
 
   public String getFlowType()
   {
     return this.flowType == null ? null : this.flowType.trim();
   }
 
   public void setFlowType(String flowType)
   {
     this.flowType = flowType;
   }
 
   public Integer getFlowNo()
   {
     return Integer.valueOf(this.flowNo == null ? 1 : this.flowNo.intValue());
   }
 
   public void setFlowNo(Integer flowNo)
   {
     this.flowNo = flowNo;
   }
 
   public Integer getFlowSort()
   {
     return this.flowSort;
   }
 
   public void setFlowSort(Integer flowSort)
   {
     this.flowSort = flowSort;
   }
 
   public Integer getAutoNum()
   {
     return Integer.valueOf(this.autoNum == null ? 0 : this.autoNum.intValue());
   }
 
   public void setAutoNum(Integer autoNum)
   {
     this.autoNum = autoNum;
   }
 
   public Integer getAutoLen()
   {
     return Integer.valueOf(this.autoLen == null ? 0 : this.autoLen.intValue());
   }
 
   public void setAutoLen(Integer autoLen)
   {
     this.autoLen = autoLen;
   }
 
   public String getAutoEdit()
   {
     return this.autoEdit == null ? "1" : this.autoEdit.trim();
   }
 
   public void setAutoEdit(String autoEdit)
   {
     this.autoEdit = autoEdit;
   }
 
   public String getCommentPriv()
   {
     return this.commentPriv == null ? "3" : this.commentPriv.trim();
   }
 
   public void setCommentPriv(String commentPriv)
   {
     this.commentPriv = commentPriv;
   }
 
   public Integer getDeptId()
   {
     return Integer.valueOf(this.deptId == null ? 1 : this.deptId.intValue());
   }
 
   public void setDeptId(Integer deptId)
   {
     this.deptId = deptId;
   }
 
   public String getFreePreset()
   {
     return this.freePreset == null ? "1" : this.freePreset.trim();
   }
 
   public void setFreePreset(String freePreset)
   {
     this.freePreset = freePreset;
   }
 
   public String getFreeOther()
   {
     return this.freeOther == null ? "2" : this.freeOther.trim();
   }
 
   public void setFreeOther(String freeOther)
   {
     this.freeOther = freeOther;
   }
 
   public String getAllowPreSet()
   {
     return this.allowPreSet == null ? "0" : this.allowPreSet.trim();
   }
 
   public void setAllowPreSet(String allowPreSet)
   {
     this.allowPreSet = allowPreSet;
   }
 
   public String getForcePreSet()
   {
     return this.forcePreSet == null ? "0" : this.forcePreSet.trim();
   }
 
   public void setForcePreSet(String forcePreSet)
   {
     this.forcePreSet = forcePreSet;
   }
 
   public Integer getViewPriv()
   {
     return this.viewPriv;
   }
 
   public void setViewPriv(Integer viewPriv)
   {
     this.viewPriv = viewPriv;
   }
 
   public Integer getIsVersion()
   {
     return Integer.valueOf(this.isVersion == null ? 0 : this.isVersion.intValue());
   }
 
   public void setIsVersion(Integer isVersion)
   {
     this.isVersion = isVersion;
   }
 
   public String getFlowAction()
   {
     return this.flowAction == null ? null : this.flowAction.trim();
   }
 
   public void setFlowAction(String flowAction)
   {
     this.flowAction = flowAction;
   }
 
   public Integer getAutoNumYear()
   {
     return Integer.valueOf(this.autoNumYear == null ? 0 : this.autoNumYear.intValue());
   }
 
   public void setAutoNumYear(Integer autoNumYear)
   {
     this.autoNumYear = autoNumYear;
   }
 
   public Integer getAutoNumMonth()
   {
     return Integer.valueOf(this.autoNumMonth == null ? 0 : this.autoNumMonth.intValue());
   }
 
   public void setAutoNumMonth(Integer autoNumMonth)
   {
     this.autoNumMonth = autoNumMonth;
   }
 
   public Date getAutoNumTime()
   {
     return this.autoNumTime == null ? DateFormat.getDate("0000-00-00 00:00:00") : this.autoNumTime;
   }
 
   public void setAutoNumTime(Date autoNumTime)
   {
     this.autoNumTime = autoNumTime;
   }
 
   public String getManageUser()
   {
     return this.manageUser == null ? "" : this.manageUser.trim();
   }
 
   public void setManageUser(String manageUser)
   {
     this.manageUser = manageUser;
   }
 
   public String getAutoName()
   {
     return this.autoName == null ? "" : this.autoName.trim();
   }
 
   public void setAutoName(String autoName)
   {
     this.autoName = autoName;
   }
 
   public String getQueryUser()
   {
     return this.queryUser == null ? "" : this.queryUser.trim();
   }
 
   public void setQueryUser(String queryUser)
   {
     this.queryUser = queryUser;
   }
 
   public String getFlowDesc()
   {
     return this.flowDesc == null ? "" : this.flowDesc.trim();
   }
 
   public void setFlowDesc(String flowDesc)
   {
     this.flowDesc = flowDesc;
   }
 
   public String getNewUser()
   {
     return this.newUser == null ? "" : this.newUser.trim();
   }
 
   public void setNewUser(String newUser)
   {
     this.newUser = newUser;
   }
 
   public String getQueryItem()
   {
     return this.queryItem == null ? "" : this.queryItem.trim();
   }
 
   public void setQueryItem(String queryItem)
   {
     this.queryItem = queryItem;
   }
 
   public String getQueryUserDept()
   {
     return this.queryUserDept == null ? "" : this.queryUserDept.trim();
   }
 
   public void setQueryUserDept(String queryUserDept)
   {
     this.queryUserDept = queryUserDept;
   }
 
   public String getManageUserDept()
   {
     return this.manageUserDept == null ? "" : this.manageUserDept.trim();
   }
 
   public void setManageUserDept(String manageUserDept)
   {
     this.manageUserDept = manageUserDept;
   }
 
   public String getEditPriv()
   {
     return this.editPriv == null ? "" : this.editPriv.trim();
   }
 
   public void setEditPriv(String editPriv)
   {
     this.editPriv = editPriv;
   }
 
   public String getListFldsStr()
   {
     return this.listFldsStr == null ? "" : this.listFldsStr.trim();
   }
 
   public void setListFldsStr(String listFldsStr)
   {
     this.listFldsStr = listFldsStr;
   }
 
   public String getModelId()
   {
     return this.modelId == null ? "" : this.modelId.trim();
   }
 
   public void setModelId(String modelId)
   {
     this.modelId = modelId;
   }
 
   public String getModelName()
   {
     return this.modelName == null ? "" : this.modelName.trim();
   }
 
   public void setModelName(String modelName)
   {
     this.modelName = modelName;
   }
 
   public String getAttachmentId()
   {
     return this.attachmentId == null ? "" : this.attachmentId.trim();
   }
 
   public void setAttachmentId(String attachmentId)
   {
     this.attachmentId = attachmentId;
   }
 
   public String getAttachmentName()
   {
     return this.attachmentName == null ? "" : this.attachmentName.trim();
   }
 
   public void setAttachmentName(String attachmentName)
   {
     this.attachmentName = attachmentName;
   }
 
   public String getViewUser()
   {
     return this.viewUser == null ? "" : this.viewUser.trim();
   }
 
   public void setViewUser(String viewUser)
   {
     this.viewUser = viewUser;
   }
 
   public String getViewDept()
   {
     return this.viewDept == null ? "" : this.viewDept.trim();
   }
 
   public void setViewDept(String viewDept)
   {
     this.viewDept = viewDept;
   }
 
   public String getViewRole()
   {
     return this.viewRole == null ? "" : this.viewRole.trim();
   }
 
   public void setViewRole(String viewRole)
   {
     this.viewRole = viewRole;
   }
 
   public String getViewUserName()
   {
     return this.viewUserName;
   }
 
   public void setViewUserName(String viewUserName)
   {
     this.viewUserName = viewUserName;
   }
 
   public String getViewDeptName()
   {
     return this.viewDeptName;
   }
 
   public void setViewDeptName(String viewDeptName)
   {
     this.viewDeptName = viewDeptName;
   }
 
   public String getViewRoleName()
   {
     return this.viewRoleName == null ? "" : this.viewRoleName;
   }
 
   public void setViewRoleName(String viewRoleName)
   {
     this.viewRoleName = viewRoleName;
   }
 
   public List<Attachment> getAttachment()
   {
     return this.attachment;
   }
 
   public void setAttachment(List<Attachment> attachment)
   {
     this.attachment = attachment;
   }
 }

