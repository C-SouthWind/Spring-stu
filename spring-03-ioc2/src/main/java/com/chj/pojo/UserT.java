package com.chj.pojo;

/**
 * @author ：chj
 * @date ：Created in 2021/11/10 20:02
 * @params :
 */
public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name=" + name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
