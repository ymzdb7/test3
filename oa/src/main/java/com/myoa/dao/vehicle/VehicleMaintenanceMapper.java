package com.myoa.dao.vehicle;

import com.myoa.model.vehicle.VehicleMaintenance;
import com.myoa.model.vehicle.VehicleMaintenanceExample;
import com.myoa.model.vehicle.VehicleMaintenanceWithBLOBs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface VehicleMaintenanceMapper {
	public abstract int countByExample(
			VehicleMaintenanceExample paramVehicleMaintenanceExample);

	public abstract int deleteByExample(
			VehicleMaintenanceExample paramVehicleMaintenanceExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(
			VehicleMaintenanceWithBLOBs paramVehicleMaintenanceWithBLOBs);

	public abstract int insertSelective(
			VehicleMaintenanceWithBLOBs paramVehicleMaintenanceWithBLOBs);

	public abstract List<VehicleMaintenanceWithBLOBs> selectByExampleWithBLOBs(
			VehicleMaintenanceExample paramVehicleMaintenanceExample);

	public abstract List<VehicleMaintenance> selectByExample(
			VehicleMaintenanceExample paramVehicleMaintenanceExample);

	public abstract VehicleMaintenanceWithBLOBs selectByPrimaryKey(
			Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") VehicleMaintenanceWithBLOBs paramVehicleMaintenanceWithBLOBs,
			@Param("example") VehicleMaintenanceExample paramVehicleMaintenanceExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") VehicleMaintenanceWithBLOBs paramVehicleMaintenanceWithBLOBs,
			@Param("example") VehicleMaintenanceExample paramVehicleMaintenanceExample);

	public abstract int updateByExample(
			@Param("record") VehicleMaintenance paramVehicleMaintenance,
			@Param("example") VehicleMaintenanceExample paramVehicleMaintenanceExample);

	public abstract int updateByPrimaryKeySelective(
			VehicleMaintenanceWithBLOBs paramVehicleMaintenanceWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			VehicleMaintenanceWithBLOBs paramVehicleMaintenanceWithBLOBs);

	public abstract int updateByPrimaryKey(
			VehicleMaintenance paramVehicleMaintenance);

	public abstract List<VehicleMaintenanceWithBLOBs> selectAllMaintenance(
			Map<String, Object> paramMap);

	public abstract List<VehicleMaintenanceWithBLOBs> getRecordByVid(
			Integer paramInteger);

	public abstract List<VehicleMaintenanceWithBLOBs> getVeHicleStatus(
			Integer paramInteger);
}
