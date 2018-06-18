 package com.myoa.service.im;
 
 import com.myoa.controller.im.Model.Files;
import com.myoa.controller.im.Model.ImMessageModel;
import com.myoa.controller.im.Model.ImRoomModel;
import com.myoa.controller.im.Model.Status;
import com.myoa.dao.common.SysParaMapper;
import com.myoa.dao.enclosure.AttachmentMapper;
import com.myoa.dao.im.ImChatDataMapper;
import com.myoa.dao.im.ImMessageMapper;
import com.myoa.dao.im.ImRoomMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.im.ImChatData;
import com.myoa.model.im.ImMessage;
import com.myoa.model.im.ImRoom;
import com.myoa.model.users.Users;
import com.myoa.service.users.UsersService;
import com.myoa.util.Constant;
import com.myoa.util.FileUploadUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.CheckCallBack;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.ipUtil.MachineCode;
import com.myoa.util.netdisk.ReadFile;
import com.myoa.util.page.PageParams;
import com.tencent.xinge.ClickAction;
 import com.tencent.xinge.Message;
 import com.tencent.xinge.MessageIOS;
 import com.tencent.xinge.Style;
 import com.tencent.xinge.XingeApp;
 import java.awt.image.BufferedImage;
 import java.io.File;
 import java.io.FileInputStream;
 import java.io.FileNotFoundException;
 import java.io.IOException;
 import java.io.PrintStream;
 import java.math.BigDecimal;
 import java.nio.channels.FileChannel;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.Calendar;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.HashSet;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Map;
 import java.util.ResourceBundle;
 import java.util.Set;
 import java.util.UUID;
 import javax.annotation.Resource;
 import javax.imageio.ImageIO;
 import javax.servlet.ServletContext;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
 import javax.sound.sampled.LineUnavailableException;
 import javax.sound.sampled.UnsupportedAudioFileException;
 import org.json.JSONObject;
 import org.springframework.beans.factory.annotation.Value;
 import org.springframework.mock.web.MockMultipartFile;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
 
 @Service
 public class ImChatDataService
 {
   private final String one = "1";
 
   @Resource
   ImMessageMapper messageDao;
 
   @Resource
   ImChatDataMapper chatDataDao;
 
   @Resource
   ImRoomMapper roomDao;
 
   @Resource
   ImEnclosureService attachService;
 
   @Resource
   AttachmentMapper attachmentMapper;
 
   @Resource
   UsersService usersService;
 
   @Resource
   SysParaMapper sysParaMapper;
 
   @Resource
   UsersMapper usersMapper;
 
   @Value("${xg_push_msg_android_key}")
   String androidKey;
 
   @Value("${xg_push_msg_android_sercetkey}")
   String androidSercetKey;
 
   @Value("${xg_push_msg_ios_key}")
   String iosKey;
 
   @Value("${xg_push_msg_ios_sercetkey}")
   String iosSercetKey;
 
   @Transactional(readOnly=false)
   public Object putMessageInfo(final MultipartFile file,final HttpServletRequest request,final Integer flag,final String from_uid,final String to_uid,final String of_from,final String of_to,final String content,final String type,final String time,final String uuid,final String msg_type,final String voice_time, Long atime) { 
	           Status s = new Status();
     Files file1 = new Files();
 
     String fileID = "";
     String attachName = "";
     String lastThumbnailUrl = "";
     String lastTeeurlUrl = "";
     try
     {
       String checkResult = StringUtils.checkNullUtils(new CheckCallBack()
       {
         public boolean isNull(Object obj)
         {
           if ((obj instanceof String)) {
             String a = (String)obj;
             if ((a == null) || ("".equals(a)) || (a.length() == 0))
             {
               return true;
             }
           }
           if ((obj instanceof Integer)) {
             Integer a = (Integer)obj;
             if (a == null)
               return true;
           }
           return false;
         }
       }
       , new Object[] { flag, "flag不能为空", from_uid, "from_uid不能为空", to_uid, "to_uid不能为空", of_from, "of_from不能为空", of_to, "of_to不能为空", type, "type不能为空", time, "time不能为空" });
 
       if (checkResult != null) {
         s.setStatus("error");
         return s;
       }
       final List<Users> users = new ArrayList<Users>();
       if ("0".equals(msg_type)) {
         Users user = this.usersService.getByUid(Integer.parseInt(to_uid));
         if ((user == null) || (user.getUid() == null)) {
           s.setStatus("nopeople");
           return s;
         }
         Map paramss = new HashMap();
         paramss.put("fromUid", from_uid);
         paramss.put("toUid", to_uid);
 
         ImChatData imChatData = this.chatDataDao.getDataSingleByUid(paramss);
 
         if ((imChatData != null) && (!StringUtils.checkNull(imChatData.getMsg_free()).booleanValue())) {
           String[] tempUids = imChatData.getMsg_free().split(",");
           if ((tempUids != null) && (tempUids.length > 0)) {
             int count = 0;
             for (String toUiddd : tempUids) {
               if (to_uid.equals(toUiddd)) {
                 count++;
                 break;
               }
             }
             if (count == 0)
               users.add(user);
           }
         }
         else {
           System.out.println("0==||===========>消息打扰");
           users.add(user);
         }
       }
       else {
         Map map = new HashMap();
         map.put("roomOf", to_uid);
         ImRoom room = this.roomDao.getRoomByRoomOf(map);
 
         ImChatData imChatData = this.chatDataDao.getGroupByToUid(to_uid);
         List<Users> tempUser = new ArrayList();
         if ((imChatData != null) && (!StringUtils.checkNull(imChatData.getMsg_free()).booleanValue())) {
           String[] tempUids = imChatData.getMsg_free().split(",");
           tempUser = this.usersMapper.getUsersByUids(tempUids);
         }
         if (!StringUtils.checkNull(room.getRmemberUid()).booleanValue()) {
           String[] uids = room.getRmemberUid().split(",");
           final List<Users> userss = this.usersMapper.getUsersByUids(uids);
           if (tempUser.size() > 0) {
             for (Users u1 : userss) {
               int count = 0;
               for (Users u2 : tempUser) {
                 if (u1.getUid().equals(u2.getUid())) {
                   count++;
                   break;
                 }
               }
               if (count == 0)
                 users.add(u1);
             }
           }
           else
             users.addAll(userss);
         }
         else
         {
           s.setStatus("nopeople");
           return s;
         }
       }
       ImMessage record = new ImMessage();
       record.setFromUid(from_uid);
       record.setType(type);
       record.setOfTo(of_to);
       record.setOfFrom(of_from);
       record.setToUid(to_uid);
       record.setUuid(uuid);
 
       Attachment attach = null;
       switch (flag.intValue()) {
       case 1:
         record.setContent(content);
         break;
       case 3:
         attach = this.attachService.upload(file, type, "im", Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse"), true);
 
         if (attach == null) {
           s.setStatus("error");
           return s;
         }
         record.setFileId(String.valueOf(attach.getAid()));
         record.setFileName(attach.getYm());
 
         fileID = String.valueOf(attach.getAid());
 
         attachName = attach.getYm();
         String fileString = attach.getUrl();
         String path = attach.getPath();
 
         if ("img".equals(type)) {
           File picture = new File(fileString);
           String deskFileName = UUID.randomUUID().toString() + ".png";
           String deskUlr = path + System.getProperty("file.separator") + deskFileName;
           FileUploadUtil.saveMinPhoto(fileString, deskUlr, 300.0D, 1.0D);
           File thmpicture = new File(deskUlr);
           if (thmpicture.exists()) {
             FileInputStream thmfis = new FileInputStream(thmpicture);
             MultipartFile multipartFile = new MockMultipartFile(deskFileName, deskFileName, "img/txt", thmfis);
             Attachment attachss = this.attachService.upload(multipartFile, type, "im", Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse"), true);
 
             if (attachss != null) {
               file1.setThumbnail_url(attachss.getAttUrl());
               record.setThumbnailUrl(attachss.getAttUrl());
               File thmpicture11 = new File(attachss.getUrl());
               if (thmpicture11.exists()) {
                 FileInputStream thmfiss = new FileInputStream(thmpicture11);
                 BufferedImage thmsourceImgs = ImageIO.read(thmfiss);
                 file1.setThumbnail_width(String.valueOf(thmsourceImgs.getHeight()));
                 file1.setThumbnail_height(String.valueOf(thmsourceImgs.getWidth()));
               }
             }
             thmfis.close();
           }
           FileInputStream fis = new FileInputStream(picture);
 
           long size = fis.getChannel().size();
           BufferedImage sourceImg = ImageIO.read(fis);
 
           file1.setFile_name(attach.getAttachName());
           file1.setFile_url(attach.getAttUrl());
           file1.setFile_size(ReadFile.FormetFileSize(size));
           file1.setFile_width(String.valueOf(sourceImg.getWidth()));
           file1.setFile_height(String.valueOf(sourceImg.getHeight()));
           fis.close();
 
           lastThumbnailUrl = attach.getAttUrl();
           record.setRealUrl(attach.getAttUrl());
         }
 
         if ("voice".equals(type))
         {
           file1.setFile_url(attach.getAttUrl());
           file1.setVoice_time(voice_time);
 
           record.setThumbnailUrl(voice_time);
           lastThumbnailUrl = voice_time;
         }
 
         if (!"file".equals(type)) break;
         File picture = new File(fileString);
         FileInputStream fis = new FileInputStream(picture);
         long size = fis.getChannel().size();
         file1.setFile_size(ReadFile.FormetFileSize(size));
         file1.setFile_url(attach.getAttUrl());
         file1.setFile_name(attach.getAttachName());
         file1.setFile_type(attach.getAttachName().substring(attach.getAttachName().lastIndexOf(".") + 1));
         record.setThumbnailUrl(attach.getAttUrl());
 
         break;
       }
 
       record.setStime(time);
       record.setMsgType(msg_type);
       if (atime == null) {
         atime = Long.valueOf(new Date().getTime());
       }
 
       record.setAtime(String.valueOf(atime));
       int meResult = this.messageDao.save(record);
       Map map = new HashMap();
       map.put("fromUid", from_uid);
       map.put("toUid", to_uid);
 
       ImChatData chatModel = new ImChatData();
       chatModel.setFromUid(from_uid);
       chatModel.setToUid(to_uid);
       chatModel.setOfFrom(of_from);
       chatModel.setOfTo(of_to);
       chatModel.setLastTime(time);
       chatModel.setLastAtime(String.valueOf(atime));
       if ("img".equals(type))
       {
         chatModel.setLastContent("");
 
         chatModel.setLastFileId(fileID);
         chatModel.setLastFileName(attachName);
         chatModel.setLastThumbnailUrl(lastThumbnailUrl);
       } else if ("voice".equals(type))
       {
         chatModel.setLastContent("");
 
         chatModel.setLastFileId(fileID);
         chatModel.setLastFileName(attachName);
         chatModel.setLastThumbnailUrl(lastThumbnailUrl);
       } else if ("file".equals(type))
       {
         chatModel.setLastContent("");
 
         chatModel.setLastFileId(fileID);
         chatModel.setLastFileName(attachName);
         chatModel.setLastThumbnailUrl(lastThumbnailUrl);
       } else {
         chatModel.setLastContent(content);
 
         chatModel.setLastFileId(fileID);
         chatModel.setLastFileName(attachName);
         chatModel.setLastThumbnailUrl(lastThumbnailUrl);
       }
       chatModel.setType(type);
       chatModel.setUuid(uuid);
       chatModel.setMsgType(msg_type);
       int chResult = 0;
       if ("1".equals(msg_type)) {
         String listId = this.chatDataDao.getDatagroupObject(chatModel.getToUid());
         if (StringUtils.checkNull(listId).booleanValue()) {
           chatModel.setUidIgnore("");
           chResult = this.chatDataDao.saveChat(chatModel);
         } else {
           chatModel.setListId(listId);
           chatModel.setUidIgnore("");
           chResult = this.chatDataDao.updateChatlist(chatModel);
         }
       } else {
         int i = this.chatDataDao.getCountSingleObject(map);
         if (i == 0) {
           chatModel.setUidIgnore("");
           chResult = this.chatDataDao.saveChat(chatModel);
         } else {
           List listId = this.chatDataDao.getDataSingleObject(map);
           chatModel.setListId((String)listId.get(0));
           chatModel.setUidIgnore("");
           chResult = this.chatDataDao.updateChatlist(chatModel);
         }
       }
       final String sqlType = (String)request.getSession().getAttribute("loginDateSouse");
       final String jixiema = (String)MachineCode.get16CharMacs().get(0);
       final Attachment finalAttach = attach;
       final Users users1 = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       Runnable runnable = new Runnable()
       {
         public void run() {
           try {
             String userName = users1.getUserName();
             String con = users1.getUserName() + ":" + content;
             if (!"0".equals(msg_type)) {
               Map paramMap = new HashMap();
               paramMap.put("uid", users1.getUid());
               paramMap.put("roomOf", to_uid);
               ImRoom room = ImChatDataService.this.roomDao.selRoomByRoomOfUid(paramMap);
               userName = room.getRnamr();
             }
             for (Users user : users)
               if (!users1.getUserId().equals(user.getUserId())) {
                 String account = jixiema + user.getUserId() + sqlType;
                 XingeApp pushIos = new XingeApp(Long.parseLong(ImChatDataService.this.iosKey), ImChatDataService.this.iosSercetKey);
                 XingeApp pushAndroid = new XingeApp(Long.parseLong(ImChatDataService.this.androidKey), ImChatDataService.this.androidSercetKey);
                 JSONObject ret3;
                 if (flag.intValue() == 1) {
                   ClickAction clickAction = new ClickAction();
                   clickAction.setActionType(1);
                   clickAction.setActivity("123");
                   Style style = new Style(0, 0, 0, 1, 1, 1, 0, 1);
                   Message mess = new Message();
                   mess.setType(1);
                   mess.setStyle(style);
                   mess.setTitle(userName);
                   mess.setContent(con);
                   mess.setAction(clickAction);
                   JSONObject ret = pushAndroid.pushSingleAccount(0, account, mess);
 
                   JSONObject contentTest = new JSONObject();
                   JSONObject obj = new JSONObject();
                   JSONObject aps = new JSONObject();
                   contentTest.put("title", userName);
                   contentTest.put("body", con);
                   aps.put("badge", 1);
                   aps.put("alert", contentTest);
                   obj.put("aps", aps);
                   MessageIOS messageIOS = new MessageIOS();
                   messageIOS.setRaw(obj.toString());
                   ret3 = pushIos.pushSingleAccount(0, account, messageIOS, 1);
                 } else if (flag.intValue() == 3) {
                   String confile = "";
                   if ("img".equals(type))
                     confile = users1.getUserName() + ":[图片]";
                   else {
                     confile = users1.getUserName() + ":[" + finalAttach.getAttachName() + "]";
                   }
                   Style style = new Style(0, 0, 0, 1, -1, 1, 0, 1);
                   ClickAction clickAction = new ClickAction();
                   clickAction.setActionType(1);
                   clickAction.setActivity("123");
                   Message mess = new Message();
                   mess.setType(1);
                   mess.setStyle(style);
                   mess.setTitle(userName);
                   mess.setContent(confile);
                   mess.setAction(clickAction);
                   JSONObject ret = pushAndroid.pushSingleAccount(0, account, mess);
                   System.out.println("0==||===========>ret" + ret);
 
                   JSONObject contentTest = new JSONObject();
                   JSONObject obj = new JSONObject();
                   JSONObject aps = new JSONObject();
                   contentTest.put("title", userName);
                   contentTest.put("body", confile);
                   aps.put("badge", 1);
                   aps.put("alert", contentTest);
                   obj.put("aps", aps);
                   MessageIOS messageIOS = new MessageIOS();
                   messageIOS.setRaw(obj.toString());
                   ret3 = pushIos.pushSingleAccount(0, account, messageIOS, 1);
                 }
               }
           }
           catch (Exception e)
           {
             String userName;
             String con;
             JSONObject ret3;
             e.printStackTrace();
           }
         }
       };
       runnable.run();
       if (chResult == 1)
         s.setStatus("ok");
       else {
         s.setStatus("error");
       }
       if (flag.intValue() == 3) {
         file1.setStatus("ok");
         return file1;
       }
     } catch (Exception e) {
       e.printStackTrace();
       s.setStatus("error");
     }
     return s;
   }
 
   @Transactional(readOnly=false)
   public List<ImMessageModel> getImChatList(HttpServletRequest request, String ofFrom)
     throws FileNotFoundException, IOException, LineUnavailableException, UnsupportedAudioFileException
   {
     List datas = null;
 
     String company = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
 
     ResourceBundle rb = ResourceBundle.getBundle("upload");
 
     String osName = System.getProperty("os.name");
     StringBuffer sb = new StringBuffer();
     if (osName.toLowerCase().startsWith("win"))
       sb = sb.append(rb.getString("upload.win"));
     else {
       sb = sb.append(rb.getString("upload.linux"));
     }
 
     List list = new ArrayList();
     list.add(ofFrom);
 
     Map map = new HashMap();
     Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     map.put("ofFrom", ofFrom);
     map.put("uid", user.getUid());
     datas = this.chatDataDao.getChatListByFrom(map);
     List icm = new ArrayList();
     List iclmList = new ArrayList();
     for (int i = 0; i < datas.size(); i++) {
       ImChatData icmSingle = (ImChatData)datas.get(i);
       List imlist = new ArrayList();
       if (icmSingle.getMsgType().equals("1")) {
         Map paramMap = new HashMap();
         paramMap.put("uid", user.getUid());
         paramMap.put("roomOf", icmSingle.getToUid());
         ImRoom room = this.roomDao.selRoomByRoomOfUid(paramMap);
         if (room == null) {
           datas.remove(i);
           i--;
           continue;
         }
         icmSingle.setToUserName(room.getRnamr());
       }
       else {
         Users toUser = this.usersMapper.getUserByUid(Integer.valueOf(icmSingle.getToUid()).intValue());
         if (toUser != null) {
           icmSingle.setToUserName(toUser.getUserName());
         }
       }
 
       Map mapLastMessage = new HashMap();
       mapLastMessage.put("uuid", icmSingle.getUuid());
       ImMessage im = this.messageDao.getMessageByLast(mapLastMessage);
       if (im != null) {
         ImMessageModel iclm = new ImMessageModel();
         if (icmSingle.getMsgType().equals("1")) {
           iclm.setPhoto("im/groupchat.png");
           iclm.setGroupMessage(this.messageDao.getAllGroupMessage(icmSingle.getOfTo()));
         }
         iclm.setContent(icmSingle.getLastContent());
         iclm.setFrom_uid(icmSingle.getFromUid());
         iclm.setTo_uid(icmSingle.getToUid());
         iclm.setOf_from(icmSingle.getOfFrom());
         iclm.setOf_to(icmSingle.getOfTo());
         iclm.setTime(icmSingle.getLastTime());
         iclm.setUuid(im.getUuid());
         iclm.setType(icmSingle.getType());
         iclm.setList_id(icmSingle.getListId());
         iclm.setMsg_type(icmSingle.getMsgType());
         iclm.setFormUserName(icmSingle.getFromUserName());
         iclm.setToUserName(icmSingle.getToUserName());
         String severpath = request.getRealPath("");
 
         Files file1 = new Files();
         int fileid = -1;
         if (!StringUtils.checkNull(im.getFileId()).booleanValue()) {
           fileid = Integer.parseInt(im.getFileId());
         }
         Attachment tee = this.attachmentMapper.selectByPrimaryKey(Integer.valueOf(fileid));
         if (tee != null) {
           try {
             String path = sb.toString() + System.getProperty("file.separator") + "attach" + System.getProperty("file.separator") + company + System.getProperty("file.separator") + "im" + System.getProperty("file.separator") + tee.getYm() + System.getProperty("file.separator") + tee.getAttachId() + "." + tee.getAttachName();
 
             String fileStr = "AID=" + tee.getAid() + "&" + "MODULE=" + "im" + "&" + "COMPANY=" + company + "&" + "YM=" + tee.getYm() + "&" + "ATTACHMENT_ID=" + tee.getAttachId() + "&" + "ATTACHMENT_NAME=" + tee.getAttachName();
 
             if ("img".equals(im.getType())) {
               String port = String.valueOf(request.getServerPort());
 
               File picture = new File(path);
               File thmpicture = new File(path);
               FileInputStream fis = new FileInputStream(picture);
               FileInputStream thmfis = new FileInputStream(thmpicture);
 
               long size = fis.getChannel().size();
               long thmsize = thmfis.getChannel().size();
               BufferedImage sourceImg = ImageIO.read(fis);
               BufferedImage thmsourceImg = ImageIO.read(thmfis);
               file1.setFile_url(fileStr);
               double size_k = size / 1024L;
               BigDecimal l = new BigDecimal(Double.toString(size_k));
               double res = l.setScale(2, 4).doubleValue();
               long ress = 0L;
               if ((size_k < 1024.0D) && (size_k > 0.0D)) {
                 if (Math.round(res) - res == 0.0D) {
                   ress = (long)res;
                 }
                 file1.setFile_size(String.valueOf(ress) + "KB");
               } else if (size_k >= 1024.0D) {
                 double size_m = size_k / 1024.0D;
                 BigDecimal lm = new BigDecimal(Double.toString(size_k));
                 double res_m = l.setScale(2, 4).doubleValue();
                 long resss = 0L;
                 if (Math.round(res_m) - res_m == 0.0D) {
                   resss = (long) res_m;
                 }
                 file1.setFile_size(String.valueOf(resss) + "MB");
               }
               file1.setFile_width(String.valueOf(sourceImg.getWidth()));
               file1.setFile_height(String.valueOf(sourceImg.getHeight()));
               file1.setThumbnail_url(fileStr);
               if ((size_k < 1024.0D) && (size_k > 0.0D)) {
                 if (Math.round(res) - res == 0.0D) {
                   ress = (long)res;
                 }
                 file1.setThumbnail_size(String.valueOf(ress) + "KB");
               } else if (size_k >= 1024.0D) {
                 double size_m = size_k / 1024.0D;
                 BigDecimal lm = new BigDecimal(Double.toString(size_k));
                 double res_m = l.setScale(2, 4).doubleValue();
                 long resss = 0L;
                 if (Math.round(res_m) - res_m == 0.0D) {
                   resss = (long)res_m;
                 }
                 file1.setThumbnail_size(String.valueOf(resss) + "MB");
               }
               file1.setThumbnail_width(String.valueOf(thmsourceImg.getHeight()));
               file1.setThumbnail_height(String.valueOf(thmsourceImg.getWidth()));
             }
 
             if ("voice".equals(im.getType())) {
               String port = String.valueOf(request.getServerPort());
 
               file1.setFile_url(fileStr);
               file1.setVoice_time(im.getThumbnailUrl());
             }
 
             if ("file".equals(im.getType()))
             {
               String port = String.valueOf(request.getServerPort());
 
               file1.setFile_url(fileStr);
               file1.setFile_name(im.getFileName());
               file1.setFile_type(tee.getAttachName().substring(tee.getAttachName().lastIndexOf(".") + 1));
               File picture = new File(path);
               FileInputStream fis = new FileInputStream(picture);
               long size = fis.getChannel().size();
               double size_k = size / 1024L;
               BigDecimal l = new BigDecimal(Double.toString(size_k));
               double res = l.setScale(2, 4).doubleValue();
               long ress = 0L;
               if ((size_k < 1024.0D) && (size_k > 0.0D)) {
                 if (Math.round(res) - res == 0.0D) {
                   ress = (long)res;
                 }
                 file1.setFile_size(String.valueOf(ress) + "KB");
               } else if (size_k >= 1024.0D) {
                 double size_m = size_k / 1024.0D;
                 BigDecimal lm = new BigDecimal(Double.toString(size_k));
                 double res_m = l.setScale(2, 4).doubleValue();
                 long resss = 0L;
                 if (Math.round(res_m) - res_m == 0.0D) {
                   resss = (long)res_m;
                 }
                 file1.setFile_size(String.valueOf(resss) + "MB");
               }
             }
           } catch (Exception e) {
             e.printStackTrace();
           }
         }
         iclm.setFile(file1);
         iclmList.add(iclm);
       }
     }
 
     return iclmList;
   }
 
   @Transactional(readOnly=false)
   public List<ImMessageModel> getImChatList1(HttpServletRequest request, String ofFrom) throws FileNotFoundException, IOException, LineUnavailableException, UnsupportedAudioFileException {
     List datas = null;
 
     String company = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
 
     String sqlType = (String)request.getSession().getAttribute("loginDateSouse");
 
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     int str = users.getUid().intValue();
     ImMessageModel messageModel = new ImMessageModel();
     messageModel.setSqlType(sqlType);
     messageModel.setStr(str);
     ResourceBundle rb = ResourceBundle.getBundle("upload");
 
     String osName = System.getProperty("os.name");
     StringBuffer sb = new StringBuffer();
     if (osName.toLowerCase().startsWith("win"))
       sb = sb.append(rb.getString("upload.win"));
     else {
       sb = sb.append(rb.getString("upload.linux"));
     }
 
     List list = new ArrayList();
     list.add(ofFrom);
 
     Map map = new HashMap();
     map.put("ofFrom", ofFrom);
     datas = this.chatDataDao.getChatList(map);
     List icm = new ArrayList();
     List iclmList = new ArrayList();
     for (int i = 0; i < datas.size(); i++) {
       ImChatData icmSingle = (ImChatData)datas.get(i);
       List imlist = new ArrayList();
 
       Map mapLastMessage = new HashMap();
       mapLastMessage.put("uuid", icmSingle.getUuid());
       ImMessage im = this.messageDao.getLastMessage(mapLastMessage);
       ImMessageModel iclm = new ImMessageModel();
       iclm.setContent(icmSingle.getLastContent());
       iclm.setFrom_uid(icmSingle.getFromUid());
       iclm.setTo_uid(icmSingle.getToUid());
       iclm.setOf_from(icmSingle.getOfFrom());
       iclm.setOf_to(icmSingle.getOfTo());
       iclm.setTime(icmSingle.getLastTime());
       if (im != null) {
         iclm.setUuid(im.getUuid());
       }
       iclm.setType(icmSingle.getType());
       iclm.setList_id(icmSingle.getListId());
       iclm.setMsg_type(icmSingle.getMsgType());
       iclm.setFormUserName(icmSingle.getFromUserName());
       iclm.setToUserName(icmSingle.getToUserName());
       iclm.setSqlType(messageModel.getSqlType());
       iclm.setStr(messageModel.getStr());
       String severpath = request.getRealPath("");
 
       Files file1 = new Files();
       int fileid = -1;
       if ((im != null) && (!StringUtils.checkNull(im.getFileId()).booleanValue())) {
         fileid = Integer.parseInt(im.getFileId());
       }
       Attachment tee = this.attachmentMapper.selectByPrimaryKey(Integer.valueOf(fileid));
       if (tee != null) {
         String path = sb.toString() + System.getProperty("file.separator") + "attach" + System.getProperty("file.separator") + company + System.getProperty("file.separator") + "im" + System.getProperty("file.separator") + tee.getYm() + System.getProperty("file.separator") + tee.getAttachId() + "." + tee.getAttachName();
 
         String fileStr = "AID=" + tee.getAid() + "&" + "MODULE=" + "im" + "&" + "COMPANY=" + company + "&" + "YM=" + tee.getYm() + "&" + "ATTACHMENT_ID=" + tee.getAttachId() + "&" + "ATTACHMENT_NAME=" + tee.getAttachName();
 
         if (im != null) {
           if ("img".equals(im.getType()))
           {
             String port = String.valueOf(request.getServerPort());
 
             File picture = new File(path);
             File thmpicture = new File(path);
             FileInputStream fis = new FileInputStream(picture);
             FileInputStream thmfis = new FileInputStream(thmpicture);
 
             long size = fis.getChannel().size();
             long thmsize = thmfis.getChannel().size();
             BufferedImage sourceImg = ImageIO.read(fis);
             BufferedImage thmsourceImg = ImageIO.read(thmfis);
             file1.setFile_url(fileStr);
             double size_k = size / 1024L;
             BigDecimal l = new BigDecimal(Double.toString(size_k));
             double res = l.setScale(2, 4).doubleValue();
             long ress = 0L;
             if ((size_k < 1024.0D) && (size_k > 0.0D)) {
               if (Math.round(res) - res == 0.0D) {
                 ress = (long)res;
               }
               file1.setFile_size(String.valueOf(ress) + "KB");
             } else if (size_k >= 1024.0D) {
               double size_m = size_k / 1024.0D;
               BigDecimal lm = new BigDecimal(Double.toString(size_k));
               double res_m = l.setScale(2, 4).doubleValue();
               long resss = 0L;
               if (Math.round(res_m) - res_m == 0.0D) {
                 resss = (long)res_m;
               }
               file1.setFile_size(String.valueOf(resss) + "MB");
             }
             file1.setFile_width(String.valueOf(sourceImg.getWidth()));
             file1.setFile_height(String.valueOf(sourceImg.getHeight()));
             file1.setThumbnail_url(fileStr);
             if ((size_k < 1024.0D) && (size_k > 0.0D)) {
               if (Math.round(res) - res == 0.0D) {
                 ress = (long)res;
               }
               file1.setThumbnail_size(String.valueOf(ress) + "KB");
             } else if (size_k >= 1024.0D) {
               double size_m = size_k / 1024.0D;
               BigDecimal lm = new BigDecimal(Double.toString(size_k));
               double res_m = l.setScale(2, 4).doubleValue();
               long resss = 0L;
               if (Math.round(res_m) - res_m == 0.0D) {
                 resss = (long)res_m;
               }
               file1.setThumbnail_size(String.valueOf(resss) + "MB");
             }
             file1.setThumbnail_width(String.valueOf(thmsourceImg.getHeight()));
             file1.setThumbnail_height(String.valueOf(thmsourceImg.getWidth()));
           }
 
           if ("voice".equals(im.getType()))
           {
             String port = String.valueOf(request.getServerPort());
 
             file1.setFile_url(fileStr);
             file1.setVoice_time(im.getThumbnailUrl());
           }
 
           if ("file".equals(im.getType()))
           {
             String port = String.valueOf(request.getServerPort());
 
             file1.setFile_url(fileStr);
             file1.setFile_name(im.getFileName());
             file1.setFile_type(tee.getAttachName().substring(tee.getAttachName().lastIndexOf(".") + 1));
             File picture = new File(path);
             FileInputStream fis = new FileInputStream(picture);
             long size = fis.getChannel().size();
             double size_k = size / 1024L;
             BigDecimal l = new BigDecimal(Double.toString(size_k));
             double res = l.setScale(2, 4).doubleValue();
             long ress = 0L;
             if ((size_k < 1024.0D) && (size_k > 0.0D)) {
               if (Math.round(res) - res == 0.0D) {
                 ress = (long)res;
               }
               file1.setFile_size(String.valueOf(ress) + "KB");
             } else if (size_k >= 1024.0D) {
               double size_m = size_k / 1024.0D;
               BigDecimal lm = new BigDecimal(Double.toString(size_k));
               double res_m = l.setScale(2, 4).doubleValue();
               long resss = 0L;
               if (Math.round(res_m) - res_m == 0.0D) {
                 resss = (long)res_m;
               }
               file1.setFile_size(String.valueOf(resss) + "MB");
             }
           }
         }
       }
       iclm.setFile(file1);
       iclmList.add(iclm);
     }
 
     return iclmList;
   }
 
   @Transactional(readOnly=false)
   public ToJson<ImMessage> rollBackMessage(String uuid)
   {
     ToJson json = new ToJson(1, "error");
     if (StringUtils.checkNull(uuid).booleanValue()) {
       json.setMsg("缺少必要参数uuid");
       return json;
     }
     try {
       Map map = new HashMap();
       map.put("uuid", uuid);
       map.put("type", "withdraw");
       int count = this.messageDao.upMessageByType(map);
       if (count > 0) {
         json.setFlag(0);
         json.setMsg("ok");
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional(readOnly=false)
   public ToJson<ImMessageModel> showMessageList(HttpServletRequest request, String from_uid, String to_uid, String last_time, String msg_type, Integer pagenum)
     throws FileNotFoundException, IOException, LineUnavailableException, UnsupportedAudioFileException
   {
     ToJson toJson = new ToJson();
     List list = new ArrayList();
 
     String checkResult = StringUtils.checkNullUtils(new CheckCallBack()
     {
       public boolean isNull(Object obj)
       {
         if ((obj instanceof String)) {
           String a = (String)obj;
           if ((a == null) || ("".equals(a)) || (a.length() == 0))
           {
             return true;
           }
         }
         if ((obj instanceof Integer)) {
           Integer a = (Integer)obj;
           if (a == null)
             return true;
         }
         return false;
       }
     }
     , new Object[] { to_uid, "to_uid不能为空", last_time, "last_time不能为空" });
 
     if (checkResult != null) {
       toJson.setMsg(checkResult);
       return toJson;
     }
     List<ImMessage> datas = null;
     Map map = new HashMap();
     map.put("fromId", from_uid);
     map.put("lastTime", Double.valueOf(Double.parseDouble(last_time)));
     map.put("toId", to_uid);
 
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(true));
     pageParams.setPage(pagenum);
     pageParams.setPageSize(Integer.valueOf(30));
     map.put("page", pageParams);
     if ("0".equals(msg_type))
       datas = this.messageDao.selectMessageByPage(map);
     else {
       datas = this.messageDao.getGroupMessage(map);
     }
 
     String company = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
 
     ResourceBundle rb = ResourceBundle.getBundle("upload");
 
     String osName = System.getProperty("os.name");
     StringBuffer sb = new StringBuffer();
     if (osName.toLowerCase().startsWith("win"))
       sb = sb.append(rb.getString("upload.win"));
     else {
       sb = sb.append(rb.getString("upload.linux"));
     }
     for (ImMessage im : datas) {
       Files file1 = new Files();
       Attachment tee = null;
       if ((im.getFileId() != null) && (!"".equals(im.getFileId()))) {
         tee = this.attachmentMapper.selectByPrimaryKey(Integer.valueOf(Integer.parseInt(im.getFileId())));
       }
       if (tee != null) {
         String path = sb.toString() + System.getProperty("file.separator") + "attach" + System.getProperty("file.separator") + company + System.getProperty("file.separator") + "im" + System.getProperty("file.separator") + tee.getYm() + System.getProperty("file.separator") + tee.getAttachId() + "." + tee.getAttachName();
 
         String fileStr = "AID=" + tee.getAid() + "&" + "MODULE=" + "im" + "&" + "COMPANY=" + company + "&" + "YM=" + tee.getYm() + "&" + "ATTACHMENT_ID=" + tee.getAttachId() + "&" + "ATTACHMENT_NAME=" + tee.getAttachName();
         String size1 = im.getThumbnailUrl();
         String size = "";
         String[] aStrings = size1.split("&");
         for (int i = 0; i < aStrings.length; i++) {
           if (aStrings[i].contains("FILESIZE")) {
             String[] s = aStrings[i].split("=");
             size = s[1];
             break;
           }
         }
         if ("img".equals(im.getType())) {
           try {
             String port = String.valueOf(request.getServerPort());
             File picture = new File(path);
             File thmpicture = new File(path);
             FileInputStream fis = new FileInputStream(picture);
             FileInputStream thmfis = new FileInputStream(thmpicture);
 
             long thmsize = thmfis.getChannel().size();
             BufferedImage sourceImg = ImageIO.read(fis);
             BufferedImage thmsourceImg = ImageIO.read(thmfis);
             file1.setFile_url(fileStr);
             file1.setFile_size(size);
             file1.setFile_name(tee.getAttachName());
             file1.setFile_width(String.valueOf(sourceImg.getWidth()));
             file1.setFile_height(String.valueOf(sourceImg.getHeight()));
             file1.setThumbnail_url(fileStr);
             file1.setThumbnail_size(size);
             file1.setThumbnail_width(String.valueOf(thmsourceImg.getHeight()));
             file1.setThumbnail_height(String.valueOf(thmsourceImg.getWidth()));
             fis.close();
           }
           catch (Exception e)
           {
           }
 
         }
 
         if ("voice".equals(im.getType()))
         {
           String port = String.valueOf(request.getServerPort());
           file1.setFile_url(fileStr);
           file1.setVoice_time(im.getThumbnailUrl());
         }
 
         if ("file".equals(im.getType())) {
           try {
             String port = String.valueOf(request.getServerPort());
             file1.setFile_url(fileStr);
             file1.setFile_name(tee.getAttachName());
             file1.setFile_type(tee.getAttachName().substring(tee.getAttachName().lastIndexOf(".") + 1));
             File picture = new File(path);
             FileInputStream fis = new FileInputStream(picture);
             file1.setFile_size(size);
             fis.close();
           }
           catch (Exception e)
           {
           }
         }
       }
 
       String fromUserName = this.usersService.findUserByuid(Integer.parseInt(im.getFromUid())).getUserName();
       String toUserName = "";
       if ("0".equals(msg_type)) {
         toUserName = this.usersService.findUserByuid(Integer.parseInt(im.getToUid())).getUserName();
       } else {
         Map room = new HashMap();
         room.put("roomOf", im.getToUid());
         if (this.roomDao.getRoomByRoomOf(room) != null) {
           toUserName = this.roomDao.getRoomByRoomOf(room).getRnamr();
         }
       }
       ImMessageModel imm = new ImMessageModel(im.getFromUid(), im.getToUid(), im.getOfFrom(), im.getContent(), im.getOfTo(), im.getUuid(), im.getType(), file1, im.getStime());
 
       imm.setFormUserName(fromUserName);
       imm.setToUserName(toUserName);
       imm.setMsg_type(im.getMsgType());
       list.add(imm);
     }
 
     toJson.setTotleNum(pageParams.getTotal());
     toJson.setFlag(0);
     toJson.setObj(list);
     toJson.setMsg("ok");
 
     return toJson;
   }
 
   @Transactional(readOnly=false)
   public ToJson<ImMessageModel> showMessageListRiLeGou(HttpServletRequest request, String from_uid, String to_uid, String last_time, String msg_type, Integer pagenum, String type, String fileName, String searchMsg) throws FileNotFoundException, IOException, LineUnavailableException, UnsupportedAudioFileException {
     ToJson toJson = new ToJson();
     List list = new ArrayList();
     String checkResult = StringUtils.checkNullUtils(new CheckCallBack()
     {
       public boolean isNull(Object obj)
       {
         if ((obj instanceof String)) {
           String a = (String)obj;
           if ((a == null) || ("".equals(a)) || (a.length() == 0))
           {
             return true;
           }
         }
         if ((obj instanceof Integer)) {
           Integer a = (Integer)obj;
           if (a == null)
             return true;
         }
         return false;
       }
     }
     , new Object[] { to_uid, "to_uid不能为空", last_time, "last_time不能为空" });
 
     if (checkResult != null) {
       return null;
     }
 
     List<ImMessage> datas = null;
     Map map = new HashMap();
     map.put("fromId", from_uid);
     map.put("lastTime", last_time);
     map.put("toId", to_uid);
     map.put("type", type);
     map.put("fileName", fileName);
     map.put("searchMsg", searchMsg);
 
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(true));
     pageParams.setPage(pagenum);
     pageParams.setPageSize(Integer.valueOf(30));
     map.put("page", pageParams);
 
     if ("0".equals(msg_type))
       datas = this.messageDao.selectMessageByPage(map);
     else {
       datas = this.messageDao.getGroupMessage(map);
     }
 
     String company = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
 
     ResourceBundle rb = ResourceBundle.getBundle("upload");
 
     String osName = System.getProperty("os.name");
     StringBuffer sb = new StringBuffer();
     if (osName.toLowerCase().startsWith("win"))
       sb = sb.append(rb.getString("upload.win"));
     else {
       sb = sb.append(rb.getString("upload.linux"));
     }
     for (ImMessage im : datas)
     {
       Files file1 = new Files();
 
       Attachment realTee = null;
       Attachment thumBanllTee = null;
 
       if ((!StringUtils.checkNull(im.getRealUrl()).booleanValue()) && (im.getRealUrl().contains("&"))) {
         String[] aidStr = im.getRealUrl().split("&");
         if ((aidStr.length > 1) && (aidStr[0].contains("="))) {
           String[] aidArr = aidStr[0].split("=");
           if (aidArr.length > 0) {
             realTee = this.attachmentMapper.selectByPrimaryKey(Integer.valueOf(Integer.parseInt(aidArr[1])));
           }
         }
       }
       if ((!StringUtils.checkNull(im.getThumbnailUrl()).booleanValue()) && (im.getThumbnailUrl().contains("&"))) {
         String[] aidStr = im.getThumbnailUrl().split("&");
         if ((aidStr.length > 1) && (aidStr[0].contains("="))) {
           String[] aidArr = aidStr[0].split("=");
           if (aidArr.length > 0) {
             thumBanllTee = this.attachmentMapper.selectByPrimaryKey(Integer.valueOf(Integer.parseInt(aidArr[1])));
           }
         }
       }
       if (!"img".equals(im.getType())) {
         String[] aidStr = im.getThumbnailUrl().split("&");
         if ((aidStr.length > 1) && (aidStr[0].contains("="))) {
           String[] aidArr = aidStr[0].split("=");
           if (aidArr.length > 0) {
             realTee = this.attachmentMapper.selectByPrimaryKey(Integer.valueOf(Integer.parseInt(aidArr[1])));
           }
         }
       }
       if (realTee != null) {
         String realPath = sb.toString() + System.getProperty("file.separator") + "attach" + System.getProperty("file.separator") + company + System.getProperty("file.separator") + "im" + System.getProperty("file.separator") + realTee.getYm() + System.getProperty("file.separator") + realTee.getAttachId() + "." + realTee.getAttachName();
 
         String realFileStr = "AID=" + realTee.getAid() + "&" + "MODULE=" + "im" + "&" + "COMPANY=" + company + "&" + "YM=" + realTee.getYm() + "&" + "ATTACHMENT_ID=" + realTee.getAttachId() + "&" + "ATTACHMENT_NAME=" + realTee.getAttachName();
 
         String thumbnailSize = im.getThumbnailUrl();
         String[] thumbnailSizeArr = thumbnailSize.split("&");
         for (int i = 0; i < thumbnailSizeArr.length; i++) {
           if (thumbnailSizeArr[i].contains("FILESIZE")) {
             String[] s = thumbnailSizeArr[i].split("=");
             thumbnailSize = s[1];
             break;
           }
         }
 
         String realSize = im.getRealUrl();
         String[] realSizeArr = realSize.split("&");
         for (int i = 0; i < realSizeArr.length; i++) {
           if (realSizeArr[i].contains("FILESIZE")) {
             String[] s = realSizeArr[i].split("=");
             realSize = s[1];
             break;
           }
         }
 
         if ("img".equals(im.getType())) {
           try {
             String port = String.valueOf(request.getServerPort());
             File picture = new File(realPath);
             FileInputStream fis = new FileInputStream(picture);
 
             BufferedImage sourceImg = ImageIO.read(fis);
             file1.setFile_url(realFileStr);
             file1.setFile_size(realSize);
             file1.setFile_name(realTee.getAttachName());
             file1.setFile_width(String.valueOf(sourceImg.getWidth()));
             file1.setFile_height(String.valueOf(sourceImg.getHeight()));
             if (thumBanllTee != null) {
               String thumBanllPath = sb.toString() + System.getProperty("file.separator") + "attach" + System.getProperty("file.separator") + company + System.getProperty("file.separator") + "im" + System.getProperty("file.separator") + thumBanllTee.getYm() + System.getProperty("file.separator") + thumBanllTee.getAttachId() + "." + thumBanllTee.getAttachName();
 
               String thumBanllFileStr = "AID=" + thumBanllTee.getAid() + "&" + "MODULE=" + "im" + "&" + "COMPANY=" + company + "&" + "YM=" + thumBanllTee.getYm() + "&" + "ATTACHMENT_ID=" + thumBanllTee.getAttachId() + "&" + "ATTACHMENT_NAME=" + thumBanllTee.getAttachName();
               File thmpicture = new File(thumBanllPath);
               FileInputStream thmfis = new FileInputStream(thmpicture);
 
               BufferedImage thmsourceImg = ImageIO.read(thmfis);
               file1.setThumbnail_url(thumBanllFileStr);
               file1.setThumbnail_size(thumbnailSize);
               file1.setThumbnail_width(String.valueOf(thmsourceImg.getHeight()));
               file1.setThumbnail_height(String.valueOf(thmsourceImg.getWidth()));
             }
             fis.close();
           }
           catch (Exception e) {
             e.printStackTrace();
           }
 
         }
 
         if ("voice".equals(im.getType()))
         {
           String port = String.valueOf(request.getServerPort());
           file1.setFile_url(realFileStr);
           file1.setVoice_time(im.getThumbnailUrl());
         }
 
         if ("file".equals(im.getType()))
         {
           realSize = im.getThumbnailUrl();
           String[] realSizeArr2 = realSize.split("&");
           for (int i = 0; i < realSizeArr2.length; i++) {
             if (realSizeArr2[i].contains("FILESIZE")) {
               String[] s = realSizeArr2[i].split("=");
               realSize = s[1];
               break;
             }
           }
           try
           {
             String port = String.valueOf(request.getServerPort());
             file1.setFile_url(realFileStr);
             file1.setFile_name(realTee.getAttachName());
             file1.setFile_type(realTee.getAttachName().substring(realTee.getAttachName().lastIndexOf(".") + 1));
             File picture = new File(realPath);
             FileInputStream fis = new FileInputStream(picture);
             file1.setFile_size(realSize);
             fis.close();
           }
           catch (Exception e)
           {
           }
         }
       }
 
       String fromUserName = this.usersService.findUserByuid(Integer.parseInt(im.getFromUid())).getUserName();
       String toUserName = "";
       if ("0".equals(msg_type)) {
         toUserName = this.usersService.findUserByuid(Integer.parseInt(im.getToUid())).getUserName();
       } else {
         Map room = new HashMap();
         room.put("roomOf", im.getToUid());
         if (this.roomDao.getRoomByRoomOf(room) != null) {
           toUserName = this.roomDao.getRoomByRoomOf(room).getRnamr();
         }
       }
       ImMessageModel imm = new ImMessageModel(im.getFromUid(), im.getToUid(), im.getOfFrom(), im.getContent(), im.getOfTo(), im.getUuid(), im.getType(), file1, im.getStime());
 
       imm.setFormUserName(fromUserName);
       imm.setToUserName(toUserName);
       list.add(imm);
     }
     try {
       if ((type != null) && (type.trim().equals("img"))) {
         SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
         Map dataMap = new HashMap();
         Set data = null;
         List dateStrList = new ArrayList();
         List list2 = list;
         Iterator it = list.iterator();
         while (it.hasNext()) {
           data = new HashSet();
           ImMessageModel imMessageModel = (ImMessageModel)it.next();
           long l;
         //  long l;
           if (imMessageModel.getTime().indexOf(".") > 0)
             l = Long.parseLong(imMessageModel.getTime().substring(0, imMessageModel.getTime().indexOf("."))) * 1000L;
           else {
             l = Long.parseLong(imMessageModel.getTime()) * 1000L;
           }
           Date parse = format.parse(format.format(Long.valueOf(l)));
           Calendar ca0 = Calendar.getInstance();
           ca0.setTime(parse);
           for (int j = 0; j < list2.size(); j++) {
             ImMessageModel imMessageModel1 = (ImMessageModel)list2.get(j);
             long l2;
           //  long l2;
             if (imMessageModel.getTime().indexOf(".") > 0)
               l2 = Long.parseLong(imMessageModel.getTime().substring(0, imMessageModel.getTime().indexOf("."))) * 1000L;
             else {
               l2 = Long.parseLong(imMessageModel.getTime()) * 1000L;
             }
             Date date2 = format.parse(format.format(Long.valueOf(l2)));
             Calendar ca1 = Calendar.getInstance();
             ca1.setTime(date2);
 
             if ((ca0.get(1) == ca1.get(1)) && (ca0.get(2) == ca1.get(2)) && (ca0.get(5) == ca1.get(5)))
             {
               data.add(imMessageModel);
               data.add(imMessageModel1);
             } else {
               data.add(imMessageModel);
             }
           }
           String dateStr = ca0.get(1) + "-" + (ca0.get(2) + 1) + "-" + ca0.get(5);
           if (dataMap.get(dateStr) == null) {
             dateStrList.add(dateStr);
             dataMap.put(dateStr, data);
           }
         }
         toJson.setObj1(dateStrList);
         toJson.setObject(dataMap);
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
 
     toJson.setTotleNum(pageParams.getTotal());
     toJson.setFlag(0);
     toJson.setObj(list);
     toJson.setMsg("ok");
 
     return toJson;
   }
   @Transactional(readOnly=false)
   public List<ImRoomModel> getAllRoom(String of_from) {
     List<ImRoomModel> alist = new ArrayList();
     if ((of_from == null) || ("".equals(of_from))) {
       return null;
     }
     Map map = new HashMap();
     map.put("roomOf", of_from);
     List<ImRoom> list = this.roomDao.getAllRoom(map);
 
     for (ImRoom ir : list)
     {
       String[] rmemberUid = ir.getRmemberUid().split(",");
       List rmemberUidString = Arrays.asList(rmemberUid);
       ImRoomModel irm = new ImRoomModel(ir.getRnamr(), ir.getRsetOfid(), ir.getRmemberUid(), ir.getRoutUid(), ir.getRsetUid(), ir.getRsetOfid(), ir.getRtime(), rmemberUidString.contains(of_from) ? "1" : "0", ir.getRchange(), ir.getRinvite(), ir.getRoomOf(), ir.getRoomStatus());
 
       alist.add(irm);
     }
     for (ImRoomModel imRoomModel : alist) {
       String name = this.usersService.findUsersByuidReturn(imRoomModel.getRmember_uid());
       String name1 = this.usersService.findUsersByuidReturn(imRoomModel.getRset_uid());
       imRoomModel.setRmemberUidName(name);
       imRoomModel.setRsetUidName(name1);
     }
 
     return alist;
   }
 
   @Transactional(readOnly=false)
   public ImRoomModel getSingleRoom(String room_id)
   {
     Map map = new HashMap();
     map.put("roomOf", room_id);
     ImRoom irm = this.roomDao.getRoomByRoomOf(map);
     ImRoomModel ir = new ImRoomModel();
     if (irm != null) {
       ir = new ImRoomModel(irm.getRnamr(), irm.getRoomOf(), irm.getRmemberUid(), irm.getRoutUid(), irm.getRsetUid(), irm.getRsetOfid(), irm.getRtime(), "1", irm.getRchange(), irm.getRinvite(), irm.getRoomOf(), irm.getRoomStatus());
     }
 
     return ir;
   }
   @Transactional(readOnly=false)
   public Status openInvite(String room_id, String check) {
     Status s = new Status();
     try {
       Map map = new HashMap();
       map.put("roomOf", room_id);
       map.put("check", check);
       int i = this.roomDao.roomUpdateInvite(map);
       if (i == 1)
         s.setStatus("ok");
     }
     catch (Exception e) {
       e.printStackTrace();
       s.setStatus("error");
     }
     return s;
   }
 
   @Transactional(readOnly=false)
   public Status insertRoom(String name, String set_uid, String set_of, String member_uid, String stime, String room_of)
   {
     Status s = new Status();
     try {
       ImRoom ir = new ImRoom();
       ir.setRnamr(name == null ? "" : name);
       ir.setRsetUid(set_uid == null ? "" : set_uid);
       ir.setRinvite("1");
       ir.setRsetOfid(set_of == null ? "" : set_of);
       ir.setRmemberUid(member_uid == null ? "" : member_uid);
       ir.setRtime(stime == null ? "" : stime);
       ir.setRoomOf(room_of == null ? "" : room_of);
       ir.setRchange("1");
       System.out.print(name.length());
       int i = this.roomDao.saveRoom(ir);
       if (i == 1)
         s.setStatus("ok");
     }
     catch (Exception e) {
       e.printStackTrace();
       s.setStatus("error");
       return s;
     }
     return s;
   }
   @Transactional(readOnly=false)
   public Status deleteMessage(String deleteuuid, String uid) {
     Status s = new Status();
     try {
       Map map = new HashMap();
       map.put("uuid", deleteuuid);
       map.put("uid", uid);
       int i = this.messageDao.deleteByUuid(map);
       s.setStatus("ok");
     } catch (Exception e) {
       e.printStackTrace();
       s.setStatus("error");
     }
     return s;
   }
 
   @Transactional(readOnly=false)
   public Status getOutPerson(String room_id, String delete_uid, String opt)
   {
     Status s = new Status();
     try
     {
       Map map = new HashMap();
       map.put("roomOf", room_id);
       ImRoom irm = this.roomDao.getRoomByRoomOf(map);
       if (irm == null) {
         s.setStatus("error");
         return s;
       }
 
       if (("1".equals(opt)) && (delete_uid != null)) {
         String memberUid = transfor(delete_uid, irm.getRmemberUid());
         memberUid = memberUid.substring(0, memberUid.length() - 1);
         String outUid = irm.getRoutUid() + "," + delete_uid;
         irm.setRmemberUid(memberUid);
         irm.setRoutUid(outUid);
       }
       else
       {
         irm.setRoomStatus(Integer.valueOf(-1));
       }
       int i = this.roomDao.roomUpdateByroomOf(irm);
       if (i == 1)
         s.setStatus("ok");
     }
     catch (Exception e) {
       s.setStatus("error");
       e.printStackTrace();
     }
     return s;
   }
 
   @Transactional(readOnly=false)
   public ToJson<ImRoom> roomRever(String room_id)
   {
     ToJson json = new ToJson(1, "error");
     try {
       if (StringUtils.checkNull(room_id).booleanValue()) {
         json.setMsg("roomId不能为空");
         return json;
       }
       ImRoom room = new ImRoom();
       room.setRoomOf(room_id);
       room.setRoomStatus(Integer.valueOf(0));
       int i = this.roomDao.roomUpdateByroomOf(room);
       if (i > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   @Transactional(readOnly=false)
   public Status getPersonToRoom(String room_id, String invite_uid)
   {
     Status s = new Status();
     try
     {
       Map map = new HashMap();
       map.put("roomOf", room_id);
       ImRoom irm = this.roomDao.getRoomByRoomOf(map);
       if (irm == null) {
         s.setStatus("error");
         return s;
       }
 
       String newString = irm.getRmemberUid() + "," + invite_uid + ",";
       irm.setRmemberUid(newString);
       String outIds = transfor(invite_uid, irm.getRoutUid());
       irm.setRoutUid(outIds.substring(0, outIds.length() < 1 ? outIds.length() : outIds.length() - 1));
       int i = this.roomDao.updatePersonToRoom(irm);
       if (i == 1)
         s.setStatus("ok");
       else
         s.setStatus("error");
     }
     catch (Exception e) {
       e.printStackTrace();
       s.setStatus("error");
     }
     return s;
   }
 
   public static String transfor(String uid, String outId) {
     if (outId == null) {
       outId = "";
     }
     if (uid == null) {
       uid = "";
     }
     String[] outIds = outId.split(",");
     List<String> outIdList = Arrays.asList(outIds);
     String[] uids = uid.split(",");
     List<String> uidsList = Arrays.asList(uids);
     StringBuffer sb = new StringBuffer("");
     for (String s : outIdList) {
       boolean flag = false;
       for (String s2 : uidsList) {
         if (s2.equals(s)) {
           flag = true;
         }
       }
       if (!flag) {
         sb.append(s);
         sb.append(",");
       }
     }
     return sb.toString();
   }
 
   @Transactional(readOnly=false)
   public Status updateRoomName(String room_id, String room_name)
   {
     Status s = new Status();
     try
     {
       Map map = new HashMap();
       map.put("roomOf", room_id);
       ImRoom irm = this.roomDao.getRoomByRoomOf(map);
       if (irm == null) {
         s.setStatus("error");
         return s;
       }
       irm.setRnamr(room_name);
       int i = this.roomDao.updateRoomName(irm);
       if (i == 1)
         s.setStatus("ok");
     }
     catch (Exception e) {
       s.setStatus("error");
     }
     return s;
   }
 
   public List<ImMessageModel> getAttchments(String other_id, String my_uid, HttpServletRequest req)
     throws IOException
   {
     Map map = new HashMap();
     map.put("my_uid", my_uid);
     map.put("other_id", other_id);
     List<ImMessage> attMessageList = this.messageDao.getAttchments(map);
     List messageList = new ArrayList();
     for (ImMessage im : attMessageList) {
       ImMessageModel imm = getMessage(im, req);
       messageList.add(imm);
     }
     return messageList;
   }
 
   public ImMessageModel getMessage(ImMessage im, HttpServletRequest request)
     throws IOException
   {
     String company = Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse");
 
     ResourceBundle rb = ResourceBundle.getBundle("upload");
 
     String osName = System.getProperty("os.name");
     StringBuffer sb = new StringBuffer();
     if (osName.toLowerCase().startsWith("win"))
       sb = sb.append(rb.getString("upload.win"));
     else {
       sb = sb.append(rb.getString("upload.linux"));
     }
 
     Files file1 = new Files();
 
     int fileid = -1;
     if (!StringUtils.checkNull(im.getFileId()).booleanValue()) {
       fileid = Integer.parseInt(im.getFileId());
     }
     Attachment tee = this.attachmentMapper.selectByPrimaryKey(Integer.valueOf(fileid));
     if (tee != null) {
       String path = sb.toString() + System.getProperty("file.separator") + "attach" + System.getProperty("file.separator") + company + System.getProperty("file.separator") + "im" + System.getProperty("file.separator") + tee.getYm() + System.getProperty("file.separator") + tee.getAttachId() + "." + tee.getAttachName();
 
       String fileStr = "AID=" + tee.getAid() + "&" + "MODULE=" + "im" + "&" + "COMPANY=" + company + "&" + "YM=" + tee.getYm() + "&" + "ATTACHMENT_ID=" + tee.getAttachId() + "&" + "ATTACHMENT_NAME=" + tee.getAttachName();
 
       if ("img".equals(im.getType()))
       {
         String port = String.valueOf(request.getServerPort());
 
         File picture = new File(path);
         File thmpicture = new File(path);
         FileInputStream fis = new FileInputStream(picture);
         FileInputStream thmfis = new FileInputStream(thmpicture);
 
         long size = fis.getChannel().size();
         long thmsize = thmfis.getChannel().size();
         BufferedImage sourceImg = ImageIO.read(fis);
         BufferedImage thmsourceImg = ImageIO.read(thmfis);
         file1.setFile_url(fileStr);
         double size_k = size / 1024L;
         BigDecimal l = new BigDecimal(Double.toString(size_k));
         double res = l.setScale(2, 4).doubleValue();
         long ress = 0L;
         if ((size_k < 1024.0D) && (size_k > 0.0D)) {
           if (Math.round(res) - res == 0.0D) {
             ress = (long)res;
           }
           file1.setFile_size(String.valueOf(ress) + "KB");
         } else if (size_k >= 1024.0D) {
           double size_m = size_k / 1024.0D;
           BigDecimal lm = new BigDecimal(Double.toString(size_k));
           double res_m = l.setScale(2, 4).doubleValue();
           long resss = 0L;
           if (Math.round(res_m) - res_m == 0.0D) {
             resss = (long)res_m;
           }
           file1.setFile_size(String.valueOf(resss) + "MB");
         }
         file1.setFile_width(String.valueOf(sourceImg.getWidth()));
         file1.setFile_height(String.valueOf(sourceImg.getHeight()));
         file1.setThumbnail_url(fileStr);
         if ((size_k < 1024.0D) && (size_k > 0.0D)) {
           if (Math.round(res) - res == 0.0D) {
             ress = (long)res;
           }
           file1.setThumbnail_size(String.valueOf(ress) + "KB");
         } else if (size_k >= 1024.0D) {
           double size_m = size_k / 1024.0D;
           BigDecimal lm = new BigDecimal(Double.toString(size_k));
           double res_m = l.setScale(2, 4).doubleValue();
           long resss = 0L;
           if (Math.round(res_m) - res_m == 0.0D) {
             resss = (long)res_m;
           }
           file1.setThumbnail_size(String.valueOf(resss) + "MB");
         }
         file1.setThumbnail_width(String.valueOf(thmsourceImg.getHeight()));
         file1.setThumbnail_height(String.valueOf(thmsourceImg.getWidth()));
       }
 
       if ("voice".equals(im.getType()))
       {
         String port = String.valueOf(request.getServerPort());
         file1.setFile_url(fileStr);
         file1.setVoice_time(im.getThumbnailUrl());
       }
 
       if ("file".equals(im.getType()))
       {
         String port = String.valueOf(request.getServerPort());
         file1.setFile_url(fileStr);
         file1.setFile_name(im.getFileName());
         file1.setFile_type(tee.getAttachName().substring(tee.getAttachName().lastIndexOf(".") + 1));
         File picture = new File(path);
         FileInputStream fis = new FileInputStream(picture);
         long size = fis.getChannel().size();
         double size_k = size / 1024L;
         BigDecimal l = new BigDecimal(Double.toString(size_k));
         double res = l.setScale(2, 4).doubleValue();
         long ress = 0L;
         if ((size_k < 1024.0D) && (size_k > 0.0D)) {
           if (Math.round(res) - res == 0.0D) {
             ress = (long)res;
           }
           file1.setFile_size(String.valueOf(ress) + "KB");
         } else if (size_k >= 1024.0D) {
           double size_m = size_k / 1024.0D;
           BigDecimal lm = new BigDecimal(Double.toString(size_k));
           double res_m = l.setScale(2, 4).doubleValue();
           long resss = 0L;
           if (Math.round(res_m) - res_m == 0.0D) {
             resss = (long)res_m;
           }
           file1.setFile_size(String.valueOf(resss) + "MB");
         }
       }
 
     }
 
     ImMessageModel imm = new ImMessageModel(im.getFromUid(), im.getToUid(), im.getOfFrom(), im.getContent(), im.getOfTo(), im.getUuid(), im.getType(), file1, im.getStime());
 
     return imm;
   }
 
   public List<ImMessageModel> selectMessage(Map<String, Object> mapq)
     throws IOException
   {
     HttpServletRequest req = (HttpServletRequest)mapq.get("req");
     Map map = new HashMap();
     map.put("other_id1", mapq.get("other_id"));
     map.put("my_uid1", mapq.get("my_uid"));
     map.put("keyword1", mapq.get("keyword"));
     map.put("msg_type1", mapq.get("msg_type"));
     List<ImMessage> attMessageList = this.messageDao.selectMessage(map);
     List messageList = new ArrayList();
     for (ImMessage im : attMessageList) {
       ImMessageModel imm = getMessage(im, req);
       messageList.add(imm);
     }
     return messageList;
   }
 
   public Status updateMsgFree(Map<String, Object> map)
   {
     Status status = new Status();
     String list_id = (String)map.get("list_id");
     String type = (String)map.get("type");
     String set_uid = (String)map.get("set_uid");
 
     Map para = new HashMap();
     para.put("list_id", list_id);
     ImChatData chat = this.chatDataDao.getSingleByListId(para);
     List set_uids = new ArrayList();
     if ((chat != null) && (!StringUtils.checkNull(chat.getMsg_free()).booleanValue()))
       set_uids = Arrays.asList(chat.getMsg_free().split(","));
     else if (chat != null) {
       chat.setMsg_free("");
     }
     if ("1".equals(type)) {
       if (!set_uids.contains(set_uid)) {
         String oldStr = chat.getMsg_free();
         String uidSingle;
       //  String uidSingle;
         if (StringUtils.checkNull(oldStr).booleanValue())
           uidSingle = oldStr + set_uid + ",";
         else {
           uidSingle = set_uid + ",";
         }
 
         ImChatData chat1 = new ImChatData();
         chat1.setListId(list_id);
         chat1.setMsg_free(uidSingle);
         int result = this.chatDataDao.updateChatlist(chat1);
         if (result == 1)
           status.setStatus("ok");
         else
           status.setStatus("error");
       }
       else {
         status.setStatus("error");
       }
     }
     StringBuffer sb = null;
     if ("0".equals(type)) {
       if (set_uids.contains(set_uid)) {
         sb = new StringBuffer();
         int length = set_uids.size();
         for (int i = 0; i < length; i++) {
           if (!((String)set_uids.get(i)).equals(set_uid)) {
             sb.append((String)set_uids.get(i) + ",");
           }
         }
         ImChatData chat0 = new ImChatData();
         chat0.setListId(list_id);
         chat0.setMsg_free(sb.toString());
         int result = this.chatDataDao.updateChatlist(chat0);
         if (result == 1)
           status.setStatus("ok");
         else
           status.setStatus("error");
       }
       else {
         status.setStatus("error");
       }
     }
     return status;
   }
 
   public ImMessageModel getPriv(String of_from, String of_to, String msg_type)
   {
     ImMessageModel messageModel = new ImMessageModel();
     String checkResult = StringUtils.checkNullUtils(new CheckCallBack()
     {
       public boolean isNull(Object obj)
       {
         if ((obj instanceof String)) {
           String a = (String)obj;
           if ((a == null) || ("".equals(a)) || (a.length() == 0))
           {
             return true;
           }
         }
         return false;
       }
     }
     , new Object[] { of_from, "of_from不能为空", of_to, "of_to不能为空", msg_type, "msg_type不能为空" });
 
     if (checkResult != null) {
       return messageModel;
     }
     Map map = new HashMap();
     map.put("of_from", of_from);
     map.put("of_to", of_to);
     map.put("msg_type", msg_type);
     ImChatData priv = this.chatDataDao.getPriv(map);
 
     if (priv != null) {
       messageModel.setMsg_free(priv.getMsg_free());
       messageModel.setList_id(priv.getListId());
       if ((msg_type != null) && ("1".equals(String.valueOf(map.get("msg_type"))))) {
         Map param = new HashMap();
         param.put("roomOf", of_to);
         ImRoom room = this.roomDao.getRoomByRoomOf(param);
         messageModel.setRinvite(room.getRinvite());
       }
     } else {
       messageModel.setMsg_free("");
       messageModel.setList_id("");
       messageModel.setRinvite("");
     }
     return messageModel;
   }
 
   public Object putMessageInfoPc(MultipartFile[] files, HttpServletRequest request,final Integer flag,final String from_uid,final String to_uid,final String of_from,final String of_to,final String content,final String type,final String time,final String uuid,final String msg_type,final String voice_time)
   {
     Status s = new Status();
     Files file1 = new Files();
 
     String fileID = "";
     String attachName = "";
     String lastThumbnailUrl = "";
     try
     {
       String checkResult = StringUtils.checkNullUtils(new CheckCallBack()
       {
         public boolean isNull(Object obj)
         {
           if ((obj instanceof String)) {
             String a = (String)obj;
             if ((a == null) || ("".equals(a)) || (a.length() == 0))
             {
               return true;
             }
           }
           if ((obj instanceof Integer)) {
             Integer a = (Integer)obj;
             if (a == null)
               return true;
           }
           return false;
         }
       }
       , new Object[] { flag, "flag不能为空", from_uid, "from_uid不能为空", to_uid, "to_uid不能为空", of_from, "of_from不能为空", of_to, "of_to不能为空", type, "type不能为空", time, "time不能为空" });
 
       if (checkResult != null) {
         s.setStatus("error");
         return s;
       }
       final List<Users> users = new ArrayList<Users>();
       if ("0".equals(msg_type)) {
         Users user = this.usersService.getByUid(Integer.parseInt(to_uid));
         if ((user == null) || (user.getUid() == null)) {
           s.setStatus("nopeople");
           return s;
         }
         Map paramss = new HashMap();
         paramss.put("fromUid", from_uid);
         paramss.put("toUid", to_uid);
 
         ImChatData imChatData = this.chatDataDao.getDataSingleByUid(paramss);
 
         if ((imChatData != null) && (!StringUtils.checkNull(imChatData.getMsg_free()).booleanValue())) {
           String[] tempUids = imChatData.getMsg_free().split(",");
           if ((tempUids != null) && (tempUids.length > 0)) {
             int count = 0;
             for (String toUiddd : tempUids) {
               if (to_uid.equals(toUiddd)) {
                 count++;
                 break;
               }
             }
             if (count == 0)
               users.add(user);
           }
         }
         else {
           System.out.println("0==||===========>消息打扰");
           users.add(user);
         }
       }
       else {
         Map map = new HashMap();
         map.put("roomOf", to_uid);
         ImRoom room = this.roomDao.getRoomByRoomOf(map);
 
         ImChatData imChatData = this.chatDataDao.getGroupByToUid(to_uid);
         List<Users> tempUser = new ArrayList();
         if ((imChatData != null) && (!StringUtils.checkNull(imChatData.getMsg_free()).booleanValue())) {
           String[] tempUids = imChatData.getMsg_free().split(",");
           tempUser = this.usersMapper.getUsersByUids(tempUids);
         }
         if (!StringUtils.checkNull(room.getRmemberUid()).booleanValue()) {
           String[] uids = room.getRmemberUid().split(",");
           List<Users> userss = this.usersMapper.getUsersByUids(uids);
           if (tempUser.size() > 0) {
             for (Users u1 : userss) {
               int count = 0;
               for (Users u2 : tempUser) {
                 if (u1.getUid().equals(u2.getUid())) {
                   count++;
                   break;
                 }
               }
               if (count == 0)
                 users.add(u1);
             }
           }
           else
             users.addAll(userss);
         }
         else
         {
           s.setStatus("nopeople");
           return s;
         }
       }
 
       ImMessage record = new ImMessage();
       record.setFromUid(from_uid);
       record.setType(type);
       record.setOfTo(of_to);
       record.setOfFrom(of_from);
       record.setToUid(to_uid);
       record.setUuid(uuid);
 
       Attachment attach = null;
       switch (flag.intValue())
       {
       case 1:
         record.setContent(content);
         break;
       case 3:
         List<Attachment> attachs = this.attachService.upload(files, type, "im", Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse"), false);
         if (attachs == null) {
           s.setStatus("error");
           return s;
         }
         for (Attachment tee : attachs) {
           record.setFileId(String.valueOf(tee.getAid()));
           record.setFileName(tee.getYm());
 
           fileID = String.valueOf(tee.getAid());
 
           attachName = tee.getYm();
 
           String fileString = tee.getUrl();
 
           String path = tee.getPath();
 
           if ("img".equals(type))
           {
             File picture = new File(fileString);
             String deskFileName = UUID.randomUUID().toString() + ".png";
             String deskUlr = path + System.getProperty("file.separator") + deskFileName;
             FileUploadUtil.saveMinPhoto(fileString, deskUlr, 300.0D, 1.0D);
             File thmpicture = new File(deskUlr);
 
             if (thmpicture.exists()) {
               FileInputStream thmfis = new FileInputStream(thmpicture);
               MultipartFile multipartFile = new MockMultipartFile(deskFileName, deskFileName, "img/txt", thmfis);
               MultipartFile[] multipartFiles = { multipartFile };
               List attachss = this.attachService.upload(multipartFiles, type, "im", Constant.MYOA + (String)request.getSession().getAttribute("loginDateSouse"), true);
 
               if ((attachss != null) && (attachss.size() > 0)) {
                 Attachment themp = (Attachment)attachss.get(0);
                 file1.setThumbnail_url(themp.getAttUrl());
                 record.setThumbnailUrl(themp.getAttUrl());
                 File thmpicture11 = new File(themp.getUrl());
                 if (thmpicture11.exists()) {
                   FileInputStream thmfiss = new FileInputStream(thmpicture11);
                   BufferedImage thmsourceImgs = ImageIO.read(thmfiss);
                   file1.setThumbnail_width(String.valueOf(thmsourceImgs.getHeight()));
                   file1.setThumbnail_height(String.valueOf(thmsourceImgs.getWidth()));
                 }
               }
               thmfis.close();
             }
             FileInputStream fis = new FileInputStream(picture);
 
             long size = fis.getChannel().size();
             BufferedImage sourceImg = ImageIO.read(fis);
 
             file1.setFile_name(tee.getAttachName());
             file1.setFile_url(tee.getAttUrl());
             file1.setFile_size(ReadFile.FormetFileSize(size));
             file1.setFile_width(String.valueOf(sourceImg.getWidth()));
             file1.setFile_height(String.valueOf(sourceImg.getHeight()));
             fis.close();
 
             lastThumbnailUrl = tee.getAttUrl();
             record.setRealUrl(tee.getAttUrl());
           }
 
           if ("voice".equals(type))
           {
             file1.setFile_url(tee.getAttUrl());
             file1.setVoice_time(voice_time);
 
             record.setThumbnailUrl(voice_time);
             lastThumbnailUrl = voice_time;
           }
 
           if ("file".equals(type))
           {
             File picture = new File(fileString);
             FileInputStream fis = new FileInputStream(picture);
             long size = fis.getChannel().size();
             file1.setFile_size(ReadFile.FormetFileSize(size));
 
             file1.setFile_url(tee.getAttUrl());
             file1.setFile_name(tee.getAttachName());
             file1.setFile_type(tee.getAttachName().substring(tee.getAttachName().lastIndexOf(".") + 1));
             record.setThumbnailUrl(tee.getAttUrl());
           }
 
         }
 
         break;
       }
 
       record.setStime(time);
       record.setMsgType(msg_type);
       Long atime = Long.valueOf(new Date().getTime());
       record.setAtime(String.valueOf(atime));
       int meResult = this.messageDao.save(record);
       Map map = new HashMap();
       map.put("fromUid", from_uid);
       map.put("toUid", to_uid);
 
       ImChatData chatModel = new ImChatData();
       chatModel.setFromUid(from_uid);
       chatModel.setToUid(to_uid);
       chatModel.setOfFrom(of_from);
       chatModel.setOfTo(of_to);
       chatModel.setLastTime(time);
       chatModel.setLastAtime(String.valueOf(atime));
       if ("img".equals(type))
       {
         chatModel.setLastContent("");
 
         chatModel.setLastFileId(fileID);
         chatModel.setLastFileName(attachName);
         chatModel.setLastThumbnailUrl(lastThumbnailUrl);
       } else if ("voice".equals(type))
       {
         chatModel.setLastContent("");
 
         chatModel.setLastFileId(fileID);
         chatModel.setLastFileName(attachName);
         chatModel.setLastThumbnailUrl(lastThumbnailUrl);
       } else if ("file".equals(type))
       {
         chatModel.setLastContent("");
 
         chatModel.setLastFileId(fileID);
         chatModel.setLastFileName(attachName);
         chatModel.setLastThumbnailUrl(lastThumbnailUrl);
       } else {
         chatModel.setLastContent(content);
 
         chatModel.setLastFileId(fileID);
         chatModel.setLastFileName(attachName);
         chatModel.setLastThumbnailUrl(lastThumbnailUrl);
       }
       chatModel.setType(type);
       chatModel.setUuid(uuid);
       chatModel.setMsgType(msg_type);
 
       int chResult = 0;
       if ("1".equals(msg_type)) {
         String listId = this.chatDataDao.getDatagroupObject(chatModel.getToUid());
         if (StringUtils.checkNull(listId).booleanValue()) {
           chatModel.setUidIgnore("");
           chResult = this.chatDataDao.saveChat(chatModel);
         } else {
           chatModel.setListId(listId);
           chatModel.setUidIgnore("");
           chResult = this.chatDataDao.updateChatlist(chatModel);
         }
       } else {
         int i = this.chatDataDao.getCountSingleObject(map);
         if (i == 0) {
           chatModel.setUidIgnore("");
           chResult = this.chatDataDao.saveChat(chatModel);
         } else {
           List listId = this.chatDataDao.getDataSingleObject(map);
           chatModel.setListId((String)listId.get(0));
           chatModel.setUidIgnore("");
           chResult = this.chatDataDao.updateChatlist(chatModel);
         }
       }
 
       final String sqlType = (String)request.getSession().getAttribute("loginDateSouse");
       final String jixiema = (String)MachineCode.get16CharMacs().get(0);
       final Attachment finalAttach = attach;
       final Users users1 = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       Runnable runnable = new Runnable()
       {
         public void run() {
           try {
             String userName = users1.getUserName();
             String con = users1.getUserName() + ":" + content;
             if (!"0".equals(msg_type)) {
               Map paramMap = new HashMap();
               paramMap.put("uid", users1.getUid());
               paramMap.put("roomOf", to_uid);
               ImRoom room = ImChatDataService.this.roomDao.selRoomByRoomOfUid(paramMap);
               userName = room.getRnamr();
             }
             for (Users user : users)
               if (!users1.getUserId().equals(user.getUserId())) {
                 String account = jixiema + user.getUserId() + sqlType;
                 XingeApp pushIos = new XingeApp(Long.parseLong(ImChatDataService.this.iosKey), ImChatDataService.this.iosSercetKey);
                 XingeApp pushAndroid = new XingeApp(Long.parseLong(ImChatDataService.this.androidKey), ImChatDataService.this.androidSercetKey);
                 JSONObject ret3;
                 if (flag.intValue() == 1) {
                   ClickAction clickAction = new ClickAction();
                   clickAction.setActionType(1);
                   clickAction.setActivity("123");
                   Style style = new Style(0, 0, 0, 1, 1, 1, 0, 1);
                   Message mess = new Message();
                   mess.setType(1);
                   mess.setStyle(style);
                   mess.setTitle(userName);
                   mess.setContent(con);
                   mess.setAction(clickAction);
                   JSONObject ret = pushAndroid.pushSingleAccount(0, account, mess);
 
                   JSONObject contentTest = new JSONObject();
                   JSONObject obj = new JSONObject();
                   JSONObject aps = new JSONObject();
                   contentTest.put("title", userName);
                   contentTest.put("body", con);
                   aps.put("badge", 1);
                   aps.put("alert", contentTest);
                   obj.put("aps", aps);
                   MessageIOS messageIOS = new MessageIOS();
                   messageIOS.setRaw(obj.toString());
                   ret3 = pushIos.pushSingleAccount(0, account, messageIOS, 1);
                 } else if (flag.intValue() == 3) {
                   String confile = "";
                   if ("img".equals(type))
                     confile = users1.getUserName() + ":[图片]";
                   else {
                     confile = users1.getUserName() + ":[" + finalAttach.getAttachName() + "]";
                   }
                   Style style = new Style(0, 0, 0, 1, -1, 1, 0, 1);
                   ClickAction clickAction = new ClickAction();
                   clickAction.setActionType(1);
                   clickAction.setActivity("123");
                   Message mess = new Message();
                   mess.setType(1);
                   mess.setStyle(style);
                   mess.setTitle(userName);
                   mess.setContent(confile);
                   mess.setAction(clickAction);
                   JSONObject ret = pushAndroid.pushSingleAccount(0, account, mess);
                   System.out.println("0==||===========>ret" + ret);
 
                   JSONObject contentTest = new JSONObject();
                   JSONObject obj = new JSONObject();
                   JSONObject aps = new JSONObject();
                   contentTest.put("title", userName);
                   contentTest.put("body", confile);
                   aps.put("badge", 1);
                   aps.put("alert", contentTest);
                   obj.put("aps", aps);
                   MessageIOS messageIOS = new MessageIOS();
                   messageIOS.setRaw(obj.toString());
                   ret3 = pushIos.pushSingleAccount(0, account, messageIOS, 1);
                 }
               }
           }
           catch (Exception e)
           {
             String userName;
             String con;
             JSONObject ret3;
             e.printStackTrace();
           }
         }
       };
       runnable.run();
       if (chResult == 1)
         s.setStatus("ok");
       else {
         s.setStatus("error");
       }
       if (flag.intValue() == 3) {
         file1.setStatus("ok");
         return file1;
       }
     } catch (Exception e) {
       e.printStackTrace();
       s.setStatus("error");
     }
     return s;
   }
 
   public ToJson<Users> getRoomPerson(HttpServletRequest request, String roomOf)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       List<Users> list = new ArrayList<Users>();
       Map map = new HashMap();
       map.put("roomOf", roomOf);
       ImRoom imRoom = this.roomDao.getRoomByRoomOf(map);
       String realPath;
       if ((imRoom != null) && (!StringUtils.checkNull(imRoom.getRmemberUid()).booleanValue())) {
         String[] arr = imRoom.getRmemberUid().split(",");
         list = this.usersMapper.selUserOrder(arr);
         realPath = request.getSession().getServletContext().getRealPath("/");
         for (Users users : list) {
           File file = new File(realPath + "uiuser/" + users.getAvatar());
           if (!file.exists()) {
             users.setAvatar(users.getSex());
             users.setAvatar128(users.getSex());
           }
         }
       }
       toJson.setObj(list);
       toJson.setMsg("ok");
       toJson.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
     }
     return toJson;
   }
 
   public ToJson<ImChatData> delChatList(HttpServletRequest request, int listId)
   {
     ToJson toJson = new ToJson(1, "error");
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       ImChatData chatData = this.chatDataDao.selChatByListId(listId);
       String uid = chatData.getUidIgnore() + user.getUid() + ",";
       Map map = new HashMap();
       map.put("listId", Integer.valueOf(listId));
       map.put("uidIgnore", uid);
       int count = this.chatDataDao.upChatByIgnore(map);
       if (count > 0) {
         toJson.setMsg("ok");
         toJson.setFlag(0);
       }
     } catch (Exception e) {
       e.printStackTrace();
     }
     return toJson;
   }
 }

