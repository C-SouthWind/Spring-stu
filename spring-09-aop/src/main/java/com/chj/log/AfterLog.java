package com.chj.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author ：chj
 * @date ：Created in 2021/11/17 22:37
 * @params :
 */
public class AfterLog implements AfterReturningAdvice {
    //returnValue 返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName()+"方法，返回结果为"+returnValue);
    }
}
