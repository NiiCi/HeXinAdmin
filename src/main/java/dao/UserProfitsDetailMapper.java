package dao;

import entity.User;
import entity.UserProfitsDetail;
import java.util.List;
import java.util.Map;

public interface UserProfitsDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserProfitsDetail record);

    UserProfitsDetail selectByPrimaryKey(Integer id);

    //动态查询你收益明细    
    List<UserProfitsDetail> selectAll(User user);

    int updateByPrimaryKey(UserProfitsDetail record);
    
    //查询用户昨日收益
    Object queryProfitByLastDay (Map<String, Object> map);
    
/*    //通过用户id查询 永利宝(活期) 收益明细
    UserProfitsDetail queryProfitByYongliBao();*/
    
    //添加收益明细
    int addProfit(UserProfitsDetail userProfitsDetail);
}