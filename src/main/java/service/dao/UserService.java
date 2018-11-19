package service.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserAccountMapper;
import dao.UserEmployeeMapper;
import dao.UserMapper;
import entity.User;
import entity.UserAccount;
import entity.UserEmployee;

public interface UserService {

    public  List<User> selectAll(User user);
    
    public List<User> selectAll0();
    public  UserEmployee selectDetailById(int id);

    //�����û�id��ѯ�ʲ�
    public  UserAccount selectUserMoney(int user_id);
    
}
