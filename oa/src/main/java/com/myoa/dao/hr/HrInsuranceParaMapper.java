package com.myoa.dao.hr;

import com.myoa.model.hr.HrInsurancePara;
import com.myoa.model.hr.HrInsuranceParaExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface HrInsuranceParaMapper {
	public abstract int countByExample(
			HrInsuranceParaExample paramHrInsuranceParaExample);

	public abstract int deleteByExample(
			HrInsuranceParaExample paramHrInsuranceParaExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(HrInsurancePara paramHrInsurancePara);

	public abstract int insertSelective(HrInsurancePara paramHrInsurancePara);

	public abstract List<HrInsurancePara> selectByExample(
			HrInsuranceParaExample paramHrInsuranceParaExample);

	public abstract HrInsurancePara selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") HrInsurancePara paramHrInsurancePara,
			@Param("example") HrInsuranceParaExample paramHrInsuranceParaExample);

	public abstract int updateByExample(
			@Param("record") HrInsurancePara paramHrInsurancePara,
			@Param("example") HrInsuranceParaExample paramHrInsuranceParaExample);

	public abstract int updateByPrimaryKeySelective(
			HrInsurancePara paramHrInsurancePara);

	public abstract int updateByPrimaryKey(HrInsurancePara paramHrInsurancePara);
}
