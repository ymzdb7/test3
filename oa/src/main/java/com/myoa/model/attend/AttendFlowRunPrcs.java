package com.myoa.model.attend;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.Date;

public class AttendFlowRunPrcs extends AttendLeave {
	String flowId;
	String createrName;
	Integer prFlag;
	String prcsName;
	Integer realPrcsId;
	Integer step;
	Date endTime;
	String codeName;
	String curUserIdName;
	String allUserIdName;

	public String getFlowId() {
		return this.flowId;
	}

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getCreaterName() {
		return this.createrName;
	}

	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}

	public Integer getPrFlag() {
		return this.prFlag;
	}

	public void setPrFlag(Integer prFlag) {
		this.prFlag = prFlag;
	}

	public String getPrcsName() {
		return this.prcsName;
	}

	public void setPrcsName(String prcsName) {
		this.prcsName = prcsName;
	}

	public Integer getRealPrcsId() {
		return this.realPrcsId;
	}

	public void setRealPrcsId(Integer realPrcsId) {
		this.realPrcsId = realPrcsId;
	}

	public Integer getStep() {
		return this.step;
	}

	public void setStep(Integer step) {
		this.step = step;
	}

	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getCodeName() {
		return this.codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getCurUserIdName() {
		return this.curUserIdName;
	}

	public void setCurUserIdName(String curUserIdName) {
		this.curUserIdName = curUserIdName;
	}

	public String getAllUserIdName() {
		return this.allUserIdName;
	}

	public void setAllUserIdName(String allUserIdName) {
		this.allUserIdName = allUserIdName;
	}
}
