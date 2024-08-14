package com.codegym.polymorphism.example_01;

//sub class
public class Duck extends Animal {

    //overriding technique
    @Override
    public void speak() {
        System.out.println("Quak quak");
    }
}
