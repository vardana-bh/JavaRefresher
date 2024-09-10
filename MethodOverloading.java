class Calc {
    double add(double a, double b) {
        System.out.println("double a, double b");
        return a + b;
    }

    double add(int a, double b) {
        System.out.println("int a, double b");
        return a + b;
    }

    double add(double a, int b) {
        System.out.println("double a, int b");
        return a + b;
    }

    int add(int a, int b) {
        System.out.println("int a, int b");
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.add(1, 2D);
    }
}
