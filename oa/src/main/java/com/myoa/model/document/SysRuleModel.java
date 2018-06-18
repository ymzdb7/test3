 package com.myoa.model.document;
 
 import java.util.List;
 
 public class SysRuleModel
 {
   private String id;
   private String name;
   private String orderId;
   private String expression;
   private String description;
   private Integer counter;
   private String digit;
   private String code;
   private String expressionStr;
   private List<String> ruleTitles;
   private List<String> ruleExps;
 
   public List<String> getRuleTitles()
   {
     return this.ruleTitles;
   }
 
   public void setRuleTitles(List<String> ruleTitles) {
     this.ruleTitles = ruleTitles;
   }
 
   public List<String> getRuleExps() {
     return this.ruleExps;
   }
 
   public void setRuleExps(List<String> ruleExps) {
     this.ruleExps = ruleExps;
   }
 
   public String getExpressionStr() {
     return this.expressionStr;
   }
 
   public void setExpressionStr(String expressionStr) {
     this.expressionStr = expressionStr;
   }
 
   public String getId() {
     return this.id;
   }
 
   public void setId(String id) {
     this.id = id;
   }
 
   public String getName() {
     return this.name;
   }
 
   public void setName(String name) {
     this.name = name;
   }
 
   public String getOrderId() {
     return this.orderId;
   }
 
   public void setOrderId(String orderId) {
     this.orderId = orderId;
   }
 
   public String getExpression() {
     return this.expression;
   }
 
   public void setExpression(String expression) {
     this.expression = expression;
   }
 
   public String getDescription() {
     return this.description;
   }
 
   public void setDescription(String description) {
     this.description = description;
   }
 
   public Integer getCounter() {
     return this.counter;
   }
 
   public void setCounter(Integer counter) {
     this.counter = counter;
   }
 
   public String getDigit() {
     return this.digit;
   }
 
   public void setDigit(String digit) {
     this.digit = digit;
   }
 
   public String getCode() {
     return this.code;
   }
 
   public void setCode(String code) {
     this.code = code;
   }
 }

