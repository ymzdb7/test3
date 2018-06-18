 package com.myoa.model.workflow;
 
 public class FlowPrivWithBLOBs extends FlowPriv
 {
   private String privScope;
   private String user;
   private String dept;
   private String role;
   private String privScopeName;
   private String userName;
   private String deptName;
   private String roleName;
 
   public String getRoleName()
   {
     return this.roleName;
   }
 
   public void setRoleName(String roleName) {
     this.roleName = roleName;
   }
 
   public String getDeptName() {
     return this.deptName;
   }
 
   public void setDeptName(String deptName) {
     this.deptName = deptName;
   }
 
   public String getPrivScopeName() {
     return this.privScopeName;
   }
 
   public void setPrivScopeName(String privScopeName) {
     this.privScopeName = privScopeName;
   }
 
   public String getUserName() {
     return this.userName;
   }
 
   public void setUserName(String userName) {
     this.userName = userName;
   }
 
   public String getPrivScope() {
     return this.privScope;
   }
 
   public void setPrivScope(String privScope) {
     this.privScope = (privScope == null ? null : privScope.trim());
   }
 
   public String getUser() {
     return this.user;
   }
 
   public void setUser(String user) {
     this.user = (user == null ? null : user.trim());
   }
 
   public String getDept() {
     return this.dept;
   }
 
   public void setDept(String dept) {
     this.dept = (dept == null ? null : dept.trim());
   }
 
   public String getRole() {
     return this.role;
   }
 
   public void setRole(String role) {
     this.role = (role == null ? null : role.trim());
   }
 }

