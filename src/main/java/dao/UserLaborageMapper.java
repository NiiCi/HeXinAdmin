package dao;

import entity.UserLaborage;
import java.util.List;

public interface UserLaborageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLaborage record);

    UserLaborage selectByPrimaryKey(Integer id);

    List<UserLaborage> selectAll();

    int updateByPrimaryKey(UserLaborage record);
    
    //�ۼƷ��Ź���
    double getLabTotal();
}