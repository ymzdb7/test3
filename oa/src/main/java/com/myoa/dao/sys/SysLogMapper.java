package com.myoa.dao.sys;

import com.myoa.model.common.Syslog;

import java.util.List;
import java.util.Map;

public abstract interface SysLogMapper {
	public abstract List<Syslog> findTotalDay();

	public abstract Long findTotalCount();

	public abstract Long findYearCount(Map<String, String> paramMap);

	public abstract Long findMouthCount(String paramString);

	public abstract Long findDayCount(String paramString);

	public abstract List<Syslog> getTenLog();

	public abstract Integer getThisMonthCount(String paramString);

	public abstract Integer getEachDayLogData(String paramString);

	public abstract int getHourLog(String paramString);

	public abstract List<Syslog> findLogOption(Map<String, Object> paramMap);

	public abstract void deleteLogOption(Map<String, Object> paramMap);

	public abstract String getLogNameByNo(String paramString);

	public abstract void deleteLogById(Integer paramInteger);

	public abstract void deleteAllLog();

	public abstract List<Syslog> getUserLoginLogs(String paramString);

	public abstract List<Syslog> getTenBatchSetLog();

	public abstract List<Syslog> getModifyPwdLog(String paramString);

	public abstract List<Syslog> getPassWordErrLog(Map<String, Object> paramMap);
}
