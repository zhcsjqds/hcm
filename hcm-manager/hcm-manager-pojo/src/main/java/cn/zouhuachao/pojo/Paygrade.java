package cn.zouhuachao.pojo;

import java.math.BigDecimal;

public class Paygrade {
    private String paygradeid;

    private String paygradeno;

    private String headship;

    private BigDecimal headshippay;

    private String title;

    private BigDecimal titlewage;

    private BigDecimal allowance;

    private String paygradedescribe;

    public String getPaygradeid() {
        return paygradeid;
    }

    public void setPaygradeid(String paygradeid) {
        this.paygradeid = paygradeid == null ? null : paygradeid.trim();
    }

    public String getPaygradeno() {
        return paygradeno;
    }

    public void setPaygradeno(String paygradeno) {
        this.paygradeno = paygradeno == null ? null : paygradeno.trim();
    }

    public String getHeadship() {
        return headship;
    }

    public void setHeadship(String headship) {
        this.headship = headship == null ? null : headship.trim();
    }

    public BigDecimal getHeadshippay() {
        return headshippay;
    }

    public void setHeadshippay(BigDecimal headshippay) {
        this.headshippay = headshippay;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public BigDecimal getTitlewage() {
        return titlewage;
    }

    public void setTitlewage(BigDecimal titlewage) {
        this.titlewage = titlewage;
    }

    public BigDecimal getAllowance() {
        return allowance;
    }

    public void setAllowance(BigDecimal allowance) {
        this.allowance = allowance;
    }

    public String getPaygradedescribe() {
        return paygradedescribe;
    }

    public void setPaygradedescribe(String paygradedescribe) {
        this.paygradedescribe = paygradedescribe == null ? null : paygradedescribe.trim();
    }
}