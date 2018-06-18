package com.myoa.dao.edu.eduSchoolBusiness;

import com.myoa.model.edu.eduSchoolBusiness.EduSchoolBusiness;
import com.myoa.model.edu.eduSchoolBusiness.EduSchoolBusinessExample;
import com.myoa.model.edu.eduSchoolBusiness.EduSchoolBusinessWithBLOBs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface EduSchoolBusinessMapper {
	public abstract int countByExample(
			EduSchoolBusinessExample paramEduSchoolBusinessExample);

	public abstract int deleteByExample(
			EduSchoolBusinessExample paramEduSchoolBusinessExample);

	public abstract int insert(
			EduSchoolBusinessWithBLOBs paramEduSchoolBusinessWithBLOBs);

	public abstract int insertSelective(
			EduSchoolBusinessWithBLOBs paramEduSchoolBusinessWithBLOBs);

	public abstract List<EduSchoolBusinessWithBLOBs> selectByExampleWithBLOBs(
			EduSchoolBusinessExample paramEduSchoolBusinessExample);

	public abstract List<EduSchoolBusiness> selectByExample(
			EduSchoolBusinessExample paramEduSchoolBusinessExample);

	public abstract int updateByExampleSelective(
			@Param("record") EduSchoolBusinessWithBLOBs paramEduSchoolBusinessWithBLOBs,
			@Param("example") EduSchoolBusinessExample paramEduSchoolBusinessExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") EduSchoolBusinessWithBLOBs paramEduSchoolBusinessWithBLOBs,
			@Param("example") EduSchoolBusinessExample paramEduSchoolBusinessExample);

	public abstract int updateByExample(
			@Param("record") EduSchoolBusiness paramEduSchoolBusiness,
			@Param("example") EduSchoolBusinessExample paramEduSchoolBusinessExample);

	public abstract List<EduSchoolBusiness> eduSchoolBusList(
			Map<String, Object> paramMap);

	public abstract int updateEduSchoolBus(
			EduSchoolBusiness paramEduSchoolBusiness);

	public abstract int addEduSchoolBus(EduSchoolBusiness paramEduSchoolBusiness);

	public abstract List<Map<String, Object>> eduSchoolConunt(
			Map<String, Object> paramMap);

	public abstract int eduSchoolDelete(Integer paramInteger);

	public abstract EduSchoolBusiness eduSchoolOnerSelect(Integer paramInteger);

	public abstract Map<String, Object> eduSchoolYuangong(
			Map<String, Object> paramMap);

	public abstract List<EduSchoolBusiness> unreadEduSchool(
			Map<String, Object> paramMap);

	public abstract List<EduSchoolBusiness> readEduSchool(
			Map<String, Object> paramMap);

	public abstract List<EduSchoolBusiness> eduSchoolYuanggongXiangqing(
			Map<String, Object> paramMap);

	public abstract int eudSchollTop(Map<String, Object> paramMap);

	public abstract int eduSchollPublish(Map<String, Object> paramMap);

	public abstract EduSchoolBusiness eduDetailedNotify(
			Map<String, Object> paramMap);

	public abstract void updateReaders(EduSchoolBusiness paramEduSchoolBusiness);
}