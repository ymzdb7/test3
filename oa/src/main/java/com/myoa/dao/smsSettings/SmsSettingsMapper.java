package com.myoa.dao.smsSettings;

import com.myoa.model.smsSettings.SmsSettings;
import com.myoa.model.smsSettings.SmsSettingsExample;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface SmsSettingsMapper {
	public abstract int countByExample(
			SmsSettingsExample paramSmsSettingsExample);

	public abstract int deleteByExample(
			SmsSettingsExample paramSmsSettingsExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(SmsSettings paramSmsSettings);

	public abstract int insertSelective(SmsSettings paramSmsSettings);

	public abstract List<SmsSettings> selectByExample(
			SmsSettingsExample paramSmsSettingsExample);

	public abstract SmsSettings selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") SmsSettings paramSmsSettings,
			@Param("example") SmsSettingsExample paramSmsSettingsExample);

	public abstract int updateByExample(
			@Param("record") SmsSettings paramSmsSettings,
			@Param("example") SmsSettingsExample paramSmsSettingsExample);

	public abstract int updateByPrimaryKeySelective(SmsSettings paramSmsSettings);

	public abstract int updateByPrimaryKey(SmsSettings paramSmsSettings);

	public abstract List<SmsSettings> selectSmsSettings(
			Map<String, Object> paramMap);

	public abstract List<SmsSettings> selectSmsSettingsAll(
			Map<String, Object> paramMap);

	public abstract List<SmsSettings> selectSmsSettingsState(
			Integer paramInteger);

	public abstract int upSmsSettingsState(Integer paramInteger);
}
