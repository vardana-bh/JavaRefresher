/**
 * InnerInterfacer
 */

 // Interface can extend another interface, but cannot implement another interface.
interface Inter1 {
    // By default all variables in interface is public final static
    // Static variables pariticipates in inheritance.
    final static float pi = 3.42f;

    // By default all the methods have public abstract signature
    void inter1Method1();
    void commonMethod();

    // Interface methods can have a body also
    // make the method as static
    // Static method of interface do not participate in inheritance.
    static void disp() {
        System.out.println(" SOme message ");
    }

    // default keyword : using this signature method will have a body
    // We can override if needed, else we can use the interface implementation also
    default void display() {
       System.out.println(" SOme display message!! ");
    }


    
}

interface Inter2 {
    void inter2Method1();
    void commonMethod();

}

class SomeClass implements Inter1, Inter2 {

    @Override
    public void inter2Method1() {
        System.out.println("Unimplemented method 'inter2Method1'");
    }

    @Override
    public void inter1Method1() {
        System.out.println("Unimplemented method 'inter1Method1'");
    }

    public void commonMethod() {
        System.out.println(" Common Method ");
    }

    @Override
    public void display() {
        Inter1.super.display();
        System.out.println(" Overridden Display ");
    }

}
public class Interfacer {
    public static void main(String[] args) {
        // Using SomeClass Ref;
        SomeClass someClass = new SomeClass();
        someClass.inter1Method1();
        someClass.inter2Method1();
        someClass.commonMethod();
        someClass.display();

        // Using Ref of parent interface to achieve polymorphism
        Inter1 someClass1 = new SomeClass();
        someClass1.inter1Method1();
        ((SomeClass)someClass1).inter2Method1();
        someClass1.commonMethod();
        someClass1.display();
        System.out.println(Inter1.pi);
        Inter1.disp();
    }
}
