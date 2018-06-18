package com.myoa.model.edu.eduElectiveStudent;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;

@TableName("edu_elective_student")
public class EduElectiveStudent extends Model<EduElectiveStudent> {
	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	private Integer sid;

	@TableField("student_id")
	private String studentId;

	@TableField("student_name")
	private String studentName;
	private Integer nid;
	private String year;

	@TableField("class_id")
	private Integer classId;

	@TableField("teach_comments")
	private Integer teachComments;

	@TableField("student_comments")
	private String studentComments;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getNid() {
		return this.nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Integer getTeachComments() {
		return this.teachComments;
	}

	public void setTeachComments(Integer teachComments) {
		this.teachComments = teachComments;
	}

	public String getStudentComments() {
		return this.studentComments;
	}

	public void setStudentComments(String studentComments) {
		this.studentComments = studentComments;
	}

	protected Serializable pkVal() {
		return this.id;
	}

	public String toString() {
		return "EduElectiveStudent{id=" + this.id + ", sid=" + this.sid
				+ ", studentId=" + this.studentId + ", studentName="
				+ this.studentName + ", nid=" + this.nid + ", year="
				+ this.year + ", classId=" + this.classId + ", teachComments="
				+ this.teachComments + ", studentComments="
				+ this.studentComments + "}";
	}
}
