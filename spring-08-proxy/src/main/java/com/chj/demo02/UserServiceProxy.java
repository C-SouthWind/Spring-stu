package com.chj.demo02;

/**
 * @author ：chj
 * @date ：Created in 2021/11/17 20:38
 * @params :
 */
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void log(String name){
        System.out.println("使用了" + name + "方法");
    }
}
