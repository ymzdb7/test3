package com.myoa.dao.sms2;

import com.myoa.model.sms2.Sms2;
import com.myoa.model.sms2.Sms2Example;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface Sms2Mapper {
	public abstract int countByExample(Sms2Example paramSms2Example);

	public abstract int deleteByExample(Sms2Example paramSms2Example);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(Sms2 paramSms2);

	public abstract int insertSelective(Sms2 paramSms2);

	public abstract List<Sms2> selectByExampleWithBLOBs(
			Sms2Example paramSms2Example);

	public abstract List<Sms2> selectByExample(Sms2Example paramSms2Example);

	public abstract Sms2 selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") Sms2 paramSms2,
			@Param("example") Sms2Example paramSms2Example);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") Sms2 paramSms2,
			@Param("example") Sms2Example paramSms2Example);

	public abstract int updateByExample(@Param("record") Sms2 paramSms2,
			@Param("example") Sms2Example paramSms2Example);

	public abstract int updateByPrimaryKeySelective(Sms2 paramSms2);

	public abstract int updateByPrimaryKeyWithBLOBs(Sms2 paramSms2);

	public abstract int updateByPrimaryKey(Sms2 paramSms2);

	public abstract List<Sms2> selectSms2(Map<String, Object> paramMap);

	public abstract int delSms2(Sms2 paramSms2);

	public abstract Integer getSmsCountByMap(Map<String, Object> paramMap);
}
