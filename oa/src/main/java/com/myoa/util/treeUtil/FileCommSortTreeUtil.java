 package com.myoa.util.treeUtil;
 
 import com.myoa.model.file.FileSortModel;

 import java.util.ArrayList;
 import java.util.List;
import java.util.Map;
 
 public class FileCommSortTreeUtil
 {
   private static final String MENU_ID = "";
   Map<String, Object> map;
   List<FileSortModel> rootTree;
   List<FileSortModel> childTree;
 
   public FileCommSortTreeUtil(List<FileSortModel> rootTree, List<FileSortModel> childTree, Map<String, Object> map)
   {
     this.rootTree = rootTree;
     this.childTree = childTree;
     this.map = map;
   }
 
   public List<TreeNode> getTreeNode()
   {
     return getRootNodes();
   }
 
   private List<TreeNode> getRootNodes()
   {
     List rootNodes = new ArrayList();
     for (FileSortModel fs : this.rootTree) {
       TreeNode node = RootToNode(fs);
       if ((node != null) && 
         (addChlidNodes(node))) {
         rootNodes.add(node);
       }
     }
 
     return rootNodes;
   }
 
   private TreeNode RootToNode(FileSortModel fs)
   {
     if (fs == null) {
       return null;
     }
     TreeNode node = new TreeNode();
     node.setId(String.valueOf(fs.getSortId()));
     node.setDataId(String.valueOf(fs.getSortId()));
     node.setText(fs.getSortName());
     node.setParentId(String.valueOf(fs.getSortParent()));
     node.setState("closed");
     node.getAttributes().put("pid", String.valueOf(fs.getSortParent()));
 
     node.getAttributes().put("USER_ID", Integer.valueOf(CheckTree.checkAll(fs.getUserId(), this.map) == true ? 1 : 0));
 
     node.getAttributes().put("NEW_USER", Integer.valueOf(CheckTree.checkAll(fs.getNewUser(), this.map) == true ? 1 : 0));
 
     node.getAttributes().put("MANAGE_USER", Integer.valueOf(CheckTree.checkAll(fs.getManagerUser(), this.map) == true ? 1 : 0));
 
     node.getAttributes().put("DEL_USER", Integer.valueOf(CheckTree.checkAll(fs.getDelUser(), this.map) == true ? 1 : 0));
 
     node.getAttributes().put("DOWN_USER", Integer.valueOf(CheckTree.checkAll(fs.getDownUser(), this.map) == true ? 1 : 0));
 
     node.getAttributes().put("SIGN_USER", Integer.valueOf(CheckTree.checkAll(fs.getSignUser(), this.map) == true ? 1 : 0));
 
     node.getAttributes().put("REVIEW", Integer.valueOf(CheckTree.checkAll(fs.getReview(), this.map) == true ? 1 : 0));
 
     node.getAttributes().put("OWNER", Integer.valueOf(CheckTree.checkAll(fs.getOwner(), this.map) == true ? 1 : 0));
     return node;
   }
 
   private boolean addChlidNodes(TreeNode rootNode)
   {
     List childNodes = new ArrayList();
     boolean flag = rootNode.getAttributes().get("USER_ID").toString().equals("1");
     boolean temp = false;
     boolean temp2 = false;
     for (FileSortModel fs : this.childTree) {
       if (rootNode.getDataId().equals(String.valueOf(fs.getSortParent()))) {
         TreeNode node = RootToNode(fs);
         if (flag) {
           childNodes.add(node);
           temp = addChlidNodes(node);
         }
         else if (node.getAttributes().get("USER_ID").toString().equals("1")) {
           childNodes.add(node);
           temp2 = addChlidNodes(node);
         }
       }
     }
 
     rootNode.setChildren(childNodes);
     return (flag) || (temp) || (temp2);
   }
 }

