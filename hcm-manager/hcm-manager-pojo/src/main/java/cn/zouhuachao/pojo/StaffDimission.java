package cn.zouhuachao.pojo;

import java.util.Date;

public class StaffDimission {
    private String dimissionid;

    private String staffid;

    private String staffrealname;

    private String lastdepartment;

    private String lastjob;

    private String applicant;

    private String approver;

    private Date applicantiontime;

    private Date dimissionidtime;

    private String dimissionreason;

    private String status;

    public String getDimissionid() {
        return dimissionid;
    }

    public void setDimissionid(String dimissionid) {
        this.dimissionid = dimissionid == null ? null : dimissionid.trim();
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

    public Date getDimissionidtime() {
        return dimissionidtime;
    }

    public void setDimissionidtime(Date dimissionidtime) {
        this.dimissionidtime = dimissionidtime;
    }

    public String getDimissionreason() {
        return dimissionreason;
    }

    public void setDimissionreason(String dimissionreason) {
        this.dimissionreason = dimissionreason == null ? null : dimissionreason.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}