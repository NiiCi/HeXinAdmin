package entity;

public class UserCaptcha {
    private Integer id;
    //�û���
    private Integer userId;
    //�ֻ���
    private String phone;
    //��֤��
    private String captcha;
    //���ͣ���ע�ᡢ�һ������
    private String type;
    //����ʱ��
    private Integer generateTime;
    //����ʱ��
    private Integer expireTime;
    //״̬  0.Ϊʱ�� 1.��ʹ��
    private Byte status;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha == null ? null : captcha.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(Integer generateTime) {
        this.generateTime = generateTime;
    }

    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}