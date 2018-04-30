package cn.zouhuachao.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PaygradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaygradeExample() {
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

        public Criteria andPaygradeidIsNull() {
            addCriterion("paygradeid is null");
            return (Criteria) this;
        }

        public Criteria andPaygradeidIsNotNull() {
            addCriterion("paygradeid is not null");
            return (Criteria) this;
        }

        public Criteria andPaygradeidEqualTo(String value) {
            addCriterion("paygradeid =", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidNotEqualTo(String value) {
            addCriterion("paygradeid <>", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidGreaterThan(String value) {
            addCriterion("paygradeid >", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidGreaterThanOrEqualTo(String value) {
            addCriterion("paygradeid >=", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidLessThan(String value) {
            addCriterion("paygradeid <", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidLessThanOrEqualTo(String value) {
            addCriterion("paygradeid <=", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidLike(String value) {
            addCriterion("paygradeid like", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidNotLike(String value) {
            addCriterion("paygradeid not like", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidIn(List<String> values) {
            addCriterion("paygradeid in", values, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidNotIn(List<String> values) {
            addCriterion("paygradeid not in", values, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidBetween(String value1, String value2) {
            addCriterion("paygradeid between", value1, value2, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidNotBetween(String value1, String value2) {
            addCriterion("paygradeid not between", value1, value2, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradenoIsNull() {
            addCriterion("paygradeno is null");
            return (Criteria) this;
        }

        public Criteria andPaygradenoIsNotNull() {
            addCriterion("paygradeno is not null");
            return (Criteria) this;
        }

        public Criteria andPaygradenoEqualTo(String value) {
            addCriterion("paygradeno =", value, "paygradeno");
            return (Criteria) this;
        }

        public Criteria andPaygradenoNotEqualTo(String value) {
            addCriterion("paygradeno <>", value, "paygradeno");
            return (Criteria) this;
        }

        public Criteria andPaygradenoGreaterThan(String value) {
            addCriterion("paygradeno >", value, "paygradeno");
            return (Criteria) this;
        }

        public Criteria andPaygradenoGreaterThanOrEqualTo(String value) {
            addCriterion("paygradeno >=", value, "paygradeno");
            return (Criteria) this;
        }

        public Criteria andPaygradenoLessThan(String value) {
            addCriterion("paygradeno <", value, "paygradeno");
            return (Criteria) this;
        }

        public Criteria andPaygradenoLessThanOrEqualTo(String value) {
            addCriterion("paygradeno <=", value, "paygradeno");
            return (Criteria) this;
        }

        public Criteria andPaygradenoLike(String value) {
            addCriterion("paygradeno like", value, "paygradeno");
            return (Criteria) this;
        }

        public Criteria andPaygradenoNotLike(String value) {
            addCriterion("paygradeno not like", value, "paygradeno");
            return (Criteria) this;
        }

        public Criteria andPaygradenoIn(List<String> values) {
            addCriterion("paygradeno in", values, "paygradeno");
            return (Criteria) this;
        }

        public Criteria andPaygradenoNotIn(List<String> values) {
            addCriterion("paygradeno not in", values, "paygradeno");
            return (Criteria) this;
        }

        public Criteria andPaygradenoBetween(String value1, String value2) {
            addCriterion("paygradeno between", value1, value2, "paygradeno");
            return (Criteria) this;
        }

        public Criteria andPaygradenoNotBetween(String value1, String value2) {
            addCriterion("paygradeno not between", value1, value2, "paygradeno");
            return (Criteria) this;
        }

        public Criteria andHeadshipIsNull() {
            addCriterion("headship is null");
            return (Criteria) this;
        }

        public Criteria andHeadshipIsNotNull() {
            addCriterion("headship is not null");
            return (Criteria) this;
        }

        public Criteria andHeadshipEqualTo(String value) {
            addCriterion("headship =", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipNotEqualTo(String value) {
            addCriterion("headship <>", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipGreaterThan(String value) {
            addCriterion("headship >", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipGreaterThanOrEqualTo(String value) {
            addCriterion("headship >=", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipLessThan(String value) {
            addCriterion("headship <", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipLessThanOrEqualTo(String value) {
            addCriterion("headship <=", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipLike(String value) {
            addCriterion("headship like", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipNotLike(String value) {
            addCriterion("headship not like", value, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipIn(List<String> values) {
            addCriterion("headship in", values, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipNotIn(List<String> values) {
            addCriterion("headship not in", values, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipBetween(String value1, String value2) {
            addCriterion("headship between", value1, value2, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshipNotBetween(String value1, String value2) {
            addCriterion("headship not between", value1, value2, "headship");
            return (Criteria) this;
        }

        public Criteria andHeadshippayIsNull() {
            addCriterion("headshippay is null");
            return (Criteria) this;
        }

        public Criteria andHeadshippayIsNotNull() {
            addCriterion("headshippay is not null");
            return (Criteria) this;
        }

        public Criteria andHeadshippayEqualTo(BigDecimal value) {
            addCriterion("headshippay =", value, "headshippay");
            return (Criteria) this;
        }

        public Criteria andHeadshippayNotEqualTo(BigDecimal value) {
            addCriterion("headshippay <>", value, "headshippay");
            return (Criteria) this;
        }

        public Criteria andHeadshippayGreaterThan(BigDecimal value) {
            addCriterion("headshippay >", value, "headshippay");
            return (Criteria) this;
        }

        public Criteria andHeadshippayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("headshippay >=", value, "headshippay");
            return (Criteria) this;
        }

        public Criteria andHeadshippayLessThan(BigDecimal value) {
            addCriterion("headshippay <", value, "headshippay");
            return (Criteria) this;
        }

        public Criteria andHeadshippayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("headshippay <=", value, "headshippay");
            return (Criteria) this;
        }

        public Criteria andHeadshippayIn(List<BigDecimal> values) {
            addCriterion("headshippay in", values, "headshippay");
            return (Criteria) this;
        }

        public Criteria andHeadshippayNotIn(List<BigDecimal> values) {
            addCriterion("headshippay not in", values, "headshippay");
            return (Criteria) this;
        }

        public Criteria andHeadshippayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("headshippay between", value1, value2, "headshippay");
            return (Criteria) this;
        }

        public Criteria andHeadshippayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("headshippay not between", value1, value2, "headshippay");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitlewageIsNull() {
            addCriterion("titlewage is null");
            return (Criteria) this;
        }

        public Criteria andTitlewageIsNotNull() {
            addCriterion("titlewage is not null");
            return (Criteria) this;
        }

        public Criteria andTitlewageEqualTo(BigDecimal value) {
            addCriterion("titlewage =", value, "titlewage");
            return (Criteria) this;
        }

        public Criteria andTitlewageNotEqualTo(BigDecimal value) {
            addCriterion("titlewage <>", value, "titlewage");
            return (Criteria) this;
        }

        public Criteria andTitlewageGreaterThan(BigDecimal value) {
            addCriterion("titlewage >", value, "titlewage");
            return (Criteria) this;
        }

        public Criteria andTitlewageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("titlewage >=", value, "titlewage");
            return (Criteria) this;
        }

        public Criteria andTitlewageLessThan(BigDecimal value) {
            addCriterion("titlewage <", value, "titlewage");
            return (Criteria) this;
        }

        public Criteria andTitlewageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("titlewage <=", value, "titlewage");
            return (Criteria) this;
        }

        public Criteria andTitlewageIn(List<BigDecimal> values) {
            addCriterion("titlewage in", values, "titlewage");
            return (Criteria) this;
        }

        public Criteria andTitlewageNotIn(List<BigDecimal> values) {
            addCriterion("titlewage not in", values, "titlewage");
            return (Criteria) this;
        }

        public Criteria andTitlewageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("titlewage between", value1, value2, "titlewage");
            return (Criteria) this;
        }

        public Criteria andTitlewageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("titlewage not between", value1, value2, "titlewage");
            return (Criteria) this;
        }

        public Criteria andAllowanceIsNull() {
            addCriterion("allowance is null");
            return (Criteria) this;
        }

        public Criteria andAllowanceIsNotNull() {
            addCriterion("allowance is not null");
            return (Criteria) this;
        }

        public Criteria andAllowanceEqualTo(BigDecimal value) {
            addCriterion("allowance =", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceNotEqualTo(BigDecimal value) {
            addCriterion("allowance <>", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceGreaterThan(BigDecimal value) {
            addCriterion("allowance >", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("allowance >=", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceLessThan(BigDecimal value) {
            addCriterion("allowance <", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("allowance <=", value, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceIn(List<BigDecimal> values) {
            addCriterion("allowance in", values, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceNotIn(List<BigDecimal> values) {
            addCriterion("allowance not in", values, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allowance between", value1, value2, "allowance");
            return (Criteria) this;
        }

        public Criteria andAllowanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allowance not between", value1, value2, "allowance");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeIsNull() {
            addCriterion("paygradedescribe is null");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeIsNotNull() {
            addCriterion("paygradedescribe is not null");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeEqualTo(String value) {
            addCriterion("paygradedescribe =", value, "paygradedescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeNotEqualTo(String value) {
            addCriterion("paygradedescribe <>", value, "paygradedescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeGreaterThan(String value) {
            addCriterion("paygradedescribe >", value, "paygradedescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeGreaterThanOrEqualTo(String value) {
            addCriterion("paygradedescribe >=", value, "paygradedescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeLessThan(String value) {
            addCriterion("paygradedescribe <", value, "paygradedescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeLessThanOrEqualTo(String value) {
            addCriterion("paygradedescribe <=", value, "paygradedescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeLike(String value) {
            addCriterion("paygradedescribe like", value, "paygradedescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeNotLike(String value) {
            addCriterion("paygradedescribe not like", value, "paygradedescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeIn(List<String> values) {
            addCriterion("paygradedescribe in", values, "paygradedescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeNotIn(List<String> values) {
            addCriterion("paygradedescribe not in", values, "paygradedescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeBetween(String value1, String value2) {
            addCriterion("paygradedescribe between", value1, value2, "paygradedescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradedescribeNotBetween(String value1, String value2) {
            addCriterion("paygradedescribe not between", value1, value2, "paygradedescribe");
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