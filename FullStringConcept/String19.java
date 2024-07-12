package FullStringConcept;

public class String19 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("rehan");

        System.out.println(sb.length()); // 5
        System.out.println(sb.capacity()); //21
        System.out.println(sb.charAt(3)); //a
      //  System.out.println(sb.charAt(30)); //StringIndexOutOfBoundsException

        System.out.println(sb);




    }
}
