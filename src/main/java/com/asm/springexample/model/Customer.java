package com.asm.springexample.model;

/**
 * Created by LecAnibal on 10/25/17.
 */
public class Customer {

    private final String id;
    private final String content;
    private final String name;
    public Customer(String id, String content, String name) {
        this.id = id;
        this.content = content;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }
}