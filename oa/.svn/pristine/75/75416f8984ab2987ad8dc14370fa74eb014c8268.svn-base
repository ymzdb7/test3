 package com.myoa.util.treeUtil;
 
 import com.myoa.model.file.FileSortModel;

 import java.util.ArrayList;
 import java.util.List;
import java.util.Map;
 
 public class FileSortTreeUtil
 {
   private static final String MENU_ID = "";
   List<FileSortModel> rootTree;
   List<FileSortModel> childTree;
 
   public FileSortTreeUtil(List<FileSortModel> rootTree, List<FileSortModel> childTree)
   {
     this.rootTree = rootTree;
     this.childTree = childTree;
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
       if (node != null) {
         addChlidNodes(node);
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
     node.getAttributes().put("type", "0");
     node.getAttributes().put("id", fs.getSortId());
     return node;
   }
 
   private void addChlidNodes(TreeNode rootNode)
   {
     List childNodes = new ArrayList();
     for (FileSortModel fs : this.childTree) {
       if (rootNode.getDataId().equals(String.valueOf(fs.getSortParent()))) {
         TreeNode node = RootToNode(fs);
         childNodes.add(node);
         addChlidNodes(node);
       }
     }
     rootNode.setChildren(childNodes);
   }
 }

