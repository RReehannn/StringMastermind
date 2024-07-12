package FullStringConcept;

public class String2 {
    public static void main(String[] args) {

        String s1 = new String("Rehan");
        String s2 = new String("Rehan");

        System.out.println(s1==s2); //Output: false
        System.out.println(s1.equals(s2)); //Output: true

        System.out.println("..................");


        StringBuffer sb1 = new StringBuffer("Faizan");
        StringBuffer sb2 = new StringBuffer("Faizan");

        System.out.println(sb1==sb2); //Output: false
        System.out.println(sb1.equals(sb2)); //Output: false coz Object class equals methods for address/reference comparison

        /*

           == address/reference comparison.
           equals() content comparison3

          note:-  Object class equals methods for address/reference comparison
        *
        * */

    }
}
