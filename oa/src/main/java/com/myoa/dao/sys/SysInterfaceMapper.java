package com.myoa.dao.sys;

import com.myoa.model.sys.InterfaceModel;

import java.util.List;

public abstract interface SysInterfaceMapper {
	public abstract List<InterfaceModel> getStatusText();

	public abstract void editStatusText(String paramString);

	public abstract List<InterfaceModel> getInterfaceInfo();

	public abstract void updateInterfaceInfo(InterfaceModel paramInterfaceModel);

	public abstract void insertInterfaceInfo(InterfaceModel paramInterfaceModel);

	public abstract InterfaceModel getIndexInfo();

	public abstract InterfaceModel getThemeSelect();

	public abstract InterfaceModel getAvatarUpload();

	public abstract InterfaceModel getTemplate();
}
