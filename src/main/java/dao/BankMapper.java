package dao;

import entity.Bank;
import java.util.List;

public interface BankMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bank record);

    Bank selectByPrimaryKey(Integer id);

    List<Bank> selectAll();

    int updateByPrimaryKey(Bank record);
}