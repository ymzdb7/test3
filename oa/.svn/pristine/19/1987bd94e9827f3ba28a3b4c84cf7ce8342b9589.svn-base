package com.myoa.dao.portal;

import com.myoa.model.portal.SiteTemplate;
import com.myoa.model.portal.SiteTemplateExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SiteTemplateMapper {
	public abstract int countByExample(
			SiteTemplateExample paramSiteTemplateExample);

	public abstract int deleteByExample(
			SiteTemplateExample paramSiteTemplateExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(SiteTemplate paramSiteTemplate);

	public abstract int insertSelective(SiteTemplate paramSiteTemplate);

	public abstract List<SiteTemplate> selectByExample(
			SiteTemplateExample paramSiteTemplateExample);

	public abstract SiteTemplate selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") SiteTemplate paramSiteTemplate,
			@Param("example") SiteTemplateExample paramSiteTemplateExample);

	public abstract int updateByExample(
			@Param("record") SiteTemplate paramSiteTemplate,
			@Param("example") SiteTemplateExample paramSiteTemplateExample);

	public abstract int updateByPrimaryKeySelective(
			SiteTemplate paramSiteTemplate);

	public abstract int updateByPrimaryKey(SiteTemplate paramSiteTemplate);
}
