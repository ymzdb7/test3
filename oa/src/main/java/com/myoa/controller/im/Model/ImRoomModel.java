package com.myoa.controller.im.Model;

public class ImRoomModel {
	String rname;
	String room_of;
	String rmember_uid;
	String rout_uid;
	String rset_uid;
	String rset_ofid;
	String rtime;
	String type;
	String rchange;
	String rinvite;
	String rmemberUidName;
	String rsetUidName;
	String btID;
	Integer roomStatus;

	public String getBtID() {
		return this.btID;
	}

	public void setBtID(String btID) {
		this.btID = btID;
	}

	public String getRmemberUidName() {
		return this.rmemberUidName;
	}

	public void setRmemberUidName(String rmemberUidName) {
		this.rmemberUidName = rmemberUidName;
	}

	public String getRsetUidName() {
		return this.rsetUidName;
	}

	public void setRsetUidName(String rsetUidName) {
		this.rsetUidName = rsetUidName;
	}

	public ImRoomModel() {
	}

	public ImRoomModel(String rNAME, String rOOM_OF, String rMEMBER_UID,
			String rOUT_UID, String rSET_UID, String rSET_OFID, String rTIME,
			String tYPE, String rCHANGE, String rINVITE, String BTID,
			Integer room_Status) {
		this.rname = (rNAME == null ? "" : rNAME);
		this.room_of = (rOOM_OF == null ? "" : rOOM_OF);
		this.rmember_uid = (rMEMBER_UID == null ? "" : rMEMBER_UID);
		this.rout_uid = (rOUT_UID == null ? "" : rOUT_UID);
		this.rset_uid = (rSET_UID == null ? "" : rSET_UID);
		this.rset_ofid = (rSET_OFID == null ? "" : rSET_OFID);
		this.rtime = (rTIME == null ? "" : rTIME);
		this.type = (tYPE == null ? "" : tYPE);
		this.rchange = (rCHANGE == null ? "" : rCHANGE);
		this.rinvite = (rINVITE == null ? "" : rINVITE);
		this.btID = (BTID == null ? "" : BTID);
		this.roomStatus = Integer.valueOf(room_Status == null ? 0 : room_Status
				.intValue());
	}

	public String getRname() {
		return this.rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRoom_of() {
		return this.room_of;
	}

	public void setRoom_of(String room_of) {
		this.room_of = room_of;
	}

	public String getRmember_uid() {
		return this.rmember_uid;
	}

	public void setRmember_uid(String rmember_uid) {
		this.rmember_uid = rmember_uid;
	}

	public String getRout_uid() {
		return this.rout_uid;
	}

	public void setRout_uid(String rout_uid) {
		this.rout_uid = rout_uid;
	}

	public String getRset_uid() {
		return this.rset_uid;
	}

	public void setRset_uid(String rset_uid) {
		this.rset_uid = rset_uid;
	}

	public String getRset_ofid() {
		return this.rset_ofid;
	}

	public void setRset_ofid(String rset_ofid) {
		this.rset_ofid = rset_ofid;
	}

	public String getRtime() {
		return this.rtime;
	}

	public void setRtime(String rtime) {
		this.rtime = rtime;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRchange() {
		return this.rchange;
	}

	public void setRchange(String rchange) {
		this.rchange = rchange;
	}

	public String getRinvite() {
		return this.rinvite;
	}

	public void setRinvite(String rinvite) {
		this.rinvite = rinvite;
	}

	public Integer getRoomStatus() {
		return this.roomStatus;
	}

	public void setRoomStatus(Integer roomStatus) {
		this.roomStatus = roomStatus;
	}
}
