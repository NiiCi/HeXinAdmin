package service.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.BorrowWishMapper;
import dao.UserAccountMapper;
import dao.UserMapper;

public interface UserApiBiz {
	/**
	 * 交易密码管理接口
	 */

	public int updatePayPassword(int id, String pwd);
	
	/**
	 * 投资支付
	 */
    public int PayMoney(int id,double money,int type,int wishid);
   
	/**
	 * 提现接口
	 */
	
    public int DrawMoney(int id,double money);
}
