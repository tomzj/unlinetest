package com.ryoukai.unlinetest.pojo;

import java.util.ArrayList;
import java.util.List;

public class AnswertestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswertestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAnswertestIdIsNull() {
            addCriterion("answertest_id is null");
            return (Criteria) this;
        }

        public Criteria andAnswertestIdIsNotNull() {
            addCriterion("answertest_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnswertestIdEqualTo(Integer value) {
            addCriterion("answertest_id =", value, "answertestId");
            return (Criteria) this;
        }

        public Criteria andAnswertestIdNotEqualTo(Integer value) {
            addCriterion("answertest_id <>", value, "answertestId");
            return (Criteria) this;
        }

        public Criteria andAnswertestIdGreaterThan(Integer value) {
            addCriterion("answertest_id >", value, "answertestId");
            return (Criteria) this;
        }

        public Criteria andAnswertestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("answertest_id >=", value, "answertestId");
            return (Criteria) this;
        }

        public Criteria andAnswertestIdLessThan(Integer value) {
            addCriterion("answertest_id <", value, "answertestId");
            return (Criteria) this;
        }

        public Criteria andAnswertestIdLessThanOrEqualTo(Integer value) {
            addCriterion("answertest_id <=", value, "answertestId");
            return (Criteria) this;
        }

        public Criteria andAnswertestIdIn(List<Integer> values) {
            addCriterion("answertest_id in", values, "answertestId");
            return (Criteria) this;
        }

        public Criteria andAnswertestIdNotIn(List<Integer> values) {
            addCriterion("answertest_id not in", values, "answertestId");
            return (Criteria) this;
        }

        public Criteria andAnswertestIdBetween(Integer value1, Integer value2) {
            addCriterion("answertest_id between", value1, value2, "answertestId");
            return (Criteria) this;
        }

        public Criteria andAnswertestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("answertest_id not between", value1, value2, "answertestId");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNull() {
            addCriterion("test_id is null");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNotNull() {
            addCriterion("test_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestIdEqualTo(Integer value) {
            addCriterion("test_id =", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotEqualTo(Integer value) {
            addCriterion("test_id <>", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThan(Integer value) {
            addCriterion("test_id >", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_id >=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThan(Integer value) {
            addCriterion("test_id <", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_id <=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdIn(List<Integer> values) {
            addCriterion("test_id in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotIn(List<Integer> values) {
            addCriterion("test_id not in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdBetween(Integer value1, Integer value2) {
            addCriterion("test_id between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_id not between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathIsNull() {
            addCriterion("answertest_path is null");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathIsNotNull() {
            addCriterion("answertest_path is not null");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathEqualTo(String value) {
            addCriterion("answertest_path =", value, "answertestPath");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathNotEqualTo(String value) {
            addCriterion("answertest_path <>", value, "answertestPath");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathGreaterThan(String value) {
            addCriterion("answertest_path >", value, "answertestPath");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathGreaterThanOrEqualTo(String value) {
            addCriterion("answertest_path >=", value, "answertestPath");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathLessThan(String value) {
            addCriterion("answertest_path <", value, "answertestPath");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathLessThanOrEqualTo(String value) {
            addCriterion("answertest_path <=", value, "answertestPath");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathLike(String value) {
            addCriterion("answertest_path like", value, "answertestPath");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathNotLike(String value) {
            addCriterion("answertest_path not like", value, "answertestPath");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathIn(List<String> values) {
            addCriterion("answertest_path in", values, "answertestPath");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathNotIn(List<String> values) {
            addCriterion("answertest_path not in", values, "answertestPath");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathBetween(String value1, String value2) {
            addCriterion("answertest_path between", value1, value2, "answertestPath");
            return (Criteria) this;
        }

        public Criteria andAnswertestPathNotBetween(String value1, String value2) {
            addCriterion("answertest_path not between", value1, value2, "answertestPath");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
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
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
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
}