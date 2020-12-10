package com.yang.demo01;

//中介.代理
public class Proxy {
    private Host host;

    public Proxy(){

    }

    public Proxy(Host host) {
        this.host = host;
    }
    public void rent(){
        seeHouse();
        fare();
        hetong();
        host.rent();

    }
    //看房
    public void  seeHouse(){
        System.out.println("中介带看房子!");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
    //签合同
    public void hetong(){
        System.out.println("签租赁合同");
    }

}
