package com.myoa.dao.portalTemplate;

import com.myoa.model.portalTemplate.PortalTemplate;
import com.myoa.model.portalTemplate.PortalTemplateExample;
import com.myoa.model.portalTemplate.PortalTemplateWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface PortalTemplateMapper {
	public abstract int countByExample(
			PortalTemplateExample paramPortalTemplateExample);

	public abstract int deleteByExample(
			PortalTemplateExample paramPortalTemplateExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(
			PortalTemplateWithBLOBs paramPortalTemplateWithBLOBs);

	public abstract int insertSelective(
			PortalTemplateWithBLOBs paramPortalTemplateWithBLOBs);

	public abstract List<PortalTemplateWithBLOBs> selectByExampleWithBLOBs(
			PortalTemplateExample paramPortalTemplateExample);

	public abstract List<PortalTemplate> selectByExample(
			PortalTemplateExample paramPortalTemplateExample);

	public abstract PortalTemplateWithBLOBs selectByPrimaryKey(
			Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") PortalTemplateWithBLOBs paramPortalTemplateWithBLOBs,
			@Param("example") PortalTemplateExample paramPortalTemplateExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") PortalTemplateWithBLOBs paramPortalTemplateWithBLOBs,
			@Param("example") PortalTemplateExample paramPortalTemplateExample);

	public abstract int updateByExample(
			@Param("record") PortalTemplate paramPortalTemplate,
			@Param("example") PortalTemplateExample paramPortalTemplateExample);

	public abstract int updateByPrimaryKeySelective(
			PortalTemplateWithBLOBs paramPortalTemplateWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			PortalTemplateWithBLOBs paramPortalTemplateWithBLOBs);

	public abstract int updateByPrimaryKey(PortalTemplate paramPortalTemplate);

	public abstract List<PortalTemplateWithBLOBs> selectPortalTemplate(
			Integer paramInteger);

	public abstract int delPortalTemplate(
			PortalTemplateWithBLOBs paramPortalTemplateWithBLOBs);
}
