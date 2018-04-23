package cn.zouhuachao.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StaffRewardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffRewardExample() {
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

        public Criteria andAwardIdIsNull() {
            addCriterion("award_id is null");
            return (Criteria) this;
        }

        public Criteria andAwardIdIsNotNull() {
            addCriterion("award_id is not null");
            return (Criteria) this;
        }

        public Criteria andAwardIdEqualTo(String value) {
            addCriterion("award_id =", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdNotEqualTo(String value) {
            addCriterion("award_id <>", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdGreaterThan(String value) {
            addCriterion("award_id >", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdGreaterThanOrEqualTo(String value) {
            addCriterion("award_id >=", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdLessThan(String value) {
            addCriterion("award_id <", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdLessThanOrEqualTo(String value) {
            addCriterion("award_id <=", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdLike(String value) {
            addCriterion("award_id like", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdNotLike(String value) {
            addCriterion("award_id not like", value, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdIn(List<String> values) {
            addCriterion("award_id in", values, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdNotIn(List<String> values) {
            addCriterion("award_id not in", values, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdBetween(String value1, String value2) {
            addCriterion("award_id between", value1, value2, "awardId");
            return (Criteria) this;
        }

        public Criteria andAwardIdNotBetween(String value1, String value2) {
            addCriterion("award_id not between", value1, value2, "awardId");
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

        public Criteria andAwardTypeIsNull() {
            addCriterion("award_type is null");
            return (Criteria) this;
        }

        public Criteria andAwardTypeIsNotNull() {
            addCriterion("award_type is not null");
            return (Criteria) this;
        }

        public Criteria andAwardTypeEqualTo(String value) {
            addCriterion("award_type =", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeNotEqualTo(String value) {
            addCriterion("award_type <>", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeGreaterThan(String value) {
            addCriterion("award_type >", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("award_type >=", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeLessThan(String value) {
            addCriterion("award_type <", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeLessThanOrEqualTo(String value) {
            addCriterion("award_type <=", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeLike(String value) {
            addCriterion("award_type like", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeNotLike(String value) {
            addCriterion("award_type not like", value, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeIn(List<String> values) {
            addCriterion("award_type in", values, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeNotIn(List<String> values) {
            addCriterion("award_type not in", values, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeBetween(String value1, String value2) {
            addCriterion("award_type between", value1, value2, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardTypeNotBetween(String value1, String value2) {
            addCriterion("award_type not between", value1, value2, "awardType");
            return (Criteria) this;
        }

        public Criteria andAwardReasonIsNull() {
            addCriterion("award_reason is null");
            return (Criteria) this;
        }

        public Criteria andAwardReasonIsNotNull() {
            addCriterion("award_reason is not null");
            return (Criteria) this;
        }

        public Criteria andAwardReasonEqualTo(String value) {
            addCriterion("award_reason =", value, "awardReason");
            return (Criteria) this;
        }

        public Criteria andAwardReasonNotEqualTo(String value) {
            addCriterion("award_reason <>", value, "awardReason");
            return (Criteria) this;
        }

        public Criteria andAwardReasonGreaterThan(String value) {
            addCriterion("award_reason >", value, "awardReason");
            return (Criteria) this;
        }

        public Criteria andAwardReasonGreaterThanOrEqualTo(String value) {
            addCriterion("award_reason >=", value, "awardReason");
            return (Criteria) this;
        }

        public Criteria andAwardReasonLessThan(String value) {
            addCriterion("award_reason <", value, "awardReason");
            return (Criteria) this;
        }

        public Criteria andAwardReasonLessThanOrEqualTo(String value) {
            addCriterion("award_reason <=", value, "awardReason");
            return (Criteria) this;
        }

        public Criteria andAwardReasonLike(String value) {
            addCriterion("award_reason like", value, "awardReason");
            return (Criteria) this;
        }

        public Criteria andAwardReasonNotLike(String value) {
            addCriterion("award_reason not like", value, "awardReason");
            return (Criteria) this;
        }

        public Criteria andAwardReasonIn(List<String> values) {
            addCriterion("award_reason in", values, "awardReason");
            return (Criteria) this;
        }

        public Criteria andAwardReasonNotIn(List<String> values) {
            addCriterion("award_reason not in", values, "awardReason");
            return (Criteria) this;
        }

        public Criteria andAwardReasonBetween(String value1, String value2) {
            addCriterion("award_reason between", value1, value2, "awardReason");
            return (Criteria) this;
        }

        public Criteria andAwardReasonNotBetween(String value1, String value2) {
            addCriterion("award_reason not between", value1, value2, "awardReason");
            return (Criteria) this;
        }

        public Criteria andAwardResultIsNull() {
            addCriterion("award_result is null");
            return (Criteria) this;
        }

        public Criteria andAwardResultIsNotNull() {
            addCriterion("award_result is not null");
            return (Criteria) this;
        }

        public Criteria andAwardResultEqualTo(String value) {
            addCriterion("award_result =", value, "awardResult");
            return (Criteria) this;
        }

        public Criteria andAwardResultNotEqualTo(String value) {
            addCriterion("award_result <>", value, "awardResult");
            return (Criteria) this;
        }

        public Criteria andAwardResultGreaterThan(String value) {
            addCriterion("award_result >", value, "awardResult");
            return (Criteria) this;
        }

        public Criteria andAwardResultGreaterThanOrEqualTo(String value) {
            addCriterion("award_result >=", value, "awardResult");
            return (Criteria) this;
        }

        public Criteria andAwardResultLessThan(String value) {
            addCriterion("award_result <", value, "awardResult");
            return (Criteria) this;
        }

        public Criteria andAwardResultLessThanOrEqualTo(String value) {
            addCriterion("award_result <=", value, "awardResult");
            return (Criteria) this;
        }

        public Criteria andAwardResultLike(String value) {
            addCriterion("award_result like", value, "awardResult");
            return (Criteria) this;
        }

        public Criteria andAwardResultNotLike(String value) {
            addCriterion("award_result not like", value, "awardResult");
            return (Criteria) this;
        }

        public Criteria andAwardResultIn(List<String> values) {
            addCriterion("award_result in", values, "awardResult");
            return (Criteria) this;
        }

        public Criteria andAwardResultNotIn(List<String> values) {
            addCriterion("award_result not in", values, "awardResult");
            return (Criteria) this;
        }

        public Criteria andAwardResultBetween(String value1, String value2) {
            addCriterion("award_result between", value1, value2, "awardResult");
            return (Criteria) this;
        }

        public Criteria andAwardResultNotBetween(String value1, String value2) {
            addCriterion("award_result not between", value1, value2, "awardResult");
            return (Criteria) this;
        }

        public Criteria andAwardAmountIsNull() {
            addCriterion("award_amount is null");
            return (Criteria) this;
        }

        public Criteria andAwardAmountIsNotNull() {
            addCriterion("award_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAwardAmountEqualTo(BigDecimal value) {
            addCriterion("award_amount =", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountNotEqualTo(BigDecimal value) {
            addCriterion("award_amount <>", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountGreaterThan(BigDecimal value) {
            addCriterion("award_amount >", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("award_amount >=", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountLessThan(BigDecimal value) {
            addCriterion("award_amount <", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("award_amount <=", value, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountIn(List<BigDecimal> values) {
            addCriterion("award_amount in", values, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountNotIn(List<BigDecimal> values) {
            addCriterion("award_amount not in", values, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_amount between", value1, value2, "awardAmount");
            return (Criteria) this;
        }

        public Criteria andAwardAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("award_amount not between", value1, value2, "awardAmount");
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