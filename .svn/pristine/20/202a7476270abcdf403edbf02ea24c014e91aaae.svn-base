package service.dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import dao.UserProfitsDetailMapper;
import entity.Total;
import entity.User;
import entity.UserAccountCost;
import entity.UserCapitalFlow;
import entity.UserProfitsDetail;
import util.DateUtils;


public interface UserProfitsDetailService {
	//��ѯ����������ϸ
	public List<UserProfitsDetail> selectAll(User user);
	//��ѯ�û���������������
	public double queryProfitByLastDay(int userId);
	
	public boolean profitByYongliBao(UserAccountCost userAccountCost,double wish_apr,Total tt);
	
}
