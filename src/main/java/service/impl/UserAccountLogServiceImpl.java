package service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserAccountLogMapper;
import entity.User;
import entity.UserAccountLog;
import service.dao.UserAccountLogService;

@Service("userAccountLogService")
public class UserAccountLogServiceImpl implements UserAccountLogService{
  @Autowired
  UserAccountLogMapper userAccountLogMapper;
  
  @Override
  public List<UserAccountLog> selectAll(User user){
		
		return userAccountLogMapper.selectAll(user);
	} 
  
//ЧͶ      
  @Override
  public int getPeopleCount(){
  	return userAccountLogMapper.getPeopleCount();
  }
  
  //  ȡ   ջ  ڲ Ʒ ʽ �? û   Ϣ
  @Override
  public List<UserAccountLog> getMoneyChangeUserInfo(long nowTime){
  	return userAccountLogMapper.getMoneyChangeUserInfo(nowTime);
  }
  
  //  ȡ       û    յ   �?      صĲ      
  @Override
  public double getMoneyChange(Map<String, Object> map){
  	return userAccountLogMapper.getMoneyChange(map);
  }
  //  ѯ û    ת  /   ڴ   ¼
  @Override
  public List<UserAccountLog> getUserMoneyInProductLog(int userId){
  	return userAccountLogMapper.getUserMoneyInProductLog(userId);
  }
  //  ѯ û    ڴ  ת        ¼
  @Override
  public List<UserAccountLog> getUserMoneyOutProductLog(int userId){
  	return userAccountLogMapper.getUserMoneyOutProductLog(userId);
  }

  
   
}
