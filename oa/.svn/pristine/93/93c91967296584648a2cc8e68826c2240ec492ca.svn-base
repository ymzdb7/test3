 package com.myoa.service.wechat.weChat.impl;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.dao.wechat.WeChatCommentMapper;
import com.myoa.dao.wechat.WeChatCommentReplyMapper;
import com.myoa.dao.wechat.WeChatMapper;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.users.Users;
import com.myoa.model.wechat.LikeUser;
import com.myoa.model.wechat.WeChat;
import com.myoa.service.wechat.weChat.WeChatService;
import com.myoa.util.GetAttachmentListUtil;
import com.myoa.util.ToJson;
import com.myoa.util.page.PageParams;

 import java.io.UnsupportedEncodingException;
 import java.net.URLDecoder;
 import java.net.URLEncoder;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Collection;
 import java.util.Date;
 import java.util.Iterator;
 import java.util.List;
 import java.util.ListIterator;
 import java.util.Map;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class WeChatServiceImpl
   implements WeChatService
 {
 
   @Resource
   private WeChatMapper weChatMapper;
 
   @Resource
   private UsersMapper usersMapper;
 
   @Resource
   private WeChatCommentMapper weChatCommentMapper;
 
   @Resource
   private WeChatCommentReplyMapper weChatCommentReplyMapper;
 
   @Resource
   private DepartmentMapper departmentMapper;
 
   public static String emojiConvert1(String str)
     throws UnsupportedEncodingException
   {
     String patternString = "([\\x{10000}-\\x{10ffff}頎€-砜縘)";
 
     Pattern pattern = Pattern.compile(patternString);
 
     Matcher matcher = pattern.matcher(str);
 
     StringBuffer sb = new StringBuffer();
     while (matcher.find()) {
       try {
         matcher.appendReplacement(sb, "[[" + URLEncoder.encode(matcher.group(1), "UTF-8") + "]]");
       }
       catch (UnsupportedEncodingException e)
       {
         e.printStackTrace();
       }
     }
     matcher.appendTail(sb);
 
     return sb.toString();
   }
 
   public static String emojiRecovery2(String str) throws UnsupportedEncodingException
   {
     String patternString = "\\[\\[(.*?)\\]\\]";
 
     Pattern pattern = Pattern.compile(patternString);
     Matcher matcher = pattern.matcher(str);
 
     StringBuffer sb = new StringBuffer();
     while (matcher.find()) {
       try {
         matcher.appendReplacement(sb, URLDecoder.decode(matcher.group(1), "UTF-8"));
       }
       catch (UnsupportedEncodingException e)
       {
         e.printStackTrace();
       }
     }
     matcher.appendTail(sb);
 
     return sb.toString();
   }
 
   public ToJson<WeChat> insertWeChat(WeChat weChat, Users user)
   {
     ToJson json = new ToJson();
     try {
       int uid = user.getUid().intValue();
       String currentTime = String.valueOf(new Date().getTime() / 1000L);
       int time = Integer.valueOf(currentTime).intValue();
       weChat.setUid(Integer.valueOf(uid));
       weChat.setsTime(Integer.valueOf(time));
       String message = emojiConvert1(weChat.getMessage());
       weChat.setMessage(message);
       this.weChatMapper.insertWeChat(weChat);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<WeChat> selectWeChat(Map<String, Object> maps, Integer page, Integer pageSize, boolean useFlag, String sqlType, Users users)
   {
     ToJson json = new ToJson();
     PageParams pageParams = new PageParams();
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     maps.put("page", pageParams);
     try {
       List<WeChat> weChatList = this.weChatMapper.selectWeChat(maps);
       for (WeChat weChat : weChatList) {
         if ((weChat.getFileName() != null) && (weChat.getFileId() != null)) {
           weChat.setAttachment(GetAttachmentListUtil.returnAttachment(weChat.getFileName(), weChat.getFileId(), sqlType, "wechat"));
         } else {
           weChat.setFileName("");
           weChat.setFileId("");
           List attachmentList = new ArrayList();
///*     */           {
///*     */             public int size() {
///* 158 */               return 0;
///*     */             }
///*     */ 
///*     */             public boolean isEmpty()
///*     */             {
///* 163 */               return false;
///*     */             }
///*     */ 
///*     */             public boolean contains(Object o)
///*     */             {
///* 168 */               return false;
///*     */             }
///*     */ 
///*     */             public Iterator<Attachment> iterator()
///*     */             {
///* 173 */               return null;
///*     */             }
///*     */ 
///*     */             public Object[] toArray()
///*     */             {
///* 178 */               return new Object[0];
///*     */             }
///*     */ 
///*     */             public <T> T[] toArray(T[] a)
///*     */             {
///* 183 */               return null;
///*     */             }
///*     */ 
///*     */             public boolean add(Attachment attachment)
///*     */             {
///* 188 */               return false;
///*     */             }
///*     */ 
///*     */             public boolean remove(Object o)
///*     */             {
///* 193 */               return false;
///*     */             }
///*     */ 
///*     */             public boolean containsAll(Collection<?> c)
///*     */             {
///* 198 */               return false;
///*     */             }
///*     */ 
///*     */             public boolean addAll(Collection<? extends Attachment> c)
///*     */             {
///* 203 */               return false;
///*     */             }
///*     */ 
///*     */             public boolean addAll(int index, Collection<? extends Attachment> c)
///*     */             {
///* 208 */               return false;
///*     */             }
///*     */ 
///*     */             public boolean removeAll(Collection<?> c)
///*     */             {
///* 213 */               return false;
///*     */             }
///*     */ 
///*     */             public boolean retainAll(Collection<?> c)
///*     */             {
///* 218 */               return false;
///*     */             }
///*     */ 
///*     */             public void clear()
///*     */             {
///*     */             }
///*     */ 
///*     */             public Attachment get(int index)
///*     */             {
///* 228 */               return null;
///*     */             }
///*     */ 
///*     */             public Attachment set(int index, Attachment element)
///*     */             {
///* 233 */               return null;
///*     */             }
///*     */ 
///*     */             public void add(int index, Attachment element)
///*     */             {
///*     */             }
///*     */ 
///*     */             public Attachment remove(int index)
///*     */             {
///* 243 */               return null;
///*     */             }
///*     */ 
///*     */             public int indexOf(Object o)
///*     */             {
///* 248 */               return 0;
///*     */             }
///*     */ 
///*     */             public int lastIndexOf(Object o)
///*     */             {
///* 253 */               return 0;
///*     */             }
///*     */ 
///*     */             public ListIterator<Attachment> listIterator()
///*     */             {
///* 258 */               return null;
///*     */             }
///*     */ 
///*     */             public ListIterator<Attachment> listIterator(int index)
///*     */             {
///* 263 */               return null;
///*     */             }
///*     */ 
///*     */             public List<Attachment> subList(int fromIndex, int toIndex)
///*     */             {
///* 268 */               return null;
///*     */             }
///*     */           };
           weChat.setAttachment(attachmentList);
         }
         String uid = users.getUid() + "";
         if (users.getUid() == weChat.getUid())
           weChat.setIsSend(Integer.valueOf(0));
         else {
           weChat.setIsSend(Integer.valueOf(1));
         }
         String likeIds = weChat.getLikeIds();
         int result = likeIds.indexOf(",");
         if ((likeIds != "") && (result != -1)) {
           String[] likeIdsArray = likeIds.split(",");
           int a = 0;
           for (int i = 0; i < likeIdsArray.length; i++) {
             if (likeIdsArray[i].equals(uid))
               a += 1;
             else {
               weChat.setIsLike(Integer.valueOf(0));
             }
           }
           if (a == 1) {
             weChat.setIsLike(Integer.valueOf(1));
           }
           weChat.setLikeNum(Integer.valueOf(likeIdsArray.length));
         } else if (likeIds != "")
         {
           if (likeIds.equals(uid))
             weChat.setIsLike(Integer.valueOf(1));
           else {
             weChat.setIsLike(Integer.valueOf(0));
           }
           weChat.setLikeNum(Integer.valueOf(1));
         } else {
           weChat.setIsLike(Integer.valueOf(0));
           weChat.setLikeNum(Integer.valueOf(0));
         }
         int sTime = weChat.getsTime().intValue();
         SimpleDateFormat sformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         long lTime = new Long(sTime * 1000L).longValue();
         Date date = new Date(lTime);
         String newTime = sformat.format(date);
         weChat.setTime(newTime);
         Users user = new Users();
         user = this.usersMapper.selectUserByUId(weChat.getUid());
         if (user != null) {
           weChat.setUserName(user.getUserName());
           weChat.setUserAvatar(user.getAvatar());
           weChat.setUserSex(Integer.valueOf(Integer.parseInt(user.getSex())));
           weChat.setUserPrivName(user.getUserPrivName());
           String deptName = this.departmentMapper.getDeptNameByDeptId(user.getDeptId());
           weChat.setDeptName(deptName);
         } else {
           weChat.setUserName("");
           weChat.setUserAvatar("");
         }
 
         List weChatComment = this.weChatCommentMapper.selectWeChatCommentByWID(weChat.getWid());
         if (weChatComment != null)
           weChat.setCommentNum(Integer.valueOf(weChatComment.size()));
         else {
           weChat.setCommentNum(Integer.valueOf(0));
         }
         String message = emojiRecovery2(weChat.getMessage());
         weChat.setMessage(message);
       }
 
       json.setTotleNum(pageParams.getTotal());
       json.setObj(weChatList);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<WeChat> updateWeChatByPrimaryKey(Integer wid, Users user)
   {
     ToJson json = new ToJson();
     try {
       int uid = user.getUid().intValue();
       WeChat newWeChat = this.weChatMapper.selectWeChatByPrimaryKey(wid);
       String oldUIds = newWeChat.getLikeIds();
       String newUIds = "";
       if ((oldUIds == null) || (oldUIds == "")) {
         newUIds = uid + "";
       } else {
         boolean status = oldUIds.contains(",");
         if (status) {
           String sUId1 = uid + "";
           String[] uidArray = oldUIds.split(",");
           int a = 0;
           for (int i = 0; i < uidArray.length; i++) {
             if (sUId1.equals(uidArray[i])) {
               String sUId = "";
               if (i == 0)
                 sUId = uid + ",";
               else {
                 sUId = "," + uid;
               }
               newUIds = oldUIds.replace(sUId, "");
             } else {
               a += 1;
             }
           }
 
           if (a == uidArray.length)
             newUIds = oldUIds + "," + uid;
         }
         else
         {
           String sUId = uid + "";
           if (sUId.equals(oldUIds))
             newUIds = "";
           else {
             newUIds = oldUIds + "," + uid;
           }
 
         }
 
       }
 
       newWeChat.setLikeIds(newUIds);
       this.weChatMapper.updateWeChatByPrimaryKey(newWeChat);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<WeChat> selectWeChatByPrimaryKey(Integer wid, String sqlType)
   {
     ToJson json = new ToJson();
     try
     {
       WeChat weChat = this.weChatMapper.selectWeChatByPrimaryKey(wid);
       if ((weChat.getFileName() != null) && (weChat.getFileId() != null)) {
         weChat.setAttachment(GetAttachmentListUtil.returnAttachment(weChat.getFileName(), weChat.getFileId(), sqlType, "email"));
       } else {
         weChat.setFileName("");
         weChat.setFileId("");
         List attachmentList = new ArrayList();
///*     */         {
///*     */           public int size() {
///* 429 */             return 0;
///*     */           }
///*     */ 
///*     */           public boolean isEmpty()
///*     */           {
///* 434 */             return false;
///*     */           }
///*     */ 
///*     */           public boolean contains(Object o)
///*     */           {
///* 439 */             return false;
///*     */           }
///*     */ 
///*     */           public Iterator<Attachment> iterator()
///*     */           {
///* 444 */             return null;
///*     */           }
///*     */ 
///*     */           public Object[] toArray()
///*     */           {
///* 449 */             return new Object[0];
///*     */           }
///*     */ 
///*     */           public <T> T[] toArray(T[] a)
///*     */           {
///* 454 */             return null;
///*     */           }
///*     */ 
///*     */           public boolean add(Attachment attachment)
///*     */           {
///* 459 */             return false;
///*     */           }
///*     */ 
///*     */           public boolean remove(Object o)
///*     */           {
///* 464 */             return false;
///*     */           }
///*     */ 
///*     */           public boolean containsAll(Collection<?> c)
///*     */           {
///* 469 */             return false;
///*     */           }
///*     */ 
///*     */           public boolean addAll(Collection<? extends Attachment> c)
///*     */           {
///* 474 */             return false;
///*     */           }
///*     */ 
///*     */           public boolean addAll(int index, Collection<? extends Attachment> c)
///*     */           {
///* 479 */             return false;
///*     */           }
///*     */ 
///*     */           public boolean removeAll(Collection<?> c)
///*     */           {
///* 484 */             return false;
///*     */           }
///*     */ 
///*     */           public boolean retainAll(Collection<?> c)
///*     */           {
///* 489 */             return false;
///*     */           }
///*     */ 
///*     */           public void clear()
///*     */           {
///*     */           }
///*     */ 
///*     */           public Attachment get(int index)
///*     */           {
///* 499 */             return null;
///*     */           }
///*     */ 
///*     */           public Attachment set(int index, Attachment element)
///*     */           {
///* 504 */             return null;
///*     */           }
///*     */ 
///*     */           public void add(int index, Attachment element)
///*     */           {
///*     */           }
///*     */ 
///*     */           public Attachment remove(int index)
///*     */           {
///* 514 */             return null;
///*     */           }
///*     */ 
///*     */           public int indexOf(Object o)
///*     */           {
///* 519 */             return 0;
///*     */           }
///*     */ 
///*     */           public int lastIndexOf(Object o)
///*     */           {
///* 524 */             return 0;
///*     */           }
///*     */ 
///*     */           public ListIterator<Attachment> listIterator()
///*     */           {
///* 529 */             return null;
///*     */           }
///*     */ 
///*     */           public ListIterator<Attachment> listIterator(int index)
///*     */           {
///* 534 */             return null;
///*     */           }
///*     */ 
///*     */           public List<Attachment> subList(int fromIndex, int toIndex)
///*     */           {
///* 539 */             return null;
///*     */           }
/*     */         };
///* 542 */         weChat.setAttachment(attachmentList);
///*     */       }
       json.setObject(weChat);
       json.setFlag(0);
       json.setMsg("ok");
     }
     catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<WeChat> deleteByPrimaryKey(Integer wid) {
     ToJson json = new ToJson();
     try {
       this.weChatMapper.deleteByPrimaryKey(wid);
       List weChatCommentList = this.weChatCommentMapper.selectWeChatCommentByWID(wid);
       if (weChatCommentList.size() != 0) {
         this.weChatCommentMapper.deleteWeChatCommentByWID(wid);
         List weChatCommentReplyList = this.weChatCommentReplyMapper.selectWeChatCommentReplyByWID(wid);
         if (weChatCommentReplyList.size() != 0) {
           this.weChatCommentReplyMapper.deleteWeChatCommentReplyByWID(wid);
         }
       }
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<LikeUser> getLikeUser(Integer wid) {
     ToJson json = new ToJson();
     try {
       List likeUserList = new ArrayList();
       WeChat weChat = this.weChatMapper.selectWeChatByPrimaryKey(wid);
       String likeIds = weChat.getLikeIds();
 
       int result = likeIds.indexOf(",");
       if ((likeIds != null) && (result != -1)) {
         String[] likeIdsArray = likeIds.split(",");
         for (int i = 0; i < likeIdsArray.length; i++) {
           Users user = this.usersMapper.getUserByUid(Integer.parseInt(likeIdsArray[i]));
           LikeUser likeUser = new LikeUser();
           likeUser.setLikeUId(Integer.parseInt(likeIdsArray[i]));
           likeUser.setLikeUserName(user.getUserName());
           likeUser.setLikeUserrAvatar(user.getAvatar());
           likeUserList.add(likeUser);
         }
       } else if ((likeIds != "") && (result == -1)) {
         Users user = this.usersMapper.getUserByUid(Integer.parseInt(likeIds));
         LikeUser likeUser = new LikeUser();
         likeUser.setLikeUId(Integer.parseInt(likeIds));
         likeUser.setLikeUserName(user.getUserName());
         likeUser.setLikeUserrAvatar(user.getAvatar());
         likeUserList.add(likeUser);
       }
 
       json.setObj(likeUserList);
       json.setFlag(0);
       json.setMsg("ok");
     }
     catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 }

