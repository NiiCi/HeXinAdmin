package controller;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


import entity.User;
import entity.UserAccount;
import entity.UserEmployee;
import service.dao.UserService;
  
@Controller
public class UserController {
	int user_id;
	@Autowired
	UserService ubiz;
    @RequestMapping("User")
    public String login(){
    	
    	return "users";
    }

    
    @RequestMapping(value = "Users", method = RequestMethod.GET)
   	@ResponseBody
	public Object seletAll(@RequestParam int pageIndex,String mobile,String realname,String idCard,String recommender,String approvedStatus) {
    	int pageSize=5;
    	int approvedStatus1 = 0;
    	if (mobile != null || realname != null || idCard != null || recommender!=null ||approvedStatus!=null) {
    		
			try {
				mobile = "%" + new String(mobile.getBytes("iso-8859-1"), "utf-8") + "%";
				realname = "%" + new String(realname.getBytes("iso-8859-1"), "utf-8") + "%";
				idCard = "%" + new String(idCard.getBytes("iso-8859-1"), "utf-8") + "%";
				recommender = "%" + new String(recommender.getBytes("iso-8859-1"), "utf-8") + "%";
			
					
	    		
				 approvedStatus1 = Integer.parseInt(approvedStatus);
	    		
			System.out.println("mobile"+mobile);
			System.out.println("realname"+realname);
			System.out.println("idCard"+idCard);
			System.out.println("recommender"+recommender);
			System.out.println("approvedStatus"+approvedStatus);
	
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    	PageHelper.startPage(pageIndex, pageSize);
    	List<User> lists=ubiz.selectAll(new User(mobile, realname, idCard, recommender, approvedStatus1));
    	for (User user : lists) {
			System.err.println("user"+user);
		}
    	PageInfo<User> list = new PageInfo<>(lists, 3);
    	return  list;
    }
    
	// 导出用户excel
	@RequestMapping("UserViews")
	public String View(Map<String, Object> map) {
		List<User> list = ubiz.selectAll0();
		map.put("UserExcel", list);
		return "userView";
	}
   
	//--------------用户详情
    @RequestMapping("detail")
    public String detail(int id){
    	user_id=id;
    	return "usersdetail";
    	
    }
    //用户详情——基本信息模块
    @RequestMapping(value="Details1",method=RequestMethod.GET)
    @ResponseBody
    public Object selectUserDetail(){
     UserEmployee list=ubiz.selectDetailById(user_id);
    	return list;
    }
    //用户详情——资金模块
    @RequestMapping(value="UserMoney",method=RequestMethod.GET)
    @ResponseBody
    public Object selectUserMoney(){
    	UserAccount list=ubiz.selectUserMoney(user_id);
    	return list;
    }
}
