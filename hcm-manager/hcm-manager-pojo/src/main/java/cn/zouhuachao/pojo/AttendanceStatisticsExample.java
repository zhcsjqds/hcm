package cn.zouhuachao.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceStatisticsExample() {
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

        public Criteria andStatIdIsNull() {
            addCriterion("stat_id is null");
            return (Criteria) this;
        }

        public Criteria andStatIdIsNotNull() {
            addCriterion("stat_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatIdEqualTo(String value) {
            addCriterion("stat_id =", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotEqualTo(String value) {
            addCriterion("stat_id <>", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdGreaterThan(String value) {
            addCriterion("stat_id >", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdGreaterThanOrEqualTo(String value) {
            addCriterion("stat_id >=", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdLessThan(String value) {
            addCriterion("stat_id <", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdLessThanOrEqualTo(String value) {
            addCriterion("stat_id <=", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdLike(String value) {
            addCriterion("stat_id like", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotLike(String value) {
            addCriterion("stat_id not like", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdIn(List<String> values) {
            addCriterion("stat_id in", values, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotIn(List<String> values) {
            addCriterion("stat_id not in", values, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdBetween(String value1, String value2) {
            addCriterion("stat_id between", value1, value2, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotBetween(String value1, String value2) {
            addCriterion("stat_id not between", value1, value2, "statId");
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andHdayIsNull() {
            addCriterion("hday is null");
            return (Criteria) this;
        }

        public Criteria andHdayIsNotNull() {
            addCriterion("hday is not null");
            return (Criteria) this;
        }

        public Criteria andHdayEqualTo(Integer value) {
            addCriterion("hday =", value, "hday");
            return (Criteria) this;
        }

        public Criteria andHdayNotEqualTo(Integer value) {
            addCriterion("hday <>", value, "hday");
            return (Criteria) this;
        }

        public Criteria andHdayGreaterThan(Integer value) {
            addCriterion("hday >", value, "hday");
            return (Criteria) this;
        }

        public Criteria andHdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("hday >=", value, "hday");
            return (Criteria) this;
        }

        public Criteria andHdayLessThan(Integer value) {
            addCriterion("hday <", value, "hday");
            return (Criteria) this;
        }

        public Criteria andHdayLessThanOrEqualTo(Integer value) {
            addCriterion("hday <=", value, "hday");
            return (Criteria) this;
        }

        public Criteria andHdayIn(List<Integer> values) {
            addCriterion("hday in", values, "hday");
            return (Criteria) this;
        }

        public Criteria andHdayNotIn(List<Integer> values) {
            addCriterion("hday not in", values, "hday");
            return (Criteria) this;
        }

        public Criteria andHdayBetween(Integer value1, Integer value2) {
            addCriterion("hday between", value1, value2, "hday");
            return (Criteria) this;
        }

        public Criteria andHdayNotBetween(Integer value1, Integer value2) {
            addCriterion("hday not between", value1, value2, "hday");
            return (Criteria) this;
        }

        public Criteria andSdayIsNull() {
            addCriterion("sday is null");
            return (Criteria) this;
        }

        public Criteria andSdayIsNotNull() {
            addCriterion("sday is not null");
            return (Criteria) this;
        }

        public Criteria andSdayEqualTo(Integer value) {
            addCriterion("sday =", value, "sday");
            return (Criteria) this;
        }

        public Criteria andSdayNotEqualTo(Integer value) {
            addCriterion("sday <>", value, "sday");
            return (Criteria) this;
        }

        public Criteria andSdayGreaterThan(Integer value) {
            addCriterion("sday >", value, "sday");
            return (Criteria) this;
        }

        public Criteria andSdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("sday >=", value, "sday");
            return (Criteria) this;
        }

        public Criteria andSdayLessThan(Integer value) {
            addCriterion("sday <", value, "sday");
            return (Criteria) this;
        }

        public Criteria andSdayLessThanOrEqualTo(Integer value) {
            addCriterion("sday <=", value, "sday");
            return (Criteria) this;
        }

        public Criteria andSdayIn(List<Integer> values) {
            addCriterion("sday in", values, "sday");
            return (Criteria) this;
        }

        public Criteria andSdayNotIn(List<Integer> values) {
            addCriterion("sday not in", values, "sday");
            return (Criteria) this;
        }

        public Criteria andSdayBetween(Integer value1, Integer value2) {
            addCriterion("sday between", value1, value2, "sday");
            return (Criteria) this;
        }

        public Criteria andSdayNotBetween(Integer value1, Integer value2) {
            addCriterion("sday not between", value1, value2, "sday");
            return (Criteria) this;
        }

        public Criteria andOdayIsNull() {
            addCriterion("oday is null");
            return (Criteria) this;
        }

        public Criteria andOdayIsNotNull() {
            addCriterion("oday is not null");
            return (Criteria) this;
        }

        public Criteria andOdayEqualTo(Integer value) {
            addCriterion("oday =", value, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayNotEqualTo(Integer value) {
            addCriterion("oday <>", value, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayGreaterThan(Integer value) {
            addCriterion("oday >", value, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("oday >=", value, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayLessThan(Integer value) {
            addCriterion("oday <", value, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayLessThanOrEqualTo(Integer value) {
            addCriterion("oday <=", value, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayIn(List<Integer> values) {
            addCriterion("oday in", values, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayNotIn(List<Integer> values) {
            addCriterion("oday not in", values, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayBetween(Integer value1, Integer value2) {
            addCriterion("oday between", value1, value2, "oday");
            return (Criteria) this;
        }

        public Criteria andOdayNotBetween(Integer value1, Integer value2) {
            addCriterion("oday not between", value1, value2, "oday");
            return (Criteria) this;
        }

        public Criteria andLeaveIsNull() {
            addCriterion("leave is null");
            return (Criteria) this;
        }

        public Criteria andLeaveIsNotNull() {
            addCriterion("leave is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveEqualTo(Float value) {
            addCriterion("leave =", value, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveNotEqualTo(Float value) {
            addCriterion("leave <>", value, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveGreaterThan(Float value) {
            addCriterion("leave >", value, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveGreaterThanOrEqualTo(Float value) {
            addCriterion("leave >=", value, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveLessThan(Float value) {
            addCriterion("leave <", value, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveLessThanOrEqualTo(Float value) {
            addCriterion("leave <=", value, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveIn(List<Float> values) {
            addCriterion("leave in", values, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveNotIn(List<Float> values) {
            addCriterion("leave not in", values, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveBetween(Float value1, Float value2) {
            addCriterion("leave between", value1, value2, "leave");
            return (Criteria) this;
        }

        public Criteria andLeaveNotBetween(Float value1, Float value2) {
            addCriterion("leave not between", value1, value2, "leave");
            return (Criteria) this;
        }

        public Criteria andLateIsNull() {
            addCriterion("late is null");
            return (Criteria) this;
        }

        public Criteria andLateIsNotNull() {
            addCriterion("late is not null");
            return (Criteria) this;
        }

        public Criteria andLateEqualTo(Integer value) {
            addCriterion("late =", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotEqualTo(Integer value) {
            addCriterion("late <>", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThan(Integer value) {
            addCriterion("late >", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThanOrEqualTo(Integer value) {
            addCriterion("late >=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThan(Integer value) {
            addCriterion("late <", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThanOrEqualTo(Integer value) {
            addCriterion("late <=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateIn(List<Integer> values) {
            addCriterion("late in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotIn(List<Integer> values) {
            addCriterion("late not in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateBetween(Integer value1, Integer value2) {
            addCriterion("late between", value1, value2, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotBetween(Integer value1, Integer value2) {
            addCriterion("late not between", value1, value2, "late");
            return (Criteria) this;
        }

        public Criteria andEarlyIsNull() {
            addCriterion("early is null");
            return (Criteria) this;
        }

        public Criteria andEarlyIsNotNull() {
            addCriterion("early is not null");
            return (Criteria) this;
        }

        public Criteria andEarlyEqualTo(Integer value) {
            addCriterion("early =", value, "early");
            return (Criteria) this;
        }

        public Criteria andEarlyNotEqualTo(Integer value) {
            addCriterion("early <>", value, "early");
            return (Criteria) this;
        }

        public Criteria andEarlyGreaterThan(Integer value) {
            addCriterion("early >", value, "early");
            return (Criteria) this;
        }

        public Criteria andEarlyGreaterThanOrEqualTo(Integer value) {
            addCriterion("early >=", value, "early");
            return (Criteria) this;
        }

        public Criteria andEarlyLessThan(Integer value) {
            addCriterion("early <", value, "early");
            return (Criteria) this;
        }

        public Criteria andEarlyLessThanOrEqualTo(Integer value) {
            addCriterion("early <=", value, "early");
            return (Criteria) this;
        }

        public Criteria andEarlyIn(List<Integer> values) {
            addCriterion("early in", values, "early");
            return (Criteria) this;
        }

        public Criteria andEarlyNotIn(List<Integer> values) {
            addCriterion("early not in", values, "early");
            return (Criteria) this;
        }

        public Criteria andEarlyBetween(Integer value1, Integer value2) {
            addCriterion("early between", value1, value2, "early");
            return (Criteria) this;
        }

        public Criteria andEarlyNotBetween(Integer value1, Integer value2) {
            addCriterion("early not between", value1, value2, "early");
            return (Criteria) this;
        }

        public Criteria andHolidayOtIsNull() {
            addCriterion("holiday_ot is null");
            return (Criteria) this;
        }

        public Criteria andHolidayOtIsNotNull() {
            addCriterion("holiday_ot is not null");
            return (Criteria) this;
        }

        public Criteria andHolidayOtEqualTo(Integer value) {
            addCriterion("holiday_ot =", value, "holidayOt");
            return (Criteria) this;
        }

        public Criteria andHolidayOtNotEqualTo(Integer value) {
            addCriterion("holiday_ot <>", value, "holidayOt");
            return (Criteria) this;
        }

        public Criteria andHolidayOtGreaterThan(Integer value) {
            addCriterion("holiday_ot >", value, "holidayOt");
            return (Criteria) this;
        }

        public Criteria andHolidayOtGreaterThanOrEqualTo(Integer value) {
            addCriterion("holiday_ot >=", value, "holidayOt");
            return (Criteria) this;
        }

        public Criteria andHolidayOtLessThan(Integer value) {
            addCriterion("holiday_ot <", value, "holidayOt");
            return (Criteria) this;
        }

        public Criteria andHolidayOtLessThanOrEqualTo(Integer value) {
            addCriterion("holiday_ot <=", value, "holidayOt");
            return (Criteria) this;
        }

        public Criteria andHolidayOtIn(List<Integer> values) {
            addCriterion("holiday_ot in", values, "holidayOt");
            return (Criteria) this;
        }

        public Criteria andHolidayOtNotIn(List<Integer> values) {
            addCriterion("holiday_ot not in", values, "holidayOt");
            return (Criteria) this;
        }

        public Criteria andHolidayOtBetween(Integer value1, Integer value2) {
            addCriterion("holiday_ot between", value1, value2, "holidayOt");
            return (Criteria) this;
        }

        public Criteria andHolidayOtNotBetween(Integer value1, Integer value2) {
            addCriterion("holiday_ot not between", value1, value2, "holidayOt");
            return (Criteria) this;
        }

        public Criteria andOtherOtIsNull() {
            addCriterion("other_ot is null");
            return (Criteria) this;
        }

        public Criteria andOtherOtIsNotNull() {
            addCriterion("other_ot is not null");
            return (Criteria) this;
        }

        public Criteria andOtherOtEqualTo(Integer value) {
            addCriterion("other_ot =", value, "otherOt");
            return (Criteria) this;
        }

        public Criteria andOtherOtNotEqualTo(Integer value) {
            addCriterion("other_ot <>", value, "otherOt");
            return (Criteria) this;
        }

        public Criteria andOtherOtGreaterThan(Integer value) {
            addCriterion("other_ot >", value, "otherOt");
            return (Criteria) this;
        }

        public Criteria andOtherOtGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_ot >=", value, "otherOt");
            return (Criteria) this;
        }

        public Criteria andOtherOtLessThan(Integer value) {
            addCriterion("other_ot <", value, "otherOt");
            return (Criteria) this;
        }

        public Criteria andOtherOtLessThanOrEqualTo(Integer value) {
            addCriterion("other_ot <=", value, "otherOt");
            return (Criteria) this;
        }

        public Criteria andOtherOtIn(List<Integer> values) {
            addCriterion("other_ot in", values, "otherOt");
            return (Criteria) this;
        }

        public Criteria andOtherOtNotIn(List<Integer> values) {
            addCriterion("other_ot not in", values, "otherOt");
            return (Criteria) this;
        }

        public Criteria andOtherOtBetween(Integer value1, Integer value2) {
            addCriterion("other_ot between", value1, value2, "otherOt");
            return (Criteria) this;
        }

        public Criteria andOtherOtNotBetween(Integer value1, Integer value2) {
            addCriterion("other_ot not between", value1, value2, "otherOt");
            return (Criteria) this;
        }

        public Criteria andEvectionIsNull() {
            addCriterion("evection is null");
            return (Criteria) this;
        }

        public Criteria andEvectionIsNotNull() {
            addCriterion("evection is not null");
            return (Criteria) this;
        }

        public Criteria andEvectionEqualTo(Integer value) {
            addCriterion("evection =", value, "evection");
            return (Criteria) this;
        }

        public Criteria andEvectionNotEqualTo(Integer value) {
            addCriterion("evection <>", value, "evection");
            return (Criteria) this;
        }

        public Criteria andEvectionGreaterThan(Integer value) {
            addCriterion("evection >", value, "evection");
            return (Criteria) this;
        }

        public Criteria andEvectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("evection >=", value, "evection");
            return (Criteria) this;
        }

        public Criteria andEvectionLessThan(Integer value) {
            addCriterion("evection <", value, "evection");
            return (Criteria) this;
        }

        public Criteria andEvectionLessThanOrEqualTo(Integer value) {
            addCriterion("evection <=", value, "evection");
            return (Criteria) this;
        }

        public Criteria andEvectionIn(List<Integer> values) {
            addCriterion("evection in", values, "evection");
            return (Criteria) this;
        }

        public Criteria andEvectionNotIn(List<Integer> values) {
            addCriterion("evection not in", values, "evection");
            return (Criteria) this;
        }

        public Criteria andEvectionBetween(Integer value1, Integer value2) {
            addCriterion("evection between", value1, value2, "evection");
            return (Criteria) this;
        }

        public Criteria andEvectionNotBetween(Integer value1, Integer value2) {
            addCriterion("evection not between", value1, value2, "evection");
            return (Criteria) this;
        }

        public Criteria andOtPayIsNull() {
            addCriterion("ot_pay is null");
            return (Criteria) this;
        }

        public Criteria andOtPayIsNotNull() {
            addCriterion("ot_pay is not null");
            return (Criteria) this;
        }

        public Criteria andOtPayEqualTo(BigDecimal value) {
            addCriterion("ot_pay =", value, "otPay");
            return (Criteria) this;
        }

        public Criteria andOtPayNotEqualTo(BigDecimal value) {
            addCriterion("ot_pay <>", value, "otPay");
            return (Criteria) this;
        }

        public Criteria andOtPayGreaterThan(BigDecimal value) {
            addCriterion("ot_pay >", value, "otPay");
            return (Criteria) this;
        }

        public Criteria andOtPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ot_pay >=", value, "otPay");
            return (Criteria) this;
        }

        public Criteria andOtPayLessThan(BigDecimal value) {
            addCriterion("ot_pay <", value, "otPay");
            return (Criteria) this;
        }

        public Criteria andOtPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ot_pay <=", value, "otPay");
            return (Criteria) this;
        }

        public Criteria andOtPayIn(List<BigDecimal> values) {
            addCriterion("ot_pay in", values, "otPay");
            return (Criteria) this;
        }

        public Criteria andOtPayNotIn(List<BigDecimal> values) {
            addCriterion("ot_pay not in", values, "otPay");
            return (Criteria) this;
        }

        public Criteria andOtPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ot_pay between", value1, value2, "otPay");
            return (Criteria) this;
        }

        public Criteria andOtPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ot_pay not between", value1, value2, "otPay");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
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