package FullStringConcept;

public class String14 {
    public static void main(String[] args) {

        String ta = "A";
        ta=ta.concat("B");

        String tb = "C";
        ta= ta.concat(tb);

        ta.replace('C', 'D');
        ta = ta.concat(tb);
        System.out.println(ta);
        //Output: ABCC

        /*  line 6 --> A is created with ta reference
            Line 7 --> AB is created coz we assign the reference of 'ta'
            so line 6 object is for garbage collection, New value of ta is AB.

            line 9 --> C is created with tb reference
            Line 10 --> object is created new value of ta is 'ABC'. Line 6 object for garbage collection.

            line 12--> new Object is created but value of ta is remain 'ABC' coz we didn't assign the value of ta.
            line13--> object is created tb value is 'ABCC', Line 9 object for garbage collection.
              That is the output as well/



        *
        *
        * */


    }
}
