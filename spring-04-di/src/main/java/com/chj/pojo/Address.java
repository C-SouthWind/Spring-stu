package com.chj.pojo;

/**
 * @author ：chj
 * @date ：Created in 2021/11/10 20:29
 * @params :
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
