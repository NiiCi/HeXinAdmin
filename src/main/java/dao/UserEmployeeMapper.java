package dao;


import java.util.List;

import entity.UserEmployee;

public interface UserEmployeeMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserEmployee record);

    UserEmployee selectByPrimaryKey(Integer userId);

    List<UserEmployee> selectAll();

    int updateByPrimaryKey(UserEmployee record);
    //通过userid查询详情
    UserEmployee selectDetailById(Integer userId);
}