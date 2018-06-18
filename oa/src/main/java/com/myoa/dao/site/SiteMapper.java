package com.myoa.dao.site;

import com.myoa.model.site.Site;
import com.myoa.model.site.SiteExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SiteMapper {
	public abstract int countByExample(SiteExample paramSiteExample);

	public abstract int deleteByExample(SiteExample paramSiteExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(Site paramSite);

	public abstract int insertSelective(Site paramSite);

	public abstract List<Site> selectByExample(SiteExample paramSiteExample);

	public abstract Site selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") Site paramSite,
			@Param("example") SiteExample paramSiteExample);

	public abstract int updateByExample(@Param("record") Site paramSite,
			@Param("example") SiteExample paramSiteExample);

	public abstract int updateByPrimaryKeySelective(Site paramSite);

	public abstract int updateByPrimaryKey(Site paramSite);

	public abstract List<Site> selectSite();

	public abstract int delSite(Site paramSite);

	public abstract List<Site> selectSiteSids(Integer[] paramArrayOfInteger);

	public abstract Site selectSiteByTemp(Integer paramInteger);
}