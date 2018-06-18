 package com.myoa.service.meeting.impl;
 
 import com.myoa.dao.meet.MeetingEquuipmentMapper;
import com.myoa.model.meet.MeetingEquuipment;
import com.myoa.service.meeting.MeetEquuipmentService;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.page.PageParams;

 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class MeetEquuipServiceImpl
   implements MeetEquuipmentService
 {
 
   @Resource
   private MeetingEquuipmentMapper meetingEquuipmentMapper;
 
   public ToJson<MeetingEquuipment> getAllEquip(Integer page, Integer pageSize, boolean useFlag)
   {
     ToJson json = new ToJson();
     Map map = new HashMap();
     PageParams pageParams = new PageParams();
     pageParams.setUseFlag(Boolean.valueOf(useFlag));
     pageParams.setPage(page);
     pageParams.setPageSize(pageSize);
     map.put("page", pageParams);
     try {
       List allequuip = this.meetingEquuipmentMapper.getAllequuip(map);
       json.setObj(allequuip);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setObj(null);
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<MeetingEquuipment> getdetailEquiet(String Sid)
   {
     ToJson json = new ToJson();
     if ((Sid != null) && (Sid != "")) {
       try {
         MeetingEquuipment meetingEquuipment = this.meetingEquuipmentMapper.getdetailEquiet(Integer.valueOf(Sid));
         json.setFlag(0);
         json.setObject(meetingEquuipment);
         json.setMsg("ok");
       } catch (NumberFormatException e) {
         json.setFlag(1);
         json.setObject(null);
         json.setMsg("err");
         e.printStackTrace();
       }
     } else {
       json.setFlag(1);
       json.setObject(null);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<Object> updateEquiet(MeetingEquuipment meetingEquuipment)
   {
     ToJson json = new ToJson();
     if (meetingEquuipment != null) {
       try {
         this.meetingEquuipmentMapper.updatequuip(meetingEquuipment);
         json.setFlag(0);
         json.setMsg("ok");
       } catch (Exception e) {
         json.setFlag(1);
         json.setMsg("err");
         e.printStackTrace();
       }
     } else {
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<Object> deleteEquiets(String Sids)
   {
     ToJson json = new ToJson();
     try {
       if (!StringUtils.checkNull(Sids).booleanValue()) {
         String[] split = Sids.split(",");
         if ((split != null) && (split.length > 0)) {
           this.meetingEquuipmentMapper.deleteequuips(split);
           json.setFlag(0);
           json.setMsg("ok");
         }
       }
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> addEquiet(MeetingEquuipment meetingEquuipment)
   {
     ToJson json = new ToJson();
     try {
       this.meetingEquuipmentMapper.insertSelective(meetingEquuipment);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 }

