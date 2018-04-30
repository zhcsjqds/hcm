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

        public Criteria andAwardidIsNull() {
            addCriterion("awardid is null");
            return (Criteria) this;
        }

        public Criteria andAwardidIsNotNull() {
            addCriterion("awardid is not null");
            return (Criteria) this;
        }

        public Criteria andAwardidEqualTo(String value) {
            addCriterion("awardid =", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidNotEqualTo(String value) {
            addCriterion("awardid <>", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidGreaterThan(String value) {
            addCriterion("awardid >", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidGreaterThanOrEqualTo(String value) {
            addCriterion("awardid >=", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidLessThan(String value) {
            addCriterion("awardid <", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidLessThanOrEqualTo(String value) {
            addCriterion("awardid <=", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidLike(String value) {
            addCriterion("awardid like", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidNotLike(String value) {
            addCriterion("awardid not like", value, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidIn(List<String> values) {
            addCriterion("awardid in", values, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidNotIn(List<String> values) {
            addCriterion("awardid not in", values, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidBetween(String value1, String value2) {
            addCriterion("awardid between", value1, value2, "awardid");
            return (Criteria) this;
        }

        public Criteria andAwardidNotBetween(String value1, String value2) {
            addCriterion("awardid not between", value1, value2, "awardid");
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

        public Criteria andAwardtypeIsNull() {
            addCriterion("awardtype is null");
            return (Criteria) this;
        }

        public Criteria andAwardtypeIsNotNull() {
            addCriterion("awardtype is not null");
            return (Criteria) this;
        }

        public Criteria andAwardtypeEqualTo(String value) {
            addCriterion("awardtype =", value, "awardtype");
            return (Criteria) this;
        }

        public Criteria andAwardtypeNotEqualTo(String value) {
            addCriterion("awardtype <>", value, "awardtype");
            return (Criteria) this;
        }

        public Criteria andAwardtypeGreaterThan(String value) {
            addCriterion("awardtype >", value, "awardtype");
            return (Criteria) this;
        }

        public Criteria andAwardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("awardtype >=", value, "awardtype");
            return (Criteria) this;
        }

        public Criteria andAwardtypeLessThan(String value) {
            addCriterion("awardtype <", value, "awardtype");
            return (Criteria) this;
        }

        public Criteria andAwardtypeLessThanOrEqualTo(String value) {
            addCriterion("awardtype <=", value, "awardtype");
            return (Criteria) this;
        }

        public Criteria andAwardtypeLike(String value) {
            addCriterion("awardtype like", value, "awardtype");
            return (Criteria) this;
        }

        public Criteria andAwardtypeNotLike(String value) {
            addCriterion("awardtype not like", value, "awardtype");
            return (Criteria) this;
        }

        public Criteria andAwardtypeIn(List<String> values) {
            addCriterion("awardtype in", values, "awardtype");
            return (Criteria) this;
        }

        public Criteria andAwardtypeNotIn(List<String> values) {
            addCriterion("awardtype not in", values, "awardtype");
            return (Criteria) this;
        }

        public Criteria andAwardtypeBetween(String value1, String value2) {
            addCriterion("awardtype between", value1, value2, "awardtype");
            return (Criteria) this;
        }

        public Criteria andAwardtypeNotBetween(String value1, String value2) {
            addCriterion("awardtype not between", value1, value2, "awardtype");
            return (Criteria) this;
        }

        public Criteria andAwardreasonIsNull() {
            addCriterion("awardreason is null");
            return (Criteria) this;
        }

        public Criteria andAwardreasonIsNotNull() {
            addCriterion("awardreason is not null");
            return (Criteria) this;
        }

        public Criteria andAwardreasonEqualTo(String value) {
            addCriterion("awardreason =", value, "awardreason");
            return (Criteria) this;
        }

        public Criteria andAwardreasonNotEqualTo(String value) {
            addCriterion("awardreason <>", value, "awardreason");
            return (Criteria) this;
        }

        public Criteria andAwardreasonGreaterThan(String value) {
            addCriterion("awardreason >", value, "awardreason");
            return (Criteria) this;
        }

        public Criteria andAwardreasonGreaterThanOrEqualTo(String value) {
            addCriterion("awardreason >=", value, "awardreason");
            return (Criteria) this;
        }

        public Criteria andAwardreasonLessThan(String value) {
            addCriterion("awardreason <", value, "awardreason");
            return (Criteria) this;
        }

        public Criteria andAwardreasonLessThanOrEqualTo(String value) {
            addCriterion("awardreason <=", value, "awardreason");
            return (Criteria) this;
        }

        public Criteria andAwardreasonLike(String value) {
            addCriterion("awardreason like", value, "awardreason");
            return (Criteria) this;
        }

        public Criteria andAwardreasonNotLike(String value) {
            addCriterion("awardreason not like", value, "awardreason");
            return (Criteria) this;
        }

        public Criteria andAwardreasonIn(List<String> values) {
            addCriterion("awardreason in", values, "awardreason");
            return (Criteria) this;
        }

        public Criteria andAwardreasonNotIn(List<String> values) {
            addCriterion("awardreason not in", values, "awardreason");
            return (Criteria) this;
        }

        public Criteria andAwardreasonBetween(String value1, String value2) {
            addCriterion("awardreason between", value1, value2, "awardreason");
            return (Criteria) this;
        }

        public Criteria andAwardreasonNotBetween(String value1, String value2) {
            addCriterion("awardreason not between", value1, value2, "awardreason");
            return (Criteria) this;
        }

        public Criteria andAwardresultIsNull() {
            addCriterion("awardresult is null");
            return (Criteria) this;
        }

        public Criteria andAwardresultIsNotNull() {
            addCriterion("awardresult is not null");
            return (Criteria) this;
        }

        public Criteria andAwardresultEqualTo(String value) {
            addCriterion("awardresult =", value, "awardresult");
            return (Criteria) this;
        }

        public Criteria andAwardresultNotEqualTo(String value) {
            addCriterion("awardresult <>", value, "awardresult");
            return (Criteria) this;
        }

        public Criteria andAwardresultGreaterThan(String value) {
            addCriterion("awardresult >", value, "awardresult");
            return (Criteria) this;
        }

        public Criteria andAwardresultGreaterThanOrEqualTo(String value) {
            addCriterion("awardresult >=", value, "awardresult");
            return (Criteria) this;
        }

        public Criteria andAwardresultLessThan(String value) {
            addCriterion("awardresult <", value, "awardresult");
            return (Criteria) this;
        }

        public Criteria andAwardresultLessThanOrEqualTo(String value) {
            addCriterion("awardresult <=", value, "awardresult");
            return (Criteria) this;
        }

        public Criteria andAwardresultLike(String value) {
            addCriterion("awardresult like", value, "awardresult");
            return (Criteria) this;
        }

        public Criteria andAwardresultNotLike(String value) {
            addCriterion("awardresult not like", value, "awardresult");
            return (Criteria) this;
        }

        public Criteria andAwardresultIn(List<String> values) {
            addCriterion("awardresult in", values, "awardresult");
            return (Criteria) this;
        }

        public Criteria andAwardresultNotIn(List<String> values) {
            addCriterion("awardresult not in", values, "awardresult");
            return (Criteria) this;
        }

        public Criteria andAwardresultBetween(String value1, String value2) {
            addCriterion("awardresult between", value1, value2, "awardresult");
            return (Criteria) this;
        }

        public Criteria andAwardresultNotBetween(String value1, String value2) {
            addCriterion("awardresult not between", value1, value2, "awardresult");
            return (Criteria) this;
        }

        public Criteria andAwardamountIsNull() {
            addCriterion("awardamount is null");
            return (Criteria) this;
        }

        public Criteria andAwardamountIsNotNull() {
            addCriterion("awardamount is not null");
            return (Criteria) this;
        }

        public Criteria andAwardamountEqualTo(BigDecimal value) {
            addCriterion("awardamount =", value, "awardamount");
            return (Criteria) this;
        }

        public Criteria andAwardamountNotEqualTo(BigDecimal value) {
            addCriterion("awardamount <>", value, "awardamount");
            return (Criteria) this;
        }

        public Criteria andAwardamountGreaterThan(BigDecimal value) {
            addCriterion("awardamount >", value, "awardamount");
            return (Criteria) this;
        }

        public Criteria andAwardamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("awardamount >=", value, "awardamount");
            return (Criteria) this;
        }

        public Criteria andAwardamountLessThan(BigDecimal value) {
            addCriterion("awardamount <", value, "awardamount");
            return (Criteria) this;
        }

        public Criteria andAwardamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("awardamount <=", value, "awardamount");
            return (Criteria) this;
        }

        public Criteria andAwardamountIn(List<BigDecimal> values) {
            addCriterion("awardamount in", values, "awardamount");
            return (Criteria) this;
        }

        public Criteria andAwardamountNotIn(List<BigDecimal> values) {
            addCriterion("awardamount not in", values, "awardamount");
            return (Criteria) this;
        }

        public Criteria andAwardamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("awardamount between", value1, value2, "awardamount");
            return (Criteria) this;
        }

        public Criteria andAwardamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("awardamount not between", value1, value2, "awardamount");
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