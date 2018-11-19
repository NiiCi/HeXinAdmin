package controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.validator.internal.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import entity.BootStrapPage;
import entity.UserWithdraw;
import service.dao.UserWithdrawService;
@Controller
public class UserWithdrawController {
	@Autowired
	UserWithdrawService userWithdrawService;
	
	@RequestMapping("moneywithdraw_list")
	public String moneywithdraw_list(){
		return "moneywithdraw_list";
	}
	@RequestMapping(value="userWithdrawController",method=RequestMethod.GET)
	@ResponseBody
	public Object selectAll(UserWithdraw userWithdraw,Map<String,Object> map,HttpServletRequest request){
		System.out.println("------");
		PageHelper pageHelper = new PageHelper();
		String limit1 = request.getParameter("limit");
		String offset1 = request.getParameter("offset");
		int limit = Integer.parseInt(limit1);
		int offset = Integer.parseInt(offset1);
		System.out.println("getCreatedByPhone"+userWithdraw.getCreatedByPhone());
		System.out.println("getCreatedByName"+userWithdraw.getCreatedByName());
		System.out.println("getCreatedByIdcard"+userWithdraw.getCreatedByIdcard());
		System.out.println("getMoneyWithdraw"+userWithdraw.getMoneyWithdraw());
		System.out.println("getType"+userWithdraw.getType());
		System.out.println("limit"+Integer.parseInt(limit1));
		System.out.println("offset"+Integer.parseInt(offset1));
		pageHelper.startPage(offset / limit + 1, limit);
		
		List<UserWithdraw> list = userWithdrawService.selectAll(userWithdraw);
		for (UserWithdraw user : list) {
			System.out.println(user.getCreatedByName());
		}
		PageInfo<UserWithdraw> pageinfo = new PageInfo<>(list);
		BootStrapPage<UserWithdraw> bootstrapPage = new BootStrapPage<UserWithdraw>(pageinfo.getTotal(), pageinfo.getList());
		map.put("userWithdraw", list);
		return bootstrapPage;
	}
}
