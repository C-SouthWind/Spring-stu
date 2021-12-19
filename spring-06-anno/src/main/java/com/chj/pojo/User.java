package com.chj.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ：chj
 * @date ：Created in 2021/11/16 19:54
 * @params :
 */
//等价于 <bean id="user" class="com.chj.pojo.User"/>
//@Component 组件
@Component
@Scope("prototype")
public class User {
    //相当于 <property name="name" value="chj"/>
    @Value("chj")
    public String name;
}
