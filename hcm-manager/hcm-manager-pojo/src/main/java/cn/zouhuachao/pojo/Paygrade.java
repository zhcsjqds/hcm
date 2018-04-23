package cn.zouhuachao.pojo;

import java.math.BigDecimal;

public class Paygrade {
    private String paygradeId;

    private String paygradeNo;

    private String headship;

    private BigDecimal headshipPay;

    private String title;

    private BigDecimal titleWage;

    private BigDecimal allowance;

    private String paygradeDescribe;

    public String getPaygradeId() {
        return paygradeId;
    }

    public void setPaygradeId(String paygradeId) {
        this.paygradeId = paygradeId == null ? null : paygradeId.trim();
    }

    public String getPaygradeNo() {
        return paygradeNo;
    }

    public void setPaygradeNo(String paygradeNo) {
        this.paygradeNo = paygradeNo == null ? null : paygradeNo.trim();
    }

    public String getHeadship() {
        return headship;
    }

    public void setHeadship(String headship) {
        this.headship = headship == null ? null : headship.trim();
    }

    public BigDecimal getHeadshipPay() {
        return headshipPay;
    }

    public void setHeadshipPay(BigDecimal headshipPay) {
        this.headshipPay = headshipPay;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public BigDecimal getTitleWage() {
        return titleWage;
    }

    public void setTitleWage(BigDecimal titleWage) {
        this.titleWage = titleWage;
    }

    public BigDecimal getAllowance() {
        return allowance;
    }

    public void setAllowance(BigDecimal allowance) {
        this.allowance = allowance;
    }

    public String getPaygradeDescribe() {
        return paygradeDescribe;
    }

    public void setPaygradeDescribe(String paygradeDescribe) {
        this.paygradeDescribe = paygradeDescribe == null ? null : paygradeDescribe.trim();
    }
}