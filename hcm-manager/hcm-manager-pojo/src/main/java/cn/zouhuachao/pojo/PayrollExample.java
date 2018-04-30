package cn.zouhuachao.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayrollExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayrollExample() {
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

        public Criteria andPayidIsNull() {
            addCriterion("payid is null");
            return (Criteria) this;
        }

        public Criteria andPayidIsNotNull() {
            addCriterion("payid is not null");
            return (Criteria) this;
        }

        public Criteria andPayidEqualTo(String value) {
            addCriterion("payid =", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotEqualTo(String value) {
            addCriterion("payid <>", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThan(String value) {
            addCriterion("payid >", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidGreaterThanOrEqualTo(String value) {
            addCriterion("payid >=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThan(String value) {
            addCriterion("payid <", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLessThanOrEqualTo(String value) {
            addCriterion("payid <=", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidLike(String value) {
            addCriterion("payid like", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotLike(String value) {
            addCriterion("payid not like", value, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidIn(List<String> values) {
            addCriterion("payid in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotIn(List<String> values) {
            addCriterion("payid not in", values, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidBetween(String value1, String value2) {
            addCriterion("payid between", value1, value2, "payid");
            return (Criteria) this;
        }

        public Criteria andPayidNotBetween(String value1, String value2) {
            addCriterion("payid not between", value1, value2, "payid");
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

        public Criteria andPaygradeidIsNull() {
            addCriterion("paygradeid is null");
            return (Criteria) this;
        }

        public Criteria andPaygradeidIsNotNull() {
            addCriterion("paygradeid is not null");
            return (Criteria) this;
        }

        public Criteria andPaygradeidEqualTo(String value) {
            addCriterion("paygradeid =", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidNotEqualTo(String value) {
            addCriterion("paygradeid <>", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidGreaterThan(String value) {
            addCriterion("paygradeid >", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidGreaterThanOrEqualTo(String value) {
            addCriterion("paygradeid >=", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidLessThan(String value) {
            addCriterion("paygradeid <", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidLessThanOrEqualTo(String value) {
            addCriterion("paygradeid <=", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidLike(String value) {
            addCriterion("paygradeid like", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidNotLike(String value) {
            addCriterion("paygradeid not like", value, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidIn(List<String> values) {
            addCriterion("paygradeid in", values, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidNotIn(List<String> values) {
            addCriterion("paygradeid not in", values, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidBetween(String value1, String value2) {
            addCriterion("paygradeid between", value1, value2, "paygradeid");
            return (Criteria) this;
        }

        public Criteria andPaygradeidNotBetween(String value1, String value2) {
            addCriterion("paygradeid not between", value1, value2, "paygradeid");
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

        public Criteria andBonusIsNull() {
            addCriterion("bonus is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("bonus is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(BigDecimal value) {
            addCriterion("bonus =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(BigDecimal value) {
            addCriterion("bonus <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(BigDecimal value) {
            addCriterion("bonus >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(BigDecimal value) {
            addCriterion("bonus <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<BigDecimal> values) {
            addCriterion("bonus in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<BigDecimal> values) {
            addCriterion("bonus not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus not between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNull() {
            addCriterion("overtime is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNotNull() {
            addCriterion("overtime is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeEqualTo(BigDecimal value) {
            addCriterion("overtime =", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotEqualTo(BigDecimal value) {
            addCriterion("overtime <>", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThan(BigDecimal value) {
            addCriterion("overtime >", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overtime >=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThan(BigDecimal value) {
            addCriterion("overtime <", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overtime <=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn(List<BigDecimal> values) {
            addCriterion("overtime in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotIn(List<BigDecimal> values) {
            addCriterion("overtime not in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overtime between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overtime not between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andAttendanceIsNull() {
            addCriterion("attendance is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceIsNotNull() {
            addCriterion("attendance is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceEqualTo(BigDecimal value) {
            addCriterion("attendance =", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceNotEqualTo(BigDecimal value) {
            addCriterion("attendance <>", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceGreaterThan(BigDecimal value) {
            addCriterion("attendance >", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("attendance >=", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceLessThan(BigDecimal value) {
            addCriterion("attendance <", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("attendance <=", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceIn(List<BigDecimal> values) {
            addCriterion("attendance in", values, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceNotIn(List<BigDecimal> values) {
            addCriterion("attendance not in", values, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attendance between", value1, value2, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("attendance not between", value1, value2, "attendance");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsIsNull() {
            addCriterion("endowmentins is null");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsIsNotNull() {
            addCriterion("endowmentins is not null");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsEqualTo(BigDecimal value) {
            addCriterion("endowmentins =", value, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsNotEqualTo(BigDecimal value) {
            addCriterion("endowmentins <>", value, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsGreaterThan(BigDecimal value) {
            addCriterion("endowmentins >", value, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("endowmentins >=", value, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsLessThan(BigDecimal value) {
            addCriterion("endowmentins <", value, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("endowmentins <=", value, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsIn(List<BigDecimal> values) {
            addCriterion("endowmentins in", values, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsNotIn(List<BigDecimal> values) {
            addCriterion("endowmentins not in", values, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("endowmentins between", value1, value2, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("endowmentins not between", value1, value2, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsIsNull() {
            addCriterion("medicalins is null");
            return (Criteria) this;
        }

        public Criteria andMedicalinsIsNotNull() {
            addCriterion("medicalins is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalinsEqualTo(BigDecimal value) {
            addCriterion("medicalins =", value, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsNotEqualTo(BigDecimal value) {
            addCriterion("medicalins <>", value, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsGreaterThan(BigDecimal value) {
            addCriterion("medicalins >", value, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("medicalins >=", value, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsLessThan(BigDecimal value) {
            addCriterion("medicalins <", value, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("medicalins <=", value, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsIn(List<BigDecimal> values) {
            addCriterion("medicalins in", values, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsNotIn(List<BigDecimal> values) {
            addCriterion("medicalins not in", values, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medicalins between", value1, value2, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medicalins not between", value1, value2, "medicalins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsIsNull() {
            addCriterion("unemploymentins is null");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsIsNotNull() {
            addCriterion("unemploymentins is not null");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsEqualTo(BigDecimal value) {
            addCriterion("unemploymentins =", value, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsNotEqualTo(BigDecimal value) {
            addCriterion("unemploymentins <>", value, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsGreaterThan(BigDecimal value) {
            addCriterion("unemploymentins >", value, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unemploymentins >=", value, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsLessThan(BigDecimal value) {
            addCriterion("unemploymentins <", value, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unemploymentins <=", value, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsIn(List<BigDecimal> values) {
            addCriterion("unemploymentins in", values, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsNotIn(List<BigDecimal> values) {
            addCriterion("unemploymentins not in", values, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unemploymentins between", value1, value2, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unemploymentins not between", value1, value2, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andHousingfundIsNull() {
            addCriterion("housingfund is null");
            return (Criteria) this;
        }

        public Criteria andHousingfundIsNotNull() {
            addCriterion("housingfund is not null");
            return (Criteria) this;
        }

        public Criteria andHousingfundEqualTo(BigDecimal value) {
            addCriterion("housingfund =", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundNotEqualTo(BigDecimal value) {
            addCriterion("housingfund <>", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundGreaterThan(BigDecimal value) {
            addCriterion("housingfund >", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("housingfund >=", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundLessThan(BigDecimal value) {
            addCriterion("housingfund <", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("housingfund <=", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundIn(List<BigDecimal> values) {
            addCriterion("housingfund in", values, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundNotIn(List<BigDecimal> values) {
            addCriterion("housingfund not in", values, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housingfund between", value1, value2, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housingfund not between", value1, value2, "housingfund");
            return (Criteria) this;
        }

        public Criteria andIncometaxIsNull() {
            addCriterion("incometax is null");
            return (Criteria) this;
        }

        public Criteria andIncometaxIsNotNull() {
            addCriterion("incometax is not null");
            return (Criteria) this;
        }

        public Criteria andIncometaxEqualTo(BigDecimal value) {
            addCriterion("incometax =", value, "incometax");
            return (Criteria) this;
        }

        public Criteria andIncometaxNotEqualTo(BigDecimal value) {
            addCriterion("incometax <>", value, "incometax");
            return (Criteria) this;
        }

        public Criteria andIncometaxGreaterThan(BigDecimal value) {
            addCriterion("incometax >", value, "incometax");
            return (Criteria) this;
        }

        public Criteria andIncometaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("incometax >=", value, "incometax");
            return (Criteria) this;
        }

        public Criteria andIncometaxLessThan(BigDecimal value) {
            addCriterion("incometax <", value, "incometax");
            return (Criteria) this;
        }

        public Criteria andIncometaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("incometax <=", value, "incometax");
            return (Criteria) this;
        }

        public Criteria andIncometaxIn(List<BigDecimal> values) {
            addCriterion("incometax in", values, "incometax");
            return (Criteria) this;
        }

        public Criteria andIncometaxNotIn(List<BigDecimal> values) {
            addCriterion("incometax not in", values, "incometax");
            return (Criteria) this;
        }

        public Criteria andIncometaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("incometax between", value1, value2, "incometax");
            return (Criteria) this;
        }

        public Criteria andIncometaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("incometax not between", value1, value2, "incometax");
            return (Criteria) this;
        }

        public Criteria andFsalaryIsNull() {
            addCriterion("fsalary is null");
            return (Criteria) this;
        }

        public Criteria andFsalaryIsNotNull() {
            addCriterion("fsalary is not null");
            return (Criteria) this;
        }

        public Criteria andFsalaryEqualTo(BigDecimal value) {
            addCriterion("fsalary =", value, "fsalary");
            return (Criteria) this;
        }

        public Criteria andFsalaryNotEqualTo(BigDecimal value) {
            addCriterion("fsalary <>", value, "fsalary");
            return (Criteria) this;
        }

        public Criteria andFsalaryGreaterThan(BigDecimal value) {
            addCriterion("fsalary >", value, "fsalary");
            return (Criteria) this;
        }

        public Criteria andFsalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fsalary >=", value, "fsalary");
            return (Criteria) this;
        }

        public Criteria andFsalaryLessThan(BigDecimal value) {
            addCriterion("fsalary <", value, "fsalary");
            return (Criteria) this;
        }

        public Criteria andFsalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fsalary <=", value, "fsalary");
            return (Criteria) this;
        }

        public Criteria andFsalaryIn(List<BigDecimal> values) {
            addCriterion("fsalary in", values, "fsalary");
            return (Criteria) this;
        }

        public Criteria andFsalaryNotIn(List<BigDecimal> values) {
            addCriterion("fsalary not in", values, "fsalary");
            return (Criteria) this;
        }

        public Criteria andFsalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fsalary between", value1, value2, "fsalary");
            return (Criteria) this;
        }

        public Criteria andFsalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fsalary not between", value1, value2, "fsalary");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("paytime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("paytime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Date value) {
            addCriterion("paytime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Date value) {
            addCriterion("paytime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Date value) {
            addCriterion("paytime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("paytime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Date value) {
            addCriterion("paytime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("paytime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Date> values) {
            addCriterion("paytime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Date> values) {
            addCriterion("paytime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Date value1, Date value2) {
            addCriterion("paytime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("paytime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("payway is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("payway is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("payway =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("payway <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("payway >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("payway >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("payway <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("payway <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("payway like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("payway not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("payway in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("payway not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("payway between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("payway not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNull() {
            addCriterion("paystatus is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("paystatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(String value) {
            addCriterion("paystatus =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(String value) {
            addCriterion("paystatus <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(String value) {
            addCriterion("paystatus >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(String value) {
            addCriterion("paystatus >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(String value) {
            addCriterion("paystatus <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(String value) {
            addCriterion("paystatus <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLike(String value) {
            addCriterion("paystatus like", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotLike(String value) {
            addCriterion("paystatus not like", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<String> values) {
            addCriterion("paystatus in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<String> values) {
            addCriterion("paystatus not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(String value1, String value2) {
            addCriterion("paystatus between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(String value1, String value2) {
            addCriterion("paystatus not between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andTsalaryIsNull() {
            addCriterion("tsalary is null");
            return (Criteria) this;
        }

        public Criteria andTsalaryIsNotNull() {
            addCriterion("tsalary is not null");
            return (Criteria) this;
        }

        public Criteria andTsalaryEqualTo(BigDecimal value) {
            addCriterion("tsalary =", value, "tsalary");
            return (Criteria) this;
        }

        public Criteria andTsalaryNotEqualTo(BigDecimal value) {
            addCriterion("tsalary <>", value, "tsalary");
            return (Criteria) this;
        }

        public Criteria andTsalaryGreaterThan(BigDecimal value) {
            addCriterion("tsalary >", value, "tsalary");
            return (Criteria) this;
        }

        public Criteria andTsalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tsalary >=", value, "tsalary");
            return (Criteria) this;
        }

        public Criteria andTsalaryLessThan(BigDecimal value) {
            addCriterion("tsalary <", value, "tsalary");
            return (Criteria) this;
        }

        public Criteria andTsalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tsalary <=", value, "tsalary");
            return (Criteria) this;
        }

        public Criteria andTsalaryIn(List<BigDecimal> values) {
            addCriterion("tsalary in", values, "tsalary");
            return (Criteria) this;
        }

        public Criteria andTsalaryNotIn(List<BigDecimal> values) {
            addCriterion("tsalary not in", values, "tsalary");
            return (Criteria) this;
        }

        public Criteria andTsalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsalary between", value1, value2, "tsalary");
            return (Criteria) this;
        }

        public Criteria andTsalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tsalary not between", value1, value2, "tsalary");
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