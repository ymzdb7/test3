package com.myoa.service.file;

import com.myoa.model.file.FileAuthWrapper;
import com.myoa.model.file.FileSortModel;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

public abstract interface FileSortService
{
  public abstract ToJson<FileSortModel> getFileSortJson(FileSortModel paramFileSortModel);

  public abstract List<FileSortModel> getFileSortList(FileSortModel paramFileSortModel);

  public abstract ToJson<FileSortModel> getFileSortBySortId(FileSortModel paramFileSortModel);

  public abstract int saveFileSort(FileSortModel paramFileSortModel);

  public abstract int updateFileSort(FileSortModel paramFileSortModel);

  public abstract int deleteBySortId(Map<String, Object> paramMap);

  public abstract List<FileSortModel> getSortChrildren(int paramInt);

  public abstract List<FileSortModel> getRootTree(Map<String, Object> paramMap);

  public abstract List<FileSortModel> getChildTree(List<String> paramList);

  public abstract int saveFileSortChr(FileSortModel paramFileSortModel);

  public abstract BaseWrapper setFileSortAuth(Map<String, Object> paramMap);

  public abstract FileAuthWrapper getAuthBySortId(Integer paramInteger);

  public abstract BaseWrapper getFileAuthBySortId(Integer paramInteger, HttpServletRequest paramHttpServletRequest);

  public abstract List<FileSortModel> getChrildrenSort(FileSortModel paramFileSortModel);

  public abstract FileSortModel getFileSortBySortIds(FileSortModel paramFileSortModel);

  public abstract int getFileCheck(FileSortModel paramFileSortModel);

  public abstract FileSortModel singleBySortNo(String paramString);

  public abstract FileSortModel singleBySortName(String paramString);

  public abstract List<FileSortModel> getChildTreeList(String paramString);
}

