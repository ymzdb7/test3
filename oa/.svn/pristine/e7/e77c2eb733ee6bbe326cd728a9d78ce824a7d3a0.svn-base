package com.myoa.dao.supervision;

import com.myoa.model.supervision.SupervisionApply;
import com.myoa.model.supervision.SupervisionApplyExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SupervisionApplyMapper {
	public abstract int countByExample(
			SupervisionApplyExample paramSupervisionApplyExample);

	public abstract int deleteByExample(
			SupervisionApplyExample paramSupervisionApplyExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(SupervisionApply paramSupervisionApply);

	public abstract int insertSelective(SupervisionApply paramSupervisionApply);

	public abstract List<SupervisionApply> selectByExample(
			SupervisionApplyExample paramSupervisionApplyExample);

	public abstract SupervisionApply selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") SupervisionApply paramSupervisionApply,
			@Param("example") SupervisionApplyExample paramSupervisionApplyExample);

	public abstract int updateByExample(
			@Param("record") SupervisionApply paramSupervisionApply,
			@Param("example") SupervisionApplyExample paramSupervisionApplyExample);

	public abstract int updateByPrimaryKeySelective(
			SupervisionApply paramSupervisionApply);

	public abstract int updateByPrimaryKey(
			SupervisionApply paramSupervisionApply);

	public abstract int addSupervisionApply(
			SupervisionApply paramSupervisionApply);

	public abstract List<SupervisionApply> getStatusInfor(
			SupervisionApply paramSupervisionApply);

	public abstract int updateStatus(SupervisionApply paramSupervisionApply);
}
