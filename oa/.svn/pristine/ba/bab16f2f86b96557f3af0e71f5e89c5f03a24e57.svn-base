package com.myoa.model.event;

import java.util.ArrayList;
import java.util.List;

public class TimeLineViewDeptExample
{
  protected String orderByClause;
  protected boolean distinct;
  protected List<Criteria> oredCriteria;

  public TimeLineViewDeptExample()
  {
    this.oredCriteria = new ArrayList();
  }

  public void setOrderByClause(String orderByClause)
  {
    this.orderByClause = orderByClause;
  }

  public String getOrderByClause()
  {
    return this.orderByClause;
  }

  public void setDistinct(boolean distinct)
  {
    this.distinct = distinct;
  }

  public boolean isDistinct()
  {
    return this.distinct;
  }

  public List<Criteria> getOredCriteria()
  {
    return this.oredCriteria;
  }

  public void or(Criteria criteria)
  {
    this.oredCriteria.add(criteria);
  }

  public Criteria or()
  {
    Criteria criteria = createCriteriaInternal();
    this.oredCriteria.add(criteria);
    return criteria;
  }

  public Criteria createCriteria()
  {
    Criteria criteria = createCriteriaInternal();
    if (this.oredCriteria.size() == 0) {
      this.oredCriteria.add(criteria);
    }
    return criteria;
  }

  protected Criteria createCriteriaInternal()
  {
    Criteria criteria = new Criteria();
    return criteria;
  }

  public void clear()
  {
    this.oredCriteria.clear();
    this.orderByClause = null;
    this.distinct = false;
  }

  public static class Criterion
  {
    private String condition;
    private Object value;
    private Object secondValue;
    private boolean noValue;
    private boolean singleValue;
     private boolean betweenValue;
     private boolean listValue;
     private String typeHandler;
 
     public String getCondition()
     {
       return this.condition;
     }
 
     public Object getValue() {
       return this.value;
     }
 
     public Object getSecondValue() {
       return this.secondValue;
     }
 
     public boolean isNoValue() {
       return this.noValue;
     }
 
     public boolean isSingleValue() {
       return this.singleValue;
     }
 
     public boolean isBetweenValue() {
       return this.betweenValue;
     }
 
     public boolean isListValue() {
       return this.listValue;
     }
 
     public String getTypeHandler() {
       return this.typeHandler;
     }
 
     protected Criterion(String condition)
     {
       this.condition = condition;
       this.typeHandler = null;
       this.noValue = true;
     }
 
     protected Criterion(String condition, Object value, String typeHandler)
     {
       this.condition = condition;
       this.value = value;
       this.typeHandler = typeHandler;
       if ((value instanceof List))
         this.listValue = true;
       else
         this.singleValue = true;
     }
 
     protected Criterion(String condition, Object value)
     {
       this(condition, value, null);
     }
 
     protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
     {
       this.condition = condition;
       this.value = value;
       this.secondValue = secondValue;
       this.typeHandler = typeHandler;
       this.betweenValue = true;
     }
 
     protected Criterion(String condition, Object value, Object secondValue) {
       this(condition, value, secondValue, null);
     }
   }
 
   public static class Criteria extends TimeLineViewDeptExample.GeneratedCriteria
   {
   }
 
   protected static abstract class GeneratedCriteria
   {
     protected List<TimeLineViewDeptExample.Criterion> criteria;
 
     protected GeneratedCriteria()
     {
       this.criteria = new ArrayList();
     }
 
     public boolean isValid() {
       return this.criteria.size() > 0;
     }
 
     public List<TimeLineViewDeptExample.Criterion> getAllCriteria() {
       return this.criteria;
     }
 
     public List<TimeLineViewDeptExample.Criterion> getCriteria() {
       return this.criteria;
     }
 
     protected void addCriterion(String condition) {
       if (condition == null) {
         throw new RuntimeException("Value for condition cannot be null");
       }
       this.criteria.add(new TimeLineViewDeptExample.Criterion(condition));
     }
 
     protected void addCriterion(String condition, Object value, String property) {
       if (value == null) {
         throw new RuntimeException("Value for " + property + " cannot be null");
       }
       this.criteria.add(new TimeLineViewDeptExample.Criterion(condition, value));
     }
 
     protected void addCriterion(String condition, Object value1, Object value2, String property) {
       if ((value1 == null) || (value2 == null)) {
         throw new RuntimeException("Between values for " + property + " cannot be null");
       }
       this.criteria.add(new TimeLineViewDeptExample.Criterion(condition, value1, value2));
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdIsNull() {
       addCriterion("TIMELINE_ID is null");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdIsNotNull() {
       addCriterion("TIMELINE_ID is not null");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdEqualTo(String value) {
       addCriterion("TIMELINE_ID =", value, "timelineId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdNotEqualTo(String value) {
       addCriterion("TIMELINE_ID <>", value, "timelineId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdGreaterThan(String value) {
       addCriterion("TIMELINE_ID >", value, "timelineId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdGreaterThanOrEqualTo(String value) {
       addCriterion("TIMELINE_ID >=", value, "timelineId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdLessThan(String value) {
       addCriterion("TIMELINE_ID <", value, "timelineId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdLessThanOrEqualTo(String value) {
       addCriterion("TIMELINE_ID <=", value, "timelineId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdLike(String value) {
       addCriterion("TIMELINE_ID like", value, "timelineId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdNotLike(String value) {
       addCriterion("TIMELINE_ID not like", value, "timelineId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdIn(List<String> values) {
       addCriterion("TIMELINE_ID in", values, "timelineId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdNotIn(List<String> values) {
       addCriterion("TIMELINE_ID not in", values, "timelineId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdBetween(String value1, String value2) {
       addCriterion("TIMELINE_ID between", value1, value2, "timelineId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andTimelineIdNotBetween(String value1, String value2) {
       addCriterion("TIMELINE_ID not between", value1, value2, "timelineId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andDeptIdIsNull() {
       addCriterion("DEPT_ID is null");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andDeptIdIsNotNull() {
       addCriterion("DEPT_ID is not null");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andDeptIdEqualTo(Integer value) {
       addCriterion("DEPT_ID =", value, "deptId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andDeptIdNotEqualTo(Integer value) {
       addCriterion("DEPT_ID <>", value, "deptId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andDeptIdGreaterThan(Integer value) {
       addCriterion("DEPT_ID >", value, "deptId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
 
     public TimeLineViewDeptExample.Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
       addCriterion("DEPT_ID >=", value, "deptId");
      return (TimeLineViewDeptExample.Criteria)this;
    }

    public TimeLineViewDeptExample.Criteria andDeptIdLessThan(Integer value) {
      addCriterion("DEPT_ID <", value, "deptId");
      return (TimeLineViewDeptExample.Criteria)this;
    }

    public TimeLineViewDeptExample.Criteria andDeptIdLessThanOrEqualTo(Integer value) {
      addCriterion("DEPT_ID <=", value, "deptId");
      return (TimeLineViewDeptExample.Criteria)this;
    }

    public TimeLineViewDeptExample.Criteria andDeptIdIn(List<Integer> values) {
      addCriterion("DEPT_ID in", values, "deptId");
      return (TimeLineViewDeptExample.Criteria)this;
    }

    public TimeLineViewDeptExample.Criteria andDeptIdNotIn(List<Integer> values) {
      addCriterion("DEPT_ID not in", values, "deptId");
      return (TimeLineViewDeptExample.Criteria)this;
    }

    public TimeLineViewDeptExample.Criteria andDeptIdBetween(Integer value1, Integer value2) {
      addCriterion("DEPT_ID between", value1, value2, "deptId");
      return (TimeLineViewDeptExample.Criteria)this;
    }

     public TimeLineViewDeptExample.Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
       addCriterion("DEPT_ID not between", value1, value2, "deptId");
       return (TimeLineViewDeptExample.Criteria)this;
     }
   }
 }

