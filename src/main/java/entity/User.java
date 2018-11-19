package entity;

import java.math.BigDecimal;

public class User {
    private Integer id;
    //用户账号密码
    private String paymentaccountnumber;
    //用户类型 11.普通12.企业20.支付账户30.体验标账户
    private Byte userType;
    
    private Integer userTypeNew;
    //用户名
    private String username;
    //手机号
    private String mobile;
    //登录密码
    private String passwordHash;
    //支付密码
    private String passwordPayHash;
    //重置密码
    private String passwordResetToken;
    //实名认证状态 0.未认证 15待认证 20 审核中 30.已成功 40.撤回认证
    private Byte realVerifyStatus;
    
    private String realname;

    private String idCard;

    private String organization;

    private Integer signstatus;

    private Byte cardBindingStatus;

    private Byte emailBindingStatus;

    private Byte mobileBindingStatus;

    private String authKey;

    private Byte role;

    private Byte status;

    private String email;

    private Byte sex;

    private String litpic;

    private String birthday;

    private Integer cardIdBase;

    private Integer createdAt;

    private Integer lastLogintime;

    private Integer updatedAt;

    private String createdIp;

    private String inviteUserid;

    private Integer realVerifyTime;

    private Integer storeStatus;

    private Integer storeId;

    private Integer refreeStatus;

    private Integer refreeId;

    private String accesstoken;

    private String appsource;

    private BigDecimal experienceCashUsable;

    private BigDecimal experienceCashUsed;

    private String trustTrxid;

    private String trustUsrCustid;

    private String auditStat;

    private String auditDesc;

    private Integer effectTime;

    private String stamppath;

    private String recommender;

    private Integer approvedAt;

    private Integer approvedstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaymentaccountnumber() {
        return paymentaccountnumber;
    }

    public void setPaymentaccountnumber(String paymentaccountnumber) {
        this.paymentaccountnumber = paymentaccountnumber == null ? null : paymentaccountnumber.trim();
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Integer getUserTypeNew() {
        return userTypeNew;
    }

    public void setUserTypeNew(Integer userTypeNew) {
        this.userTypeNew = userTypeNew;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash == null ? null : passwordHash.trim();
    }

    public String getPasswordPayHash() {
        return passwordPayHash;
    }

    public void setPasswordPayHash(String passwordPayHash) {
        this.passwordPayHash = passwordPayHash == null ? null : passwordPayHash.trim();
    }

    public String getPasswordResetToken() {
        return passwordResetToken;
    }

    public void setPasswordResetToken(String passwordResetToken) {
        this.passwordResetToken = passwordResetToken == null ? null : passwordResetToken.trim();
    }

    public Byte getRealVerifyStatus() {
        return realVerifyStatus;
    }

    public void setRealVerifyStatus(Byte realVerifyStatus) {
        this.realVerifyStatus = realVerifyStatus;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public Integer getSignstatus() {
        return signstatus;
    }

    public void setSignstatus(Integer signstatus) {
        this.signstatus = signstatus;
    }

    public Byte getCardBindingStatus() {
        return cardBindingStatus;
    }

    public void setCardBindingStatus(Byte cardBindingStatus) {
        this.cardBindingStatus = cardBindingStatus;
    }

    public Byte getEmailBindingStatus() {
        return emailBindingStatus;
    }

    public void setEmailBindingStatus(Byte emailBindingStatus) {
        this.emailBindingStatus = emailBindingStatus;
    }

    public Byte getMobileBindingStatus() {
        return mobileBindingStatus;
    }

    public void setMobileBindingStatus(Byte mobileBindingStatus) {
        this.mobileBindingStatus = mobileBindingStatus;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey == null ? null : authKey.trim();
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getLitpic() {
        return litpic;
    }

    public void setLitpic(String litpic) {
        this.litpic = litpic == null ? null : litpic.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public Integer getCardIdBase() {
        return cardIdBase;
    }

    public void setCardIdBase(Integer cardIdBase) {
        this.cardIdBase = cardIdBase;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getLastLogintime() {
        return lastLogintime;
    }

    public void setLastLogintime(Integer lastLogintime) {
        this.lastLogintime = lastLogintime;
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

    public String getInviteUserid() {
        return inviteUserid;
    }

    public void setInviteUserid(String inviteUserid) {
        this.inviteUserid = inviteUserid == null ? null : inviteUserid.trim();
    }

    public Integer getRealVerifyTime() {
        return realVerifyTime;
    }

    public void setRealVerifyTime(Integer realVerifyTime) {
        this.realVerifyTime = realVerifyTime;
    }

    public Integer getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(Integer storeStatus) {
        this.storeStatus = storeStatus;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getRefreeStatus() {
        return refreeStatus;
    }

    public void setRefreeStatus(Integer refreeStatus) {
        this.refreeStatus = refreeStatus;
    }

    public Integer getRefreeId() {
        return refreeId;
    }

    public void setRefreeId(Integer refreeId) {
        this.refreeId = refreeId;
    }

    public String getAccesstoken() {
        return accesstoken;
    }

    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken == null ? null : accesstoken.trim();
    }

    public String getAppsource() {
        return appsource;
    }

    public void setAppsource(String appsource) {
        this.appsource = appsource == null ? null : appsource.trim();
    }

    public BigDecimal getExperienceCashUsable() {
        return experienceCashUsable;
    }

    public void setExperienceCashUsable(BigDecimal experienceCashUsable) {
        this.experienceCashUsable = experienceCashUsable;
    }

    public BigDecimal getExperienceCashUsed() {
        return experienceCashUsed;
    }

    public void setExperienceCashUsed(BigDecimal experienceCashUsed) {
        this.experienceCashUsed = experienceCashUsed;
    }

    public String getTrustTrxid() {
        return trustTrxid;
    }

    public void setTrustTrxid(String trustTrxid) {
        this.trustTrxid = trustTrxid == null ? null : trustTrxid.trim();
    }

    public String getTrustUsrCustid() {
        return trustUsrCustid;
    }

    public void setTrustUsrCustid(String trustUsrCustid) {
        this.trustUsrCustid = trustUsrCustid == null ? null : trustUsrCustid.trim();
    }

    public String getAuditStat() {
        return auditStat;
    }

    public void setAuditStat(String auditStat) {
        this.auditStat = auditStat == null ? null : auditStat.trim();
    }

    public String getAuditDesc() {
        return auditDesc;
    }

    public void setAuditDesc(String auditDesc) {
        this.auditDesc = auditDesc == null ? null : auditDesc.trim();
    }

    public Integer getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Integer effectTime) {
        this.effectTime = effectTime;
    }

    public String getStamppath() {
        return stamppath;
    }

    public void setStamppath(String stamppath) {
        this.stamppath = stamppath == null ? null : stamppath.trim();
    }

    public String getRecommender() {
        return recommender;
    }

    public void setRecommender(String recommender) {
        this.recommender = recommender == null ? null : recommender.trim();
    }

    public Integer getApprovedAt() {
        return approvedAt;
    }

    public void setApprovedAt(Integer approvedAt) {
        this.approvedAt = approvedAt;
    }

    public Integer getApprovedstatus() {
        return approvedstatus;
    }

    public void setApprovedstatus(Integer approvedstatus) {
        this.approvedstatus = approvedstatus;
    }

	public User() {
		super();
	}

	public User(String mobile, String realname, String idCard) {
		super();
		this.mobile = mobile;
		this.realname = realname;
		this.idCard = idCard;
	}

	public User(String mobile, String realname, String idCard, String recommender, Integer approvedstatus) {
		super();
		this.mobile = mobile;
		this.realname = realname;
		this.idCard = idCard;
		this.recommender = recommender;
		this.approvedstatus = approvedstatus;
	}

	@Override
	public String toString() {
		return "User [mobile=" + mobile + ", realname=" + realname + ", idCard=" + idCard + "]";
	}

	

	
}