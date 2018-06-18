package com.myoa.dao.rms;

import com.myoa.model.rms.RmsFile;
import com.myoa.model.rms.RmsFileExample;
import com.myoa.model.rms.RmsFileWithBLOBs;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface RmsFileMapper {
	public abstract int countByExample(RmsFileExample paramRmsFileExample);

	public abstract int deleteByExample(RmsFileExample paramRmsFileExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(RmsFileWithBLOBs paramRmsFileWithBLOBs);

	public abstract int insertSelective(RmsFileWithBLOBs paramRmsFileWithBLOBs);

	public abstract List<RmsFileWithBLOBs> selectByExampleWithBLOBs(
			RmsFileExample paramRmsFileExample);

	public abstract List<RmsFile> selectByExample(
			RmsFileExample paramRmsFileExample);

	public abstract RmsFileWithBLOBs selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") RmsFileWithBLOBs paramRmsFileWithBLOBs,
			@Param("example") RmsFileExample paramRmsFileExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") RmsFileWithBLOBs paramRmsFileWithBLOBs,
			@Param("example") RmsFileExample paramRmsFileExample);

	public abstract int updateByExample(@Param("record") RmsFile paramRmsFile,
			@Param("example") RmsFileExample paramRmsFileExample);

	public abstract int updateByPrimaryKeySelective(
			RmsFileWithBLOBs paramRmsFileWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			RmsFileWithBLOBs paramRmsFileWithBLOBs);

	public abstract int updateByPrimaryKey(RmsFile paramRmsFile);

	public abstract List<RmsFileWithBLOBs> query(Map<String, Object> paramMap);

	public abstract void destroy(@Param("fileIds") String[] paramArrayOfString,
			@Param("delUser") String paramString,
			@Param("delTime") Date paramDate);

	public abstract void delete(@Param("fileIds") String[] paramArrayOfString);

	public abstract void restore(@Param("fileIds") String[] paramArrayOfString);

	public abstract void updateRollBath(
			@Param("fileIds") String[] paramArrayOfString,
			@Param("rollId") Integer paramInteger);

	public abstract List<RmsFileWithBLOBs> selectByFileIds(
			@Param("fileIds") String[] paramArrayOfString);
}
