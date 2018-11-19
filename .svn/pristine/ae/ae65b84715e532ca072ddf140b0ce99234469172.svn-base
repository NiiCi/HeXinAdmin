package service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AdminUserMapper;
import entity.AdminUser;


public interface AdminUserService {
	
	//管理员登录
	public AdminUser loginCheck(String username,String passwordHash);
	//通过用户名查找用户信息
	public AdminUser queryAdminByName(String username);
}
