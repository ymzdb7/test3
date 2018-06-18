 package com.myoa.model.workflow;
 
 import java.io.Serializable;
 import java.util.List;
 import java.util.Map;
 
 public class FlowProcess
   implements Serializable
 {
   private static final long serialVersionUID = 1233L;
   private Integer id;
   private Integer flowId;
   private Integer prcsId;
   private byte prcsType;
   private String prcsName;
   private String prcsUser;
   private String prcsItem;
   private String hiddenItem;
   private String requiredItem;
   private String prcsDept;
   private String prcsPriv;
   private String prcsTo;
   private Integer setLeft;
   private Integer setTop;
   private String plugin;
   private String pluginSave;
   private String prcsItemAuto;
   private String prcsIn;
   private String prcsOut;
   private String feedback;
   private String prcsInSet;
   private String prcsOutSet;
   private String autoType;
   private String autoDept;
   private String autoUserOp;
   private String autoUser;
   private String autoUserOpReturn;
   private String autoUserReturn;
   private String userFilter;
   private String userFilterPrcsPriv;
   private String userFilterPrcsPrivOther;
   private String userFilterPrcsDept;
   private String userFilterPrcsDeptOther;
   private String timeOut;
   private String timeOutModify;
   private String timeOutAttend;
   private String signlook;
   private String topDefault;
   private String userLock;
   private String mailTo;
   private String mailToDept;
   private String mailToPriv;
   private String syncDeal;
   private String syncDealCheck;
   private String turnPriv;
   private int childFlow;
   private String gatherNode;
   private String allowBack;
   private String attachPriv;
   private int autoBaseUser;
   private String conditionDesc;
   private String relationIn;
   private String relationOut;
   private int remindFlag;
   private int dispAip;
   private String timeOutType;
   private String attachEditPriv;
   private String attachEditPrivOnline;
   private String attachMacroMark;
   private String controlMode;
   private String listColumnPriv;
   private int viewPriv;
   private String fileuploadPriv;
   private String imguploadPriv;
   private int signType;
   private int countersign;
   private String workingdaysType;
   private String setType;
   private FlowTypeModel flowTypeModel;
   private String settlementOfCondition;
   private String prcsItemTwo;
   private String ITEM_ID;
   private String AUTO_PRCS_USER;
   private String prcsDeptName;
   private String prcsUserName;
   private String prcsPrivName;
   private Integer documentEditPriv;
   private String documentEditPrivDetail;
   private List<FlowTiggerModel> flowTiggerModel;
   private List<Map<String, String>> connections;
   private Integer max;
   private String flowName;
 
   public static long getSerialVersionUID()
   {
     return 1233L;
   }
 
   public void setId(int id) {
     this.id = Integer.valueOf(id);
   }
 
   public Integer getDocumentEditPriv() {
     return this.documentEditPriv;
   }
 
   public void setDocumentEditPriv(Integer documentEditPriv) {
     this.documentEditPriv = documentEditPriv;
   }
 
   public String getDocumentEditPrivDetail() {
     return this.documentEditPrivDetail;
   }
 
   public void setDocumentEditPrivDetail(String documentEditPrivDetail) {
     this.documentEditPrivDetail = documentEditPrivDetail;
   }
 
   public String getFlowName() {
     return this.flowName;
   }
 
   public void setFlowName(String flowName) {
     this.flowName = flowName;
   }
 
   public Integer getMax() {
     return this.max;
   }
 
   public void setMax(Integer max) {
     this.max = max;
   }
 
   public List<Map<String, String>> getConnections() {
     return this.connections;
   }
 
   public void setConnections(List<Map<String, String>> connections) {
     this.connections = connections;
   }
 
   public void setFlowId(int flowId)
   {
     this.flowId = Integer.valueOf(flowId);
   }
 
   public void setChildFlow(int childFlow)
   {
     this.childFlow = childFlow;
   }
 
   public void setAutoBaseUser(int autoBaseUser) {
     this.autoBaseUser = autoBaseUser;
   }
 
   public void setDispAip(int dispAip) {
     this.dispAip = dispAip;
   }
 
   public void setViewPriv(int viewPriv) {
     this.viewPriv = viewPriv;
   }
 
   public String getPrcsUser()
   {
     return this.prcsUser == null ? "" : this.prcsUser.trim();
   }
 
   public void setPrcsUser(String prcsUser) {
     this.prcsUser = prcsUser;
   }
 
   public String getPrcsItem() {
     return this.prcsItem == null ? "" : this.prcsItem.trim();
   }
 
   public void setPrcsItem(String prcsItem) {
     this.prcsItem = prcsItem;
   }
 
   public String getHiddenItem() {
     return this.hiddenItem == null ? "" : this.hiddenItem.trim();
   }
 
   public void setHiddenItem(String hiddenItem) {
     this.hiddenItem = hiddenItem;
   }
 
   public String getRequiredItem() {
     return this.requiredItem == null ? "" : this.requiredItem.trim();
   }
 
   public void setRequiredItem(String requiredItem) {
     this.requiredItem = requiredItem;
   }
 
   public String getPrcsDept() {
     return this.prcsDept == null ? "" : this.prcsDept;
   }
 
   public void setPrcsDept(String prcsDept) {
     this.prcsDept = prcsDept;
   }
 
   public String getPrcsPriv() {
     return this.prcsPriv == null ? "" : this.prcsPriv.trim();
   }
 
   public void setPrcsPriv(String prcsPriv) {
     this.prcsPriv = prcsPriv;
   }
 
   public String getPrcsTo() {
     return this.prcsTo == null ? "" : this.prcsTo.trim();
   }
 
   public void setPrcsTo(String prcsTo) {
     this.prcsTo = prcsTo;
   }
 
   public String getPlugin() {
     return this.plugin == null ? "" : this.plugin.trim();
   }
 
   public void setPlugin(String plugin) {
     this.plugin = plugin;
   }
 
   public String getPluginSave() {
     return this.pluginSave == null ? "" : this.pluginSave.trim();
   }
 
   public void setPluginSave(String pluginSave) {
     this.pluginSave = pluginSave;
   }
 
   public String getPrcsItemAuto()
   {
     return this.prcsItemAuto == null ? "" : this.prcsItemAuto.trim();
   }
 
   public void setPrcsItemAuto(String prcsItemAuto) {
     this.prcsItemAuto = prcsItemAuto;
   }
 
   public String getPrcsIn() {
     return this.prcsIn == null ? "" : this.prcsIn;
   }
 
   public void setPrcsIn(String prcsIn) {
     this.prcsIn = prcsIn;
   }
 
   public String getPrcsOut() {
     return this.prcsOut == null ? "" : this.prcsOut.trim();
   }
 
   public void setPrcsOut(String prcsOut) {
     this.prcsOut = prcsOut;
   }
 
   public String getPrcsInSet() {
     return this.prcsInSet == null ? "" : this.prcsInSet.trim();
   }
 
   public void setPrcsInSet(String prcsInSet) {
     this.prcsInSet = prcsInSet;
   }
 
   public String getPrcsOutSet() {
     return this.prcsOutSet == null ? "" : this.prcsOutSet;
   }
 
   public void setPrcsOutSet(String prcsOutSet) {
     this.prcsOutSet = prcsOutSet;
   }
 
   public String getAutoDept() {
     return this.autoDept == null ? "" : this.autoDept.trim();
   }
 
   public void setAutoDept(String autoDept) {
     this.autoDept = autoDept;
   }
 
   public String getAutoUserOp() {
     return this.autoUserOp == null ? "" : this.autoUserOp.trim();
   }
 
   public void setAutoUserOp(String autoUserOp) {
     this.autoUserOp = autoUserOp;
   }
 
   public String getAutoUser() {
     return this.autoUser == null ? "" : this.autoUser;
   }
 
   public void setAutoUser(String autoUser) {
     this.autoUser = autoUser;
   }
 
   public String getAutoUserOpReturn() {
     return this.autoUserOpReturn == null ? "" : this.autoUserOpReturn.trim();
   }
 
   public void setAutoUserOpReturn(String autoUserOpReturn) {
     this.autoUserOpReturn = autoUserOpReturn;
   }
 
   public String getAutoUserReturn() {
     return this.autoUserReturn == null ? "" : this.autoUserReturn.trim();
   }
 
   public void setAutoUserReturn(String autoUserReturn) {
     this.autoUserReturn = autoUserReturn;
   }
 
   public String getUserFilterPrcsPriv() {
     return this.userFilterPrcsPriv == null ? "" : this.userFilterPrcsPriv.trim();
   }
 
   public void setUserFilterPrcsPriv(String userFilterPrcsPriv) {
     this.userFilterPrcsPriv = (userFilterPrcsPriv == null ? null : userFilterPrcsPriv.trim());
   }
 
   public String getUserFilterPrcsPrivOther() {
     return this.userFilterPrcsPrivOther == null ? "" : this.userFilterPrcsPrivOther.trim();
   }
 
   public void setUserFilterPrcsPrivOther(String userFilterPrcsPrivOther) {
     this.userFilterPrcsPrivOther = (userFilterPrcsPrivOther == null ? null : userFilterPrcsPrivOther.trim());
   }
 
   public String getUserFilterPrcsDept() {
     return this.userFilterPrcsDept == null ? "" : this.userFilterPrcsDept.trim();
   }
 
   public void setUserFilterPrcsDept(String userFilterPrcsDept) {
     this.userFilterPrcsDept = (userFilterPrcsDept == null ? null : userFilterPrcsDept.trim());
   }
 
   public String getUserFilterPrcsDeptOther() {
     return this.userFilterPrcsDeptOther == null ? "" : this.userFilterPrcsDept.trim();
   }
 
   public void setUserFilterPrcsDeptOther(String userFilterPrcsDeptOther) {
     this.userFilterPrcsDeptOther = (userFilterPrcsDeptOther == null ? null : userFilterPrcsDeptOther.trim());
   }
 
   public String getMailTo() {
     return this.mailTo == null ? "" : this.mailTo.trim();
   }
 
   public void setMailTo(String mailTo) {
     this.mailTo = mailTo;
   }
 
   public String getMailToDept() {
     return this.mailToDept == null ? "" : this.mailToDept.trim();
   }
 
   public void setMailToDept(String mailToDept) {
     this.mailToDept = mailToDept;
   }
 
   public String getMailToPriv() {
     return this.mailToPriv == null ? "" : this.mailToDept.trim();
   }
 
   public void setMailToPriv(String mailToPriv) {
     this.mailToPriv = mailToPriv;
   }
 
   public String getConditionDesc() {
     return this.conditionDesc == null ? "" : this.conditionDesc;
   }
 
   public void setConditionDesc(String conditionDesc) {
     this.conditionDesc = conditionDesc;
   }
 
   public String getRelationIn() {
     return this.relationIn == null ? "" : this.relationIn.trim();
   }
 
   public void setRelationIn(String relationIn) {
     this.relationIn = relationIn;
   }
 
   public String getRelationOut() {
     return this.relationOut == null ? "" : this.relationOut.trim();
   }
 
   public void setRelationOut(String relationOut) {
     this.relationOut = relationOut;
   }
 
   public String getControlMode() {
     return this.controlMode == null ? "" : this.controlMode.trim();
   }
 
   public void setControlMode(String controlMode) {
     this.controlMode = (controlMode == null ? null : controlMode.trim());
   }
 
   public String getListColumnPriv() {
     return this.listColumnPriv == null ? "" : this.listColumnPriv.trim();
   }
 
   public void setListColumnPriv(String listColumnPriv) {
     this.listColumnPriv = (listColumnPriv == null ? null : listColumnPriv.trim());
   }
 
   public String getFileuploadPriv() {
     return this.fileuploadPriv == null ? "" : this.fileuploadPriv.trim();
   }
 
   public void setFileuploadPriv(String fileuploadPriv) {
     this.fileuploadPriv = (fileuploadPriv == null ? null : fileuploadPriv.trim());
   }
 
   public String getImguploadPriv() {
     return this.imguploadPriv == null ? "" : this.imguploadPriv.trim();
   }
 
   public void setImguploadPriv(String imguploadPriv) {
     this.imguploadPriv = (imguploadPriv == null ? null : imguploadPriv.trim());
   }
 
   public Integer getId()
   {
     return this.id;
   }
 
   public void setId(Integer id) {
     this.id = id;
   }
 
   public Integer getFlowId() {
     return this.flowId;
   }
 
   public void setFlowId(Integer flowId) {
     this.flowId = flowId;
   }
 
   public Integer getPrcsId() {
     return this.prcsId;
   }
 
   public void setPrcsId(Integer prcsId) {
     this.prcsId = prcsId;
   }
 
   public byte getPrcsType()
   {
     return this.prcsType == 0 ? 0 : this.prcsType;
   }
 
   public void setPrcsType(byte prcsType) {
     this.prcsType = prcsType;
   }
 
   public String getPrcsName() {
     return this.prcsName == null ? "" : this.prcsName.trim();
   }
 
   public void setPrcsName(String prcsName) {
     this.prcsName = (prcsName == null ? null : prcsName.trim());
   }
 
   public Integer getSetLeft() {
     return this.setLeft;
   }
 
   public void setSetLeft(Integer setLeft) {
     this.setLeft = setLeft;
   }
 
   public Integer getSetTop() {
     return this.setTop;
   }
 
   public void setSetTop(Integer setTop) {
     this.setTop = setTop;
   }
 
   public String getFeedback() {
     return this.feedback == null ? "0" : this.feedback.trim();
   }
 
   public void setFeedback(String feedback) {
     this.feedback = feedback;
   }
 
   public String getAutoType() {
     return this.autoType == null ? "" : this.autoType.trim();
   }
 
   public void setAutoType(String autoType) {
     this.autoType = (autoType == null ? null : autoType.trim());
   }
 
   public String getUserFilter() {
     return this.userFilter == null ? "" : this.userFilter.trim();
   }
 
   public void setUserFilter(String userFilter) {
     this.userFilter = (userFilter == null ? null : userFilter.trim());
   }
 
   public String getTimeOut() {
     return this.timeOut == null ? "" : this.timeOut.trim();
   }
 
   public void setTimeOut(String timeOut) {
     this.timeOut = (timeOut == null ? null : timeOut.trim());
   }
 
   public String getTimeOutModify() {
     return this.timeOutModify == null ? "0" : this.timeOutModify.trim();
   }
 
   public void setTimeOutModify(String timeOutModify) {
     this.timeOutModify = (timeOutModify == null ? null : timeOutModify.trim());
   }
 
   public String getTimeOutAttend() {
     return this.timeOutAttend == null ? "0" : this.timeOutAttend.trim();
   }
 
   public void setTimeOutAttend(String timeOutAttend) {
     this.timeOutAttend = (timeOutAttend == null ? null : timeOutAttend.trim());
   }
 
   public String getSignlook() {
     return this.signlook == null ? "0" : this.signlook.trim();
   }
 
   public void setSignlook(String signlook) {
     this.signlook = (signlook == null ? null : signlook.trim());
   }
 
   public String getTopDefault() {
     return this.topDefault == null ? "0" : this.topDefault.trim();
   }
 
   public void setTopDefault(String topDefault) {
     this.topDefault = (topDefault == null ? null : topDefault.trim());
   }
 
   public String getUserLock() {
     return this.userLock == null ? "1" : this.userLock.trim();
   }
 
   public void setUserLock(String userLock) {
     this.userLock = (userLock == null ? null : userLock.trim());
   }
 
   public String getSyncDeal() {
     return this.syncDeal == null ? "0" : this.syncDeal.trim();
   }
 
   public void setSyncDeal(String syncDeal) {
     this.syncDeal = (syncDeal == null ? null : syncDeal.trim());
   }
 
   public String getSyncDealCheck() {
     return this.syncDealCheck == null ? "" : this.syncDealCheck.trim();
   }
 
   public void setSyncDealCheck(String syncDealCheck) {
     this.syncDealCheck = syncDealCheck;
   }
 
   public String getTurnPriv() {
     return this.turnPriv == null ? "1" : this.turnPriv.trim();
   }
 
   public void setTurnPriv(String turnPriv) {
     this.turnPriv = (turnPriv == null ? null : turnPriv.trim());
   }
 
   public Integer getChildFlow() {
     return Integer.valueOf(this.childFlow);
   }
 
   public void setChildFlow(Integer childFlow) {
     this.childFlow = childFlow.intValue();
   }
 
   public String getGatherNode() {
     return this.gatherNode == null ? "0" : this.gatherNode.trim();
   }
 
   public void setGatherNode(String gatherNode) {
     this.gatherNode = (gatherNode == null ? null : gatherNode.trim());
   }
 
   public String getAllowBack() {
     return this.allowBack == null ? "0" : this.allowBack.trim();
   }
 
   public void setAllowBack(String allowBack) {
     this.allowBack = (allowBack == null ? null : allowBack.trim());
   }
 
   public String getAttachPriv() {
     return this.attachPriv == null ? "" : this.attachPriv.trim();
   }
 
   public void setAttachPriv(String attachPriv) {
     this.attachPriv = (attachPriv == null ? null : attachPriv.trim());
   }
 
   public Integer getAutoBaseUser() {
     return Integer.valueOf(this.autoBaseUser);
   }
 
   public void setAutoBaseUser(Integer autoBaseUser) {
     this.autoBaseUser = autoBaseUser.intValue();
   }
 
   public Integer getDispAip()
   {
     return Integer.valueOf(this.dispAip);
   }
 
   public void setDispAip(Integer dispAip) {
     this.dispAip = dispAip.intValue();
   }
 
   public String getTimeOutType() {
     return this.timeOutType == null ? "" : this.timeOutType.trim();
   }
 
   public void setTimeOutType(String timeOutType) {
     this.timeOutType = (timeOutType == null ? null : timeOutType.trim());
   }
 
   public String getAttachEditPriv() {
     return this.attachEditPriv == null ? "" : this.attachEditPriv.trim();
   }
 
   public void setAttachEditPriv(String attachEditPriv) {
     this.attachEditPriv = (attachEditPriv == null ? null : attachEditPriv.trim());
   }
 
   public String getAttachEditPrivOnline() {
     return this.attachEditPrivOnline == null ? "" : this.attachEditPrivOnline.trim();
   }
 
   public void setAttachEditPrivOnline(String attachEditPrivOnline) {
     this.attachEditPrivOnline = (attachEditPrivOnline == null ? null : attachEditPrivOnline.trim());
   }
 
   public String getAttachMacroMark() {
     return this.attachMacroMark == null ? "" : this.attachMacroMark.trim();
   }
 
   public void setAttachMacroMark(String attachMacroMark) {
     this.attachMacroMark = (attachMacroMark == null ? null : attachMacroMark.trim());
   }
 
   public Integer getViewPriv() {
     return Integer.valueOf(this.viewPriv);
   }
 
   public void setViewPriv(Integer viewPriv) {
     this.viewPriv = viewPriv.intValue();
   }
 
   public String getWorkingdaysType() {
     return this.workingdaysType == null ? "" : this.workingdaysType.trim();
   }
 
   public int getRemindFlag() {
     return this.remindFlag;
   }
 
   public void setRemindFlag(int remindFlag) {
     this.remindFlag = remindFlag;
   }
 
   public void setWorkingdaysType(String workingdaysType) {
     this.workingdaysType = (workingdaysType == null ? null : workingdaysType.trim());
   }
 
   public String getSetType()
   {
     return this.setType == null ? "chat" : this.setType.trim();
   }
 
   public void setSetType(String setType)
   {
     this.setType = setType;
   }
 
   public FlowTypeModel getFlowTypeModel()
   {
     return this.flowTypeModel;
   }
 
   public void setFlowTypeModel(FlowTypeModel flowTypeModel)
   {
     this.flowTypeModel = flowTypeModel;
   }
 
   public int getSignType() {
     return this.signType;
   }
 
   public void setSignType(int signType) {
     this.signType = signType;
   }
 
   public int getCountersign() {
     return this.countersign;
   }
 
   public void setCountersign(int countersign) {
     this.countersign = countersign;
   }
 
   public String getSettlementOfCondition() {
     return this.settlementOfCondition;
   }
 
   public void setSettlementOfCondition(String settlementOfCondition) {
     this.settlementOfCondition = settlementOfCondition;
   }
 
   public String getITEM_ID()
   {
     return this.ITEM_ID;
   }
 
   public void setITEM_ID(String ITEM_ID)
   {
     this.ITEM_ID = ITEM_ID;
   }
 
   public String getAUTO_PRCS_USER()
   {
     return this.AUTO_PRCS_USER;
   }
 
   public void setAUTO_PRCS_USER(String AUTO_PRCS_USER)
   {
     this.AUTO_PRCS_USER = AUTO_PRCS_USER;
   }
 
   public String getPrcsItemTwo()
   {
     return this.prcsItemTwo;
   }
 
   public void setPrcsItemTwo(String prcsItemTwo)
   {
     this.prcsItemTwo = prcsItemTwo;
   }
 
   public String getPrcsDeptName()
   {
     return this.prcsDeptName;
   }
 
   public void setPrcsDeptName(String prcsDeptName)
   {
     this.prcsDeptName = prcsDeptName;
   }
 
   public String getPrcsUserName()
   {
     return this.prcsUserName;
   }
 
   public void setPrcsUserName(String prcsUserName)
   {
     this.prcsUserName = prcsUserName;
   }
 
   public String getPrcsPrivName()
   {
     return this.prcsPrivName;
   }
 
   public void setPrcsPrivName(String prcsPrivName)
   {
     this.prcsPrivName = prcsPrivName;
   }
 
   public List<FlowTiggerModel> getFlowTiggerModel()
   {
     return this.flowTiggerModel;
   }
 
   public void setFlowTiggerModel(List<FlowTiggerModel> flowTiggerModel)
   {
     this.flowTiggerModel = flowTiggerModel;
   }
 }

