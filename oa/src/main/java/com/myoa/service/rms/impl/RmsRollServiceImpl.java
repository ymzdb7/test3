 package com.myoa.service.rms.impl;
 
 import com.myoa.dao.rms.RmsRollMapper;
import com.myoa.dao.users.UsersMapper;
import com.myoa.model.rms.RmsRollWithBLOBs;
import com.myoa.model.users.Users;
import com.myoa.service.rms.RmsRollService;
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
 public class RmsRollServiceImpl
   implements RmsRollService
 {
 
   @Autowired
   private RmsRollMapper rmsRollMapper;
 
   @Autowired
   private UsersMapper usersMapper;
 
   public ToJson<RmsRollWithBLOBs> save(RmsRollWithBLOBs rmsRoll, HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       rmsRoll.setAddUser(user.getUserId());
       rmsRoll.setAddTime(new Date());
       if (StringUtils.checkNull(rmsRoll.getManageUser()).booleanValue()) {
         rmsRoll.setManageUser("");
       }
       if (StringUtils.checkNull(rmsRoll.getReadUser()).booleanValue()) {
         rmsRoll.setReadUser("");
       }
       this.rmsRollMapper.insertSelective(rmsRoll);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsRollWithBLOBs> update(RmsRollWithBLOBs rmsRollWithBLOBs, HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       rmsRollWithBLOBs.setModUser(user.getUserId());
       rmsRollWithBLOBs.setModTime(new Date());
 
       this.rmsRollMapper.updateByPrimaryKeySelective(rmsRollWithBLOBs);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsRollWithBLOBs> destroy(String rollIds, HttpServletRequest request)
   {
     ToJson json = new ToJson();
     try {
       Users user = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
       String[] split = rollIds.split(",");
       this.rmsRollMapper.deleteByRollIds(split);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsRollWithBLOBs> query(RmsRollWithBLOBs rmsRollWithBLOBs, PageParams pageParams)
   {
     ToJson json = new ToJson();
     try {
       Map map = new HashMap();
       map.put("page", pageParams);
       map.put("fileCode", rmsRollWithBLOBs.getRollCode());
       map.put("roomId", rmsRollWithBLOBs.getRoomId());
 
       map.put("beginDate", rmsRollWithBLOBs.getBeginDate());
       map.put("beginDate2", rmsRollWithBLOBs.getBeginDate2());
       map.put("endDate", rmsRollWithBLOBs.getEndDate());
       map.put("endDate2", rmsRollWithBLOBs.getEndDate2());
       map.put("deadBeginDate", rmsRollWithBLOBs.getDeadBeginDate());
       map.put("deadEndDate", rmsRollWithBLOBs.getDeadEndDate());
 
       map.put("categoryNo", rmsRollWithBLOBs.getCategoryNo());
       map.put("archiveNo", rmsRollWithBLOBs.getArchiveNo());
 
       map.put("microNo", rmsRollWithBLOBs.getMicroNo());
 
       map.put("certificateStart", rmsRollWithBLOBs.getCertificateStart());
       map.put("certificateStart2", rmsRollWithBLOBs.getCertificateStart2());
 
       map.put("certificateEnd", rmsRollWithBLOBs.getCertificateEnd());
       map.put("certificateEnd2", rmsRollWithBLOBs.getCertificateEnd2());
 
       map.put("rollPage", rmsRollWithBLOBs.getRollPage());
       map.put("rollPage2", rmsRollWithBLOBs.getRollPage2());
 
       map.put("remark", rmsRollWithBLOBs.getRemark());
       map.put("rollName", rmsRollWithBLOBs.getRollName());
       map.put("years", rmsRollWithBLOBs.getYears());
       map.put("secret", rmsRollWithBLOBs.getSecret());
       map.put("catalogNo", rmsRollWithBLOBs.getCatalogNo());
       map.put("boxNo", rmsRollWithBLOBs.getBoxNo());
       map.put("certificateKind", rmsRollWithBLOBs.getCertificateKind());
       map.put("deptId", rmsRollWithBLOBs.getDeptId());
 
       List RmsRollWithBLOBs = this.rmsRollMapper.query(map);
       json.setTotleNum(pageParams.getTotal());
       json.setObj(RmsRollWithBLOBs);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsRollWithBLOBs> selectById(Integer rollId)
   {
     ToJson json = new ToJson();
     try {
       RmsRollWithBLOBs rmsRollWithBLOBs = this.rmsRollMapper.selectById(rollId);
       if (!StringUtils.checkNull(rmsRollWithBLOBs.getManager()).booleanValue()) {
         Users usersByuserId = this.usersMapper.getUsersByuserId(rmsRollWithBLOBs.getManager());
         rmsRollWithBLOBs.setManagerName(usersByuserId.getUserName());
       }
       json.setObject(rmsRollWithBLOBs);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
       json.setFlag(1);
       json.setMsg("err");
     }
     return json;
   }
 
   public ToJson<RmsRollWithBLOBs> selectAll()
   {
     ToJson json = new ToJson();
     try {
       List rmsRollWithBLOBs = this.rmsRollMapper.selectAll();
       json.setObj(rmsRollWithBLOBs);
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

