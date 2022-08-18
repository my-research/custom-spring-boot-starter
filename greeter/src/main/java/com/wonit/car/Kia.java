package com.wonit.car;

public class Kia implements Car<Engine> {

    @Override
    public void drive(Engine engine) {
        engine.print();
    }
}
