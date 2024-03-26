package PracticeQuestion;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder str = new StringBuilder(input.nextLine());
        System.out.println(str);
        // Toggle
        // Input: PHysiCs  -> phYSIcS

        for(int i=0; i<str.length(); i++){
            // P -> p
            // check -> alphabet- small, capital
            boolean flag = true; // true -> capital
            char ch = str.charAt(i); // Eg: A
            if (ch== ' ') continue; //For contouring Space
            int asci = (int)ch; //65
            if (asci>=97) flag = false; //small
            if (flag==true){ // capital
                asci += 32;
                char dh = (char)asci; //a
                str.setCharAt(i,dh);
            } else { //small
                asci -=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);

            }


        }
        System.out.println(str);


    }
}
