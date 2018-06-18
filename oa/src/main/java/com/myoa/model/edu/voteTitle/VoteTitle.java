package com.myoa.model.edu.voteTitle;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.myoa.model.edu.voteItem.VoteItem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@TableName("vote_title")
public class VoteTitle extends Model<VoteTitle> {
	private static final long serialVersionUID = 1L;

	@TableId(value = "VOTE_ID", type = IdType.AUTO)
	private Integer voteId;
	private Integer countNum;

	@TableField("PARENT_ID")
	private Integer parentId;

	@TableField("FROM_ID")
	private String fromId;

	@TableField("TO_ID")
	private String toId;

	@TableField("PRIV_ID")
	private String privId;

	@TableField("USER_ID")
	private String userId;

	@TableField("SUBJECT")
	private String subject;

	@TableField("CONTENT")
	private String content;

	@TableField("TYPE")
	private String type;

	@TableField("MAX_NUM")
	private Integer maxNum;

	@TableField("MIN_NUM")
	private Integer minNum;

	@TableField("ANONYMITY")
	private String anonymity;

	@TableField("VIEW_PRIV")
	private String viewPriv;

	@TableField("SEND_TIME")
	private String sendTime;

	@TableField("BEGIN_DATE")
	private String beginDate;

	@TableField("END_DATE")
	private String endDate;

	@TableField("PUBLISH")
	private String publish;

	@TableField("READERS")
	private String readers;

	@TableField("VOTE_NO")
	private String voteNo;

	@TableField("ATTACHMENT_ID")
	private String attachmentId;

	@TableField("ATTACHMENT_NAME")
	private String attachmentName;

	@TableField("TOP")
	private String top;

	@TableField("VIEW_RESULT_PRIV_ID")
	private String viewResultPrivId;

	@TableField("VIEW_RESULT_USER_ID")
	private String viewResultUserId;
	private String toUserName;
	private String toPrivName;
	private String toDeptName;
	private Integer sum;
	private Integer getCount;
	private boolean isRight = false;
	private Integer uid;
	private String avatar;
	private String userName;
	private String photo;
	private String deptName;
	private String itemName;
	private Integer itemId;
	private String voteUser;
	private Integer voteCount;
	private Integer count;
	private String A;
	private String B;
	private String C;
	private String D;
	private String E;
	private List<VoteItem> voteItemList;
	private List<VoteTitle> voteTitleList;
	private String userPrivName;
	private boolean isHave;
	private String toIdName;
	private String privIdName;

	public boolean isRight() {
		return this.isRight;
	}

	public void setRight(boolean right) {
		this.isRight = right;
	}

	public Integer getUid() {
		return this.uid;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getA() {
		return this.A;
	}

	public String getB() {
		return this.B;
	}

	public String getC() {
		return this.C;
	}

	public String getD() {
		return this.D;
	}

	public String getE() {
		return this.E;
	}

	public void setA(String a) {
		this.A = a;
	}

	public void setB(String b) {
		this.B = b;
	}

	public void setC(String c) {
		this.C = c;
	}

	public void setD(String d) {
		this.D = d;
	}

	public void setE(String e) {
		this.E = e;
	}

	public List<VoteItem> getVoteItemList() {
		return this.voteItemList == null ? new ArrayList() : this.voteItemList;
	}

	public void setVoteItemList(List<VoteItem> voteItemList) {
		this.voteItemList = voteItemList;
	}

	public List<VoteTitle> getVoteTitleList() {
		return this.voteTitleList == null ? new ArrayList()
				: this.voteTitleList;
	}

	public void setVoteTitleList(List<VoteTitle> voteTitleList) {
		this.voteTitleList = voteTitleList;
	}

	public String getUserPrivName() {
		return this.userPrivName;
	}

	public void setUserPrivName(String userPrivName) {
		this.userPrivName = userPrivName;
	}

	public Integer getSum() {
		return Integer.valueOf(this.sum == null ? 0 : this.sum.intValue());
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Integer getGetCount() {
		return Integer.valueOf(this.getCount == null ? 0 : this.getCount
				.intValue());
	}

	public void setGetCount(Integer getCount) {
		this.getCount = getCount;
	}

	public Integer getCountNum() {
		return this.countNum;
	}

	public void setCountNum(Integer countNum) {
		this.countNum = countNum;
	}

	public String getPrivIdName() {
		return this.privIdName;
	}

	public void setPrivIdName(String privIdName) {
		this.privIdName = privIdName;
	}

	public String getToIdName() {
		return this.toIdName;
	}

	public void setToIdName(String toIdName) {
		this.toIdName = toIdName;
	}

	public boolean isHave() {
		return this.isHave;
	}

	public void setHave(boolean have) {
		this.isHave = have;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getItemName() {
		return this.itemName;
	}

	public String getVoteUser() {
		return this.voteUser;
	}

	public Integer getVoteCount() {
		return this.voteCount;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setVoteUser(String voteUser) {
		this.voteUser = voteUser;
	}

	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getVoteId() {
		return this.voteId;
	}

	public void setVoteId(Integer voteId) {
		this.voteId = voteId;
	}

	public Integer getParentId() {
		return this.parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getFromId() {
		return this.fromId;
	}

	public void setFromId(String fromId) {
		this.fromId = fromId;
	}

	public String getToId() {
		return this.toId;
	}

	public void setToId(String toId) {
		this.toId = toId;
	}

	public String getPrivId() {
		return this.privId;
	}

	public void setPrivId(String privId) {
		this.privId = privId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getMaxNum() {
		return this.maxNum;
	}

	public void setMaxNum(Integer maxNum) {
		this.maxNum = maxNum;
	}

	public Integer getMinNum() {
		return this.minNum;
	}

	public void setMinNum(Integer minNum) {
		this.minNum = minNum;
	}

	public String getAnonymity() {
		return this.anonymity;
	}

	public void setAnonymity(String anonymity) {
		this.anonymity = anonymity;
	}

	public String getViewPriv() {
		return this.viewPriv;
	}

	public void setViewPriv(String viewPriv) {
		this.viewPriv = viewPriv;
	}

	public String getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPublish() {
		return this.publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getReaders() {
		return this.readers;
	}

	public void setReaders(String readers) {
		this.readers = readers;
	}

	public String getVoteNo() {
		return this.voteNo;
	}

	public void setVoteNo(String voteNo) {
		this.voteNo = voteNo;
	}

	public String getAttachmentId() {
		return this.attachmentId;
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = attachmentId;
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}

	public String getTop() {
		return this.top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	public String getViewResultPrivId() {
		return this.viewResultPrivId;
	}

	public void setViewResultPrivId(String viewResultPrivId) {
		this.viewResultPrivId = viewResultPrivId;
	}

	public String getViewResultUserId() {
		return this.viewResultUserId;
	}

	public void setViewResultUserId(String viewResultUserId) {
		this.viewResultUserId = viewResultUserId;
	}

	protected Serializable pkVal() {
		return this.voteId;
	}

	public String toString() {
		return "VoteTitle{voteId=" + this.voteId + ", parentId="
				+ this.parentId + ", fromId=" + this.fromId + ", toId="
				+ this.toId + ", privId=" + this.privId + ", userId="
				+ this.userId + ", subject=" + this.subject + ", content="
				+ this.content + ", type=" + this.type + ", maxNum="
				+ this.maxNum + ", minNum=" + this.minNum + ", anonymity="
				+ this.anonymity + ", viewPriv=" + this.viewPriv
				+ ", sendTime=" + this.sendTime + ", beginDate="
				+ this.beginDate + ", endDate=" + this.endDate + ", publish="
				+ this.publish + ", readers=" + this.readers + ", voteNo="
				+ this.voteNo + ", attachmentId=" + this.attachmentId
				+ ", attachmentName=" + this.attachmentName + ", top="
				+ this.top + ", viewResultPrivId=" + this.viewResultPrivId
				+ ", viewResultUserId=" + this.viewResultUserId + "}";
	}

	public static long getSerialVersionUID() {
		return 1L;
	}

	public String getToUserName() {
		return this.toUserName == null ? "" : this.toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getToPrivName() {
		return this.toPrivName == null ? "" : this.toPrivName;
	}

	public void setToPrivName(String toPrivName) {
		this.toPrivName = toPrivName;
	}

	public String getToDeptName() {
		return this.toDeptName == null ? "" : this.toDeptName;
	}

	public void setToDeptName(String toDeptName) {
		this.toDeptName = toDeptName;
	}
}
