package com.myoa.dao.customNumber;

import com.myoa.model.customNumber.CustomNumberRecord;
import com.myoa.model.customNumber.CustomNumberRecordExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface CustomNumberRecordMapper {
	public abstract int countByExample(
			CustomNumberRecordExample paramCustomNumberRecordExample);

	public abstract int deleteByExample(
			CustomNumberRecordExample paramCustomNumberRecordExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(CustomNumberRecord paramCustomNumberRecord);

	public abstract int insertSelective(
			CustomNumberRecord paramCustomNumberRecord);

	public abstract List<CustomNumberRecord> selectByExample(
			CustomNumberRecordExample paramCustomNumberRecordExample);

	public abstract CustomNumberRecord selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") CustomNumberRecord paramCustomNumberRecord,
			@Param("example") CustomNumberRecordExample paramCustomNumberRecordExample);

	public abstract int updateByExample(
			@Param("record") CustomNumberRecord paramCustomNumberRecord,
			@Param("example") CustomNumberRecordExample paramCustomNumberRecordExample);

	public abstract int updateByPrimaryKeySelective(
			CustomNumberRecord paramCustomNumberRecord);

	public abstract int updateByPrimaryKey(
			CustomNumberRecord paramCustomNumberRecord);

	public abstract List<CustomNumberRecord> queryCustomNumberRecordBymodel(
			@Param("typeId") String paramString1,
			@Param("modelId") String paramString2);
}