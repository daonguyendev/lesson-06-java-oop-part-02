package com.codegym.abstraction.abstract_class;

public class ZooManagement {

    public static void main(String[] args) {
        Animal miu = new Cat();
        miu.speak();
        miu.move();

        Animal donan = new Duck();
        donan.speak();
        donan.move();
    }
}
