import java.util.Locale;

public class Functions
{
    // defining our first function
    public static int doubled(int x) {
        return x*x;
    }

    public static String stringWork(String y) {
        String upperY = y.toUpperCase();
        System.out.println(upperY);
        System.out.println("length of string is " + y.length());
        return "it worked";
    }


    public static void main(String[] args) {
        int doubledresult = doubled(10);
        System.out.println("result is " + doubledresult);
        String executionFx = stringWork("hehehehe");
}






}
