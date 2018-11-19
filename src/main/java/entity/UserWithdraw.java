package entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserWithdraw implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
    //更新人员
    private Integer updatedBy;
    //状态 1.成功 0.失败
    private Byte status;
    //订单id
    private String tradeOrder;
    //提现金额
    private Double moneyWithdraw;
    //备注
    private String remark;
    //第三方备注
    private String trustRemark;
    //第三方调用状态
    private Integer trustStatus;
    //用户id
    private Integer createdBy;
    //创建时间
    private Integer createdAt;
    //审核时间
    private Integer updatedAt;
    //创建ip
    private String createdIp;
    //手续费
    private Double charge;
    //提现人用户名(手机号)
    private String createdByPhone;
    //提现人姓名
    private String createdByName;
    //身份证
    private String createdByIdcard;
    //提现状态 5.成功 6.失败
    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getTradeOrder() {
        return tradeOrder;
    }

    public void setTradeOrder(String tradeOrder) {
        this.tradeOrder = tradeOrder == null ? null : tradeOrder.trim();
    }

    public Double getMoneyWithdraw() {
        return moneyWithdraw;
    }

    public void setMoneyWithdraw(Double moneyWithdraw) {
        this.moneyWithdraw = moneyWithdraw;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTrustRemark() {
        return trustRemark;
    }

    public void setTrustRemark(String trustRemark) {
        this.trustRemark = trustRemark == null ? null : trustRemark.trim();
    }

    public Integer getTrustStatus() {
        return trustStatus;
    }

    public void setTrustStatus(Integer trustStatus) {
        this.trustStatus = trustStatus;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedIp() {
        return createdIp;
    }

    public void setCreatedIp(String createdIp) {
        this.createdIp = createdIp == null ? null : createdIp.trim();
    }

    public Double getCharge() {
        return charge;
    }

    public void setCharge(Double charge) {
        this.charge = charge;
    }

    public String getCreatedByPhone() {
        return createdByPhone;
    }

    public void setCreatedByPhone(String createdByPhone) {
        this.createdByPhone = createdByPhone == null ? null : createdByPhone.trim();
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName == null ? null : createdByName.trim();
    }

    public String getCreatedByIdcard() {
        return createdByIdcard;
    }

    public void setCreatedByIdcard(String createdByIdcard) {
        this.createdByIdcard = createdByIdcard == null ? null : createdByIdcard.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}