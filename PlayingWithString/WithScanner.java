package PlayingWithString;

import java.util.Scanner;

class WithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Type1 = input.next();
        System.out.println(Type1);
        // Input: Rehan shakeel
        // Output: Rehan

        newMethod();




    }
    public static void newMethod(){

        Scanner input = new Scanner(System.in);
        String Type2 = input.nextLine();
        System.out.print(Type2);
        // Input: Rehan Shakeel
        // Output: Rehan Shakeel

    }
}