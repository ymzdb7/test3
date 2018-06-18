package com.myoa.dao.menu;

import com.myoa.model.menu.SysMenu;

import java.util.List;

public abstract interface SysMenuMapper {
	public abstract List<SysMenu> getDatagrid();

	public abstract void updateSysMenu(SysMenu paramSysMenu);

	public abstract void addSysMenu(SysMenu paramSysMenu);

	public abstract void deleteSysMenu(String paramString);

	public abstract List<SysMenu> getTheFirstMenu(String paramString);
}
