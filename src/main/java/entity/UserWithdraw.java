package entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserWithdraw implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
    //������Ա
    private Integer updatedBy;
    //״̬ 1.�ɹ� 0.ʧ��
    private Byte status;
    //����id
    private String tradeOrder;
    //���ֽ��
    private Double moneyWithdraw;
    //��ע
    private String remark;
    //��������ע
    private String trustRemark;
    //����������״̬
    private Integer trustStatus;
    //�û�id
    private Integer createdBy;
    //����ʱ��
    private Integer createdAt;
    //���ʱ��
    private Integer updatedAt;
    //����ip
    private String createdIp;
    //������
    private Double charge;
    //�������û���(�ֻ���)
    private String createdByPhone;
    //����������
    private String createdByName;
    //���֤
    private String createdByIdcard;
    //����״̬ 5.�ɹ� 6.ʧ��
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