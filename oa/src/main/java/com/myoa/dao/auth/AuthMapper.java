package com.myoa.dao.auth;

import java.util.List;

public abstract interface AuthMapper {
	public abstract List<String> getDeptName(String paramString);

	public abstract List<String> getRoleName(String paramString);

	public abstract List<String> getUserName(String paramString);
}
