package com.chj.demo01;

import com.chj.demo3.Host;
import com.chj.demo3.Rent;

/**
 * @author ：chj
 * @date ：Created in 2021/11/16 23:13
 * @params :
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    public void seeHouse(){
        System.out.println("中介带你看房");
    }

    public void hetong(){
        System.out.println("签租赁核体");
    }
    public void fare(){
        System.out.println("收中介费");
    }
}
