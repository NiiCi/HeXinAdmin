package entity;

import java.math.BigDecimal;

public class UserLaborage {
	
    private Integer id;
    //Ա��id
    private Integer userId;
    //ʵ������
    private BigDecimal laborage;
    //��������
    private String date;
    //����ʱ��
    private String payDate;
    //������Ա
    private String operator;
    //�ʽ���ˮ���� 58.������
    private Integer type;
    //״̬ 1.�ɹ� 2.ʧ��
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getLaborage() {
        return laborage;
    }

    public void setLaborage(BigDecimal laborage) {
        this.laborage = laborage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate == null ? null : payDate.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}