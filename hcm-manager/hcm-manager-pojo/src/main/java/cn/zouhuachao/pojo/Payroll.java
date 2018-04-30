package cn.zouhuachao.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Payroll {
    private String payid;

    private String staffid;

    private String paygradeid;

    private BigDecimal allowance;

    private BigDecimal bonus;

    private BigDecimal overtime;

    private BigDecimal attendance;

    private BigDecimal endowmentins;

    private BigDecimal medicalins;

    private BigDecimal unemploymentins;

    private BigDecimal housingfund;

    private BigDecimal incometax;

    private BigDecimal fsalary;

    private Date paytime;

    private String payway;

    private String paystatus;

    private BigDecimal tsalary;

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid == null ? null : payid.trim();
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }

    public String getPaygradeid() {
        return paygradeid;
    }

    public void setPaygradeid(String paygradeid) {
        this.paygradeid = paygradeid == null ? null : paygradeid.trim();
    }

    public BigDecimal getAllowance() {
        return allowance;
    }

    public void setAllowance(BigDecimal allowance) {
        this.allowance = allowance;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getOvertime() {
        return overtime;
    }

    public void setOvertime(BigDecimal overtime) {
        this.overtime = overtime;
    }

    public BigDecimal getAttendance() {
        return attendance;
    }

    public void setAttendance(BigDecimal attendance) {
        this.attendance = attendance;
    }

    public BigDecimal getEndowmentins() {
        return endowmentins;
    }

    public void setEndowmentins(BigDecimal endowmentins) {
        this.endowmentins = endowmentins;
    }

    public BigDecimal getMedicalins() {
        return medicalins;
    }

    public void setMedicalins(BigDecimal medicalins) {
        this.medicalins = medicalins;
    }

    public BigDecimal getUnemploymentins() {
        return unemploymentins;
    }

    public void setUnemploymentins(BigDecimal unemploymentins) {
        this.unemploymentins = unemploymentins;
    }

    public BigDecimal getHousingfund() {
        return housingfund;
    }

    public void setHousingfund(BigDecimal housingfund) {
        this.housingfund = housingfund;
    }

    public BigDecimal getIncometax() {
        return incometax;
    }

    public void setIncometax(BigDecimal incometax) {
        this.incometax = incometax;
    }

    public BigDecimal getFsalary() {
        return fsalary;
    }

    public void setFsalary(BigDecimal fsalary) {
        this.fsalary = fsalary;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public String getPayway() {
        return payway;
    }

    public void setPayway(String payway) {
        this.payway = payway == null ? null : payway.trim();
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus == null ? null : paystatus.trim();
    }

    public BigDecimal getTsalary() {
        return tsalary;
    }

    public void setTsalary(BigDecimal tsalary) {
        this.tsalary = tsalary;
    }
}