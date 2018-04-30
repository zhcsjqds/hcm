package cn.zouhuachao.pojo;

import java.util.Date;

public class StaffTrain {
    private String trainid;

    private String staffid;

    private String traintype;

    private Date starttime;

    private Date endtime;

    private String traingrade;

    private String remark;

    public String getTrainid() {
        return trainid;
    }

    public void setTrainid(String trainid) {
        this.trainid = trainid == null ? null : trainid.trim();
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
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
}