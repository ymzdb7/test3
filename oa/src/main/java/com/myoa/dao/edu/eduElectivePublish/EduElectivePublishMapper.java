package com.myoa.dao.edu.eduElectivePublish;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.myoa.model.edu.eduElectivePublish.EduElectivePublish;

import java.util.List;
import java.util.Map;

public abstract interface EduElectivePublishMapper extends
		BaseMapper<EduElectivePublish> {
	public abstract List<EduElectivePublish> selectEduPublish(
			EduElectivePublish paramEduElectivePublish);

	public abstract int insertEduEPublish(
			EduElectivePublish paramEduElectivePublish);

	public abstract int updateEduPublish(
			EduElectivePublish paramEduElectivePublish);

	public abstract int deleteEduPublish(Integer paramInteger);

	public abstract Integer studentIDClassID(Map<String, Object> paramMap);

	public abstract EduElectivePublish selectEduPublishOne(Integer paramInteger);
}