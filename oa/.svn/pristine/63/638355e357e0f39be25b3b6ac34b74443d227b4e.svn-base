package com.myoa.dao.rms;

import com.myoa.model.rms.RmsRoll;
import com.myoa.model.rms.RmsRollExample;
import com.myoa.model.rms.RmsRollWithBLOBs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface RmsRollMapper {
	public abstract int countByExample(RmsRollExample paramRmsRollExample);

	public abstract int deleteByExample(RmsRollExample paramRmsRollExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(RmsRollWithBLOBs paramRmsRollWithBLOBs);

	public abstract int insertSelective(RmsRollWithBLOBs paramRmsRollWithBLOBs);

	public abstract List<RmsRollWithBLOBs> selectByExampleWithBLOBs(
			RmsRollExample paramRmsRollExample);

	public abstract List<RmsRoll> selectByExample(
			RmsRollExample paramRmsRollExample);

	public abstract RmsRollWithBLOBs selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") RmsRollWithBLOBs paramRmsRollWithBLOBs,
			@Param("example") RmsRollExample paramRmsRollExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") RmsRollWithBLOBs paramRmsRollWithBLOBs,
			@Param("example") RmsRollExample paramRmsRollExample);

	public abstract int updateByExample(@Param("record") RmsRoll paramRmsRoll,
			@Param("example") RmsRollExample paramRmsRollExample);

	public abstract int updateByPrimaryKeySelective(
			RmsRollWithBLOBs paramRmsRollWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			RmsRollWithBLOBs paramRmsRollWithBLOBs);

	public abstract int updateByPrimaryKey(RmsRoll paramRmsRoll);

	public abstract List<RmsRollWithBLOBs> query(Map<String, Object> paramMap);

	public abstract RmsRollWithBLOBs selectById(
			@Param("rollId") Integer paramInteger);

	public abstract void deleteByRollIds(
			@Param("rollIds") String[] paramArrayOfString);

	public abstract List<RmsRollWithBLOBs> selectAll();

	public abstract List<RmsRollWithBLOBs> selectByName(
			@Param("rollName") String paramString);
}
