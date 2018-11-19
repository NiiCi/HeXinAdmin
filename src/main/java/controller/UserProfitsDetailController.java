package controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.ss.usermodel.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import dao.UserAccountLogMapper;
import entity.BootStrapPage;
import entity.Total;
import entity.User;
import entity.UserAccountCost;
import entity.UserAccountLog;
import entity.UserProfitsDetail;
import entity.UserWithdraw;
import service.dao.BorrowWishService;
import service.dao.UserAccountCostService;
import service.dao.UserAccountLogService;
import service.dao.UserProfitsDetailService;
import service.impl.UserAccountLogServiceImpl;
import util.DateUtils;

@Controller
public class UserProfitsDetailController {
	@Autowired
	UserProfitsDetailService userProfitsDetailService;
	@Autowired
	UserAccountLogService userAccountLogService;
	@Autowired
	UserAccountCostService userAccountCostService;
	@Autowired
	BorrowWishService borrowWishService;
	@RequestMapping("user_profits_list")
	public Object user_profits_list(){
		return "user_profits_list";
	}
	
	//查询收益明细
	@RequestMapping(value="userProfitsDetailController",method=RequestMethod.GET)
	@ResponseBody
	public Object selectAll(User user,Map<String,Object> map,HttpServletRequest request){
		System.out.println("------");
		PageHelper pageHelper = new PageHelper();
		String limit1 = request.getParameter("limit");
		String offset1 = request.getParameter("offset");
		int limit = Integer.parseInt(limit1);
		int offset = Integer.parseInt(offset1);
		System.out.println("mobile"+user.getMobile());
		System.out.println("realname"+user.getRealname());
		System.out.println("idCard"+user.getIdCard());
		System.out.println("limit"+Integer.parseInt(limit1));
		System.out.println("offset"+Integer.parseInt(offset1));
		pageHelper.startPage(offset / limit + 1, limit);
		
		List<UserProfitsDetail> list = userProfitsDetailService.selectAll(user);
		PageInfo<UserProfitsDetail> pageinfo = new PageInfo<>(list);
		BootStrapPage<UserProfitsDetail> bootstrapPage = new BootStrapPage<UserProfitsDetail>(pageinfo.getTotal(), pageinfo.getList());
		map.put("userProfitsDetail", list);
		return bootstrapPage;
	}
	
	//补发活期收益
	@RequestMapping(value="userProfitsDetailController",method=RequestMethod.PUT)
	@ResponseBody
	public Object updateYonglibaoProfits(){
		//获取当前时间的 00:00:00 的秒数，如 10:28:01 变成 )00:00:00
	/*	long nowTime = System.currentTimeMillis()/1000;
		long daySecond = 60*60*24;
		long time =  nowTime - (nowTime + 8 * 3600) % daySecond;*/
		HashMap<String, Object> param = new HashMap<>();
		//获取昨日活期资金变动的用户
		long nowTime = DateUtils.getTodayTime();
		System.out.println(nowTime);
		//获取购买了活期产品 永利宝的用户
		List<UserAccountLog> userAccountLogLists = userAccountLogService.getMoneyChangeUserInfo(nowTime);
		System.out.println("需要更新的用户个数:"+userAccountLogLists.size());
		if (userAccountLogLists.size()!=0) {
			for (int i = 0; i < userAccountLogLists.size(); i++) {
				userAccountCostService.updateCost(userAccountLogLists.get(i).getUserId());
			}
		}
		//查询需要结算的用户个数 , 成本+资金流水大于零
		param.put("update_at", DateUtils.getTodayTime());
		System.out.println("update_at"+DateUtils.getTodayTime());
		List<UserAccountCost> userAccountCostLists = userAccountCostService.queryByUserId(param);
		System.out.println("需要结算的用户个数: "+userAccountCostLists.size());
		
		//查询活期产品当前年利率
		double wish_apr = borrowWishService.getWishApr(1);
		Total tt = new Total();
		tt.setTotal(0);
		//补发人数
		int count = 0;
		if (userAccountCostLists.size()!=0) {
			for (int i = 0; i < userAccountCostLists.size(); i++) {
				if(userProfitsDetailService.profitByYongliBao(userAccountCostLists.get(i), wish_apr, tt)){
					count++;
				}
			}
			
			//更新永利宝产品规模
			System.err.println("-----: "+tt.getTotal());
			if(borrowWishService.updateYonglibaoProfit(tt.getTotal()) == 0){
				return "error";
			}else if(userAccountCostLists.size() == count){
				return "success";
			}else{
				return "not_success";//表示某人收益未补发
			}
		}else{
			return "nobody";
		}
	}
	public static void main(String[] args) {
		long nowTime = DateUtils.getTodayTime();
		UserAccountLogService userAccountLogService = new UserAccountLogServiceImpl();
		System.out.println(userAccountLogService);
		long nowtime = System.currentTimeMillis()/1000;
		long daySecond = 60*60*24;
		long time =  nowTime - (nowTime +(8 * 3600)) % daySecond;
		long time2 = DateUtils.getTodayTime();
		System.out.println("--"+time2);
		System.out.println(new Date((time-24*3600)*1000));
		System.out.println(time-24*3600);
	
		
	}
	/*Sat Oct 27 17:10:00 CST 2018*/
}
