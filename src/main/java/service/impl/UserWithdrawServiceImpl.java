package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserWithdrawMapper;
import entity.UserWithdraw;
import service.dao.UserWithdrawService;
@Service("userWithdrawService")
public class UserWithdrawServiceImpl implements UserWithdrawService{
	@Autowired
	UserWithdrawMapper userWithdrawMapper;
	
	@Override
	public List<UserWithdraw> selectAll(UserWithdraw userWithdraw){
		return userWithdrawMapper.selectAll(userWithdraw);
	}
	
    //�ۼ������ܶ�
	@Override
    public double getTotalWithdraw(){
    	return userWithdrawMapper.getTotalWithdraw();
    }
    
    //��Ч��������
	@Override
    public int getWithdrawPeopleCount(){
    	return userWithdrawMapper.getWithdrawPeopleCount();
    }
/*    int deleteByPrimaryKey(Integer id);

    int insert(UserWithdraw record);

    UserWithdraw selectByPrimaryKey(Integer id);

    List<UserWithdraw> selectAll();

    int updateByPrimaryKey(UserWithdraw record);*/
    
	@Override
    public int insert(UserWithdraw userWithdraw){
    	return userWithdrawMapper.insert(userWithdraw);
    }
}
