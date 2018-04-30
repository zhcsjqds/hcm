package cn.zouhuachao.pojo;

import java.util.Date;

public class StaffEvaluation {
    private String evaid;

    private String staffid;

    private Date evatime;

    private String performance;

    private String attitude;

    private String standard;

    private String remark;

    public String getEvaid() {
        return evaid;
    }

    public void setEvaid(String evaid) {
        this.evaid = evaid == null ? null : evaid.trim();
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid == null ? null : staffid.trim();
    }

    public Date getEvatime() {
        return evatime;
    }

    public void setEvatime(Date evatime) {
        this.evatime = evatime;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance == null ? null : performance.trim();
    }

    public String getAttitude() {
        return attitude;
    }

    public void setAttitude(String attitude) {
        this.attitude = attitude == null ? null : attitude.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}