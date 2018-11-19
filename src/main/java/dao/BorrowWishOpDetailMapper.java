package dao;

import entity.BorrowWishOpDetail;
import java.util.List;

public interface BorrowWishOpDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BorrowWishOpDetail record);

    BorrowWishOpDetail selectByPrimaryKey(Integer id);

    List<BorrowWishOpDetail> selectAll();

    int updateByPrimaryKey(BorrowWishOpDetail record);
}