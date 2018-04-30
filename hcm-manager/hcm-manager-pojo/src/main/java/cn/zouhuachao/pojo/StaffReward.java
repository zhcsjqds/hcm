package cn.zouhuachao.pojo;

import java.math.BigDecimal;

public class StaffReward {
    private String awardid;

    private String staffid;

    private String awardtype;

    private String awardreason;

    private String awardresult;

    private BigDecimal awardamount;

    private String remark;

    public String getAwardid() {
        return awardid;
    }

    public void setAwardid(String awardid) {
        this.awardid = awardid == null ? null : awardid.trim();
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }

    public String getAwardtype() {
        return awardtype;
    }

    public void setAwardtype(String awardtype) {
        this.awardtype = awardtype == null ? null : awardtype.trim();
    }

    public String getAwardreason() {
        return awardreason;
    }

    public void setAwardreason(String awardreason) {
        this.awardreason = awardreason == null ? null : awardreason.trim();
    }

    public String getAwardresult() {
        return awardresult;
    }

    public void setAwardresult(String awardresult) {
        this.awardresult = awardresult == null ? null : awardresult.trim();
    }

    public BigDecimal getAwardamount() {
        return awardamount;
    }

    public void setAwardamount(BigDecimal awardamount) {
        this.awardamount = awardamount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}