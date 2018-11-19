package service.app.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.BorrowWishMapper;
import dao.UserAccountMapper;
import dao.UserMapper;
import service.app.dao.UserApiBiz;

@Service("userApiBiz")
public class UserApiBizImpl implements UserApiBiz{
	@Autowired
	UserMapper udao;
	//用户资金
    @Autowired
    UserAccountMapper udao2;
    @Autowired
    BorrowWishMapper bdao;
	/**
	 * 交易密码管理接口
	 */
    @Override
	public int updatePayPassword(int id, String pwd) {

		return udao.updatePayPassword(id, pwd);
	}
	
	/**
	 * 投资支付
	 */
    @Override
	@Transactional(rollbackFor=Exception.class)
    public int PayMoney(int id,double money,int type,int wishid){
		int rs=0;
		udao2.PayMoney(id, money, type);
		//余额不足数据回滚
		if(money>1000){
			
			throw new RuntimeException("余额不足");	
		}else{
		 rs=bdao.addWishMoney(money, wishid);
	
		}
    	return rs;
    }
   
	/**
	 * 提现接口
	 */
    @Override
	@Transactional(rollbackFor=Exception.class)
    public int DrawMoney(int id,double money){
	
		int rs=udao2.DrawMoney(id, money);
		//余额不足数据回滚
		if(money>1000){
			throw new RuntimeException("余额不足");	
		}
    	return rs;
    }
}
