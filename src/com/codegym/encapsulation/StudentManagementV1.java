package com.codegym.encapsulation;

public class StudentManagementV1 {

    public static void main(String[] args) {
        StudentV1 sA = new StudentV1(1, "Tý", 18);
        System.out.println(sA);

        //logic error if declare age property is public
//        System.out.println(sA.age);
//        sA.age = -19;
//        System.out.println(sA.age);

        //modify age property is private -> ensure encapsulation
        System.out.println(sA.getAge());
        sA.setAge(-19);
        System.out.println(sA.getAge());

        System.out.println(sA.getCENTER_NAME());
//        System.out.println(sA.CENTER_NAME);//error
//        System.out.println(sA.setCENTER_NAME());//error
    }
}
