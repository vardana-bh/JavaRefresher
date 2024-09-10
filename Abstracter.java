
abstract class Calc {
    Calc() {
        System.out.println(" Constructor Calc ");
    }
    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    final double simpleInterest(float roi, int principal, int numOfYear) {
        return (principal * roi * numOfYear) / 100;
    }
}

class Calc1 extends Calc {
    Calc1(int a) {
    }
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}


class Abstracter {
    public static void main(String[] args) {
        new Calc1(2);
    }
}