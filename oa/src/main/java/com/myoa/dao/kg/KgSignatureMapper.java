package com.myoa.dao.kg;

import com.myoa.kg.model.KgSignature;
import com.myoa.kg.model.KgSignatureExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface KgSignatureMapper {
	public abstract int countByExample(
			KgSignatureExample paramKgSignatureExample);

	public abstract int deleteByExample(
			KgSignatureExample paramKgSignatureExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(KgSignature paramKgSignature);

	public abstract int insertSelective(KgSignature paramKgSignature);

	public abstract List<KgSignature> selectByExample(
			KgSignatureExample paramKgSignatureExample);

	public abstract KgSignature selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") KgSignature paramKgSignature,
			@Param("example") KgSignatureExample paramKgSignatureExample);

	public abstract int updateByExample(
			@Param("record") KgSignature paramKgSignature,
			@Param("example") KgSignatureExample paramKgSignatureExample);

	public abstract int updateByPrimaryKeySelective(KgSignature paramKgSignature);

	public abstract int updateByPrimaryKey(KgSignature paramKgSignature);

	public abstract List<KgSignature> selectUserSign(
			@Param("userId") Integer paramInteger);

	public abstract List<KgSignature> getKgSignatureList();
}
