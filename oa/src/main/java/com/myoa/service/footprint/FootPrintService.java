package com.myoa.service.footprint;

import com.myoa.model.footprint.Foot;
import com.myoa.util.ToJson;

import java.text.ParseException;
import java.util.List;

public abstract interface FootPrintService
{
  public abstract ToJson<Foot> addFootPrint(Foot paramFoot);

  public abstract List<Foot> getFootPrint(String paramString1, Integer paramInteger, String paramString2);

  public abstract ToJson<Foot> getWebFootPrint(String paramString1, String paramString2, String paramString3, Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Boolean paramBoolean);

  public abstract List<Foot> getTheFootPrint(String paramString, Integer paramInteger)
    throws ParseException;

  public abstract List<Foot> findByCondition(String paramString1, String paramString2, String paramString3, Integer paramInteger);

  public abstract List<Foot> getTheDayFootPrint(String paramString, Integer paramInteger);

  public abstract ToJson<Foot> editUpdateTimeByuid(String paramString, Integer paramInteger1, Integer paramInteger2);
}

