
class Wrapper {
    // Auto Boxing -> Converting of primitive data type to Object wrapper type;
    Integer autoBox = 20; // Here 20 is primitive int. But Java will internally wrap it in Integer.

    // Boxing -> Converting of primitive data type to Object wrapper type;
    Integer boxxing = Integer.valueOf(20);
    
    // Auto Unboxing -> Convering of object wrapper type to primitive data type;
    int autoUnBox = Integer.valueOf(20); // Here Integer.valueOf(20) is wrapper Object Integer. But Java will internally convert it to primitive int and assign the value to autoUnBox.

    // Unboxing -> Convering of object wrapper type to primitive data type;
    int unboxing = Integer.valueOf(20).intValue();

    // Java Init block
    {
        System.out.println(autoBox);
    }
}

public class BoxingUnBoxing {
    public static void main(String[] args) {
        new Wrapper();
    }
}
