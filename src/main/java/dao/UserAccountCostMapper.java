package dao;

import entity.UserAccountCost;
import java.util.List;
import java.util.Map;

public interface UserAccountCostMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAccountCost record);

    UserAccountCost selectByPrimaryKey(Integer id);

    List<UserAccountCost> selectAll();

    int updateByPrimaryKey(UserAccountCost record);
    
    //修改用户昨日资金流水
    int updateCost(Map<String, Object> map);
    //查询用户资金信息
    List<UserAccountCost> queryByUserId (Map<String, Object> map);
    //修改用户临时成本表
    int updateUserCost(Map<String, Object> map);
}