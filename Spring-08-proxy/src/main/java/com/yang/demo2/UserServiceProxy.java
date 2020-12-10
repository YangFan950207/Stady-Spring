package com.yang.demo2;

public class UserServiceProxy implements UserService {
    UserServiceImpl userService;

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        userService.add();
        log("add");
    }

    public void delete() {
        userService.delete();

        log("delete");
    }

    public void update() {
        userService.update();
        log("update");
    }

    public void query() {
        userService.query();
        log("query");
    }
    //日志方法
    public void log(String msg){
        System.out.println("使用了" +msg+ "方法");
    }
}
