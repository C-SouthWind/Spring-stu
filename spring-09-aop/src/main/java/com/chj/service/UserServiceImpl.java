package com.chj.service;

/**
 * @author ：chj
 * @date ：Created in 2021/11/17 22:32
 * @params :
 */
public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("增加了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("增加修改了一个用户");
    }

    public void select() {
        System.out.println("查询了一个用户");
    }
}
