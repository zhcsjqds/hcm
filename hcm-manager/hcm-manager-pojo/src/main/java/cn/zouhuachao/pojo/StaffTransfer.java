package cn.zouhuachao.pojo;

import java.util.Date;

public class StaffTransfer {
    private String transid;

    private String staffid;

    private String staffrealname;

    private String lastdepartment;

    private String lastjob;

    private String newdepartment;

    private String newjob;

    private String applicant;

    private String approver;

    private Date applicantiontime;

    private Date transtime;

    private String transreason;

    private String transtatus;

    public String getTransid() {
        return transid;
    }

    public void setTransid(String transid) {
        this.transid = transid == null ? null : transid.trim();
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }

    public String getStaffrealname() {
        return staffrealname;
    }

    public void setStaffrealname(String staffrealname) {
        this.staffrealname = staffrealname == null ? null : staffrealname.trim();
    }

    public String getLastdepartment() {
        return lastdepartment;
    }

    public void setLastdepartment(String lastdepartment) {
        this.lastdepartment = lastdepartment == null ? null : lastdepartment.trim();
    }

    public String getLastjob() {
        return lastjob;
    }

    public void setLastjob(String lastjob) {
        this.lastjob = lastjob == null ? null : lastjob.trim();
    }

    public String getNewdepartment() {
        return newdepartment;
    }

    public void setNewdepartment(String newdepartment) {
        this.newdepartment = newdepartment == null ? null : newdepartment.trim();
    }

    public String getNewjob() {
        return newjob;
    }

    public void setNewjob(String newjob) {
        this.newjob = newjob == null ? null : newjob.trim();
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

    public Date getApplicantiontime() {
        return applicantiontime;
    }

    public void setApplicantiontime(Date applicantiontime) {
        this.applicantiontime = applicantiontime;
    }

    public Date getTranstime() {
        return transtime;
    }

    public void setTranstime(Date transtime) {
        this.transtime = transtime;
    }

    public String getTransreason() {
        return transreason;
    }

    public void setTransreason(String transreason) {
        this.transreason = transreason == null ? null : transreason.trim();
    }

    public String getTranstatus() {
        return transtatus;
    }

    public void setTranstatus(String transtatus) {
        this.transtatus = transtatus == null ? null : transtatus.trim();
    }
}