package cn.zouhuachao.common.pojo;

import java.util.Date;

/**
 * 离职记录
 * @author Chao
 *
 */
public class EasyUIDataGridDimission {
	private String staffid;
	private String staffno;
	private String staffrealname;
	private String position;
	private String department;
	private String dimissionreason;
	private Date dimissionidtime;
	private String applicant;
	private String approver;
	public String getStaffid() {
		return staffid;
	}
	public void setStaffid(String staffid) {
		this.staffid = staffid;
	}
	public String getStaffno() {
		return staffno;
	}
	public void setStaffno(String staffno) {
		this.staffno = staffno;
	}
	public String getStaffrealname() {
		return staffrealname;
	}
	public void setStaffrealname(String staffrealname) {
		this.staffrealname = staffrealname;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDimissionreason() {
		return dimissionreason;
	}
	public void setDimissionreason(String dimissionreason) {
		this.dimissionreason = dimissionreason;
	}
	public Date getDimissionidtime() {
		return dimissionidtime;
	}
	public void setDimissionidtime(Date dimissionidtime) {
		this.dimissionidtime = dimissionidtime;
	}
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public String getApprover() {
		return approver;
	}
	public void setApprover(String approver) {
		this.approver = approver;
	}
}
