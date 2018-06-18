package com.myoa.dao.WFE;

import com.myoa.dao.base.BaseMapper;
import com.myoa.model.workflow.FlowFormType;
import com.myoa.model.workflow.FlowFormTypeExtends;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface WFEFormTypeMapper extends BaseMapper<FlowFormType> {
	public abstract List<FlowFormType> selectFlowFormType(
			Map<String, Object> paramMap);

	public abstract FlowFormType qureyItemMax(
			@Param("formId") Integer paramInteger);

	public abstract int updateItemMax(FlowFormType paramFlowFormType);

	public abstract List<FlowFormType> selectFormBySort(
			@Param("sortId") Integer paramInteger);

	public abstract List<FlowFormType> queryBySearchValue(
			@Param("searchValue") String paramString,
			@Param("sortId") Integer paramInteger);

	public abstract int insertSelectParam(FlowFormType paramFlowFormType);

	public abstract int updateSelectParam(
			FlowFormTypeExtends paramFlowFormTypeExtends);

	public abstract int checkFormUserNumber(
			@Param("formId") Integer paramInteger);

	public abstract int deleteForm(@Param("formId") Integer paramInteger);

	public abstract List<FlowFormType> selectAllForm();
}
