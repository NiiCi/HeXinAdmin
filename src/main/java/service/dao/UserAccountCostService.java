package service.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserAccountCostMapper;
import dao.UserAccountLogMapper;
import entity.UserAccountCost;
import util.DateUtils;


public interface UserAccountCostService {
	//�޸��û������ʽ���ˮ
	public int updateCost(int userid);
	//��ѯ�û��ʽ���Ϣ
    public List<UserAccountCost> queryByUserId (Map<String, Object> map);
    //�޸��û���ʱ�ɱ���
    public int updateUserCost(Map<String, Object> map);
    
}
