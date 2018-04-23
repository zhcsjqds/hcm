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

        public Criteria andAttenIdIsNull() {
            addCriterion("atten_id is null");
            return (Criteria) this;
        }

        public Criteria andAttenIdIsNotNull() {
            addCriterion("atten_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttenIdEqualTo(String value) {
            addCriterion("atten_id =", value, "attenId");
            return (Criteria) this;
        }

        public Criteria andAttenIdNotEqualTo(String value) {
            addCriterion("atten_id <>", value, "attenId");
            return (Criteria) this;
        }

        public Criteria andAttenIdGreaterThan(String value) {
            addCriterion("atten_id >", value, "attenId");
            return (Criteria) this;
        }

        public Criteria andAttenIdGreaterThanOrEqualTo(String value) {
            addCriterion("atten_id >=", value, "attenId");
            return (Criteria) this;
        }

        public Criteria andAttenIdLessThan(String value) {
            addCriterion("atten_id <", value, "attenId");
            return (Criteria) this;
        }

        public Criteria andAttenIdLessThanOrEqualTo(String value) {
            addCriterion("atten_id <=", value, "attenId");
            return (Criteria) this;
        }

        public Criteria andAttenIdLike(String value) {
            addCriterion("atten_id like", value, "attenId");
            return (Criteria) this;
        }

        public Criteria andAttenIdNotLike(String value) {
            addCriterion("atten_id not like", value, "attenId");
            return (Criteria) this;
        }

        public Criteria andAttenIdIn(List<String> values) {
            addCriterion("atten_id in", values, "attenId");
            return (Criteria) this;
        }

        public Criteria andAttenIdNotIn(List<String> values) {
            addCriterion("atten_id not in", values, "attenId");
            return (Criteria) this;
        }

        public Criteria andAttenIdBetween(String value1, String value2) {
            addCriterion("atten_id between", value1, value2, "attenId");
            return (Criteria) this;
        }

        public Criteria andAttenIdNotBetween(String value1, String value2) {
            addCriterion("atten_id not between", value1, value2, "attenId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andAttenTimeIsNull() {
            addCriterion("atten_time is null");
            return (Criteria) this;
        }

        public Criteria andAttenTimeIsNotNull() {
            addCriterion("atten_time is not null");
            return (Criteria) this;
        }

        public Criteria andAttenTimeEqualTo(Date value) {
            addCriterion("atten_time =", value, "attenTime");
            return (Criteria) this;
        }

        public Criteria andAttenTimeNotEqualTo(Date value) {
            addCriterion("atten_time <>", value, "attenTime");
            return (Criteria) this;
        }

        public Criteria andAttenTimeGreaterThan(Date value) {
            addCriterion("atten_time >", value, "attenTime");
            return (Criteria) this;
        }

        public Criteria andAttenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("atten_time >=", value, "attenTime");
            return (Criteria) this;
        }

        public Criteria andAttenTimeLessThan(Date value) {
            addCriterion("atten_time <", value, "attenTime");
            return (Criteria) this;
        }

        public Criteria andAttenTimeLessThanOrEqualTo(Date value) {
            addCriterion("atten_time <=", value, "attenTime");
            return (Criteria) this;
        }

        public Criteria andAttenTimeIn(List<Date> values) {
            addCriterion("atten_time in", values, "attenTime");
            return (Criteria) this;
        }

        public Criteria andAttenTimeNotIn(List<Date> values) {
            addCriterion("atten_time not in", values, "attenTime");
            return (Criteria) this;
        }

        public Criteria andAttenTimeBetween(Date value1, Date value2) {
            addCriterion("atten_time between", value1, value2, "attenTime");
            return (Criteria) this;
        }

        public Criteria andAttenTimeNotBetween(Date value1, Date value2) {
            addCriterion("atten_time not between", value1, value2, "attenTime");
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