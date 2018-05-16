package cn.zouhuachao.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InsRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InsRateExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andEndowmentinsEqualTo(Float value) {
            addCriterion("endowmentins =", value, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsNotEqualTo(Float value) {
            addCriterion("endowmentins <>", value, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsGreaterThan(Float value) {
            addCriterion("endowmentins >", value, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsGreaterThanOrEqualTo(Float value) {
            addCriterion("endowmentins >=", value, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsLessThan(Float value) {
            addCriterion("endowmentins <", value, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsLessThanOrEqualTo(Float value) {
            addCriterion("endowmentins <=", value, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsIn(List<Float> values) {
            addCriterion("endowmentins in", values, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsNotIn(List<Float> values) {
            addCriterion("endowmentins not in", values, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsBetween(Float value1, Float value2) {
            addCriterion("endowmentins between", value1, value2, "endowmentins");
            return (Criteria) this;
        }

        public Criteria andEndowmentinsNotBetween(Float value1, Float value2) {
            addCriterion("endowmentins not between", value1, value2, "endowmentins");
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

        public Criteria andUnemploymentinsEqualTo(Float value) {
            addCriterion("unemploymentins =", value, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsNotEqualTo(Float value) {
            addCriterion("unemploymentins <>", value, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsGreaterThan(Float value) {
            addCriterion("unemploymentins >", value, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsGreaterThanOrEqualTo(Float value) {
            addCriterion("unemploymentins >=", value, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsLessThan(Float value) {
            addCriterion("unemploymentins <", value, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsLessThanOrEqualTo(Float value) {
            addCriterion("unemploymentins <=", value, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsIn(List<Float> values) {
            addCriterion("unemploymentins in", values, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsNotIn(List<Float> values) {
            addCriterion("unemploymentins not in", values, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsBetween(Float value1, Float value2) {
            addCriterion("unemploymentins between", value1, value2, "unemploymentins");
            return (Criteria) this;
        }

        public Criteria andUnemploymentinsNotBetween(Float value1, Float value2) {
            addCriterion("unemploymentins not between", value1, value2, "unemploymentins");
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

        public Criteria andMedicalinsEqualTo(Float value) {
            addCriterion("medicalins =", value, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsNotEqualTo(Float value) {
            addCriterion("medicalins <>", value, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsGreaterThan(Float value) {
            addCriterion("medicalins >", value, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsGreaterThanOrEqualTo(Float value) {
            addCriterion("medicalins >=", value, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsLessThan(Float value) {
            addCriterion("medicalins <", value, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsLessThanOrEqualTo(Float value) {
            addCriterion("medicalins <=", value, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsIn(List<Float> values) {
            addCriterion("medicalins in", values, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsNotIn(List<Float> values) {
            addCriterion("medicalins not in", values, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsBetween(Float value1, Float value2) {
            addCriterion("medicalins between", value1, value2, "medicalins");
            return (Criteria) this;
        }

        public Criteria andMedicalinsNotBetween(Float value1, Float value2) {
            addCriterion("medicalins not between", value1, value2, "medicalins");
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

        public Criteria andHousingfundEqualTo(Float value) {
            addCriterion("housingfund =", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundNotEqualTo(Float value) {
            addCriterion("housingfund <>", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundGreaterThan(Float value) {
            addCriterion("housingfund >", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundGreaterThanOrEqualTo(Float value) {
            addCriterion("housingfund >=", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundLessThan(Float value) {
            addCriterion("housingfund <", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundLessThanOrEqualTo(Float value) {
            addCriterion("housingfund <=", value, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundIn(List<Float> values) {
            addCriterion("housingfund in", values, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundNotIn(List<Float> values) {
            addCriterion("housingfund not in", values, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundBetween(Float value1, Float value2) {
            addCriterion("housingfund between", value1, value2, "housingfund");
            return (Criteria) this;
        }

        public Criteria andHousingfundNotBetween(Float value1, Float value2) {
            addCriterion("housingfund not between", value1, value2, "housingfund");
            return (Criteria) this;
        }

        public Criteria andMaxworkageIsNull() {
            addCriterion("maxworkage is null");
            return (Criteria) this;
        }

        public Criteria andMaxworkageIsNotNull() {
            addCriterion("maxworkage is not null");
            return (Criteria) this;
        }

        public Criteria andMaxworkageEqualTo(Integer value) {
            addCriterion("maxworkage =", value, "maxworkage");
            return (Criteria) this;
        }

        public Criteria andMaxworkageNotEqualTo(Integer value) {
            addCriterion("maxworkage <>", value, "maxworkage");
            return (Criteria) this;
        }

        public Criteria andMaxworkageGreaterThan(Integer value) {
            addCriterion("maxworkage >", value, "maxworkage");
            return (Criteria) this;
        }

        public Criteria andMaxworkageGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxworkage >=", value, "maxworkage");
            return (Criteria) this;
        }

        public Criteria andMaxworkageLessThan(Integer value) {
            addCriterion("maxworkage <", value, "maxworkage");
            return (Criteria) this;
        }

        public Criteria andMaxworkageLessThanOrEqualTo(Integer value) {
            addCriterion("maxworkage <=", value, "maxworkage");
            return (Criteria) this;
        }

        public Criteria andMaxworkageIn(List<Integer> values) {
            addCriterion("maxworkage in", values, "maxworkage");
            return (Criteria) this;
        }

        public Criteria andMaxworkageNotIn(List<Integer> values) {
            addCriterion("maxworkage not in", values, "maxworkage");
            return (Criteria) this;
        }

        public Criteria andMaxworkageBetween(Integer value1, Integer value2) {
            addCriterion("maxworkage between", value1, value2, "maxworkage");
            return (Criteria) this;
        }

        public Criteria andMaxworkageNotBetween(Integer value1, Integer value2) {
            addCriterion("maxworkage not between", value1, value2, "maxworkage");
            return (Criteria) this;
        }

        public Criteria andEveryworkageIsNull() {
            addCriterion("everyworkage is null");
            return (Criteria) this;
        }

        public Criteria andEveryworkageIsNotNull() {
            addCriterion("everyworkage is not null");
            return (Criteria) this;
        }

        public Criteria andEveryworkageEqualTo(BigDecimal value) {
            addCriterion("everyworkage =", value, "everyworkage");
            return (Criteria) this;
        }

        public Criteria andEveryworkageNotEqualTo(BigDecimal value) {
            addCriterion("everyworkage <>", value, "everyworkage");
            return (Criteria) this;
        }

        public Criteria andEveryworkageGreaterThan(BigDecimal value) {
            addCriterion("everyworkage >", value, "everyworkage");
            return (Criteria) this;
        }

        public Criteria andEveryworkageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("everyworkage >=", value, "everyworkage");
            return (Criteria) this;
        }

        public Criteria andEveryworkageLessThan(BigDecimal value) {
            addCriterion("everyworkage <", value, "everyworkage");
            return (Criteria) this;
        }

        public Criteria andEveryworkageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("everyworkage <=", value, "everyworkage");
            return (Criteria) this;
        }

        public Criteria andEveryworkageIn(List<BigDecimal> values) {
            addCriterion("everyworkage in", values, "everyworkage");
            return (Criteria) this;
        }

        public Criteria andEveryworkageNotIn(List<BigDecimal> values) {
            addCriterion("everyworkage not in", values, "everyworkage");
            return (Criteria) this;
        }

        public Criteria andEveryworkageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("everyworkage between", value1, value2, "everyworkage");
            return (Criteria) this;
        }

        public Criteria andEveryworkageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("everyworkage not between", value1, value2, "everyworkage");
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