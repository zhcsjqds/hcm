package cn.zouhuachao.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AttendanceStatistics {
    private String statid;

    private String staffid;

    private Date date;

    private Integer hday;

    private Integer sday;

    private Integer oday;

    private Float leave;

    private Integer late;

    private Integer early;

    private Integer holidayot;

    private Integer otherot;

    private Integer evection;

    private BigDecimal otpay;

    private String other;

    private String remark;

    public String getStatid() {
        return statid;
    }

    public void setStatid(String statid) {
        this.statid = statid == null ? null : statid.trim();
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
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

    public Integer getHolidayot() {
        return holidayot;
    }

    public void setHolidayot(Integer holidayot) {
        this.holidayot = holidayot;
    }

    public Integer getOtherot() {
        return otherot;
    }

    public void setOtherot(Integer otherot) {
        this.otherot = otherot;
    }

    public Integer getEvection() {
        return evection;
    }

    public void setEvection(Integer evection) {
        this.evection = evection;
    }

    public BigDecimal getOtpay() {
        return otpay;
    }

    public void setOtpay(BigDecimal otpay) {
        this.otpay = otpay;
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