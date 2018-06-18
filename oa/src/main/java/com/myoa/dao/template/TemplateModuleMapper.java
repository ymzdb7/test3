package com.myoa.dao.template;

import com.myoa.model.template.TemplateModule;
import com.myoa.model.template.TemplateModuleExample;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface TemplateModuleMapper {
	public abstract int countByExample(
			TemplateModuleExample paramTemplateModuleExample);

	public abstract int deleteByExample(
			TemplateModuleExample paramTemplateModuleExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(TemplateModule paramTemplateModule);

	public abstract int insertSelective(TemplateModule paramTemplateModule);

	public abstract List<TemplateModule> selectByExample(
			TemplateModuleExample paramTemplateModuleExample);

	public abstract TemplateModule selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") TemplateModule paramTemplateModule,
			@Param("example") TemplateModuleExample paramTemplateModuleExample);

	public abstract int updateByExample(
			@Param("record") TemplateModule paramTemplateModule,
			@Param("example") TemplateModuleExample paramTemplateModuleExample);

	public abstract int updateByPrimaryKeySelective(
			TemplateModule paramTemplateModule);

	public abstract int updateByPrimaryKey(TemplateModule paramTemplateModule);

	public abstract List<TemplateModule> query(Map<String, Object> paramMap);

	public abstract Integer queryCount(Map<String, Object> paramMap);

	public abstract List<TemplateModule> queryByPriv(
			Map<String, Object> paramMap);

	public abstract Integer queryCountByPriv(Map<String, Object> paramMap);
}
