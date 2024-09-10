class StatiPartTwo {
    static {
        System.out.println("Static Block executed 1!");
        disp(1);
    }

    private static int staticInteger = 20;
    // private static Integer staticInteger = Integer.valueOf(20);

    static {
        System.out.println("Static Block executed 2!");
        disp(2);
    }

    static void disp(Integer staticBlockNumber) {
        System.out.println("From Static Block "+ staticBlockNumber + " -  Static Integer: " + staticInteger);
    }
}

public class StaticPartTwo {
    public static void main(String[] args) {
        new StatiPartTwo();
    }
}
