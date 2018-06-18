package com.myoa.dao.hr;

import com.myoa.model.hr.HrCode;
import com.myoa.model.hr.HrCodeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface HrCodeMapper {
	public abstract int countByExample(HrCodeExample paramHrCodeExample);

	public abstract int deleteByExample(HrCodeExample paramHrCodeExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(HrCode paramHrCode);

	public abstract int insertSelective(HrCode paramHrCode);

	public abstract List<HrCode> selectByExampleWithBLOBs(
			HrCodeExample paramHrCodeExample);

	public abstract List<HrCode> selectByExample(
			HrCodeExample paramHrCodeExample);

	public abstract HrCode selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") HrCode paramHrCode,
			@Param("example") HrCodeExample paramHrCodeExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") HrCode paramHrCode,
			@Param("example") HrCodeExample paramHrCodeExample);

	public abstract int updateByExample(@Param("record") HrCode paramHrCode,
			@Param("example") HrCodeExample paramHrCodeExample);

	public abstract int updateByPrimaryKeySelective(HrCode paramHrCode);

	public abstract int updateByPrimaryKeyWithBLOBs(HrCode paramHrCode);

	public abstract int updateByPrimaryKey(HrCode paramHrCode);
}
