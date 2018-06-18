package com.myoa.service.sys;

import com.myoa.model.sys.InterfaceModel;
import com.myoa.util.common.wrapper.BaseWrapper;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.json.JSONException;

public abstract interface InterFaceService
{
  public abstract List<InterfaceModel> getStaTusText();

  public abstract void editStatusText(InterfaceModel paramInterfaceModel);

  public abstract List<InterfaceModel> getInterfaceInfo(HttpServletRequest paramHttpServletRequest);

  public abstract void updateInterfaceInfo(InterfaceModel paramInterfaceModel);

  public abstract void insertInterfaceInfo(InterfaceModel paramInterfaceModel);

  public abstract InterfaceModel getThemeSelect();

  public abstract InterfaceModel getAvatarUpload();

  public abstract InterfaceModel getTemplate();

  public abstract InterfaceModel getIndexInfo();

  public abstract BaseWrapper pushMessage(String paramString1, String paramString2, HttpServletRequest paramHttpServletRequest, String paramString3, String paramString4)
    throws JSONException;
}
