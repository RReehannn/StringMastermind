package Function;

import java.util.Scanner;

public class StringIntChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "abc";
        str += "xyz";
        str += 'r';
        str += 10;
        System.out.println(str); //Output: abcxyzr10
        System.out.println();
        System.out.println("abc" + "def"); // Result: abcdef
        System.out.println("abc" + 10); // Result: abc10
        System.out.println("abc" + 10 + 20); //Result: abc1020
        System.out.println(10 + 20 + "abc");  //Result: 30abc (Process has happened Left To Right)
        System.out.println("abc" + (10+20)); // Result: abc30

    }
}
