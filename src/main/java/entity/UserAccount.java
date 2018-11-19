package entity;

import java.math.BigDecimal;

public class UserAccount {
    private Integer id;

    private Integer userId;
    //总资产
    private BigDecimal moneyTotal;
    //可用余额
    private Double moneyUsable;
    //永利宝余额
    private BigDecimal yonglibao;
    //投标冻结金额
    private BigDecimal moneyTenderFreeze;
    //待收金额
    private BigDecimal moneyCollection;
    //提现金额
    private BigDecimal moneyWithdraw;
    
    private BigDecimal moneyInsure;
    //累计收益
    private BigDecimal profitsTotal;
    //操作时间	
    private Integer createdAt;
    //更新时间
    private Integer updatedAt;
    //开户行
    private Integer bank;
    //银行卡号
    private String bankCard;
    //乾多多标识号
    private String moneyMoreMoreId;

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

    public BigDecimal getMoneyTotal() {
        return moneyTotal;
    }

    public void setMoneyTotal(BigDecimal moneyTotal) {
        this.moneyTotal = moneyTotal;
    }

    public Double getMoneyUsable() {
        return moneyUsable;
    }

    public void setMoneyUsable(Double moneyUsable) {
        this.moneyUsable = moneyUsable;
    }

    public BigDecimal getYonglibao() {
        return yonglibao;
    }

    public void setYonglibao(BigDecimal yonglibao) {
        this.yonglibao = yonglibao;
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

    public BigDecimal getProfitsTotal() {
        return profitsTotal;
    }

    public void setProfitsTotal(BigDecimal profitsTotal) {
        this.profitsTotal = profitsTotal;
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

    public Integer getBank() {
        return bank;
    }

    public void setBank(Integer bank) {
        this.bank = bank;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    public String getMoneyMoreMoreId() {
        return moneyMoreMoreId;
    }

    public void setMoneyMoreMoreId(String moneyMoreMoreId) {
        this.moneyMoreMoreId = moneyMoreMoreId == null ? null : moneyMoreMoreId.trim();
    }
}