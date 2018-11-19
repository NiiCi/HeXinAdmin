package service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BorrowWishMapper;

public interface BorrowWishService {
	//活期累计投资总额
    public double getYongliAll();
    
    //定期累计投资总额
    public double getSumMoneyByProduct();
    
    //活期累计收益
    public double getYongliProfit();
    
    //定期累计收益
    public double getSumProductProfit();
    
    //永利宝当前规模
    public double getYonglibao();
    
    //定期当前规模
    public double getWishAlreadyMoney();
    
    //活期产品年利率
    public double getWishApr(int wishId);
    //修改永利宝规模,并更新用户临时成本信息表
    public int updateYonglibaoProfit(double money);
}
