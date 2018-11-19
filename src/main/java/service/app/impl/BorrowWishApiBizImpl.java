package service.app.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BorrowWishMapper;
import entity.BorrowWish;
import service.app.dao.BorrowWishApiBiz;
@Service("borrowWishApiBiz")
public class BorrowWishApiBizImpl implements BorrowWishApiBiz{
   @Autowired
   BorrowWishMapper borrowWishMapper;
   /**
    * 理财产品详情展示(api)
    */
   @Override
  public BorrowWish selectAllApi(int id){
	 return borrowWishMapper.selectAllApi(id);
  }
}
