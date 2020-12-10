package com.yang.config;

import com.yang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.yang.pojo")
@Import(YangConfig2.class)
public class YangConfig {
    /*
    * 注册一个bean,就相当于之前写的bean标签.
    * 这个方法的名字,就相当于bean标签中的id属性
    * 这个方法的返回值.就相当于bean标签中的class属性
    * */
    @Bean
    public User getUser(){
        User user = new User();
        user.setAge("100");
        user.setName("霍克");
        return  user;
    }

    @Bean
    public String getStr(){
        return "这是一个String类型的返回值";
    }
}
