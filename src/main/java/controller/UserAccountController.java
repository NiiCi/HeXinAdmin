
package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.ResultMsg;
import entity.UserAccount;
import entity.UserWithdraw;
import service.dao.UserAccountService;
import service.dao.UserWithdrawService;


@Controller
public class UserAccountController {
	@Autowired
	UserAccountService userAccountService;
	@Autowired
	UserWithdrawService userWithdrawService;
	/**
	 * 通过用户Id查询用户资产信息
	 */
	@RequestMapping(value="userAccountController/{userId}",method=RequestMethod.GET)
	@ResponseBody
	public UserAccount queryUserAccountByUserId(@PathVariable int userId){
		UserAccount userInfo = userAccountService.queryUserAccountByUserId(userId);
		return userInfo;
	}
	
	
	//提现
	@RequestMapping(value="userAccountController",method=RequestMethod.PUT)
	@ResponseBody
	public Object userAccountPut(@RequestParam double money,@RequestParam int userId,@RequestParam long bankCard,ResultMsg rm){
		/*String money1 = request.getParameter("money");
		String userId1 = request.getParameter("userId");*/
		
		int row = 0;
		try {
			row = userAccountService.userAccountPut(money, userId);
			System.out.println(rm.getMsg());
			
		} catch (Exception e) {
			System.out.println("提现失败");
		}
		if (row > 0) {
			rm.setMsg("success");
		}else{
			rm.setMsg("error");
		}
		//添加用户提现日志记录
		
		UserWithdraw userWithdraw = new UserWithdraw();
		userWithdraw.setCharge(0.0);
		userWithdraw.setCreatedAt((int)(System.currentTimeMillis()/1000));
		
		userWithdraw.setCreatedBy(userId);
		userWithdraw.setTradeOrder("WITH2017112114314870953");
		userWithdraw.setCreatedIp("127.0.0.1");
		userWithdraw.setMoneyWithdraw(money);
		userWithdraw.setCreatedByIdcard("330329199001010018");
		userWithdraw.setStatus((byte)(rm.getMsg() == "success" ? 1:0));
		userWithdraw.setType((rm.getMsg() == "success" ? 5:6));
		userWithdraw.setCreatedByName("BarryAllen");
		userWithdraw.setCreatedByPhone("17816876348");
		userWithdrawService.insert(userWithdraw);
		return rm;
	}
}