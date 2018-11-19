package dao;

import entity.AdminUser;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminUser record);

    AdminUser selectByPrimaryKey(Integer id);

    List<AdminUser> selectAll();

    int updateByPrimaryKey(AdminUser record);
    
    //登录时 通过用户名查询正确的用户密码
    AdminUser  queryAdminByName(String username);
    //管理员登录功能
    AdminUser loginCheck(@Param("username") String username,@Param("passwordHash") String passwordHash);
}