package cn.zouhuachao.pojo;

import java.util.Date;

public class StaffTransfer {
    private String transId;

    private String staffId;

    private String lastDepartment;

    private String lastJob;

    private String transReason;

    private Date transTime;

    private String newDepartment;

    private String newJob;

    private String applicant;

    private String approver;

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getLastDepartment() {
        return lastDepartment;
    }

    public void setLastDepartment(String lastDepartment) {
        this.lastDepartment = lastDepartment == null ? null : lastDepartment.trim();
    }

    public String getLastJob() {
        return lastJob;
    }

    public void setLastJob(String lastJob) {
        this.lastJob = lastJob == null ? null : lastJob.trim();
    }

    public String getTransReason() {
        return transReason;
    }

    public void setTransReason(String transReason) {
        this.transReason = transReason == null ? null : transReason.trim();
    }

    public Date getTransTime() {
        return transTime;
    }

    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    public String getNewDepartment() {
        return newDepartment;
    }

    public void setNewDepartment(String newDepartment) {
        this.newDepartment = newDepartment == null ? null : newDepartment.trim();
    }

    public String getNewJob() {
        return newJob;
    }

    public void setNewJob(String newJob) {
        this.newJob = newJob == null ? null : newJob.trim();
    }

    public String getApplicant() {
        return applicant;
    }

    public void setApplicant(String applicant) {
        this.applicant = applicant == null ? null : applicant.trim();
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver == null ? null : approver.trim();
    }
}