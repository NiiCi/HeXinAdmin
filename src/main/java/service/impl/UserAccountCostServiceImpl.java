package service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserAccountCostMapper;
import dao.UserAccountLogMapper;
import entity.UserAccountCost;
import service.dao.UserAccountCostService;
import util.DateUtils;

@Service("userAccountCostService")
public class UserAccountCostServiceImpl implements UserAccountCostService{
	@Autowired
	UserAccountCostMapper userAccountCostMapper;
	@Autowired
	UserAccountLogMapper userAccountLogMapper;
	//�޸��û������ʽ���ˮ
	@Override
	public int updateCost(int userid){
		HashMap<String, Object> map = new HashMap<>();
		map.put("wishName", "永利�?");
		map.put("userId", userid);
		map.put("type", 31);
		map.put("time", DateUtils.getTodayTime()-86400);
		//��ѯ�û������깺�Ľ��?
		double buyMoney = userAccountLogMapper.getMoneyChange(map);
		
		map.put("type", 57);
		map.put("time", DateUtils.getTodayTime());
		//��ѯ�û�������صĽ��
		double returnMoney = userAccountLogMapper.getMoneyChange(map);
		//���߲� Ϊ�����û����ʽ���ˮ
		double lastday_cost = buyMoney - returnMoney;
		//�����ʽ�䶯���
		HashMap<String, Object> params = new HashMap<>();
		params.put("userId", userid);
		params.put("lastday_cost_log", lastday_cost);
		params.put("time", DateUtils.getTodayTime());
		return userAccountCostMapper.updateCost(params);
	}
	
	//��ѯ�û��ʽ���Ϣ
	@Override
    public List<UserAccountCost> queryByUserId (Map<String, Object> map){
    	return userAccountCostMapper.queryByUserId(map); 
    }
    //�޸��û���ʱ�ɱ���
	@Override
    public int updateUserCost(Map<String, Object> map){
    	return userAccountCostMapper.updateUserCost(map);
    }
    
}
