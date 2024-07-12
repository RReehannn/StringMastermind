package FullStringConcept;

public class String15 {
    public static void main(String[] args) {

        String str = " ";
        str.trim();
        System.out.println(str.equals("") + " " + str.isEmpty());
        // Output: false and false

        System.out.println();

        String s = "DURGA SOFT";
        int len = s.trim().length();
        System.out.println(len);
        //Output: 10 coz trim not takle space middle of the string its only trim front and last space.


        String s1 = "Hello World";
        s1.trim();
        int i1 = s1.indexOf(" ");
        System.out.println(i1);
        //Output: 5
    }
}
