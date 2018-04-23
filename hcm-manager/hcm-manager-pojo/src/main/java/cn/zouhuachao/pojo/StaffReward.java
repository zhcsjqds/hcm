package cn.zouhuachao.pojo;

import java.math.BigDecimal;

public class StaffReward {
    private String awardId;

    private String staffId;

    private String awardType;

    private String awardReason;

    private String awardResult;

    private BigDecimal awardAmount;

    private String remark;

    public String getAwardId() {
        return awardId;
    }

    public void setAwardId(String awardId) {
        this.awardId = awardId == null ? null : awardId.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getAwardType() {
        return awardType;
    }

    public void setAwardType(String awardType) {
        this.awardType = awardType == null ? null : awardType.trim();
    }

    public String getAwardReason() {
        return awardReason;
    }

    public void setAwardReason(String awardReason) {
        this.awardReason = awardReason == null ? null : awardReason.trim();
    }

    public String getAwardResult() {
        return awardResult;
    }

    public void setAwardResult(String awardResult) {
        this.awardResult = awardResult == null ? null : awardResult.trim();
    }

    public BigDecimal getAwardAmount() {
        return awardAmount;
    }

    public void setAwardAmount(BigDecimal awardAmount) {
        this.awardAmount = awardAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}