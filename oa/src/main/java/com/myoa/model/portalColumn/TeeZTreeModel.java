 package com.myoa.model.portalColumn;
 
 import java.util.HashMap;
 import java.util.Map;
 import org.codehaus.jackson.annotate.JsonProperty;
 
 public class TeeZTreeModel extends TeeBaseModel
 {
   public static final String FILE_FOLDER = "file_folder";
   public static final String FILE_FOLDER_SHARE = "file_folder_share";
   public static final String USER_ONLINE = "person_online_node";
   public static final String USER_OFFLINE = "person_offline_node";
   private String id;
   private String pId;
   private String name;
   private String iconSkin;
   private Map<String, Object> params = new HashMap();
   private boolean open;
   private boolean checked;
   private boolean disabled;
   private boolean nocheck;
   private String title;
   private boolean onRight = false;
   private String extend1;
   private String extend2;
 
   @JsonProperty("isParent")
   private boolean isParent;
 
   public TeeZTreeModel()
   {
   }
 
   public TeeZTreeModel(String id, String name, boolean isParent, String pId, boolean open, String iconSkin, String title)
   {
     this.id = id;
     this.pId = pId;
     this.name = name;
     this.iconSkin = iconSkin;
     this.open = open;
     this.title = title;
     this.isParent = isParent;
   }
 
   public TeeZTreeModel(String id, String name, boolean isParent, String pId, boolean open, String iconSkin, String title, boolean onRight)
   {
     this.id = id;
     this.pId = pId;
     this.name = name;
     this.iconSkin = iconSkin;
     this.open = open;
     this.title = title;
     this.isParent = isParent;
     this.onRight = onRight;
   }
 
   public TeeZTreeModel(String id, String name, boolean isParent, String pId, boolean open, String iconSkin, String title, boolean onRight, boolean isCheck)
   {
     this.id = id;
     this.pId = pId;
     this.name = name;
     this.iconSkin = iconSkin;
     this.open = open;
     this.title = title;
     this.isParent = isParent;
     this.onRight = onRight;
     this.checked = isCheck;
   }
 
   public TeeZTreeModel(String id, String name, boolean isParent, String pId, boolean open, String iconSkin, String title, boolean onRight, boolean isCheck, boolean noCheck)
   {
     this.id = id;
     this.pId = pId;
     this.name = name;
     this.iconSkin = iconSkin;
     this.open = open;
     this.title = title;
     this.isParent = isParent;
     this.onRight = onRight;
     this.checked = isCheck;
     this.nocheck = noCheck;
   }
 
   public TeeZTreeModel(String id, String name, boolean isParent, String pId, boolean open, String iconSkin, String title, boolean onRight, String extend1, String extend2)
   {
     this.id = id;
     this.pId = pId;
     this.name = name;
     this.iconSkin = iconSkin;
     this.open = open;
     this.title = title;
     this.isParent = isParent;
     this.onRight = onRight;
     this.extend1 = extend1;
     this.extend2 = extend2;
   }
 
   public boolean isChecked()
   {
     return this.checked;
   }
   public void setChecked(boolean checked) {
     this.checked = checked;
   }
   public boolean isOpen() {
     return this.open;
   }
   public void setOpen(boolean open) {
     this.open = open;
   }
 
   public String getId()
   {
     return this.id;
   }
   public void setId(String id) {
     this.id = id;
   }
 
   public String getName() {
     return this.name;
   }
   public void setName(String name) {
     this.name = name;
   }
   public String getIconSkin() {
     return this.iconSkin;
   }
   public void setIconSkin(String iconSkin) {
     this.iconSkin = iconSkin;
   }
   public boolean isParent() {
     return this.isParent;
   }
   public void setParent(boolean isParent) {
     this.isParent = isParent;
   }
   public void setParams(Map<String, Object> params) {
     this.params = params;
   }
   public Map<String, Object> getParams() {
     return this.params;
   }
   public String getTitle() {
     return this.title;
   }
   public void setTitle(String title) {
     this.title = title;
   }
   public void setExtend1(String extend1) {
     this.extend1 = extend1;
   }
   public void setExtend2(String extend2) {
     this.extend2 = extend2;
   }
   public void setDisabled(boolean disabled) {
     this.disabled = disabled;
   }
   public boolean isDisabled() {
     return this.disabled;
   }
   public boolean isOnRight() {
     return this.onRight;
   }
   public void setOnRight(boolean onRight) {
     onRight = onRight;
   }
   public String getExtend1() {
     return this.extend1;
   }
   public String getExtend2() {
     return this.extend2;
   }
   public String getpId() {
     return this.pId;
   }
   public void setpId(String pId) {
     this.pId = pId;
   }
   public boolean isNocheck() {
     return this.nocheck;
   }
   public void setNocheck(boolean nocheck) {
     this.nocheck = nocheck;
   }
 }

