package cn.zouhuachao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffEvaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffEvaluationExample() {
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

        public Criteria andEvaidIsNull() {
            addCriterion("evaid is null");
            return (Criteria) this;
        }

        public Criteria andEvaidIsNotNull() {
            addCriterion("evaid is not null");
            return (Criteria) this;
        }

        public Criteria andEvaidEqualTo(String value) {
            addCriterion("evaid =", value, "evaid");
            return (Criteria) this;
        }

        public Criteria andEvaidNotEqualTo(String value) {
            addCriterion("evaid <>", value, "evaid");
            return (Criteria) this;
        }

        public Criteria andEvaidGreaterThan(String value) {
            addCriterion("evaid >", value, "evaid");
            return (Criteria) this;
        }

        public Criteria andEvaidGreaterThanOrEqualTo(String value) {
            addCriterion("evaid >=", value, "evaid");
            return (Criteria) this;
        }

        public Criteria andEvaidLessThan(String value) {
            addCriterion("evaid <", value, "evaid");
            return (Criteria) this;
        }

        public Criteria andEvaidLessThanOrEqualTo(String value) {
            addCriterion("evaid <=", value, "evaid");
            return (Criteria) this;
        }

        public Criteria andEvaidLike(String value) {
            addCriterion("evaid like", value, "evaid");
            return (Criteria) this;
        }

        public Criteria andEvaidNotLike(String value) {
            addCriterion("evaid not like", value, "evaid");
            return (Criteria) this;
        }

        public Criteria andEvaidIn(List<String> values) {
            addCriterion("evaid in", values, "evaid");
            return (Criteria) this;
        }

        public Criteria andEvaidNotIn(List<String> values) {
            addCriterion("evaid not in", values, "evaid");
            return (Criteria) this;
        }

        public Criteria andEvaidBetween(String value1, String value2) {
            addCriterion("evaid between", value1, value2, "evaid");
            return (Criteria) this;
        }

        public Criteria andEvaidNotBetween(String value1, String value2) {
            addCriterion("evaid not between", value1, value2, "evaid");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNull() {
            addCriterion("staffid is null");
            return (Criteria) this;
        }

        public Criteria andStaffidIsNotNull() {
            addCriterion("staffid is not null");
            return (Criteria) this;
        }

        public Criteria andStaffidEqualTo(String value) {
            addCriterion("staffid =", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotEqualTo(String value) {
            addCriterion("staffid <>", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThan(String value) {
            addCriterion("staffid >", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidGreaterThanOrEqualTo(String value) {
            addCriterion("staffid >=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThan(String value) {
            addCriterion("staffid <", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLessThanOrEqualTo(String value) {
            addCriterion("staffid <=", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidLike(String value) {
            addCriterion("staffid like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotLike(String value) {
            addCriterion("staffid not like", value, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidIn(List<String> values) {
            addCriterion("staffid in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotIn(List<String> values) {
            addCriterion("staffid not in", values, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidBetween(String value1, String value2) {
            addCriterion("staffid between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andStaffidNotBetween(String value1, String value2) {
            addCriterion("staffid not between", value1, value2, "staffid");
            return (Criteria) this;
        }

        public Criteria andEvatimeIsNull() {
            addCriterion("evatime is null");
            return (Criteria) this;
        }

        public Criteria andEvatimeIsNotNull() {
            addCriterion("evatime is not null");
            return (Criteria) this;
        }

        public Criteria andEvatimeEqualTo(Date value) {
            addCriterion("evatime =", value, "evatime");
            return (Criteria) this;
        }

        public Criteria andEvatimeNotEqualTo(Date value) {
            addCriterion("evatime <>", value, "evatime");
            return (Criteria) this;
        }

        public Criteria andEvatimeGreaterThan(Date value) {
            addCriterion("evatime >", value, "evatime");
            return (Criteria) this;
        }

        public Criteria andEvatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evatime >=", value, "evatime");
            return (Criteria) this;
        }

        public Criteria andEvatimeLessThan(Date value) {
            addCriterion("evatime <", value, "evatime");
            return (Criteria) this;
        }

        public Criteria andEvatimeLessThanOrEqualTo(Date value) {
            addCriterion("evatime <=", value, "evatime");
            return (Criteria) this;
        }

        public Criteria andEvatimeIn(List<Date> values) {
            addCriterion("evatime in", values, "evatime");
            return (Criteria) this;
        }

        public Criteria andEvatimeNotIn(List<Date> values) {
            addCriterion("evatime not in", values, "evatime");
            return (Criteria) this;
        }

        public Criteria andEvatimeBetween(Date value1, Date value2) {
            addCriterion("evatime between", value1, value2, "evatime");
            return (Criteria) this;
        }

        public Criteria andEvatimeNotBetween(Date value1, Date value2) {
            addCriterion("evatime not between", value1, value2, "evatime");
            return (Criteria) this;
        }

        public Criteria andPerformanceIsNull() {
            addCriterion("performance is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceIsNotNull() {
            addCriterion("performance is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceEqualTo(String value) {
            addCriterion("performance =", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotEqualTo(String value) {
            addCriterion("performance <>", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThan(String value) {
            addCriterion("performance >", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceGreaterThanOrEqualTo(String value) {
            addCriterion("performance >=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThan(String value) {
            addCriterion("performance <", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLessThanOrEqualTo(String value) {
            addCriterion("performance <=", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceLike(String value) {
            addCriterion("performance like", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotLike(String value) {
            addCriterion("performance not like", value, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceIn(List<String> values) {
            addCriterion("performance in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotIn(List<String> values) {
            addCriterion("performance not in", values, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceBetween(String value1, String value2) {
            addCriterion("performance between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andPerformanceNotBetween(String value1, String value2) {
            addCriterion("performance not between", value1, value2, "performance");
            return (Criteria) this;
        }

        public Criteria andAttitudeIsNull() {
            addCriterion("attitude is null");
            return (Criteria) this;
        }

        public Criteria andAttitudeIsNotNull() {
            addCriterion("attitude is not null");
            return (Criteria) this;
        }

        public Criteria andAttitudeEqualTo(String value) {
            addCriterion("attitude =", value, "attitude");
            return (Criteria) this;
        }

        public Criteria andAttitudeNotEqualTo(String value) {
            addCriterion("attitude <>", value, "attitude");
            return (Criteria) this;
        }

        public Criteria andAttitudeGreaterThan(String value) {
            addCriterion("attitude >", value, "attitude");
            return (Criteria) this;
        }

        public Criteria andAttitudeGreaterThanOrEqualTo(String value) {
            addCriterion("attitude >=", value, "attitude");
            return (Criteria) this;
        }

        public Criteria andAttitudeLessThan(String value) {
            addCriterion("attitude <", value, "attitude");
            return (Criteria) this;
        }

        public Criteria andAttitudeLessThanOrEqualTo(String value) {
            addCriterion("attitude <=", value, "attitude");
            return (Criteria) this;
        }

        public Criteria andAttitudeLike(String value) {
            addCriterion("attitude like", value, "attitude");
            return (Criteria) this;
        }

        public Criteria andAttitudeNotLike(String value) {
            addCriterion("attitude not like", value, "attitude");
            return (Criteria) this;
        }

        public Criteria andAttitudeIn(List<String> values) {
            addCriterion("attitude in", values, "attitude");
            return (Criteria) this;
        }

        public Criteria andAttitudeNotIn(List<String> values) {
            addCriterion("attitude not in", values, "attitude");
            return (Criteria) this;
        }

        public Criteria andAttitudeBetween(String value1, String value2) {
            addCriterion("attitude between", value1, value2, "attitude");
            return (Criteria) this;
        }

        public Criteria andAttitudeNotBetween(String value1, String value2) {
            addCriterion("attitude not between", value1, value2, "attitude");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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