package com.myoa.service.workflow.flowtype;

import com.myoa.model.workflow.FlowDetailInfo;
import com.myoa.model.workflow.FlowTypeModel;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;

public abstract interface FlowTypeService
{
  public abstract ToJson<FlowTypeModel> saveFlow(FlowTypeModel paramFlowTypeModel);

  public abstract ToJson<FlowTypeModel> selectAllFlow(Integer paramInteger);

  public abstract ToJson<FlowTypeModel> selectAllFlow(Integer paramInteger, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<FlowTypeModel> updateFlow(FlowTypeModel paramFlowTypeModel);

  public abstract ToJson<FlowTypeModel> quertBySortId(Integer paramInteger);

  public abstract ToJson<FlowTypeModel> flowBySearch(String paramString, Integer paramInteger);

  public abstract ToJson<FlowTypeModel> selectFlowAuthOrSearch(HttpServletRequest paramHttpServletRequest, String paramString, Integer paramInteger);

  public abstract ToJson<FlowDetailInfo> selectFlowDetailInfo(Integer paramInteger);

  public abstract FlowTypeModel selectOnlyType(Integer paramInteger1, Integer paramInteger2);

  public abstract ToJson<FlowTypeModel> selectAttachmentAndInstructions(Integer paramInteger1, Integer paramInteger2, String paramString);

  public abstract FlowTypeModel sfTbyrunId(Integer paramInteger);

  public abstract BaseWrapper getFlowOutModel(Integer paramInteger)
    throws Exception;

  public abstract BaseWrapper intputFlowFile(Integer paramInteger, MultipartFile paramMultipartFile);

  public abstract BaseWrapper deleteFlow(Integer paramInteger);

  public abstract BaseWrapper clearFlow(Integer paramInteger);

  public abstract ToJson<FlowTypeModel> selAllType();
}

