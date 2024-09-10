class Demo {
    static int x,y,z; // Default 0 in Static block init
    int a, b, c; // Default 0 in Java block init

    static {
        System.out.println("Staic Block Initialization: ");
        x = 20;
        y = 10;
        z = 30;
    }

    public static void disp() {
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
        System.out.println("z: "+ z);
    }

    {
        System.out.println("Java Initialization block : ");
        a = 10;
        b = 20;
        c = 30;
    }

    void objectDisp() {
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("c: "+ c);
    }
}

public class Static {
    static int a = 20;

    static {
        System.out.println("Before Main : Static Block ");
    }
    public static void main(String[] args) {
        Demo.disp();
        (new Demo()).objectDisp();
    }
}
