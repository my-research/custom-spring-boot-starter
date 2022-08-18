package com.wonit.car;

public class Tesla implements Car<Engine> {

    @Override
    public void drive(Engine engine) {
        engine.print();
    }
}
