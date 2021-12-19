package com.chj.pojo;

/**
 * @author ：chj
 * @date ：Created in 2021/11/10 19:35
 * @params :
 */
public class User {
    private String name;

    public User(String name) {
       this.name = name;
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
