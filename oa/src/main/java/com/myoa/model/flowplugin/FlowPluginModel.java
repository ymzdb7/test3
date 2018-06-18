package com.myoa.model.flowplugin;

import java.io.Serializable;

public class FlowPluginModel implements Serializable {
	private static long serialVersionUID = 1L;
	private Integer flowPluginId;
	private String flowPluginName;
	private String flowPluginInstructions;
	private String flowPluginPerform;
	private String flowPluginModel;
	private String flowPluginMethod;
	private String flowPluginService;
	private Integer flowPluginCreateDate;
	private Integer flowPluginUpdateDate;
	private String flowPluginCreateUser;
	private String flowPluginUpdateUser;
	private Integer flowPluginUpdateCount;
	private Integer flowPluginFlag;

	public Integer getFlowPluginId() {
		return this.flowPluginId;
	}

	public void setFlowPluginId(Integer flowPluginId) {
		this.flowPluginId = flowPluginId;
	}

	public String getFlowPluginName() {
		return this.flowPluginName;
	}

	public void setFlowPluginName(String flowPluginName) {
		this.flowPluginName = flowPluginName;
	}

	public String getFlowPluginInstructions() {
		return this.flowPluginInstructions;
	}

	public void setFlowPluginInstructions(String flowPluginInstructions) {
		this.flowPluginInstructions = flowPluginInstructions;
	}

	public String getFlowPluginPerform() {
		return this.flowPluginPerform;
	}

	public void setFlowPluginPerform(String flowPluginPerform) {
		this.flowPluginPerform = flowPluginPerform;
	}

	public String getFlowPluginModel() {
		return this.flowPluginModel;
	}

	public void setFlowPluginModel(String flowPluginModel) {
		this.flowPluginModel = flowPluginModel;
	}

	public String getFlowPluginMethod() {
		return this.flowPluginMethod;
	}

	public void setFlowPluginMethod(String flowPluginMethod) {
		this.flowPluginMethod = flowPluginMethod;
	}

	public String getFlowPluginService() {
		return this.flowPluginService;
	}

	public void setFlowPluginService(String flowPluginService) {
		this.flowPluginService = flowPluginService;
	}

	public Integer getFlowPluginCreateDate() {
		return this.flowPluginCreateDate;
	}

	public void setFlowPluginCreateDate(Integer flowPluginCreateDate) {
		this.flowPluginCreateDate = flowPluginCreateDate;
	}

	public Integer getFlowPluginUpdateDate() {
		return this.flowPluginUpdateDate;
	}

	public void setFlowPluginUpdateDate(Integer flowPluginUpdateDate) {
		this.flowPluginUpdateDate = flowPluginUpdateDate;
	}

	public String getFlowPluginCreateUser() {
		return this.flowPluginCreateUser;
	}

	public void setFlowPluginCreateUser(String flowPluginCreateUser) {
		this.flowPluginCreateUser = flowPluginCreateUser;
	}

	public String getFlowPluginUpdateUser() {
		return this.flowPluginUpdateUser;
	}

	public void setFlowPluginUpdateUser(String flowPluginUpdateUser) {
		this.flowPluginUpdateUser = flowPluginUpdateUser;
	}

	public Integer getFlowPluginUpdateCount() {
		return this.flowPluginUpdateCount;
	}

	public void setFlowPluginUpdateCount(Integer flowPluginUpdateCount) {
		this.flowPluginUpdateCount = flowPluginUpdateCount;
	}

	public Integer getFlowPluginFlag() {
		return this.flowPluginFlag;
	}

	public void setFlowPluginFlag(Integer flowPluginFlag) {
		this.flowPluginFlag = flowPluginFlag;
	}
}
