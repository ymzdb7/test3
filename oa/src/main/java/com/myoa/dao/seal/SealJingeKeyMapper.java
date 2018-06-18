package com.myoa.dao.seal;

import com.myoa.model.seal.SealJingeKey;
import com.myoa.model.seal.SealJingeKeyExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SealJingeKeyMapper {
	public abstract int countByExample(
			SealJingeKeyExample paramSealJingeKeyExample);

	public abstract int deleteByExample(
			SealJingeKeyExample paramSealJingeKeyExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(SealJingeKey paramSealJingeKey);

	public abstract int insertSelective(SealJingeKey paramSealJingeKey);

	public abstract List<SealJingeKey> selectByExample(
			SealJingeKeyExample paramSealJingeKeyExample);

	public abstract SealJingeKey selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") SealJingeKey paramSealJingeKey,
			@Param("example") SealJingeKeyExample paramSealJingeKeyExample);

	public abstract int updateByExample(
			@Param("record") SealJingeKey paramSealJingeKey,
			@Param("example") SealJingeKeyExample paramSealJingeKeyExample);

	public abstract int updateByPrimaryKeySelective(
			SealJingeKey paramSealJingeKey);

	public abstract int updateByPrimaryKey(SealJingeKey paramSealJingeKey);

	public abstract SealJingeKey getSealJinge(Integer paramInteger);

	public abstract int deleteBySealId(Integer paramInteger);
}
