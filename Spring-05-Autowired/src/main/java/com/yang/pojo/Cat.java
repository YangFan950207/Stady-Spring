package com.yang.pojo;

public class Cat {

    private String name;
    private String someThing;

    public String getName() {
        return name;
    }
    public String getSomeThing() {
        return someThing;
    }
    public void shut(){
        System.out.println("喵喵喵~");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", someThing='" + someThing + '\'' +
                '}';
    }
}
