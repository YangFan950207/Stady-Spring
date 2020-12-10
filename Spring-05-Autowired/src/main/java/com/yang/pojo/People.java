package com.yang.pojo;


import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class People {
  /*  @Autowired
    @Qualifier(value = "dog1")*/
   /* @Resource(type = Dog.class)*/
  /* @Autowired*/
 /* @Resource(name = "dog1")*/
    @Autowired
    private Dog dog;
  /*  @Autowired
    @Qualifier(value = "cat2")*/
 /*   @Resource(type = Cat.class)*/
    /*@Autowired*/
   @Resource(name = "cat2")
    private Cat cat;
    private String name;

    public Dog getDog() {
        return dog;
    }
    public Cat getCat() {
        return cat;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
