package com.wonit.car;

import org.junit.jupiter.api.Test;

class CarTest {

    FancyEngine fancyEngine = new FancyEngine();
    SimpleEngine simpleEngine = new SimpleEngine();

    @Test
    void name() {
        Car<Engine> car = new Kia();

        car.drive(simpleEngine);
    }

    @Test
    void name2() {
        Car<Engine> car = new Tesla();

        car.drive(fancyEngine);
    }
}