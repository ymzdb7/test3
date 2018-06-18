package com.myoa.model.common;

public class SysCode {
	private Integer codeId;
	private String codeNo;
	private String codeName;
	private String codeName1;
	private String codeName2;
	private String codeName3;
	private String codeName4;
	private String codeName5;
	private String codeName6;
	private String codeOrder;
	private String parentNo;
	private String codeFlag;
	private String codeExt;

	public String getCodeName2() {
		return this.codeName2;
	}

	public void setCodeName2(String codeName2) {
		this.codeName2 = codeName2;
	}

	public Integer getCodeId() {
		return this.codeId;
	}

	public void setCodeId(Integer codeId) {
		this.codeId = codeId;
	}

	public String getCodeNo() {
		return this.codeNo;
	}

	public void setCodeNo(String codeNo) {
		this.codeNo = (codeNo == null ? null : codeNo.trim());
	}

	public String getCodeName() {
		return this.codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = (codeName == null ? null : codeName.trim());
	}

	public String getCodeOrder() {
		return this.codeOrder;
	}

	public void setCodeOrder(String codeOrder) {
		this.codeOrder = (codeOrder == null ? null : codeOrder.trim());
	}

	public String getParentNo() {
		return this.parentNo;
	}

	public void setParentNo(String parentNo) {
		this.parentNo = (parentNo == null ? null : parentNo.trim());
	}

	public String getCodeFlag() {
		return this.codeFlag;
	}

	public void setCodeFlag(String codeFlag) {
		this.codeFlag = (codeFlag == null ? null : codeFlag.trim());
	}

	public String getCodeExt() {
		return this.codeExt;
	}

	public void setCodeExt(String codeExt) {
		this.codeExt = (codeExt == null ? null : codeExt.trim());
	}
}
