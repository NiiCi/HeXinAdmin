package controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import entity.User;
import entity.UserAccountLog;
import entity.UserCapitalFlow;
import service.dao.UserAccountLogService;

@Controller
public class UserAccountLogController {
  @Autowired
  UserAccountLogService uBiz;
  
  
  @RequestMapping("UserAccountLog")
  public String login(){
	

	return "userAccountLog";
}
  
//查询所有
 	@RequestMapping(value = "UserAccountLogs", method = RequestMethod.GET)
 	@ResponseBody
 	public Object seletAll(int pageIndex,String mobile,String realname,String idCard) {
 		// 分页查询
 		int pageSize =5;
 		
 		if (mobile != null || realname != null || idCard != null) {
			try {
				mobile = "%" + new String(mobile.getBytes("iso-8859-1"), "utf-8") + "%";
				realname = "%" + new String(realname.getBytes("iso-8859-1"), "utf-8") + "%";
				idCard = "%" + new String(idCard.getBytes("iso-8859-1"), "utf-8") + "%";
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
 		
 		PageHelper.startPage(pageIndex, pageSize);
 		List<UserAccountLog> lists=uBiz.selectAll(new User(mobile, realname, idCard));
 		PageInfo<UserAccountLog> list = new PageInfo<>(lists, 3);
 		return list;

 	}
	
}
