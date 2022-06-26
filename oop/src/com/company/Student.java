package com.company;

public class Student extends User implements Study {

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHi() {
        System.out.println("Hello, I'm a student");
    }

    @Override
    public void Study() {
        System.out.println("I'm a student and I'm implementing my studies through this interface, it's easy so far");
    }
}
