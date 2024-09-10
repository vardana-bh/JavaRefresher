// Functional Interface
interface FunctionalInterface {
    void disp(String nameOfCoder);
}

public class Lambda {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = nameOfCoder -> System.out.println("Provided name " + nameOfCoder);
        functionalInterface.disp("Namer");
    }
}