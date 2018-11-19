package controller.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import service.app.dao.UserApiBiz;




@Controller
public class UserApiController {
        @Autowired
        UserApiBiz uBiz;
    //交易密码管理
	@RequestMapping(value = "updatePayPassword", method = RequestMethod.GET)
	@ResponseBody
	public  Map<String, String> updatePayPassword(@RequestParam int id,String pwd){
		Map<String, String> map=new HashMap<>();
		String back;
		int rs=uBiz.updatePayPassword(id, pwd);
		if(rs>0){
			back="设置交易密码成功";
			
		}else{
			back="设置交易密码失败";
		}
		map.put("back", back);
		return map;
	}
	
	//投资支付
	@RequestMapping(value = "PayMoney", method = RequestMethod.GET)
	@ResponseBody
	public  Map<String, String> PayMoney(@RequestParam int id,Double moneny,int type,int wishid){
		Map<String, String> map=new HashMap<>();
		String back;
		int rs=uBiz.PayMoney(id, moneny,type,wishid);
	
		if(rs>0){
			back="支付成功";
			
		}else{
			back="余额不足";
		}
		map.put("back", back);
		return map;
	}
	//提现接口
	@RequestMapping(value = "DrawMoney", method = RequestMethod.GET)
	@ResponseBody
	public  Map<String, String> DrawMoney(@RequestParam int id,Double money){
		Map<String, String> map=new HashMap<>();
		String back;
		int rs=uBiz.DrawMoney(id, money);
	
		if(rs>0){
			back="提现成功";
			
		}else{
			back="余额不足";
		}
		map.put("back", back);
		return map;
	}
}
	
