package com.company;

class Main {

    public static void main(String[] args) {

        Teacher john = new Teacher("John", 34);
        Student mary = new Student("Mary", 34);
        mary.sayHi();
        System.out.println(john.name);
        mary.Study();
        john.sayHiStd();
    }
}