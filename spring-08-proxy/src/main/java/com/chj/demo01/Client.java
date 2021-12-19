package com.chj.demo01;

import com.chj.demo3.Host;

/**
 * @author ：chj
 * @date ：Created in 2021/11/16 23:11
 * @params :
 */
public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理，中介帮房东租房子， 代理会有一些附属操作
        Proxy proxy = new Proxy(host);
        //不用面对房东，直接找中介租房即可
        proxy.rent();
    }
}
