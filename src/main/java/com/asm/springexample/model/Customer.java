package com.asm.springexample.model;

/**
 * Created by LecAnibal on 10/25/17.
 */
public class Customer {

    private  String id;
    private int age ;
    private  String name;

    public Customer() {
    }

    public Customer(String id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}