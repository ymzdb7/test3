 package com.myoa.service.officesupplies;
 
 import com.myoa.dao.officesupplies.OfficeDepositoryMapper;
import com.myoa.dao.officesupplies.OfficeTypeMapper;
import com.myoa.model.officesupplies.OfficeDepositoryWithBLOBs;
import com.myoa.model.officesupplies.OfficeType;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;

 import java.util.List;
 import javax.annotation.Resource;
 import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;
 
 @Service
 public class OfficeTypeService
 {
 
   @Resource
   private OfficeTypeMapper officeTypeMapper;
 
   @Resource
   private OfficeDepositoryMapper officeDepositoryMapper;
 
   public ToJson<Object> addOfficeType(OfficeType officeType)
   {
     ToJson json = new ToJson(1, "err");
     try {
       int i = this.officeTypeMapper.insertSelective(officeType);
       if (i > 0) {
         OfficeDepositoryWithBLOBs officeDepositoryWithBLOBs = new OfficeDepositoryWithBLOBs();
         OfficeDepositoryWithBLOBs officeDepositoryWithBLOBs1 = this.officeDepositoryMapper.selectByPrimaryKey(officeType.getTypeDepository());
         String officeTypeId = officeDepositoryWithBLOBs1.getOfficeTypeId();
         StringBuffer sb = new StringBuffer();
         if (!StringUtils.checkNull(officeTypeId).booleanValue())
           sb.append(officeTypeId + officeType.getId() + ",");
         else {
           sb.append(officeType.getId() + ",");
         }
         officeDepositoryWithBLOBs.setId(officeType.getTypeDepository());
         officeDepositoryWithBLOBs.setOfficeTypeId(sb.toString());
         int i1 = this.officeDepositoryMapper.updateByPrimaryKeySelective(officeDepositoryWithBLOBs);
         json.setFlag(0);
         json.setMsg("ok");
       }
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> editOfficeType(OfficeType OfficeType)
   {
     ToJson json = new ToJson(1, "err");
     try {
       int i = this.officeTypeMapper.updateByPrimaryKeySelective(OfficeType);
       if (i > 0) {
         json.setMsg("ok");
         json.setFlag(0);
       }
     } catch (Exception e) {
       json.setMsg(e.getMessage());
       json.setFlag(1);
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<Object> deleteOfficeTypeById(Integer id)
   {
     ToJson json = new ToJson(1, "err");
     try {
       OfficeType officeType = this.officeTypeMapper.selectByPrimaryKey(id);
       Integer typeDepository = officeType.getTypeDepository();
       OfficeDepositoryWithBLOBs officeDepositoryWithBLOBs1 = this.officeDepositoryMapper.selectByPrimaryKey(typeDepository);
       String officeTypeId = officeDepositoryWithBLOBs1.getOfficeTypeId();
       int i1;
       if (!StringUtils.checkNull(officeTypeId).booleanValue())
       {
         if (officeTypeId.startsWith(String.valueOf(typeDepository) + ",")) {
           OfficeDepositoryWithBLOBs officeDepositoryWithBLOBs = new OfficeDepositoryWithBLOBs();
           officeDepositoryWithBLOBs.setId(typeDepository);
           officeTypeId.replace(String.valueOf(typeDepository) + ",", "");
           officeDepositoryWithBLOBs.setOfficeTypeId(officeTypeId);
           i1 = this.officeDepositoryMapper.updateByPrimaryKeySelective(officeDepositoryWithBLOBs);
         }
         if (officeTypeId.contains("," + String.valueOf(typeDepository) + ",")) {
           OfficeDepositoryWithBLOBs officeDepositoryWithBLOBs = new OfficeDepositoryWithBLOBs();
           officeDepositoryWithBLOBs.setId(typeDepository);
           officeTypeId.replace("," + String.valueOf(typeDepository) + ",", ",");
           officeDepositoryWithBLOBs.setOfficeTypeId(officeTypeId);
           i1 = this.officeDepositoryMapper.updateByPrimaryKeySelective(officeDepositoryWithBLOBs);
         }
       }
 
       int i = this.officeTypeMapper.deleteByPrimaryKey(id);
       if (i > 0) {
         json.setFlag(0);
         json.setMsg("ok");
       }
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 
   public String getTypeNameByTypeIds(String typeIds) {
     StringBuffer str = new StringBuffer();
     String[] strArr = typeIds.split(",");
     for (int i = 0; i < strArr.length; i++) {
       OfficeType type = this.officeTypeMapper.selectByPrimaryKey(Integer.valueOf(strArr[i]));
       if ((type == null) || 
         (StringUtils.checkNull(type.getTypeName()).booleanValue())) continue;
       if (i < strArr.length - 1)
         str.append(type.getTypeName() + ",");
       else {
         str.append(type.getTypeName());
       }
 
     }
 
     return str.toString();
   }
 
   public ToJson<OfficeType> selectAllOffType(HttpServletRequest request, String typeDepository)
   {
     ToJson json = new ToJson();
     try {
       List<OfficeType> officeTypes = this.officeTypeMapper.selectDownObject(typeDepository);
       for (OfficeType officeType : officeTypes) {
         Integer typeDepository1 = officeType.getTypeDepository();
         if (typeDepository1 != null) {
           OfficeDepositoryWithBLOBs officeDepositoryWithBLOBs = this.officeDepositoryMapper.selectByPrimaryKey(typeDepository1);
           if (officeDepositoryWithBLOBs != null) {
             officeType.setTypeDepositoryName(officeDepositoryWithBLOBs.getDepositoryName());
           }
         }
       }
 
       json.setObj(officeTypes);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg("err");
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<OfficeType> getOfficeTypeById(Integer id)
   {
     ToJson json = new ToJson(1, "err");
     try {
       OfficeType officeType = this.officeTypeMapper.selectByPrimaryKey(id);
       Integer typeDepository1 = officeType.getTypeDepository();
       if (typeDepository1 != null) {
         OfficeDepositoryWithBLOBs officeDepositoryWithBLOBs = this.officeDepositoryMapper.selectByPrimaryKey(typeDepository1);
         if (officeDepositoryWithBLOBs != null) {
           officeType.setTypeDepositoryName(officeDepositoryWithBLOBs.getDepositoryName());
         }
       }
       json.setMsg("ok");
       json.setFlag(0);
       json.setObject(officeType);
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 
   public ToJson<OfficeType> getDepositoryByProType(String officeProType)
   {
     ToJson json = new ToJson(1, "err");
     try {
       OfficeType officeType = this.officeTypeMapper.selectOffTypeByProType(officeProType);
       json.setFlag(0);
       json.setObject(officeType);
       json.setMsg("ok");
     } catch (Exception e) {
       json.setFlag(1);
       json.setMsg(e.getMessage());
       e.printStackTrace();
     }
     return json;
   }
 }

