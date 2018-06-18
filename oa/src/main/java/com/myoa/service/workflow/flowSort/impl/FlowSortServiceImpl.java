 package com.myoa.service.workflow.flowSort.impl;
 
 import com.myoa.dao.workflow.FlowSortMapper;
import com.myoa.dao.workflow.FlowTypeModelMapper;
import com.myoa.model.workflow.FlowSort;
import com.myoa.model.workflow.FlowTypeModel;
import com.myoa.service.workflow.flowSort.FlowSortService;
import com.myoa.util.ToJson;

 import java.util.ArrayList;
 import java.util.List;
 import javax.annotation.Resource;
import org.springframework.stereotype.Service;
 
 @Service
 public class FlowSortServiceImpl
   implements FlowSortService
 {
 
   @Resource
   private FlowSortMapper flowSortMapper;
 
   @Resource
   private FlowTypeModelMapper flowTypeModelMapper;
 
   public ToJson<FlowSort> getFlowTypes()
   {
     ToJson json = new ToJson();
     try {
       List flowSorts = new ArrayList();
       getFlowSorts(flowSorts, null, null, Integer.valueOf(0));
       json.setObj(flowSorts);
       json.setMsg("ok");
       json.setFlag(0);
     } catch (Exception e) {
       e.printStackTrace();
       json.setMsg("err");
       json.setFlag(1);
     }
 
     return json;
   }
 
   private void getFlowSorts(List<FlowSort> flowSorts, List<FlowSort> flowSortsChildren, FlowSort parentF, Integer sortId)
   {
     if (sortId.intValue() == 0) {
       flowSorts.addAll(this.flowSortMapper.getChildDatas(Integer.valueOf(0)));
     }
 
     if (parentF == null)
     {
       if ((flowSorts != null) && (flowSorts.size() > 0))
         for (FlowSort f : flowSorts)
         {
           if ((f != null) && (f.getSortId() != null) && (f.getSortId().intValue() != 0))
           {
             List<FlowTypeModel> flowTypeModels = this.flowTypeModelMapper.selectBySortid(f.getSortId());
             List AllFlow = new ArrayList();
             for (FlowTypeModel ff : flowTypeModels) {
               AllFlow.add(ff);
             }
             List<FlowSort> childDatas = this.flowSortMapper.getChildDatas(f.getSortId());
             if ((childDatas != null) && (childDatas.size() > 0)) {
               for (FlowSort f2 : childDatas) {
                 List<FlowTypeModel> flowTypeModels2 = this.flowTypeModelMapper.selectBySortid(f2.getSortId());
                 for (FlowTypeModel ff : flowTypeModels2) {
                   AllFlow.add(ff);
                 }
 
               }
 
             }
 
             f.setFlowTypeModels(AllFlow);
           }
         }
     }
     else
       for (FlowSort f : flowSortsChildren)
       {
         if ((f != null) && (f.getSortId() != null) && (f.getSortId().intValue() != 0))
         {
           List<FlowTypeModel> flowTypeModels = this.flowTypeModelMapper.selectBySortid(f.getSortId());
           List AllFlow = new ArrayList();
           for (FlowTypeModel ff : flowTypeModels) {
             AllFlow.add(ff);
           }
           if (f.getHaveChild().equals(Integer.valueOf(1))) {
             List<FlowSort> childDatas = this.flowSortMapper.getChildDatas(f.getSortId());
             if ((childDatas != null) && (childDatas.size() > 0)) {
               for (FlowSort f2 : childDatas) {
                 List<FlowTypeModel> flowTypeModels2 = this.flowTypeModelMapper.selectBySortid(f2.getSortId());
                 for (FlowTypeModel ff : flowTypeModels2) {
                   AllFlow.add(ff);
                 }
 
               }
 
             }
 
           }
 
           f.setFlowTypeModels(AllFlow);
         }
       }
   }
 
   public ToJson<FlowSort> getSortAndType()
   {
     ToJson json = new ToJson(1, "error");
     try {
       List list = this.flowSortMapper.getChildDatas(Integer.valueOf(0));
       getSortAndTypeByDigui(list);
       json.setObj(list);
       json.setFlag(0);
       json.setMsg("ok");
     } catch (Exception e) {
       e.printStackTrace();
     }
     return json;
   }
 
   void getSortAndTypeByDigui(List<FlowSort> list) {
     for (FlowSort flowSort : list) {
       List list1 = this.flowSortMapper.getChildDatas(flowSort.getSortId());
       flowSort.setFlowTypeModels(this.flowTypeModelMapper.selByFlowSort(flowSort.getSortId()));
       if (list1.size() > 0) {
         flowSort.setChilds(list1);
         flowSort.setHaveChild("1");
         getSortAndTypeByDigui(list1);
       }
     }
   }
 }
