package com.myoa.service.rms;

import com.myoa.model.enclosure.Attachment;
import com.myoa.model.rms.RmsFileWithBLOBs;
import com.myoa.util.ToJson;
import com.myoa.util.page.PageParams;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

public abstract interface RmsFileService
{
  public abstract ToJson<RmsFileWithBLOBs> save(RmsFileWithBLOBs paramRmsFileWithBLOBs, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<RmsFileWithBLOBs> update(RmsFileWithBLOBs paramRmsFileWithBLOBs, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<RmsFileWithBLOBs> destroy(String paramString, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<RmsFileWithBLOBs> query(RmsFileWithBLOBs paramRmsFileWithBLOBs, PageParams paramPageParams);

  public abstract ToJson<RmsFileWithBLOBs> selectById(Integer paramInteger, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson<RmsFileWithBLOBs> importFile(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, MultipartFile paramMultipartFile);

  public abstract ToJson<RmsFileWithBLOBs> deleteFiles(String paramString);

  public abstract ToJson<RmsFileWithBLOBs> restore(String paramString);

  public abstract ToJson<RmsFileWithBLOBs> export(String paramString, HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse);

  public abstract ToJson<RmsFileWithBLOBs> updateRollBath(String paramString, Integer paramInteger);

  public abstract ToJson<Attachment> createFormHtml(String paramString1, String paramString2, HttpServletResponse paramHttpServletResponse, HttpServletRequest paramHttpServletRequest, String paramString3);
}

