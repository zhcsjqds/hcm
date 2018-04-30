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

        public Criteria andTransidIsNull() {
            addCriterion("transid is null");
            return (Criteria) this;
        }

        public Criteria andTransidIsNotNull() {
            addCriterion("transid is not null");
            return (Criteria) this;
        }

        public Criteria andTransidEqualTo(String value) {
            addCriterion("transid =", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotEqualTo(String value) {
            addCriterion("transid <>", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidGreaterThan(String value) {
            addCriterion("transid >", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidGreaterThanOrEqualTo(String value) {
            addCriterion("transid >=", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidLessThan(String value) {
            addCriterion("transid <", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidLessThanOrEqualTo(String value) {
            addCriterion("transid <=", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidLike(String value) {
            addCriterion("transid like", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotLike(String value) {
            addCriterion("transid not like", value, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidIn(List<String> values) {
            addCriterion("transid in", values, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotIn(List<String> values) {
            addCriterion("transid not in", values, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidBetween(String value1, String value2) {
            addCriterion("transid between", value1, value2, "transid");
            return (Criteria) this;
        }

        public Criteria andTransidNotBetween(String value1, String value2) {
            addCriterion("transid not between", value1, value2, "transid");
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

        public Criteria andNewdepartmentIsNull() {
            addCriterion("newdepartment is null");
            return (Criteria) this;
        }

        public Criteria andNewdepartmentIsNotNull() {
            addCriterion("newdepartment is not null");
            return (Criteria) this;
        }

        public Criteria andNewdepartmentEqualTo(String value) {
            addCriterion("newdepartment =", value, "newdepartment");
            return (Criteria) this;
        }

        public Criteria andNewdepartmentNotEqualTo(String value) {
            addCriterion("newdepartment <>", value, "newdepartment");
            return (Criteria) this;
        }

        public Criteria andNewdepartmentGreaterThan(String value) {
            addCriterion("newdepartment >", value, "newdepartment");
            return (Criteria) this;
        }

        public Criteria andNewdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("newdepartment >=", value, "newdepartment");
            return (Criteria) this;
        }

        public Criteria andNewdepartmentLessThan(String value) {
            addCriterion("newdepartment <", value, "newdepartment");
            return (Criteria) this;
        }

        public Criteria andNewdepartmentLessThanOrEqualTo(String value) {
            addCriterion("newdepartment <=", value, "newdepartment");
            return (Criteria) this;
        }

        public Criteria andNewdepartmentLike(String value) {
            addCriterion("newdepartment like", value, "newdepartment");
            return (Criteria) this;
        }

        public Criteria andNewdepartmentNotLike(String value) {
            addCriterion("newdepartment not like", value, "newdepartment");
            return (Criteria) this;
        }

        public Criteria andNewdepartmentIn(List<String> values) {
            addCriterion("newdepartment in", values, "newdepartment");
            return (Criteria) this;
        }

        public Criteria andNewdepartmentNotIn(List<String> values) {
            addCriterion("newdepartment not in", values, "newdepartment");
            return (Criteria) this;
        }

        public Criteria andNewdepartmentBetween(String value1, String value2) {
            addCriterion("newdepartment between", value1, value2, "newdepartment");
            return (Criteria) this;
        }

        public Criteria andNewdepartmentNotBetween(String value1, String value2) {
            addCriterion("newdepartment not between", value1, value2, "newdepartment");
            return (Criteria) this;
        }

        public Criteria andNewjobIsNull() {
            addCriterion("newjob is null");
            return (Criteria) this;
        }

        public Criteria andNewjobIsNotNull() {
            addCriterion("newjob is not null");
            return (Criteria) this;
        }

        public Criteria andNewjobEqualTo(String value) {
            addCriterion("newjob =", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobNotEqualTo(String value) {
            addCriterion("newjob <>", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobGreaterThan(String value) {
            addCriterion("newjob >", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobGreaterThanOrEqualTo(String value) {
            addCriterion("newjob >=", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobLessThan(String value) {
            addCriterion("newjob <", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobLessThanOrEqualTo(String value) {
            addCriterion("newjob <=", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobLike(String value) {
            addCriterion("newjob like", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobNotLike(String value) {
            addCriterion("newjob not like", value, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobIn(List<String> values) {
            addCriterion("newjob in", values, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobNotIn(List<String> values) {
            addCriterion("newjob not in", values, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobBetween(String value1, String value2) {
            addCriterion("newjob between", value1, value2, "newjob");
            return (Criteria) this;
        }

        public Criteria andNewjobNotBetween(String value1, String value2) {
            addCriterion("newjob not between", value1, value2, "newjob");
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

        public Criteria andTranstimeIsNull() {
            addCriterion("transtime is null");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNotNull() {
            addCriterion("transtime is not null");
            return (Criteria) this;
        }

        public Criteria andTranstimeEqualTo(Date value) {
            addCriterion("transtime =", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotEqualTo(Date value) {
            addCriterion("transtime <>", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThan(Date value) {
            addCriterion("transtime >", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("transtime >=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThan(Date value) {
            addCriterion("transtime <", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThanOrEqualTo(Date value) {
            addCriterion("transtime <=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeIn(List<Date> values) {
            addCriterion("transtime in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotIn(List<Date> values) {
            addCriterion("transtime not in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeBetween(Date value1, Date value2) {
            addCriterion("transtime between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotBetween(Date value1, Date value2) {
            addCriterion("transtime not between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTransreasonIsNull() {
            addCriterion("transreason is null");
            return (Criteria) this;
        }

        public Criteria andTransreasonIsNotNull() {
            addCriterion("transreason is not null");
            return (Criteria) this;
        }

        public Criteria andTransreasonEqualTo(String value) {
            addCriterion("transreason =", value, "transreason");
            return (Criteria) this;
        }

        public Criteria andTransreasonNotEqualTo(String value) {
            addCriterion("transreason <>", value, "transreason");
            return (Criteria) this;
        }

        public Criteria andTransreasonGreaterThan(String value) {
            addCriterion("transreason >", value, "transreason");
            return (Criteria) this;
        }

        public Criteria andTransreasonGreaterThanOrEqualTo(String value) {
            addCriterion("transreason >=", value, "transreason");
            return (Criteria) this;
        }

        public Criteria andTransreasonLessThan(String value) {
            addCriterion("transreason <", value, "transreason");
            return (Criteria) this;
        }

        public Criteria andTransreasonLessThanOrEqualTo(String value) {
            addCriterion("transreason <=", value, "transreason");
            return (Criteria) this;
        }

        public Criteria andTransreasonLike(String value) {
            addCriterion("transreason like", value, "transreason");
            return (Criteria) this;
        }

        public Criteria andTransreasonNotLike(String value) {
            addCriterion("transreason not like", value, "transreason");
            return (Criteria) this;
        }

        public Criteria andTransreasonIn(List<String> values) {
            addCriterion("transreason in", values, "transreason");
            return (Criteria) this;
        }

        public Criteria andTransreasonNotIn(List<String> values) {
            addCriterion("transreason not in", values, "transreason");
            return (Criteria) this;
        }

        public Criteria andTransreasonBetween(String value1, String value2) {
            addCriterion("transreason between", value1, value2, "transreason");
            return (Criteria) this;
        }

        public Criteria andTransreasonNotBetween(String value1, String value2) {
            addCriterion("transreason not between", value1, value2, "transreason");
            return (Criteria) this;
        }

        public Criteria andTranstatusIsNull() {
            addCriterion("transtatus is null");
            return (Criteria) this;
        }

        public Criteria andTranstatusIsNotNull() {
            addCriterion("transtatus is not null");
            return (Criteria) this;
        }

        public Criteria andTranstatusEqualTo(String value) {
            addCriterion("transtatus =", value, "transtatus");
            return (Criteria) this;
        }

        public Criteria andTranstatusNotEqualTo(String value) {
            addCriterion("transtatus <>", value, "transtatus");
            return (Criteria) this;
        }

        public Criteria andTranstatusGreaterThan(String value) {
            addCriterion("transtatus >", value, "transtatus");
            return (Criteria) this;
        }

        public Criteria andTranstatusGreaterThanOrEqualTo(String value) {
            addCriterion("transtatus >=", value, "transtatus");
            return (Criteria) this;
        }

        public Criteria andTranstatusLessThan(String value) {
            addCriterion("transtatus <", value, "transtatus");
            return (Criteria) this;
        }

        public Criteria andTranstatusLessThanOrEqualTo(String value) {
            addCriterion("transtatus <=", value, "transtatus");
            return (Criteria) this;
        }

        public Criteria andTranstatusLike(String value) {
            addCriterion("transtatus like", value, "transtatus");
            return (Criteria) this;
        }

        public Criteria andTranstatusNotLike(String value) {
            addCriterion("transtatus not like", value, "transtatus");
            return (Criteria) this;
        }

        public Criteria andTranstatusIn(List<String> values) {
            addCriterion("transtatus in", values, "transtatus");
            return (Criteria) this;
        }

        public Criteria andTranstatusNotIn(List<String> values) {
            addCriterion("transtatus not in", values, "transtatus");
            return (Criteria) this;
        }

        public Criteria andTranstatusBetween(String value1, String value2) {
            addCriterion("transtatus between", value1, value2, "transtatus");
            return (Criteria) this;
        }

        public Criteria andTranstatusNotBetween(String value1, String value2) {
            addCriterion("transtatus not between", value1, value2, "transtatus");
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