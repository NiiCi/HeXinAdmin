package service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import dao.UserProfitsDetailMapper;
import entity.Total;
import entity.User;
import entity.UserAccountCost;
import entity.UserCapitalFlow;
import entity.UserProfitsDetail;
import service.dao.UserAccountService;
import service.dao.UserCapitalFlowService;
import service.dao.UserProfitsDetailService;
import util.DateUtils;

@Service("userProfitsDetailService")
public class UserProfitsDetailServiceImpl implements UserProfitsDetailService{
	@Autowired
	UserProfitsDetailMapper userProfitsDetailMapper;
	@Autowired
	UserAccountService userAccountService;
	@Autowired
	UserCapitalFlowService userCapitalFlowService;
	//查询收益明细
	@Override
	public List<UserProfitsDetail> selectAll(User user){
		return userProfitsDetailMapper.selectAll(user);
	}
	
	//��ѯ�û���������������
	@Override
	public double queryProfitByLastDay(int userId){
		double profits = -200;
		HashMap<String, Object> params = new HashMap<>();
		params.put("userId",userId);
		params.put("time", DateUtils.getTodayTime());
		Object o = userProfitsDetailMapper.queryProfitByLastDay(params);
		System.err.println("------"+o);
		if (o instanceof Double) {
			profits = (double)o;
		}
		return profits;
	}
	
	/**
	 * ����ָ���û�������������
	 * @param userAccount
	 * @param wish_apr
	 * @param tt
	 * @return
	 */
	@Override
	@Transactional(rollbackFor=Exception.class)
	public boolean profitByYongliBao(UserAccountCost userAccountCost,double wish_apr,Total tt){
		//获取用户昨日收益
		double profit = queryProfitByLastDay(userAccountCost.getUserId());
		System.out.println("profit--------------: "+profit);
		boolean flag = profit == -200? true:false;
		System.out.println("flag-----------: "+flag);
		if (profit == -200) {// -200 判断是否存在收益
			//获取资金流水
			double cost = userAccountCost.getBeforeLastdayCost()+userAccountCost.getBeforeLastdayCost();
			if (cost < 0) {
				System.out.println("补发收益日未到?,无需补发");
			}else{
				double money = cost*wish_apr/360/100;
				
				tt.setTotal(money);
				
				//添加收益明细
				UserProfitsDetail userProfitsDetail = new UserProfitsDetail();
				userProfitsDetail.setUserId(userAccountCost.getUserId());
				userProfitsDetail.setProfits(money);
				userProfitsDetail.setProductType(2);
				userProfitsDetail.setProductName("永利宝?");
				userProfitsDetail.setType(60);
				userProfitsDetail.setStatus(1);
				userProfitsDetail.setCreateTime(System.currentTimeMillis() / 1000);
				userProfitsDetail.setProfitDay(System.currentTimeMillis() / 1000-86400);
				
				
				int row = userProfitsDetailMapper.addProfit(userProfitsDetail);
				System.out.println("row----: "+row);
				if (row > 0) {
					
					//更新资金流水记录
					if (userAccountService.updateByYonglibao(money, userAccountCost.getUserId()) != 1) {
						throw new RuntimeException("余额不足");
					}else{
						UserCapitalFlow userCapitalFlow = new UserCapitalFlow();
						userCapitalFlow.setUserId(userAccountCost.getUserId());
						userCapitalFlow.setType(60);
						userCapitalFlow.setStatus(1);
						userCapitalFlow.setMoney(money);
						userCapitalFlow.setCharge(0);
						userCapitalFlow.setReturnCode(0);
						userCapitalFlow.setReturnInformation("");
						userCapitalFlow.setCreateTime(System.currentTimeMillis()/1000);
						userCapitalFlow.setCreateIp("172.16.7.81");
						//添加用户资金流水
						userCapitalFlowService.addUserCapitalFlow(userCapitalFlow);
						return true;
					}
				}
			}
		}else{
			System.out.println("----补发失败----");
		}
		return false;
	}
}
