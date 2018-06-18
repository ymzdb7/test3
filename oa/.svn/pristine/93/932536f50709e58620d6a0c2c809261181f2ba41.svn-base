package com.myoa.dao.file;

import com.myoa.model.file.FileContentModel;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface FileContentMapper {
	public abstract int deleteBySort_id(int paramInt);

	public abstract List<FileContentModel> getFileConBySortid(
			Map<String, Object> paramMap);

	public abstract FileContentModel getFileConByContentId(String paramString);

	public abstract int saveContent(FileContentModel paramFileContentModel);

	public abstract int deleteByConId(Map<String, Object> paramMap);

	public abstract int updateFileCon(FileContentModel paramFileContentModel);

	public abstract int batchDeleteConId(Integer[] paramArrayOfInteger);

	public abstract List<FileContentModel> queryBySearchValue(
			@Param("sortId") Integer paramInteger1,
			@Param("sortType") Integer paramInteger2,
			@Param("subjectName") String paramString1,
			@Param("creater") String paramString2,
			@Param("contentNo") Integer paramInteger3,
			@Param("contentValue1") String paramString3,
			@Param("contentValue2") String paramString4,
			@Param("contentValue3") String paramString5,
			@Param("atiachmentDesc") String paramString6,
			@Param("atiachmentName") String paramString7,
			@Param("atiachmentCont") String paramString8,
			@Param("crStartDate") String paramString9,
			@Param("crEndDate") String paramString10,
			@Param("pageNo") Integer paramInteger4,
			@Param("pageSize") Integer paramInteger5);

	public abstract List<FileContentModel> rootqueryBySearchValue(
			@Param("sortId") Integer paramInteger1,
			@Param("subjectName") String paramString1,
			@Param("creater") String paramString2,
			@Param("contentNo") Integer paramInteger2,
			@Param("contentValue1") String paramString3,
			@Param("contentValue2") String paramString4,
			@Param("contentValue3") String paramString5,
			@Param("atiachmentDesc") String paramString6,
			@Param("atiachmentName") String paramString7,
			@Param("atiachmentCont") String paramString8,
			@Param("crStartDate") String paramString9,
			@Param("crEndDate") String paramString10,
			@Param("pageNo") Integer paramInteger3,
			@Param("pageSize") Integer paramInteger4);

	public abstract FileContentModel selectFileById(Integer paramInteger);

	public abstract int contentCut(@Param("sortId") String paramString,
			@Param("contentId") String[] paramArrayOfString);

	public abstract List<FileContentModel> searchPerson(
			Map<String, Object> paramMap);

	public abstract List<FileContentModel> serachCommon(
			Map<String, Object> paramMap);

	public abstract List<FileContentModel> selectFileSortList(
			@Param("sortList") String paramString);
}
