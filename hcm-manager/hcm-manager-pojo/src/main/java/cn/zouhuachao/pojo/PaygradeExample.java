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

        public Criteria andPaygradeIdIsNull() {
            addCriterion("paygrade_id is null");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdIsNotNull() {
            addCriterion("paygrade_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdEqualTo(String value) {
            addCriterion("paygrade_id =", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdNotEqualTo(String value) {
            addCriterion("paygrade_id <>", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdGreaterThan(String value) {
            addCriterion("paygrade_id >", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("paygrade_id >=", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdLessThan(String value) {
            addCriterion("paygrade_id <", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdLessThanOrEqualTo(String value) {
            addCriterion("paygrade_id <=", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdLike(String value) {
            addCriterion("paygrade_id like", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdNotLike(String value) {
            addCriterion("paygrade_id not like", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdIn(List<String> values) {
            addCriterion("paygrade_id in", values, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdNotIn(List<String> values) {
            addCriterion("paygrade_id not in", values, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdBetween(String value1, String value2) {
            addCriterion("paygrade_id between", value1, value2, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdNotBetween(String value1, String value2) {
            addCriterion("paygrade_id not between", value1, value2, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoIsNull() {
            addCriterion("paygrade_no is null");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoIsNotNull() {
            addCriterion("paygrade_no is not null");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoEqualTo(String value) {
            addCriterion("paygrade_no =", value, "paygradeNo");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoNotEqualTo(String value) {
            addCriterion("paygrade_no <>", value, "paygradeNo");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoGreaterThan(String value) {
            addCriterion("paygrade_no >", value, "paygradeNo");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("paygrade_no >=", value, "paygradeNo");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoLessThan(String value) {
            addCriterion("paygrade_no <", value, "paygradeNo");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoLessThanOrEqualTo(String value) {
            addCriterion("paygrade_no <=", value, "paygradeNo");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoLike(String value) {
            addCriterion("paygrade_no like", value, "paygradeNo");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoNotLike(String value) {
            addCriterion("paygrade_no not like", value, "paygradeNo");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoIn(List<String> values) {
            addCriterion("paygrade_no in", values, "paygradeNo");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoNotIn(List<String> values) {
            addCriterion("paygrade_no not in", values, "paygradeNo");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoBetween(String value1, String value2) {
            addCriterion("paygrade_no between", value1, value2, "paygradeNo");
            return (Criteria) this;
        }

        public Criteria andPaygradeNoNotBetween(String value1, String value2) {
            addCriterion("paygrade_no not between", value1, value2, "paygradeNo");
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

        public Criteria andHeadshipPayIsNull() {
            addCriterion("headship_pay is null");
            return (Criteria) this;
        }

        public Criteria andHeadshipPayIsNotNull() {
            addCriterion("headship_pay is not null");
            return (Criteria) this;
        }

        public Criteria andHeadshipPayEqualTo(BigDecimal value) {
            addCriterion("headship_pay =", value, "headshipPay");
            return (Criteria) this;
        }

        public Criteria andHeadshipPayNotEqualTo(BigDecimal value) {
            addCriterion("headship_pay <>", value, "headshipPay");
            return (Criteria) this;
        }

        public Criteria andHeadshipPayGreaterThan(BigDecimal value) {
            addCriterion("headship_pay >", value, "headshipPay");
            return (Criteria) this;
        }

        public Criteria andHeadshipPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("headship_pay >=", value, "headshipPay");
            return (Criteria) this;
        }

        public Criteria andHeadshipPayLessThan(BigDecimal value) {
            addCriterion("headship_pay <", value, "headshipPay");
            return (Criteria) this;
        }

        public Criteria andHeadshipPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("headship_pay <=", value, "headshipPay");
            return (Criteria) this;
        }

        public Criteria andHeadshipPayIn(List<BigDecimal> values) {
            addCriterion("headship_pay in", values, "headshipPay");
            return (Criteria) this;
        }

        public Criteria andHeadshipPayNotIn(List<BigDecimal> values) {
            addCriterion("headship_pay not in", values, "headshipPay");
            return (Criteria) this;
        }

        public Criteria andHeadshipPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("headship_pay between", value1, value2, "headshipPay");
            return (Criteria) this;
        }

        public Criteria andHeadshipPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("headship_pay not between", value1, value2, "headshipPay");
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

        public Criteria andTitleWageIsNull() {
            addCriterion("title_wage is null");
            return (Criteria) this;
        }

        public Criteria andTitleWageIsNotNull() {
            addCriterion("title_wage is not null");
            return (Criteria) this;
        }

        public Criteria andTitleWageEqualTo(BigDecimal value) {
            addCriterion("title_wage =", value, "titleWage");
            return (Criteria) this;
        }

        public Criteria andTitleWageNotEqualTo(BigDecimal value) {
            addCriterion("title_wage <>", value, "titleWage");
            return (Criteria) this;
        }

        public Criteria andTitleWageGreaterThan(BigDecimal value) {
            addCriterion("title_wage >", value, "titleWage");
            return (Criteria) this;
        }

        public Criteria andTitleWageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("title_wage >=", value, "titleWage");
            return (Criteria) this;
        }

        public Criteria andTitleWageLessThan(BigDecimal value) {
            addCriterion("title_wage <", value, "titleWage");
            return (Criteria) this;
        }

        public Criteria andTitleWageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("title_wage <=", value, "titleWage");
            return (Criteria) this;
        }

        public Criteria andTitleWageIn(List<BigDecimal> values) {
            addCriterion("title_wage in", values, "titleWage");
            return (Criteria) this;
        }

        public Criteria andTitleWageNotIn(List<BigDecimal> values) {
            addCriterion("title_wage not in", values, "titleWage");
            return (Criteria) this;
        }

        public Criteria andTitleWageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("title_wage between", value1, value2, "titleWage");
            return (Criteria) this;
        }

        public Criteria andTitleWageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("title_wage not between", value1, value2, "titleWage");
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

        public Criteria andPaygradeDescribeIsNull() {
            addCriterion("paygrade_describe is null");
            return (Criteria) this;
        }

        public Criteria andPaygradeDescribeIsNotNull() {
            addCriterion("paygrade_describe is not null");
            return (Criteria) this;
        }

        public Criteria andPaygradeDescribeEqualTo(String value) {
            addCriterion("paygrade_describe =", value, "paygradeDescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradeDescribeNotEqualTo(String value) {
            addCriterion("paygrade_describe <>", value, "paygradeDescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradeDescribeGreaterThan(String value) {
            addCriterion("paygrade_describe >", value, "paygradeDescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradeDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("paygrade_describe >=", value, "paygradeDescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradeDescribeLessThan(String value) {
            addCriterion("paygrade_describe <", value, "paygradeDescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradeDescribeLessThanOrEqualTo(String value) {
            addCriterion("paygrade_describe <=", value, "paygradeDescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradeDescribeLike(String value) {
            addCriterion("paygrade_describe like", value, "paygradeDescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradeDescribeNotLike(String value) {
            addCriterion("paygrade_describe not like", value, "paygradeDescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradeDescribeIn(List<String> values) {
            addCriterion("paygrade_describe in", values, "paygradeDescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradeDescribeNotIn(List<String> values) {
            addCriterion("paygrade_describe not in", values, "paygradeDescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradeDescribeBetween(String value1, String value2) {
            addCriterion("paygrade_describe between", value1, value2, "paygradeDescribe");
            return (Criteria) this;
        }

        public Criteria andPaygradeDescribeNotBetween(String value1, String value2) {
            addCriterion("paygrade_describe not between", value1, value2, "paygradeDescribe");
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