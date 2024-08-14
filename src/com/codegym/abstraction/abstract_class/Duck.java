package com.codegym.abstraction.abstract_class;

public class Duck extends Animal{
    @Override
    public void speak() {
        System.out.println("Quack Quack");
    }

    @Override
    public void move() {
        System.out.println("Swimming...");
    }
}
