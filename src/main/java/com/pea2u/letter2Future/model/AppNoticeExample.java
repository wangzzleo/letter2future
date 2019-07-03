package com.pea2u.letter2Future.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppNoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppNoticeExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameIsNull() {
            addCriterion("addressee_name is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameIsNotNull() {
            addCriterion("addressee_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameEqualTo(String value) {
            addCriterion("addressee_name =", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotEqualTo(String value) {
            addCriterion("addressee_name <>", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameGreaterThan(String value) {
            addCriterion("addressee_name >", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameGreaterThanOrEqualTo(String value) {
            addCriterion("addressee_name >=", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLessThan(String value) {
            addCriterion("addressee_name <", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLessThanOrEqualTo(String value) {
            addCriterion("addressee_name <=", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLike(String value) {
            addCriterion("addressee_name like", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotLike(String value) {
            addCriterion("addressee_name not like", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameIn(List<String> values) {
            addCriterion("addressee_name in", values, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotIn(List<String> values) {
            addCriterion("addressee_name not in", values, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameBetween(String value1, String value2) {
            addCriterion("addressee_name between", value1, value2, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotBetween(String value1, String value2) {
            addCriterion("addressee_name not between", value1, value2, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeIsNull() {
            addCriterion("addressee_zip_code is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeIsNotNull() {
            addCriterion("addressee_zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeEqualTo(String value) {
            addCriterion("addressee_zip_code =", value, "addresseeZipCode");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeNotEqualTo(String value) {
            addCriterion("addressee_zip_code <>", value, "addresseeZipCode");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeGreaterThan(String value) {
            addCriterion("addressee_zip_code >", value, "addresseeZipCode");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("addressee_zip_code >=", value, "addresseeZipCode");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeLessThan(String value) {
            addCriterion("addressee_zip_code <", value, "addresseeZipCode");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeLessThanOrEqualTo(String value) {
            addCriterion("addressee_zip_code <=", value, "addresseeZipCode");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeLike(String value) {
            addCriterion("addressee_zip_code like", value, "addresseeZipCode");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeNotLike(String value) {
            addCriterion("addressee_zip_code not like", value, "addresseeZipCode");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeIn(List<String> values) {
            addCriterion("addressee_zip_code in", values, "addresseeZipCode");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeNotIn(List<String> values) {
            addCriterion("addressee_zip_code not in", values, "addresseeZipCode");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeBetween(String value1, String value2) {
            addCriterion("addressee_zip_code between", value1, value2, "addresseeZipCode");
            return (Criteria) this;
        }

        public Criteria andAddresseeZipCodeNotBetween(String value1, String value2) {
            addCriterion("addressee_zip_code not between", value1, value2, "addresseeZipCode");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressIsNull() {
            addCriterion("addressee_address is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressIsNotNull() {
            addCriterion("addressee_address is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressEqualTo(String value) {
            addCriterion("addressee_address =", value, "addresseeAddress");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressNotEqualTo(String value) {
            addCriterion("addressee_address <>", value, "addresseeAddress");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressGreaterThan(String value) {
            addCriterion("addressee_address >", value, "addresseeAddress");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("addressee_address >=", value, "addresseeAddress");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressLessThan(String value) {
            addCriterion("addressee_address <", value, "addresseeAddress");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressLessThanOrEqualTo(String value) {
            addCriterion("addressee_address <=", value, "addresseeAddress");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressLike(String value) {
            addCriterion("addressee_address like", value, "addresseeAddress");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressNotLike(String value) {
            addCriterion("addressee_address not like", value, "addresseeAddress");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressIn(List<String> values) {
            addCriterion("addressee_address in", values, "addresseeAddress");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressNotIn(List<String> values) {
            addCriterion("addressee_address not in", values, "addresseeAddress");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressBetween(String value1, String value2) {
            addCriterion("addressee_address between", value1, value2, "addresseeAddress");
            return (Criteria) this;
        }

        public Criteria andAddresseeAddressNotBetween(String value1, String value2) {
            addCriterion("addressee_address not between", value1, value2, "addresseeAddress");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneIsNull() {
            addCriterion("addressee_phone is null");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneIsNotNull() {
            addCriterion("addressee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneEqualTo(String value) {
            addCriterion("addressee_phone =", value, "addresseePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneNotEqualTo(String value) {
            addCriterion("addressee_phone <>", value, "addresseePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneGreaterThan(String value) {
            addCriterion("addressee_phone >", value, "addresseePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("addressee_phone >=", value, "addresseePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneLessThan(String value) {
            addCriterion("addressee_phone <", value, "addresseePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneLessThanOrEqualTo(String value) {
            addCriterion("addressee_phone <=", value, "addresseePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneLike(String value) {
            addCriterion("addressee_phone like", value, "addresseePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneNotLike(String value) {
            addCriterion("addressee_phone not like", value, "addresseePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneIn(List<String> values) {
            addCriterion("addressee_phone in", values, "addresseePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneNotIn(List<String> values) {
            addCriterion("addressee_phone not in", values, "addresseePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneBetween(String value1, String value2) {
            addCriterion("addressee_phone between", value1, value2, "addresseePhone");
            return (Criteria) this;
        }

        public Criteria andAddresseePhoneNotBetween(String value1, String value2) {
            addCriterion("addressee_phone not between", value1, value2, "addresseePhone");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNull() {
            addCriterion("sender_name is null");
            return (Criteria) this;
        }

        public Criteria andSenderNameIsNotNull() {
            addCriterion("sender_name is not null");
            return (Criteria) this;
        }

        public Criteria andSenderNameEqualTo(String value) {
            addCriterion("sender_name =", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotEqualTo(String value) {
            addCriterion("sender_name <>", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThan(String value) {
            addCriterion("sender_name >", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("sender_name >=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThan(String value) {
            addCriterion("sender_name <", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLessThanOrEqualTo(String value) {
            addCriterion("sender_name <=", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameLike(String value) {
            addCriterion("sender_name like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotLike(String value) {
            addCriterion("sender_name not like", value, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameIn(List<String> values) {
            addCriterion("sender_name in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotIn(List<String> values) {
            addCriterion("sender_name not in", values, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameBetween(String value1, String value2) {
            addCriterion("sender_name between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderNameNotBetween(String value1, String value2) {
            addCriterion("sender_name not between", value1, value2, "senderName");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeIsNull() {
            addCriterion("sender_zip_code is null");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeIsNotNull() {
            addCriterion("sender_zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeEqualTo(String value) {
            addCriterion("sender_zip_code =", value, "senderZipCode");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeNotEqualTo(String value) {
            addCriterion("sender_zip_code <>", value, "senderZipCode");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeGreaterThan(String value) {
            addCriterion("sender_zip_code >", value, "senderZipCode");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sender_zip_code >=", value, "senderZipCode");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeLessThan(String value) {
            addCriterion("sender_zip_code <", value, "senderZipCode");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeLessThanOrEqualTo(String value) {
            addCriterion("sender_zip_code <=", value, "senderZipCode");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeLike(String value) {
            addCriterion("sender_zip_code like", value, "senderZipCode");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeNotLike(String value) {
            addCriterion("sender_zip_code not like", value, "senderZipCode");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeIn(List<String> values) {
            addCriterion("sender_zip_code in", values, "senderZipCode");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeNotIn(List<String> values) {
            addCriterion("sender_zip_code not in", values, "senderZipCode");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeBetween(String value1, String value2) {
            addCriterion("sender_zip_code between", value1, value2, "senderZipCode");
            return (Criteria) this;
        }

        public Criteria andSenderZipCodeNotBetween(String value1, String value2) {
            addCriterion("sender_zip_code not between", value1, value2, "senderZipCode");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNull() {
            addCriterion("sender_address is null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIsNotNull() {
            addCriterion("sender_address is not null");
            return (Criteria) this;
        }

        public Criteria andSenderAddressEqualTo(String value) {
            addCriterion("sender_address =", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotEqualTo(String value) {
            addCriterion("sender_address <>", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThan(String value) {
            addCriterion("sender_address >", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("sender_address >=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThan(String value) {
            addCriterion("sender_address <", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLessThanOrEqualTo(String value) {
            addCriterion("sender_address <=", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressLike(String value) {
            addCriterion("sender_address like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotLike(String value) {
            addCriterion("sender_address not like", value, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressIn(List<String> values) {
            addCriterion("sender_address in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotIn(List<String> values) {
            addCriterion("sender_address not in", values, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressBetween(String value1, String value2) {
            addCriterion("sender_address between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderAddressNotBetween(String value1, String value2) {
            addCriterion("sender_address not between", value1, value2, "senderAddress");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneIsNull() {
            addCriterion("sender_phone is null");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneIsNotNull() {
            addCriterion("sender_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneEqualTo(String value) {
            addCriterion("sender_phone =", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneNotEqualTo(String value) {
            addCriterion("sender_phone <>", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneGreaterThan(String value) {
            addCriterion("sender_phone >", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("sender_phone >=", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneLessThan(String value) {
            addCriterion("sender_phone <", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneLessThanOrEqualTo(String value) {
            addCriterion("sender_phone <=", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneLike(String value) {
            addCriterion("sender_phone like", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneNotLike(String value) {
            addCriterion("sender_phone not like", value, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneIn(List<String> values) {
            addCriterion("sender_phone in", values, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneNotIn(List<String> values) {
            addCriterion("sender_phone not in", values, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneBetween(String value1, String value2) {
            addCriterion("sender_phone between", value1, value2, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andSenderPhoneNotBetween(String value1, String value2) {
            addCriterion("sender_phone not between", value1, value2, "senderPhone");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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