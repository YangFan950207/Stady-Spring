package com.yang.demo01;
//我要租房子
public class Client {
    public static void main(String[] args) {
        //房东要出租
        Host host = new Host();
        //host.rent();
        //代理.代理了一些附属操作
        Proxy proxy = new Proxy(host);
        //你不需要面对房东,直接找中介即可!
        proxy.rent();
    }
}
