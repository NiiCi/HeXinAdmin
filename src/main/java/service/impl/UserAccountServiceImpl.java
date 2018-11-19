package service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import dao.UserAccountMapper;
import entity.UserAccount;
import service.dao.UserAccountCostService;
import service.dao.UserAccountService;

@Service("userAccountService")
public class UserAccountServiceImpl implements UserAccountService{
	@Autowired
	UserAccountMapper userAccountMapper;
	@Autowired
	UserAccountCostService userAccountCostService;
	//更新账户永利宝收益
	@Override
	public int updateByYonglibao(double money,int userId){
		HashMap<String, Object> params = new HashMap<>();
		params.put("money", money);
		params.put("userId", userId);
		params.put("updateAt", System.currentTimeMillis()/1000);
		userAccountMapper.updateByYonglibao(params);
		return userAccountCostService.updateUserCost(params);
	}
	
	//ͨ���û�id��ѯ�û��ʲ���Ϣ
	@Override
	public UserAccount queryUserAccountByUserId (int userId){
		return userAccountMapper.queryUserAccountByUserId(userId);
	}
	
	//账户余额提现
	@Override
	@Transactional(rollbackFor=Exception.class)
	public int userAccountPut(double money , int userId){
		double moneyUsable = userAccountMapper.queryUserAccountByUserId(userId).getMoneyUsable();
		if (money > moneyUsable) {
			throw new RuntimeException("余额不足");
		}
		return userAccountMapper.userAccountPut(userId, money);
	}
		
}
