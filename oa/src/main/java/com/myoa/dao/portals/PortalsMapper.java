package com.myoa.dao.portals;

import com.myoa.model.portals.Portals;
import com.myoa.model.portals.PortalsExample;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface PortalsMapper {
	public abstract int countByExample(PortalsExample paramPortalsExample);

	public abstract int deleteByExample(PortalsExample paramPortalsExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(Portals paramPortals);

	public abstract int insertSelective(Portals paramPortals);

	public abstract List<Portals> selectByExample(
			PortalsExample paramPortalsExample);

	public abstract Portals selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") Portals paramPortals,
			@Param("example") PortalsExample paramPortalsExample);

	public abstract int updateByExample(@Param("record") Portals paramPortals,
			@Param("example") PortalsExample paramPortalsExample);

	public abstract int updateByPrimaryKeySelective(Portals paramPortals);

	public abstract int updateByPrimaryKey(Portals paramPortals);

	public abstract List<Portals> selPortals(Map<String, Object> paramMap);

	public abstract void deletePortalsByIds(
			@Param("ids") String[] paramArrayOfString);

	public abstract Portals selPortalsById(
			@Param("portalsId") Integer paramInteger);
}
