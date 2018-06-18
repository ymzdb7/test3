package com.myoa.model.book;

public class BookInfoWithBLOBs extends BookInfo {
	private String brief;
	private String open;
	private String openName;
	private String openUser;
	private String openDept;
	private String openUserPriv;
	private String currentUser;
	private String order;
	private String attachmentId;
	private String attachmentName;

	public String getBrief() {
		return this.brief;
	}

	public void setBrief(String brief) {
		this.brief = (brief == null ? null : brief.trim());
	}

	public String getOpen() {
		return this.open;
	}

	public void setOpen(String open) {
		this.open = (open == null ? null : open.trim());
	}

	public String getAttachmentId() {
		return this.attachmentId;
	}

	public void setAttachmentId(String attachmentId) {
		this.attachmentId = (attachmentId == null ? null : attachmentId.trim());
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
     this.attachmentName = (attachmentName == null ? null : attachmentName.trim());
   }
 
   public String getOpenName() {
     return this.openName == null ? ";;" : this.openName;
   }
 
   public void setOpenName(String openName) {
     this.openName = openName;
   }
 
   public String getOrder() {
     return this.order;
   }
 
   public void setOrder(String order) {
     this.order = order;
   }
 
   public String getOpenUser() {
     return this.openUser;
   }
 
   public void setOpenUser(String openUser) {
     this.openUser = openUser;
   }
 
   public String getOpenDept() {
     return this.openDept;
   }
 
   public void setOpenDept(String openDept) {
     this.openDept = openDept;
   }
 
   public String getOpenUserPriv() {
     return this.openUserPriv;
   }
 
   public void setOpenUserPriv(String openUserPriv) {
     this.openUserPriv = openUserPriv;
   }
 
   public String getCurrentUser() {
     return this.currentUser;
   }
 
   public void setCurrentUser(String currentUser) {
     this.currentUser = currentUser;
   }
 }

