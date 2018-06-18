package com.myoa.dao.users;

import com.myoa.model.users.UserExt;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface UserExtMapper {
	public abstract String getUserFuncIdStr(String paramString);

	public abstract void updateUserFuncIdStr(Map<String, String> paramMap);

	public abstract void addUserExt(UserExt paramUserExt);

	public abstract int updateUserExtByUid(UserExt paramUserExt);

	public abstract void deleteUserExtByUids(String[] paramArrayOfString);

	public abstract UserExt queryUserExt(@Param("uid") String paramString);

	public abstract void updateUserExtByUids(
			@Param("uids") List<String> paramList,
			@Param("userExt") UserExt paramUserExt);

	public abstract UserExt queryUserExtByUserId(String paramString);
}
