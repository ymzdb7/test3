package com.myoa.dao.sms2;

import com.myoa.model.sms2.Sms2Priv;
import com.myoa.model.sms2.Sms2PrivExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface Sms2PrivMapper {
	public abstract int countByExample(Sms2PrivExample paramSms2PrivExample);

	public abstract int deleteByExample(Sms2PrivExample paramSms2PrivExample);

	public abstract int insert(Sms2Priv paramSms2Priv);

	public abstract int insertSelective(Sms2Priv paramSms2Priv);

	public abstract List<Sms2Priv> selectByExampleWithBLOBs(
			Sms2PrivExample paramSms2PrivExample);

	public abstract List<Sms2Priv> selectByExample(
			Sms2PrivExample paramSms2PrivExample);

	public abstract int updateByExampleSelective(
			@Param("record") Sms2Priv paramSms2Priv,
			@Param("example") Sms2PrivExample paramSms2PrivExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") Sms2Priv paramSms2Priv,
			@Param("example") Sms2PrivExample paramSms2PrivExample);

	public abstract int updateByExample(
			@Param("record") Sms2Priv paramSms2Priv,
			@Param("example") Sms2PrivExample paramSms2PrivExample);

	public abstract int upSms2Priv(Sms2Priv paramSms2Priv);

	public abstract Sms2Priv selectSms2Priv();

	public abstract List<Sms2Priv> selectSms2Priv1(String[] paramArrayOfString);

	public abstract List<Sms2Priv> selectRemindPriv1(String[] paramArrayOfString);

	public abstract List<Sms2Priv> selectSms2RemindPriv1(
			String[] paramArrayOfString);

	public abstract List<Sms2Priv> upRemindPriv(String[] paramArrayOfString);

	public abstract List<Sms2Priv> upselectSms2RemindPriv(
			String[] paramArrayOfString);

	public abstract List<Sms2Priv> selectModule(String[] paramArrayOfString);

	public abstract List<Sms2Priv> selectModuleOrder();

	public abstract Sms2Priv selectSmsRemind();

	public abstract int upSmsRemindSet(Sms2Priv paramSms2Priv);

	public abstract String selSenderMobile(String paramString);

	public abstract List<Sms2Priv> selOutPriv(String[] paramArrayOfString);

	public abstract List<Sms2Priv> upOutPriv(String[] paramArrayOfString);

	public abstract int outToSelf(Sms2Priv paramSms2Priv);
}
