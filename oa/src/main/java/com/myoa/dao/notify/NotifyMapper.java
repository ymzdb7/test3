package com.myoa.dao.notify;

import com.myoa.dao.base.BaseMapper;
import com.myoa.model.department.Department;
import com.myoa.model.notify.Notify;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface NotifyMapper extends BaseMapper<Notify> {
	public abstract List<Notify> selectNotify(Map<String, Object> paramMap);

	public abstract List<Notify> selectCountNotify(Map<String, Object> paramMap);

	public abstract List<Notify> selectNotifyManage(Map<String, Object> paramMap);

	public abstract List<Notify> unreadNotify(Map<String, Object> paramMap);

	public abstract List<Notify> readNotify(Map<String, Object> paramMap);

	public abstract List<Notify> getNotifyById(String paramString);

	public abstract Notify getNotifyById(Integer paramInteger);

	public abstract Notify detailedNotify(Map<String, Object> paramMap);

	public abstract int addNotify(Notify paramNotify);

	public abstract void updateReaders(Notify paramNotify);

	public abstract void updateNotify(Notify paramNotify);

	public abstract void deleteById(@Param("notifyId") Integer paramInteger);

	public abstract void deleteByids(String[] paramArrayOfString);

	public abstract int updateByIds(@Param("top") String paramString,
			@Param("ids") String[] paramArrayOfString);

	public abstract List<Department> getNotifyGroupFromDept(Notify paramNotify);

	public abstract int getCountByFromDept(Notify paramNotify);

	public abstract List<Notify> getNotifyByFromDept(Notify paramNotify);

	public abstract int getCountByFromIdAndDept(Notify paramNotify);

	public abstract List<Notify> getNotifyByFromIdAndDept(Notify paramNotify);

	public abstract Notify getNotifyByNotifyId(String paramString);

	public abstract List<Notify> selectByType();

	public abstract List<Notify> selectApprovedNotifyByTypeId(
			Map<String, Object> paramMap);

	public abstract List<Notify> selectPendingNotifyByTypeId(
			Map<String, Object> paramMap);

	public abstract List<Notify> selectNotifyEndTime(
			@Param("dateTime") String paramString);
}
