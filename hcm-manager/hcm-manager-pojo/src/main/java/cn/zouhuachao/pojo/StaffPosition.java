package cn.zouhuachao.pojo;

public class StaffPosition {
    private String positionId;

    private String positionName;

    private String depatementId;

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId == null ? null : positionId.trim();
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public String getDepatementId() {
        return depatementId;
    }

    public void setDepatementId(String depatementId) {
        this.depatementId = depatementId == null ? null : depatementId.trim();
    }
}