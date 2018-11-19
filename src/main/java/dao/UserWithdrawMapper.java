package dao;

import entity.UserWithdraw;
import java.util.List;

public interface UserWithdrawMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserWithdraw record);

    UserWithdraw selectByPrimaryKey(Integer id);

    List<UserWithdraw> selectAll(UserWithdraw userWithdraw);

    int updateByPrimaryKey(UserWithdraw record);
    
    //累计提现总额
    double getTotalWithdraw();
    
    //有效提现人数
    int getWithdrawPeopleCount();
}