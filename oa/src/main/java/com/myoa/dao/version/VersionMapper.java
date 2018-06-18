package com.myoa.dao.version;

import com.myoa.model.version.Version;
import com.myoa.model.version.VersionExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface VersionMapper {
	public abstract int countByExample(VersionExample paramVersionExample);

	public abstract int deleteByExample(VersionExample paramVersionExample);

	public abstract int insert(Version paramVersion);

	public abstract int insertSelective(Version paramVersion);

	public abstract List<Version> selectByExample(
			VersionExample paramVersionExample);

	public abstract int updateByExampleSelective(
			@Param("record") Version paramVersion,
			@Param("example") VersionExample paramVersionExample);

	public abstract int updateByExample(@Param("record") Version paramVersion,
			@Param("example") VersionExample paramVersionExample);

	public abstract String selectVer();

	public abstract int editVer(Version paramVersion);
}
