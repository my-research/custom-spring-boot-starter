package com.wonit;

import java.time.LocalDateTime;

public class Greeter {

    public void greet(LocalDateTime localDateTime) {
        System.out.println("hello > " + localDateTime);
    }

    public void greet() {
        greet(LocalDateTime.now());
    }

}