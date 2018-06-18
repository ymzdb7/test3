package com.myoa.dao.meet;

import com.myoa.model.meet.MeetingEquuipment;
import com.myoa.model.meet.MeetingEquuipmentExample;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface MeetingEquuipmentMapper {
	public abstract int countByExample(
			MeetingEquuipmentExample paramMeetingEquuipmentExample);

	public abstract int deleteByExample(
			MeetingEquuipmentExample paramMeetingEquuipmentExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(MeetingEquuipment paramMeetingEquuipment);

	public abstract int insertSelective(MeetingEquuipment paramMeetingEquuipment);

	public abstract List<MeetingEquuipment> selectByExampleWithBLOBs(
			MeetingEquuipmentExample paramMeetingEquuipmentExample);

	public abstract List<MeetingEquuipment> selectByExample(
			MeetingEquuipmentExample paramMeetingEquuipmentExample);

	public abstract MeetingEquuipment selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") MeetingEquuipment paramMeetingEquuipment,
			@Param("example") MeetingEquuipmentExample paramMeetingEquuipmentExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") MeetingEquuipment paramMeetingEquuipment,
			@Param("example") MeetingEquuipmentExample paramMeetingEquuipmentExample);

	public abstract int updateByExample(
			@Param("record") MeetingEquuipment paramMeetingEquuipment,
			@Param("example") MeetingEquuipmentExample paramMeetingEquuipmentExample);

	public abstract int updateByPrimaryKeySelective(
			MeetingEquuipment paramMeetingEquuipment);

	public abstract int updateByPrimaryKeyWithBLOBs(
			MeetingEquuipment paramMeetingEquuipment);

	public abstract int updateByPrimaryKey(
			MeetingEquuipment paramMeetingEquuipment);

	public abstract List<MeetingEquuipment> getAllequuip(
			Map<String, Object> paramMap);

	public abstract MeetingEquuipment getdetailEquiet(Integer paramInteger);

	public abstract void updatequuip(MeetingEquuipment paramMeetingEquuipment);

	public abstract void deleteequuips(
			@Param("Sids") String[] paramArrayOfString);
}
