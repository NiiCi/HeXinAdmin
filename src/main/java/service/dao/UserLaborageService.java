package service.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserLaborageMapper;

public interface UserLaborageService {
	//发放工资总额
	public double getLabTotal();
}
