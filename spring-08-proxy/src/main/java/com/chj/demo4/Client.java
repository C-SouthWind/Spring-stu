package com.chj.demo4;

import com.chj.demo02.UserService;
import com.chj.demo02.UserServiceImpl;

/**
 * @author ：chj
 * @date ：Created in 2021/11/17 22:02
 * @params :
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
