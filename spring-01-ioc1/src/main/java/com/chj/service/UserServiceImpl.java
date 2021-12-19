package com.chj.service;

import com.chj.dao.UserDao;

/**
 * @author ：chj
 * @date ：Created in 2021/11/9 19:54
 * @params :
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }


}
