package com.myoa.model.edu.teacher;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class TeacheringInfo {
	private Integer id;
	private String name;
	private String preName;
	private String nation;
	private String sex;
	private String idCardType;
	private String idCard;
	private String ssxx;
	private Integer ssxxId;
	private String ssxx_no;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date jobStartime;
	private String jobStartTimeStr;
	private String political;
	private String pohne;
	private String postCate;
	private String post;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date birth;
	private String birthStr;
	private String origin;
	private String address;
	private String postalAddress;
	private String email;
	private String isInseries;
	private String isInpost;
	private String heighestDegree;
	private String heighestDegreeName;
	private String heighestEdu;
	private String heighestEduMajor;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date majorDate;
	private String majorDateStr;
	private String majorEduSchool;
	private String firstEdu;
	private String firstEduMajor;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date firstEduDate;
	private String firstEduDateStr;
	private String firstEduSchool;
	private String teacherBookType;
	private String teacherBookNo;
	private String getHskbookGrade;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date hskbookDate;
	private String hskbookDateStr;
	private String getMhkbookGrade;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date mhkbookDate;
	private String mhkbookDateStr;
	private String putonghuaLevel;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date putonghuaDate;
	private String putonghuaDateStr;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date startTeachingDate;
	private String startTeachingDateStr;
	private String postEmeployTechnical;
	private String professionalPost;
	private String teachingSection;
	private String teachingGrade;
	private String teachingSubject;
	private String noteachReasion;
	private String teachLanguage;
	private String isNationteacher;
	private String isChineseteacher;
	private String isDoubleteacher;
	private String doubleTeachModel;
	private String isAbility;
	private String isEthnicTeacher;
	private String isSpeciallevelTeacher;
	private String isSpecialTrain;
	private String situation;
	private String isBackoneTeacher;
	private String staffIncrease;
	private String staffDecrease;
	private String personCode;
	private String staffNumber;
	private String nationArea;
	private String birthArea;
	private String maritalStatus;
	private String health;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date joinSchoolTime;
	private String joinSchoolTimeStr;
	private String staffSource;
	private String staffType;
	private String humanForm;
	private String contractSign;
	private String nowPostLevel;
	private String isFulltimeGrd;
	private String isSpecialEduBook;
	private String applicationAbility;
	private String isFreeStudent;
	private String isPartEdu;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date partEduStartime;
	private String partEduStartimeStr;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date partEduEndtime;
	private String partEduEndtimeStr;
	private String isSpecialpostTeacher;
	private String isHeartHealthTeach;
	private Integer setInsertCount;
	private Integer setUpdateCount;
	private String personStatus;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date createTime;
	private String createTimeStr;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date updateTime;
	private String updateTimeStr;
	private String nowBusiness;
	private String ssxxNo;
	private String schoolName;
	private Integer successCount;

	public Integer getSuccessCount() {
		return this.successCount;
	}

	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = (name == null ? null : name.trim());
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = (nation == null ? null : nation.trim());
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = (sex == null ? null : sex.trim());
	}

	public String getIdCardType() {
		return this.idCardType;
	}

	public void setIdCardType(String idCardType) {
		this.idCardType = (idCardType == null ? null : idCardType.trim());
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = (idCard == null ? null : idCard.trim());
	}

	public String getSsxx() {
		return this.ssxx;
	}

	public void setSsxx(String ssxx) {
		this.ssxx = (ssxx == null ? null : ssxx.trim());
	}

	public Date getJobStartime() {
		return this.jobStartime;
	}

	public void setJobStartime(Date jobStartime) {
		this.jobStartime = jobStartime;
	}

	public String getPolitical() {
		return this.political;
	}

	public void setPolitical(String political) {
		this.political = (political == null ? null : political.trim());
	}

	public String getPohne() {
		return this.pohne;
	}

	public void setPohne(String pohne) {
		this.pohne = (pohne == null ? null : pohne.trim());
	}

	public String getPostCate() {
		return this.postCate;
	}

	public void setPostCate(String postCate) {
		this.postCate = (postCate == null ? null : postCate.trim());
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = (post == null ? null : post.trim());
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = (origin == null ? null : origin.trim());
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = (address == null ? null : address.trim());
	}

	public String getPostalAddress() {
		return this.postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = (postalAddress == null ? null : postalAddress
				.trim());
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = (email == null ? null : email.trim());
	}

	public String getIsInseries() {
		return this.isInseries;
	}

	public void setIsInseries(String isInseries) {
		this.isInseries = (isInseries == null ? null : isInseries.trim());
	}

	public String getIsInpost() {
		return this.isInpost;
	}

	public void setIsInpost(String isInpost) {
		this.isInpost = (isInpost == null ? null : isInpost.trim());
	}

	public String getHeighestDegree() {
		return this.heighestDegree;
	}

	public void setHeighestDegree(String heighestDegree) {
		this.heighestDegree = (heighestDegree == null ? null : heighestDegree
				.trim());
	}

	public String getHeighestDegreeName() {
		return this.heighestDegreeName;
	}

	public void setHeighestDegreeName(String heighestDegreeName) {
		this.heighestDegreeName = (heighestDegreeName == null ? null
				: heighestDegreeName.trim());
	}

	public String getHeighestEdu() {
		return this.heighestEdu;
	}

	public void setHeighestEdu(String heighestEdu) {
		this.heighestEdu = (heighestEdu == null ? null : heighestEdu.trim());
	}

	public String getHeighestEduMajor() {
		return this.heighestEduMajor;
	}

	public void setHeighestEduMajor(String heighestEduMajor) {
		this.heighestEduMajor = (heighestEduMajor == null ? null
				: heighestEduMajor.trim());
	}

	public Date getMajorDate() {
		return this.majorDate;
	}

	public void setMajorDate(Date majorDate) {
		this.majorDate = majorDate;
	}

	public String getMajorEduSchool() {
		return this.majorEduSchool;
	}

	public void setMajorEduSchool(String majorEduSchool) {
		this.majorEduSchool = (majorEduSchool == null ? null : majorEduSchool
				.trim());
	}

	public String getFirstEdu() {
		return this.firstEdu;
	}

	public void setFirstEdu(String firstEdu) {
		this.firstEdu = (firstEdu == null ? null : firstEdu.trim());
	}

	public String getFirstEduMajor() {
		return this.firstEduMajor;
	}

	public void setFirstEduMajor(String firstEduMajor) {
		this.firstEduMajor = (firstEduMajor == null ? null : firstEduMajor
				.trim());
	}

	public Date getFirstEduDate() {
		return this.firstEduDate;
	}

	public void setFirstEduDate(Date firstEduDate) {
		this.firstEduDate = firstEduDate;
	}

	public String getFirstEduSchool() {
		return this.firstEduSchool;
	}

	public void setFirstEduSchool(String firstEduSchool) {
		this.firstEduSchool = (firstEduSchool == null ? null : firstEduSchool
				.trim());
	}

	public String getTeacherBookType() {
		return this.teacherBookType;
	}

	public void setTeacherBookType(String teacherBookType) {
		this.teacherBookType = (teacherBookType == null ? null
				: teacherBookType.trim());
	}

	public String getTeacherBookNo() {
		return this.teacherBookNo;
	}

	public void setTeacherBookNo(String teacherBookNo) {
		this.teacherBookNo = (teacherBookNo == null ? null : teacherBookNo
				.trim());
	}

	public String getGetHskbookGrade() {
		return this.getHskbookGrade;
	}

	public void setGetHskbookGrade(String getHskbookGrade) {
		this.getHskbookGrade = (getHskbookGrade == null ? null
				: getHskbookGrade.trim());
	}

	public Date getHskbookDate() {
		return this.hskbookDate;
	}

	public void setHskbookDate(Date hskbookDate) {
		this.hskbookDate = hskbookDate;
	}

	public String getGetMhkbookGrade() {
		return this.getMhkbookGrade;
	}

	public void setGetMhkbookGrade(String getMhkbookGrade) {
		this.getMhkbookGrade = (getMhkbookGrade == null ? null
				: getMhkbookGrade.trim());
	}

	public Date getMhkbookDate() {
		return this.mhkbookDate;
	}

	public void setMhkbookDate(Date mhkbookDate) {
		this.mhkbookDate = mhkbookDate;
	}

	public String getPutonghuaLevel() {
		return this.putonghuaLevel;
	}

	public void setPutonghuaLevel(String putonghuaLevel) {
		this.putonghuaLevel = (putonghuaLevel == null ? null : putonghuaLevel
				.trim());
	}

	public Date getPutonghuaDate() {
		return this.putonghuaDate;
	}

	public void setPutonghuaDate(Date putonghuaDate) {
		this.putonghuaDate = putonghuaDate;
	}

	public Date getStartTeachingDate() {
		return this.startTeachingDate;
	}

	public void setStartTeachingDate(Date startTeachingDate) {
		this.startTeachingDate = startTeachingDate;
	}

	public String getPostEmeployTechnical() {
		return this.postEmeployTechnical;
	}

	public void setPostEmeployTechnical(String postEmeployTechnical) {
		this.postEmeployTechnical = (postEmeployTechnical == null ? null
				: postEmeployTechnical.trim());
	}

	public String getProfessionalPost() {
		return this.professionalPost;
	}

	public void setProfessionalPost(String professionalPost) {
		this.professionalPost = (professionalPost == null ? null
				: professionalPost.trim());
	}

	public String getTeachingSection() {
		return this.teachingSection;
	}

	public void setTeachingSection(String teachingSection) {
		this.teachingSection = (teachingSection == null ? null
				: teachingSection.trim());
	}

	public String getTeachingGrade() {
		return this.teachingGrade;
	}

	public void setTeachingGrade(String teachingGrade) {
		this.teachingGrade = (teachingGrade == null ? null : teachingGrade
				.trim());
	}

	public String getTeachingSubject() {
		return this.teachingSubject;
	}

	public void setTeachingSubject(String teachingSubject) {
		this.teachingSubject = (teachingSubject == null ? null
				: teachingSubject.trim());
	}

	public String getNoteachReasion() {
		return this.noteachReasion;
	}

	public String getPreName() {
		return this.preName;
	}

	public void setPreName(String preName) {
		this.preName = preName;
	}

	public void setNoteachReasion(String noteachReasion) {
		this.noteachReasion = (noteachReasion == null ? null : noteachReasion
				.trim());
	}

	public String getTeachLanguage() {
		return this.teachLanguage;
	}

	public void setTeachLanguage(String teachLanguage) {
		this.teachLanguage = (teachLanguage == null ? null : teachLanguage
				.trim());
	}

	public String getIsNationteacher() {
		return this.isNationteacher;
	}

	public void setIsNationteacher(String isNationteacher) {
		this.isNationteacher = (isNationteacher == null ? null
				: isNationteacher.trim());
	}

	public String getIsChineseteacher() {
		return this.isChineseteacher;
	}

	public void setIsChineseteacher(String isChineseteacher) {
		this.isChineseteacher = (isChineseteacher == null ? null
				: isChineseteacher.trim());
	}

	public String getIsDoubleteacher() {
		return this.isDoubleteacher;
	}

	public void setIsDoubleteacher(String isDoubleteacher) {
		this.isDoubleteacher = (isDoubleteacher == null ? null
				: isDoubleteacher.trim());
	}

	public String getSsxx_no() {
		return this.ssxx_no;
	}

	public void setSsxx_no(String ssxx_no) {
		this.ssxx_no = ssxx_no;
	}

	public String getDoubleTeachModel() {
		return this.doubleTeachModel;
	}

	public void setDoubleTeachModel(String doubleTeachModel) {
		this.doubleTeachModel = (doubleTeachModel == null ? null
				: doubleTeachModel.trim());
	}

	public String getIsAbility() {
		return this.isAbility;
	}

	public void setIsAbility(String isAbility) {
		this.isAbility = (isAbility == null ? null : isAbility.trim());
	}

	public String getIsEthnicTeacher() {
		return this.isEthnicTeacher;
	}

	public void setIsEthnicTeacher(String isEthnicTeacher) {
		this.isEthnicTeacher = (isEthnicTeacher == null ? null
				: isEthnicTeacher.trim());
	}

	public String getIsSpeciallevelTeacher() {
		return this.isSpeciallevelTeacher;
	}

	public void setIsSpeciallevelTeacher(String isSpeciallevelTeacher) {
		this.isSpeciallevelTeacher = (isSpeciallevelTeacher == null ? null
				: isSpeciallevelTeacher.trim());
	}

	public String getIsSpecialTrain() {
		return this.isSpecialTrain;
	}

	public void setIsSpecialTrain(String isSpecialTrain) {
		this.isSpecialTrain = (isSpecialTrain == null ? null : isSpecialTrain
				.trim());
	}

	public String getSituation() {
		return this.situation;
	}

	public void setSituation(String situation) {
		this.situation = (situation == null ? null : situation.trim());
	}

	public String getIsBackoneTeacher() {
		return this.isBackoneTeacher;
	}

	public void setIsBackoneTeacher(String isBackoneTeacher) {
		this.isBackoneTeacher = (isBackoneTeacher == null ? null
				: isBackoneTeacher.trim());
	}

	public String getStaffIncrease() {
		return this.staffIncrease;
	}

	public void setStaffIncrease(String staffIncrease) {
		this.staffIncrease = (staffIncrease == null ? null : staffIncrease
				.trim());
	}

	public String getStaffDecrease() {
		return this.staffDecrease;
	}

	public void setStaffDecrease(String staffDecrease) {
		this.staffDecrease = (staffDecrease == null ? null : staffDecrease
				.trim());
	}

	public String getPersonCode() {
		return this.personCode;
	}

	public void setPersonCode(String personCode) {
		this.personCode = (personCode == null ? null : personCode.trim());
	}

	public String getStaffNumber() {
		return this.staffNumber;
	}

	public void setStaffNumber(String staffNumber) {
		this.staffNumber = (staffNumber == null ? null : staffNumber.trim());
	}

	public String getNationArea() {
		return this.nationArea;
	}

	public void setNationArea(String nationArea) {
		this.nationArea = (nationArea == null ? null : nationArea.trim());
	}

	public String getBirthArea() {
		return this.birthArea;
	}

	public void setBirthArea(String birthArea) {
		this.birthArea = (birthArea == null ? null : birthArea.trim());
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = (maritalStatus == null ? null : maritalStatus
				.trim());
	}

	public String getHealth() {
		return this.health;
	}

	public void setHealth(String health) {
		this.health = (health == null ? null : health.trim());
	}

	public Date getJoinSchoolTime() {
		return this.joinSchoolTime;
	}

	public void setJoinSchoolTime(Date joinSchoolTime) {
		this.joinSchoolTime = joinSchoolTime;
	}

	public String getStaffSource() {
		return this.staffSource;
	}

	public void setStaffSource(String staffSource) {
		this.staffSource = (staffSource == null ? null : staffSource.trim());
	}

	public String getStaffType() {
		return this.staffType;
	}

	public void setStaffType(String staffType) {
		this.staffType = (staffType == null ? null : staffType.trim());
	}

	public String getHumanForm() {
		return this.humanForm;
	}

	public void setHumanForm(String humanForm) {
		this.humanForm = (humanForm == null ? null : humanForm.trim());
	}

	public String getContractSign() {
		return this.contractSign;
	}

	public void setContractSign(String contractSign) {
		this.contractSign = (contractSign == null ? null : contractSign.trim());
	}

	public String getNowPostLevel() {
		return this.nowPostLevel;
	}

	public void setNowPostLevel(String nowPostLevel) {
		this.nowPostLevel = (nowPostLevel == null ? null : nowPostLevel.trim());
	}

	public String getIsFulltimeGrd() {
		return this.isFulltimeGrd;
	}

	public void setIsFulltimeGrd(String isFulltimeGrd) {
		this.isFulltimeGrd = (isFulltimeGrd == null ? null : isFulltimeGrd
				.trim());
	}

	public String getIsSpecialEduBook() {
		return this.isSpecialEduBook;
	}

	public void setIsSpecialEduBook(String isSpecialEduBook) {
		this.isSpecialEduBook = (isSpecialEduBook == null ? null
				: isSpecialEduBook.trim());
	}

	public String getApplicationAbility() {
		return this.applicationAbility;
	}

	public void setApplicationAbility(String applicationAbility) {
		this.applicationAbility = (applicationAbility == null ? null
				: applicationAbility.trim());
	}

	public String getIsFreeStudent() {
		return this.isFreeStudent;
	}

	public void setIsFreeStudent(String isFreeStudent) {
		this.isFreeStudent = (isFreeStudent == null ? null : isFreeStudent
				.trim());
	}

	public String getIsPartEdu() {
		return this.isPartEdu;
	}

	public void setIsPartEdu(String isPartEdu) {
		this.isPartEdu = (isPartEdu == null ? null : isPartEdu.trim());
	}

	public Date getPartEduStartime() {
		return this.partEduStartime;
	}

	public void setPartEduStartime(Date partEduStartime) {
		this.partEduStartime = partEduStartime;
	}

	public Date getPartEduEndtime() {
		return this.partEduEndtime;
	}

	public void setPartEduEndtime(Date partEduEndtime) {
		this.partEduEndtime = partEduEndtime;
	}

	public String getIsSpecialpostTeacher() {
		return this.isSpecialpostTeacher;
	}

	public void setIsSpecialpostTeacher(String isSpecialpostTeacher) {
		this.isSpecialpostTeacher = (isSpecialpostTeacher == null ? null
				: isSpecialpostTeacher.trim());
	}

	public String getIsHeartHealthTeach() {
		return this.isHeartHealthTeach;
	}

	public void setIsHeartHealthTeach(String isHeartHealthTeach) {
		this.isHeartHealthTeach = (isHeartHealthTeach == null ? null
				: isHeartHealthTeach.trim());
	}

	public String getPersonStatus() {
		return this.personStatus;
	}

	public void setPersonStatus(String personStatus) {
		this.personStatus = (personStatus == null ? null : personStatus.trim());
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getNowBusiness() {
		return this.nowBusiness;
	}

	public void setNowBusiness(String nowBusiness) {
		this.nowBusiness = (nowBusiness == null ? null : nowBusiness.trim());
	}

	public String getSsxxNo() {
		return this.ssxxNo;
	}

	public void setSsxxNo(String ssxxNo) {
		this.ssxxNo = ssxxNo;
	}

	public String getSchoolName() {
		return this.schoolName == null ? "" : this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Integer getSetInsertCount() {
		return this.setInsertCount;
	}

	public void setSetInsertCount(Integer setInsertCount) {
		this.setInsertCount = setInsertCount;
	}

	public Integer getSetUpdateCount() {
		return this.setUpdateCount;
	}

	public void setSetUpdateCount(Integer setUpdateCount) {
		this.setUpdateCount = setUpdateCount;
	}

	public String getJobStartTimeStr() {
		return this.jobStartTimeStr;
	}

	public void setJobStartTimeStr(String jobStartTimeStr) {
		this.jobStartTimeStr = jobStartTimeStr;
	}

	public String getBirthStr() {
		return this.birthStr;
	}

	public void setBirthStr(String birthStr) {
		this.birthStr = birthStr;
	}

	public String getMajorDateStr() {
		return this.majorDateStr;
	}

	public void setMajorDateStr(String majorDateStr) {
		this.majorDateStr = majorDateStr;
	}

	public String getFirstEduDateStr() {
		return this.firstEduDateStr;
	}

	public void setFirstEduDateStr(String firstEduDateStr) {
		this.firstEduDateStr = firstEduDateStr;
	}

	public String getHskbookDateStr() {
		return this.hskbookDateStr;
	}

	public void setHskbookDateStr(String hskbookDateStr) {
		this.hskbookDateStr = hskbookDateStr;
	}

	public String getMhkbookDateStr() {
		return this.mhkbookDateStr;
	}

	public void setMhkbookDateStr(String mhkbookDateStr) {
		this.mhkbookDateStr = mhkbookDateStr;
	}

	public String getPutonghuaDateStr() {
		return this.putonghuaDateStr;
	}

	public void setPutonghuaDateStr(String putonghuaDateStr) {
		this.putonghuaDateStr = putonghuaDateStr;
	}

	public String getStartTeachingDateStr() {
		return this.startTeachingDateStr;
	}

	public void setStartTeachingDateStr(String startTeachingDateStr) {
		this.startTeachingDateStr = startTeachingDateStr;
	}

	public String getJoinSchoolTimeStr() {
		return this.joinSchoolTimeStr;
	}

	public void setJoinSchoolTimeStr(String joinSchoolTimeStr) {
		this.joinSchoolTimeStr = joinSchoolTimeStr;
	}

	public String getPartEduStartimeStr() {
		return this.partEduStartimeStr;
	}

	public void setPartEduStartimeStr(String partEduStartimeStr) {
		this.partEduStartimeStr = partEduStartimeStr;
	}

	public String getPartEduEndtimeStr() {
		return this.partEduEndtimeStr;
	}

	public void setPartEduEndtimeStr(String partEduEndtimeStr) {
		this.partEduEndtimeStr = partEduEndtimeStr;
	}

	public String getCreateTimeStr() {
		return this.createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public String getUpdateTimeStr() {
		return this.updateTimeStr;
	}

	public void setUpdateTimeStr(String updateTimeStr) {
		this.updateTimeStr = updateTimeStr;
	}

	public Integer getSsxxId() {
		return this.ssxxId;
	}

	public void setSsxxId(Integer ssxxId) {
		this.ssxxId = ssxxId;
	}
}