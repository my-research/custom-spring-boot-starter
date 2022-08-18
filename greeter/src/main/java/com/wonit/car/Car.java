package com.wonit.car;

public interface Car<T extends Engine> {
    void drive(T t);
}
