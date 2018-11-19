package entity;

import java.math.BigDecimal;

public class UserAccountLog {
    private Integer id;
    //����id
    private Integer idRelated;
    //�û�id
    private Integer userId;
    //�������� 31.�깺 57.���
    private Byte type;
    //�������
    private double moneyOperate;
    //�ܽ��
    private BigDecimal moneyTotal;
    //�������
    private BigDecimal moneyUsable;
    //Ͷ�궳����
    private BigDecimal moneyTenderFreeze;
    //ļ�����
    private BigDecimal moneyCollection;
    //��ע
    private String remark;
    //���(����)
    private BigDecimal moneyWithdraw;
    
    private BigDecimal moneyInsure;
    //����ʱ��
    private Integer createdAt;
    //����ip��ַ
    private String createdIp;
    //��Ʒid
    private Integer wishId;
    //״̬ 1.�ɹ� 0.ʧ��
    private Byte status;
    
    private User user;
    
    private String wish_name;
    
    public String getWish_name() {
		return wish_name;
	}

	public void setWish_name(String wish_name) {
		this.wish_name = wish_name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdRelated() {
        return idRelated;
    }

    public void setIdRelated(Integer idRelated) {
        this.idRelated = idRelated;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public double getMoneyOperate() {
        return moneyOperate;
    }

    public void setMoneyOperate(double moneyOperate) {
        this.moneyOperate = moneyOperate;
    }

    public BigDecimal getMoneyTotal() {
        return moneyTotal;
    }

    public void setMoneyTotal(BigDecimal moneyTotal) {
        this.moneyTotal = moneyTotal;
    }

    public BigDecimal getMoneyUsable() {
        return moneyUsable;
    }

    public void setMoneyUsable(BigDecimal moneyUsable) {
        this.moneyUsable = moneyUsable;
    }

    public BigDecimal getMoneyTenderFreeze() {
        return moneyTenderFreeze;
    }

    public void setMoneyTenderFreeze(BigDecimal moneyTenderFreeze) {
        this.moneyTenderFreeze = moneyTenderFreeze;
    }

    public BigDecimal getMoneyCollection() {
        return moneyCollection;
    }

    public void setMoneyCollection(BigDecimal moneyCollection) {
        this.moneyCollection = moneyCollection;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getMoneyWithdraw() {
        return moneyWithdraw;
    }

    public void setMoneyWithdraw(BigDecimal moneyWithdraw) {
        this.moneyWithdraw = moneyWithdraw;
    }

    public BigDecimal getMoneyInsure() {
        return moneyInsure;
    }

    public void setMoneyInsure(BigDecimal moneyInsure) {
        this.moneyInsure = moneyInsure;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedIp() {
        return createdIp;
    }

    public void setCreatedIp(String createdIp) {
        this.createdIp = createdIp == null ? null : createdIp.trim();
    }

    public Integer getWishId() {
        return wishId;
    }

    public void setWishId(Integer wishId) {
        this.wishId = wishId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}