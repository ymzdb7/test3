package com.myoa.dao.kg;

import com.myoa.kg.model.KgSignKey;
import com.myoa.kg.model.KgSignKeyExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface KgSignKeyMapper {
	public abstract int countByExample(KgSignKeyExample paramKgSignKeyExample);

	public abstract int deleteByExample(KgSignKeyExample paramKgSignKeyExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(KgSignKey paramKgSignKey);

	public abstract int insertSelective(KgSignKey paramKgSignKey);

	public abstract List<KgSignKey> selectByExample(
			KgSignKeyExample paramKgSignKeyExample);

	public abstract KgSignKey selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") KgSignKey paramKgSignKey,
			@Param("example") KgSignKeyExample paramKgSignKeyExample);

	public abstract int updateByExample(
			@Param("record") KgSignKey paramKgSignKey,
			@Param("example") KgSignKeyExample paramKgSignKeyExample);

	public abstract int updateByPrimaryKeySelective(KgSignKey paramKgSignKey);

	public abstract int updateByPrimaryKey(KgSignKey paramKgSignKey);

	public abstract List<KgSignKey> selectUserKey(
			@Param("userId") Integer paramInteger);

	public abstract List<KgSignKey> getKgSignKeyList(Integer paramInteger);
}