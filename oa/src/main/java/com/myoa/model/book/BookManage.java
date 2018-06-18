 package com.myoa.model.book;
 
 import java.util.Date;
 
 public class BookManage
 {
   private Integer borrowId;
   private Integer dept;
   private String buserId;
   private String buserName;
   private String bookNo;
   private String bookName;
   private Date borrowDate;
   private String borrowBeginDate;
   private String borrowEndDate;
   private String ruserId;
   private String ruserName;
   private Date returnDate;
   private String bookStatus;
   private Date realReturnTime;
   private String deleteFlag;
   private String status;
   private String regFlag;
   private String renewFlag;
   private String whoConfirm;
   private String borrowRemark;
 
   public Integer getBorrowId()
   {
     return this.borrowId;
   }
 
   public void setBorrowId(Integer borrowId)
   {
     this.borrowId = borrowId;
   }
 
   public String getBuserId()
   {
     return this.buserId;
   }
 
   public void setBuserId(String buserId)
   {
     this.buserId = (buserId == null ? null : buserId.trim());
   }
 
   public String getBookNo()
   {
     return this.bookNo;
   }
 
   public void setBookNo(String bookNo)
   {
     this.bookNo = (bookNo == null ? null : bookNo.trim());
   }
 
   public Date getBorrowDate()
   {
     return this.borrowDate;
   }
 
   public void setBorrowDate(Date borrowDate)
   {
     this.borrowDate = borrowDate;
   }
 
   public String getRuserId()
   {
     return this.ruserId;
   }
 
   public void setRuserId(String ruserId)
   {
     this.ruserId = (ruserId == null ? null : ruserId.trim());
   }
 
   public Date getReturnDate()
   {
     return this.returnDate;
   }
 
   public void setReturnDate(Date returnDate)
   {
     this.returnDate = returnDate;
   }
 
   public String getBookStatus()
   {
     return this.bookStatus;
   }
 
   public void setBookStatus(String bookStatus)
   {
     this.bookStatus = (bookStatus == null ? null : bookStatus.trim());
   }
 
   public Date getRealReturnTime()
   {
     return this.realReturnTime;
   }
 
   public void setRealReturnTime(Date realReturnTime)
   {
     this.realReturnTime = realReturnTime;
   }
 
   public String getDeleteFlag()
   {
     return this.deleteFlag;
   }
 
   public void setDeleteFlag(String deleteFlag)
   {
     this.deleteFlag = (deleteFlag == null ? null : deleteFlag.trim());
   }
 
   public String getStatus()
   {
     return this.status;
   }
 
   public void setStatus(String status)
   {
     this.status = (status == null ? null : status.trim());
   }
 
   public String getRegFlag()
   {
     return this.regFlag;
   }
 
   public void setRegFlag(String regFlag)
   {
     this.regFlag = (regFlag == null ? null : regFlag.trim());
   }
 
   public String getRenewFlag()
   {
     return this.renewFlag;
   }
 
   public void setRenewFlag(String renewFlag)
   {
     this.renewFlag = (renewFlag == null ? null : renewFlag.trim());
   }
 
   public String getWhoConfirm()
   {
     return this.whoConfirm;
   }
 
   public void setWhoConfirm(String whoConfirm)
   {
     this.whoConfirm = (whoConfirm == null ? null : whoConfirm.trim());
   }
 
   public String getBorrowRemark()
   {
     return this.borrowRemark;
   }
 
   public void setBorrowRemark(String borrowRemark)
   {
     this.borrowRemark = (borrowRemark == null ? null : borrowRemark.trim());
   }
 
   public String getRuserName() {
     return this.ruserName == null ? "" : this.ruserName;
   }
 
   public void setRuserName(String ruserName) {
     this.ruserName = ruserName;
   }
 
   public String getBuserName() {
     return this.buserName == null ? "" : this.buserName;
   }
 
   public void setBuserName(String buserName) {
     this.buserName = buserName;
   }
 
   public String getBookName() {
     return this.bookName == null ? "" : this.bookName;
   }
 
   public void setBookName(String bookName) {
     this.bookName = bookName;
   }
 
   public Integer getDept() {
     return this.dept;
   }
 
   public void setDept(Integer dept) {
     this.dept = dept;
   }
 
   public String getBorrowBeginDate() {
     return this.borrowBeginDate;
   }
 
   public void setBorrowBeginDate(String borrowBeginDate) {
     this.borrowBeginDate = borrowBeginDate;
   }
 
   public String getBorrowEndDate() {
     return this.borrowEndDate;
   }
 
   public void setBorrowEndDate(String borrowEndDate) {
     this.borrowEndDate = borrowEndDate;
   }
 }

