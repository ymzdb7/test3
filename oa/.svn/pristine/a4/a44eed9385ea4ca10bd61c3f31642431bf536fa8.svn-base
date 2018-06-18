package com.myoa.dao.kg;

import com.myoa.kg.model.KgRelationKeyUser;
import com.myoa.kg.model.KgRelationKeyUserExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface KgRelationKeyUserMapper {
	public abstract int countByExample(
			KgRelationKeyUserExample paramKgRelationKeyUserExample);

	public abstract int deleteByExample(
			KgRelationKeyUserExample paramKgRelationKeyUserExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(KgRelationKeyUser paramKgRelationKeyUser);

	public abstract int insertSelective(KgRelationKeyUser paramKgRelationKeyUser);

	public abstract List<KgRelationKeyUser> selectByExample(
			KgRelationKeyUserExample paramKgRelationKeyUserExample);

	public abstract KgRelationKeyUser selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") KgRelationKeyUser paramKgRelationKeyUser,
			@Param("example") KgRelationKeyUserExample paramKgRelationKeyUserExample);

	public abstract int updateByExample(
			@Param("record") KgRelationKeyUser paramKgRelationKeyUser,
			@Param("example") KgRelationKeyUserExample paramKgRelationKeyUserExample);

	public abstract int updateByPrimaryKeySelective(
			KgRelationKeyUser paramKgRelationKeyUser);

	public abstract int updateByPrimaryKey(
			KgRelationKeyUser paramKgRelationKeyUser);
}
