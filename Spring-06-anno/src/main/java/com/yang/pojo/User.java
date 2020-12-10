package com.yang.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class User {
    @Value("贝拉")
    public String name;
}
