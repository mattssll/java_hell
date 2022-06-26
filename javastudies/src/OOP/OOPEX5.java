public class OOPEX5 implements OOPEX6{
    // OOP5EX5 "implements" the methods blueprinted by our interface in OOPEX6
    // You can have different implementations of the same interface, w/
    // different definitions for the same methods, you
    // just gotta create another class like this one to have another implementation of OOPEX6 (should do implements OOPEX6)
    public static void main (String[] args) {
        OOPEX5 interfaceObj = new OOPEX5();
        interfaceObj.doublePii();
        interfaceObj.piiIsGone();
        interfaceObj.returnPii();
    }
    @Override
    public void doublePii() {
        System.out.println("double PII is: " + pii*2); 
    }
    @Override
    public void piiIsGone() {
        System.out.println("wow, PII is gone: " + pii*2); 
    }
    @Override
    public void returnPii() {
        System.out.println("PII is: " + pii*2); 
    }
}
