package com.yang.demo2;

public class UserServiceImplT implements UserService{
    public void add() {
        System.out.println("这是第二个UserADD");
    }

    public void delete() {
        System.out.println("这是第二个UserDELETE");
    }

    public void update() {
        System.out.println("这是第二个UserUPDATE");
    }

    public void query() {
        System.out.println("这是第二个UserQUERY");
    }
}
