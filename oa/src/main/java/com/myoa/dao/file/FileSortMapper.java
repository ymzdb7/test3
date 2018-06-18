package com.myoa.dao.file;

import com.myoa.model.file.FileSortModel;

import java.util.List;
import java.util.Map;

public abstract interface FileSortMapper {
	public abstract List<FileSortModel> getFileSort(
			FileSortModel paramFileSortModel);

	public abstract int saveFileSort(FileSortModel paramFileSortModel);

	public abstract int updateFileSort(FileSortModel paramFileSortModel);

	public abstract int deleteBySortId(Map<String, Object> paramMap);

	public abstract List<FileSortModel> getSortChrildren(int paramInt);

	public abstract List<FileSortModel> getRootTree(Map<String, Object> paramMap);

	public abstract List<FileSortModel> getChildTree(List<String> paramList);

	public abstract int saveFileSortChr(FileSortModel paramFileSortModel);

	public abstract int updateSortAuth(Map<String, String> paramMap);

	public abstract List<FileSortModel> queryFileSortAndChildBySortId(
			Integer paramInteger);

	public abstract List<FileSortModel> getChildTreeList();

	public abstract FileSortModel getNowFileSortAuth(Integer paramInteger);

	public abstract FileSortModel getOne(FileSortModel paramFileSortModel);

	public abstract int getFileCheck(FileSortModel paramFileSortModel);

	public abstract int updateSortAuthByChildSort(Map<String, Object> paramMap);

	public abstract FileSortModel getfolderPath(Integer paramInteger);

	public abstract FileSortModel singleBySortNo(String paramString);

	public abstract FileSortModel singleBySortName(String paramString);
}
