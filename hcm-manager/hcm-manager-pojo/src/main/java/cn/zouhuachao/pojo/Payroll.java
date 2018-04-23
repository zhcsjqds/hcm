package cn.zouhuachao.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Payroll {
    private String payId;

    private String staffId;

    private String paygradeId;

    private BigDecimal allowance;

    private BigDecimal bonus;

    private BigDecimal overtime;

    private BigDecimal attendance;

    private BigDecimal endowmentIns;

    private BigDecimal medicalIns;

    private BigDecimal unemploymentIns;

    private BigDecimal housingFund;

    private BigDecimal incometax;

    private BigDecimal fsalary;

    private Date paytime;

    private String payway;

    private String paystatus;

    private BigDecimal tsalary;

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getPaygradeId() {
        return paygradeId;
    }

    public void setPaygradeId(String paygradeId) {
        this.paygradeId = paygradeId == null ? null : paygradeId.trim();
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

    public BigDecimal getEndowmentIns() {
        return endowmentIns;
    }

    public void setEndowmentIns(BigDecimal endowmentIns) {
        this.endowmentIns = endowmentIns;
    }

    public BigDecimal getMedicalIns() {
        return medicalIns;
    }

    public void setMedicalIns(BigDecimal medicalIns) {
        this.medicalIns = medicalIns;
    }

    public BigDecimal getUnemploymentIns() {
        return unemploymentIns;
    }

    public void setUnemploymentIns(BigDecimal unemploymentIns) {
        this.unemploymentIns = unemploymentIns;
    }

    public BigDecimal getHousingFund() {
        return housingFund;
    }

    public void setHousingFund(BigDecimal housingFund) {
        this.housingFund = housingFund;
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