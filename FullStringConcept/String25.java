package FullStringConcept;

public class String25 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Durga");
        String str1 = sb1.toString();
        String str2 = str1; //this answer

        System.out.println(str1==str2); //true
    }
}
