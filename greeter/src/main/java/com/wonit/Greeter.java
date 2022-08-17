package com.wonit;

import java.time.LocalDateTime;

public class Greeter {

    private final String name;
    private final int age;

    public Greeter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println(String.format("hello [%s], [%d]", name, age));
    }

}