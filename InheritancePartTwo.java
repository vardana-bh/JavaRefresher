// Constructor does not participate in inheritance.

// Final class cannot be inherited.
// Final method cannot be overridden.
// Final variable cannot be re-assigned.

class InheritParent {
    final String some = "Some plate";
    void fly() {
        System.out.println("InheritParent: Fly");
    }
}

class InheritChild extends InheritParent {
    void fly() {
        System.out.println("InheritChild: Fly");
    }
}


public class InheritancePartTwo {
    public static void main(String[] args) {
        InheritChild inheritChild = new InheritChild();
        inheritChild.fly();
    }
}
