package dao;

import entity.UserWithdraw;
import java.util.List;

public interface UserWithdrawMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserWithdraw record);

    UserWithdraw selectByPrimaryKey(Integer id);

    List<UserWithdraw> selectAll(UserWithdraw userWithdraw);

    int updateByPrimaryKey(UserWithdraw record);
    
    //�ۼ������ܶ�
    double getTotalWithdraw();
    
    //��Ч��������
    int getWithdrawPeopleCount();
}