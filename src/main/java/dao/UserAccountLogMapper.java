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
    //��ЧͶ������
    int getPeopleCount();
    
    //�����ʽ�䶯�Ļ����û�
    List<UserAccountLog> getMoneyChangeUserInfo(long nowTime);
    
    //��ȡ�������û����յ� �깺������صĲ������
    double getMoneyChange(Map<String, Object> map);
    
    //��ѯ�û����ת��/���ڴ���¼
    List<UserAccountLog> getUserMoneyInProductLog(int userId);
    
    //��ѯ�û����ڲ�Ʒת������¼
    List<UserAccountLog> getUserMoneyOutProductLog(int userId);
}