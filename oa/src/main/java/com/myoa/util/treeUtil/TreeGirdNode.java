 package com.myoa.util.treeUtil;
 
 import java.util.List;
 
 public class TreeGirdNode
 {
   private String id;
   private String text;
   private String deptNames;
   private String roleNames;
   private String userNames;
   private List<TreeGirdNode> children;
 
   public String getDeptNames()
   {
     return this.deptNames;
   }
 
   public void setDeptNames(String deptNames)
   {
     this.deptNames = deptNames;
   }
 
   public String getRoleNames()
   {
     return this.roleNames;
   }
 
   public void setRoleNames(String roleNames)
   {
     this.roleNames = roleNames;
   }
 
   public String getUserNames()
   {
     return this.userNames;
   }
 
   public void setUserNames(String userNames)
   {
     this.userNames = userNames;
   }
 
   public String getId() {
     return this.id;
   }
 
   public void setId(String id) {
     this.id = id;
   }
 
   public List<TreeGirdNode> getChildren()
   {
     return this.children;
   }
 
   public void setChildren(List<TreeGirdNode> children) {
     this.children = children;
   }
 
   public String getText()
   {
     return this.text;
   }
 
   public void setText(String text)
   {
     this.text = text;
   }
 }
