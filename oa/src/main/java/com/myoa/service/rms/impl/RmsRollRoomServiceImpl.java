 package com.myoa.service.rms.impl;
 
 import com.myoa.dao.department.DepartmentMapper;
import com.myoa.dao.rms.RmsRollRoomMapper;
import com.myoa.model.rms.RmsRollRoom;
import com.myoa.model.users.Users;
import com.myoa.service.rms.RmsRollRoomService;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.page.PageParams;

 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
 @Service
 public class RmsRollRoomServiceImpl
   implements RmsRollRoomService
 {
 
   @Autowired
   private RmsRollRoomMapper rmsRollRoomMapper;
 
   @Autowired
   private DepartmentMapper departmentMapper;
 
   public ToJson<RmsRollRoom> save(RmsRollRoom rmsRollRoom, HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       rmsRollRoom.setAddUser(user.getUserId());
       rmsRollRoom.setAddTime(new Date());
 
       this.rmsRollRoomMapper.insertSelective(rmsRollRoom);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsRollRoom> update(RmsRollRoom rmsRollRoom, HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       rmsRollRoom.setModUser(user.getUserId());
       rmsRollRoom.setModTime(new Date());
 
       this.rmsRollRoomMapper.updateByPrimaryKeySelective(rmsRollRoom);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsRollRoom> delete(RmsRollRoom rmsRollRoom, HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       rmsRollRoom.setDelUser(user.getUserId());
       rmsRollRoom.setDelTime(new Date());
       this.rmsRollRoomMapper.updateByPrimaryKeySelective(rmsRollRoom);
       this.rmsRollRoomMapper.deleteByPrimaryKey(rmsRollRoom.getRoomId());
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsRollRoom> query(RmsRollRoom rmsRollRoom, PageParams pageParams)
   {
     ToJson json = new ToJson();
     Map map = new HashMap();
     map.put("page", pageParams);
     try {
       List rmsRollRooms = this.rmsRollRoomMapper.queryRooms(map);
       json.setTotleNum(pageParams.getTotal());
       json.setObj(rmsRollRooms);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsRollRoom> selectById(Integer roomId)
   {
     ToJson json = new ToJson();
     try {
       RmsRollRoom rmsRollRoom = this.rmsRollRoomMapper.selectById(roomId);
       if ((!StringUtils.checkNull(rmsRollRoom.getViewDeptId()).booleanValue()) && (!"ALL_DEPT".equals(rmsRollRoom.getViewDeptId()))) {
         String[] split = rmsRollRoom.getViewDeptId().split(",");
         for (String deptId : split) {
           String deptNameById = this.departmentMapper.getDeptNameById(Integer.parseInt(deptId));
           if (!StringUtils.checkNull(rmsRollRoom.getViewDeptName()).booleanValue())
             rmsRollRoom.setViewDeptName(rmsRollRoom.getViewDeptName() + deptNameById + ",");
           else
             rmsRollRoom.setViewDeptName(deptNameById + ",");
         }
       }
       else if ("ALL_DEPT".equals(rmsRollRoom.getViewDeptId())) {
         rmsRollRoom.setViewDeptName("全部部门");
       }
       json.setObject(rmsRollRoom);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsRollRoom> selectAll()
   {
     ToJson json = new ToJson();
     try {
       List rmsRollRooms = this.rmsRollRoomMapper.selectAll();
       json.setObj(rmsRollRooms);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 }

