package cn.zouhuachao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffTrainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffTrainExample() {
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

        public Criteria andTrainidIsNull() {
            addCriterion("trainid is null");
            return (Criteria) this;
        }

        public Criteria andTrainidIsNotNull() {
            addCriterion("trainid is not null");
            return (Criteria) this;
        }

        public Criteria andTrainidEqualTo(String value) {
            addCriterion("trainid =", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotEqualTo(String value) {
            addCriterion("trainid <>", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidGreaterThan(String value) {
            addCriterion("trainid >", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidGreaterThanOrEqualTo(String value) {
            addCriterion("trainid >=", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidLessThan(String value) {
            addCriterion("trainid <", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidLessThanOrEqualTo(String value) {
            addCriterion("trainid <=", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidLike(String value) {
            addCriterion("trainid like", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotLike(String value) {
            addCriterion("trainid not like", value, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidIn(List<String> values) {
            addCriterion("trainid in", values, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotIn(List<String> values) {
            addCriterion("trainid not in", values, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidBetween(String value1, String value2) {
            addCriterion("trainid between", value1, value2, "trainid");
            return (Criteria) this;
        }

        public Criteria andTrainidNotBetween(String value1, String value2) {
            addCriterion("trainid not between", value1, value2, "trainid");
            return (Criteria) this;
        }

        public Criteria andStaffnoIsNull() {
            addCriterion("staffno is null");
            return (Criteria) this;
        }

        public Criteria andStaffnoIsNotNull() {
            addCriterion("staffno is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnoEqualTo(String value) {
            addCriterion("staffno =", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoNotEqualTo(String value) {
            addCriterion("staffno <>", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoGreaterThan(String value) {
            addCriterion("staffno >", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoGreaterThanOrEqualTo(String value) {
            addCriterion("staffno >=", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoLessThan(String value) {
            addCriterion("staffno <", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoLessThanOrEqualTo(String value) {
            addCriterion("staffno <=", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoLike(String value) {
            addCriterion("staffno like", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoNotLike(String value) {
            addCriterion("staffno not like", value, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoIn(List<String> values) {
            addCriterion("staffno in", values, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoNotIn(List<String> values) {
            addCriterion("staffno not in", values, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoBetween(String value1, String value2) {
            addCriterion("staffno between", value1, value2, "staffno");
            return (Criteria) this;
        }

        public Criteria andStaffnoNotBetween(String value1, String value2) {
            addCriterion("staffno not between", value1, value2, "staffno");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andTrainnameIsNull() {
            addCriterion("trainname is null");
            return (Criteria) this;
        }

        public Criteria andTrainnameIsNotNull() {
            addCriterion("trainname is not null");
            return (Criteria) this;
        }

        public Criteria andTrainnameEqualTo(String value) {
            addCriterion("trainname =", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameNotEqualTo(String value) {
            addCriterion("trainname <>", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameGreaterThan(String value) {
            addCriterion("trainname >", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameGreaterThanOrEqualTo(String value) {
            addCriterion("trainname >=", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameLessThan(String value) {
            addCriterion("trainname <", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameLessThanOrEqualTo(String value) {
            addCriterion("trainname <=", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameLike(String value) {
            addCriterion("trainname like", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameNotLike(String value) {
            addCriterion("trainname not like", value, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameIn(List<String> values) {
            addCriterion("trainname in", values, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameNotIn(List<String> values) {
            addCriterion("trainname not in", values, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameBetween(String value1, String value2) {
            addCriterion("trainname between", value1, value2, "trainname");
            return (Criteria) this;
        }

        public Criteria andTrainnameNotBetween(String value1, String value2) {
            addCriterion("trainname not between", value1, value2, "trainname");
            return (Criteria) this;
        }

        public Criteria andTraintypeIsNull() {
            addCriterion("traintype is null");
            return (Criteria) this;
        }

        public Criteria andTraintypeIsNotNull() {
            addCriterion("traintype is not null");
            return (Criteria) this;
        }

        public Criteria andTraintypeEqualTo(String value) {
            addCriterion("traintype =", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeNotEqualTo(String value) {
            addCriterion("traintype <>", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeGreaterThan(String value) {
            addCriterion("traintype >", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeGreaterThanOrEqualTo(String value) {
            addCriterion("traintype >=", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeLessThan(String value) {
            addCriterion("traintype <", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeLessThanOrEqualTo(String value) {
            addCriterion("traintype <=", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeLike(String value) {
            addCriterion("traintype like", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeNotLike(String value) {
            addCriterion("traintype not like", value, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeIn(List<String> values) {
            addCriterion("traintype in", values, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeNotIn(List<String> values) {
            addCriterion("traintype not in", values, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeBetween(String value1, String value2) {
            addCriterion("traintype between", value1, value2, "traintype");
            return (Criteria) this;
        }

        public Criteria andTraintypeNotBetween(String value1, String value2) {
            addCriterion("traintype not between", value1, value2, "traintype");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andTraingradeIsNull() {
            addCriterion("traingrade is null");
            return (Criteria) this;
        }

        public Criteria andTraingradeIsNotNull() {
            addCriterion("traingrade is not null");
            return (Criteria) this;
        }

        public Criteria andTraingradeEqualTo(String value) {
            addCriterion("traingrade =", value, "traingrade");
            return (Criteria) this;
        }

        public Criteria andTraingradeNotEqualTo(String value) {
            addCriterion("traingrade <>", value, "traingrade");
            return (Criteria) this;
        }

        public Criteria andTraingradeGreaterThan(String value) {
            addCriterion("traingrade >", value, "traingrade");
            return (Criteria) this;
        }

        public Criteria andTraingradeGreaterThanOrEqualTo(String value) {
            addCriterion("traingrade >=", value, "traingrade");
            return (Criteria) this;
        }

        public Criteria andTraingradeLessThan(String value) {
            addCriterion("traingrade <", value, "traingrade");
            return (Criteria) this;
        }

        public Criteria andTraingradeLessThanOrEqualTo(String value) {
            addCriterion("traingrade <=", value, "traingrade");
            return (Criteria) this;
        }

        public Criteria andTraingradeLike(String value) {
            addCriterion("traingrade like", value, "traingrade");
            return (Criteria) this;
        }

        public Criteria andTraingradeNotLike(String value) {
            addCriterion("traingrade not like", value, "traingrade");
            return (Criteria) this;
        }

        public Criteria andTraingradeIn(List<String> values) {
            addCriterion("traingrade in", values, "traingrade");
            return (Criteria) this;
        }

        public Criteria andTraingradeNotIn(List<String> values) {
            addCriterion("traingrade not in", values, "traingrade");
            return (Criteria) this;
        }

        public Criteria andTraingradeBetween(String value1, String value2) {
            addCriterion("traingrade between", value1, value2, "traingrade");
            return (Criteria) this;
        }

        public Criteria andTraingradeNotBetween(String value1, String value2) {
            addCriterion("traingrade not between", value1, value2, "traingrade");
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

        public Criteria andTrainstatusIsNull() {
            addCriterion("trainstatus is null");
            return (Criteria) this;
        }

        public Criteria andTrainstatusIsNotNull() {
            addCriterion("trainstatus is not null");
            return (Criteria) this;
        }

        public Criteria andTrainstatusEqualTo(String value) {
            addCriterion("trainstatus =", value, "trainstatus");
            return (Criteria) this;
        }

        public Criteria andTrainstatusNotEqualTo(String value) {
            addCriterion("trainstatus <>", value, "trainstatus");
            return (Criteria) this;
        }

        public Criteria andTrainstatusGreaterThan(String value) {
            addCriterion("trainstatus >", value, "trainstatus");
            return (Criteria) this;
        }

        public Criteria andTrainstatusGreaterThanOrEqualTo(String value) {
            addCriterion("trainstatus >=", value, "trainstatus");
            return (Criteria) this;
        }

        public Criteria andTrainstatusLessThan(String value) {
            addCriterion("trainstatus <", value, "trainstatus");
            return (Criteria) this;
        }

        public Criteria andTrainstatusLessThanOrEqualTo(String value) {
            addCriterion("trainstatus <=", value, "trainstatus");
            return (Criteria) this;
        }

        public Criteria andTrainstatusLike(String value) {
            addCriterion("trainstatus like", value, "trainstatus");
            return (Criteria) this;
        }

        public Criteria andTrainstatusNotLike(String value) {
            addCriterion("trainstatus not like", value, "trainstatus");
            return (Criteria) this;
        }

        public Criteria andTrainstatusIn(List<String> values) {
            addCriterion("trainstatus in", values, "trainstatus");
            return (Criteria) this;
        }

        public Criteria andTrainstatusNotIn(List<String> values) {
            addCriterion("trainstatus not in", values, "trainstatus");
            return (Criteria) this;
        }

        public Criteria andTrainstatusBetween(String value1, String value2) {
            addCriterion("trainstatus between", value1, value2, "trainstatus");
            return (Criteria) this;
        }

        public Criteria andTrainstatusNotBetween(String value1, String value2) {
            addCriterion("trainstatus not between", value1, value2, "trainstatus");
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