public class Clothes {

    public static void main(String[] args){ // main method that can be run
        System.out.println("hello");
        Clothes.privateMethod(); // private method can be accessed from inside the class easily
    }
    // methods
    public static void iAmRedShirt() {
        System.out.println("1 4m 4 red Sh1rT");
    }
    public static void iAmBlackShirt() {
        System.out.println("1 4m 4 black Sh1rT");
    }

    private static void privateMethod(){
        System.out.println("printing private method");
    }

}
