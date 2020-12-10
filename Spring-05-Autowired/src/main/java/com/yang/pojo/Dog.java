package com.yang.pojo;

public class Dog {
    private String name;
    private String someThing;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSomeThing() {
        return someThing;
    }

    public void setSomeThing(String someThing) {
        this.someThing = someThing;
    }
    public void shut(){
        System.out.println("汪汪汪~");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", someThing='" + someThing + '\'' +
                '}';
    }
}
