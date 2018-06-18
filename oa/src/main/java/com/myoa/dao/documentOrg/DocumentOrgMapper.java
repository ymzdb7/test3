package com.myoa.dao.documentOrg;

import com.myoa.model.document.DocumentModelWithBLOBs;
import com.myoa.model.documentOrg.DocumentOrg;
import com.myoa.model.documentOrg.DocumentOrgExample;
import com.myoa.model.documentOrg.DocumentOrgWithBLOBs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface DocumentOrgMapper {
	public abstract int countByExample(
			DocumentOrgExample paramDocumentOrgExample);

	public abstract int deleteByExample(
			DocumentOrgExample paramDocumentOrgExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(DocumentOrgWithBLOBs paramDocumentOrgWithBLOBs);

	public abstract int insertSelective(DocumentOrg paramDocumentOrg);

	public abstract List<DocumentOrgWithBLOBs> selectByExampleWithBLOBs(
			DocumentOrgExample paramDocumentOrgExample);

	public abstract List<DocumentOrg> selectByExample(
			DocumentOrgExample paramDocumentOrgExample);

	public abstract DocumentOrgWithBLOBs selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") DocumentOrgWithBLOBs paramDocumentOrgWithBLOBs,
			@Param("example") DocumentOrgExample paramDocumentOrgExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") DocumentOrgWithBLOBs paramDocumentOrgWithBLOBs,
			@Param("example") DocumentOrgExample paramDocumentOrgExample);

	public abstract int updateByExample(
			@Param("record") DocumentOrg paramDocumentOrg,
			@Param("example") DocumentOrgExample paramDocumentOrgExample);

	public abstract int updateByPrimaryKeySelective(
			DocumentOrgWithBLOBs paramDocumentOrgWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			DocumentOrgWithBLOBs paramDocumentOrgWithBLOBs);

	public abstract int updateByPrimaryKey(DocumentOrg paramDocumentOrg);

	public abstract DocumentOrg selOldDocById(@Param("id") Integer paramInteger);

	public abstract List<DocumentOrg> selDocumentOrg(
			Map<String, Object> paramMap);

	public abstract DocumentModelWithBLOBs selDocumentOrgById(
			@Param("id") Integer paramInteger);

	public abstract void updateTransferFlag(@Param("id") Integer paramInteger1,
			@Param("flag") Integer paramInteger2);
}
