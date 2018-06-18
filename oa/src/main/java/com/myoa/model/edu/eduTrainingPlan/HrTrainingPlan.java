package com.myoa.model.edu.eduTrainingPlan;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@TableName("hr_training_plan")
public class HrTrainingPlan extends Model<HrTrainingPlan> {
	private static final long serialVersionUID = 1L;

	@TableId(value = "T_PLAN_ID", type = IdType.AUTO)
	private Integer tPlanId;

	@TableField("CREATE_USER_ID")
	private String createUserId;

	@TableField("CREATE_DEPT_ID")
	private Integer createDeptId;

	@TableField("T_PLAN_NO")
	private String tPlanNo;

	@TableField("T_PLAN_NAME")
	private String tPlanName;

	@TableField("T_CHANNEL")
	private String tChannel;

	@TableField("T_BCWS")
	private BigDecimal tBcws;

	@TableField("COURSE_START_TIME")
	private Date courseStartTime;

	@TableField("COURSE_END_TIME")
	private Date courseEndTime;

	@TableField("ASSESSING_OFFICER")
	private String assessingOfficer;

	@TableField("ASSESSING_TIME")
	private Date assessingTime;

	@TableField("ASSESSING_VIEW")
	private String assessingView;

	@TableField("ASSESSING_STATUS")
	private Integer assessingStatus;

	@TableField("T_JOIN_NUM")
	private Integer tJoinNum;

	@TableField("T_JOIN_DEPT")
	private String tJoinDept;

	@TableField("T_JOIN_PERSON")
	private String tJoinPerson;

	@TableField("T_REQUIRES")
	private String tRequires;

	@TableField("T_INSTITUTION_NAME")
	private String tInstitutionName;

	@TableField("T_INSTITUTION_INFO")
	private String tInstitutionInfo;

	@TableField("T_INSTITUTION_CONTACT")
	private String tInstitutionContact;

	@TableField("T_INSTITU_CONTACT_INFO")
	private String tInstituContactInfo;

	@TableField("T_COURSE_NAME")
	private String tCourseName;

	@TableField("SPONSORING_DEPARTMENT")
	private String sponsoringDepartment;

	@TableField("CHARGE_PERSON")
	private String chargePerson;

	@TableField("COURSE_HOURS")
	private Integer courseHours;

	@TableField("COURSE_PAY")
	private BigDecimal coursePay;

	@TableField("T_COURSE_TYPES")
	private String tCourseTypes;

	@TableField("T_DESCRIPTION")
	private String tDescription;

	@TableField("REMARK")
	private String remark;

	@TableField("T_ADDRESS")
	private String tAddress;

	@TableField("T_CONTENT")
	private String tContent;

	@TableField("ATTACHMENT_ID")
	private String attachmentId;

	@TableField("ATTACHMENT_NAME")
	private String attachmentName;

	@TableField("ADD_TIME")
	private Date addTime;

	public Integer gettPlanId() {
		return this.tPlanId;
	}

	public void settPlanId(Integer tPlanId) {
		this.tPlanId = tPlanId;
	}

	public String getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Integer getCreateDeptId() {
		return this.createDeptId;
	}

	public void setCreateDeptId(Integer createDeptId) {
		this.createDeptId = createDeptId;
	}

	public String gettPlanNo() {
		return this.tPlanNo;
	}

	public void settPlanNo(String tPlanNo) {
		this.tPlanNo = tPlanNo;
	}

	public String gettPlanName() {
		return this.tPlanName;
	}

	public void settPlanName(String tPlanName) {
		this.tPlanName = tPlanName;
	}

	public String gettChannel() {
		return this.tChannel;
	}

	public void settChannel(String tChannel) {
		this.tChannel = tChannel;
	}

	public BigDecimal gettBcws() {
		return this.tBcws;
	}

	public void settBcws(BigDecimal tBcws) {
		this.tBcws = tBcws;
	}

	public Date getCourseStartTime() {
		return this.courseStartTime;
	}

	public void setCourseStartTime(Date courseStartTime) {
		this.courseStartTime = courseStartTime;
	}

	public Date getCourseEndTime() {
		return this.courseEndTime;
	}

	public void setCourseEndTime(Date courseEndTime) {
		this.courseEndTime = courseEndTime;
	}

	public String getAssessingOfficer() {
		return this.assessingOfficer;
	}

	public void setAssessingOfficer(String assessingOfficer) {
		this.assessingOfficer = assessingOfficer;
	}

	public Date getAssessingTime() {
		return this.assessingTime;
	}

	public void setAssessingTime(Date assessingTime) {
		this.assessingTime = assessingTime;
	}

	public String getAssessingView() {
		return this.assessingView;
	}

	public void setAssessingView(String assessingView) {
		this.assessingView = assessingView;
	}

	public Integer getAssessingStatus() {
		return this.assessingStatus;
	}

	public void setAssessingStatus(Integer assessingStatus) {
		this.assessingStatus = assessingStatus;
	}

	public Integer gettJoinNum() {
		return this.tJoinNum;
	}

	public void settJoinNum(Integer tJoinNum) {
		this.tJoinNum = tJoinNum;
	}

	public String gettJoinDept() {
		return this.tJoinDept;
	}

	public void settJoinDept(String tJoinDept) {
		this.tJoinDept = tJoinDept;
	}

	public String gettJoinPerson() {
		return this.tJoinPerson;
	}

	public void settJoinPerson(String tJoinPerson) {
		this.tJoinPerson = tJoinPerson;
	}

	public String gettRequires() {
		return this.tRequires;
	}

	public void settRequires(String tRequires) {
		this.tRequires = tRequires;
	}

	public String gettInstitutionName() {
		return this.tInstitutionName;
	}

	public void settInstitutionName(String tInstitutionName) {
		this.tInstitutionName = tInstitutionName;
	}

	public String gettInstitutionInfo() {
		return this.tInstitutionInfo;
	}

	public void settInstitutionInfo(String tInstitutionInfo) {
		this.tInstitutionInfo = tInstitutionInfo;
	}

	public String gettInstitutionContact() {
		return this.tInstitutionContact;
	}

	public void settInstitutionContact(String tInstitutionContact) {
		this.tInstitutionContact = tInstitutionContact;
	}

	public String gettInstituContactInfo() {
		return this.tInstituContactInfo;
	}

	public void settInstituContactInfo(String tInstituContactInfo) {
		this.tInstituContactInfo = tInstituContactInfo;
	}

	public String gettCourseName() {
		return this.tCourseName;
	}

	public void settCourseName(String tCourseName) {
		this.tCourseName = tCourseName;
	}

	public String getSponsoringDepartment() {
		return this.sponsoringDepartment;
	}

	public void setSponsoringDepartment(String sponsoringDepartment) {
		this.sponsoringDepartment = sponsoringDepartment;
	}

	public String getChargePerson() {
		return this.chargePerson;
	}

	public void setChargePerson(String chargePerson) {
		this.chargePerson = chargePerson;
	}

	public Integer getCourseHours() {
		return this.courseHours;
	}

	public void setCourseHours(Integer courseHours) {
		this.courseHours = courseHours;
	}

	public BigDecimal getCoursePay() {
		return this.coursePay;
	}

	public void setCoursePay(BigDecimal coursePay) {
		this.coursePay = coursePay;
	}

	public String gettCourseTypes() {
		return this.tCourseTypes;
	}

	public void settCourseTypes(String tCourseTypes) {
		this.tCourseTypes = tCourseTypes;
	}

	public String gettDescription() {
		return this.tDescription;
	}

	public void settDescription(String tDescription) {
		this.tDescription = tDescription;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String gettAddress() {
		return this.tAddress;
	}

	public void settAddress(String tAddress) {
		this.tAddress = tAddress;
	}

	public String gettContent() {
		return this.tContent;
	}

	public void settContent(String tContent) {
		this.tContent = tContent;
	}

	public String getAttachmentId() {
		return this.attachmentId;
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	protected Serializable pkVal() {
		return this.tPlanId;
	}

	public String toString() {
		return "HrTrainingPlan{tPlanId=" + this.tPlanId + ", createUserId="
				+ this.createUserId + ", createDeptId=" + this.createDeptId
				+ ", tPlanNo=" + this.tPlanNo + ", tPlanName=" + this.tPlanName
				+ ", tChannel=" + this.tChannel + ", tBcws=" + this.tBcws
				+ ", courseStartTime=" + this.courseStartTime
				+ ", courseEndTime=" + this.courseEndTime
				+ ", assessingOfficer=" + this.assessingOfficer
				+ ", assessingTime=" + this.assessingTime + ", assessingView="
				+ this.assessingView + ", assessingStatus="
				+ this.assessingStatus + ", tJoinNum=" + this.tJoinNum
				+ ", tJoinDept=" + this.tJoinDept + ", tJoinPerson="
				+ this.tJoinPerson + ", tRequires=" + this.tRequires
				+ ", tInstitutionName=" + this.tInstitutionName
				+ ", tInstitutionInfo=" + this.tInstitutionInfo
				+ ", tInstitutionContact=" + this.tInstitutionContact
				+ ", tInstituContactInfo=" + this.tInstituContactInfo
				+ ", tCourseName=" + this.tCourseName
				+ ", sponsoringDepartment=" + this.sponsoringDepartment
				+ ", chargePerson=" + this.chargePerson + ", courseHours="
				+ this.courseHours + ", coursePay=" + this.coursePay
				+ ", tCourseTypes=" + this.tCourseTypes + ", tDescription="
				+ this.tDescription + ", remark=" + this.remark + ", tAddress="
				+ this.tAddress + ", tContent=" + this.tContent
				+ ", attachmentId=" + this.attachmentId + ", attachmentName="
				+ this.attachmentName + ", addTime=" + this.addTime + "}";
	}
}
