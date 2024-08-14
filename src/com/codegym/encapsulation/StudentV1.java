package com.codegym.encapsulation;

public class StudentV1 {

    private int id;
    private String name;
    private int age;
    private final String CENTER_NAME = "CodeGym";

    public StudentV1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getCENTER_NAME() {
        return CENTER_NAME;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!!!");
        }
    }

    @Override
    public String toString() {
        return "StudentV1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
