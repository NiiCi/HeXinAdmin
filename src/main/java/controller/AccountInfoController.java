package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.AdminUser;
import service.dao.AdminUserService;
import service.dao.BorrowWishService;
import service.dao.UserAccountLogService;
import service.dao.UserLaborageService;
import service.dao.UserProfitsDetailService;
import service.dao.UserWithdrawService;

@Controller
public class AccountInfoController {
	@Autowired
	BorrowWishService borrowWishService;
	@Autowired
	UserAccountLogService userAccountLogService;
	@Autowired
	UserLaborageService userLaborageService;
	@Autowired
	UserProfitsDetailService userProfitsDetailService;
	@Autowired
	UserWithdrawService userWithdrawService;
	@Autowired
	AdminUserService adminUserService;

	@RequestMapping("/")
	public Object login() {
		return "login";
	}
	
	@RequestMapping("index")
	public Object index(Map<String, Object> map){
		getAccountInfo(map);
		return "index";
	}
	// 国际化 更改本地语言显示
	@RequestMapping("/changeLanguage")
	public String changeLanguage(Locale locale) {
		System.out.println("国家----: " + locale.getCountry() + " ,语言----: " + locale.getLanguage());
		return "login";
	}

	@RequestMapping(value = "userLogin", method = RequestMethod.POST)
	public Object loginCheck(HttpServletRequest request, HttpServletResponse response, Map<String, Object> map)
			throws IOException {
		// 获取当前对象,会自动绑定到当前线程
		Subject currentUser = SecurityUtils.getSubject();
		Session session = currentUser.getSession();
		//设置session过期时间,超出时间要求用户重新登录
		session.setTimeout(60 * 60 * 1000);
		String username = request.getParameter("username");
		String passwordHash = request.getParameter("password_hash");
		String check = request.getParameter("remeberpwd");
		String autoLogin = request.getParameter("autoLogin");
		boolean flag = autoLogin == null ? false : true;
		System.out.println("flag-----: " + flag);
		System.out.println("check-----: " + check);
		/*
		 * AdminUser adminUser = adminUserService.loginCheck(username,
		 * passwordHash);
		 */
		if (!currentUser.isAuthenticated()) {
			UsernamePasswordToken token = new UsernamePasswordToken(username, passwordHash);
			System.out.println("username:----" + username);
			System.out.println("passwordHash:----" + passwordHash);

			// 自动登录,根据flag 判断
			token.setRememberMe(flag);
			try {
				// 调用login方法,进行身份验证,会自动委托给 SecurityManager.login 方法进行登录
				currentUser.login(token);
				// cookie不支持中文，所以要进行一个设置存储格式
				String utfName = URLEncoder.encode(username, "utf-8");
				// 登录成功后,可以将用户名和密码存储到Cookie中
				Cookie nameCookie = new Cookie("nameCookie", utfName);
				Cookie pwdCookie = new Cookie("pwdCookie", passwordHash);
				Cookie checkCookie = new Cookie("checkCookie", check);
				// 设置时长
				nameCookie.setMaxAge(60 * 60 * 24);
				pwdCookie.setMaxAge(60 * 60 * 24);
				checkCookie.setMaxAge(60 * 60 * 4);
				// 向客户端设置Cookie
				response.addCookie(nameCookie);
				response.addCookie(pwdCookie);
				response.addCookie(checkCookie);
				session.setAttribute("username", username);
				// 格式化日期时间
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String date = sdf.format(session.getStartTimestamp());
				session.setAttribute("accessTime", date);
				System.out.println("进入访问时间-----: " + date);
				// 调用财产总览方法
				
			} catch (AuthenticationException ae) {
				System.err.println(token.getUsername() + " :用户名或密码错误-----: ");
				session.setAttribute("err", "用户名或密码错误");
				return "login";
			}
		}
		// 将获取到的导航信息,保存到map中,可以在前端的requestScope域中访问到
		/*map.put("navList", getNav(name));
		return "index";*/
		getAccountInfo(map);
		return "index";
	}

	public Object getAccountInfo(Map<String, Object> map) {
		// 活期累计投资金额
		double yongliAll = borrowWishService.getYongliAll();
		// 定期累计投资金额
		double sumMoneyByProduct = borrowWishService.getSumMoneyByProduct();
		// 累计投资总额
		double sumMoney = yongliAll + sumMoneyByProduct;

		// 活期累计收益
		double yongliProfit = borrowWishService.getYongliProfit();
		// 定期累计收益
		double sumProductProfit = borrowWishService.getSumProductProfit();
		// 累计收益
		double sumProfit = yongliProfit + sumProductProfit;

		// 有效投资人数
		int peopleCount = userAccountLogService.getPeopleCount();

		// 累计提现总额
		double totalWithdraw = userWithdrawService.getTotalWithdraw();

		// 累计发放工资总额
		double labTotal = userLaborageService.getLabTotal();

		// 有效提现人数
		int withdrawPeopleCount = userWithdrawService.getWithdrawPeopleCount();

		// 永利宝当前规模
		double yonglibao = borrowWishService.getYonglibao();
		// 定期当前规模
		double wishAlreadyMoney = borrowWishService.getWishAlreadyMoney();
		// 累计投资总额,累计收益总额
		map.put("sumMoney", sumMoney);
		map.put("sumProfit", sumProfit);
		// 投资有效人数，累计提现金额
		map.put("peopleCount", peopleCount);
		map.put("totalWithdraw", totalWithdraw);
		// 累计发放工资,提现有效人数
		map.put("labTotal", labTotal);
		map.put("withdrawPeopleCount", withdrawPeopleCount);
		// 累计投资金额
		map.put("yongliAll", yongliAll);
		map.put("sumMoneyByProduct", sumMoneyByProduct);
		// 收益
		map.put("yongliProfit", yongliProfit);
		map.put("sumProductProfit", sumProductProfit);
		// 产品规模
		map.put("yonglibao", yonglibao);
		map.put("wishAlreadyMoney", wishAlreadyMoney);

		System.out.println("累计投资总额:-----" + sumMoney);
		System.out.println("累计收益:-----" + sumProfit);
		System.out.println("有效投资人数:-----" + peopleCount);
		System.out.println("累计提现总额:-----" + totalWithdraw);
		System.out.println("累计发放工资总额:-----" + labTotal);
		System.out.println("有效提现人数:-----" + withdrawPeopleCount);
		System.out.println("活期累计投资总额:-----" + yongliAll);
		System.out.println("定期累计投资总额:-----" + sumMoneyByProduct);
		System.out.println("活期累计收益:-----" + yongliProfit);
		System.out.println("定期累计收益:-----" + sumProductProfit);
		System.out.println("永利宝当前规模:-----" + yonglibao);
		System.out.println("定期当前规模:-----" + wishAlreadyMoney);
		System.out.println("有效投资人数:-----" + peopleCount);
		return map;
	}

}
