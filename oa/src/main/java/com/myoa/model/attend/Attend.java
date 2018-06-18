package com.myoa.model.attend;

import com.myoa.model.enclosure.Attachment;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Attend {
	private Integer aid;
	private Integer uid;
	private Date date;
	private String type;
	private Integer atime;
	private String address;
	private String remark;
	private String phoneId;
	private String device;
	private String fileId;
	private String fileName;
	private String atimestate;
	private String num;
	private String swi;
	private String commute;
	private List<Attend> attendList;
	private List<Attend> legwork;
	private List<Attend> remarkList;
	private String week;
	private String sname;
	private String dateName;
	private String time;
	private String state;
	private Integer count;
	private String msg;
	private List<Attend> list;
	private Integer userAll;
	private Integer userSize;
	private String ava;
	private String userName;
	private String depName;
	private List<Attendance> attendances;
	private List<Normal> normals;
	private List<Field> fields;
	private List<LeaveEarly> leaveEarlies;
	private List<LackCard> lackCards;
	private List<Late> lates;
	private List<Absenteeism> absenteeisms;
	private List<AttendanceOvertime> AttendanceOvertime;
	private List<AttendEvection> AttendEvection;
	private List<AttendLeave> AttendLeave;
	private List<AttendOut> AttendOut;
	private List<UnitException> unitExceptions;
	private List<BaseAttend> remarksList = new ArrayList();
	private List<BaseSupplement> baseSupplements = new ArrayList();

	private List<AttendStatistics> attendStatistics = new ArrayList();
	private List<Attachment> attachment;
	private List<AttendSet> attendSetList;
	private String attendStatus;

	public List<AttendStatistics> getAttendStatistics() {
		return this.attendStatistics;
	}

	public void setAttendStatistics(List<AttendStatistics> attendStatistics) {
		this.attendStatistics = attendStatistics;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getAva() {
		return this.ava;
	}

	public void setAva(String ava) {
		this.ava = ava;
	}

	public Integer getUserAll() {
		return this.userAll;
	}

	public void setUserAll(Integer userAll) {
		this.userAll = userAll;
	}

	public Integer getUserSize() {
		return this.userSize;
	}

	public void setUserSize(Integer userSize) {
		this.userSize = userSize;
	}

	public List<BaseSupplement> getBaseSupplements() {
		return this.baseSupplements;
	}

	public void setBaseSupplements(List<BaseSupplement> baseSupplements) {
		this.baseSupplements = baseSupplements;
	}

	public List<BaseAttend> getRemarksList() {
		return this.remarksList;
	}

	public void setRemarksList(List<BaseAttend> remarksList) {
		this.remarksList = remarksList;
	}

	public List<AttendanceOvertime> getAttendanceOvertime() {
		return this.AttendanceOvertime;
	}

	public void setAttendanceOvertime(
			List<AttendanceOvertime> attendanceOvertime) {
		this.AttendanceOvertime = attendanceOvertime;
	}

	public List<AttendEvection> getAttendEvection() {
		return this.AttendEvection;
	}

	public void setAttendEvection(List<AttendEvection> attendEvection) {
		this.AttendEvection = attendEvection;
	}

	public List<AttendLeave> getAttendLeave() {
		return this.AttendLeave;
	}

	public void setAttendLeave(List<AttendLeave> attendLeave) {
		this.AttendLeave = attendLeave;
	}

	public List<AttendOut> getAttendOut() {
		return this.AttendOut;
	}

	public void setAttendOut(List<AttendOut> attendOut) {
		this.AttendOut = attendOut;
	}

	public List<Attendance> getAttendances() {
		return this.attendances;
	}

	public void setAttendances(List<Attendance> attendances) {
		this.attendances = attendances;
	}

	public List<Normal> getNormals() {
		return this.normals;
	}

	public void setNormals(List<Normal> normals) {
		this.normals = normals;
	}

	public List<Field> getFields() {
		return this.fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	public List<LeaveEarly> getLeaveEarlies() {
		return this.leaveEarlies;
	}

	public void setLeaveEarlies(List<LeaveEarly> leaveEarlies) {
		this.leaveEarlies = leaveEarlies;
	}

	public List<LackCard> getLackCards() {
		return this.lackCards;
	}

	public void setLackCards(List<LackCard> lackCards) {
		this.lackCards = lackCards;
	}

	public List<Late> getLates() {
		return this.lates;
	}

	public void setLates(List<Late> lates) {
		this.lates = lates;
	}

	public List<Absenteeism> getAbsenteeisms() {
		return this.absenteeisms;
	}

	public void setAbsenteeisms(List<Absenteeism> absenteeisms) {
		this.absenteeisms = absenteeisms;
	}

	public List<UnitException> getUnitExceptions() {
		return this.unitExceptions;
	}

	public void setUnitExceptions(List<UnitException> unitExceptions) {
		this.unitExceptions = unitExceptions;
	}

	public List<Attend> getList() {
		return this.list;
	}

	public void setList(List<Attend> list) {
		this.list = list;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDateName() {
		return this.dateName;
	}

	public void setDateName(String dateName) {
		this.dateName = dateName;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getSwi() {
		return this.swi;
	}

	public void setSwi(String swi) {
		this.swi = swi;
	}

	public String getCommute() {
		return this.commute;
	}

	public void setCommute(String commute) {
		this.commute = commute;
	}

	public List<Attend> getRemarkList() {
		return this.remarkList;
	}

	public void setRemarkList(List<Attend> remarkList) {
		this.remarkList = remarkList;
	}

	public String getWeek() {
		return this.week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public List<Attachment> getAttachment() {
		return this.attachment;
	}

	public void setAttachment(List<Attachment> attachment) {
		this.attachment = attachment;
	}

	public List<Attend> getLegwork() {
		return this.legwork;
	}

	public void setLegwork(List<Attend> legwork) {
		this.legwork = legwork;
	}

	public List<Attend> getAttendList() {
		return this.attendList;
	}

	public void setAttendList(List<Attend> attendList) {
		this.attendList = attendList;
	}

	public List<AttendSet> getAttendSetList() {
		return this.attendSetList;
	}

	public void setAttendSetList(List<AttendSet> attendSetList) {
		this.attendSetList = attendSetList;
	}

	public String getAtimestate() {
		return this.atimestate;
	}

	public void setAtimestate(String atimestate) {
		this.atimestate = atimestate;
	}

	public String getFileId() {
		return this.fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = (type == null ? null : type.trim());
	}

	public Integer getAtime() {
		return this.atime;
	}

	public void setAtime(Integer atime) {
		this.atime = atime;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = (address == null ? null : address.trim());
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = (remark == null ? null : remark.trim());
	}

	public String getPhoneId() {
		return this.phoneId;
	}

	public void setPhoneId(String phoneId) {
		this.phoneId = (phoneId == null ? null : phoneId.trim());
	}

	public String getDevice() {
		return this.device;
	}

	public void setDevice(String device) {
		this.device = (device == null ? null : device.trim());
	}

	public String getAttendStatus() {
		return this.attendStatus;
	}

	public void setAttendStatus(String attendStatus) {
		this.attendStatus = attendStatus;
	}
}
