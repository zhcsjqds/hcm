package cn.zouhuachao.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffDimissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffDimissionExample() {
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

        public Criteria andDimissionidIsNull() {
            addCriterion("dimissionid is null");
            return (Criteria) this;
        }

        public Criteria andDimissionidIsNotNull() {
            addCriterion("dimissionid is not null");
            return (Criteria) this;
        }

        public Criteria andDimissionidEqualTo(String value) {
            addCriterion("dimissionid =", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidNotEqualTo(String value) {
            addCriterion("dimissionid <>", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidGreaterThan(String value) {
            addCriterion("dimissionid >", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidGreaterThanOrEqualTo(String value) {
            addCriterion("dimissionid >=", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidLessThan(String value) {
            addCriterion("dimissionid <", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidLessThanOrEqualTo(String value) {
            addCriterion("dimissionid <=", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidLike(String value) {
            addCriterion("dimissionid like", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidNotLike(String value) {
            addCriterion("dimissionid not like", value, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidIn(List<String> values) {
            addCriterion("dimissionid in", values, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidNotIn(List<String> values) {
            addCriterion("dimissionid not in", values, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidBetween(String value1, String value2) {
            addCriterion("dimissionid between", value1, value2, "dimissionid");
            return (Criteria) this;
        }

        public Criteria andDimissionidNotBetween(String value1, String value2) {
            addCriterion("dimissionid not between", value1, value2, "dimissionid");
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

        public Criteria andStaffrealnameIsNull() {
            addCriterion("staffrealname is null");
            return (Criteria) this;
        }

        public Criteria andStaffrealnameIsNotNull() {
            addCriterion("staffrealname is not null");
            return (Criteria) this;
        }

        public Criteria andStaffrealnameEqualTo(String value) {
            addCriterion("staffrealname =", value, "staffrealname");
            return (Criteria) this;
        }

        public Criteria andStaffrealnameNotEqualTo(String value) {
            addCriterion("staffrealname <>", value, "staffrealname");
            return (Criteria) this;
        }

        public Criteria andStaffrealnameGreaterThan(String value) {
            addCriterion("staffrealname >", value, "staffrealname");
            return (Criteria) this;
        }

        public Criteria andStaffrealnameGreaterThanOrEqualTo(String value) {
            addCriterion("staffrealname >=", value, "staffrealname");
            return (Criteria) this;
        }

        public Criteria andStaffrealnameLessThan(String value) {
            addCriterion("staffrealname <", value, "staffrealname");
            return (Criteria) this;
        }

        public Criteria andStaffrealnameLessThanOrEqualTo(String value) {
            addCriterion("staffrealname <=", value, "staffrealname");
            return (Criteria) this;
        }

        public Criteria andStaffrealnameLike(String value) {
            addCriterion("staffrealname like", value, "staffrealname");
            return (Criteria) this;
        }

        public Criteria andStaffrealnameNotLike(String value) {
            addCriterion("staffrealname not like", value, "staffrealname");
            return (Criteria) this;
        }

        public Criteria andStaffrealnameIn(List<String> values) {
            addCriterion("staffrealname in", values, "staffrealname");
            return (Criteria) this;
        }

        public Criteria andStaffrealnameNotIn(List<String> values) {
            addCriterion("staffrealname not in", values, "staffrealname");
            return (Criteria) this;
        }

        public Criteria andStaffrealnameBetween(String value1, String value2) {
            addCriterion("staffrealname between", value1, value2, "staffrealname");
            return (Criteria) this;
        }

        public Criteria andStaffrealnameNotBetween(String value1, String value2) {
            addCriterion("staffrealname not between", value1, value2, "staffrealname");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentIsNull() {
            addCriterion("lastdepartment is null");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentIsNotNull() {
            addCriterion("lastdepartment is not null");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentEqualTo(String value) {
            addCriterion("lastdepartment =", value, "lastdepartment");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentNotEqualTo(String value) {
            addCriterion("lastdepartment <>", value, "lastdepartment");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentGreaterThan(String value) {
            addCriterion("lastdepartment >", value, "lastdepartment");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("lastdepartment >=", value, "lastdepartment");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentLessThan(String value) {
            addCriterion("lastdepartment <", value, "lastdepartment");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentLessThanOrEqualTo(String value) {
            addCriterion("lastdepartment <=", value, "lastdepartment");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentLike(String value) {
            addCriterion("lastdepartment like", value, "lastdepartment");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentNotLike(String value) {
            addCriterion("lastdepartment not like", value, "lastdepartment");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentIn(List<String> values) {
            addCriterion("lastdepartment in", values, "lastdepartment");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentNotIn(List<String> values) {
            addCriterion("lastdepartment not in", values, "lastdepartment");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentBetween(String value1, String value2) {
            addCriterion("lastdepartment between", value1, value2, "lastdepartment");
            return (Criteria) this;
        }

        public Criteria andLastdepartmentNotBetween(String value1, String value2) {
            addCriterion("lastdepartment not between", value1, value2, "lastdepartment");
            return (Criteria) this;
        }

        public Criteria andLastjobIsNull() {
            addCriterion("lastjob is null");
            return (Criteria) this;
        }

        public Criteria andLastjobIsNotNull() {
            addCriterion("lastjob is not null");
            return (Criteria) this;
        }

        public Criteria andLastjobEqualTo(String value) {
            addCriterion("lastjob =", value, "lastjob");
            return (Criteria) this;
        }

        public Criteria andLastjobNotEqualTo(String value) {
            addCriterion("lastjob <>", value, "lastjob");
            return (Criteria) this;
        }

        public Criteria andLastjobGreaterThan(String value) {
            addCriterion("lastjob >", value, "lastjob");
            return (Criteria) this;
        }

        public Criteria andLastjobGreaterThanOrEqualTo(String value) {
            addCriterion("lastjob >=", value, "lastjob");
            return (Criteria) this;
        }

        public Criteria andLastjobLessThan(String value) {
            addCriterion("lastjob <", value, "lastjob");
            return (Criteria) this;
        }

        public Criteria andLastjobLessThanOrEqualTo(String value) {
            addCriterion("lastjob <=", value, "lastjob");
            return (Criteria) this;
        }

        public Criteria andLastjobLike(String value) {
            addCriterion("lastjob like", value, "lastjob");
            return (Criteria) this;
        }

        public Criteria andLastjobNotLike(String value) {
            addCriterion("lastjob not like", value, "lastjob");
            return (Criteria) this;
        }

        public Criteria andLastjobIn(List<String> values) {
            addCriterion("lastjob in", values, "lastjob");
            return (Criteria) this;
        }

        public Criteria andLastjobNotIn(List<String> values) {
            addCriterion("lastjob not in", values, "lastjob");
            return (Criteria) this;
        }

        public Criteria andLastjobBetween(String value1, String value2) {
            addCriterion("lastjob between", value1, value2, "lastjob");
            return (Criteria) this;
        }

        public Criteria andLastjobNotBetween(String value1, String value2) {
            addCriterion("lastjob not between", value1, value2, "lastjob");
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

        public Criteria andApplicantiontimeIsNull() {
            addCriterion("applicantiontime is null");
            return (Criteria) this;
        }

        public Criteria andApplicantiontimeIsNotNull() {
            addCriterion("applicantiontime is not null");
            return (Criteria) this;
        }

        public Criteria andApplicantiontimeEqualTo(Date value) {
            addCriterion("applicantiontime =", value, "applicantiontime");
            return (Criteria) this;
        }

        public Criteria andApplicantiontimeNotEqualTo(Date value) {
            addCriterion("applicantiontime <>", value, "applicantiontime");
            return (Criteria) this;
        }

        public Criteria andApplicantiontimeGreaterThan(Date value) {
            addCriterion("applicantiontime >", value, "applicantiontime");
            return (Criteria) this;
        }

        public Criteria andApplicantiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("applicantiontime >=", value, "applicantiontime");
            return (Criteria) this;
        }

        public Criteria andApplicantiontimeLessThan(Date value) {
            addCriterion("applicantiontime <", value, "applicantiontime");
            return (Criteria) this;
        }

        public Criteria andApplicantiontimeLessThanOrEqualTo(Date value) {
            addCriterion("applicantiontime <=", value, "applicantiontime");
            return (Criteria) this;
        }

        public Criteria andApplicantiontimeIn(List<Date> values) {
            addCriterion("applicantiontime in", values, "applicantiontime");
            return (Criteria) this;
        }

        public Criteria andApplicantiontimeNotIn(List<Date> values) {
            addCriterion("applicantiontime not in", values, "applicantiontime");
            return (Criteria) this;
        }

        public Criteria andApplicantiontimeBetween(Date value1, Date value2) {
            addCriterion("applicantiontime between", value1, value2, "applicantiontime");
            return (Criteria) this;
        }

        public Criteria andApplicantiontimeNotBetween(Date value1, Date value2) {
            addCriterion("applicantiontime not between", value1, value2, "applicantiontime");
            return (Criteria) this;
        }

        public Criteria andDimissionidtimeIsNull() {
            addCriterion("dimissionidtime is null");
            return (Criteria) this;
        }

        public Criteria andDimissionidtimeIsNotNull() {
            addCriterion("dimissionidtime is not null");
            return (Criteria) this;
        }

        public Criteria andDimissionidtimeEqualTo(Date value) {
            addCriterion("dimissionidtime =", value, "dimissionidtime");
            return (Criteria) this;
        }

        public Criteria andDimissionidtimeNotEqualTo(Date value) {
            addCriterion("dimissionidtime <>", value, "dimissionidtime");
            return (Criteria) this;
        }

        public Criteria andDimissionidtimeGreaterThan(Date value) {
            addCriterion("dimissionidtime >", value, "dimissionidtime");
            return (Criteria) this;
        }

        public Criteria andDimissionidtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dimissionidtime >=", value, "dimissionidtime");
            return (Criteria) this;
        }

        public Criteria andDimissionidtimeLessThan(Date value) {
            addCriterion("dimissionidtime <", value, "dimissionidtime");
            return (Criteria) this;
        }

        public Criteria andDimissionidtimeLessThanOrEqualTo(Date value) {
            addCriterion("dimissionidtime <=", value, "dimissionidtime");
            return (Criteria) this;
        }

        public Criteria andDimissionidtimeIn(List<Date> values) {
            addCriterion("dimissionidtime in", values, "dimissionidtime");
            return (Criteria) this;
        }

        public Criteria andDimissionidtimeNotIn(List<Date> values) {
            addCriterion("dimissionidtime not in", values, "dimissionidtime");
            return (Criteria) this;
        }

        public Criteria andDimissionidtimeBetween(Date value1, Date value2) {
            addCriterion("dimissionidtime between", value1, value2, "dimissionidtime");
            return (Criteria) this;
        }

        public Criteria andDimissionidtimeNotBetween(Date value1, Date value2) {
            addCriterion("dimissionidtime not between", value1, value2, "dimissionidtime");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonIsNull() {
            addCriterion("dimissionreason is null");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonIsNotNull() {
            addCriterion("dimissionreason is not null");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonEqualTo(String value) {
            addCriterion("dimissionreason =", value, "dimissionreason");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonNotEqualTo(String value) {
            addCriterion("dimissionreason <>", value, "dimissionreason");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonGreaterThan(String value) {
            addCriterion("dimissionreason >", value, "dimissionreason");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonGreaterThanOrEqualTo(String value) {
            addCriterion("dimissionreason >=", value, "dimissionreason");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonLessThan(String value) {
            addCriterion("dimissionreason <", value, "dimissionreason");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonLessThanOrEqualTo(String value) {
            addCriterion("dimissionreason <=", value, "dimissionreason");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonLike(String value) {
            addCriterion("dimissionreason like", value, "dimissionreason");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonNotLike(String value) {
            addCriterion("dimissionreason not like", value, "dimissionreason");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonIn(List<String> values) {
            addCriterion("dimissionreason in", values, "dimissionreason");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonNotIn(List<String> values) {
            addCriterion("dimissionreason not in", values, "dimissionreason");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonBetween(String value1, String value2) {
            addCriterion("dimissionreason between", value1, value2, "dimissionreason");
            return (Criteria) this;
        }

        public Criteria andDimissionreasonNotBetween(String value1, String value2) {
            addCriterion("dimissionreason not between", value1, value2, "dimissionreason");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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