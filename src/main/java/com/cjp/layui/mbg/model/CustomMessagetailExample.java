package com.cjp.layui.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomMessagetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomMessagetailExample() {
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

        public Criteria andMessagenameIsNull() {
            addCriterion("messagename is null");
            return (Criteria) this;
        }

        public Criteria andMessagenameIsNotNull() {
            addCriterion("messagename is not null");
            return (Criteria) this;
        }

        public Criteria andMessagenameEqualTo(String value) {
            addCriterion("messagename =", value, "messagename");
            return (Criteria) this;
        }

        public Criteria andMessagenameNotEqualTo(String value) {
            addCriterion("messagename <>", value, "messagename");
            return (Criteria) this;
        }

        public Criteria andMessagenameGreaterThan(String value) {
            addCriterion("messagename >", value, "messagename");
            return (Criteria) this;
        }

        public Criteria andMessagenameGreaterThanOrEqualTo(String value) {
            addCriterion("messagename >=", value, "messagename");
            return (Criteria) this;
        }

        public Criteria andMessagenameLessThan(String value) {
            addCriterion("messagename <", value, "messagename");
            return (Criteria) this;
        }

        public Criteria andMessagenameLessThanOrEqualTo(String value) {
            addCriterion("messagename <=", value, "messagename");
            return (Criteria) this;
        }

        public Criteria andMessagenameLike(String value) {
            addCriterion("messagename like", value, "messagename");
            return (Criteria) this;
        }

        public Criteria andMessagenameNotLike(String value) {
            addCriterion("messagename not like", value, "messagename");
            return (Criteria) this;
        }

        public Criteria andMessagenameIn(List<String> values) {
            addCriterion("messagename in", values, "messagename");
            return (Criteria) this;
        }

        public Criteria andMessagenameNotIn(List<String> values) {
            addCriterion("messagename not in", values, "messagename");
            return (Criteria) this;
        }

        public Criteria andMessagenameBetween(String value1, String value2) {
            addCriterion("messagename between", value1, value2, "messagename");
            return (Criteria) this;
        }

        public Criteria andMessagenameNotBetween(String value1, String value2) {
            addCriterion("messagename not between", value1, value2, "messagename");
            return (Criteria) this;
        }

        public Criteria andReleaseobjectIsNull() {
            addCriterion("releaseobject is null");
            return (Criteria) this;
        }

        public Criteria andReleaseobjectIsNotNull() {
            addCriterion("releaseobject is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseobjectEqualTo(Integer value) {
            addCriterion("releaseobject =", value, "releaseobject");
            return (Criteria) this;
        }

        public Criteria andReleaseobjectNotEqualTo(Integer value) {
            addCriterion("releaseobject <>", value, "releaseobject");
            return (Criteria) this;
        }

        public Criteria andReleaseobjectGreaterThan(Integer value) {
            addCriterion("releaseobject >", value, "releaseobject");
            return (Criteria) this;
        }

        public Criteria andReleaseobjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("releaseobject >=", value, "releaseobject");
            return (Criteria) this;
        }

        public Criteria andReleaseobjectLessThan(Integer value) {
            addCriterion("releaseobject <", value, "releaseobject");
            return (Criteria) this;
        }

        public Criteria andReleaseobjectLessThanOrEqualTo(Integer value) {
            addCriterion("releaseobject <=", value, "releaseobject");
            return (Criteria) this;
        }

        public Criteria andReleaseobjectIn(List<Integer> values) {
            addCriterion("releaseobject in", values, "releaseobject");
            return (Criteria) this;
        }

        public Criteria andReleaseobjectNotIn(List<Integer> values) {
            addCriterion("releaseobject not in", values, "releaseobject");
            return (Criteria) this;
        }

        public Criteria andReleaseobjectBetween(Integer value1, Integer value2) {
            addCriterion("releaseobject between", value1, value2, "releaseobject");
            return (Criteria) this;
        }

        public Criteria andReleaseobjectNotBetween(Integer value1, Integer value2) {
            addCriterion("releaseobject not between", value1, value2, "releaseobject");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andPushtimeIsNull() {
            addCriterion("pushtime is null");
            return (Criteria) this;
        }

        public Criteria andPushtimeIsNotNull() {
            addCriterion("pushtime is not null");
            return (Criteria) this;
        }

        public Criteria andPushtimeEqualTo(Date value) {
            addCriterion("pushtime =", value, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeNotEqualTo(Date value) {
            addCriterion("pushtime <>", value, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeGreaterThan(Date value) {
            addCriterion("pushtime >", value, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pushtime >=", value, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeLessThan(Date value) {
            addCriterion("pushtime <", value, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeLessThanOrEqualTo(Date value) {
            addCriterion("pushtime <=", value, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeIn(List<Date> values) {
            addCriterion("pushtime in", values, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeNotIn(List<Date> values) {
            addCriterion("pushtime not in", values, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeBetween(Date value1, Date value2) {
            addCriterion("pushtime between", value1, value2, "pushtime");
            return (Criteria) this;
        }

        public Criteria andPushtimeNotBetween(Date value1, Date value2) {
            addCriterion("pushtime not between", value1, value2, "pushtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andPushstatusIsNull() {
            addCriterion("pushstatus is null");
            return (Criteria) this;
        }

        public Criteria andPushstatusIsNotNull() {
            addCriterion("pushstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPushstatusEqualTo(Integer value) {
            addCriterion("pushstatus =", value, "pushstatus");
            return (Criteria) this;
        }

        public Criteria andPushstatusNotEqualTo(Integer value) {
            addCriterion("pushstatus <>", value, "pushstatus");
            return (Criteria) this;
        }

        public Criteria andPushstatusGreaterThan(Integer value) {
            addCriterion("pushstatus >", value, "pushstatus");
            return (Criteria) this;
        }

        public Criteria andPushstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pushstatus >=", value, "pushstatus");
            return (Criteria) this;
        }

        public Criteria andPushstatusLessThan(Integer value) {
            addCriterion("pushstatus <", value, "pushstatus");
            return (Criteria) this;
        }

        public Criteria andPushstatusLessThanOrEqualTo(Integer value) {
            addCriterion("pushstatus <=", value, "pushstatus");
            return (Criteria) this;
        }

        public Criteria andPushstatusIn(List<Integer> values) {
            addCriterion("pushstatus in", values, "pushstatus");
            return (Criteria) this;
        }

        public Criteria andPushstatusNotIn(List<Integer> values) {
            addCriterion("pushstatus not in", values, "pushstatus");
            return (Criteria) this;
        }

        public Criteria andPushstatusBetween(Integer value1, Integer value2) {
            addCriterion("pushstatus between", value1, value2, "pushstatus");
            return (Criteria) this;
        }

        public Criteria andPushstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pushstatus not between", value1, value2, "pushstatus");
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNull() {
            addCriterion("templateid is null");
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNotNull() {
            addCriterion("templateid is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateidEqualTo(String value) {
            addCriterion("templateid =", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotEqualTo(String value) {
            addCriterion("templateid <>", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThan(String value) {
            addCriterion("templateid >", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThanOrEqualTo(String value) {
            addCriterion("templateid >=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThan(String value) {
            addCriterion("templateid <", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThanOrEqualTo(String value) {
            addCriterion("templateid <=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLike(String value) {
            addCriterion("templateid like", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotLike(String value) {
            addCriterion("templateid not like", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidIn(List<String> values) {
            addCriterion("templateid in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotIn(List<String> values) {
            addCriterion("templateid not in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidBetween(String value1, String value2) {
            addCriterion("templateid between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotBetween(String value1, String value2) {
            addCriterion("templateid not between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andHeadIsNull() {
            addCriterion("head is null");
            return (Criteria) this;
        }

        public Criteria andHeadIsNotNull() {
            addCriterion("head is not null");
            return (Criteria) this;
        }

        public Criteria andHeadEqualTo(String value) {
            addCriterion("head =", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotEqualTo(String value) {
            addCriterion("head <>", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThan(String value) {
            addCriterion("head >", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadGreaterThanOrEqualTo(String value) {
            addCriterion("head >=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThan(String value) {
            addCriterion("head <", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLessThanOrEqualTo(String value) {
            addCriterion("head <=", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadLike(String value) {
            addCriterion("head like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotLike(String value) {
            addCriterion("head not like", value, "head");
            return (Criteria) this;
        }

        public Criteria andHeadIn(List<String> values) {
            addCriterion("head in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotIn(List<String> values) {
            addCriterion("head not in", values, "head");
            return (Criteria) this;
        }

        public Criteria andHeadBetween(String value1, String value2) {
            addCriterion("head between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andHeadNotBetween(String value1, String value2) {
            addCriterion("head not between", value1, value2, "head");
            return (Criteria) this;
        }

        public Criteria andKeyworddataIsNull() {
            addCriterion("keyworddata is null");
            return (Criteria) this;
        }

        public Criteria andKeyworddataIsNotNull() {
            addCriterion("keyworddata is not null");
            return (Criteria) this;
        }

        public Criteria andKeyworddataEqualTo(String value) {
            addCriterion("keyworddata =", value, "keyworddata");
            return (Criteria) this;
        }

        public Criteria andKeyworddataNotEqualTo(String value) {
            addCriterion("keyworddata <>", value, "keyworddata");
            return (Criteria) this;
        }

        public Criteria andKeyworddataGreaterThan(String value) {
            addCriterion("keyworddata >", value, "keyworddata");
            return (Criteria) this;
        }

        public Criteria andKeyworddataGreaterThanOrEqualTo(String value) {
            addCriterion("keyworddata >=", value, "keyworddata");
            return (Criteria) this;
        }

        public Criteria andKeyworddataLessThan(String value) {
            addCriterion("keyworddata <", value, "keyworddata");
            return (Criteria) this;
        }

        public Criteria andKeyworddataLessThanOrEqualTo(String value) {
            addCriterion("keyworddata <=", value, "keyworddata");
            return (Criteria) this;
        }

        public Criteria andKeyworddataLike(String value) {
            addCriterion("keyworddata like", value, "keyworddata");
            return (Criteria) this;
        }

        public Criteria andKeyworddataNotLike(String value) {
            addCriterion("keyworddata not like", value, "keyworddata");
            return (Criteria) this;
        }

        public Criteria andKeyworddataIn(List<String> values) {
            addCriterion("keyworddata in", values, "keyworddata");
            return (Criteria) this;
        }

        public Criteria andKeyworddataNotIn(List<String> values) {
            addCriterion("keyworddata not in", values, "keyworddata");
            return (Criteria) this;
        }

        public Criteria andKeyworddataBetween(String value1, String value2) {
            addCriterion("keyworddata between", value1, value2, "keyworddata");
            return (Criteria) this;
        }

        public Criteria andKeyworddataNotBetween(String value1, String value2) {
            addCriterion("keyworddata not between", value1, value2, "keyworddata");
            return (Criteria) this;
        }

        public Criteria andTailIsNull() {
            addCriterion("tail is null");
            return (Criteria) this;
        }

        public Criteria andTailIsNotNull() {
            addCriterion("tail is not null");
            return (Criteria) this;
        }

        public Criteria andTailEqualTo(String value) {
            addCriterion("tail =", value, "tail");
            return (Criteria) this;
        }

        public Criteria andTailNotEqualTo(String value) {
            addCriterion("tail <>", value, "tail");
            return (Criteria) this;
        }

        public Criteria andTailGreaterThan(String value) {
            addCriterion("tail >", value, "tail");
            return (Criteria) this;
        }

        public Criteria andTailGreaterThanOrEqualTo(String value) {
            addCriterion("tail >=", value, "tail");
            return (Criteria) this;
        }

        public Criteria andTailLessThan(String value) {
            addCriterion("tail <", value, "tail");
            return (Criteria) this;
        }

        public Criteria andTailLessThanOrEqualTo(String value) {
            addCriterion("tail <=", value, "tail");
            return (Criteria) this;
        }

        public Criteria andTailLike(String value) {
            addCriterion("tail like", value, "tail");
            return (Criteria) this;
        }

        public Criteria andTailNotLike(String value) {
            addCriterion("tail not like", value, "tail");
            return (Criteria) this;
        }

        public Criteria andTailIn(List<String> values) {
            addCriterion("tail in", values, "tail");
            return (Criteria) this;
        }

        public Criteria andTailNotIn(List<String> values) {
            addCriterion("tail not in", values, "tail");
            return (Criteria) this;
        }

        public Criteria andTailBetween(String value1, String value2) {
            addCriterion("tail between", value1, value2, "tail");
            return (Criteria) this;
        }

        public Criteria andTailNotBetween(String value1, String value2) {
            addCriterion("tail not between", value1, value2, "tail");
            return (Criteria) this;
        }

        public Criteria andUrltypeIsNull() {
            addCriterion("urltype is null");
            return (Criteria) this;
        }

        public Criteria andUrltypeIsNotNull() {
            addCriterion("urltype is not null");
            return (Criteria) this;
        }

        public Criteria andUrltypeEqualTo(Integer value) {
            addCriterion("urltype =", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeNotEqualTo(Integer value) {
            addCriterion("urltype <>", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeGreaterThan(Integer value) {
            addCriterion("urltype >", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("urltype >=", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeLessThan(Integer value) {
            addCriterion("urltype <", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeLessThanOrEqualTo(Integer value) {
            addCriterion("urltype <=", value, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeIn(List<Integer> values) {
            addCriterion("urltype in", values, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeNotIn(List<Integer> values) {
            addCriterion("urltype not in", values, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeBetween(Integer value1, Integer value2) {
            addCriterion("urltype between", value1, value2, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrltypeNotBetween(Integer value1, Integer value2) {
            addCriterion("urltype not between", value1, value2, "urltype");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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