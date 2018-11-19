package entity;

import java.math.BigDecimal;

public class BorrowWishOpDetail {
    private Integer id;
    //产品名称
    private String wishName;
    //产品类型
    private Integer wishType;
    //年利率
    private BigDecimal wishApr;
    //产品期限
    private Integer wishTime;
    //产品规模
    private Integer wishAlreadyMoney;
    //操作类型 1.发布产品2.开放申购3.暂停申购4.调整利率
    private Integer opType;
    //操作时间
    private Integer opTime;
    //操作人员
    private String opAdmin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWishName() {
        return wishName;
    }

    public void setWishName(String wishName) {
        this.wishName = wishName == null ? null : wishName.trim();
    }

    public Integer getWishType() {
        return wishType;
    }

    public void setWishType(Integer wishType) {
        this.wishType = wishType;
    }

    public BigDecimal getWishApr() {
        return wishApr;
    }

    public void setWishApr(BigDecimal wishApr) {
        this.wishApr = wishApr;
    }

    public Integer getWishTime() {
        return wishTime;
    }

    public void setWishTime(Integer wishTime) {
        this.wishTime = wishTime;
    }

    public Integer getWishAlreadyMoney() {
        return wishAlreadyMoney;
    }

    public void setWishAlreadyMoney(Integer wishAlreadyMoney) {
        this.wishAlreadyMoney = wishAlreadyMoney;
    }

    public Integer getOpType() {
        return opType;
    }

    public void setOpType(Integer opType) {
        this.opType = opType;
    }

    public Integer getOpTime() {
        return opTime;
    }

    public void setOpTime(Integer opTime) {
        this.opTime = opTime;
    }

    public String getOpAdmin() {
        return opAdmin;
    }

    public void setOpAdmin(String opAdmin) {
        this.opAdmin = opAdmin == null ? null : opAdmin.trim();
    }
}