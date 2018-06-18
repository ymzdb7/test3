package com.myoa.dao.timedTaskManagement;

import com.myoa.model.timedTaskManagement.TimedTaskRecord;
import com.myoa.model.timedTaskManagement.TimedTaskRecordExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface TimedTaskRecordMapper {
	public abstract int countByExample(
			TimedTaskRecordExample paramTimedTaskRecordExample);

	public abstract int deleteByExample(
			TimedTaskRecordExample paramTimedTaskRecordExample);

	public abstract int insert(TimedTaskRecord paramTimedTaskRecord);

	public abstract int insertSelective(TimedTaskRecord paramTimedTaskRecord);

	public abstract List<TimedTaskRecord> selectByExample(
			TimedTaskRecordExample paramTimedTaskRecordExample);

	public abstract int updateByExampleSelective(
			@Param("record") TimedTaskRecord paramTimedTaskRecord,
			@Param("example") TimedTaskRecordExample paramTimedTaskRecordExample);

	public abstract int updateByExample(
			@Param("record") TimedTaskRecord paramTimedTaskRecord,
			@Param("example") TimedTaskRecordExample paramTimedTaskRecordExample);

	public abstract int insertTimedRecord(TimedTaskRecord paramTimedTaskRecord);

	public abstract List<TimedTaskRecord> selectTimedTaskTypese(
			@Param("ttmId") Integer paramInteger);
}
