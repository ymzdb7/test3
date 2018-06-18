 package com.myoa.model.portalArticle;
 
 public class PortalArticleWithBLOBs extends PortalArticle
 {
   private String mainHead;
   private String subHead;
   private String articleSummary;
   private String articleTitle;
   private String articleComtent;
 
   public String getMainHead()
   {
     return this.mainHead;
   }
 
   public void setMainHead(String mainHead)
   {
     this.mainHead = (mainHead == null ? null : mainHead.trim());
   }
 
   public String getSubHead()
   {
     return this.subHead;
   }
 
   public void setSubHead(String subHead)
   {
     this.subHead = (subHead == null ? null : subHead.trim());
   }
 
   public String getArticleSummary()
   {
     return this.articleSummary;
   }
 
   public void setArticleSummary(String articleSummary)
   {
     this.articleSummary = (articleSummary == null ? null : articleSummary.trim());
   }
 
   public String getArticleTitle()
   {
     return this.articleTitle;
   }
 
   public void setArticleTitle(String articleTitle)
   {
     this.articleTitle = (articleTitle == null ? null : articleTitle.trim());
   }
 
   public String getArticleComtent()
   {
     return this.articleComtent;
   }
 
   public void setArticleComtent(String articleComtent)
   {
     this.articleComtent = (articleComtent == null ? null : articleComtent.trim());
   }
 }

