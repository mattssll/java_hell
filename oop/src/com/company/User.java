package com.company;

public abstract class User {

    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public abstract void sayHi();

    public void sayHiStd(){
        System.out.println("My name is " + name + "and I'm Saying Hi From Abstract Class default method!");
    }

}
