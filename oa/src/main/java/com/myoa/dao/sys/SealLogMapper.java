package com.myoa.dao.sys;

import com.myoa.model.sys.SealLog;
import com.myoa.model.sys.SealLogExample;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface SealLogMapper {
	public abstract int countByExample(SealLogExample paramSealLogExample);

	public abstract int deleteByExample(SealLogExample paramSealLogExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(SealLog paramSealLog);

	public abstract int insertSelective(SealLog paramSealLog);

	public abstract List<SealLog> selectByExample(
			SealLogExample paramSealLogExample);

	public abstract SealLog selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") SealLog paramSealLog,
			@Param("example") SealLogExample paramSealLogExample);

	public abstract int updateByExample(@Param("record") SealLog paramSealLog,
			@Param("example") SealLogExample paramSealLogExample);

	public abstract int updateByPrimaryKeySelective(SealLog paramSealLog);

	public abstract int updateByPrimaryKey(SealLog paramSealLog);

	public abstract List<SealLog> getAllSealLogInfo(Map<String, Object> paramMap);

	public abstract void deleteSealLog(String[] paramArrayOfString);
}