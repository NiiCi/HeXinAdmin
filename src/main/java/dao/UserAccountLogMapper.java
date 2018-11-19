package dao;

import entity.User;
import entity.UserAccountLog;
import java.util.List;
import java.util.Map;

public interface UserAccountLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAccountLog record);

    UserAccountLog selectByPrimaryKey(Integer id);

    List<UserAccountLog> selectAll(User user);

    int updateByPrimaryKey(UserAccountLog record);
    //有效投资人数
    int getPeopleCount();
    
    //计算资金变动的活期用户
    List<UserAccountLog> getMoneyChangeUserInfo(long nowTime);
    
    //获取永利宝用户昨日的 申购或者赎回的操作金额
    double getMoneyChange(Map<String, Object> map);
    
    //查询用户余额转活/定期存款记录
    List<UserAccountLog> getUserMoneyInProductLog(int userId);
    
    //查询用户活期产品转出余额记录
    List<UserAccountLog> getUserMoneyOutProductLog(int userId);
}