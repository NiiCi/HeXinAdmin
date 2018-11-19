package service.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserAccountLogMapper;
import entity.User;
import entity.UserAccountLog;


public interface UserAccountLogService {

  public List<UserAccountLog> selectAll(User user);
  
  public int getPeopleCount();

  public List<UserAccountLog> getMoneyChangeUserInfo(long nowTime);
        
  public double getMoneyChange(Map<String, Object> map);
 
  public List<UserAccountLog> getUserMoneyInProductLog(int userId);

  public List<UserAccountLog> getUserMoneyOutProductLog(int userId);

}
