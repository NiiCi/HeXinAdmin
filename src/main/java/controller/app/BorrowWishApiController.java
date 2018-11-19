package controller.app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.BorrowWish;
import service.app.impl.BorrowWishApiBizImpl;

@Controller
public class BorrowWishApiController {
	@Autowired
	BorrowWishApiBizImpl biz;

	@RequestMapping(value = "BorrowWishApi", method = RequestMethod.GET)
	@ResponseBody
	public Object selectBorrowWishApi(@RequestParam int id) {
		Map<String, Object> map = new HashMap<String, Object>();

		BorrowWish bWish = biz.selectAllApi(id);
		// ��Ʒ����
		int type1 = bWish.getWishType();
		String type = null;
		if (type1 == 1) {
			type = "�������";
		} else if (type1 == 2) {
			type = "�������";
		}
		map.put("type", type);

		// Ԥ�������껯������
		double wish_apr = bWish.getWishApr();
		map.put("wish_apr", wish_apr);
		// Ͷ������
		int WishTime = bWish.getWishTime();
		map.put("WishTime", WishTime);
		// ���ʽ
		String wish_repay_style = bWish.getWishRepayStyle();
		map.put("wish_repay_style", wish_repay_style);
		// ��Ͷ���
		double investment_amount = bWish.getInvestmentAmount();
		map.put("investment_amount", investment_amount);
		// Ͷ���ܶ�
		double WishMoney = bWish.getWishMoney();

		map.put("WishMoney", WishMoney);
		// �Ѿ�Ͷ�ܶ�
		double WishAlreadyMoney = bWish.getWishAlreadyMoney();

		map.put("WishAlreadyMoney", WishAlreadyMoney);
		// ʣ���Ͷ���
		double Money = bWish.getWishMoney() - bWish.getWishAlreadyMoney();

		map.put("Money", Money);
		// Ԥ�Ƴɽ�ʱ��
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd ");// �������ڸ�ʽ
		String time1 = df.format(new Date());

		map.put("time1", time1);
		// ����ʱ��
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.DAY_OF_MONTH, 1);
		String time2 = df.format(c.getTime());
		map.put("time2", time2);
		// ����ʱ��
		long EndDate = bWish.getEndDate();
		String time3 = df.format(new Date(EndDate * 1000));
		map.put("time3", time3);
		
		//ÿ��ԪԤ������
		double moneyEnd1=wish_apr*100/365;
      BigDecimal bg = new BigDecimal(moneyEnd1).setScale(2, RoundingMode.UP);
       double moneyEnd= bg.doubleValue();
		map.put("moneyEnd", moneyEnd);
		return map;
	}
}
