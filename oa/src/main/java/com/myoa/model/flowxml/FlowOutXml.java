package com.myoa.model.flowxml;

import java.util.List;

public class FlowOutXml {
	FlowTypeXml BaseInfo;
	List<FlowProcessXml> Process;

	public FlowTypeXml getBaseInfo() {
		return this.BaseInfo;
	}

	public void setBaseInfo(FlowTypeXml baseInfo) {
		this.BaseInfo = baseInfo;
	}

	public List<FlowProcessXml> getProcess() {
		return this.Process;
	}

	public void setProcess(List<FlowProcessXml> process) {
		this.Process = process;
	}
}