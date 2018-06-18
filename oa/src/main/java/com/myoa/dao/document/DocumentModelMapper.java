package com.myoa.dao.document;

import com.myoa.model.document.DocumentModel;
import com.myoa.model.document.DocumentModelExample;
import com.myoa.model.document.DocumentModelFlowRunPrcs;
import com.myoa.model.document.DocumentModelOverRun;
import com.myoa.model.document.DocumentModelWithBLOBs;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface DocumentModelMapper {
	public abstract int deleteByPrimaryKey(
			DocumentModelWithBLOBs paramDocumentModelWithBLOBs);

	public abstract int insert(
			DocumentModelWithBLOBs paramDocumentModelWithBLOBs);

	public abstract int insertSelective(
			DocumentModelWithBLOBs paramDocumentModelWithBLOBs);

	public abstract DocumentModelWithBLOBs selectByPrimaryKey(
			DocumentModelWithBLOBs paramDocumentModelWithBLOBs);

	public abstract int updateByPrimaryKeySelective(
			DocumentModelWithBLOBs paramDocumentModelWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			DocumentModelWithBLOBs paramDocumentModelWithBLOBs);

	public abstract int updateByPrimaryKey(
			DocumentModelWithBLOBs paramDocumentModelWithBLOBs);

	public abstract List<DocumentModelWithBLOBs> selectDocAll(
			DocumentModelWithBLOBs paramDocumentModelWithBLOBs);

	public abstract int countByExample(
			DocumentModelExample paramDocumentModelExample);

	public abstract int deleteByExample(
			DocumentModelExample paramDocumentModelExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract List<DocumentModelWithBLOBs> selectByExampleWithBLOBs(
			Map<String, Object> paramMap);

	public abstract List<DocumentModelWithBLOBs> selectByExample(
			DocumentModelExample paramDocumentModelExample);

	public abstract DocumentModelWithBLOBs selectByPrimaryKey(
			Integer paramInteger);

	public abstract int updateByExampleSelective(
			DocumentModelWithBLOBs paramDocumentModelWithBLOBs);

	public abstract int updateByExampleWithBLOBs(
			DocumentModelWithBLOBs paramDocumentModelWithBLOBs);

	public abstract int updateByExample(
			DocumentModelWithBLOBs paramDocumentModelWithBLOBs);

	public abstract int updateByPrimaryKey(DocumentModel paramDocumentModel);

	public abstract List<DocumentModelWithBLOBs> seleDocSendReceive(
			Map<String, Object> paramMap);

	public abstract List<DocumentModelWithBLOBs> selectDocSelective(
			DocumentModelWithBLOBs paramDocumentModelWithBLOBs);

	public abstract List<DocumentModelFlowRunPrcs> selWillDocSendOrReceive(
			Map<String, Object> paramMap);

	public abstract Integer selWillDocSendOrReceiveCounts(
			Map<String, Object> paramMap);

	public abstract List<DocumentModelOverRun> selOverDocSendOrReceive(
			Map<String, Object> paramMap);

	public abstract Integer selOverDocSendOrReceiveCounts(
			Map<String, Object> paramMap);

	public abstract List<DocumentModelFlowRunPrcs> selMyDocSendOrReceive(
			Map<String, Object> paramMap);

	public abstract Integer selMyDocSendOrReceiveCounts(
			Map<String, Object> paramMap);

	public abstract List<DocumentModelFlowRunPrcs> selOverseeTheOfficialDocument(
			Map<String, Object> paramMap);

	public abstract DocumentModel getDocumentEditPriv(
			@Param("id") Integer paramInteger);

	public abstract List<DocumentModelFlowRunPrcs> querySelectDoc(
			Map<String, Object> paramMap);

	public abstract List<DocumentModelFlowRunPrcs> selectTimeOutDoc(
			Map<String, Object> paramMap);
}
