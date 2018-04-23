package cn.zouhuachao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffTransferExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffTransferExample() {
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

        public Criteria andTransIdIsNull() {
            addCriterion("trans_id is null");
            return (Criteria) this;
        }

        public Criteria andTransIdIsNotNull() {
            addCriterion("trans_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransIdEqualTo(String value) {
            addCriterion("trans_id =", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotEqualTo(String value) {
            addCriterion("trans_id <>", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThan(String value) {
            addCriterion("trans_id >", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdGreaterThanOrEqualTo(String value) {
            addCriterion("trans_id >=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThan(String value) {
            addCriterion("trans_id <", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLessThanOrEqualTo(String value) {
            addCriterion("trans_id <=", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdLike(String value) {
            addCriterion("trans_id like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotLike(String value) {
            addCriterion("trans_id not like", value, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdIn(List<String> values) {
            addCriterion("trans_id in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotIn(List<String> values) {
            addCriterion("trans_id not in", values, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdBetween(String value1, String value2) {
            addCriterion("trans_id between", value1, value2, "transId");
            return (Criteria) this;
        }

        public Criteria andTransIdNotBetween(String value1, String value2) {
            addCriterion("trans_id not between", value1, value2, "transId");
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

        public Criteria andLastDepartmentIsNull() {
            addCriterion("last_department is null");
            return (Criteria) this;
        }

        public Criteria andLastDepartmentIsNotNull() {
            addCriterion("last_department is not null");
            return (Criteria) this;
        }

        public Criteria andLastDepartmentEqualTo(String value) {
            addCriterion("last_department =", value, "lastDepartment");
            return (Criteria) this;
        }

        public Criteria andLastDepartmentNotEqualTo(String value) {
            addCriterion("last_department <>", value, "lastDepartment");
            return (Criteria) this;
        }

        public Criteria andLastDepartmentGreaterThan(String value) {
            addCriterion("last_department >", value, "lastDepartment");
            return (Criteria) this;
        }

        public Criteria andLastDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("last_department >=", value, "lastDepartment");
            return (Criteria) this;
        }

        public Criteria andLastDepartmentLessThan(String value) {
            addCriterion("last_department <", value, "lastDepartment");
            return (Criteria) this;
        }

        public Criteria andLastDepartmentLessThanOrEqualTo(String value) {
            addCriterion("last_department <=", value, "lastDepartment");
            return (Criteria) this;
        }

        public Criteria andLastDepartmentLike(String value) {
            addCriterion("last_department like", value, "lastDepartment");
            return (Criteria) this;
        }

        public Criteria andLastDepartmentNotLike(String value) {
            addCriterion("last_department not like", value, "lastDepartment");
            return (Criteria) this;
        }

        public Criteria andLastDepartmentIn(List<String> values) {
            addCriterion("last_department in", values, "lastDepartment");
            return (Criteria) this;
        }

        public Criteria andLastDepartmentNotIn(List<String> values) {
            addCriterion("last_department not in", values, "lastDepartment");
            return (Criteria) this;
        }

        public Criteria andLastDepartmentBetween(String value1, String value2) {
            addCriterion("last_department between", value1, value2, "lastDepartment");
            return (Criteria) this;
        }

        public Criteria andLastDepartmentNotBetween(String value1, String value2) {
            addCriterion("last_department not between", value1, value2, "lastDepartment");
            return (Criteria) this;
        }

        public Criteria andLastJobIsNull() {
            addCriterion("last_job is null");
            return (Criteria) this;
        }

        public Criteria andLastJobIsNotNull() {
            addCriterion("last_job is not null");
            return (Criteria) this;
        }

        public Criteria andLastJobEqualTo(String value) {
            addCriterion("last_job =", value, "lastJob");
            return (Criteria) this;
        }

        public Criteria andLastJobNotEqualTo(String value) {
            addCriterion("last_job <>", value, "lastJob");
            return (Criteria) this;
        }

        public Criteria andLastJobGreaterThan(String value) {
            addCriterion("last_job >", value, "lastJob");
            return (Criteria) this;
        }

        public Criteria andLastJobGreaterThanOrEqualTo(String value) {
            addCriterion("last_job >=", value, "lastJob");
            return (Criteria) this;
        }

        public Criteria andLastJobLessThan(String value) {
            addCriterion("last_job <", value, "lastJob");
            return (Criteria) this;
        }

        public Criteria andLastJobLessThanOrEqualTo(String value) {
            addCriterion("last_job <=", value, "lastJob");
            return (Criteria) this;
        }

        public Criteria andLastJobLike(String value) {
            addCriterion("last_job like", value, "lastJob");
            return (Criteria) this;
        }

        public Criteria andLastJobNotLike(String value) {
            addCriterion("last_job not like", value, "lastJob");
            return (Criteria) this;
        }

        public Criteria andLastJobIn(List<String> values) {
            addCriterion("last_job in", values, "lastJob");
            return (Criteria) this;
        }

        public Criteria andLastJobNotIn(List<String> values) {
            addCriterion("last_job not in", values, "lastJob");
            return (Criteria) this;
        }

        public Criteria andLastJobBetween(String value1, String value2) {
            addCriterion("last_job between", value1, value2, "lastJob");
            return (Criteria) this;
        }

        public Criteria andLastJobNotBetween(String value1, String value2) {
            addCriterion("last_job not between", value1, value2, "lastJob");
            return (Criteria) this;
        }

        public Criteria andTransReasonIsNull() {
            addCriterion("trans_reason is null");
            return (Criteria) this;
        }

        public Criteria andTransReasonIsNotNull() {
            addCriterion("trans_reason is not null");
            return (Criteria) this;
        }

        public Criteria andTransReasonEqualTo(String value) {
            addCriterion("trans_reason =", value, "transReason");
            return (Criteria) this;
        }

        public Criteria andTransReasonNotEqualTo(String value) {
            addCriterion("trans_reason <>", value, "transReason");
            return (Criteria) this;
        }

        public Criteria andTransReasonGreaterThan(String value) {
            addCriterion("trans_reason >", value, "transReason");
            return (Criteria) this;
        }

        public Criteria andTransReasonGreaterThanOrEqualTo(String value) {
            addCriterion("trans_reason >=", value, "transReason");
            return (Criteria) this;
        }

        public Criteria andTransReasonLessThan(String value) {
            addCriterion("trans_reason <", value, "transReason");
            return (Criteria) this;
        }

        public Criteria andTransReasonLessThanOrEqualTo(String value) {
            addCriterion("trans_reason <=", value, "transReason");
            return (Criteria) this;
        }

        public Criteria andTransReasonLike(String value) {
            addCriterion("trans_reason like", value, "transReason");
            return (Criteria) this;
        }

        public Criteria andTransReasonNotLike(String value) {
            addCriterion("trans_reason not like", value, "transReason");
            return (Criteria) this;
        }

        public Criteria andTransReasonIn(List<String> values) {
            addCriterion("trans_reason in", values, "transReason");
            return (Criteria) this;
        }

        public Criteria andTransReasonNotIn(List<String> values) {
            addCriterion("trans_reason not in", values, "transReason");
            return (Criteria) this;
        }

        public Criteria andTransReasonBetween(String value1, String value2) {
            addCriterion("trans_reason between", value1, value2, "transReason");
            return (Criteria) this;
        }

        public Criteria andTransReasonNotBetween(String value1, String value2) {
            addCriterion("trans_reason not between", value1, value2, "transReason");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNull() {
            addCriterion("trans_time is null");
            return (Criteria) this;
        }

        public Criteria andTransTimeIsNotNull() {
            addCriterion("trans_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransTimeEqualTo(Date value) {
            addCriterion("trans_time =", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotEqualTo(Date value) {
            addCriterion("trans_time <>", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThan(Date value) {
            addCriterion("trans_time >", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trans_time >=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThan(Date value) {
            addCriterion("trans_time <", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeLessThanOrEqualTo(Date value) {
            addCriterion("trans_time <=", value, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeIn(List<Date> values) {
            addCriterion("trans_time in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotIn(List<Date> values) {
            addCriterion("trans_time not in", values, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeBetween(Date value1, Date value2) {
            addCriterion("trans_time between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andTransTimeNotBetween(Date value1, Date value2) {
            addCriterion("trans_time not between", value1, value2, "transTime");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentIsNull() {
            addCriterion("new_department is null");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentIsNotNull() {
            addCriterion("new_department is not null");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentEqualTo(String value) {
            addCriterion("new_department =", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentNotEqualTo(String value) {
            addCriterion("new_department <>", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentGreaterThan(String value) {
            addCriterion("new_department >", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("new_department >=", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentLessThan(String value) {
            addCriterion("new_department <", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentLessThanOrEqualTo(String value) {
            addCriterion("new_department <=", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentLike(String value) {
            addCriterion("new_department like", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentNotLike(String value) {
            addCriterion("new_department not like", value, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentIn(List<String> values) {
            addCriterion("new_department in", values, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentNotIn(List<String> values) {
            addCriterion("new_department not in", values, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentBetween(String value1, String value2) {
            addCriterion("new_department between", value1, value2, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewDepartmentNotBetween(String value1, String value2) {
            addCriterion("new_department not between", value1, value2, "newDepartment");
            return (Criteria) this;
        }

        public Criteria andNewJobIsNull() {
            addCriterion("new_job is null");
            return (Criteria) this;
        }

        public Criteria andNewJobIsNotNull() {
            addCriterion("new_job is not null");
            return (Criteria) this;
        }

        public Criteria andNewJobEqualTo(String value) {
            addCriterion("new_job =", value, "newJob");
            return (Criteria) this;
        }

        public Criteria andNewJobNotEqualTo(String value) {
            addCriterion("new_job <>", value, "newJob");
            return (Criteria) this;
        }

        public Criteria andNewJobGreaterThan(String value) {
            addCriterion("new_job >", value, "newJob");
            return (Criteria) this;
        }

        public Criteria andNewJobGreaterThanOrEqualTo(String value) {
            addCriterion("new_job >=", value, "newJob");
            return (Criteria) this;
        }

        public Criteria andNewJobLessThan(String value) {
            addCriterion("new_job <", value, "newJob");
            return (Criteria) this;
        }

        public Criteria andNewJobLessThanOrEqualTo(String value) {
            addCriterion("new_job <=", value, "newJob");
            return (Criteria) this;
        }

        public Criteria andNewJobLike(String value) {
            addCriterion("new_job like", value, "newJob");
            return (Criteria) this;
        }

        public Criteria andNewJobNotLike(String value) {
            addCriterion("new_job not like", value, "newJob");
            return (Criteria) this;
        }

        public Criteria andNewJobIn(List<String> values) {
            addCriterion("new_job in", values, "newJob");
            return (Criteria) this;
        }

        public Criteria andNewJobNotIn(List<String> values) {
            addCriterion("new_job not in", values, "newJob");
            return (Criteria) this;
        }

        public Criteria andNewJobBetween(String value1, String value2) {
            addCriterion("new_job between", value1, value2, "newJob");
            return (Criteria) this;
        }

        public Criteria andNewJobNotBetween(String value1, String value2) {
            addCriterion("new_job not between", value1, value2, "newJob");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNull() {
            addCriterion("applicant is null");
            return (Criteria) this;
        }

        public Criteria andApplicantIsNotNull() {
            addCriterion("applicant is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantEqualTo(String value) {
            addCriterion("applicant =", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotEqualTo(String value) {
            addCriterion("applicant <>", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThan(String value) {
            addCriterion("applicant >", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantGreaterThanOrEqualTo(String value) {
            addCriterion("applicant >=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThan(String value) {
            addCriterion("applicant <", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLessThanOrEqualTo(String value) {
            addCriterion("applicant <=", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantLike(String value) {
            addCriterion("applicant like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotLike(String value) {
            addCriterion("applicant not like", value, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantIn(List<String> values) {
            addCriterion("applicant in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotIn(List<String> values) {
            addCriterion("applicant not in", values, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantBetween(String value1, String value2) {
            addCriterion("applicant between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApplicantNotBetween(String value1, String value2) {
            addCriterion("applicant not between", value1, value2, "applicant");
            return (Criteria) this;
        }

        public Criteria andApproverIsNull() {
            addCriterion("approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(String value) {
            addCriterion("approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(String value) {
            addCriterion("approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(String value) {
            addCriterion("approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(String value) {
            addCriterion("approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(String value) {
            addCriterion("approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(String value) {
            addCriterion("approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLike(String value) {
            addCriterion("approver like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotLike(String value) {
            addCriterion("approver not like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<String> values) {
            addCriterion("approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<String> values) {
            addCriterion("approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(String value1, String value2) {
            addCriterion("approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(String value1, String value2) {
            addCriterion("approver not between", value1, value2, "approver");
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