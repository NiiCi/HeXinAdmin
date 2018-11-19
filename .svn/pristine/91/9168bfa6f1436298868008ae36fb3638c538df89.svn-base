package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserCapitalFlowMapper;
import entity.User;
import entity.UserCapitalFlow;
import service.dao.UserCapitalFlowService;

@Service("userCapitalFlowService")
public class UserCapitalFlowServiceImpl implements UserCapitalFlowService {
    @Autowired
    UserCapitalFlowMapper userCapitalFlowMapper;
	
    @Override
	public List<UserCapitalFlow> selectAll(User user){
		
		return userCapitalFlowMapper.selectAll(user);
	} 
	//添加资金流水
    @Override
    public int addUserCapitalFlow(UserCapitalFlow userCapitalFlow){
	  return userCapitalFlowMapper.addUserCapitalFlow(userCapitalFlow);
		}

	
}
