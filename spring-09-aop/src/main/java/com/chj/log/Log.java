package com.chj.log;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author ：chj
 * @date ：Created in 2021/11/17 22:34
 * @params :
 */
public class Log implements MethodBeforeAdvice {
    //method :要执行的方法
    //args : 参数
    // target : 目标对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
