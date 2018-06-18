package com.myoa.dao.dingdingManage;

import com.myoa.model.dingdingManage.UserDDMap;
import com.myoa.model.dingdingManage.UserDDMapExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface UserDDMapMapper {
	public abstract int countByExample(UserDDMapExample paramUserDDMapExample);

	public abstract int deleteByExample(UserDDMapExample paramUserDDMapExample);

	public abstract int insert(UserDDMap paramUserDDMap);

	public abstract int insertSelective(UserDDMap paramUserDDMap);

	public abstract List<UserDDMap> selectByExample(
			UserDDMapExample paramUserDDMapExample);

	public abstract int updateByExampleSelective(
			@Param("record") UserDDMap paramUserDDMap,
			@Param("example") UserDDMapExample paramUserDDMapExample);

	public abstract int updateByExample(
			@Param("record") UserDDMap paramUserDDMap,
			@Param("example") UserDDMapExample paramUserDDMapExample);

	public abstract UserDDMap getUserDDMapByUserId(String paramString);

	public abstract Integer getBindBoolean(Integer paramInteger);
}
