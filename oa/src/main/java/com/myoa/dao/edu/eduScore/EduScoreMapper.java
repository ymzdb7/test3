package com.myoa.dao.edu.eduScore;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.myoa.model.edu.eduScore.EduScore;

import java.util.List;
import java.util.Map;

public abstract interface EduScoreMapper extends BaseMapper<EduScore> {
	public abstract int eudScoreInsert(EduScore paramEduScore);

	public abstract List<String> yearSelect(String paramString);

	public abstract List<EduScore> yearClassSelect(Map<String, String> paramMap);

	public abstract Map<String, Object> selectGradeNameID(String paramString);

	public abstract String selectClassID(Map<String, Object> paramMap);

	public abstract int eduScoreTww(String paramString);

	public abstract String eduScoreTwwSelect();
}