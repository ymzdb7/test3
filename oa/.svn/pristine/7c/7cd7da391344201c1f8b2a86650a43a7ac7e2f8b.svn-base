 package com.myoa.model.users;
 
 import com.alibaba.fastjson.annotation.JSONField;
import com.myoa.model.common.SysPara;
import com.myoa.model.department.Department;
import com.myoa.model.modulePriv.ModulePriv;
import com.myoa.model.role.Role;
import com.myoa.util.common.StringUtils;

 import java.text.SimpleDateFormat;
 import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
 
 public class Users
 {
   private Integer uid;
   private String userId;
   private String userName;
   private String userNameIndex;
   private String byname;
   private String useingKey;
   private String usingFinger;
   private String password;
   private String keySn;
   private String secureKeySn;
   private Integer userPriv;
   private Short userPrivNo;
   private String userPrivName;
   private String postPriv;
   private String postDept;
   private Integer deptId;
   private String deptIdOther;
   private String deptOtherName;
   private String sex;
 
   @DateTimeFormat(pattern="yyyy-MM-dd")
   @JSONField(format="yyyy-MM-dd")
   private Date birthday;
   private String birthdayStr;
   private String isLunar;
   private String telNoDept;
   private String faxNoDept;
   private String addHome;
   private String postNoHome;
   private String telNoHome;
   private String mobilNo;
   private String bpNo;
   private String email;
   private String oicqNo;
   private String icqNo;
   private String msn;
   private String avatar;
   private String avatar128;
   private String callSound;
 
   @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
   @JSONField(format="yyyy-MM-dd HH:mm:ss")
   private Date lastVisitTime;
   private String smsOn;
   private String menuType;
   private Date lastPassTime;
   private Byte theme;
   private String portal;
   private String panel;
   private Integer online;
   private String onStatus;
   private String attendStatus;
   private String mobilNoHidden;
   private String mytableLeft;
   private String mytableRight;
   private String userPrivOther;
   private String userPrivOtherName;
   private Short userNo;
   private Byte notLogin;
   private String notViewUser;
   private String notViewTable;
   private String notSearch;
   private String bkground;
   private String bindIp;
   private String lastVisitIp;
   private String menuImage;
   private String weatherCity;
   private String remark;
   private String menuExpand;
   private String myStatus;
   private String limitLogin;
   private String photo;
   private Byte imRange;
   private Date leaveTime;
   private Integer secretLevel;
   private Integer notMobileLogin;
   private String manageModuleType;
   private Byte userPrivType;
   private String userManageOrgs;
   private String shortcut;
   private String myRss;
   private String userPara;
   private String photoName;
   private String showRss;
   private Department dep;
   private String deptName;
   private String companyName;
   private SysPara para;
   private String name;
   private String funcIdStr;
   private String departmentPhone;
   private Short dutyType;
   private String idNumber;
   private String traNumber;
   private String subject;
   private String interfaceTitle;
   private String jobPosition;
   private String appPropulsionId;
   private String gimPort;
   private String gimHost;
   private String post;
   private String sexName;
   private String settlementNo;
   private String userPrivs;
   private String deptIds;
   private Integer postId;
   private Integer jobId;
   private String postName;
   private String jobName;
   private String idleTime;
   private UserExt userExt;
   private ModulePriv modulePriv;
   private int insertCount;
   private int updateCount;
   private String saveMsg;
   private String imServerPort;
   private String imRegisterIp;
   private String dutyTypeName;
   private String roleAuxiliaryName;
   private Role role;
 
   public String getPostName()
   {
     return this.postName;
   }
 
   public void setPostName(String postName) {
     this.postName = postName;
   }
 
   public String getJobName() {
     return this.jobName;
   }
 
   public void setJobName(String jobName) {
     this.jobName = jobName;
   }
 
   public String getUserPrivs() {
     return this.userPrivs;
   }
 
   public void setUserPrivs(String userPrivs) {
     this.userPrivs = userPrivs;
   }
 
   public String getDeptIds() {
     return this.deptIds;
   }
 
   public void setDeptIds(String deptIds) {
     this.deptIds = deptIds;
   }
 
   public void setSettlementNo(String settlementNo) {
     this.settlementNo = settlementNo;
   }
 
   public String getSettlementNo() {
     return this.settlementNo;
   }
 
   public String getSexName() {
     if ("0".equals(this.sex))
       this.sexName = "男";
     else if ("1".equals(this.sex))
       this.sexName = "女";
     else {
       this.sexName = "";
     }
     return this.sexName;
   }
 
   public void setSexName(String sexName) {
     this.sexName = sexName;
   }
 
   public String getPost() {
     return this.post;
   }
 
   public void setPost(String post) {
     this.post = post;
   }
 
   public String getGimPort() {
     return this.gimPort;
   }
 
   public void setGimPort(String gimPort) {
     this.gimPort = gimPort;
   }
 
   public String getGimHost() {
     return this.gimHost == null ? "" : this.gimHost;
   }
 
   public void setGimHost(String gimHost) {
     this.gimHost = gimHost;
   }
 
   public String getAppPropulsionId() {
     return this.appPropulsionId;
   }
 
   public void setAppPropulsionId(String appPropulsionId) {
     this.appPropulsionId = appPropulsionId;
   }
 
   public String getInterfaceTitle() {
     return this.interfaceTitle;
   }
 
   public void setInterfaceTitle(String interfaceTitle) {
     this.interfaceTitle = interfaceTitle;
   }
 
   public String getIdNumber() {
     return this.idNumber;
   }
 
   public void setIdNumber(String idNumber) {
     this.idNumber = idNumber;
   }
 
   public String getTraNumber() {
     return this.traNumber;
   }
 
   public void setTraNumber(String traNumber) {
     this.traNumber = traNumber;
   }
 
   public String getSubject() {
     return this.subject;
   }
 
   public void setSubject(String subject) {
     this.subject = subject;
   }
 
   public String getPhotoName()
   {
     return this.photoName == null ? "" : this.photoName;
   }
 
   public void setPhotoName(String photoName) {
     this.photoName = photoName;
   }
 
   public String getDutyTypeName() {
     return this.dutyTypeName == null ? "" : this.dutyTypeName;
   }
 
   public void setDutyTypeName(String dutyTypeName) {
     this.dutyTypeName = dutyTypeName;
   }
 
   public String getImRegisterIp() {
     return this.imRegisterIp;
   }
 
   public void setImRegisterIp(String imRegisterIp) {
     this.imRegisterIp = imRegisterIp;
   }
 
   public String getImServerPort() {
     return this.imServerPort;
   }
 
   public void setImServerPort(String imServerPort) {
     this.imServerPort = imServerPort;
   }
 
   public String getSaveMsg() {
     return this.saveMsg;
   }
 
   public void setSaveMsg(String saveMsg) {
     this.saveMsg = saveMsg;
   }
 
   public int getInsertCount() {
     return this.insertCount;
   }
 
   public void setInsertCount(int insertCount) {
     this.insertCount = insertCount;
   }
 
   public int getUpdateCount() {
     return this.updateCount;
   }
 
   public void setUpdateCount(int updateCount) {
     this.updateCount = updateCount;
   }
 
   public String getDeptOtherName()
   {
     return this.deptOtherName == null ? "" : this.deptOtherName;
   }
 
   public void setDeptOtherName(String deptOtherName) {
     this.deptOtherName = deptOtherName;
   }
 
   public String getUserPrivOtherName() {
     return this.userPrivOtherName == null ? "" : this.userPrivOtherName;
   }
 
   public void setUserPrivOtherName(String userPrivOtherName) {
     this.userPrivOtherName = userPrivOtherName;
   }
 
   public ModulePriv getModulePriv() {
     return this.modulePriv;
   }
 
   public void setModulePriv(ModulePriv modulePriv) {
     this.modulePriv = modulePriv;
   }
 
   public UserExt getUserExt() {
     return this.userExt;
   }
 
   public void setUserExt(UserExt userExt) {
     this.userExt = userExt;
   }
 
   public String getIdleTime() {
     return this.idleTime;
   }
 
   public void setIdleTime(String idleTime) {
     this.idleTime = idleTime;
   }
 
   public Short getDutyType() {
     return this.dutyType;
   }
 
   public void setDutyType(Short dutyType) {
     this.dutyType = dutyType;
   }
 
   public String getDepartmentPhone() {
     return this.departmentPhone == null ? "" : this.departmentPhone;
   }
 
   public void setDepartmentPhone(String departmentPhone) {
     this.departmentPhone = departmentPhone;
   }
 
   public String getRoleAuxiliaryName()
   {
     return this.roleAuxiliaryName == null ? "" : this.roleAuxiliaryName;
   }
 
   public void setRoleAuxiliaryName(String roleAuxiliaryName) {
     this.roleAuxiliaryName = roleAuxiliaryName;
   }
 
   public String getFuncIdStr() {
     return this.funcIdStr == null ? "" : this.funcIdStr.trim();
   }
 
   public void setFuncIdStr(String funcIdStr) {
     this.funcIdStr = funcIdStr;
   }
 
   public String getName() {
     return this.name == null ? "" : this.name.trim();
   }
 
   public void setName(String name) {
     this.name = name;
   }
 
   public String getShowRss() {
     return this.showRss == null ? "1" : this.showRss.trim();
   }
 
   public void setShowRss(String showRss) {
     this.showRss = showRss;
   }
 
   public SysPara getPara() {
     return this.para;
   }
 
   public void setPara(SysPara para) {
     this.para = para;
   }
 
   public String getCompanyName()
   {
     return this.companyName == null ? "" : this.companyName.trim();
   }
 
   public void setCompanyName(String companyName) {
     this.companyName = companyName;
   }
 
   public String getDeptName() {
     return this.deptName == null ? "" : this.deptName.trim();
   }
 
   public void setDeptName(String deptName) {
     this.deptName = deptName;
   }
 
   public Department getDep()
   {
     return this.dep;
   }
 
   public void setDep(Department dep)
   {
     this.dep = dep;
   }
 
   public Role getRole() {
     return this.role;
   }
 
   public void setRole(Role role) {
     this.role = role;
   }
 
   public Integer getUid() {
     return this.uid;
   }
 
   public void setUid(Integer uid) {
     this.uid = uid;
   }
 
   public String getUserId() {
     return this.userId;
   }
 
   public void setUserId(String userId) {
     this.userId = userId;
   }
 
   public String getUserName() {
     return this.userName;
   }
 
   public void setUserName(String userName) {
     this.userName = userName;
   }
 
   public String getUserNameIndex() {
     return this.userNameIndex;
   }
 
   public void setUserNameIndex(String userNameIndex) {
     this.userNameIndex = userNameIndex;
   }
 
   public String getByname() {
     return this.byname == null ? "" : this.byname.trim();
   }
 
   public void setByname(String byname) {
     this.byname = byname;
   }
 
   public String getUseingKey() {
     return this.useingKey == null ? "" : this.useingKey.trim();
   }
 
   public void setUseingKey(String useingKey) {
     this.useingKey = useingKey;
   }
 
   public String getUsingFinger() {
     return this.usingFinger == null ? "" : this.usingFinger.trim();
   }
 
   public void setUsingFinger(String usingFinger) {
     this.usingFinger = usingFinger;
   }
 
   public String getPassword() {
     return this.password;
   }
 
   public void setPassword(String password) {
     this.password = password;
   }
 
   public String getKeySn() {
     return this.keySn == null ? "" : this.keySn.trim();
   }
 
   public void setKeySn(String keySn) {
     this.keySn = keySn;
   }
 
   public String getSecureKeySn() {
     return this.secureKeySn == null ? "" : this.secureKeySn.trim();
   }
 
   public void setSecureKeySn(String secureKeySn) {
     this.secureKeySn = secureKeySn;
   }
 
   public Integer getUserPriv() {
     return this.userPriv;
   }
 
   public void setUserPriv(Integer userPriv) {
     this.userPriv = userPriv;
   }
 
   public Short getUserPrivNo() {
     return this.userPrivNo;
   }
 
   public void setUserPrivNo(Short userPrivNo) {
     this.userPrivNo = userPrivNo;
   }
 
   public String getUserPrivName() {
     return this.userPrivName == null ? "" : this.userPrivName.trim();
   }
 
   public void setUserPrivName(String userPrivName) {
     this.userPrivName = userPrivName;
   }
 
   public String getPostPriv() {
     return this.postPriv;
   }
 
   public void setPostPriv(String postPriv) {
     this.postPriv = postPriv;
   }
 
   public String getPostDept() {
     return this.postDept == null ? "" : this.postDept.trim();
   }
 
   public void setPostDept(String postDept) {
     this.postDept = postDept;
   }
 
   public Integer getDeptId() {
     return this.deptId;
   }
 
   public void setDeptId(Integer deptId) {
     this.deptId = deptId;
   }
 
   public String getDeptIdOther() {
     return this.deptIdOther == null ? "" : this.deptIdOther.trim();
   }
 
   public void setDeptIdOther(String deptIdOther) {
     this.deptIdOther = deptIdOther;
   }
 
   public String getSex() {
     return this.sex == null ? "" : this.sex.trim();
   }
 
   public void setSex(String sex) {
     this.sex = sex;
   }
 
   public Date getBirthday() {
     return this.birthday;
   }
 
   public void setBirthday(Date birthday) {
     this.birthday = birthday;
   }
 
   public String getIsLunar() {
     return this.isLunar == null ? "0" : this.isLunar;
   }
 
   public void setIsLunar(String isLunar) {
     this.isLunar = isLunar;
   }
 
   public String getTelNoDept() {
     return this.telNoDept == null ? "" : this.telNoDept.trim();
   }
 
   public void setTelNoDept(String telNoDept) {
     this.telNoDept = telNoDept;
   }
 
   public String getFaxNoDept() {
     return this.faxNoDept == null ? "" : this.faxNoDept;
   }
 
   public void setFaxNoDept(String faxNoDept) {
     this.faxNoDept = faxNoDept;
   }
 
   public String getAddHome() {
     return this.addHome == null ? "" : this.addHome.trim();
   }
 
   public void setAddHome(String addHome) {
     this.addHome = addHome;
   }
 
   public String getPostNoHome() {
     return this.postNoHome == null ? "" : this.postNoHome.trim();
   }
 
   public void setPostNoHome(String postNoHome) {
     this.postNoHome = postNoHome;
   }
 
   public String getTelNoHome() {
     return this.telNoHome == null ? "" : this.telNoHome.trim();
   }
 
   public void setTelNoHome(String telNoHome) {
     this.telNoHome = telNoHome;
   }
 
   public String getMobilNo() {
     return this.mobilNo == null ? "" : this.mobilNo.trim();
   }
 
   public void setMobilNo(String mobilNo) {
     this.mobilNo = mobilNo;
   }
 
   public String getBpNo() {
     return this.bpNo == null ? "" : this.bpNo;
   }
 
   public void setBpNo(String bpNo) {
     this.bpNo = bpNo;
   }
 
   public String getEmail() {
     return this.email == null ? "" : this.email.trim();
   }
 
   public void setEmail(String email) {
     this.email = email;
   }
 
   public String getOicqNo() {
     return this.oicqNo == null ? "" : this.oicqNo;
   }
 
   public void setOicqNo(String oicqNo) {
     this.oicqNo = oicqNo;
   }
 
   public String getIcqNo() {
     return this.icqNo == null ? "" : this.icqNo;
   }
 
   public void setIcqNo(String icqNo) {
     this.icqNo = icqNo;
   }
 
   public String getMsn() {
     return this.msn == null ? "" : this.msn;
   }
 
   public void setMsn(String msn) {
     this.msn = msn;
   }
 
   public String getAvatar() {
     String sexAvatar = "";
     if (StringUtils.checkNull(getSex()).booleanValue()) {
       sexAvatar = "0";
     }
     else if ("1".equals(getSex()))
       sexAvatar = "1";
     else {
       sexAvatar = "0";
     }
 
     if (StringUtils.checkNull(this.avatar).booleanValue()) {
       return sexAvatar;
     }
     return this.avatar;
   }
 
   public void setAvatar(String avatar) {
     this.avatar = avatar;
   }
 
   public String getCallSound() {
     return this.callSound == null ? "" : this.callSound.trim();
   }
 
   public void setCallSound(String callSound) {
     this.callSound = callSound;
   }
 
   public Date getLastVisitTime() {
     return this.lastVisitTime;
   }
 
   public void setLastVisitTime(Date lastVisitTime) {
     this.lastVisitTime = lastVisitTime;
   }
 
   public String getSmsOn() {
     return this.smsOn == null ? "" : this.smsOn.trim();
   }
 
   public void setSmsOn(String smsOn) {
     this.smsOn = smsOn;
   }
 
   public String getMenuType() {
     return this.menuType == null ? "" : this.menuType;
   }
 
   public void setMenuType(String menuType) {
     this.menuType = menuType;
   }
 
   public Date getLastPassTime() {
     return this.lastPassTime;
   }
 
   public void setLastPassTime(Date lastPassTime) {
     this.lastPassTime = lastPassTime;
   }
 
   public Byte getTheme() {
     return Byte.valueOf(this.theme == null ? 0 : this.theme.byteValue());
   }
 
   public void setTheme(Byte theme) {
     this.theme = theme;
   }
 
   public String getPortal() {
     return this.portal == null ? "" : this.portal.trim();
   }
 
   public void setPortal(String portal) {
     this.portal = portal;
   }
 
   public String getPanel() {
     return this.panel == null ? "1" : this.panel.trim();
   }
 
   public void setPanel(String panel) {
     this.panel = panel;
   }
 
   public Integer getOnline() {
     return Integer.valueOf(this.online == null ? 0 : this.online.intValue());
   }
 
   public void setOnline(Integer online) {
     this.online = online;
   }
 
   public String getOnStatus() {
     return this.onStatus == null ? "" : this.onStatus.trim();
   }
 
   public void setOnStatus(String onStatus) {
     this.onStatus = onStatus;
   }
 
   public String getAttendStatus() {
     return this.attendStatus == null ? "" : this.attendStatus.trim();
   }
 
   public void setAttendStatus(String attendStatus) {
     this.attendStatus = attendStatus;
   }
 
   public String getMobilNoHidden() {
     return this.mobilNoHidden == null ? "" : this.mobilNoHidden;
   }
 
   public void setMobilNoHidden(String mobilNoHidden) {
     this.mobilNoHidden = mobilNoHidden;
   }
 
   public String getMytableLeft() {
     return this.mytableLeft == null ? "ALL" : this.mytableLeft;
   }
 
   public void setMytableLeft(String mytableLeft) {
     this.mytableLeft = mytableLeft;
   }
 
   public String getMytableRight() {
     return this.mytableRight == null ? "ALL" : this.mytableRight;
   }
 
   public void setMytableRight(String mytableRight) {
     this.mytableRight = mytableRight;
   }
 
   public String getUserPrivOther() {
     return this.userPrivOther == null ? "" : this.userPrivOther;
   }
 
   public void setUserPrivOther(String userPrivOther) {
     this.userPrivOther = userPrivOther;
   }
 
   public Short getUserNo() {
     return Short.valueOf(this.userNo == null ? 10 : this.userNo.shortValue());
   }
 
   public void setUserNo(Short userNo) {
     this.userNo = userNo;
   }
 
   public Byte getNotLogin() {
     return this.notLogin;
   }
 
   public void setNotLogin(Byte notLogin) {
     this.notLogin = notLogin;
   }
 
   public String getNotViewUser() {
     return this.notViewUser == null ? "" : this.notViewUser;
   }
 
   public void setNotViewUser(String notViewUser) {
     this.notViewUser = notViewUser;
   }
 
   public String getNotViewTable() {
     return this.notViewTable == null ? "" : this.notViewTable;
   }
 
   public void setNotViewTable(String notViewTable) {
     this.notViewTable = notViewTable;
   }
 
   public String getNotSearch() {
     return this.notSearch == null ? "0" : this.notSearch;
   }
 
   public void setNotSearch(String notSearch) {
     this.notSearch = notSearch;
   }
 
   public String getBkground() {
     return this.bkground == null ? "" : this.bkground.trim();
   }
 
   public void setBkground(String bkground) {
     this.bkground = bkground;
   }
 
   public String getBindIp() {
     return this.bindIp == null ? "" : this.bindIp.trim();
   }
 
   public void setBindIp(String bindIp) {
     this.bindIp = bindIp;
   }
 
   public String getLastVisitIp() {
     return this.lastVisitIp == null ? "" : this.lastVisitIp.trim();
   }
 
   public void setLastVisitIp(String lastVisitIp) {
     this.lastVisitIp = lastVisitIp;
   }
 
   public String getMenuImage() {
     return this.menuImage == null ? "0" : this.menuImage.trim();
   }
 
   public void setMenuImage(String menuImage) {
     this.menuImage = menuImage;
   }
 
   public String getWeatherCity() {
     return this.weatherCity;
   }
 
   public void setWeatherCity(String weatherCity) {
     this.weatherCity = weatherCity;
   }
 
   public String getRemark() {
     return this.remark == null ? "" : this.remark.trim();
   }
 
   public void setRemark(String remark) {
     this.remark = remark;
   }
 
   public String getMenuExpand() {
     return this.menuExpand == null ? "" : this.menuExpand.trim();
   }
 
   public void setMenuExpand(String menuExpand) {
     this.menuExpand = menuExpand;
   }
 
   public String getMyStatus() {
     return this.myStatus == null ? "" : this.myStatus.trim();
   }
 
   public void setMyStatus(String myStatus) {
     this.myStatus = myStatus;
   }
 
   public String getLimitLogin() {
     return this.limitLogin == null ? "0" : this.limitLogin.trim();
   }
 
   public void setLimitLogin(String limitLogin) {
     this.limitLogin = limitLogin;
   }
 
   public String getPhoto() {
     return this.photo == null ? "" : this.photo.trim();
   }
 
   public void setPhoto(String photo) {
     this.photo = photo;
   }
 
   public Byte getImRange() {
     return this.imRange;
   }
 
   public void setImRange(Byte imRange) {
     this.imRange = imRange;
   }
 
   public Date getLeaveTime() {
     return this.leaveTime;
   }
 
   public void setLeaveTime(Date leaveTime) {
     this.leaveTime = leaveTime;
   }
 
   public Integer getSecretLevel() {
     return Integer.valueOf(this.secretLevel == null ? 0 : this.secretLevel.intValue());
   }
 
   public void setSecretLevel(Integer secretLevel) {
     this.secretLevel = secretLevel;
   }
 
   public Integer getNotMobileLogin() {
     return Integer.valueOf(this.notMobileLogin == null ? 0 : this.notMobileLogin.intValue());
   }
 
   public void setNotMobileLogin(Integer notMobileLogin) {
     this.notMobileLogin = notMobileLogin;
   }
 
   public String getManageModuleType() {
     return this.manageModuleType == null ? "" : this.manageModuleType.trim();
   }
 
   public void setManageModuleType(String manageModuleType) {
     this.manageModuleType = manageModuleType;
   }
 
   public Byte getUserPrivType() {
     return Byte.valueOf(this.userPrivType == null ? 0 : this.userPrivType.byteValue());
   }
 
   public void setUserPrivType(Byte userPrivType) {
     this.userPrivType = userPrivType;
   }
 
   public String getUserManageOrgs() {
     return this.userManageOrgs == null ? "" : this.userManageOrgs.trim();
   }
 
   public void setUserManageOrgs(String userManageOrgs) {
     this.userManageOrgs = userManageOrgs;
   }
 
   public String getShortcut() {
     return this.shortcut == null ? "" : this.shortcut.trim();
   }
 
   public void setShortcut(String shortcut) {
     this.shortcut = shortcut;
   }
 
   public String getMyRss() {
     return this.myRss == null ? "" : this.myRss.trim();
   }
 
   public void setMyRss(String myRss) {
     this.myRss = myRss;
   }
 
   public String getUserPara() {
     return this.userPara == null ? "" : this.userPara.trim();
   }
 
   public void setUserPara(String userPara) {
     this.userPara = userPara;
   }
 
   public String getBirthdayStr() {
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
     if (this.birthday != null) {
       return this.birthdayStr = sdf.format(this.birthday);
     }
     return "";
   }
 
   public void setBirthdayStr(String birthdayStr)
   {
     this.birthdayStr = birthdayStr;
   }
 
   public String getJobPosition() {
     return this.jobPosition == null ? "" : this.jobPosition;
   }
 
   public void setJobPosition(String jobPosition) {
     this.jobPosition = jobPosition;
   }
 
   public String getAvatar128() {
     return this.avatar128;
   }
 
   public void setAvatar128(String avatar128) {
     this.avatar128 = avatar128;
   }
 
   public Integer getPostId() {
     return this.postId;
   }
 
   public void setPostId(Integer postId) {
     this.postId = postId;
   }
 
   public Integer getJobId() {
     return this.jobId;
   }
 
   public void setJobId(Integer jobId) {
     this.jobId = jobId;
   }
 }

