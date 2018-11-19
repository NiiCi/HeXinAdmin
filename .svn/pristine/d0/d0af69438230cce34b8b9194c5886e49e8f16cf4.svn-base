package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AdminUserMapper;
import entity.AdminUser;
import service.dao.AdminUserService;

@Service("adminUserService")
public class AdminUserServiceImpl implements AdminUserService{
	@Autowired
	AdminUserMapper adminUserMapper;
	
	//管理员登录
	@Override
	public AdminUser loginCheck(String username,String passwordHash){
		return adminUserMapper.loginCheck(username, passwordHash);
	}
	
	//通过用户名查找用户信息
	@Override
	public AdminUser queryAdminByName(String username){
		return adminUserMapper.queryAdminByName(username);
	}
}
