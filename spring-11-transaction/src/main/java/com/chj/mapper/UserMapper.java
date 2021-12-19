package com.chj.mapper;

import com.chj.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.aspectj.lang.annotation.Pointcut;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2021/11/22 19:26
 * @params :
 */
public interface UserMapper {
    List<User> selectUser();

    //添加一个用户
    Integer addUser(User user);

    //删除一个用户
    Integer deleteUser(@Param("id") Integer id);
}
