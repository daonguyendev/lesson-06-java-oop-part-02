package com.codegym.inheritance;

public class CGStudent extends StudentV2 {
    private String major;

    public CGStudent(int id, String name, int age, String major) {
        super(id, name, age);
        this.major = major;
    }

    @Override
    public void study() {
        System.out.println("Learn Coding");
    }

    public void getStudyV2() {
        System.out.println(super.name);
        super.study();
    }

    public static void main(String[] args) {
        CGStudent cgStudent = new CGStudent(1, "Khang", 18, "Coding");
//        System.out.println(cgStudent.id);//error
        System.out.println(cgStudent.name);
        System.out.println(cgStudent.age);
        cgStudent.study();

        //Extend property of sub-class (child class)
        System.out.println(cgStudent.major);

        //Override method of sup-class (parent class)
        cgStudent.study();//"Learn Coding"

        //super keyword
        cgStudent.getStudyV2();//"Learn Something"
    }
}
