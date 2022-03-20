public class OOPEX3 extends OOPEX4{ // extends for inheritance
    
    public static void main (String[] args) {
        // getting and setting private vars with methods (encapsulation)
        // create object first
        OOPEX4 myNameObject = new OOPEX4();
        myNameObject.setName("mattssll");
        String theNameIs = myNameObject.getName();
        System.out.println("the name is: " + theNameIs);
    }

}
