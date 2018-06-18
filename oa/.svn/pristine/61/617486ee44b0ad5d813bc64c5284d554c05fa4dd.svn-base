package com.myoa.dao.supervision;

import com.myoa.model.supervision.Supervision;
import com.myoa.model.supervision.SupervisionExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SupervisionMapper {
	public abstract int countByExample(
			SupervisionExample paramSupervisionExample);

	public abstract int deleteByExample(
			SupervisionExample paramSupervisionExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(Supervision paramSupervision);

	public abstract int insertSelective(Supervision paramSupervision);

	public abstract List<Supervision> selectByExample(
			SupervisionExample paramSupervisionExample);

	public abstract Supervision selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") Supervision paramSupervision,
			@Param("example") SupervisionExample paramSupervisionExample);

	public abstract int updateByExample(
			@Param("record") Supervision paramSupervision,
			@Param("example") SupervisionExample paramSupervisionExample);

	public abstract int updateByPrimaryKeySelective(Supervision paramSupervision);

	public abstract int updateByPrimaryKey(Supervision paramSupervision);

	public abstract List<Supervision> getSupManageByTypeId(Integer paramInteger);

	public abstract int addSupervision(Supervision paramSupervision);

	public abstract void deleteSupervisionBySid(Integer paramInteger);

	public abstract List<Supervision> selectCountList(
			Supervision paramSupervision);

	public abstract int queryCountSupervisionByStatus();

	public abstract Supervision getSupAssistDetail(Supervision paramSupervision);

	public abstract Supervision queryCountSupervisionByStatus(
			Supervision paramSupervision);

	public abstract List<Supervision> getSupApplyTaskList1(
			Supervision paramSupervision);

	public abstract Supervision queryCountByType(Supervision paramSupervision);

	public abstract Supervision queryCount();

	public abstract int updateSupervision(Supervision paramSupervision);
}
