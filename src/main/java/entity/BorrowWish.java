package entity;



public class BorrowWish {
    private Integer id;
    //ļ����ģ
    private double wishMoney;
    //������
    private double wishApr;
    //��Ʒ����
    private Integer wishTime;
    //�����;
    private String wishUse;
    //���ʽ
    private String wishRepayStyle;
    //��ϵ��ʽ
    private String userPhone;
    //�ڶ���ϵ��ʽ
    private String userPhone2;
    //��һ����
    private String userSecurity;
    //�ڶ�����
    private String userSecurity2;
    //��ס��ַ
    private String userHomeAddress;
    //�û�ID
    private Integer userId;
    //�û���
    private String username;
    //����ʱ��
    private Integer createTime;
    //״̬ 
    private Integer status;
    //��ʵ����
    private String realname;
    //��Ʒ����
    private String wishName;
    //�ں�
    private String wishIssue;
    //��Ʒ���� ����/����
    private Integer wishType;
    //��Ʒļ��ʱ��
    private Integer wishRaiseTime;
    //����ʱ�� ---- ��ʼļ���ʽ�
    private Integer foundingTime;
    //��ļ���ʽ� ---- ��Ʒ��ģ
    private double wishAlreadyMoney;
    //ļ��״̬ 1.�����깺2.��ͣ�깺3.�ѳ���4.ļ����5.ļ�����6.������
    private Integer wishStatus;
    //���߽��
    private double investmentAmount;
    //���� ���ڣ���������/���ڣ��ۼ�����
    private double profit;
    //ļ������ʱ��
    private Integer raiseEndTime;
    //����ʱ��----��ʼӯ��
    private Integer startDate;
    //����ʱ��----Ͷ�ʻ���
    private Integer endDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getWishMoney() {
        return wishMoney;
    }

    public void setWishMoney(double wishMoney) {
        this.wishMoney = wishMoney;
    }

    public double getWishApr() {
        return wishApr;
    }

    public void setWishApr(double wishApr) {
        this.wishApr = wishApr;
    }

    public Integer getWishTime() {
        return wishTime;
    }

    public void setWishTime(Integer wishTime) {
        this.wishTime = wishTime;
    }

    public String getWishUse() {
        return wishUse;
    }

    public void setWishUse(String wishUse) {
        this.wishUse = wishUse == null ? null : wishUse.trim();
    }

    public String getWishRepayStyle() {
        return wishRepayStyle;
    }

    public void setWishRepayStyle(String wishRepayStyle) {
        this.wishRepayStyle = wishRepayStyle == null ? null : wishRepayStyle.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserPhone2() {
        return userPhone2;
    }

    public void setUserPhone2(String userPhone2) {
        this.userPhone2 = userPhone2 == null ? null : userPhone2.trim();
    }

    public String getUserSecurity() {
        return userSecurity;
    }

    public void setUserSecurity(String userSecurity) {
        this.userSecurity = userSecurity == null ? null : userSecurity.trim();
    }

    public String getUserSecurity2() {
        return userSecurity2;
    }

    public void setUserSecurity2(String userSecurity2) {
        this.userSecurity2 = userSecurity2 == null ? null : userSecurity2.trim();
    }

    public String getUserHomeAddress() {
        return userHomeAddress;
    }

    public void setUserHomeAddress(String userHomeAddress) {
        this.userHomeAddress = userHomeAddress == null ? null : userHomeAddress.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getWishName() {
        return wishName;
    }

    public void setWishName(String wishName) {
        this.wishName = wishName == null ? null : wishName.trim();
    }

    public String getWishIssue() {
        return wishIssue;
    }

    public void setWishIssue(String wishIssue) {
        this.wishIssue = wishIssue == null ? null : wishIssue.trim();
    }

    public Integer getWishType() {
        return wishType;
    }

    public void setWishType(Integer wishType) {
        this.wishType = wishType;
    }

    public Integer getWishRaiseTime() {
        return wishRaiseTime;
    }

    public void setWishRaiseTime(Integer wishRaiseTime) {
        this.wishRaiseTime = wishRaiseTime;
    }

    public Integer getFoundingTime() {
        return foundingTime;
    }

    public void setFoundingTime(Integer foundingTime) {
        this.foundingTime = foundingTime;
    }

    public double getWishAlreadyMoney() {
        return wishAlreadyMoney;
    }

    public void setWishAlreadyMoney(double wishAlreadyMoney) {
        this.wishAlreadyMoney = wishAlreadyMoney;
    }

    public Integer getWishStatus() {
        return wishStatus;
    }

    public void setWishStatus(Integer wishStatus) {
        this.wishStatus = wishStatus;
    }

    public double getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(double investmentAmount) {
        this.investmentAmount = investmentAmount;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public Integer getRaiseEndTime() {
        return raiseEndTime;
    }

    public void setRaiseEndTime(Integer raiseEndTime) {
        this.raiseEndTime = raiseEndTime;
    }

    public Integer getStartDate() {
        return startDate;
    }

    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    public Integer getEndDate() {
        return endDate;
    }

    public void setEndDate(Integer endDate) {
        this.endDate = endDate;
    }
    
    
}