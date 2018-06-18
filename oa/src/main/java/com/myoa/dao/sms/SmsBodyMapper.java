package com.myoa.dao.sms;

import com.myoa.model.sms.SmsBody;
import com.myoa.model.sms.SmsBodyExample;
import com.myoa.model.sms.SmsBodyExtend;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface SmsBodyMapper {
	public abstract int countByExample(SmsBodyExample paramSmsBodyExample);

	public abstract int deleteByExample(SmsBodyExample paramSmsBodyExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(SmsBody paramSmsBody);

	public abstract int insertSelective(SmsBody paramSmsBody);

	public abstract List<SmsBody> selectByExampleWithBLOBs(
			SmsBodyExample paramSmsBodyExample);

	public abstract List<SmsBody> selectByExample(
			SmsBodyExample paramSmsBodyExample);

	public abstract SmsBody selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") SmsBody paramSmsBody,
			@Param("example") SmsBodyExample paramSmsBodyExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") SmsBody paramSmsBody,
			@Param("example") SmsBodyExample paramSmsBodyExample);

	public abstract int updateByExample(@Param("record") SmsBody paramSmsBody,
			@Param("example") SmsBodyExample paramSmsBodyExample);

	public abstract int updateByPrimaryKeySelective(SmsBody paramSmsBody);

	public abstract int updateByPrimaryKeyWithBLOBs(SmsBody paramSmsBody);

	public abstract int updateByPrimaryKey(SmsBody paramSmsBody);

	public abstract List<SmsBody> getSmsBodyByMap(Map<String, Object> paramMap);

	public abstract Integer getSmsBodyCountByMap(Map<String, Object> paramMap);

	public abstract List<SmsBody> querySmsBody(Map<String, Object> paramMap);

	public abstract Integer querySmsBodyCount(Map<String, Object> paramMap);

	public abstract List<SmsBodyExtend> SmsListByType(
			Map<String, Object> paramMap);

	public abstract List<String> SmsListMsgByType(Map<String, Object> paramMap);

	public abstract List<SmsBodyExtend> getWillDocSendOrReceive(
			Map<String, Object> paramMap);
}
