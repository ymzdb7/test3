package com.myoa.dao.footprint;

import com.myoa.model.footprint.Foot;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface FootPrintMapper {
	public abstract void addFootPrint(Foot paramFoot);

	public abstract List<Foot> getFootPrintByDepId(Map<String, Object> paramMap);

	public abstract List<Foot> getWebFootPrintByDepId(
			Map<String, Object> paramMap);

	public abstract List<Foot> getFootPrintByUid(Map<String, Object> paramMap);

	public abstract List<Foot> getWebFootPrintByUid(Map<String, Object> paramMap);

	public abstract List<Foot> getAllFootPrint(Map<String, Object> paramMap);

	public abstract List<Foot> getWebAllFootPrint(Map<String, Object> paramMap);

	public abstract List<Foot> getUserDayFootPrint(Map<String, Integer> paramMap);

	public abstract List<Foot> getDeptFootPrintByCondition(
			Map<String, Object> paramMap);

	public abstract List<Foot> getAllFootPrintByCondition(
			Map<String, Object> paramMap);

	public abstract List<Foot> getDeptFootPrintByTime(Map<String, Long> paramMap);

	public abstract List<Foot> getFootPrintByUidTime(
			Map<String, Object> paramMap);

	public abstract List<Foot> getAllFootPrintByTime(
			Map<String, Object> paramMap);

	public abstract List<Foot> getTheDayFootPrint(Map<String, Object> paramMap);

	public abstract int editFootByTime(@Param("time") Integer paramInteger1,
			@Param("uid") Integer paramInteger2,
			@Param("id") Integer paramInteger3);

	public abstract Foot queryById(@Param("id") Integer paramInteger);
}
