package FullStringConcept;

import java.util.Scanner;

public class String10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, Enter Your City Name:- ");
        String name = sc.nextLine().toLowerCase().trim();

        if (name.equals("hyderabad")){
            System.out.println("Hello Hyderabadi, Aadaab......");
        } else if (name.equals("chennai")) {
            System.out.println("Hello Madarasi, Vanakkam");

        } else if (name.equals("bangalore")) {
            System.out.println("Hello Kannadiga , namaskara....");

        } else {
            System.out.println("Please Enter valid City name");
        }
    }


}
