package com.myoa.dao.seal;

import com.myoa.model.seal.SealJinge;
import com.myoa.model.seal.SealJingeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SealJingeMapper {
	public abstract int countByExample(SealJingeExample paramSealJingeExample);

	public abstract int deleteByExample(SealJingeExample paramSealJingeExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(SealJinge paramSealJinge);

	public abstract int insertSelective(SealJinge paramSealJinge);

	public abstract List<SealJinge> selectByExample(
			SealJingeExample paramSealJingeExample);

	public abstract SealJinge selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") SealJinge paramSealJinge,
			@Param("example") SealJingeExample paramSealJingeExample);

	public abstract int updateByExample(
			@Param("record") SealJinge paramSealJinge,
			@Param("example") SealJingeExample paramSealJingeExample);

	public abstract int updateByPrimaryKeySelective(SealJinge paramSealJinge);

	public abstract int updateByPrimaryKey(SealJinge paramSealJinge);

	public abstract List<SealJinge> getSealJingeList();
}
