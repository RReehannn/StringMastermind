package PlayingWithString;

public class interning {
    public static void main(String[] args) {
        String s = "Hello";
        String x = "Hello";
        x = "Mello";
        System.out.println(x);
        // String is immutable in Java
        // Why Immutability in String? Due to Interning
    }
}
