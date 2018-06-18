package com.myoa.dao.WFE;

import com.myoa.dao.base.BaseMapper;
import com.myoa.model.workflow.FlowDetailInfo;
import com.myoa.model.workflow.FlowTypeModel;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface WFEFlowTypeModelMapper extends
		BaseMapper<FlowTypeModel> {
	public abstract List<FlowTypeModel> selectBySortid(
			@Param("flowId") Integer paramInteger);

	public abstract List<FlowTypeModel> selectBySearch(
			@Param("searchValue") String paramString,
			@Param("sortId") Integer paramInteger);

	public abstract List<FlowTypeModel> selectFlowAuthOrSearch(
			Map<String, Object> paramMap);

	public abstract FlowDetailInfo selectFlowDetailInfo(
			@Param("flowId") Integer paramInteger);

	public abstract FlowTypeModel selectOnlyType(
			@Param("flowId") Integer paramInteger1,
			@Param("formId") Integer paramInteger2);

	public abstract FlowTypeModel queryOneObject(
			@Param("flowId") Integer paramInteger);

	public abstract FlowTypeModel selectAttachmentAndInstructions(
			@Param("flowId") Integer paramInteger1,
			@Param("formId") Integer paramInteger2);

	public abstract FlowTypeModel sflowType(Integer paramInteger);

	public abstract int updateFlowTypeModel(FlowTypeModel paramFlowTypeModel);

	public abstract List<FlowTypeModel> getDataBySortParent(
			@Param("sortParent") Integer paramInteger);

	public abstract List<FlowTypeModel> selectFlowAuthOrSearchByCodeId(
			Map<String, Object> paramMap);

	public abstract List<FlowDetailInfo> selectDocumentFloeType();

	public abstract int deleteByFlowId(Integer paramInteger);
}
