package dao;

import entity.User;
import entity.UserEmployee;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll(User user);
    List<User> selectAll0();

    int updateByPrimaryKey(User record);
    
    /**
     * 交易密码管理接口
     */
    int updatePayPassword(int id,String pwd);
}