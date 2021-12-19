package com.chj.pojo;

/**
 * @author ：chj
 * @date ：Created in 2021/11/9 20:21
 * @params :
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                '}';
    }
}
