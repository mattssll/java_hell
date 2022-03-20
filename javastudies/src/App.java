import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class App {
    public static void main(String[] args) throws Exception {
        //calling a function
        String myString = addExclamationSymbol("hello world");
        System.out.println("printing returned value from method: " + myString);
        Clothes redShirt = new Clothes(); // creating an object from the Clothes class
        redShirt.iAmRedShirt(); // calling a method
        Clothes.iAmRedShirt(); // to remove warning, not access thru object but thru class
        Clothes blackShirt = new Clothes();
        blackShirt.iAmBlackShirt();
        String varTest = tryExceptionTest("hello");
        System.out.println(varTest);
        firstStudies();
        // we can't  access so easily a private class from outside the class - Clothes.privateMethod();
    }



    public static void firstStudies() throws Exception {
        System.out.println("Hello, World! from firstStudies method");
        //data types:
        //boolean, byte, char, short, int, long, float, double
        // non-primitive types:
        //String,
        Integer myInt = 50;
        String myVar = "hello again world";
        // creating a list and adding some values onto it
        ArrayList<String> people = new ArrayList<String>();
        people.add("john");
        people.add("bob");
        people.add("marta");
        people.set(0, "frederick"); // this will change from "john" to "frederick" - index 0
        Collections.sort(people); // sorts from a to z or 1 to n

        int [] myArray = {1,3, 2, 5, 4};
        int zz = 0;
        Arrays.sort(myArray);
        //2nd way of defining a list of strings
        List<String> countries = Arrays.asList("Germany", "Panama", "Australia");

        for (int i = 0; i<people.size(); i++){
            System.out.println(people.get(i));
            System.out.println("my arr: "+myArray[i]);
            //System.out.println(countries.get(i));
        }
        // forEach style
        for (String country : countries) { //same as python with for item in items
            System.out.println(country);
        }
    }

    public static String tryExceptionTest(String myStr) throws Exception { // this is a function
        try {
            //Integer test = 5/0; // this should fail because we can't divide by 0, Excetion e will capture it
            return "log: it worked";
        } catch (Exception e) {
            System.out.println("log: exception raised, printing the exception e: "+e);
            throw new Exception(e); // this will fail the app, if we didn't want that we could use a return
        } finally {
            System.out.println("app is closed"); // this happens
        }
        
    }
    public static String addExclamationSymbol(String s){
        return s + "!";
    }
}

