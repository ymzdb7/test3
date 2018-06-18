package com.myoa.service.file;

import com.myoa.model.file.FileContentModel;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.multipart.MultipartFile;

public abstract interface FileContentService
{
  public abstract int deleteBySortId(int paramInt);

  public abstract List<FileContentModel> getFileConBySortid(int paramInt, HttpServletRequest paramHttpServletRequest);

  public abstract FileContentModel getFileConByContentId(String paramString, HttpServletRequest paramHttpServletRequest);

  public abstract int saveContent(FileContentModel paramFileContentModel);

  public abstract int deleteByConId(Map<String, Object> paramMap);

  public abstract int updateFileCon(FileContentModel paramFileContentModel);

  public abstract BaseWrapper batchDeleteConId(Integer[] paramArrayOfInteger);

  public abstract BaseWrappers queryBySearchValue(HttpServletRequest paramHttpServletRequest, Integer paramInteger1, Integer paramInteger2, String paramString1, String[] paramArrayOfString, Integer paramInteger3, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, Integer paramInteger4, Integer paramInteger5);

  public abstract BaseWrapper copyAndParse(Integer paramInteger1, Integer paramInteger2);

  public abstract BaseWrappers uploadFile(MultipartFile[] paramArrayOfMultipartFile, HttpServletRequest paramHttpServletRequest);

  public abstract BaseWrapper newFileInBox(String paramString1, String paramString2);

  public abstract ToJson<?> downFileContent(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse, String[] paramArrayOfString);

  public abstract ToJson contentCut(HttpServletRequest paramHttpServletRequest, String[] paramArrayOfString);

  public abstract ToJson serachAll(Map<String, String> paramMap, HttpServletRequest paramHttpServletRequest);

  public abstract ToJson signConState(Map<String, String> paramMap, HttpServletRequest paramHttpServletRequest);

  public abstract List<FileContentModel> selectFileSortList(String paramString);
}

