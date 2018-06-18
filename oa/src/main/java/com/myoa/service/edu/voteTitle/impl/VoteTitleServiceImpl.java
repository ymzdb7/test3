 package com.myoa.service.edu.voteTitle.impl;
 
 import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.myoa.dao.common.SysCodeMapper;
import com.myoa.dao.edu.voteItem.VoteItemMapper;
import com.myoa.dao.edu.voteTitle.VoteTitleMapper;
import com.myoa.dao.sms.SmsMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.common.SysCode;
import com.myoa.model.edu.voteItem.VoteItem;
import com.myoa.model.edu.voteTitle.VoteTitle;
import com.myoa.model.sms.SmsBody;
import com.myoa.model.users.Users;
import com.myoa.service.department.DepartmentService;
import com.myoa.service.edu.voteTitle.IVoteTitleService;
import com.myoa.service.sms.SmsService;
import com.myoa.service.users.UsersPrivService;
import com.myoa.service.users.UsersService;
import com.myoa.util.AjaxJson;
import com.myoa.util.DateFormat;
import com.myoa.util.ToJson;
import com.myoa.util.common.L;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.page.PageParams;

 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.HashSet;
 import java.util.List;
 import java.util.Map;
 import java.util.Set;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class VoteTitleServiceImpl extends ServiceImpl<VoteTitleMapper, VoteTitle>
   implements IVoteTitleService
 {
 
   @Autowired
   VoteTitleMapper voteTitleMapper;
 
   @Autowired
   SysCodeMapper sysCodeMapper;
 
   @Autowired
   DepartmentService departmentService;
 
   @Autowired
   UsersMapper usersMapper;
 
   @Resource
   private SmsService smsService;
 
   @Autowired
   SmsMapper smsMapper;
 
   @Resource
   UsersPrivService usersPrivService;
 
   @Resource
   UsersService usersService;
 
   @Resource
   VoteItemMapper voteItemMapper;
 
   public ToJson<VoteTitle> getVoteTitleList(HttpServletRequest request, VoteTitle voteTitle, Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson toJson = new ToJson(1, "error");
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     int getcount = 0;
     try {
       if ((voteTitle.getSendTime() == null) || (voteTitle.getSendTime() == "")) {
         voteTitle.setSendTime(DateFormat.getCurrentTime());
       }
       if ((voteTitle.getEndDate() == null) || (voteTitle.getEndDate() == "0000-00-00")) {
         voteTitle.setEndDate(DateFormat.getCurrentTime());
       }
       List<VoteTitle> list = this.voteTitleMapper.getVoteTitleList(maps);
       String viewResult = null;
 
       for (VoteTitle voteTitle1 : list) {
         voteTitle1.setSendTime(org.apache.commons.lang.StringUtils.substring(voteTitle1.getSendTime(), 0, voteTitle1.getSendTime().length() - 10));
 
         String toID = this.departmentService.getDeptNameByDeptId(voteTitle1.getToId(), ",");
         voteTitle1.setToDeptName(toID);
 
         String privId = this.usersPrivService.getPrivNameByPrivId(voteTitle1.getPrivId(), ",");
         voteTitle1.setToPrivName(privId);
 
         String userId = this.usersService.getUserNameById(voteTitle1.getUserId(), ",");
         voteTitle1.setToUserName(userId);
 
         String viewResultPrivId = this.usersPrivService.getPrivNameByPrivId(voteTitle1.getViewResultPrivId(), ",");
         voteTitle1.setViewResultPrivId(viewResultPrivId);
 
         String viewResultUserId = this.usersService.getUserNameById(voteTitle1.getViewResultUserId(), ",");
         voteTitle1.setViewResultUserId(viewResultUserId);
       }
 
       getcount = this.voteTitleMapper.getcount();
 
       if (list != null) {
         toJson.setObj(list);
         toJson.setTotleNum(Integer.valueOf(getcount));
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("列表为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteTitleServiceImpl getVoteTitleList:" + e });
     }
     return toJson;
   }
 
   public ToJson getVoteTitleListOner(HttpServletRequest request, VoteTitle voteTitle, Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson();
     try {
       PageParams pageParams = new PageParams();
       pageParams.setPage(page);
       pageParams.setPageSize(pageSize);
       pageParams.setUseFlag(Boolean.valueOf(useFlag));
       maps.put("page", pageParams);
 
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       user = this.usersMapper.getUsersByuserId(user.getUserId());
       List list = this.voteTitleMapper.getVoteTitleList(maps);
 
       for (int i = 0; i < list.size(); i++) {
         VoteTitle voteTitle1 = (VoteTitle)list.get(i);
         if (voteTitle1 != null) {
           String toId = voteTitle1.getToId();
           String privId = voteTitle1.getPrivId();
           String userId = voteTitle1.getUserId();
           String viewResultPrivId = voteTitle1.getViewResultPrivId();
           String viewResultUserId = voteTitle1.getViewResultUserId();
           String[] toIds = null; String[] privIds = null; String[] userIds = null; String[] viewResultPrivIds = null; String[] viewResultUserIds = null;
           if (toId != null) {
             toIds = toId.split(",");
           }
           if (privId != null) {
             privIds = privId.split(",");
           }
           if (userId != null) {
             userIds = userId.split(",");
           }
           if (viewResultPrivId != null) {
             viewResultPrivIds = viewResultPrivId.split(",");
           }
           if (viewResultUserId != null) {
             viewResultUserIds = viewResultUserId.split(",");
           }
           if (toIds != null) {
             if ((Arrays.asList(toIds).contains(user.getDeptId())) || 
               (privIds == null) || 
               (Arrays.asList(privIds).contains(user.getUid())) || 
               (userIds == null) || 
               (Arrays.asList(userIds).contains(user.getUserId())) || 
               (viewResultPrivIds == null) || 
               (Arrays.asList(viewResultPrivIds).contains(user.getUid())) || 
               (viewResultUserIds == null) || 
               (Arrays.asList(viewResultUserIds).contains(user.getUserId()))) continue;
             list.remove(i);
           }
           else if (privIds != null) {
             if ((Arrays.asList(privIds).contains(user.getUid())) || 
               (userIds == null) || 
               (Arrays.asList(userIds).contains(user.getUserId())) || 
               (viewResultPrivIds == null) || 
               (Arrays.asList(viewResultPrivIds).contains(user.getUid())) || 
               (viewResultUserIds == null) || 
               (Arrays.asList(viewResultUserIds).contains(user.getUserId()))) continue;
             list.remove(i);
           }
           else if (userIds != null) {
             if ((Arrays.asList(userIds).contains(user.getUserId())) || 
               (viewResultPrivIds == null) || 
               (Arrays.asList(viewResultPrivIds).contains(user.getUid())) || 
               (viewResultUserIds == null) || 
               (Arrays.asList(viewResultUserIds).contains(user.getUserId()))) continue;
             list.remove(i);
           }
           else if (viewResultPrivIds != null) {
             if ((Arrays.asList(viewResultPrivIds).contains(user.getUid())) || 
               (viewResultUserIds == null) || 
               (Arrays.asList(viewResultUserIds).contains(user.getUserId()))) continue;
             list.remove(i);
           }
           else
           {
             if ((viewResultUserIds == null) || 
               (Arrays.asList(viewResultUserIds).contains(user.getUserId()))) continue;
             list.remove(i);
           }
         }
 
       }
 
       if (list.size() > 0) {
         json.setObj(list);
         json.setMsg("ok");
         json.setTotleNum(pageParams.getTotal());
         json.setFlag(0);
         return json;
       }
       json.setFlag(0);
       json.setMsg("err");
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<VoteTitle> newVoteTitle(HttpServletRequest request, VoteTitle voteTitle)
   {
     ToJson toJson = new ToJson(1, "error");
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     try {
       if (voteTitle.getParentId() == null) {
         voteTitle.setParentId(Integer.valueOf(0));
       }
       if (com.myoa.util.common.StringUtils.checkNull(voteTitle.getBeginDate()).booleanValue()) {
         voteTitle.setBeginDate(DateFormat.getCurrentTime2());
       }
       if (com.myoa.util.common.StringUtils.checkNull(voteTitle.getEndDate()).booleanValue()) {
         voteTitle.setEndDate(DateFormat.getCurrentTime2());
       }
       if (com.myoa.util.common.StringUtils.checkNull(voteTitle.getSendTime()).booleanValue()) {
         voteTitle.setSendTime(DateFormat.getCurrentTime());
       }
       voteTitle.setFromId(users.getUserId());
       int a = this.voteTitleMapper.newVoteTitle(voteTitle);
       if (a > 0) {
         toJson.setMsg("新建成功");
         toJson.setObject(voteTitle.getVoteId());
         toJson.setFlag(0);
       } else {
         toJson.setMsg("新建失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteTitleServiceImpl newVoteTitle:" + e });
     }
     return toJson;
   }
 
   public ToJson<VoteTitle> updateVoteTitle(HttpServletRequest request, VoteTitle voteTitle)
   {
     ToJson toJson = new ToJson(1, "error");
     VoteTitle voteTitle1 = new VoteTitle();
     SmsBody smsBody = new SmsBody();
     try {
       if (voteTitle.getParentId() == null) {
         voteTitle.setParentId(Integer.valueOf(0));
       }
       if (voteTitle.getBeginDate() == null) {
         voteTitle.setBeginDate(DateFormat.getCurrentTime());
       }
       if (voteTitle.getEndDate() == null) {
         voteTitle.setEndDate(DateFormat.getCurrentTime());
       }
       if (voteTitle.getSendTime() == null) {
         voteTitle.setSendTime(DateFormat.getCurrentTime());
       }
       int a = this.voteTitleMapper.updateVoteTitle(voteTitle);
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
       L.e(new Object[] { "VoteTitleServiceImpl updateVoteTitle:" + e });
     }
     return toJson;
   }
 
   public ToJson<VoteTitle> getChildVoteList(HttpServletRequest request, VoteTitle voteTitle, Integer voteId)
   {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       VoteTitle voteTitle1 = getVoTitle(voteId);
       if (!com.myoa.util.common.StringUtils.checkNull(voteTitle1.getSendTime()).booleanValue()) {
         voteTitle1.setSendTime(voteTitle1.getSendTime().substring(0, voteTitle1.getSendTime().length() - 2));
       }
       List voteItemList = this.voteItemMapper.getVoteItemList(voteId);
       voteTitle1.setVoteItemList(voteItemList);
 
       List<VoteTitle> list = this.voteTitleMapper.getChildVoteList(voteId);
       if (list != null) {
         for (VoteTitle voteTitle2 : list) {
           List voteItemList1 = this.voteItemMapper.getVoteItemList(voteTitle2.getVoteId());
           voteTitle2.setVoteItemList(voteItemList1);
         }
       }
       voteTitle1.setVoteTitleList(list);
       toJson.setFlag(0);
       toJson.setMsg("OK");
       toJson.setObject(voteTitle1);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       toJson.setFlag(1);
       L.e(new Object[] { "VoteTitleServiceImpl getChildVoteList:" + e });
     }
     return toJson;
   }
 
   public ToJson<VoteTitle> addChildVoteTitle(HttpServletRequest request, VoteTitle voteTitle)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       voteTitle.setFromId(user.getUserId());
       voteTitle.setParentId(voteTitle.getVoteId());
       if (voteTitle.getBeginDate() == null) {
         voteTitle.setBeginDate(DateFormat.getCurrentTime());
       }
       if (voteTitle.getEndDate() == null) {
         voteTitle.setEndDate(DateFormat.getCurrentTime());
       }
       if (voteTitle.getSendTime() == null) {
         voteTitle.setSendTime(DateFormat.getCurrentTime());
       }
       int a = this.voteTitleMapper.newVoteTitle(voteTitle);
       if (a > 0) {
         toJson.setMsg("新建子投票成功");
         toJson.setFlag(0);
       } else {
         toJson.setMsg("新建子投票失败");
         toJson.setFlag(1);
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteTitleServiceImpl addChildVoteTitle:" + e });
     }
     return toJson;
   }
 
   public ToJson<VoteTitle> getChilddetail(HttpServletRequest request, Integer voteId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       VoteTitle voteTitle = this.voteTitleMapper.getChilddetail(voteId);
 
       if (voteTitle != null) {
         String toID = this.departmentService.getDeptNameByDeptId(voteTitle.getToId(), ",");
         voteTitle.setToId(toID);
 
         String privId = this.usersPrivService.getPrivNameByPrivId(voteTitle.getPrivId(), ",");
         voteTitle.setPrivId(privId);
 
         String userId = this.usersService.getUserNameById(voteTitle.getUserId(), ",");
         voteTitle.setUserId(userId);
 
         String viewResultPrivId = this.usersPrivService.getPrivNameByPrivId(voteTitle.getViewResultPrivId(), ",");
         voteTitle.setViewResultPrivId(viewResultPrivId);
 
         String viewResultUserId = this.usersService.getUserNameById(voteTitle.getViewResultUserId(), ",");
         voteTitle.setViewResultUserId(viewResultUserId);
       }
       if (voteTitle != null) {
         toJson.setObject(voteTitle);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("投票信息为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteTitleServiceImpl getChilddetail:" + e });
     }
     return toJson;
   }
 
   public ToJson<VoteTitle> deleteByVoteId(HttpServletRequest request, String[] voteIds)
   {
     ToJson toJson = new ToJson(1, "error");
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     try {
       if (voteIds.length > 0) {
         this.voteTitleMapper.deleteByVoteId(voteIds);
 
         for (int i = 0; i < voteIds.length; i++) {
           Map map = new HashMap();
           String remingUrl = "votevoteResult?resultId=" + voteIds[i] + "&type=0";
           map.put("toId", user.getUserId());
           map.put("smsType", Integer.valueOf(11));
           map.put("remindUrl", remingUrl);
           Integer bodyId = this.smsMapper.putStringOne(map);
           if (bodyId != null) {
             this.smsMapper.deleteOne(bodyId);
             this.smsMapper.deleteOnet(bodyId);
           }
         }
       }
       toJson.setMsg("删除成功");
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteTitleServiceImpl deleteByVoteId:" + e });
     }
     return toJson;
   }
 
   public ToJson<VoteTitle> getVoteDataByVoteId(HttpServletRequest request, Integer voteId)
   {
     ToJson toJson = new ToJson(1, "error");
     try
     {
       VoteTitle voteTitle = this.voteTitleMapper.getChilddetail(voteId);
 
       List voteItemList = this.voteItemMapper.getVoteItemList(voteId);
 
       int countZ = count(voteItemList);
       voteTitle.setSum(Integer.valueOf(countZ));
       voteTitle.setVoteItemList(voteItemList);
 
       List<VoteTitle> list = this.voteTitleMapper.getChildVoteList(voteId);
       for (VoteTitle voteTitle1 : list)
       {
         List voteItemList1 = this.voteItemMapper.getVoteItemList(voteTitle1.getVoteId());
 
         int countson = count(voteItemList1);
         voteTitle1.setSum(Integer.valueOf(countson));
         voteTitle1.setVoteItemList(voteItemList1);
       }
       voteTitle.setVoteTitleList(list);
       toJson.setObject(voteTitle);
       toJson.setMsg("ok");
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       toJson.setFlag(1);
       L.e(new Object[] { "VoteTitleServiceImpl getVoteDataByVoteId:" + e });
     }
     return toJson;
   }
 
   public ToJson<VoteTitle> searchVoteTitleList(HttpServletRequest request, VoteTitle voteTitle, Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson toJson = new ToJson(1, "error");
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     String userId = null;
     String userPriv = null;
     String deptId = null;
     if ((user != null) && (user.getUserId() != null)) {
       userId = user.getUserId() + "";
       userPriv = user.getUserPriv() + "";
       deptId = user.getDeptId() + "";
     }
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     maps.put("userId", userId);
     maps.put("userPriv", userPriv);
     maps.put("deptId", deptId);
     int getcount = 0;
     try
     {
       List<VoteTitle> list = this.voteTitleMapper.searchVoteTitleList(maps);
       for (VoteTitle voteTitle2 : list)
       {
         if (voteTitle2.getFromId().equals(user.getUserId())) {
           voteTitle2.setRight(true);
         }
         boolean isVotitle = isVotite(String.valueOf(voteTitle2.getVoteId()), user);
         voteTitle2.setHave(isVotitle);
         voteTitle2.setSendTime(org.apache.commons.lang.StringUtils.substring(voteTitle2.getSendTime(), 0, voteTitle2.getSendTime().length() - 10));
       }
 
       getcount = this.voteTitleMapper.getcount1();
 
       if (list != null) {
         toJson.setObj(list);
         toJson.setTotleNum(Integer.valueOf(getcount));
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("投票为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteTitleServiceImpl searchVoteTitleList:" + e });
     }
     return toJson;
   }
 
   public ToJson<VoteTitle> getVoteTitleCount(HttpServletRequest request, VoteTitle voteTitle, Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson toJson = new ToJson(1, "error");
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     String userId = null;
     String userPriv = null;
     String deptId = null;
     if ((user != null) && (user.getUserId() != null)) {
       userId = user.getUid() + "";
       userPriv = user.getUserPriv() + "";
       deptId = user.getDeptId() + "";
     }
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     maps.put("userId", userId);
     maps.put("userPriv", userPriv);
     maps.put("deptId", deptId);
     int getcount = 0;
     try {
       List<VoteTitle> list = this.voteTitleMapper.getVoteTitleCount(maps);
       if ((list != null) && (list.size() > 0)) {
         for (VoteTitle voteTitle1 : list)
         {
           if (voteTitle1.getFromId().equals(user.getUserId())) {
             voteTitle1.setRight(true);
           }
           voteTitle1.setSendTime(org.apache.commons.lang.StringUtils.substring(voteTitle1.getSendTime(), 0, voteTitle1.getSendTime().length() - 10));
         }
         getcount = this.voteTitleMapper.getcount2();
         toJson.setObj(list);
         toJson.setTotleNum(Integer.valueOf(getcount));
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("数据为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteTitleServiceImpl getVoteTitleCount:" + e });
     }
     return toJson;
   }
 
   public String checkAll(String checkString)
   {
     StringBuffer sb = new StringBuffer("");
     Map mapParam = new HashMap();
 
     if (checkString != null)
     {
       String checkUserId = checkString.substring(0, checkString.length() == 0 ? 0 : checkString.length() - 1);
       if ((checkUserId != null) && (!"".equals(checkUserId))) {
         checkUserId = "'" + checkUserId.replace(",", "','") + "'";
         mapParam.put("checkUserId", checkUserId);
         List listCheckVoteUser = this.usersMapper.getUserNames(mapParam);
         sb.append(getString(listCheckVoteUser));
       } else {
         sb.append("");
       }
     }
     return sb.toString();
   }
 
   public String getString(List<String> Strings) {
     StringBuffer sb = new StringBuffer("");
     for (String s : Strings) {
       sb.append(s);
       sb.append(",");
     }
     return sb.toString();
   }
 
   public boolean isVotite(String voteId, Users users)
   {
     List<VoteItem> list = this.voteItemMapper.getVoteItemList(Integer.valueOf(Integer.parseInt(voteId)));
     if (list != null) {
       for (VoteItem voteItem : list) {
         if (!com.myoa.util.common.StringUtils.checkNull(voteItem.getVoteUser()).booleanValue()) {
           String[] userAll = voteItem.getVoteUser().split(",");
 
           if (Arrays.asList(userAll).contains(users.getUserId())) {
             return true;
           }
         }
       }
     }
     return false;
   }
 
   public AjaxJson addVoteTitle(HttpServletRequest request, VoteTitle voteTitle, String options, Integer voteId)
   {
     AjaxJson ajaxJson = new AjaxJson();
     voteTitle = this.voteTitleMapper.getChilddetail(voteId);
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     if (DateFormat.getDateTime(voteTitle.getSendTime()).intValue() > DateFormat.getDateTime(voteTitle.getEndDate()).intValue()) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg("投票日期不符");
     } else if (DateFormat.getDateTime(DateFormat.getCurrentTime()).intValue() > DateFormat.getDateTime(voteTitle.getEndDate()).intValue()) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg("投票日期已过");
     } else if (isVotite(String.valueOf(voteId), users)) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg("已经投过票，不能重复投票");
     } else {
       try {
         String[] itemIds = options.split(",");
         for (int i = 0; i < itemIds.length; i++) {
           VoteItem voteItem = this.voteItemMapper.getVoteItem(Integer.valueOf(Integer.parseInt(itemIds[i])));
           if (voteItem.getVoteCount() != null)
             voteItem.setVoteCount(Integer.valueOf(voteItem.getVoteCount().intValue() + 1));
           else {
             voteItem.setVoteCount(Integer.valueOf(1));
           }
           if (com.myoa.util.common.StringUtils.checkNull(voteItem.getVoteUser()).booleanValue())
             voteItem.setVoteUser(users.getUserId());
           else {
             voteItem.setVoteUser(voteItem.getVoteUser() + "," + users.getUserId());
           }
           this.voteItemMapper.updateVote(voteItem);
         }
       } catch (Exception e) {
         e.printStackTrace();
         ajaxJson.setMsg(e.getMessage());
         ajaxJson.setFlag(false);
       }
 
       String remingUrl = "manage/voteResult?resultId=" + voteId + "&type=1";
       this.smsService.updatequerySmsByType("11", users.getUserId(), remingUrl);
       ajaxJson.setFlag(true);
       ajaxJson.setMsg("OK");
     }
     return ajaxJson;
   }
 
   public AjaxJson statusUpdate(HttpServletRequest request, Integer voteId)
   {
     SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 
     AjaxJson ajaxJson = new AjaxJson();
     VoteTitle voteTitle1 = new VoteTitle();
     SmsBody smsBody = new SmsBody();
     try
     {
       List list = this.voteItemMapper.getVoteItemList(voteId);
 
       List list1 = this.voteTitleMapper.getChildVoteList(voteId);
       if ((list.size() == 0) && (list1.size() == 0)) {
         ajaxJson.setFlag(false);
         ajaxJson.setObj(voteId);
         ajaxJson.setMsg("No voting items!");
       } else {
         VoteTitle voteTitle = this.voteTitleMapper.getChilddetail(voteId);
         if (voteTitle.getParentId() == null) {
           voteTitle.setParentId(Integer.valueOf(0));
         }
         if (voteTitle.getBeginDate() == null) {
           voteTitle.setBeginDate(DateFormat.getCurrentTime());
         }
         if (voteTitle.getEndDate() == null) {
           voteTitle.setEndDate(DateFormat.getCurrentTime());
         }
         voteTitle.setSendTime(sdf1.format(new Date()));
         voteTitle.setPublish("1");
         this.voteTitleMapper.updateVoteTitle(voteTitle);
         ajaxJson.setFlag(true);
         ajaxJson.setMsg("OK!");
 
         voteTitle1 = this.voteTitleMapper.voteSelectOne(voteTitle.getVoteId());
         if (voteTitle1 != null)
         {
           String[] userIdList = null;
           if ((voteTitle1.getUserId() != null) && (voteTitle1.getUserId() != "")) userIdList = voteTitle.getUserId().split(",");
 
           List<String> userArray = new ArrayList();
           if (userIdList != null) {
             for (String userId : userIdList) {
               userArray.add(userId);
             }
           }
 
           List<Users> deptList = new ArrayList();
           if (!com.myoa.util.common.StringUtils.checkNull(voteTitle1.getToId()).booleanValue()) {
             deptList = this.usersService.getUserByDeptIds(voteTitle1.getToId(), Integer.valueOf(1));
           }
           List<String> deptArray = new ArrayList();
           for (Users users : deptList) {
             deptArray.add(users.getUserId());
           }
 
           List<Users> privList = new ArrayList();
           if (!com.myoa.util.common.StringUtils.checkNull(voteTitle1.getPrivId()).booleanValue()) {
             privList = this.usersService.getUserByDeptIds(voteTitle1.getPrivId(), Integer.valueOf(2));
           }
           List<String> privArray = new ArrayList();
           for (Users users : privList) {
             privArray.add(users.getUserId());
           }
 
           if (userArray != null) {
             for (String userId : userArray) {
               int f1 = 0;
               for (String deptUser : deptArray) {
                 if (userId.equals(deptUser)) {
                   f1 = 1;
                   break;
                 }
               }
               if (f1 == 0) {
                 deptArray.add(userId);
               }
             }
           }
           for (String temp1 : deptArray) {
             int f2 = 0;
             for (String privUser : privArray) {
               if (temp1.equals(privUser)) {
                 f2 = 1;
                 break;
               }
             }
             if (f2 == 0) {
               privArray.add(temp1);
             }
           }
           StringBuffer userStr = new StringBuffer();
           for (String tempUser : privArray) {
             Map map = new HashMap();
             map.put("readers", tempUser);
             map.put("voteId", voteTitle.getVoteId());
             VoteTitle voteTitle2 = this.voteTitleMapper.slectUserTd(map);
             if (voteTitle2 == null) {
               userStr.append(tempUser + ",");
             }
           }
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");
           Date date = sdf.parse(voteTitle1.getSendTime().substring(0, voteTitle1.getSendTime().length() - 2));
           smsBody.setFromId(voteTitle1.getFromId());
           smsBody.setContent(voteTitle1.getSubject());
           smsBody.setSendTime(Integer.valueOf((int)(date.getTime() / 1000L)));
           SysCode sysCode = new SysCode();
           sysCode.setCodeName("投票");
           sysCode.setParentNo("SMS_REMIND");
           if (this.sysCodeMapper.getCodeNoByNameAndParentNo(sysCode) != null) {
             smsBody.setSmsType(this.sysCodeMapper.getCodeNoByNameAndParentNo(sysCode).getCodeNo());
           }
           String[] array = userStr.toString().split(",");
           Set set = new HashSet();
           for (int i = 0; i < array.length; i++) {
             set.add(array[i]);
           }
           String[] arrayResult = (String[])(String[])set.toArray(new String[set.size()]);
           StringBuffer sb = new StringBuffer();
           for (int i = 0; i < arrayResult.length; i++) {
             sb.append(arrayResult[i]);
             sb.append(",");
           }
           String s = sb.toString();
           smsBody.setRemindUrl("manage/voteResult?resultId=" + voteTitle1.getVoteId() + "&type=1");
           smsBody.setSmsType("11");
           String sqlType = (String)request.getSession().getAttribute("loginDateSouse");
           this.smsService.saveSms(smsBody, s, "1", "2", "", "", sqlType);
         }
       }
     } catch (Exception e) {
       ajaxJson.setFlag(false);
       ajaxJson.setMsg("false");
     }
     return ajaxJson;
   }
 
   public ToJson<VoteTitle> getOptionVoteList(HttpServletRequest request, VoteTitle voteTitle, Integer voteId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List list = this.voteTitleMapper.getVoteDataByVoteId(voteId);
       if (list != null) {
         toJson.setObj(list);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("子列表为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteTitleServiceImpl getOptionVoteList:" + e });
     }
     return toJson;
   }
 
   public VoteTitle getVoTitle(Integer voteId) {
     VoteTitle voteTitle = this.voteTitleMapper.getChilddetail(voteId);
 
     String toID = this.departmentService.getDeptNameByDeptId(voteTitle.getToId(), ",");
     voteTitle.setToId(toID);
 
     String privId = this.usersPrivService.getPrivNameByPrivId(voteTitle.getPrivId(), ",");
     voteTitle.setPrivId(privId);
 
     String userId = this.usersService.getUserNameById(voteTitle.getUserId(), ",");
     voteTitle.setUserId(userId);
 
     String viewResultPrivId = this.usersPrivService.getPrivNameByPrivId(voteTitle.getViewResultPrivId(), ",");
     voteTitle.setViewResultPrivId(viewResultPrivId);
 
     String viewResultUserId = this.usersService.getUserNameById(voteTitle.getViewResultUserId(), ",");
     voteTitle.setViewResultUserId(viewResultUserId);
     return voteTitle;
   }
 
   public int count(List<VoteItem> list)
   {
     int sum = 0;
     for (VoteItem voteItem : list)
     {
       int count = voteItem.getVoteCount().intValue();
       sum += count;
     }
     return sum;
   }
 
   public ToJson<VoteTitle> getPublishVoteTitleList(HttpServletRequest request, VoteTitle voteTitle, Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson toJson = new ToJson(1, "error");
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     String userId = null;
     String userPriv = null;
     String deptId = null;
     if ((user != null) && (user.getUserId() != null)) {
       userId = user.getUid() + "";
       userPriv = user.getUserPriv() + "";
       deptId = user.getDeptId() + "";
     }
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     maps.put("userId", userId);
     maps.put("userPriv", userPriv);
     maps.put("deptId", deptId);
     int getcount = 0;
     try {
       List<VoteTitle> list = this.voteTitleMapper.searchVoteTitleList(maps);
       for (VoteTitle voteTitle2 : list)
       {
         List<VoteItem> voteItemList = this.voteItemMapper.getVoteItemList(voteTitle2.getVoteId());
         int sum = 0;
         int voteCount = 0;
         List tempList = new ArrayList();
         for (VoteItem voteItem : voteItemList) {
           String voteUser = voteItem.getVoteUser();
           if (!com.myoa.util.common.StringUtils.checkNull(voteUser).booleanValue()) {
             List<String> list1 = new ArrayList();
             String[] voteU = voteUser.split(",");
             int i = 0; for (int len = voteU.length; i < len; i++) {
               list1.add(voteU[i]);
             }
 
             for (String is : list1) {
               if (!tempList.contains(is)) {
                 tempList.add(is);
                 tempList.size();
               }
             }
 
           }
 
           int count = voteItem.getVoteCount().intValue();
           sum += count;
 
           voteCount = tempList.size();
         }
         voteTitle2.setSum(Integer.valueOf(sum));
 
         voteTitle2.setVoteCount(Integer.valueOf(voteCount));
         voteTitle2.setVoteItemList(voteItemList);
 
         if (voteTitle2.getFromId().equals(user.getUserId())) {
           voteTitle2.setRight(true);
         }
         boolean isVotitle = isVotite(String.valueOf(voteTitle2.getVoteId()), user);
         voteTitle2.setHave(isVotitle);
         voteTitle2.setSendTime(org.apache.commons.lang.StringUtils.substring(voteTitle2.getSendTime(), 0, voteTitle2.getSendTime().length() - 10));
       }
       getcount = this.voteTitleMapper.getcount1();
       voteTitle.setGetCount(Integer.valueOf(getcount));
       if (list != null) {
         toJson.setObj(list);
         toJson.setObject(voteTitle);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("投票为空");
       }
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteTitleServiceImpl searchVoteTitleList:" + e });
     }
     return toJson;
   }
 
   public ToJson<VoteTitle> getPublishVoteTitleCount(HttpServletRequest request, VoteTitle voteTitle, Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson toJson = new ToJson(1, "error");
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     String userId = null;
     String userPriv = null;
     String deptId = null;
     if ((user != null) && (user.getUserId() != null)) {
       userId = user.getUid() + "";
       userPriv = user.getUserPriv() + "";
       deptId = user.getDeptId() + "";
     }
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     maps.put("userId", userId);
     maps.put("userPriv", userPriv);
     maps.put("deptId", deptId);
     int getcount = 0;
     try {
       List<VoteTitle> list = this.voteTitleMapper.getVoteTitleCount(maps);
 
       if ((list != null) && (list.size() > 0)) {
         for (VoteTitle voteTitle1 : list)
         {
           List<VoteItem> voteItemList = this.voteItemMapper.getVoteItemList(voteTitle1.getVoteId());
           int sum = 0;
           int voteCount = 0;
           List tempList = new ArrayList();
           for (VoteItem voteItem : voteItemList) {
             String voteUser = voteItem.getVoteUser();
             if (!com.myoa.util.common.StringUtils.checkNull(voteUser).booleanValue()) {
               List<String> list1 = new ArrayList();
               String[] voteU = voteUser.split(",");
               int i = 0; 
                         for (int len = voteU.length; i < len; i++) {
                 list1.add(voteU[i]);
               }
 
               for (String is : list1) {
                 if (!tempList.contains(is)) {
                   tempList.add(is);
                   tempList.size();
                 }
               }
 
             }
 
             int count = voteItem.getVoteCount().intValue();
             sum += count;
 
             voteCount = tempList.size();
           }
           voteTitle1.setSum(Integer.valueOf(sum));
           voteTitle1.setVoteCount(Integer.valueOf(voteCount));
           voteTitle1.setVoteItemList(voteItemList);
 
           if (voteTitle1.getFromId().equals(user.getUserId())) {
             voteTitle1.setRight(true);
           }
           voteTitle1.setSendTime(org.apache.commons.lang.StringUtils.substring(voteTitle1.getSendTime(), 0, voteTitle1.getSendTime().length() - 10));
         }
         getcount = this.voteTitleMapper.getcount2();
         voteTitle.setGetCount(Integer.valueOf(getcount));
         toJson.setObj(list);
         toJson.setObject(voteTitle);
         toJson.setMsg("ok");
       } else {
         toJson.setMsg("err");
       }
     } catch (Exception e) {
       e.printStackTrace();
       toJson.setMsg(e.getMessage());
       L.e(new Object[] { "VoteTitleServiceImpl getVoteTitleCount:" + e });
     }
     return toJson;
   }
 }

