package com.codegym.abstraction.interface_example;

public class Airplane implements Flyable, Movable {
    @Override
    public void fly() {
        System.out.println("Start engine to fly...");
    }

    @Override
    public void move() {
        System.out.println("Moving on runway...");
    }
}
