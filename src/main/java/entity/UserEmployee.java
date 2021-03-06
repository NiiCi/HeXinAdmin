package entity;

public class UserEmployee {

	

	//员工id
    private Integer userId;


	private String realName;
    //员工身份号
	private String idCard;
    //员工手机号
	private String mobile;
    //提交时间
	private String submitTime;
    //操作人员
	private String operator;
    //在职状态 1.在职 0.离职
	private Integer status;
    //开户行
	private Integer bank;
    //银行卡号
	private String bankCard;
    //员工类型 1.员工 2.模特
	private Integer type;
    //开户行 省市带啊
	private Integer provinceCityCode;
    //开户行 隶属的省或城市代码
	private Integer parentCode;
    //银行预留手机号
	private String reserveMobile;

	private String bank_name;

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName == null ? null : realName.trim();
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard == null ? null : idCard.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public String getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime == null ? null : submitTime.trim();
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator == null ? null : operator.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getProvinceCityCode() {
		return provinceCityCode;
	}

	public void setProvinceCityCode(Integer provinceCityCode) {
		this.provinceCityCode = provinceCityCode;
	}

	public Integer getParentCode() {
		return parentCode;
	}

	public void setParentCode(Integer parentCode) {
		this.parentCode = parentCode;
	}

	public String getReserveMobile() {
		return reserveMobile;
	}

	public void setReserveMobile(String reserveMobile) {
		this.reserveMobile = reserveMobile == null ? null : reserveMobile.trim();
	}
}