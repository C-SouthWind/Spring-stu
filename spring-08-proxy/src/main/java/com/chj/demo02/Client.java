package com.chj.demo02;

/**
 * @author ：chj
 * @date ：Created in 2021/11/17 20:25
 * @params :
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        //userService.add();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);
        proxy.add();
    }
}
