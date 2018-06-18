package com.myoa.service.work;

import com.myoa.model.enclosure.Attachment;
import com.myoa.model.flowRunFeedback.FlowRunFeedback;
import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowFast;
import com.myoa.model.workflow.FlowRunPrcs;
import com.myoa.util.AjaxJson;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public abstract interface WorkService
{
  public abstract ToJson<FlowFast> workFastAdd(Users paramUsers, int paramInt1, int paramInt2, String paramString1, String paramString2, HttpServletRequest paramHttpServletRequest, String paramString3, String paramString4, String paramString5);

  public abstract ToJson<Attachment> workUpload(MultipartFile[] paramArrayOfMultipartFile, String paramString1, String paramString2, String paramString3);

  public abstract ToJson<FlowFast> nextwork(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<FlowRunPrcs> savework(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, Users paramUsers, String paramString11);

  public abstract Map<String, Object> fastAdd(String paramString1, String paramString2);

  public abstract ToJson<FlowRunFeedback> workfeedback(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);

  public abstract AjaxJson findworkfeedback(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6);

  public abstract ToJson<Attachment> findworkUpload(String paramString1, String paramString2);

  public abstract AjaxJson findBranch(String paramString1, String paramString2, String paramString3, Users paramUsers);

  public abstract ToJson delete(String paramString1, @RequestParam("AID") String paramString2, @RequestParam("MODULE") String paramString3, @RequestParam("YM") String paramString4, @RequestParam("ATTACHMENT_ID") String paramString5, @RequestParam("ATTACHMENT_NAME") String paramString6, @RequestParam("COMPANY") String paramString7, HttpServletResponse paramHttpServletResponse, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<FlowRunPrcs> getflowprcsdata(String paramString1, String paramString2, String paramString3);

  public abstract AjaxJson insertprcsdata(String paramString1, String paramString2, String paramString3, String paramString4, Users paramUsers, String paramString5);

  public abstract AjaxJson createGuide(String paramString, Users paramUsers, HttpServletRequest paramHttpServletRequest);

  public abstract BaseWrapper getRunName(Users paramUsers, Integer paramInteger1, Integer paramInteger2, String paramString);

  public abstract void exportExcel(Users paramUsers, String paramString, HttpServletResponse paramHttpServletResponse);

  public abstract ToJson<FlowRunPrcs> entrust(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Users paramUsers);

  public abstract AjaxJson workAttention(Integer paramInteger, String paramString1, String paramString2);

  public abstract AjaxJson worDelete(Integer paramInteger, String paramString);

  public abstract void todoWorkSmsBoby(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, HttpServletRequest paramHttpServletRequest, String paramString12, Users paramUsers, String paramString13, String paramString14, String paramString15);

  public abstract AjaxJson saveHandle(Integer paramInteger, String paramString1, String paramString2, Users paramUsers);
}
