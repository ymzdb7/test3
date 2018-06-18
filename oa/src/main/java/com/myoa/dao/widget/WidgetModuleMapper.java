package com.myoa.dao.widget;

import com.myoa.model.widget.WidgetModel;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface WidgetModuleMapper {
	public abstract List<WidgetModel> getAllModel();

	public abstract List<WidgetModel> getModelByIds(
			@Param("ids") String[] paramArrayOfString);

	public abstract Integer getAllCount();
}
