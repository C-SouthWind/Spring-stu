package com.chj.demo4;



import com.chj.demo3.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：chj
 * @date ：Created in 2021/11/17 21:42
 * @params :
 */
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
      return   Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射机制实现！
        log(method.getName());
        Object invoke = method.invoke(target, args);
        return invoke;
    }

    public void log(String msg){
        System.out.println("调用了" + msg + "方法");
    }
}
