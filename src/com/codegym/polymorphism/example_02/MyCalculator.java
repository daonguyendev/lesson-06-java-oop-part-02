package com.codegym.polymorphism.example_02;

public class MyCalculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));//3
        System.out.println(calculator.sum(1, 2, 3));//5
    }
}
