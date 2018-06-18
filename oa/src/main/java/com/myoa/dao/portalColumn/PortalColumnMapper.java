package com.myoa.dao.portalColumn;

import com.myoa.model.portalColumn.PortalColumn;
import com.myoa.model.portalColumn.PortalColumnExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface PortalColumnMapper {
	public abstract int countByExample(
			PortalColumnExample paramPortalColumnExample);

	public abstract int deleteByExample(
			PortalColumnExample paramPortalColumnExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(PortalColumn paramPortalColumn);

	public abstract int insertSelective(PortalColumn paramPortalColumn);

	public abstract List<PortalColumn> selectByExampleWithBLOBs(
			PortalColumnExample paramPortalColumnExample);

	public abstract List<PortalColumn> selectByExample(
			PortalColumnExample paramPortalColumnExample);

	public abstract PortalColumn selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") PortalColumn paramPortalColumn,
			@Param("example") PortalColumnExample paramPortalColumnExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") PortalColumn paramPortalColumn,
			@Param("example") PortalColumnExample paramPortalColumnExample);

	public abstract int updateByExample(
			@Param("record") PortalColumn paramPortalColumn,
			@Param("example") PortalColumnExample paramPortalColumnExample);

	public abstract int updateByPrimaryKeySelective(
			PortalColumn paramPortalColumn);

	public abstract int updateByPrimaryKeyWithBLOBs(
			PortalColumn paramPortalColumn);

	public abstract int updateByPrimaryKey(PortalColumn paramPortalColumn);

	public abstract List<PortalColumn> selectPortalColumn();

	public abstract int delPortalColumn(Integer[] paramArrayOfInteger);

	public abstract int count(Integer paramInteger);

	public abstract List<PortalColumn> siteExpandColumn(
			@Param("sid") Integer paramInteger,
			@Param("colIds") Integer[] paramArrayOfInteger);

	public abstract List<PortalColumn> columnExpandColumn(
			@Param("sid") Integer paramInteger,
			@Param("colIds") Integer[] paramArrayOfInteger);

	public abstract int columnCount(@Param("portalId") Integer paramInteger1,
			@Param("columnId") Integer paramInteger2);
}
