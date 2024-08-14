package com.codegym.inheritance;

public class StudentV2 {

    private int id;
    public String name;
    protected int age;

    public StudentV2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void study() {
        System.out.println("Learn Something");
    }

    @Override
    public String toString() {
        return "StudentV2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
