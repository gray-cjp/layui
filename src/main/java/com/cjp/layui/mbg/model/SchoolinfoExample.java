package com.cjp.layui.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SchoolinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SchoolinfoExample() {
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

        public Criteria andSchoolnmIsNull() {
            addCriterion("schoolnm is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnmIsNotNull() {
            addCriterion("schoolnm is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnmEqualTo(String value) {
            addCriterion("schoolnm =", value, "schoolnm");
            return (Criteria) this;
        }

        public Criteria andSchoolnmNotEqualTo(String value) {
            addCriterion("schoolnm <>", value, "schoolnm");
            return (Criteria) this;
        }

        public Criteria andSchoolnmGreaterThan(String value) {
            addCriterion("schoolnm >", value, "schoolnm");
            return (Criteria) this;
        }

        public Criteria andSchoolnmGreaterThanOrEqualTo(String value) {
            addCriterion("schoolnm >=", value, "schoolnm");
            return (Criteria) this;
        }

        public Criteria andSchoolnmLessThan(String value) {
            addCriterion("schoolnm <", value, "schoolnm");
            return (Criteria) this;
        }

        public Criteria andSchoolnmLessThanOrEqualTo(String value) {
            addCriterion("schoolnm <=", value, "schoolnm");
            return (Criteria) this;
        }

        public Criteria andSchoolnmLike(String value) {
            addCriterion("schoolnm like", value, "schoolnm");
            return (Criteria) this;
        }

        public Criteria andSchoolnmNotLike(String value) {
            addCriterion("schoolnm not like", value, "schoolnm");
            return (Criteria) this;
        }

        public Criteria andSchoolnmIn(List<String> values) {
            addCriterion("schoolnm in", values, "schoolnm");
            return (Criteria) this;
        }

        public Criteria andSchoolnmNotIn(List<String> values) {
            addCriterion("schoolnm not in", values, "schoolnm");
            return (Criteria) this;
        }

        public Criteria andSchoolnmBetween(String value1, String value2) {
            addCriterion("schoolnm between", value1, value2, "schoolnm");
            return (Criteria) this;
        }

        public Criteria andSchoolnmNotBetween(String value1, String value2) {
            addCriterion("schoolnm not between", value1, value2, "schoolnm");
            return (Criteria) this;
        }

        public Criteria andGrantidIsNull() {
            addCriterion("grantid is null");
            return (Criteria) this;
        }

        public Criteria andGrantidIsNotNull() {
            addCriterion("grantid is not null");
            return (Criteria) this;
        }

        public Criteria andGrantidEqualTo(Long value) {
            addCriterion("grantid =", value, "grantid");
            return (Criteria) this;
        }

        public Criteria andGrantidNotEqualTo(Long value) {
            addCriterion("grantid <>", value, "grantid");
            return (Criteria) this;
        }

        public Criteria andGrantidGreaterThan(Long value) {
            addCriterion("grantid >", value, "grantid");
            return (Criteria) this;
        }

        public Criteria andGrantidGreaterThanOrEqualTo(Long value) {
            addCriterion("grantid >=", value, "grantid");
            return (Criteria) this;
        }

        public Criteria andGrantidLessThan(Long value) {
            addCriterion("grantid <", value, "grantid");
            return (Criteria) this;
        }

        public Criteria andGrantidLessThanOrEqualTo(Long value) {
            addCriterion("grantid <=", value, "grantid");
            return (Criteria) this;
        }

        public Criteria andGrantidIn(List<Long> values) {
            addCriterion("grantid in", values, "grantid");
            return (Criteria) this;
        }

        public Criteria andGrantidNotIn(List<Long> values) {
            addCriterion("grantid not in", values, "grantid");
            return (Criteria) this;
        }

        public Criteria andGrantidBetween(Long value1, Long value2) {
            addCriterion("grantid between", value1, value2, "grantid");
            return (Criteria) this;
        }

        public Criteria andGrantidNotBetween(Long value1, Long value2) {
            addCriterion("grantid not between", value1, value2, "grantid");
            return (Criteria) this;
        }

        public Criteria andLepersonIsNull() {
            addCriterion("leperson is null");
            return (Criteria) this;
        }

        public Criteria andLepersonIsNotNull() {
            addCriterion("leperson is not null");
            return (Criteria) this;
        }

        public Criteria andLepersonEqualTo(String value) {
            addCriterion("leperson =", value, "leperson");
            return (Criteria) this;
        }

        public Criteria andLepersonNotEqualTo(String value) {
            addCriterion("leperson <>", value, "leperson");
            return (Criteria) this;
        }

        public Criteria andLepersonGreaterThan(String value) {
            addCriterion("leperson >", value, "leperson");
            return (Criteria) this;
        }

        public Criteria andLepersonGreaterThanOrEqualTo(String value) {
            addCriterion("leperson >=", value, "leperson");
            return (Criteria) this;
        }

        public Criteria andLepersonLessThan(String value) {
            addCriterion("leperson <", value, "leperson");
            return (Criteria) this;
        }

        public Criteria andLepersonLessThanOrEqualTo(String value) {
            addCriterion("leperson <=", value, "leperson");
            return (Criteria) this;
        }

        public Criteria andLepersonLike(String value) {
            addCriterion("leperson like", value, "leperson");
            return (Criteria) this;
        }

        public Criteria andLepersonNotLike(String value) {
            addCriterion("leperson not like", value, "leperson");
            return (Criteria) this;
        }

        public Criteria andLepersonIn(List<String> values) {
            addCriterion("leperson in", values, "leperson");
            return (Criteria) this;
        }

        public Criteria andLepersonNotIn(List<String> values) {
            addCriterion("leperson not in", values, "leperson");
            return (Criteria) this;
        }

        public Criteria andLepersonBetween(String value1, String value2) {
            addCriterion("leperson between", value1, value2, "leperson");
            return (Criteria) this;
        }

        public Criteria andLepersonNotBetween(String value1, String value2) {
            addCriterion("leperson not between", value1, value2, "leperson");
            return (Criteria) this;
        }

        public Criteria andLegalidIsNull() {
            addCriterion("legalid is null");
            return (Criteria) this;
        }

        public Criteria andLegalidIsNotNull() {
            addCriterion("legalid is not null");
            return (Criteria) this;
        }

        public Criteria andLegalidEqualTo(String value) {
            addCriterion("legalid =", value, "legalid");
            return (Criteria) this;
        }

        public Criteria andLegalidNotEqualTo(String value) {
            addCriterion("legalid <>", value, "legalid");
            return (Criteria) this;
        }

        public Criteria andLegalidGreaterThan(String value) {
            addCriterion("legalid >", value, "legalid");
            return (Criteria) this;
        }

        public Criteria andLegalidGreaterThanOrEqualTo(String value) {
            addCriterion("legalid >=", value, "legalid");
            return (Criteria) this;
        }

        public Criteria andLegalidLessThan(String value) {
            addCriterion("legalid <", value, "legalid");
            return (Criteria) this;
        }

        public Criteria andLegalidLessThanOrEqualTo(String value) {
            addCriterion("legalid <=", value, "legalid");
            return (Criteria) this;
        }

        public Criteria andLegalidLike(String value) {
            addCriterion("legalid like", value, "legalid");
            return (Criteria) this;
        }

        public Criteria andLegalidNotLike(String value) {
            addCriterion("legalid not like", value, "legalid");
            return (Criteria) this;
        }

        public Criteria andLegalidIn(List<String> values) {
            addCriterion("legalid in", values, "legalid");
            return (Criteria) this;
        }

        public Criteria andLegalidNotIn(List<String> values) {
            addCriterion("legalid not in", values, "legalid");
            return (Criteria) this;
        }

        public Criteria andLegalidBetween(String value1, String value2) {
            addCriterion("legalid between", value1, value2, "legalid");
            return (Criteria) this;
        }

        public Criteria andLegalidNotBetween(String value1, String value2) {
            addCriterion("legalid not between", value1, value2, "legalid");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNull() {
            addCriterion("business is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNotNull() {
            addCriterion("business is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEqualTo(String value) {
            addCriterion("business =", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotEqualTo(String value) {
            addCriterion("business <>", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThan(String value) {
            addCriterion("business >", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("business >=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThan(String value) {
            addCriterion("business <", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThanOrEqualTo(String value) {
            addCriterion("business <=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLike(String value) {
            addCriterion("business like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotLike(String value) {
            addCriterion("business not like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessIn(List<String> values) {
            addCriterion("business in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotIn(List<String> values) {
            addCriterion("business not in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessBetween(String value1, String value2) {
            addCriterion("business between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotBetween(String value1, String value2) {
            addCriterion("business not between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitIsNull() {
            addCriterion("schoolpermit is null");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitIsNotNull() {
            addCriterion("schoolpermit is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitEqualTo(String value) {
            addCriterion("schoolpermit =", value, "schoolpermit");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitNotEqualTo(String value) {
            addCriterion("schoolpermit <>", value, "schoolpermit");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitGreaterThan(String value) {
            addCriterion("schoolpermit >", value, "schoolpermit");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitGreaterThanOrEqualTo(String value) {
            addCriterion("schoolpermit >=", value, "schoolpermit");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitLessThan(String value) {
            addCriterion("schoolpermit <", value, "schoolpermit");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitLessThanOrEqualTo(String value) {
            addCriterion("schoolpermit <=", value, "schoolpermit");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitLike(String value) {
            addCriterion("schoolpermit like", value, "schoolpermit");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitNotLike(String value) {
            addCriterion("schoolpermit not like", value, "schoolpermit");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitIn(List<String> values) {
            addCriterion("schoolpermit in", values, "schoolpermit");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitNotIn(List<String> values) {
            addCriterion("schoolpermit not in", values, "schoolpermit");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitBetween(String value1, String value2) {
            addCriterion("schoolpermit between", value1, value2, "schoolpermit");
            return (Criteria) this;
        }

        public Criteria andSchoolpermitNotBetween(String value1, String value2) {
            addCriterion("schoolpermit not between", value1, value2, "schoolpermit");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAppkeyIsNull() {
            addCriterion("appkey is null");
            return (Criteria) this;
        }

        public Criteria andAppkeyIsNotNull() {
            addCriterion("appkey is not null");
            return (Criteria) this;
        }

        public Criteria andAppkeyEqualTo(String value) {
            addCriterion("appkey =", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotEqualTo(String value) {
            addCriterion("appkey <>", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyGreaterThan(String value) {
            addCriterion("appkey >", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyGreaterThanOrEqualTo(String value) {
            addCriterion("appkey >=", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLessThan(String value) {
            addCriterion("appkey <", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLessThanOrEqualTo(String value) {
            addCriterion("appkey <=", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLike(String value) {
            addCriterion("appkey like", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotLike(String value) {
            addCriterion("appkey not like", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyIn(List<String> values) {
            addCriterion("appkey in", values, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotIn(List<String> values) {
            addCriterion("appkey not in", values, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyBetween(String value1, String value2) {
            addCriterion("appkey between", value1, value2, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotBetween(String value1, String value2) {
            addCriterion("appkey not between", value1, value2, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("appid is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("appid is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("appid =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("appid <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("appid >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("appid >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("appid <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("appid <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("appid like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("appid not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("appid in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("appid not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("appid between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("appid not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andCreatdateIsNull() {
            addCriterion("creatdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatdateIsNotNull() {
            addCriterion("creatdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatdateEqualTo(Date value) {
            addCriterion("creatdate =", value, "creatdate");
            return (Criteria) this;
        }

        public Criteria andCreatdateNotEqualTo(Date value) {
            addCriterion("creatdate <>", value, "creatdate");
            return (Criteria) this;
        }

        public Criteria andCreatdateGreaterThan(Date value) {
            addCriterion("creatdate >", value, "creatdate");
            return (Criteria) this;
        }

        public Criteria andCreatdateGreaterThanOrEqualTo(Date value) {
            addCriterion("creatdate >=", value, "creatdate");
            return (Criteria) this;
        }

        public Criteria andCreatdateLessThan(Date value) {
            addCriterion("creatdate <", value, "creatdate");
            return (Criteria) this;
        }

        public Criteria andCreatdateLessThanOrEqualTo(Date value) {
            addCriterion("creatdate <=", value, "creatdate");
            return (Criteria) this;
        }

        public Criteria andCreatdateIn(List<Date> values) {
            addCriterion("creatdate in", values, "creatdate");
            return (Criteria) this;
        }

        public Criteria andCreatdateNotIn(List<Date> values) {
            addCriterion("creatdate not in", values, "creatdate");
            return (Criteria) this;
        }

        public Criteria andCreatdateBetween(Date value1, Date value2) {
            addCriterion("creatdate between", value1, value2, "creatdate");
            return (Criteria) this;
        }

        public Criteria andCreatdateNotBetween(Date value1, Date value2) {
            addCriterion("creatdate not between", value1, value2, "creatdate");
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

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(Long value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(Long value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(Long value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(Long value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(Long value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(Long value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<Long> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<Long> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(Long value1, Long value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(Long value1, Long value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andBankidIsNull() {
            addCriterion("bankid is null");
            return (Criteria) this;
        }

        public Criteria andBankidIsNotNull() {
            addCriterion("bankid is not null");
            return (Criteria) this;
        }

        public Criteria andBankidEqualTo(Long value) {
            addCriterion("bankid =", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotEqualTo(Long value) {
            addCriterion("bankid <>", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThan(Long value) {
            addCriterion("bankid >", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidGreaterThanOrEqualTo(Long value) {
            addCriterion("bankid >=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThan(Long value) {
            addCriterion("bankid <", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidLessThanOrEqualTo(Long value) {
            addCriterion("bankid <=", value, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidIn(List<Long> values) {
            addCriterion("bankid in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotIn(List<Long> values) {
            addCriterion("bankid not in", values, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidBetween(Long value1, Long value2) {
            addCriterion("bankid between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andBankidNotBetween(Long value1, Long value2) {
            addCriterion("bankid not between", value1, value2, "bankid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Integer value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Integer value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Integer value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Integer value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Integer value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Integer> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Integer> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Integer value1, Integer value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRemIsNull() {
            addCriterion("rem is null");
            return (Criteria) this;
        }

        public Criteria andRemIsNotNull() {
            addCriterion("rem is not null");
            return (Criteria) this;
        }

        public Criteria andRemEqualTo(String value) {
            addCriterion("rem =", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotEqualTo(String value) {
            addCriterion("rem <>", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemGreaterThan(String value) {
            addCriterion("rem >", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemGreaterThanOrEqualTo(String value) {
            addCriterion("rem >=", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemLessThan(String value) {
            addCriterion("rem <", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemLessThanOrEqualTo(String value) {
            addCriterion("rem <=", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemLike(String value) {
            addCriterion("rem like", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotLike(String value) {
            addCriterion("rem not like", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemIn(List<String> values) {
            addCriterion("rem in", values, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotIn(List<String> values) {
            addCriterion("rem not in", values, "rem");
            return (Criteria) this;
        }

        public Criteria andRemBetween(String value1, String value2) {
            addCriterion("rem between", value1, value2, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotBetween(String value1, String value2) {
            addCriterion("rem not between", value1, value2, "rem");
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

        public Criteria andSeifpayIsNull() {
            addCriterion("seifpay is null");
            return (Criteria) this;
        }

        public Criteria andSeifpayIsNotNull() {
            addCriterion("seifpay is not null");
            return (Criteria) this;
        }

        public Criteria andSeifpayEqualTo(Integer value) {
            addCriterion("seifpay =", value, "seifpay");
            return (Criteria) this;
        }

        public Criteria andSeifpayNotEqualTo(Integer value) {
            addCriterion("seifpay <>", value, "seifpay");
            return (Criteria) this;
        }

        public Criteria andSeifpayGreaterThan(Integer value) {
            addCriterion("seifpay >", value, "seifpay");
            return (Criteria) this;
        }

        public Criteria andSeifpayGreaterThanOrEqualTo(Integer value) {
            addCriterion("seifpay >=", value, "seifpay");
            return (Criteria) this;
        }

        public Criteria andSeifpayLessThan(Integer value) {
            addCriterion("seifpay <", value, "seifpay");
            return (Criteria) this;
        }

        public Criteria andSeifpayLessThanOrEqualTo(Integer value) {
            addCriterion("seifpay <=", value, "seifpay");
            return (Criteria) this;
        }

        public Criteria andSeifpayIn(List<Integer> values) {
            addCriterion("seifpay in", values, "seifpay");
            return (Criteria) this;
        }

        public Criteria andSeifpayNotIn(List<Integer> values) {
            addCriterion("seifpay not in", values, "seifpay");
            return (Criteria) this;
        }

        public Criteria andSeifpayBetween(Integer value1, Integer value2) {
            addCriterion("seifpay between", value1, value2, "seifpay");
            return (Criteria) this;
        }

        public Criteria andSeifpayNotBetween(Integer value1, Integer value2) {
            addCriterion("seifpay not between", value1, value2, "seifpay");
            return (Criteria) this;
        }

        public Criteria andMustpayIsNull() {
            addCriterion("mustpay is null");
            return (Criteria) this;
        }

        public Criteria andMustpayIsNotNull() {
            addCriterion("mustpay is not null");
            return (Criteria) this;
        }

        public Criteria andMustpayEqualTo(Integer value) {
            addCriterion("mustpay =", value, "mustpay");
            return (Criteria) this;
        }

        public Criteria andMustpayNotEqualTo(Integer value) {
            addCriterion("mustpay <>", value, "mustpay");
            return (Criteria) this;
        }

        public Criteria andMustpayGreaterThan(Integer value) {
            addCriterion("mustpay >", value, "mustpay");
            return (Criteria) this;
        }

        public Criteria andMustpayGreaterThanOrEqualTo(Integer value) {
            addCriterion("mustpay >=", value, "mustpay");
            return (Criteria) this;
        }

        public Criteria andMustpayLessThan(Integer value) {
            addCriterion("mustpay <", value, "mustpay");
            return (Criteria) this;
        }

        public Criteria andMustpayLessThanOrEqualTo(Integer value) {
            addCriterion("mustpay <=", value, "mustpay");
            return (Criteria) this;
        }

        public Criteria andMustpayIn(List<Integer> values) {
            addCriterion("mustpay in", values, "mustpay");
            return (Criteria) this;
        }

        public Criteria andMustpayNotIn(List<Integer> values) {
            addCriterion("mustpay not in", values, "mustpay");
            return (Criteria) this;
        }

        public Criteria andMustpayBetween(Integer value1, Integer value2) {
            addCriterion("mustpay between", value1, value2, "mustpay");
            return (Criteria) this;
        }

        public Criteria andMustpayNotBetween(Integer value1, Integer value2) {
            addCriterion("mustpay not between", value1, value2, "mustpay");
            return (Criteria) this;
        }

        public Criteria andQuickpayIsNull() {
            addCriterion("quickpay is null");
            return (Criteria) this;
        }

        public Criteria andQuickpayIsNotNull() {
            addCriterion("quickpay is not null");
            return (Criteria) this;
        }

        public Criteria andQuickpayEqualTo(Integer value) {
            addCriterion("quickpay =", value, "quickpay");
            return (Criteria) this;
        }

        public Criteria andQuickpayNotEqualTo(Integer value) {
            addCriterion("quickpay <>", value, "quickpay");
            return (Criteria) this;
        }

        public Criteria andQuickpayGreaterThan(Integer value) {
            addCriterion("quickpay >", value, "quickpay");
            return (Criteria) this;
        }

        public Criteria andQuickpayGreaterThanOrEqualTo(Integer value) {
            addCriterion("quickpay >=", value, "quickpay");
            return (Criteria) this;
        }

        public Criteria andQuickpayLessThan(Integer value) {
            addCriterion("quickpay <", value, "quickpay");
            return (Criteria) this;
        }

        public Criteria andQuickpayLessThanOrEqualTo(Integer value) {
            addCriterion("quickpay <=", value, "quickpay");
            return (Criteria) this;
        }

        public Criteria andQuickpayIn(List<Integer> values) {
            addCriterion("quickpay in", values, "quickpay");
            return (Criteria) this;
        }

        public Criteria andQuickpayNotIn(List<Integer> values) {
            addCriterion("quickpay not in", values, "quickpay");
            return (Criteria) this;
        }

        public Criteria andQuickpayBetween(Integer value1, Integer value2) {
            addCriterion("quickpay between", value1, value2, "quickpay");
            return (Criteria) this;
        }

        public Criteria andQuickpayNotBetween(Integer value1, Integer value2) {
            addCriterion("quickpay not between", value1, value2, "quickpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayIsNull() {
            addCriterion("unionpay is null");
            return (Criteria) this;
        }

        public Criteria andUnionpayIsNotNull() {
            addCriterion("unionpay is not null");
            return (Criteria) this;
        }

        public Criteria andUnionpayEqualTo(Integer value) {
            addCriterion("unionpay =", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayNotEqualTo(Integer value) {
            addCriterion("unionpay <>", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayGreaterThan(Integer value) {
            addCriterion("unionpay >", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayGreaterThanOrEqualTo(Integer value) {
            addCriterion("unionpay >=", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayLessThan(Integer value) {
            addCriterion("unionpay <", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayLessThanOrEqualTo(Integer value) {
            addCriterion("unionpay <=", value, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayIn(List<Integer> values) {
            addCriterion("unionpay in", values, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayNotIn(List<Integer> values) {
            addCriterion("unionpay not in", values, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayBetween(Integer value1, Integer value2) {
            addCriterion("unionpay between", value1, value2, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionpayNotBetween(Integer value1, Integer value2) {
            addCriterion("unionpay not between", value1, value2, "unionpay");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNull() {
            addCriterion("unionid is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("unionid is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("unionid =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("unionid <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("unionid >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("unionid >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("unionid <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("unionid <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("unionid like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("unionid not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("unionid in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("unionid not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("unionid between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("unionid not between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionkeyIsNull() {
            addCriterion("unionkey is null");
            return (Criteria) this;
        }

        public Criteria andUnionkeyIsNotNull() {
            addCriterion("unionkey is not null");
            return (Criteria) this;
        }

        public Criteria andUnionkeyEqualTo(String value) {
            addCriterion("unionkey =", value, "unionkey");
            return (Criteria) this;
        }

        public Criteria andUnionkeyNotEqualTo(String value) {
            addCriterion("unionkey <>", value, "unionkey");
            return (Criteria) this;
        }

        public Criteria andUnionkeyGreaterThan(String value) {
            addCriterion("unionkey >", value, "unionkey");
            return (Criteria) this;
        }

        public Criteria andUnionkeyGreaterThanOrEqualTo(String value) {
            addCriterion("unionkey >=", value, "unionkey");
            return (Criteria) this;
        }

        public Criteria andUnionkeyLessThan(String value) {
            addCriterion("unionkey <", value, "unionkey");
            return (Criteria) this;
        }

        public Criteria andUnionkeyLessThanOrEqualTo(String value) {
            addCriterion("unionkey <=", value, "unionkey");
            return (Criteria) this;
        }

        public Criteria andUnionkeyLike(String value) {
            addCriterion("unionkey like", value, "unionkey");
            return (Criteria) this;
        }

        public Criteria andUnionkeyNotLike(String value) {
            addCriterion("unionkey not like", value, "unionkey");
            return (Criteria) this;
        }

        public Criteria andUnionkeyIn(List<String> values) {
            addCriterion("unionkey in", values, "unionkey");
            return (Criteria) this;
        }

        public Criteria andUnionkeyNotIn(List<String> values) {
            addCriterion("unionkey not in", values, "unionkey");
            return (Criteria) this;
        }

        public Criteria andUnionkeyBetween(String value1, String value2) {
            addCriterion("unionkey between", value1, value2, "unionkey");
            return (Criteria) this;
        }

        public Criteria andUnionkeyNotBetween(String value1, String value2) {
            addCriterion("unionkey not between", value1, value2, "unionkey");
            return (Criteria) this;
        }

        public Criteria andAgentidIsNull() {
            addCriterion("agentid is null");
            return (Criteria) this;
        }

        public Criteria andAgentidIsNotNull() {
            addCriterion("agentid is not null");
            return (Criteria) this;
        }

        public Criteria andAgentidEqualTo(String value) {
            addCriterion("agentid =", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotEqualTo(String value) {
            addCriterion("agentid <>", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidGreaterThan(String value) {
            addCriterion("agentid >", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidGreaterThanOrEqualTo(String value) {
            addCriterion("agentid >=", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLessThan(String value) {
            addCriterion("agentid <", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLessThanOrEqualTo(String value) {
            addCriterion("agentid <=", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLike(String value) {
            addCriterion("agentid like", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotLike(String value) {
            addCriterion("agentid not like", value, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidIn(List<String> values) {
            addCriterion("agentid in", values, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotIn(List<String> values) {
            addCriterion("agentid not in", values, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidBetween(String value1, String value2) {
            addCriterion("agentid between", value1, value2, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotBetween(String value1, String value2) {
            addCriterion("agentid not between", value1, value2, "agentid");
            return (Criteria) this;
        }

        public Criteria andAgentkeyIsNull() {
            addCriterion("agentkey is null");
            return (Criteria) this;
        }

        public Criteria andAgentkeyIsNotNull() {
            addCriterion("agentkey is not null");
            return (Criteria) this;
        }

        public Criteria andAgentkeyEqualTo(String value) {
            addCriterion("agentkey =", value, "agentkey");
            return (Criteria) this;
        }

        public Criteria andAgentkeyNotEqualTo(String value) {
            addCriterion("agentkey <>", value, "agentkey");
            return (Criteria) this;
        }

        public Criteria andAgentkeyGreaterThan(String value) {
            addCriterion("agentkey >", value, "agentkey");
            return (Criteria) this;
        }

        public Criteria andAgentkeyGreaterThanOrEqualTo(String value) {
            addCriterion("agentkey >=", value, "agentkey");
            return (Criteria) this;
        }

        public Criteria andAgentkeyLessThan(String value) {
            addCriterion("agentkey <", value, "agentkey");
            return (Criteria) this;
        }

        public Criteria andAgentkeyLessThanOrEqualTo(String value) {
            addCriterion("agentkey <=", value, "agentkey");
            return (Criteria) this;
        }

        public Criteria andAgentkeyLike(String value) {
            addCriterion("agentkey like", value, "agentkey");
            return (Criteria) this;
        }

        public Criteria andAgentkeyNotLike(String value) {
            addCriterion("agentkey not like", value, "agentkey");
            return (Criteria) this;
        }

        public Criteria andAgentkeyIn(List<String> values) {
            addCriterion("agentkey in", values, "agentkey");
            return (Criteria) this;
        }

        public Criteria andAgentkeyNotIn(List<String> values) {
            addCriterion("agentkey not in", values, "agentkey");
            return (Criteria) this;
        }

        public Criteria andAgentkeyBetween(String value1, String value2) {
            addCriterion("agentkey between", value1, value2, "agentkey");
            return (Criteria) this;
        }

        public Criteria andAgentkeyNotBetween(String value1, String value2) {
            addCriterion("agentkey not between", value1, value2, "agentkey");
            return (Criteria) this;
        }

        public Criteria andAgentpayIsNull() {
            addCriterion("agentpay is null");
            return (Criteria) this;
        }

        public Criteria andAgentpayIsNotNull() {
            addCriterion("agentpay is not null");
            return (Criteria) this;
        }

        public Criteria andAgentpayEqualTo(Integer value) {
            addCriterion("agentpay =", value, "agentpay");
            return (Criteria) this;
        }

        public Criteria andAgentpayNotEqualTo(Integer value) {
            addCriterion("agentpay <>", value, "agentpay");
            return (Criteria) this;
        }

        public Criteria andAgentpayGreaterThan(Integer value) {
            addCriterion("agentpay >", value, "agentpay");
            return (Criteria) this;
        }

        public Criteria andAgentpayGreaterThanOrEqualTo(Integer value) {
            addCriterion("agentpay >=", value, "agentpay");
            return (Criteria) this;
        }

        public Criteria andAgentpayLessThan(Integer value) {
            addCriterion("agentpay <", value, "agentpay");
            return (Criteria) this;
        }

        public Criteria andAgentpayLessThanOrEqualTo(Integer value) {
            addCriterion("agentpay <=", value, "agentpay");
            return (Criteria) this;
        }

        public Criteria andAgentpayIn(List<Integer> values) {
            addCriterion("agentpay in", values, "agentpay");
            return (Criteria) this;
        }

        public Criteria andAgentpayNotIn(List<Integer> values) {
            addCriterion("agentpay not in", values, "agentpay");
            return (Criteria) this;
        }

        public Criteria andAgentpayBetween(Integer value1, Integer value2) {
            addCriterion("agentpay between", value1, value2, "agentpay");
            return (Criteria) this;
        }

        public Criteria andAgentpayNotBetween(Integer value1, Integer value2) {
            addCriterion("agentpay not between", value1, value2, "agentpay");
            return (Criteria) this;
        }

        public Criteria andPaccountnoIsNull() {
            addCriterion("paccountno is null");
            return (Criteria) this;
        }

        public Criteria andPaccountnoIsNotNull() {
            addCriterion("paccountno is not null");
            return (Criteria) this;
        }

        public Criteria andPaccountnoEqualTo(String value) {
            addCriterion("paccountno =", value, "paccountno");
            return (Criteria) this;
        }

        public Criteria andPaccountnoNotEqualTo(String value) {
            addCriterion("paccountno <>", value, "paccountno");
            return (Criteria) this;
        }

        public Criteria andPaccountnoGreaterThan(String value) {
            addCriterion("paccountno >", value, "paccountno");
            return (Criteria) this;
        }

        public Criteria andPaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("paccountno >=", value, "paccountno");
            return (Criteria) this;
        }

        public Criteria andPaccountnoLessThan(String value) {
            addCriterion("paccountno <", value, "paccountno");
            return (Criteria) this;
        }

        public Criteria andPaccountnoLessThanOrEqualTo(String value) {
            addCriterion("paccountno <=", value, "paccountno");
            return (Criteria) this;
        }

        public Criteria andPaccountnoLike(String value) {
            addCriterion("paccountno like", value, "paccountno");
            return (Criteria) this;
        }

        public Criteria andPaccountnoNotLike(String value) {
            addCriterion("paccountno not like", value, "paccountno");
            return (Criteria) this;
        }

        public Criteria andPaccountnoIn(List<String> values) {
            addCriterion("paccountno in", values, "paccountno");
            return (Criteria) this;
        }

        public Criteria andPaccountnoNotIn(List<String> values) {
            addCriterion("paccountno not in", values, "paccountno");
            return (Criteria) this;
        }

        public Criteria andPaccountnoBetween(String value1, String value2) {
            addCriterion("paccountno between", value1, value2, "paccountno");
            return (Criteria) this;
        }

        public Criteria andPaccountnoNotBetween(String value1, String value2) {
            addCriterion("paccountno not between", value1, value2, "paccountno");
            return (Criteria) this;
        }

        public Criteria andPaccountnameIsNull() {
            addCriterion("paccountname is null");
            return (Criteria) this;
        }

        public Criteria andPaccountnameIsNotNull() {
            addCriterion("paccountname is not null");
            return (Criteria) this;
        }

        public Criteria andPaccountnameEqualTo(String value) {
            addCriterion("paccountname =", value, "paccountname");
            return (Criteria) this;
        }

        public Criteria andPaccountnameNotEqualTo(String value) {
            addCriterion("paccountname <>", value, "paccountname");
            return (Criteria) this;
        }

        public Criteria andPaccountnameGreaterThan(String value) {
            addCriterion("paccountname >", value, "paccountname");
            return (Criteria) this;
        }

        public Criteria andPaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("paccountname >=", value, "paccountname");
            return (Criteria) this;
        }

        public Criteria andPaccountnameLessThan(String value) {
            addCriterion("paccountname <", value, "paccountname");
            return (Criteria) this;
        }

        public Criteria andPaccountnameLessThanOrEqualTo(String value) {
            addCriterion("paccountname <=", value, "paccountname");
            return (Criteria) this;
        }

        public Criteria andPaccountnameLike(String value) {
            addCriterion("paccountname like", value, "paccountname");
            return (Criteria) this;
        }

        public Criteria andPaccountnameNotLike(String value) {
            addCriterion("paccountname not like", value, "paccountname");
            return (Criteria) this;
        }

        public Criteria andPaccountnameIn(List<String> values) {
            addCriterion("paccountname in", values, "paccountname");
            return (Criteria) this;
        }

        public Criteria andPaccountnameNotIn(List<String> values) {
            addCriterion("paccountname not in", values, "paccountname");
            return (Criteria) this;
        }

        public Criteria andPaccountnameBetween(String value1, String value2) {
            addCriterion("paccountname between", value1, value2, "paccountname");
            return (Criteria) this;
        }

        public Criteria andPaccountnameNotBetween(String value1, String value2) {
            addCriterion("paccountname not between", value1, value2, "paccountname");
            return (Criteria) this;
        }

        public Criteria andPbanknoIsNull() {
            addCriterion("pbankno is null");
            return (Criteria) this;
        }

        public Criteria andPbanknoIsNotNull() {
            addCriterion("pbankno is not null");
            return (Criteria) this;
        }

        public Criteria andPbanknoEqualTo(String value) {
            addCriterion("pbankno =", value, "pbankno");
            return (Criteria) this;
        }

        public Criteria andPbanknoNotEqualTo(String value) {
            addCriterion("pbankno <>", value, "pbankno");
            return (Criteria) this;
        }

        public Criteria andPbanknoGreaterThan(String value) {
            addCriterion("pbankno >", value, "pbankno");
            return (Criteria) this;
        }

        public Criteria andPbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("pbankno >=", value, "pbankno");
            return (Criteria) this;
        }

        public Criteria andPbanknoLessThan(String value) {
            addCriterion("pbankno <", value, "pbankno");
            return (Criteria) this;
        }

        public Criteria andPbanknoLessThanOrEqualTo(String value) {
            addCriterion("pbankno <=", value, "pbankno");
            return (Criteria) this;
        }

        public Criteria andPbanknoLike(String value) {
            addCriterion("pbankno like", value, "pbankno");
            return (Criteria) this;
        }

        public Criteria andPbanknoNotLike(String value) {
            addCriterion("pbankno not like", value, "pbankno");
            return (Criteria) this;
        }

        public Criteria andPbanknoIn(List<String> values) {
            addCriterion("pbankno in", values, "pbankno");
            return (Criteria) this;
        }

        public Criteria andPbanknoNotIn(List<String> values) {
            addCriterion("pbankno not in", values, "pbankno");
            return (Criteria) this;
        }

        public Criteria andPbanknoBetween(String value1, String value2) {
            addCriterion("pbankno between", value1, value2, "pbankno");
            return (Criteria) this;
        }

        public Criteria andPbanknoNotBetween(String value1, String value2) {
            addCriterion("pbankno not between", value1, value2, "pbankno");
            return (Criteria) this;
        }

        public Criteria andPbanknameIsNull() {
            addCriterion("pbankname is null");
            return (Criteria) this;
        }

        public Criteria andPbanknameIsNotNull() {
            addCriterion("pbankname is not null");
            return (Criteria) this;
        }

        public Criteria andPbanknameEqualTo(String value) {
            addCriterion("pbankname =", value, "pbankname");
            return (Criteria) this;
        }

        public Criteria andPbanknameNotEqualTo(String value) {
            addCriterion("pbankname <>", value, "pbankname");
            return (Criteria) this;
        }

        public Criteria andPbanknameGreaterThan(String value) {
            addCriterion("pbankname >", value, "pbankname");
            return (Criteria) this;
        }

        public Criteria andPbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("pbankname >=", value, "pbankname");
            return (Criteria) this;
        }

        public Criteria andPbanknameLessThan(String value) {
            addCriterion("pbankname <", value, "pbankname");
            return (Criteria) this;
        }

        public Criteria andPbanknameLessThanOrEqualTo(String value) {
            addCriterion("pbankname <=", value, "pbankname");
            return (Criteria) this;
        }

        public Criteria andPbanknameLike(String value) {
            addCriterion("pbankname like", value, "pbankname");
            return (Criteria) this;
        }

        public Criteria andPbanknameNotLike(String value) {
            addCriterion("pbankname not like", value, "pbankname");
            return (Criteria) this;
        }

        public Criteria andPbanknameIn(List<String> values) {
            addCriterion("pbankname in", values, "pbankname");
            return (Criteria) this;
        }

        public Criteria andPbanknameNotIn(List<String> values) {
            addCriterion("pbankname not in", values, "pbankname");
            return (Criteria) this;
        }

        public Criteria andPbanknameBetween(String value1, String value2) {
            addCriterion("pbankname between", value1, value2, "pbankname");
            return (Criteria) this;
        }

        public Criteria andPbanknameNotBetween(String value1, String value2) {
            addCriterion("pbankname not between", value1, value2, "pbankname");
            return (Criteria) this;
        }

        public Criteria andPaccountIsNull() {
            addCriterion("paccount is null");
            return (Criteria) this;
        }

        public Criteria andPaccountIsNotNull() {
            addCriterion("paccount is not null");
            return (Criteria) this;
        }

        public Criteria andPaccountEqualTo(Double value) {
            addCriterion("paccount =", value, "paccount");
            return (Criteria) this;
        }

        public Criteria andPaccountNotEqualTo(Double value) {
            addCriterion("paccount <>", value, "paccount");
            return (Criteria) this;
        }

        public Criteria andPaccountGreaterThan(Double value) {
            addCriterion("paccount >", value, "paccount");
            return (Criteria) this;
        }

        public Criteria andPaccountGreaterThanOrEqualTo(Double value) {
            addCriterion("paccount >=", value, "paccount");
            return (Criteria) this;
        }

        public Criteria andPaccountLessThan(Double value) {
            addCriterion("paccount <", value, "paccount");
            return (Criteria) this;
        }

        public Criteria andPaccountLessThanOrEqualTo(Double value) {
            addCriterion("paccount <=", value, "paccount");
            return (Criteria) this;
        }

        public Criteria andPaccountIn(List<Double> values) {
            addCriterion("paccount in", values, "paccount");
            return (Criteria) this;
        }

        public Criteria andPaccountNotIn(List<Double> values) {
            addCriterion("paccount not in", values, "paccount");
            return (Criteria) this;
        }

        public Criteria andPaccountBetween(Double value1, Double value2) {
            addCriterion("paccount between", value1, value2, "paccount");
            return (Criteria) this;
        }

        public Criteria andPaccountNotBetween(Double value1, Double value2) {
            addCriterion("paccount not between", value1, value2, "paccount");
            return (Criteria) this;
        }

        public Criteria andPremIsNull() {
            addCriterion("prem is null");
            return (Criteria) this;
        }

        public Criteria andPremIsNotNull() {
            addCriterion("prem is not null");
            return (Criteria) this;
        }

        public Criteria andPremEqualTo(String value) {
            addCriterion("prem =", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremNotEqualTo(String value) {
            addCriterion("prem <>", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremGreaterThan(String value) {
            addCriterion("prem >", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremGreaterThanOrEqualTo(String value) {
            addCriterion("prem >=", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremLessThan(String value) {
            addCriterion("prem <", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremLessThanOrEqualTo(String value) {
            addCriterion("prem <=", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremLike(String value) {
            addCriterion("prem like", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremNotLike(String value) {
            addCriterion("prem not like", value, "prem");
            return (Criteria) this;
        }

        public Criteria andPremIn(List<String> values) {
            addCriterion("prem in", values, "prem");
            return (Criteria) this;
        }

        public Criteria andPremNotIn(List<String> values) {
            addCriterion("prem not in", values, "prem");
            return (Criteria) this;
        }

        public Criteria andPremBetween(String value1, String value2) {
            addCriterion("prem between", value1, value2, "prem");
            return (Criteria) this;
        }

        public Criteria andPremNotBetween(String value1, String value2) {
            addCriterion("prem not between", value1, value2, "prem");
            return (Criteria) this;
        }

        public Criteria andEaccountnoIsNull() {
            addCriterion("eaccountno is null");
            return (Criteria) this;
        }

        public Criteria andEaccountnoIsNotNull() {
            addCriterion("eaccountno is not null");
            return (Criteria) this;
        }

        public Criteria andEaccountnoEqualTo(String value) {
            addCriterion("eaccountno =", value, "eaccountno");
            return (Criteria) this;
        }

        public Criteria andEaccountnoNotEqualTo(String value) {
            addCriterion("eaccountno <>", value, "eaccountno");
            return (Criteria) this;
        }

        public Criteria andEaccountnoGreaterThan(String value) {
            addCriterion("eaccountno >", value, "eaccountno");
            return (Criteria) this;
        }

        public Criteria andEaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("eaccountno >=", value, "eaccountno");
            return (Criteria) this;
        }

        public Criteria andEaccountnoLessThan(String value) {
            addCriterion("eaccountno <", value, "eaccountno");
            return (Criteria) this;
        }

        public Criteria andEaccountnoLessThanOrEqualTo(String value) {
            addCriterion("eaccountno <=", value, "eaccountno");
            return (Criteria) this;
        }

        public Criteria andEaccountnoLike(String value) {
            addCriterion("eaccountno like", value, "eaccountno");
            return (Criteria) this;
        }

        public Criteria andEaccountnoNotLike(String value) {
            addCriterion("eaccountno not like", value, "eaccountno");
            return (Criteria) this;
        }

        public Criteria andEaccountnoIn(List<String> values) {
            addCriterion("eaccountno in", values, "eaccountno");
            return (Criteria) this;
        }

        public Criteria andEaccountnoNotIn(List<String> values) {
            addCriterion("eaccountno not in", values, "eaccountno");
            return (Criteria) this;
        }

        public Criteria andEaccountnoBetween(String value1, String value2) {
            addCriterion("eaccountno between", value1, value2, "eaccountno");
            return (Criteria) this;
        }

        public Criteria andEaccountnoNotBetween(String value1, String value2) {
            addCriterion("eaccountno not between", value1, value2, "eaccountno");
            return (Criteria) this;
        }

        public Criteria andEaccountnameIsNull() {
            addCriterion("eaccountname is null");
            return (Criteria) this;
        }

        public Criteria andEaccountnameIsNotNull() {
            addCriterion("eaccountname is not null");
            return (Criteria) this;
        }

        public Criteria andEaccountnameEqualTo(String value) {
            addCriterion("eaccountname =", value, "eaccountname");
            return (Criteria) this;
        }

        public Criteria andEaccountnameNotEqualTo(String value) {
            addCriterion("eaccountname <>", value, "eaccountname");
            return (Criteria) this;
        }

        public Criteria andEaccountnameGreaterThan(String value) {
            addCriterion("eaccountname >", value, "eaccountname");
            return (Criteria) this;
        }

        public Criteria andEaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("eaccountname >=", value, "eaccountname");
            return (Criteria) this;
        }

        public Criteria andEaccountnameLessThan(String value) {
            addCriterion("eaccountname <", value, "eaccountname");
            return (Criteria) this;
        }

        public Criteria andEaccountnameLessThanOrEqualTo(String value) {
            addCriterion("eaccountname <=", value, "eaccountname");
            return (Criteria) this;
        }

        public Criteria andEaccountnameLike(String value) {
            addCriterion("eaccountname like", value, "eaccountname");
            return (Criteria) this;
        }

        public Criteria andEaccountnameNotLike(String value) {
            addCriterion("eaccountname not like", value, "eaccountname");
            return (Criteria) this;
        }

        public Criteria andEaccountnameIn(List<String> values) {
            addCriterion("eaccountname in", values, "eaccountname");
            return (Criteria) this;
        }

        public Criteria andEaccountnameNotIn(List<String> values) {
            addCriterion("eaccountname not in", values, "eaccountname");
            return (Criteria) this;
        }

        public Criteria andEaccountnameBetween(String value1, String value2) {
            addCriterion("eaccountname between", value1, value2, "eaccountname");
            return (Criteria) this;
        }

        public Criteria andEaccountnameNotBetween(String value1, String value2) {
            addCriterion("eaccountname not between", value1, value2, "eaccountname");
            return (Criteria) this;
        }

        public Criteria andEbanknoIsNull() {
            addCriterion("ebankno is null");
            return (Criteria) this;
        }

        public Criteria andEbanknoIsNotNull() {
            addCriterion("ebankno is not null");
            return (Criteria) this;
        }

        public Criteria andEbanknoEqualTo(String value) {
            addCriterion("ebankno =", value, "ebankno");
            return (Criteria) this;
        }

        public Criteria andEbanknoNotEqualTo(String value) {
            addCriterion("ebankno <>", value, "ebankno");
            return (Criteria) this;
        }

        public Criteria andEbanknoGreaterThan(String value) {
            addCriterion("ebankno >", value, "ebankno");
            return (Criteria) this;
        }

        public Criteria andEbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("ebankno >=", value, "ebankno");
            return (Criteria) this;
        }

        public Criteria andEbanknoLessThan(String value) {
            addCriterion("ebankno <", value, "ebankno");
            return (Criteria) this;
        }

        public Criteria andEbanknoLessThanOrEqualTo(String value) {
            addCriterion("ebankno <=", value, "ebankno");
            return (Criteria) this;
        }

        public Criteria andEbanknoLike(String value) {
            addCriterion("ebankno like", value, "ebankno");
            return (Criteria) this;
        }

        public Criteria andEbanknoNotLike(String value) {
            addCriterion("ebankno not like", value, "ebankno");
            return (Criteria) this;
        }

        public Criteria andEbanknoIn(List<String> values) {
            addCriterion("ebankno in", values, "ebankno");
            return (Criteria) this;
        }

        public Criteria andEbanknoNotIn(List<String> values) {
            addCriterion("ebankno not in", values, "ebankno");
            return (Criteria) this;
        }

        public Criteria andEbanknoBetween(String value1, String value2) {
            addCriterion("ebankno between", value1, value2, "ebankno");
            return (Criteria) this;
        }

        public Criteria andEbanknoNotBetween(String value1, String value2) {
            addCriterion("ebankno not between", value1, value2, "ebankno");
            return (Criteria) this;
        }

        public Criteria andEbanknameIsNull() {
            addCriterion("ebankname is null");
            return (Criteria) this;
        }

        public Criteria andEbanknameIsNotNull() {
            addCriterion("ebankname is not null");
            return (Criteria) this;
        }

        public Criteria andEbanknameEqualTo(String value) {
            addCriterion("ebankname =", value, "ebankname");
            return (Criteria) this;
        }

        public Criteria andEbanknameNotEqualTo(String value) {
            addCriterion("ebankname <>", value, "ebankname");
            return (Criteria) this;
        }

        public Criteria andEbanknameGreaterThan(String value) {
            addCriterion("ebankname >", value, "ebankname");
            return (Criteria) this;
        }

        public Criteria andEbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("ebankname >=", value, "ebankname");
            return (Criteria) this;
        }

        public Criteria andEbanknameLessThan(String value) {
            addCriterion("ebankname <", value, "ebankname");
            return (Criteria) this;
        }

        public Criteria andEbanknameLessThanOrEqualTo(String value) {
            addCriterion("ebankname <=", value, "ebankname");
            return (Criteria) this;
        }

        public Criteria andEbanknameLike(String value) {
            addCriterion("ebankname like", value, "ebankname");
            return (Criteria) this;
        }

        public Criteria andEbanknameNotLike(String value) {
            addCriterion("ebankname not like", value, "ebankname");
            return (Criteria) this;
        }

        public Criteria andEbanknameIn(List<String> values) {
            addCriterion("ebankname in", values, "ebankname");
            return (Criteria) this;
        }

        public Criteria andEbanknameNotIn(List<String> values) {
            addCriterion("ebankname not in", values, "ebankname");
            return (Criteria) this;
        }

        public Criteria andEbanknameBetween(String value1, String value2) {
            addCriterion("ebankname between", value1, value2, "ebankname");
            return (Criteria) this;
        }

        public Criteria andEbanknameNotBetween(String value1, String value2) {
            addCriterion("ebankname not between", value1, value2, "ebankname");
            return (Criteria) this;
        }

        public Criteria andEaccountIsNull() {
            addCriterion("eaccount is null");
            return (Criteria) this;
        }

        public Criteria andEaccountIsNotNull() {
            addCriterion("eaccount is not null");
            return (Criteria) this;
        }

        public Criteria andEaccountEqualTo(Double value) {
            addCriterion("eaccount =", value, "eaccount");
            return (Criteria) this;
        }

        public Criteria andEaccountNotEqualTo(Double value) {
            addCriterion("eaccount <>", value, "eaccount");
            return (Criteria) this;
        }

        public Criteria andEaccountGreaterThan(Double value) {
            addCriterion("eaccount >", value, "eaccount");
            return (Criteria) this;
        }

        public Criteria andEaccountGreaterThanOrEqualTo(Double value) {
            addCriterion("eaccount >=", value, "eaccount");
            return (Criteria) this;
        }

        public Criteria andEaccountLessThan(Double value) {
            addCriterion("eaccount <", value, "eaccount");
            return (Criteria) this;
        }

        public Criteria andEaccountLessThanOrEqualTo(Double value) {
            addCriterion("eaccount <=", value, "eaccount");
            return (Criteria) this;
        }

        public Criteria andEaccountIn(List<Double> values) {
            addCriterion("eaccount in", values, "eaccount");
            return (Criteria) this;
        }

        public Criteria andEaccountNotIn(List<Double> values) {
            addCriterion("eaccount not in", values, "eaccount");
            return (Criteria) this;
        }

        public Criteria andEaccountBetween(Double value1, Double value2) {
            addCriterion("eaccount between", value1, value2, "eaccount");
            return (Criteria) this;
        }

        public Criteria andEaccountNotBetween(Double value1, Double value2) {
            addCriterion("eaccount not between", value1, value2, "eaccount");
            return (Criteria) this;
        }

        public Criteria andEremIsNull() {
            addCriterion("erem is null");
            return (Criteria) this;
        }

        public Criteria andEremIsNotNull() {
            addCriterion("erem is not null");
            return (Criteria) this;
        }

        public Criteria andEremEqualTo(String value) {
            addCriterion("erem =", value, "erem");
            return (Criteria) this;
        }

        public Criteria andEremNotEqualTo(String value) {
            addCriterion("erem <>", value, "erem");
            return (Criteria) this;
        }

        public Criteria andEremGreaterThan(String value) {
            addCriterion("erem >", value, "erem");
            return (Criteria) this;
        }

        public Criteria andEremGreaterThanOrEqualTo(String value) {
            addCriterion("erem >=", value, "erem");
            return (Criteria) this;
        }

        public Criteria andEremLessThan(String value) {
            addCriterion("erem <", value, "erem");
            return (Criteria) this;
        }

        public Criteria andEremLessThanOrEqualTo(String value) {
            addCriterion("erem <=", value, "erem");
            return (Criteria) this;
        }

        public Criteria andEremLike(String value) {
            addCriterion("erem like", value, "erem");
            return (Criteria) this;
        }

        public Criteria andEremNotLike(String value) {
            addCriterion("erem not like", value, "erem");
            return (Criteria) this;
        }

        public Criteria andEremIn(List<String> values) {
            addCriterion("erem in", values, "erem");
            return (Criteria) this;
        }

        public Criteria andEremNotIn(List<String> values) {
            addCriterion("erem not in", values, "erem");
            return (Criteria) this;
        }

        public Criteria andEremBetween(String value1, String value2) {
            addCriterion("erem between", value1, value2, "erem");
            return (Criteria) this;
        }

        public Criteria andEremNotBetween(String value1, String value2) {
            addCriterion("erem not between", value1, value2, "erem");
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