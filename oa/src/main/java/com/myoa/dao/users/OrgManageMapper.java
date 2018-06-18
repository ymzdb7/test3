package com.myoa.dao.users;

import com.myoa.model.users.OrgManage;

import java.util.List;

public abstract interface OrgManageMapper {
	public abstract List<OrgManage> queryId();

	public abstract int editOrgManage(OrgManage paramOrgManage);

	public abstract List<OrgManage> getOrgManage();

	public abstract OrgManage getOrgManageById(Integer paramInteger);

	public abstract void addOrgManage(OrgManage paramOrgManage);

	public abstract int editOid(OrgManage paramOrgManage);
}
