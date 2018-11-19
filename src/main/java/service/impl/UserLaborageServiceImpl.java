package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserLaborageMapper;
import service.dao.UserLaborageService;

@Service("userLaborageService")
public class UserLaborageServiceImpl implements UserLaborageService{
	@Autowired
	UserLaborageMapper userLaborageMapper;
	
	//�ۼƷ��Ź���
	@Override
	public double getLabTotal(){
		return userLaborageMapper.getLabTotal();
	}
}
