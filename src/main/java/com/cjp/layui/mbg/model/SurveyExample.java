package com.cjp.layui.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SurveyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIsNull() {
            addCriterion("question_time is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIsNotNull() {
            addCriterion("question_time is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeEqualTo(Date value) {
            addCriterion("question_time =", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotEqualTo(Date value) {
            addCriterion("question_time <>", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeGreaterThan(Date value) {
            addCriterion("question_time >", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("question_time >=", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeLessThan(Date value) {
            addCriterion("question_time <", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeLessThanOrEqualTo(Date value) {
            addCriterion("question_time <=", value, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeIn(List<Date> values) {
            addCriterion("question_time in", values, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotIn(List<Date> values) {
            addCriterion("question_time not in", values, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeBetween(Date value1, Date value2) {
            addCriterion("question_time between", value1, value2, "questionTime");
            return (Criteria) this;
        }

        public Criteria andQuestionTimeNotBetween(Date value1, Date value2) {
            addCriterion("question_time not between", value1, value2, "questionTime");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andQuestion1IsNull() {
            addCriterion("question1 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion1IsNotNull() {
            addCriterion("question1 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion1EqualTo(String value) {
            addCriterion("question1 =", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotEqualTo(String value) {
            addCriterion("question1 <>", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1GreaterThan(String value) {
            addCriterion("question1 >", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1GreaterThanOrEqualTo(String value) {
            addCriterion("question1 >=", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1LessThan(String value) {
            addCriterion("question1 <", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1LessThanOrEqualTo(String value) {
            addCriterion("question1 <=", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1Like(String value) {
            addCriterion("question1 like", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotLike(String value) {
            addCriterion("question1 not like", value, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1In(List<String> values) {
            addCriterion("question1 in", values, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotIn(List<String> values) {
            addCriterion("question1 not in", values, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1Between(String value1, String value2) {
            addCriterion("question1 between", value1, value2, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion1NotBetween(String value1, String value2) {
            addCriterion("question1 not between", value1, value2, "question1");
            return (Criteria) this;
        }

        public Criteria andQuestion2IsNull() {
            addCriterion("question2 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion2IsNotNull() {
            addCriterion("question2 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion2EqualTo(String value) {
            addCriterion("question2 =", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotEqualTo(String value) {
            addCriterion("question2 <>", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2GreaterThan(String value) {
            addCriterion("question2 >", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2GreaterThanOrEqualTo(String value) {
            addCriterion("question2 >=", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2LessThan(String value) {
            addCriterion("question2 <", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2LessThanOrEqualTo(String value) {
            addCriterion("question2 <=", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2Like(String value) {
            addCriterion("question2 like", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotLike(String value) {
            addCriterion("question2 not like", value, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2In(List<String> values) {
            addCriterion("question2 in", values, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotIn(List<String> values) {
            addCriterion("question2 not in", values, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2Between(String value1, String value2) {
            addCriterion("question2 between", value1, value2, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion2NotBetween(String value1, String value2) {
            addCriterion("question2 not between", value1, value2, "question2");
            return (Criteria) this;
        }

        public Criteria andQuestion3IsNull() {
            addCriterion("question3 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion3IsNotNull() {
            addCriterion("question3 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion3EqualTo(String value) {
            addCriterion("question3 =", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotEqualTo(String value) {
            addCriterion("question3 <>", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3GreaterThan(String value) {
            addCriterion("question3 >", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3GreaterThanOrEqualTo(String value) {
            addCriterion("question3 >=", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3LessThan(String value) {
            addCriterion("question3 <", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3LessThanOrEqualTo(String value) {
            addCriterion("question3 <=", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3Like(String value) {
            addCriterion("question3 like", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotLike(String value) {
            addCriterion("question3 not like", value, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3In(List<String> values) {
            addCriterion("question3 in", values, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotIn(List<String> values) {
            addCriterion("question3 not in", values, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3Between(String value1, String value2) {
            addCriterion("question3 between", value1, value2, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion3NotBetween(String value1, String value2) {
            addCriterion("question3 not between", value1, value2, "question3");
            return (Criteria) this;
        }

        public Criteria andQuestion4IsNull() {
            addCriterion("question4 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion4IsNotNull() {
            addCriterion("question4 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion4EqualTo(String value) {
            addCriterion("question4 =", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotEqualTo(String value) {
            addCriterion("question4 <>", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4GreaterThan(String value) {
            addCriterion("question4 >", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4GreaterThanOrEqualTo(String value) {
            addCriterion("question4 >=", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4LessThan(String value) {
            addCriterion("question4 <", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4LessThanOrEqualTo(String value) {
            addCriterion("question4 <=", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4Like(String value) {
            addCriterion("question4 like", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotLike(String value) {
            addCriterion("question4 not like", value, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4In(List<String> values) {
            addCriterion("question4 in", values, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotIn(List<String> values) {
            addCriterion("question4 not in", values, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4Between(String value1, String value2) {
            addCriterion("question4 between", value1, value2, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion4NotBetween(String value1, String value2) {
            addCriterion("question4 not between", value1, value2, "question4");
            return (Criteria) this;
        }

        public Criteria andQuestion5IsNull() {
            addCriterion("question5 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion5IsNotNull() {
            addCriterion("question5 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion5EqualTo(String value) {
            addCriterion("question5 =", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotEqualTo(String value) {
            addCriterion("question5 <>", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5GreaterThan(String value) {
            addCriterion("question5 >", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5GreaterThanOrEqualTo(String value) {
            addCriterion("question5 >=", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5LessThan(String value) {
            addCriterion("question5 <", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5LessThanOrEqualTo(String value) {
            addCriterion("question5 <=", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5Like(String value) {
            addCriterion("question5 like", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotLike(String value) {
            addCriterion("question5 not like", value, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5In(List<String> values) {
            addCriterion("question5 in", values, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotIn(List<String> values) {
            addCriterion("question5 not in", values, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5Between(String value1, String value2) {
            addCriterion("question5 between", value1, value2, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion5NotBetween(String value1, String value2) {
            addCriterion("question5 not between", value1, value2, "question5");
            return (Criteria) this;
        }

        public Criteria andQuestion6IsNull() {
            addCriterion("question6 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion6IsNotNull() {
            addCriterion("question6 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion6EqualTo(String value) {
            addCriterion("question6 =", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotEqualTo(String value) {
            addCriterion("question6 <>", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6GreaterThan(String value) {
            addCriterion("question6 >", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6GreaterThanOrEqualTo(String value) {
            addCriterion("question6 >=", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6LessThan(String value) {
            addCriterion("question6 <", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6LessThanOrEqualTo(String value) {
            addCriterion("question6 <=", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6Like(String value) {
            addCriterion("question6 like", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotLike(String value) {
            addCriterion("question6 not like", value, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6In(List<String> values) {
            addCriterion("question6 in", values, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotIn(List<String> values) {
            addCriterion("question6 not in", values, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6Between(String value1, String value2) {
            addCriterion("question6 between", value1, value2, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion6NotBetween(String value1, String value2) {
            addCriterion("question6 not between", value1, value2, "question6");
            return (Criteria) this;
        }

        public Criteria andQuestion7IsNull() {
            addCriterion("question7 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion7IsNotNull() {
            addCriterion("question7 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion7EqualTo(String value) {
            addCriterion("question7 =", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7NotEqualTo(String value) {
            addCriterion("question7 <>", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7GreaterThan(String value) {
            addCriterion("question7 >", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7GreaterThanOrEqualTo(String value) {
            addCriterion("question7 >=", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7LessThan(String value) {
            addCriterion("question7 <", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7LessThanOrEqualTo(String value) {
            addCriterion("question7 <=", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7Like(String value) {
            addCriterion("question7 like", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7NotLike(String value) {
            addCriterion("question7 not like", value, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7In(List<String> values) {
            addCriterion("question7 in", values, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7NotIn(List<String> values) {
            addCriterion("question7 not in", values, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7Between(String value1, String value2) {
            addCriterion("question7 between", value1, value2, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion7NotBetween(String value1, String value2) {
            addCriterion("question7 not between", value1, value2, "question7");
            return (Criteria) this;
        }

        public Criteria andQuestion8IsNull() {
            addCriterion("question8 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion8IsNotNull() {
            addCriterion("question8 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion8EqualTo(String value) {
            addCriterion("question8 =", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8NotEqualTo(String value) {
            addCriterion("question8 <>", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8GreaterThan(String value) {
            addCriterion("question8 >", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8GreaterThanOrEqualTo(String value) {
            addCriterion("question8 >=", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8LessThan(String value) {
            addCriterion("question8 <", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8LessThanOrEqualTo(String value) {
            addCriterion("question8 <=", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8Like(String value) {
            addCriterion("question8 like", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8NotLike(String value) {
            addCriterion("question8 not like", value, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8In(List<String> values) {
            addCriterion("question8 in", values, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8NotIn(List<String> values) {
            addCriterion("question8 not in", values, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8Between(String value1, String value2) {
            addCriterion("question8 between", value1, value2, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion8NotBetween(String value1, String value2) {
            addCriterion("question8 not between", value1, value2, "question8");
            return (Criteria) this;
        }

        public Criteria andQuestion9IsNull() {
            addCriterion("question9 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion9IsNotNull() {
            addCriterion("question9 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion9EqualTo(String value) {
            addCriterion("question9 =", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9NotEqualTo(String value) {
            addCriterion("question9 <>", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9GreaterThan(String value) {
            addCriterion("question9 >", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9GreaterThanOrEqualTo(String value) {
            addCriterion("question9 >=", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9LessThan(String value) {
            addCriterion("question9 <", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9LessThanOrEqualTo(String value) {
            addCriterion("question9 <=", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9Like(String value) {
            addCriterion("question9 like", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9NotLike(String value) {
            addCriterion("question9 not like", value, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9In(List<String> values) {
            addCriterion("question9 in", values, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9NotIn(List<String> values) {
            addCriterion("question9 not in", values, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9Between(String value1, String value2) {
            addCriterion("question9 between", value1, value2, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion9NotBetween(String value1, String value2) {
            addCriterion("question9 not between", value1, value2, "question9");
            return (Criteria) this;
        }

        public Criteria andQuestion10IsNull() {
            addCriterion("question10 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion10IsNotNull() {
            addCriterion("question10 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion10EqualTo(String value) {
            addCriterion("question10 =", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10NotEqualTo(String value) {
            addCriterion("question10 <>", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10GreaterThan(String value) {
            addCriterion("question10 >", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10GreaterThanOrEqualTo(String value) {
            addCriterion("question10 >=", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10LessThan(String value) {
            addCriterion("question10 <", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10LessThanOrEqualTo(String value) {
            addCriterion("question10 <=", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10Like(String value) {
            addCriterion("question10 like", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10NotLike(String value) {
            addCriterion("question10 not like", value, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10In(List<String> values) {
            addCriterion("question10 in", values, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10NotIn(List<String> values) {
            addCriterion("question10 not in", values, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10Between(String value1, String value2) {
            addCriterion("question10 between", value1, value2, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion10NotBetween(String value1, String value2) {
            addCriterion("question10 not between", value1, value2, "question10");
            return (Criteria) this;
        }

        public Criteria andQuestion11IsNull() {
            addCriterion("question11 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion11IsNotNull() {
            addCriterion("question11 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion11EqualTo(String value) {
            addCriterion("question11 =", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11NotEqualTo(String value) {
            addCriterion("question11 <>", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11GreaterThan(String value) {
            addCriterion("question11 >", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11GreaterThanOrEqualTo(String value) {
            addCriterion("question11 >=", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11LessThan(String value) {
            addCriterion("question11 <", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11LessThanOrEqualTo(String value) {
            addCriterion("question11 <=", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11Like(String value) {
            addCriterion("question11 like", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11NotLike(String value) {
            addCriterion("question11 not like", value, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11In(List<String> values) {
            addCriterion("question11 in", values, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11NotIn(List<String> values) {
            addCriterion("question11 not in", values, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11Between(String value1, String value2) {
            addCriterion("question11 between", value1, value2, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion11NotBetween(String value1, String value2) {
            addCriterion("question11 not between", value1, value2, "question11");
            return (Criteria) this;
        }

        public Criteria andQuestion12IsNull() {
            addCriterion("question12 is null");
            return (Criteria) this;
        }

        public Criteria andQuestion12IsNotNull() {
            addCriterion("question12 is not null");
            return (Criteria) this;
        }

        public Criteria andQuestion12EqualTo(String value) {
            addCriterion("question12 =", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12NotEqualTo(String value) {
            addCriterion("question12 <>", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12GreaterThan(String value) {
            addCriterion("question12 >", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12GreaterThanOrEqualTo(String value) {
            addCriterion("question12 >=", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12LessThan(String value) {
            addCriterion("question12 <", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12LessThanOrEqualTo(String value) {
            addCriterion("question12 <=", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12Like(String value) {
            addCriterion("question12 like", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12NotLike(String value) {
            addCriterion("question12 not like", value, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12In(List<String> values) {
            addCriterion("question12 in", values, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12NotIn(List<String> values) {
            addCriterion("question12 not in", values, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12Between(String value1, String value2) {
            addCriterion("question12 between", value1, value2, "question12");
            return (Criteria) this;
        }

        public Criteria andQuestion12NotBetween(String value1, String value2) {
            addCriterion("question12 not between", value1, value2, "question12");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNull() {
            addCriterion("success is null");
            return (Criteria) this;
        }

        public Criteria andSuccessIsNotNull() {
            addCriterion("success is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessEqualTo(Integer value) {
            addCriterion("success =", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotEqualTo(Integer value) {
            addCriterion("success <>", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThan(Integer value) {
            addCriterion("success >", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("success >=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThan(Integer value) {
            addCriterion("success <", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessLessThanOrEqualTo(Integer value) {
            addCriterion("success <=", value, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessIn(List<Integer> values) {
            addCriterion("success in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotIn(List<Integer> values) {
            addCriterion("success not in", values, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessBetween(Integer value1, Integer value2) {
            addCriterion("success between", value1, value2, "success");
            return (Criteria) this;
        }

        public Criteria andSuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("success not between", value1, value2, "success");
            return (Criteria) this;
        }

        public Criteria andIspayIsNull() {
            addCriterion("ispay is null");
            return (Criteria) this;
        }

        public Criteria andIspayIsNotNull() {
            addCriterion("ispay is not null");
            return (Criteria) this;
        }

        public Criteria andIspayEqualTo(Integer value) {
            addCriterion("ispay =", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotEqualTo(Integer value) {
            addCriterion("ispay <>", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThan(Integer value) {
            addCriterion("ispay >", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThanOrEqualTo(Integer value) {
            addCriterion("ispay >=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThan(Integer value) {
            addCriterion("ispay <", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThanOrEqualTo(Integer value) {
            addCriterion("ispay <=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayIn(List<Integer> values) {
            addCriterion("ispay in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotIn(List<Integer> values) {
            addCriterion("ispay not in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayBetween(Integer value1, Integer value2) {
            addCriterion("ispay between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotBetween(Integer value1, Integer value2) {
            addCriterion("ispay not between", value1, value2, "ispay");
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