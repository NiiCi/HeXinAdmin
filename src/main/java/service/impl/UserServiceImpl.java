package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserAccountMapper;
import dao.UserEmployeeMapper;
import dao.UserMapper;
import entity.User;
import entity.UserAccount;
import entity.UserEmployee;
import service.dao.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper udao;
	
	@Override
    public  List<User> selectAll(User user){
    	return udao.selectAll(user);
    }
	
	@Override
    public List<User> selectAll0(){
    	return udao.selectAll0();
    }
    @Autowired
    UserEmployeeMapper udao2;
    
    @Override
    public  UserEmployee selectDetailById(int id){
    	return udao2.selectDetailById(id);
    } 
    
    @Autowired
    UserAccountMapper udao3;
    //�����û�id��ѯ�ʲ�
    @Override
    public  UserAccount selectUserMoney(int user_id){
    	return udao3.selectUserMoney(user_id);
    }
    
}
