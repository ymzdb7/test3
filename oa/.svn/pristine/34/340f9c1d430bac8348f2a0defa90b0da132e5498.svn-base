package com.myoa.dao.rms;

import com.myoa.model.rms.RmsRollRoom;
import com.myoa.model.rms.RmsRollRoomWithBLOBs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface RmsRollRoomMapper {
	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(RmsRollRoomWithBLOBs paramRmsRollRoomWithBLOBs);

	public abstract int insertSelective(RmsRollRoom paramRmsRollRoom);

	public abstract RmsRollRoomWithBLOBs selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByPrimaryKeySelective(RmsRollRoom paramRmsRollRoom);

	public abstract int updateByPrimaryKeyWithBLOBs(
			RmsRollRoomWithBLOBs paramRmsRollRoomWithBLOBs);

	public abstract int updateByPrimaryKey(RmsRollRoom paramRmsRollRoom);

	public abstract List<RmsRollRoom> queryRooms(Map<String, Object> paramMap);

	public abstract RmsRollRoom selectById(@Param("roomId") Integer paramInteger);

	public abstract List<RmsRollRoom> selectAll();
}
