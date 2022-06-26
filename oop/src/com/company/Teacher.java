package com.company;

public class Teacher extends User implements Study {

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHi() {
        System.out.println("Hello, I'm a teacher");
    }

    @Override
    public void Study() {
        System.out.println("I'm a teacher and I'm implementing my studies through this interface, it's so hard to manage everything and still have time to study!");
    }
}
