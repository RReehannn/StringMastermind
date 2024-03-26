package Function;

import java.util.Scanner;

public class UpperLowerAndCon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "Rehan Shakeel";
        System.out.println(str.toUpperCase()); //Output: REHAN SHAKEEL
        System.out.println(str.toLowerCase()); //Output: rehan shakeel

        System.out.println("Concatenation\n");
        String s1 = "abc";
        String s2 = "def";

        System.out.println(s1.concat(s2));
    }
}
