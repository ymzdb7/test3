package com.myoa.dao.common;

import com.myoa.model.common.SysCode;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SysCodeMapper {
	public abstract List<SysCode> getSysCode(String paramString);

	public abstract List<SysCode> getAllSysCode();

	public abstract void update(SysCode paramSysCode);

	public abstract List<SysCode> getLogType(String paramString);

	public abstract String getLogNameByNo(String paramString);

	public abstract String getNewsNameByNo(String paramString);

	public abstract String getNotifyNameByNo(String paramString);

	public abstract void delete(SysCode paramSysCode);

	public abstract void addSysMainCode(SysCode paramSysCode);

	public abstract List<SysCode> isSysCodeOrderExits(SysCode paramSysCode);

	public abstract List<SysCode> isChildCodeNoExits(SysCode paramSysCode);

	public abstract void addSysChildCode(SysCode paramSysCode);

	public abstract List<SysCode> isSysCodeNoExits(SysCode paramSysCode);

	public abstract List<SysCode> iseditSysCodeNoExits(SysCode paramSysCode);

	public abstract List<SysCode> isChildCodeOrderExits(SysCode paramSysCode);

	public abstract SysCode getCodeByCodeNo(SysCode paramSysCode);

	public abstract String getCodeByCodeId(Integer paramInteger);

	public abstract SysCode getCodeByCodeIds(Integer paramInteger);

	public abstract void deleteChild(SysCode paramSysCode);

	public abstract List<SysCode> getMainCode();

	public abstract List<SysCode> getChildCode(String paramString);

	public abstract List<SysCode> getAllCode();

	public abstract void deleteErrCode(Integer paramInteger);

	public abstract SysCode getSingleCode(
			@Param("parentNo") String paramString1,
			@Param("codeNo") String paramString2);

	public abstract SysCode getCodeNoByNameAndParentNo(SysCode paramSysCode);

	public abstract List<SysCode> getNotifyType();
}
