package cn.zouhuachao.pojo;

import java.math.BigDecimal;

public class InsRate {
    private Integer id;

    private Float endowmentins;

    private Float unemploymentins;

    private Float medicalins;

    private Float housingfund;

    private Integer maxworkage;

    private BigDecimal everyworkage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getEndowmentins() {
        return endowmentins;
    }

    public void setEndowmentins(Float endowmentins) {
        this.endowmentins = endowmentins;
    }

    public Float getUnemploymentins() {
        return unemploymentins;
    }

    public void setUnemploymentins(Float unemploymentins) {
        this.unemploymentins = unemploymentins;
    }

    public Float getMedicalins() {
        return medicalins;
    }

    public void setMedicalins(Float medicalins) {
        this.medicalins = medicalins;
    }

    public Float getHousingfund() {
        return housingfund;
    }

    public void setHousingfund(Float housingfund) {
        this.housingfund = housingfund;
    }

    public Integer getMaxworkage() {
        return maxworkage;
    }

    public void setMaxworkage(Integer maxworkage) {
        this.maxworkage = maxworkage;
    }

    public BigDecimal getEveryworkage() {
        return everyworkage;
    }

    public void setEveryworkage(BigDecimal everyworkage) {
        this.everyworkage = everyworkage;
    }
}