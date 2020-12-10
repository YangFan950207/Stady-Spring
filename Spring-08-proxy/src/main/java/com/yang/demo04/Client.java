package com.yang.demo04;

import com.yang.demo2.UserService;
import com.yang.demo2.UserServiceImplT;

public class Client {

    public static void main(String[] args) throws Throwable {
        //真实角色
        UserServiceImplT userService = new UserServiceImplT();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置要代理的对象
        pih.setTarget(userService);
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();



    }

}
