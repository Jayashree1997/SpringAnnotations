package com.stackroute.domain;

public class Actor {


    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public void setAge(int age) {
        this.age = age;
    }

    private String gender;
    private int age;
}


