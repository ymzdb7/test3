package com.myoa.dao.edu.eduTrainingPlanRecord;

import com.myoa.model.edu.eduTrainingPlanRecord.EduTrainingRecord;
import com.myoa.model.edu.eduTrainingPlanRecord.EduTrainingRecordExample;
import com.myoa.model.edu.eduTrainingPlanRecord.EduTrainingRecordWithBLOBs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface EduTrainingRecordMapper {
	public abstract int countByExample(
			EduTrainingRecordExample paramEduTrainingRecordExample);

	public abstract int deleteByExample(
			EduTrainingRecordExample paramEduTrainingRecordExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(
			EduTrainingRecordWithBLOBs paramEduTrainingRecordWithBLOBs);

	public abstract int insertSelective(
			EduTrainingRecordWithBLOBs paramEduTrainingRecordWithBLOBs);

	public abstract List<EduTrainingRecordWithBLOBs> selectByExampleWithBLOBs(
			EduTrainingRecordExample paramEduTrainingRecordExample);

	public abstract List<EduTrainingRecord> selectByExample(
			EduTrainingRecordExample paramEduTrainingRecordExample);

	public abstract EduTrainingRecordWithBLOBs selectByPrimaryKey(
			Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") EduTrainingRecordWithBLOBs paramEduTrainingRecordWithBLOBs,
			@Param("example") EduTrainingRecordExample paramEduTrainingRecordExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") EduTrainingRecordWithBLOBs paramEduTrainingRecordWithBLOBs,
			@Param("example") EduTrainingRecordExample paramEduTrainingRecordExample);

	public abstract int updateByExample(
			@Param("record") EduTrainingRecord paramEduTrainingRecord,
			@Param("example") EduTrainingRecordExample paramEduTrainingRecordExample);

	public abstract int updateByPrimaryKeySelective(
			EduTrainingRecordWithBLOBs paramEduTrainingRecordWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			EduTrainingRecordWithBLOBs paramEduTrainingRecordWithBLOBs);

	public abstract int updateByPrimaryKey(
			EduTrainingRecord paramEduTrainingRecord);

	public abstract List<EduTrainingRecordWithBLOBs> getAll(
			Map<String, Object> paramMap);

	public abstract List<EduTrainingRecordWithBLOBs> queryRecord(
			Map<String, Object> paramMap);

	public abstract void deleteByIds(
			@Param("recordIds") String[] paramArrayOfString);

	public abstract int getCount();
}
