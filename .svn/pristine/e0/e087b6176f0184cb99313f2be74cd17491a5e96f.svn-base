package dao;

import entity.UserAccount;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserAccountMapper {
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("userId") Integer userId);

    int insert(UserAccount record);

    UserAccount selectByPrimaryKey(@Param("id") Integer id, @Param("userId") Integer userId);

    List<UserAccount> selectAll();

    int updateByPrimaryKey(UserAccount record);
    //�����û�id��ѯ
    UserAccount selectUserMoney(int user_id);
    
    //���֧��
    public int PayMoney(@Param("id") int id,@Param("money") double moneny, @Param("type") int type);
    
    //����ȡǮ
	public int  DrawMoney(int id, double money);
	/**
     * ���ֳɹ����������н��(����)
     * 
     * 
     * 
     */
	int money_withdraw(double money, int id);
 
    
    //ͨ���û�Id��ѯ�û��ʲ���Ϣ
    UserAccount queryUserAccountByUserId(int userId);
    
    //�����û��˺����,�������ۼ�����,����
    int updateByYonglibao(Map<String, Object> map);
    
    //�û��������
    int userAccountPut(@Param("userId") int userId,@Param("money") double money);
}