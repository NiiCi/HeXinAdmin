package entity;

import java.math.BigDecimal;

public class UserProfitsDetail {
    private int id;

    private int userId;
    //收益
    private double profits;
    //收益时间
    private long profitDay;
    
    private long createTime;
    //产品类型 1.活期 2.定期
    private int productType;
    //产品名
    private String productName;
    //交易状态 1.成功 0.失败
    private int status;
    //60.活期收益 61.定期收益
    private int type;
    
    private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public double getProfits() {
		return profits;
	}

	public void setProfits(double profits) {
		this.profits = profits;
	}

	public long getProfitDay() {
		return profitDay;
	}

	public void setProfitDay(long profitDay) {
		this.profitDay = profitDay;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public int getProductType() {
		return productType;
	}

	public void setProductType(int productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

    
}