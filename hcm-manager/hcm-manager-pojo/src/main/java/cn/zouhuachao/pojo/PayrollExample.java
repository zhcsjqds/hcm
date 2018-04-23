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

        public Criteria andPayIdIsNull() {
            addCriterion("pay_id is null");
            return (Criteria) this;
        }

        public Criteria andPayIdIsNotNull() {
            addCriterion("pay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayIdEqualTo(String value) {
            addCriterion("pay_id =", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotEqualTo(String value) {
            addCriterion("pay_id <>", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThan(String value) {
            addCriterion("pay_id >", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdGreaterThanOrEqualTo(String value) {
            addCriterion("pay_id >=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThan(String value) {
            addCriterion("pay_id <", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLessThanOrEqualTo(String value) {
            addCriterion("pay_id <=", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdLike(String value) {
            addCriterion("pay_id like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotLike(String value) {
            addCriterion("pay_id not like", value, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdIn(List<String> values) {
            addCriterion("pay_id in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotIn(List<String> values) {
            addCriterion("pay_id not in", values, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdBetween(String value1, String value2) {
            addCriterion("pay_id between", value1, value2, "payId");
            return (Criteria) this;
        }

        public Criteria andPayIdNotBetween(String value1, String value2) {
            addCriterion("pay_id not between", value1, value2, "payId");
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

        public Criteria andPaygradeIdIsNull() {
            addCriterion("paygrade_id is null");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdIsNotNull() {
            addCriterion("paygrade_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdEqualTo(String value) {
            addCriterion("paygrade_id =", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdNotEqualTo(String value) {
            addCriterion("paygrade_id <>", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdGreaterThan(String value) {
            addCriterion("paygrade_id >", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("paygrade_id >=", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdLessThan(String value) {
            addCriterion("paygrade_id <", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdLessThanOrEqualTo(String value) {
            addCriterion("paygrade_id <=", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdLike(String value) {
            addCriterion("paygrade_id like", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdNotLike(String value) {
            addCriterion("paygrade_id not like", value, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdIn(List<String> values) {
            addCriterion("paygrade_id in", values, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdNotIn(List<String> values) {
            addCriterion("paygrade_id not in", values, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdBetween(String value1, String value2) {
            addCriterion("paygrade_id between", value1, value2, "paygradeId");
            return (Criteria) this;
        }

        public Criteria andPaygradeIdNotBetween(String value1, String value2) {
            addCriterion("paygrade_id not between", value1, value2, "paygradeId");
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

        public Criteria andEndowmentInsIsNull() {
            addCriterion("endowment_ins is null");
            return (Criteria) this;
        }

        public Criteria andEndowmentInsIsNotNull() {
            addCriterion("endowment_ins is not null");
            return (Criteria) this;
        }

        public Criteria andEndowmentInsEqualTo(BigDecimal value) {
            addCriterion("endowment_ins =", value, "endowmentIns");
            return (Criteria) this;
        }

        public Criteria andEndowmentInsNotEqualTo(BigDecimal value) {
            addCriterion("endowment_ins <>", value, "endowmentIns");
            return (Criteria) this;
        }

        public Criteria andEndowmentInsGreaterThan(BigDecimal value) {
            addCriterion("endowment_ins >", value, "endowmentIns");
            return (Criteria) this;
        }

        public Criteria andEndowmentInsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("endowment_ins >=", value, "endowmentIns");
            return (Criteria) this;
        }

        public Criteria andEndowmentInsLessThan(BigDecimal value) {
            addCriterion("endowment_ins <", value, "endowmentIns");
            return (Criteria) this;
        }

        public Criteria andEndowmentInsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("endowment_ins <=", value, "endowmentIns");
            return (Criteria) this;
        }

        public Criteria andEndowmentInsIn(List<BigDecimal> values) {
            addCriterion("endowment_ins in", values, "endowmentIns");
            return (Criteria) this;
        }

        public Criteria andEndowmentInsNotIn(List<BigDecimal> values) {
            addCriterion("endowment_ins not in", values, "endowmentIns");
            return (Criteria) this;
        }

        public Criteria andEndowmentInsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("endowment_ins between", value1, value2, "endowmentIns");
            return (Criteria) this;
        }

        public Criteria andEndowmentInsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("endowment_ins not between", value1, value2, "endowmentIns");
            return (Criteria) this;
        }

        public Criteria andMedicalInsIsNull() {
            addCriterion("medical_ins is null");
            return (Criteria) this;
        }

        public Criteria andMedicalInsIsNotNull() {
            addCriterion("medical_ins is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalInsEqualTo(BigDecimal value) {
            addCriterion("medical_ins =", value, "medicalIns");
            return (Criteria) this;
        }

        public Criteria andMedicalInsNotEqualTo(BigDecimal value) {
            addCriterion("medical_ins <>", value, "medicalIns");
            return (Criteria) this;
        }

        public Criteria andMedicalInsGreaterThan(BigDecimal value) {
            addCriterion("medical_ins >", value, "medicalIns");
            return (Criteria) this;
        }

        public Criteria andMedicalInsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_ins >=", value, "medicalIns");
            return (Criteria) this;
        }

        public Criteria andMedicalInsLessThan(BigDecimal value) {
            addCriterion("medical_ins <", value, "medicalIns");
            return (Criteria) this;
        }

        public Criteria andMedicalInsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_ins <=", value, "medicalIns");
            return (Criteria) this;
        }

        public Criteria andMedicalInsIn(List<BigDecimal> values) {
            addCriterion("medical_ins in", values, "medicalIns");
            return (Criteria) this;
        }

        public Criteria andMedicalInsNotIn(List<BigDecimal> values) {
            addCriterion("medical_ins not in", values, "medicalIns");
            return (Criteria) this;
        }

        public Criteria andMedicalInsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_ins between", value1, value2, "medicalIns");
            return (Criteria) this;
        }

        public Criteria andMedicalInsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_ins not between", value1, value2, "medicalIns");
            return (Criteria) this;
        }

        public Criteria andUnemploymentInsIsNull() {
            addCriterion("unemployment_ins is null");
            return (Criteria) this;
        }

        public Criteria andUnemploymentInsIsNotNull() {
            addCriterion("unemployment_ins is not null");
            return (Criteria) this;
        }

        public Criteria andUnemploymentInsEqualTo(BigDecimal value) {
            addCriterion("unemployment_ins =", value, "unemploymentIns");
            return (Criteria) this;
        }

        public Criteria andUnemploymentInsNotEqualTo(BigDecimal value) {
            addCriterion("unemployment_ins <>", value, "unemploymentIns");
            return (Criteria) this;
        }

        public Criteria andUnemploymentInsGreaterThan(BigDecimal value) {
            addCriterion("unemployment_ins >", value, "unemploymentIns");
            return (Criteria) this;
        }

        public Criteria andUnemploymentInsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unemployment_ins >=", value, "unemploymentIns");
            return (Criteria) this;
        }

        public Criteria andUnemploymentInsLessThan(BigDecimal value) {
            addCriterion("unemployment_ins <", value, "unemploymentIns");
            return (Criteria) this;
        }

        public Criteria andUnemploymentInsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unemployment_ins <=", value, "unemploymentIns");
            return (Criteria) this;
        }

        public Criteria andUnemploymentInsIn(List<BigDecimal> values) {
            addCriterion("unemployment_ins in", values, "unemploymentIns");
            return (Criteria) this;
        }

        public Criteria andUnemploymentInsNotIn(List<BigDecimal> values) {
            addCriterion("unemployment_ins not in", values, "unemploymentIns");
            return (Criteria) this;
        }

        public Criteria andUnemploymentInsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unemployment_ins between", value1, value2, "unemploymentIns");
            return (Criteria) this;
        }

        public Criteria andUnemploymentInsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unemployment_ins not between", value1, value2, "unemploymentIns");
            return (Criteria) this;
        }

        public Criteria andHousingFundIsNull() {
            addCriterion("housing_fund is null");
            return (Criteria) this;
        }

        public Criteria andHousingFundIsNotNull() {
            addCriterion("housing_fund is not null");
            return (Criteria) this;
        }

        public Criteria andHousingFundEqualTo(BigDecimal value) {
            addCriterion("housing_fund =", value, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundNotEqualTo(BigDecimal value) {
            addCriterion("housing_fund <>", value, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundGreaterThan(BigDecimal value) {
            addCriterion("housing_fund >", value, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("housing_fund >=", value, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundLessThan(BigDecimal value) {
            addCriterion("housing_fund <", value, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("housing_fund <=", value, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundIn(List<BigDecimal> values) {
            addCriterion("housing_fund in", values, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundNotIn(List<BigDecimal> values) {
            addCriterion("housing_fund not in", values, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housing_fund between", value1, value2, "housingFund");
            return (Criteria) this;
        }

        public Criteria andHousingFundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("housing_fund not between", value1, value2, "housingFund");
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