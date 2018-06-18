package com.myoa.dao.workflow;

import com.myoa.model.workflow.FormSort;
import com.myoa.model.workflow.FormSortExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface FormSortMapper {
	public abstract int countByExample(FormSortExample paramFormSortExample);

	public abstract int deleteByExample(FormSortExample paramFormSortExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(FormSort paramFormSort);

	public abstract int insertSelective(FormSort paramFormSort);

	public abstract List<FormSort> selectByExample(
			FormSortExample paramFormSortExample);

	public abstract List<FormSort> selectAllFormSort(Integer paramInteger);

	public abstract List<FormSort> selectAllFormSortByTree(Integer paramInteger);

	public abstract int selectNoformSort(Integer paramInteger);

	public abstract int getChildNumber(Integer paramInteger);

	public abstract int selectflowSortNum(Integer paramInteger);

	public abstract FormSort selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") FormSort paramFormSort,
			@Param("example") FormSortExample paramFormSortExample);

	public abstract int updateByExample(
			@Param("record") FormSort paramFormSort,
			@Param("example") FormSortExample paramFormSortExample);

	public abstract int updateByPrimaryKeySelective(FormSort paramFormSort);

	public abstract int updateByPrimaryKey(FormSort paramFormSort);
}
