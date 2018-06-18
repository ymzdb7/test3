package com.myoa.service.template;

import com.myoa.model.template.TemplateModule;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

public abstract interface TemplateService
{
  public abstract ToJson<TemplateModule> queryTemplate(TemplateModule paramTemplateModule, Integer paramInteger1, Integer paramInteger2, Boolean paramBoolean);

  public abstract ToJson<TemplateModule> addTemplate(HttpServletRequest paramHttpServletRequest, TemplateModule paramTemplateModule, MultipartFile paramMultipartFile);

  public abstract ToJson<TemplateModule> updateTemplate(TemplateModule paramTemplateModule, MultipartFile paramMultipartFile, Integer paramInteger, HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse);

  public abstract ToJson<TemplateModule> deleteTemplate(Integer paramInteger);

  public abstract ToJson<TemplateModule> queryTemplateByPriv(TemplateModule paramTemplateModule, Integer paramInteger1, Integer paramInteger2, Boolean paramBoolean, HttpServletRequest paramHttpServletRequest);
}
