package entity;

public class UserAccountCost {
    private int id;

    private int userId;
    //ǰ�ճɱ�
    private double beforeLastdayCost;
    //�����ʽ���ˮ
    private double lastdayCostLog;
    //����ʱ��
    private long updateAt;
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
	public double getBeforeLastdayCost() {
		return beforeLastdayCost;
	}
	public void setBeforeLastdayCost(double beforeLastdayCost) {
		this.beforeLastdayCost = beforeLastdayCost;
	}
	public double getLastdayCostLog() {
		return lastdayCostLog;
	}
	public void setLastdayCostLog(double lastdayCostLog) {
		this.lastdayCostLog = lastdayCostLog;
	}
	public long getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(long updateAt) {
		this.updateAt = updateAt;
	}
}