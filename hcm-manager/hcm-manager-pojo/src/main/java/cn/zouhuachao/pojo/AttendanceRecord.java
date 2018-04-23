package cn.zouhuachao.pojo;

import java.util.Date;

public class AttendanceRecord {
    private String attenId;

    private String staffId;

    private Date attenTime;

    public String getAttenId() {
        return attenId;
    }

    public void setAttenId(String attenId) {
        this.attenId = attenId == null ? null : attenId.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public Date getAttenTime() {
        return attenTime;
    }

    public void setAttenTime(Date attenTime) {
        this.attenTime = attenTime;
    }
}