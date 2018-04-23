package cn.zouhuachao.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AttendanceStatistics {
    private String statId;

    private String staffId;

    private Date date;

    private Integer hday;

    private Integer sday;

    private Integer oday;

    private Float leave;

    private Integer late;

    private Integer early;

    private Integer holidayOt;

    private Integer otherOt;

    private Integer evection;

    private BigDecimal otPay;

    private String other;

    private String remark;

    public String getStatId() {
        return statId;
    }

    public void setStatId(String statId) {
        this.statId = statId == null ? null : statId.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getHday() {
        return hday;
    }

    public void setHday(Integer hday) {
        this.hday = hday;
    }

    public Integer getSday() {
        return sday;
    }

    public void setSday(Integer sday) {
        this.sday = sday;
    }

    public Integer getOday() {
        return oday;
    }

    public void setOday(Integer oday) {
        this.oday = oday;
    }

    public Float getLeave() {
        return leave;
    }

    public void setLeave(Float leave) {
        this.leave = leave;
    }

    public Integer getLate() {
        return late;
    }

    public void setLate(Integer late) {
        this.late = late;
    }

    public Integer getEarly() {
        return early;
    }

    public void setEarly(Integer early) {
        this.early = early;
    }

    public Integer getHolidayOt() {
        return holidayOt;
    }

    public void setHolidayOt(Integer holidayOt) {
        this.holidayOt = holidayOt;
    }

    public Integer getOtherOt() {
        return otherOt;
    }

    public void setOtherOt(Integer otherOt) {
        this.otherOt = otherOt;
    }

    public Integer getEvection() {
        return evection;
    }

    public void setEvection(Integer evection) {
        this.evection = evection;
    }

    public BigDecimal getOtPay() {
        return otPay;
    }

    public void setOtPay(BigDecimal otPay) {
        this.otPay = otPay;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}