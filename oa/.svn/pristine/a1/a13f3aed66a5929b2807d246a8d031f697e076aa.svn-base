package com.myoa.dao.officesupplies;

import com.myoa.model.officesupplies.OfficeTranshistory;
import com.myoa.model.officesupplies.OfficeTranshistoryExample;
import com.myoa.model.officesupplies.OfficeTranshistoryWithBLOBs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface OfficeTranshistoryMapper {
	public abstract int countByExample(
			OfficeTranshistoryExample paramOfficeTranshistoryExample);

	public abstract int deleteByExample(
			OfficeTranshistoryExample paramOfficeTranshistoryExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(
			OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs);

	public abstract int insertSelective(
			OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs);

	public abstract List<OfficeTranshistoryWithBLOBs> selectByExampleWithBLOBs(
			OfficeTranshistoryExample paramOfficeTranshistoryExample);

	public abstract List<OfficeTranshistory> selectByExample(
			OfficeTranshistoryExample paramOfficeTranshistoryExample);

	public abstract OfficeTranshistoryWithBLOBs selectByPrimaryKey(
			Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs,
			@Param("example") OfficeTranshistoryExample paramOfficeTranshistoryExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs,
			@Param("example") OfficeTranshistoryExample paramOfficeTranshistoryExample);

	public abstract int updateByExample(
			@Param("record") OfficeTranshistory paramOfficeTranshistory,
			@Param("example") OfficeTranshistoryExample paramOfficeTranshistoryExample);

	public abstract int updateByPrimaryKeySelective(
			OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs);

	public abstract int updateByPrimaryKey(
			OfficeTranshistory paramOfficeTranshistory);

	public abstract List<OfficeTranshistoryWithBLOBs> getMyHistory(
			OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs);

	public abstract List<OfficeTranshistoryWithBLOBs> selTranshistoryByState(
			String paramString);

	public abstract int upTransHistoryState(
			OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs);

	public abstract List<OfficeTranshistoryWithBLOBs> selGrantByCond(
			Map<String, Object> paramMap);

	public abstract int selGrantCountByCond(
			OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs);

	public abstract int upGrantStatus(
			OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs);

	public abstract List<OfficeTranshistoryWithBLOBs> selTranshistoryByCond(
			OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs);

	public abstract List<OfficeTranshistoryWithBLOBs> selMaintain(
			OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs);

	public abstract List<OfficeTranshistoryWithBLOBs> selInstead(
			OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs);

	public abstract int isApproval(
			OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs);

	public abstract int isGrant(
			OfficeTranshistoryWithBLOBs paramOfficeTranshistoryWithBLOBs);
}
