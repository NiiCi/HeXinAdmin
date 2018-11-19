package dao;

import entity.UserLaborage;
import java.util.List;

public interface UserLaborageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLaborage record);

    UserLaborage selectByPrimaryKey(Integer id);

    List<UserLaborage> selectAll();

    int updateByPrimaryKey(UserLaborage record);
    
    //累计发放工资
    double getLabTotal();
}