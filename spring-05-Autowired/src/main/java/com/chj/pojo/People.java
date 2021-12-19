package com.chj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author ：chj
 * @date ：Created in 2021/11/15 19:28
 * @params :
 */
public class People {
    //如果显示定义Autowired的required属性为false，说明这个对象可以为null，否则不允许为空
    @Autowired
    @Qualifier(value = "cat1")
    private Cat cat;
    @Autowired
    @Qualifier(value = "dog2")
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
