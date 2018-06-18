package com.myoa.model.edu.schoolRollInfo;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class SchoolRollInfo {
	private Integer id;
	private Integer schoolId;
	private String schoolCode;
	private String schoolName;
	private String name;
	private String sex;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date brith;
	private String brithStr;
	private String districtNo;
	private String origin;
	private String nation;
	private String nationality;
	private String cardType;
	private String region;
	private String health;
	private String political;
	private String cardId;
	private String registration;
	private String registrDistrict;
	private Integer learnPhaseId;
	private Integer gradeId;
	private String classId;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date entranceDate;
	private String entranceDateStr;
	private String entranceWay;
	private String studyWay;
	private String address;
	private String mailAddress;
	private String homrAddress;
	private String phone;
	private String postalCode;
	private String onlyChild;
	private String preEducation;
	private String leftChild;
	private String appliedFund;
	private String supplement;
	private String orphan;
	private String martyrsChild;
	private String goDistance;
	private String goWay;
	private String takeBus;
	private String preName;
	private String cardValiDate;
	private String bloodType;
	private String specialty;
	private String auxiliaryNum;
	private String stuNo;
	private String stuSource;
	private String eMail;
	private String homePage;
	private String disabilityType;
	private String governDegree;
	private String regularStudy;
	private String hidden;
	private String member1Name;
	private String member1Relation;
	private String member1RelationDesc;
	private String member1Address;
	private String member1District;
	private String member1Phone;
	private String member1Keeper;
	private String member1CardType;
	private String member1CardId;
	private String member1Nation;
	private String member1Workplace;
	private String member1Post;
	private String member2Name;
	private String member2Relation;
	private String member2RelationDesc;
	private String member2Address;
	private String member2District;
	private String member2Phone;
	private String member2Keeper;
	private String member2CardType;
	private String member2CardId;
	private String member2Nation;
	private String member2Workplace;
	private String member2Post;
	private String migrantChild;
	private String createUser;
	private Date createTime;
	private Date editTime;
	private Integer successCount;
	private String flag;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSchoolCode() {
		return this.schoolCode == null ? "" : this.schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = (schoolCode == null ? null : schoolCode.trim());
	}

	public String getSchoolName() {
		return this.schoolName == null ? "" : this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = (schoolName == null ? null : schoolName.trim());
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = (name == null ? null : name.trim());
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = (sex == null ? null : sex.trim());
	}

	public Date getBrith() {
		return this.brith;
	}

	public void setBrith(Date brith) {
		this.brith = brith;
	}

	public String getDistrictNo() {
		return this.districtNo;
	}

	public void setDistrictNo(String districtNo) {
		this.districtNo = (districtNo == null ? null : districtNo.trim());
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(String origin) {
		this.origin = (origin == null ? null : origin.trim());
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = (nation == null ? null : nation.trim());
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = (nationality == null ? null : nationality.trim());
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = (cardType == null ? null : cardType.trim());
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = (region == null ? null : region.trim());
	}

	public String getHealth() {
		return this.health;
	}

	public void setHealth(String health) {
		this.health = (health == null ? null : health.trim());
	}

	public String getPolitical() {
		return this.political;
	}

	public void setPolitical(String political) {
		this.political = (political == null ? null : political.trim());
	}

	public String getCardId() {
		return this.cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = (cardId == null ? null : cardId.trim());
	}

	public String getRegistration() {
		return this.registration;
	}

	public void setRegistration(String registration) {
		this.registration = (registration == null ? null : registration.trim());
	}

	public String getRegistrDistrict() {
		return this.registrDistrict;
	}

	public void setRegistrDistrict(String registrDistrict) {
		this.registrDistrict = (registrDistrict == null ? null
				: registrDistrict.trim());
	}

	public Integer getLearnPhaseId() {
		return this.learnPhaseId;
	}

	public void setLearnPhaseId(Integer learnPhaseId) {
		this.learnPhaseId = learnPhaseId;
	}

	public Integer getGradeId() {
		return this.gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public String getClassId() {
		return this.classId;
	}

	public void setClassId(String classId) {
		this.classId = (classId == null ? null : classId.trim());
	}

	public Date getEntranceDate() {
		return this.entranceDate;
	}

	public void setEntranceDate(Date entranceDate) {
		this.entranceDate = entranceDate;
	}

	public String getEntranceWay() {
		return this.entranceWay;
	}

	public void setEntranceWay(String entranceWay) {
		this.entranceWay = (entranceWay == null ? null : entranceWay.trim());
	}

	public String getStudyWay() {
		return this.studyWay;
	}

	public void setStudyWay(String studyWay) {
		this.studyWay = (studyWay == null ? null : studyWay.trim());
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = (address == null ? null : address.trim());
	}

	public String getMailAddress() {
		return this.mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = (mailAddress == null ? null : mailAddress.trim());
	}

	public String getHomrAddress() {
		return this.homrAddress;
	}

	public void setHomrAddress(String homrAddress) {
		this.homrAddress = (homrAddress == null ? null : homrAddress.trim());
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = (phone == null ? null : phone.trim());
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = (postalCode == null ? null : postalCode.trim());
	}

	public String getOnlyChild() {
		return this.onlyChild;
	}

	public void setOnlyChild(String onlyChild) {
		this.onlyChild = (onlyChild == null ? null : onlyChild.trim());
	}

	public String getPreEducation() {
		return this.preEducation;
	}

	public void setPreEducation(String preEducation) {
		this.preEducation = (preEducation == null ? null : preEducation.trim());
	}

	public String getLeftChild() {
		return this.leftChild;
	}

	public void setLeftChild(String leftChild) {
		this.leftChild = (leftChild == null ? null : leftChild.trim());
	}

	public String getAppliedFund() {
		return this.appliedFund;
	}

	public void setAppliedFund(String appliedFund) {
		this.appliedFund = (appliedFund == null ? null : appliedFund.trim());
	}

	public String getSupplement() {
		return this.supplement;
	}

	public void setSupplement(String supplement) {
		this.supplement = (supplement == null ? null : supplement.trim());
	}

	public String getOrphan() {
		return this.orphan;
	}

	public void setOrphan(String orphan) {
		this.orphan = (orphan == null ? null : orphan.trim());
	}

	public String getMartyrsChild() {
		return this.martyrsChild;
	}

	public void setMartyrsChild(String martyrsChild) {
		this.martyrsChild = (martyrsChild == null ? null : martyrsChild.trim());
	}

	public String getGoDistance() {
		return this.goDistance;
	}

	public void setGoDistance(String goDistance) {
		this.goDistance = (goDistance == null ? null : goDistance.trim());
	}

	public String getGoWay() {
		return this.goWay;
	}

	public void setGoWay(String goWay) {
		this.goWay = (goWay == null ? null : goWay.trim());
	}

	public String getTakeBus() {
		return this.takeBus;
	}

	public void setTakeBus(String takeBus) {
		this.takeBus = (takeBus == null ? null : takeBus.trim());
	}

	public String getPreName() {
		return this.preName;
	}

	public void setPreName(String preName) {
		this.preName = (preName == null ? null : preName.trim());
	}

	public String getCardValiDate() {
		return this.cardValiDate;
	}

	public void setCardValiDate(String cardValiDate) {
		this.cardValiDate = (cardValiDate == null ? null : cardValiDate.trim());
	}

	public String getBloodType() {
		return this.bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = (bloodType == null ? null : bloodType.trim());
	}

	public String getSpecialty() {
		return this.specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = (specialty == null ? null : specialty.trim());
	}

	public String getAuxiliaryNum() {
		return this.auxiliaryNum;
	}

	public void setAuxiliaryNum(String auxiliaryNum) {
		this.auxiliaryNum = (auxiliaryNum == null ? null : auxiliaryNum.trim());
	}

	public String getStuNo() {
		return this.stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = (stuNo == null ? null : stuNo.trim());
	}

	public String getStuSource() {
		return this.stuSource;
	}

	public void setStuSource(String stuSource) {
		this.stuSource = (stuSource == null ? null : stuSource.trim());
	}

	public String geteMail() {
		return this.eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = (eMail == null ? null : eMail.trim());
	}

	public String getHomePage() {
		return this.homePage;
	}

	public void setHomePage(String homePage) {
		this.homePage = (homePage == null ? null : homePage.trim());
	}

	public String getDisabilityType() {
		return this.disabilityType;
	}

	public void setDisabilityType(String disabilityType) {
		this.disabilityType = (disabilityType == null ? null : disabilityType
				.trim());
	}

	public String getGovernDegree() {
		return this.governDegree;
	}

	public void setGovernDegree(String governDegree) {
		this.governDegree = (governDegree == null ? null : governDegree.trim());
	}

	public String getRegularStudy() {
		return this.regularStudy;
	}

	public void setRegularStudy(String regularStudy) {
		this.regularStudy = (regularStudy == null ? null : regularStudy.trim());
	}

	public String getHidden() {
		return this.hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = (hidden == null ? null : hidden.trim());
	}

	public String getMember1Name() {
		return this.member1Name;
	}

	public void setMember1Name(String member1Name) {
		this.member1Name = (member1Name == null ? null : member1Name.trim());
	}

	public String getMember1Relation() {
		return this.member1Relation;
	}

	public void setMember1Relation(String member1Relation) {
		this.member1Relation = (member1Relation == null ? null
				: member1Relation.trim());
	}

	public String getMember1RelationDesc() {
		return this.member1RelationDesc;
	}

	public void setMember1RelationDesc(String member1RelationDesc) {
		this.member1RelationDesc = (member1RelationDesc == null ? null
				: member1RelationDesc.trim());
	}

	public String getMember1Address() {
		return this.member1Address;
	}

	public void setMember1Address(String member1Address) {
		this.member1Address = (member1Address == null ? null : member1Address
				.trim());
	}

	public String getMember1District() {
		return this.member1District;
	}

	public void setMember1District(String member1District) {
		this.member1District = (member1District == null ? null
				: member1District.trim());
	}

	public String getMember1Phone() {
		return this.member1Phone;
	}

	public void setMember1Phone(String member1Phone) {
		this.member1Phone = (member1Phone == null ? null : member1Phone.trim());
	}

	public String getMember1Keeper() {
		return this.member1Keeper;
	}

	public void setMember1Keeper(String member1Keeper) {
		this.member1Keeper = (member1Keeper == null ? null : member1Keeper
				.trim());
	}

	public String getMember1CardType() {
		return this.member1CardType;
	}

	public void setMember1CardType(String member1CardType) {
		this.member1CardType = (member1CardType == null ? null
				: member1CardType.trim());
	}

	public String getMember1CardId() {
		return this.member1CardId;
	}

	public void setMember1CardId(String member1CardId) {
		this.member1CardId = (member1CardId == null ? null : member1CardId
				.trim());
	}

	public String getMember1Nation() {
		return this.member1Nation;
	}

	public void setMember1Nation(String member1Nation) {
		this.member1Nation = (member1Nation == null ? null : member1Nation
				.trim());
	}

	public String getMember1Workplace() {
		return this.member1Workplace;
	}

	public void setMember1Workplace(String member1Workplace) {
		this.member1Workplace = (member1Workplace == null ? null
				: member1Workplace.trim());
	}

	public String getMember1Post() {
		return this.member1Post;
	}

	public void setMember1Post(String member1Post) {
		this.member1Post = (member1Post == null ? null : member1Post.trim());
	}

	public String getMember2Name() {
		return this.member2Name;
	}

	public void setMember2Name(String member2Name) {
		this.member2Name = (member2Name == null ? null : member2Name.trim());
	}

	public String getMember2Relation() {
		return this.member2Relation;
	}

	public void setMember2Relation(String member2Relation) {
		this.member2Relation = (member2Relation == null ? null
				: member2Relation.trim());
	}

	public String getMember2RelationDesc() {
		return this.member2RelationDesc;
	}

	public void setMember2RelationDesc(String member2RelationDesc) {
		this.member2RelationDesc = (member2RelationDesc == null ? null
				: member2RelationDesc.trim());
	}

	public String getMember2Address() {
		return this.member2Address;
	}

	public void setMember2Address(String member2Address) {
		this.member2Address = (member2Address == null ? null : member2Address
				.trim());
	}

	public String getMember2District() {
		return this.member2District;
	}

	public void setMember2District(String member2District) {
		this.member2District = (member2District == null ? null
				: member2District.trim());
	}

	public String getMember2Phone() {
		return this.member2Phone;
	}

	public void setMember2Phone(String member2Phone) {
		this.member2Phone = (member2Phone == null ? null : member2Phone.trim());
	}

	public String getMember2Keeper() {
		return this.member2Keeper;
	}

	public void setMember2Keeper(String member2Keeper) {
		this.member2Keeper = (member2Keeper == null ? null : member2Keeper
				.trim());
	}

	public String getMember2CardType() {
		return this.member2CardType;
	}

	public void setMember2CardType(String member2CardType) {
		this.member2CardType = (member2CardType == null ? null
				: member2CardType.trim());
	}

	public String getMember2CardId() {
		return this.member2CardId;
	}

	public void setMember2CardId(String member2CardId) {
		this.member2CardId = (member2CardId == null ? null : member2CardId
				.trim());
	}

	public String getMember2Nation() {
		return this.member2Nation;
	}

	public void setMember2Nation(String member2Nation) {
		this.member2Nation = (member2Nation == null ? null : member2Nation
				.trim());
	}

	public String getMember2Workplace() {
		return this.member2Workplace;
	}

	public void setMember2Workplace(String member2Workplace) {
		this.member2Workplace = (member2Workplace == null ? null
				: member2Workplace.trim());
	}

	public String getMember2Post() {
		return this.member2Post;
	}

	public void setMember2Post(String member2Post) {
		this.member2Post = (member2Post == null ? null : member2Post.trim());
	}

	public String getMigrantChild() {
		return this.migrantChild;
	}

	public void setMigrantChild(String migrantChild) {
		this.migrantChild = (migrantChild == null ? null : migrantChild.trim());
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = (createUser == null ? null : createUser.trim());
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getEditTime() {
		return this.editTime;
	}

	public void setEditTime(Date editTime) {
		this.editTime = editTime;
	}

	public String getBrithStr() {
		return this.brithStr;
	}

	public void setBrithStr(String brithStr) {
		this.brithStr = brithStr;
	}

	public String getEntranceDateStr() {
		return this.entranceDateStr;
	}

	public void setEntranceDateStr(String entranceDateStr) {
		this.entranceDateStr = entranceDateStr;
	}

	public Integer getSuccessCount() {
		return this.successCount;
	}

	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Integer getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}
}
