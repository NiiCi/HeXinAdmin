package service.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BorrowWishMapper;
import entity.BorrowWish;

public interface BorrowWishApiBiz {
   /**
    * ��Ʋ�Ʒ����չʾ(api)
    */
  public BorrowWish selectAllApi(int id);
}
