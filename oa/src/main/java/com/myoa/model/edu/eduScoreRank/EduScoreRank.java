package com.myoa.model.edu.eduScoreRank;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import java.io.Serializable;

@TableName("edu_score_rank")
public class EduScoreRank extends Model<EduScoreRank> {
	private static final long serialVersionUID = 1L;

	@TableId(value = "ID", type = IdType.AUTO)
	private Integer id;

	@TableField("EXAM_ID")
	private Integer examId;

	@TableField("USER_ID")
	private String userId;

	@TableField("TOTAL_SCORE")
	private Integer totalScore;

	@TableField("GRADE_RANK")
	private Integer gradeRank;

	@TableField("CLASS_RANK")
	private Integer classRank;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getExamId() {
		return this.examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getTotalScore() {
		return this.totalScore;
	}

	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}

	public Integer getGradeRank() {
		return this.gradeRank;
	}

	public void setGradeRank(Integer gradeRank) {
		this.gradeRank = gradeRank;
	}

	public Integer getClassRank() {
		return this.classRank;
	}

	public void setClassRank(Integer classRank) {
		this.classRank = classRank;
	}

	protected Serializable pkVal() {
		return this.id;
	}

	public String toString() {
		return "EduScoreRank{id=" + this.id + ", examId=" + this.examId
				+ ", userId=" + this.userId + ", totalScore=" + this.totalScore
				+ ", gradeRank=" + this.gradeRank + ", classRank="
				+ this.classRank + "}";
	}
}