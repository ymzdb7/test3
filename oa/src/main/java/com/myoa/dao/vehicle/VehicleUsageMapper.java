package com.myoa.dao.vehicle;

import com.myoa.model.vehicle.VehicleUsage;
import com.myoa.model.vehicle.VehicleUsageExample;
import com.myoa.model.vehicle.VehicleUsageWithBLOBs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface VehicleUsageMapper {
	public abstract int countByExample(
			VehicleUsageExample paramVehicleUsageExample);

	public abstract int deleteByExample(
			VehicleUsageExample paramVehicleUsageExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(VehicleUsageWithBLOBs paramVehicleUsageWithBLOBs);

	public abstract int insertSelective(
			VehicleUsageWithBLOBs paramVehicleUsageWithBLOBs);

	public abstract List<VehicleUsageWithBLOBs> selectByExampleWithBLOBs(
			VehicleUsageExample paramVehicleUsageExample);

	public abstract List<VehicleUsage> selectByExample(
			VehicleUsageExample paramVehicleUsageExample);

	public abstract VehicleUsageWithBLOBs selectByPrimaryKey(
			Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") VehicleUsageWithBLOBs paramVehicleUsageWithBLOBs,
			@Param("example") VehicleUsageExample paramVehicleUsageExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") VehicleUsageWithBLOBs paramVehicleUsageWithBLOBs,
			@Param("example") VehicleUsageExample paramVehicleUsageExample);

	public abstract int updateByExample(
			@Param("record") VehicleUsage paramVehicleUsage,
			@Param("example") VehicleUsageExample paramVehicleUsageExample);

	public abstract int updateByPrimaryKeySelective(
			VehicleUsageWithBLOBs paramVehicleUsageWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			VehicleUsageWithBLOBs paramVehicleUsageWithBLOBs);

	public abstract int updateByPrimaryKey(VehicleUsage paramVehicleUsage);

	public abstract List<VehicleUsageWithBLOBs> selectAlredyAllVeHicle();

	public abstract List<VehicleUsageWithBLOBs> deptApproval(
			VehicleUsageWithBLOBs paramVehicleUsageWithBLOBs);

	public abstract int getCount(Map<String, Object> paramMap);

	public abstract List<VehicleUsageWithBLOBs> getReservation(
			@Param("vId") Integer paramInteger);

	public abstract List<VehicleUsageWithBLOBs> selectAllObjects();

	public abstract List<VehicleUsageWithBLOBs> getNoApproval(
			Map<String, Object> paramMap);

	public abstract List<VehicleUsageWithBLOBs> selectRefuseVehicle(
			Map<String, Object> paramMap);

	public abstract List<VehicleUsageWithBLOBs> selectNoUseVehicle(
			Map<String, Object> paramMap);

	public abstract List<VehicleUsageWithBLOBs> GetOperator(
			VehicleUsageWithBLOBs paramVehicleUsageWithBLOBs);

	public abstract List<VehicleUsageWithBLOBs> getAllPendingVehicle(
			Map<String, Object> paramMap);

	public abstract List<VehicleUsageWithBLOBs> getAllapproveVehicle(
			Map<String, Object> paramMap);

	public abstract List<VehicleUsageWithBLOBs> getAllNotVehicle(
			Map<String, Object> paramMap);

	public abstract List<VehicleUsageWithBLOBs> getAllApprovalVehicle(
			Map<String, Object> paramMap);

	public abstract List<VehicleUsageWithBLOBs> seVehicle(
			Map<String, Object> paramMap);

	public abstract List<VehicleUsageWithBLOBs> selectRefuseByOperator(
			Map<String, Object> paramMap);
}