package com.myoa.model.book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookManageExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<Criteria> oredCriteria;

	public BookManageExample() {
		this.oredCriteria = new ArrayList();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return this.orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return this.distinct;
	}

	public List<Criteria> getOredCriteria() {
		return this.oredCriteria;
	}

	public void or(Criteria criteria) {
		this.oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		this.oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (this.oredCriteria.size() == 0) {
			this.oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		this.oredCriteria.clear();
		this.orderByClause = null;
		this.distinct = false;
	}

	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
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

		protected Criterion(String condition) {
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if ((value instanceof List))
				this.listValue = true;
			else
				this.singleValue = true;
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	public static class Criteria extends BookManageExample.GeneratedCriteria {
	}

	protected static abstract class GeneratedCriteria {
		protected List<BookManageExample.Criterion> criteria;

		protected GeneratedCriteria() {
			this.criteria = new ArrayList();
		}

		public boolean isValid() {
			return this.criteria.size() > 0;
		}

		public List<BookManageExample.Criterion> getAllCriteria() {
			return this.criteria;
		}

		public List<BookManageExample.Criterion> getCriteria() {
			return this.criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			this.criteria.add(new BookManageExample.Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			this.criteria
					.add(new BookManageExample.Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			this.criteria.add(new BookManageExample.Criterion(condition,
					value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition,
				java.util.Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition,
				List<java.util.Date> values, String property) {
			if ((values == null) || (values.size() == 0)) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List dateList = new ArrayList();
			Iterator iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(((java.util.Date) iter.next())
						.getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition,
				java.util.Date value1, java.util.Date value2, String property) {
			if ((value1 == null) || (value2 == null)) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public BookManageExample.Criteria andBorrowIdIsNull() {
			addCriterion("BORROW_ID is null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowIdIsNotNull() {
			addCriterion("BORROW_ID is not null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowIdEqualTo(Integer value) {
			addCriterion("BORROW_ID =", value, "borrowId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowIdNotEqualTo(Integer value) {
			addCriterion("BORROW_ID <>", value, "borrowId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowIdGreaterThan(Integer value) {
			addCriterion("BORROW_ID >", value, "borrowId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowIdGreaterThanOrEqualTo(
				Integer value) {
			addCriterion("BORROW_ID >=", value, "borrowId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowIdLessThan(Integer value) {
			addCriterion("BORROW_ID <", value, "borrowId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowIdLessThanOrEqualTo(
				Integer value) {
			addCriterion("BORROW_ID <=", value, "borrowId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowIdIn(List<Integer> values) {
			addCriterion("BORROW_ID in", values, "borrowId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowIdNotIn(List<Integer> values) {
			addCriterion("BORROW_ID not in", values, "borrowId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowIdBetween(Integer value1,
				Integer value2) {
			addCriterion("BORROW_ID between", value1, value2, "borrowId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowIdNotBetween(Integer value1,
				Integer value2) {
			addCriterion("BORROW_ID not between", value1, value2, "borrowId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdIsNull() {
			addCriterion("BUSER_ID is null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdIsNotNull() {
			addCriterion("BUSER_ID is not null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdEqualTo(String value) {
			addCriterion("BUSER_ID =", value, "buserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdNotEqualTo(String value) {
			addCriterion("BUSER_ID <>", value, "buserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdGreaterThan(String value) {
			addCriterion("BUSER_ID >", value, "buserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("BUSER_ID >=", value, "buserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdLessThan(String value) {
			addCriterion("BUSER_ID <", value, "buserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdLessThanOrEqualTo(
				String value) {
			addCriterion("BUSER_ID <=", value, "buserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdLike(String value) {
			addCriterion("BUSER_ID like", value, "buserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdNotLike(String value) {
			addCriterion("BUSER_ID not like", value, "buserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdIn(List<String> values) {
			addCriterion("BUSER_ID in", values, "buserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdNotIn(List<String> values) {
			addCriterion("BUSER_ID not in", values, "buserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdBetween(String value1,
				String value2) {
			addCriterion("BUSER_ID between", value1, value2, "buserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBuserIdNotBetween(String value1,
				String value2) {
			addCriterion("BUSER_ID not between", value1, value2, "buserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoIsNull() {
			addCriterion("BOOK_NO is null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoIsNotNull() {
			addCriterion("BOOK_NO is not null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoEqualTo(String value) {
			addCriterion("BOOK_NO =", value, "bookNo");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoNotEqualTo(String value) {
			addCriterion("BOOK_NO <>", value, "bookNo");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoGreaterThan(String value) {
			addCriterion("BOOK_NO >", value, "bookNo");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoGreaterThanOrEqualTo(
				String value) {
			addCriterion("BOOK_NO >=", value, "bookNo");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoLessThan(String value) {
			addCriterion("BOOK_NO <", value, "bookNo");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoLessThanOrEqualTo(
				String value) {
			addCriterion("BOOK_NO <=", value, "bookNo");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoLike(String value) {
			addCriterion("BOOK_NO like", value, "bookNo");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoNotLike(String value) {
			addCriterion("BOOK_NO not like", value, "bookNo");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoIn(List<String> values) {
			addCriterion("BOOK_NO in", values, "bookNo");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoNotIn(List<String> values) {
			addCriterion("BOOK_NO not in", values, "bookNo");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoBetween(String value1,
				String value2) {
			addCriterion("BOOK_NO between", value1, value2, "bookNo");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookNoNotBetween(String value1,
				String value2) {
			addCriterion("BOOK_NO not between", value1, value2, "bookNo");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowDateIsNull() {
			addCriterion("BORROW_DATE is null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowDateIsNotNull() {
			addCriterion("BORROW_DATE is not null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BORROW_DATE =", value, "borrowDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BORROW_DATE <>", value, "borrowDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("BORROW_DATE >", value, "borrowDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BORROW_DATE >=", value, "borrowDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("BORROW_DATE <", value, "borrowDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("BORROW_DATE <=", value, "borrowDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("BORROW_DATE in", values, "borrowDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("BORROW_DATE not in", values, "borrowDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("BORROW_DATE between", value1, value2,
					"borrowDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBorrowDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("BORROW_DATE not between", value1, value2,
					"borrowDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdIsNull() {
			addCriterion("RUSER_ID is null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdIsNotNull() {
			addCriterion("RUSER_ID is not null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdEqualTo(String value) {
			addCriterion("RUSER_ID =", value, "ruserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdNotEqualTo(String value) {
			addCriterion("RUSER_ID <>", value, "ruserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdGreaterThan(String value) {
			addCriterion("RUSER_ID >", value, "ruserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdGreaterThanOrEqualTo(
				String value) {
			addCriterion("RUSER_ID >=", value, "ruserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdLessThan(String value) {
			addCriterion("RUSER_ID <", value, "ruserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdLessThanOrEqualTo(
				String value) {
			addCriterion("RUSER_ID <=", value, "ruserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdLike(String value) {
			addCriterion("RUSER_ID like", value, "ruserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdNotLike(String value) {
			addCriterion("RUSER_ID not like", value, "ruserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdIn(List<String> values) {
			addCriterion("RUSER_ID in", values, "ruserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdNotIn(List<String> values) {
			addCriterion("RUSER_ID not in", values, "ruserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdBetween(String value1,
				String value2) {
			addCriterion("RUSER_ID between", value1, value2, "ruserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRuserIdNotBetween(String value1,
				String value2) {
			addCriterion("RUSER_ID not between", value1, value2, "ruserId");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andReturnDateIsNull() {
			addCriterion("RETURN_DATE is null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andReturnDateIsNotNull() {
			addCriterion("RETURN_DATE is not null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andReturnDateEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("RETURN_DATE =", value, "returnDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andReturnDateNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("RETURN_DATE <>", value, "returnDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andReturnDateGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("RETURN_DATE >", value, "returnDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andReturnDateGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("RETURN_DATE >=", value, "returnDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andReturnDateLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("RETURN_DATE <", value, "returnDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andReturnDateLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("RETURN_DATE <=", value, "returnDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andReturnDateIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("RETURN_DATE in", values, "returnDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andReturnDateNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("RETURN_DATE not in", values, "returnDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andReturnDateBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("RETURN_DATE between", value1, value2,
					"returnDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andReturnDateNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("RETURN_DATE not between", value1, value2,
					"returnDate");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusIsNull() {
			addCriterion("BOOK_STATUS is null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusIsNotNull() {
			addCriterion("BOOK_STATUS is not null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusEqualTo(String value) {
			addCriterion("BOOK_STATUS =", value, "bookStatus");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusNotEqualTo(String value) {
			addCriterion("BOOK_STATUS <>", value, "bookStatus");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusGreaterThan(String value) {
			addCriterion("BOOK_STATUS >", value, "bookStatus");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusGreaterThanOrEqualTo(
				String value) {
			addCriterion("BOOK_STATUS >=", value, "bookStatus");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusLessThan(String value) {
			addCriterion("BOOK_STATUS <", value, "bookStatus");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusLessThanOrEqualTo(
				String value) {
			addCriterion("BOOK_STATUS <=", value, "bookStatus");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusLike(String value) {
			addCriterion("BOOK_STATUS like", value, "bookStatus");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusNotLike(String value) {
			addCriterion("BOOK_STATUS not like", value, "bookStatus");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusIn(List<String> values) {
			addCriterion("BOOK_STATUS in", values, "bookStatus");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusNotIn(List<String> values) {
			addCriterion("BOOK_STATUS not in", values, "bookStatus");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusBetween(String value1,
				String value2) {
			addCriterion("BOOK_STATUS between", value1, value2, "bookStatus");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andBookStatusNotBetween(
				String value1, String value2) {
			addCriterion("BOOK_STATUS not between", value1, value2,
					"bookStatus");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRealReturnTimeIsNull() {
			addCriterion("REAL_RETURN_TIME is null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRealReturnTimeIsNotNull() {
			addCriterion("REAL_RETURN_TIME is not null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRealReturnTimeEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("REAL_RETURN_TIME =", value,
					"realReturnTime");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRealReturnTimeNotEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("REAL_RETURN_TIME <>", value,
					"realReturnTime");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRealReturnTimeGreaterThan(
				java.util.Date value) {
			addCriterionForJDBCDate("REAL_RETURN_TIME >", value,
					"realReturnTime");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRealReturnTimeGreaterThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("REAL_RETURN_TIME >=", value,
					"realReturnTime");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRealReturnTimeLessThan(
				java.util.Date value) {
			addCriterionForJDBCDate("REAL_RETURN_TIME <", value,
					"realReturnTime");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRealReturnTimeLessThanOrEqualTo(
				java.util.Date value) {
			addCriterionForJDBCDate("REAL_RETURN_TIME <=", value,
					"realReturnTime");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRealReturnTimeIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("REAL_RETURN_TIME in", values,
					"realReturnTime");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRealReturnTimeNotIn(
				List<java.util.Date> values) {
			addCriterionForJDBCDate("REAL_RETURN_TIME not in", values,
					"realReturnTime");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRealReturnTimeBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("REAL_RETURN_TIME between", value1, value2,
					"realReturnTime");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRealReturnTimeNotBetween(
				java.util.Date value1, java.util.Date value2) {
			addCriterionForJDBCDate("REAL_RETURN_TIME not between", value1,
					value2, "realReturnTime");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagIsNull() {
			addCriterion("DELETE_FLAG is null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagIsNotNull() {
			addCriterion("DELETE_FLAG is not null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagEqualTo(String value) {
			addCriterion("DELETE_FLAG =", value, "deleteFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagNotEqualTo(String value) {
			addCriterion("DELETE_FLAG <>", value, "deleteFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagGreaterThan(String value) {
			addCriterion("DELETE_FLAG >", value, "deleteFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagGreaterThanOrEqualTo(
				String value) {
			addCriterion("DELETE_FLAG >=", value, "deleteFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagLessThan(String value) {
			addCriterion("DELETE_FLAG <", value, "deleteFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagLessThanOrEqualTo(
				String value) {
			addCriterion("DELETE_FLAG <=", value, "deleteFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagLike(String value) {
			addCriterion("DELETE_FLAG like", value, "deleteFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagNotLike(String value) {
			addCriterion("DELETE_FLAG not like", value, "deleteFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagIn(List<String> values) {
			addCriterion("DELETE_FLAG in", values, "deleteFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagNotIn(List<String> values) {
			addCriterion("DELETE_FLAG not in", values, "deleteFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagBetween(String value1,
				String value2) {
			addCriterion("DELETE_FLAG between", value1, value2, "deleteFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andDeleteFlagNotBetween(
				String value1, String value2) {
			addCriterion("DELETE_FLAG not between", value1, value2,
					"deleteFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusIsNull() {
			addCriterion("STATUS is null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusIsNotNull() {
			addCriterion("STATUS is not null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusEqualTo(String value) {
			addCriterion("STATUS =", value, "status");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusNotEqualTo(String value) {
			addCriterion("STATUS <>", value, "status");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusGreaterThan(String value) {
			addCriterion("STATUS >", value, "status");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusGreaterThanOrEqualTo(
				String value) {
			addCriterion("STATUS >=", value, "status");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusLessThan(String value) {
			addCriterion("STATUS <", value, "status");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusLessThanOrEqualTo(
				String value) {
			addCriterion("STATUS <=", value, "status");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusLike(String value) {
			addCriterion("STATUS like", value, "status");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusNotLike(String value) {
			addCriterion("STATUS not like", value, "status");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusIn(List<String> values) {
			addCriterion("STATUS in", values, "status");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusNotIn(List<String> values) {
			addCriterion("STATUS not in", values, "status");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusBetween(String value1,
				String value2) {
			addCriterion("STATUS between", value1, value2, "status");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andStatusNotBetween(String value1,
				String value2) {
			addCriterion("STATUS not between", value1, value2, "status");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagIsNull() {
			addCriterion("REG_FLAG is null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagIsNotNull() {
			addCriterion("REG_FLAG is not null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagEqualTo(String value) {
			addCriterion("REG_FLAG =", value, "regFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagNotEqualTo(String value) {
			addCriterion("REG_FLAG <>", value, "regFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagGreaterThan(String value) {
			addCriterion("REG_FLAG >", value, "regFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagGreaterThanOrEqualTo(
				String value) {
			addCriterion("REG_FLAG >=", value, "regFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagLessThan(String value) {
			addCriterion("REG_FLAG <", value, "regFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagLessThanOrEqualTo(
				String value) {
			addCriterion("REG_FLAG <=", value, "regFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagLike(String value) {
			addCriterion("REG_FLAG like", value, "regFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagNotLike(String value) {
			addCriterion("REG_FLAG not like", value, "regFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagIn(List<String> values) {
			addCriterion("REG_FLAG in", values, "regFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagNotIn(List<String> values) {
			addCriterion("REG_FLAG not in", values, "regFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagBetween(String value1,
				String value2) {
			addCriterion("REG_FLAG between", value1, value2, "regFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRegFlagNotBetween(String value1,
				String value2) {
			addCriterion("REG_FLAG not between", value1, value2, "regFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagIsNull() {
			addCriterion("RENEW_FLAG is null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagIsNotNull() {
			addCriterion("RENEW_FLAG is not null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagEqualTo(String value) {
			addCriterion("RENEW_FLAG =", value, "renewFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagNotEqualTo(String value) {
			addCriterion("RENEW_FLAG <>", value, "renewFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagGreaterThan(String value) {
			addCriterion("RENEW_FLAG >", value, "renewFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagGreaterThanOrEqualTo(
				String value) {
			addCriterion("RENEW_FLAG >=", value, "renewFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagLessThan(String value) {
			addCriterion("RENEW_FLAG <", value, "renewFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagLessThanOrEqualTo(
				String value) {
			addCriterion("RENEW_FLAG <=", value, "renewFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagLike(String value) {
			addCriterion("RENEW_FLAG like", value, "renewFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagNotLike(String value) {
			addCriterion("RENEW_FLAG not like", value, "renewFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagIn(List<String> values) {
			addCriterion("RENEW_FLAG in", values, "renewFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagNotIn(List<String> values) {
			addCriterion("RENEW_FLAG not in", values, "renewFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagBetween(String value1,
				String value2) {
			addCriterion("RENEW_FLAG between", value1, value2, "renewFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andRenewFlagNotBetween(String value1,
				String value2) {
			addCriterion("RENEW_FLAG not between", value1, value2, "renewFlag");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmIsNull() {
			addCriterion("WHO_CONFIRM is null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmIsNotNull() {
			addCriterion("WHO_CONFIRM is not null");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmEqualTo(String value) {
			addCriterion("WHO_CONFIRM =", value, "whoConfirm");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmNotEqualTo(String value) {
			addCriterion("WHO_CONFIRM <>", value, "whoConfirm");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmGreaterThan(String value) {
			addCriterion("WHO_CONFIRM >", value, "whoConfirm");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmGreaterThanOrEqualTo(
				String value) {
			addCriterion("WHO_CONFIRM >=", value, "whoConfirm");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmLessThan(String value) {
			addCriterion("WHO_CONFIRM <", value, "whoConfirm");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmLessThanOrEqualTo(
				String value) {
			addCriterion("WHO_CONFIRM <=", value, "whoConfirm");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmLike(String value) {
			addCriterion("WHO_CONFIRM like", value, "whoConfirm");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmNotLike(String value) {
			addCriterion("WHO_CONFIRM not like", value, "whoConfirm");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmIn(List<String> values) {
			addCriterion("WHO_CONFIRM in", values, "whoConfirm");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmNotIn(List<String> values) {
			addCriterion("WHO_CONFIRM not in", values, "whoConfirm");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmBetween(String value1,
				String value2) {
			addCriterion("WHO_CONFIRM between", value1, value2, "whoConfirm");
			return (BookManageExample.Criteria) this;
		}

		public BookManageExample.Criteria andWhoConfirmNotBetween(
				String value1, String value2) {
			addCriterion("WHO_CONFIRM not between", value1, value2,
					"whoConfirm");
			return (BookManageExample.Criteria) this;
		}
	}
}
