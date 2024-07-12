package FullStringConcept;

public class String16 {
    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = new String("java");


        if (s2.equalsIgnoreCase(s2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }


    }
}
