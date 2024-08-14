package com.codegym.polymorphism.example_01;

public class ZooManagement {

    public static void main(String[] args) {
        Animal miu = new Cat();
        Animal donan = new Duck();

        miu.speak();// "Meow Meow"
        donan.speak();// "Quack quack"
    }
}
