package com.myoa.dao.portalArticle;

import com.myoa.model.portalArticle.PortalArticle;
import com.myoa.model.portalArticle.PortalArticleExample;
import com.myoa.model.portalArticle.PortalArticleWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface PortalArticleMapper {
	public abstract int countByExample(
			PortalArticleExample paramPortalArticleExample);

	public abstract int deleteByExample(
			PortalArticleExample paramPortalArticleExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(
			PortalArticleWithBLOBs paramPortalArticleWithBLOBs);

	public abstract int insertSelective(
			PortalArticleWithBLOBs paramPortalArticleWithBLOBs);

	public abstract List<PortalArticleWithBLOBs> selectByExampleWithBLOBs(
			PortalArticleExample paramPortalArticleExample);

	public abstract List<PortalArticle> selectByExample(
			PortalArticleExample paramPortalArticleExample);

	public abstract PortalArticleWithBLOBs selectByPrimaryKey(
			Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") PortalArticleWithBLOBs paramPortalArticleWithBLOBs,
			@Param("example") PortalArticleExample paramPortalArticleExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") PortalArticleWithBLOBs paramPortalArticleWithBLOBs,
			@Param("example") PortalArticleExample paramPortalArticleExample);

	public abstract int updateByExample(
			@Param("record") PortalArticle paramPortalArticle,
			@Param("example") PortalArticleExample paramPortalArticleExample);

	public abstract int updateByPrimaryKeySelective(
			PortalArticleWithBLOBs paramPortalArticleWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			PortalArticleWithBLOBs paramPortalArticleWithBLOBs);

	public abstract int updateByPrimaryKey(
			PortalArticleWithBLOBs paramPortalArticleWithBLOBs);

	public abstract List<PortalArticleWithBLOBs> selectPortalArticle(
			PortalArticleWithBLOBs paramPortalArticleWithBLOBs);

	public abstract int delPortalArticle(
			PortalArticleWithBLOBs paramPortalArticleWithBLOBs);

	public abstract List<PortalArticleWithBLOBs> columnExpandArticle(
			Integer paramInteger);
}