 package com.myoa.service.edu.voteItem.impl;
 
 import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.myoa.dao.edu.voteItem.VoteItemMapper;
import com.myoa.dao.edu.voteTitle.VoteTitleMapper;
import com.myoa.model.edu.voteItem.VoteItem;
import com.myoa.service.edu.voteItem.IVoteItemService;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;

 import java.util.List;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class VoteItemServiceImpl extends ServiceImpl<VoteItemMapper, VoteItem>
   implements IVoteItemService
 {
 
   @Resource
   VoteItemMapper voteItemMapper;
 
   @Resource
   VoteTitleMapper voteTitleMapper;
 
   public ToJson<VoteItem> addVoteItem(HttpServletRequest request, VoteItem voteItem)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       VoteItem voteItem1 = this.voteItemMapper.getOneVoteItem(voteItem);
       if (voteItem1 == null) {
         int a = this.voteItemMapper.addVoteItem(voteItem);
         if (a > 0) {
           toJson.setMsg("新建成功");
           toJson.setFlag(0);
         } else {
           toJson.setMsg("新建失败");
           toJson.setFlag(1);
         }
       } else {
         toJson.setMsg("新建失败,该名称已存在");
         toJson.setFlag(1);
       }
     }
     catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteItemServiceImpl addvoteItem:" + e });
     }
     return toJson;
   }
 
   public ToJson<VoteItem> updateVoteItem(HttpServletRequest request, VoteItem voteItem)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int a = this.voteItemMapper.updateVoteItem(voteItem);
       if (a > 0) {
         toJson.setMsg("修改成功");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("修改失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteItemServiceImpl updateVoteItem:" + e });
     }
     return toJson;
   }
 
   public ToJson<VoteItem> deleteByItemId(HttpServletRequest request, Integer itemId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       int a = this.voteItemMapper.deleteByItemId(itemId);
       if (a > 0) {
         toJson.setMsg("删除成功");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("删除失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteItemServiceImpl deleteByItemId:" + e });
     }
     return toJson;
   }
 
   public ToJson<VoteItem> getVoteItemList(HttpServletRequest request, Integer voteId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.voteItemMapper.getVoteItemList(voteId);
       if (list != null) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteItemServiceImpl getVoteItemList:" + e });
     }
     return toJson;
   }
 
   public ToJson<VoteItem> updateVoteCount(HttpServletRequest request, VoteItem voteItem)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       voteItem.getItemId();
       int con = voteItem.getVoteCount().intValue();
       voteItem.setVoteCount(Integer.valueOf(con + 1));
       int a = this.voteItemMapper.updateVoteCount(voteItem);
       if (a > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("error");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteItemServiceImpl updateVoteCount:" + e });
     }
     return toJson;
   }
 }
