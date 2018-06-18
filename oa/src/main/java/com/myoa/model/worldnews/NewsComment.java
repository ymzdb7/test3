 package com.myoa.model.worldnews;
 
 import java.util.Date;
 
 public class NewsComment
 {
   private Integer comment_id;
   private Integer parent_id;
   private Integer news_id;
   private String user_id;
   private String nick_name;
   private String content;
   private Date re_time;
   private int count;
   private NewsComment originalnewsComment;
 
   public NewsComment()
   {
   }
 
   public NewsComment(Integer comment_id, Integer parent_id, Integer news_id, String user_id, String nick_name, String content, Date re_time, int count, NewsComment originalnewsComment)
   {
     this.comment_id = comment_id;
     this.parent_id = parent_id;
     this.news_id = news_id;
     this.user_id = user_id;
     this.nick_name = nick_name;
     this.content = content;
     this.re_time = re_time;
     this.count = count;
     this.originalnewsComment = originalnewsComment;
   }
 
   public Integer getComment_id() {
     return this.comment_id;
   }
 
   public void setComment_id(Integer comment_id) {
     this.comment_id = comment_id;
   }
 
   public Integer getParent_id() {
     return this.parent_id;
   }
 
   public void setParent_id(Integer parent_id) {
     this.parent_id = parent_id;
   }
 
   public Integer getNews_id() {
     return this.news_id;
   }
 
   public void setNews_id(Integer news_id) {
     this.news_id = news_id;
   }
 
   public String getUser_id() {
     return this.user_id;
   }
 
   public void setUser_id(String user_id) {
     this.user_id = user_id;
   }
 
   public String getNick_name() {
     return this.nick_name;
   }
 
   public void setNick_name(String nick_name) {
     this.nick_name = nick_name;
   }
 
   public String getContent() {
     return this.content;
   }
 
   public void setContent(String content) {
     this.content = content;
   }
 
   public Date getRe_time() {
     return this.re_time;
   }
 
   public void setRe_time(Date re_time) {
     this.re_time = re_time;
   }
 
   public NewsComment getOriginalnewsComment() {
     return this.originalnewsComment;
   }
 
   public void setOriginalnewsComment(NewsComment originalnewsComment) {
     this.originalnewsComment = originalnewsComment;
   }
 
   public int getCount() {
     return this.count;
   }
 
   public void setCount(int count) {
     this.count = count;
   }
 
   public String toString()
   {
     return "NewsComment{comment_id=" + this.comment_id + ", parent_id=" + this.parent_id + ", news_id=" + this.news_id + ", user_id='" + this.user_id + '\'' + ", nick_name='" + this.nick_name + '\'' + ", content='" + this.content + '\'' + ", re_time=" + this.re_time + ", count=" + this.count + ", originalnewsComment=" + this.originalnewsComment + '}';
   }
 }

