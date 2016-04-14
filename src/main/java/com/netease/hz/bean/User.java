package com.netease.hz.bean;

/**
 * Created by miracler on 4/14/16.
 */
public class User {
    int id;
    String name;
    int age;

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
}
