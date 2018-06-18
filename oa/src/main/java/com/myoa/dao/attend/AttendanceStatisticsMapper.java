package com.myoa.dao.attend;

import java.util.List;

public abstract interface AttendanceStatisticsMapper {
	public abstract List<String> selectDeptName();

	public abstract List<String> selectUser();

	public abstract List<String> selectTitle();
}
