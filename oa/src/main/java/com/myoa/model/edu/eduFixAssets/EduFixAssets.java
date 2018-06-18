package com.myoa.model.edu.eduFixAssets;

import com.alibaba.fastjson.annotation.JSONField;
import com.myoa.util.DateFormat;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class EduFixAssets {
	private String id;
	private String assetsName;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JSONField(format = "yyyy-MM-dd")
	private Date buyTime;
	private String buyTimeStr;
	private String info;
	private Integer number;
	private String locationAddress;
	private String locationAddressName;
	private String custodion;
	private String custodionName;
	private String status;
	private String image;
	private String remake;
	private String qrCode;
	private String creater;
	private String createrName;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:MM:ss")
	@JSONField(format = "yyyy-MM-dd HH:MM:ss")
	private Date createrTime;
	private String createrTimeStr;
	private int inputSuccess;
	private int inputFail;
	private String inputFailReason;

	public String getCreaterTimeStr() {
		return this.createrTime == null ? "" : DateFormat
				.getStrDate(this.createrTime);
	}

	public void setCreaterTimeStr(String createrTimeStr) {
		this.createrTimeStr = DateFormat.getStrDate(this.createrTime);
	}

	public String getBuyTimeStr() {
		return this.buyTime == null ? "" : DateFormat.getDatestr(this.buyTime);
	}

	public void setBuyTimeStr(String buyTimeStr) {
		this.buyTimeStr = DateFormat.getDatestr(this.buyTime);
	}

	public String getLocationAddressName() {
		return this.locationAddressName == null ? "" : this.locationAddressName;
	}

	public void setLocationAddressName(String locationAddressName) {
		this.locationAddressName = locationAddressName;
	}

	public String getCustodionName() {
		return this.custodionName == null ? "" : this.custodionName;
	}

	public void setCustodionName(String custodionName) {
		this.custodionName = custodionName;
	}

	public String getCreaterName() {
		return this.createrName == null ? "" : this.createrName;
	}

	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}

	public int getInputSuccess() {
		return this.inputSuccess;
	}

	public void setInputSuccess(int inputSuccess) {
		this.inputSuccess = inputSuccess;
	}

	public int getInputFail() {
		return this.inputFail;
	}

	public void setInputFail(int inputFail) {
		this.inputFail = inputFail;
	}

	public String getInputFailReason() {
		return this.inputFailReason == null ? "" : this.inputFailReason;
	}

	public void setInputFailReason(String inputFailReason) {
		this.inputFailReason = inputFailReason;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = (id == null ? null : id.trim());
	}

	public String getAssetsName() {
		return this.assetsName;
	}

	public void setAssetsName(String assetsName) {
		this.assetsName = (assetsName == null ? null : assetsName.trim());
	}

	public Date getBuyTime() {
		return this.buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = (info == null ? null : info.trim());
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getLocationAddress() {
		return this.locationAddress;
	}

	public void setLocationAddress(String locationAddress) {
		this.locationAddress = (locationAddress == null ? null
				: locationAddress.trim());
	}

	public String getCustodion() {
		return this.custodion;
	}

	public void setCustodion(String custodion) {
		this.custodion = (custodion == null ? null : custodion.trim());
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = (status == null ? null : status.trim());
	}

	public String getImage() {
		return this.image == null ? "" : this.image;
	}

	public void setImage(String image) {
		this.image = (image == null ? null : image.trim());
	}

	public String getRemake() {
		return this.remake;
	}

	public void setRemake(String remake) {
		this.remake = (remake == null ? null : remake.trim());
	}

	public String getQrCode() {
		return this.qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = (qrCode == null ? null : qrCode.trim());
	}

	public String getCreater() {
		return this.creater;
	}

	public void setCreater(String creater) {
		this.creater = (creater == null ? null : creater.trim());
	}

	public Date getCreaterTime() {
		return this.createrTime;
	}

	public void setCreaterTime(Date createrTime) {
		this.createrTime = createrTime;
	}
}
