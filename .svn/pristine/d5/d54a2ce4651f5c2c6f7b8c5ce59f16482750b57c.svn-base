package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BorrowWishMapper;
import service.dao.BorrowWishService;
import service.dao.UserAccountCostService;

@Service("borrowWishService")
public class BorrowWishServiceImpl implements BorrowWishService {
	@Autowired
	BorrowWishMapper borrowWishMapper;
	@Autowired
	UserAccountCostService userAccountCostService;
	//活期累计投资总额
	@Override
    public double getYongliAll(){
    	return borrowWishMapper.getYongliAll();
    }
    
    //定期累计投资总额
    @Override
    public double getSumMoneyByProduct(){
    	return borrowWishMapper.getSumMoneyByProduct();
    }
    
    //活期累计收益
    @Override
    public double getYongliProfit(){
    	return borrowWishMapper.getYongliProfit();
    }
    
    //定期累计收益
    @Override
    public double getSumProductProfit(){
    	return borrowWishMapper.getSumProductProfit();
    }
    
    //永利宝当前规模
    @Override
    public double getYonglibao(){
    	return borrowWishMapper.getYonglibao();
    }
    
    //定期当前规模
    @Override
    public double getWishAlreadyMoney(){
    	return borrowWishMapper.getWishAlreadyMoney();
    }
    
    //活期产品年利率
    @Override
    public double getWishApr(int wishId){
    	return borrowWishMapper.getWishApr(wishId);
    }
    //修改永利宝收益,并更新用户临时成本信息表
    @Override
    public int updateYonglibaoProfit(double money){
    	return borrowWishMapper.updateYonglibaoProfit(money); 
    			
    }
}
