package entity;

import java.math.BigDecimal;

public class BorrowWishOpDetail {
    private Integer id;
    //��Ʒ����
    private String wishName;
    //��Ʒ����
    private Integer wishType;
    //������
    private BigDecimal wishApr;
    //��Ʒ����
    private Integer wishTime;
    //��Ʒ��ģ
    private Integer wishAlreadyMoney;
    //�������� 1.������Ʒ2.�����깺3.��ͣ�깺4.��������
    private Integer opType;
    //����ʱ��
    private Integer opTime;
    //������Ա
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