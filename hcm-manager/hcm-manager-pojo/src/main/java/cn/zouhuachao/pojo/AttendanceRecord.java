package cn.zouhuachao.pojo;

import java.util.Date;

public class AttendanceRecord {
    private String attenid;

    private String staffid;

    private Date attentime;

    public String getAttenid() {
        return attenid;
    }

    public void setAttenid(String attenid) {
        this.attenid = attenid == null ? null : attenid.trim();
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }

    public Date getAttentime() {
        return attentime;
    }

    public void setAttentime(Date attentime) {
        this.attentime = attentime;
    }
}