package dao;

import entity.BorrowWish;
import java.util.List;

public interface BorrowWishMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BorrowWish record);

    BorrowWish selectByPrimaryKey(Integer id);

    List<BorrowWish> selectAll();

    int updateByPrimaryKey(BorrowWish record);
    /**
     * ��Ʋ�Ʒ����չʾ(api)
     */
    BorrowWish selectAllApi(int id);
    
    /**
     * Ͷ��֧�����Ӳ�Ʒ��ģ��api��
     * 
     */
    int  addWishMoney(double money,int wishid);
   
    
    //活期累计投资总额
    double getYongliAll();
    
    //定期累计投资总额
    double getSumMoneyByProduct();
    
    //活期累计收益
    double getYongliProfit();
    
    //定期累计收益
    double getSumProductProfit();
    
    //永利宝当前规模
    double getYonglibao();
    
    //定期当前规模
    double getWishAlreadyMoney();
    
    //活期产品年利率
    double getWishApr(int wishId);
    
    //修改永利宝总收益
    int updateYonglibaoProfit(double money);
}