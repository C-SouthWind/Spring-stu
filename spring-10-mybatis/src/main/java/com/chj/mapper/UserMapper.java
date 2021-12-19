package com.chj.mapper;

import com.chj.pojo.User;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2021/11/18 21:03
 * @params :
 */
public interface UserMapper {
    public List<User> selectUser();
}
