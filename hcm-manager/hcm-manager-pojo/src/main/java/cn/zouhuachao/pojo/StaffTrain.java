package cn.zouhuachao.pojo;

import java.util.Date;

public class StaffTrain {
    private String trainid;

    private String staffno;

    private String realname;

    private String trainname;

    private String traintype;

    private Date starttime;

    private Date endtime;

    private String traingrade;

    private String remark;

    private String trainstatus;

    public String getTrainid() {
        return trainid;
    }

    public void setTrainid(String trainid) {
        this.trainid = trainid == null ? null : trainid.trim();
    }

    public String getStaffno() {
        return staffno;
    }

    public void setStaffno(String staffno) {
        this.staffno = staffno == null ? null : staffno.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname == null ? null : trainname.trim();
    }

    public String getTraintype() {
        return traintype;
    }

    public void setTraintype(String traintype) {
        this.traintype = traintype == null ? null : traintype.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getTraingrade() {
        return traingrade;
    }

    public void setTraingrade(String traingrade) {
        this.traingrade = traingrade == null ? null : traingrade.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTrainstatus() {
        return trainstatus;
    }

    public void setTrainstatus(String trainstatus) {
        this.trainstatus = trainstatus == null ? null : trainstatus.trim();
    }
}