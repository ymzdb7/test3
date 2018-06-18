 package com.myoa.kg.controller;

 import com.myoa.kg.model.KgSignKey;
import com.myoa.kg.model.KgSignature;
import com.myoa.kg.service.KgService;
import com.myoa.model.users.Users;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;

 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
 @RestController
 @RequestMapping({"/kg"})
 public class KgController
 {
 
   @Autowired
   KgService kgService;
 
   @RequestMapping({"/getAllSignature"})
   public BaseWrappers getAllSignatures()
   {
     return this.kgService.getAllSignatures();
   }
   @RequestMapping({"/getUserSignature"})
   public BaseWrappers getUserSignature(HttpServletRequest request) {
     Users users = (Users)SessionUtils.getSessionInfo(request.getSession(), Users.class, new Users());
     Integer uid = null;
     if ((users != null) && (users.getUid() != null)) {
       uid = users.getUid();
     }
     return this.kgService.getUserSignature(uid);
   }
   @ResponseBody
   @RequestMapping({"/getKgSignatureList"})
   public BaseWrapper getKgSignatureList() {
     return this.kgService.getKgSignatureList();
   }
   @ResponseBody
   @RequestMapping({"/getKgSignKeyList"})
   public BaseWrapper getKgSignKeyList(Integer signId) {
     return this.kgService.getKgSignKeyList(signId);
   }
   @ResponseBody
   @RequestMapping({"/addKgSignature"})
   public BaseWrapper addKgSignature(KgSignature kgSignature) {
     return this.kgService.addKgSignature(kgSignature);
   }
   @ResponseBody
   @RequestMapping({"/addKgSignKey"})
   public BaseWrapper addKgSignKey(KgSignKey kgSignKey, Integer signId) {
     return this.kgService.addKgSignKey(kgSignKey, signId);
   }
   @ResponseBody
   @RequestMapping({"/updateKgSignature"})
   public BaseWrapper updateKgSignature(KgSignature kgSignature) {
     return this.kgService.updateKgSignature(kgSignature);
   }
   @ResponseBody
   @RequestMapping({"/updateKgSignKey"})
   public BaseWrapper updateKgSignKey(KgSignKey kgSignKey) {
     return this.kgService.updateKgSignKey(kgSignKey);
   }
   @ResponseBody
   @RequestMapping({"/deleteKgSignature"})
   public BaseWrapper deleteKgSignature(Integer signatureId) {
     return this.kgService.deleteKgSignature(signatureId);
   }
   @ResponseBody
   @RequestMapping({"/deleteKgSignKey"})
   public BaseWrapper deleteKgSignKey(Integer signkeyId) {
     return this.kgService.deleteKgSignKey(signkeyId);
   }
   @ResponseBody
   @RequestMapping({"/getKgSignatureByKey"})
   public BaseWrapper getKgSignatureByKey(Integer signatureId) {
     return this.kgService.getKgSignatureByKey(signatureId);
   }
   @ResponseBody
   @RequestMapping({"/getKgSignKetByKey"})
   public BaseWrapper getKgSignKetByKey(Integer signkeyId) {
     return this.kgService.getKgSignKetByKey(signkeyId);
   }
 }

