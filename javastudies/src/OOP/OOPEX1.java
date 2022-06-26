public class OOPEX1 extends OOPEX2{
    // with the extends bellow the OOPEX can earn by HERITAGE the methods from OOPEX2 
    String name;
    public void sayName() {
        System.out.println("My name!");
    }

    // polymorphism =
    // many methods with same name and different parameters
    // this is "overloading a method" - same name w/ different params or params name, etc
    public void sayName (String name) {
        System.out.println("My name is " + name);
    }
    // this method is overwriting the same "sayHi" method that exists in OOPEX2.java
    public void sayHi() {
        System.out.println("this is my hello overwriting the method from the OOPEX2 class");
    }
    public static void main(String [] args) {
        OOPEX1 e1 = new OOPEX1();
        e1.sayHi();
        e1.sayName("Jose");
    }
}
