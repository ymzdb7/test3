package com.myoa.dao.edu.eduTrainingPlan;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.myoa.model.edu.eduTrainingPlan.EduTrainingPlan;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface EduTrainingPlanMapper extends
		BaseMapper<EduTrainingPlan> {
	public abstract EduTrainingPlan getTraindetailById(int paramInt);

	public abstract List<EduTrainingPlan> getAll(Map<String, Object> paramMap);

	public abstract void editTrain(EduTrainingPlan paramEduTrainingPlan);

	public abstract void deleteObject(
			@Param("planIds") String[] paramArrayOfString);

	public abstract void deleteObjectById(String paramString);

	public abstract void addTrain(EduTrainingPlan paramEduTrainingPlan);

	public abstract List<EduTrainingPlan> queryTrain(
			Map<String, Object> paramMap);

	public abstract int getCount();

	public abstract List<EduTrainingPlan> getEduTrainByStatus(
			Map<String, Object> paramMap);

	public abstract void editEduTrainByStatus(
			EduTrainingPlan paramEduTrainingPlan);

	public abstract List<EduTrainingPlan> QueryPlan(Map<String, Object> paramMap);

	public abstract List<EduTrainingPlan> QueryPlanStatus(
			Map<String, Object> paramMap);

	public abstract List<EduTrainingPlan> getMinePlanByStatus(
			Map<String, Object> paramMap);

	public abstract List<EduTrainingPlan> getAllPlan();

	public abstract List<EduTrainingPlan> getAllPlanTrue();
}