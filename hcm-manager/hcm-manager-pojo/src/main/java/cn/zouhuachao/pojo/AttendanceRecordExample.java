package cn.zouhuachao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceRecordExample() {
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

        public Criteria andAttenidIsNull() {
            addCriterion("attenid is null");
            return (Criteria) this;
        }

        public Criteria andAttenidIsNotNull() {
            addCriterion("attenid is not null");
            return (Criteria) this;
        }

        public Criteria andAttenidEqualTo(String value) {
            addCriterion("attenid =", value, "attenid");
            return (Criteria) this;
        }

        public Criteria andAttenidNotEqualTo(String value) {
            addCriterion("attenid <>", value, "attenid");
            return (Criteria) this;
        }

        public Criteria andAttenidGreaterThan(String value) {
            addCriterion("attenid >", value, "attenid");
            return (Criteria) this;
        }

        public Criteria andAttenidGreaterThanOrEqualTo(String value) {
            addCriterion("attenid >=", value, "attenid");
            return (Criteria) this;
        }

        public Criteria andAttenidLessThan(String value) {
            addCriterion("attenid <", value, "attenid");
            return (Criteria) this;
        }

        public Criteria andAttenidLessThanOrEqualTo(String value) {
            addCriterion("attenid <=", value, "attenid");
            return (Criteria) this;
        }

        public Criteria andAttenidLike(String value) {
            addCriterion("attenid like", value, "attenid");
            return (Criteria) this;
        }

        public Criteria andAttenidNotLike(String value) {
            addCriterion("attenid not like", value, "attenid");
            return (Criteria) this;
        }

        public Criteria andAttenidIn(List<String> values) {
            addCriterion("attenid in", values, "attenid");
            return (Criteria) this;
        }

        public Criteria andAttenidNotIn(List<String> values) {
            addCriterion("attenid not in", values, "attenid");
            return (Criteria) this;
        }

        public Criteria andAttenidBetween(String value1, String value2) {
            addCriterion("attenid between", value1, value2, "attenid");
            return (Criteria) this;
        }

        public Criteria andAttenidNotBetween(String value1, String value2) {
            addCriterion("attenid not between", value1, value2, "attenid");
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

        public Criteria andAttentimeIsNull() {
            addCriterion("attentime is null");
            return (Criteria) this;
        }

        public Criteria andAttentimeIsNotNull() {
            addCriterion("attentime is not null");
            return (Criteria) this;
        }

        public Criteria andAttentimeEqualTo(Date value) {
            addCriterion("attentime =", value, "attentime");
            return (Criteria) this;
        }

        public Criteria andAttentimeNotEqualTo(Date value) {
            addCriterion("attentime <>", value, "attentime");
            return (Criteria) this;
        }

        public Criteria andAttentimeGreaterThan(Date value) {
            addCriterion("attentime >", value, "attentime");
            return (Criteria) this;
        }

        public Criteria andAttentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("attentime >=", value, "attentime");
            return (Criteria) this;
        }

        public Criteria andAttentimeLessThan(Date value) {
            addCriterion("attentime <", value, "attentime");
            return (Criteria) this;
        }

        public Criteria andAttentimeLessThanOrEqualTo(Date value) {
            addCriterion("attentime <=", value, "attentime");
            return (Criteria) this;
        }

        public Criteria andAttentimeIn(List<Date> values) {
            addCriterion("attentime in", values, "attentime");
            return (Criteria) this;
        }

        public Criteria andAttentimeNotIn(List<Date> values) {
            addCriterion("attentime not in", values, "attentime");
            return (Criteria) this;
        }

        public Criteria andAttentimeBetween(Date value1, Date value2) {
            addCriterion("attentime between", value1, value2, "attentime");
            return (Criteria) this;
        }

        public Criteria andAttentimeNotBetween(Date value1, Date value2) {
            addCriterion("attentime not between", value1, value2, "attentime");
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