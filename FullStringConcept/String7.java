package FullStringConcept;

public class String7 {
    public static void main(String[] args) {

        String s1 = new String("You cannot change Me");
        String s2 = new String("You cannot change Me");
        System.out.println(s1==s2); //Output: false

        String s3 = "You cannot change Me";
        System.out.println(s1==s3); //output: false

        String s4 = "You cannot change Me";
        System.out.println(s3==s4); //output: true

        String s5 = "You cannot " + "change Me";
        System.out.println(s4==s5); //output : true

        String s6 = "You cannot ";
        String s7 = s6 + "change Me";
        System.out.println(s4==s7); //output: false

        final String s8 = "You cannot ";
        String s9 = s8 + "change Me";
        System.out.println(s4==s9); //output: true



        /*

             s1--> Two Object is created one in heap as "You cannot change Me" and
                    second in SCP as "You cannot change Me".
                    reference s1 pointing "You cannot change Me"

             s2--> One Object is created in heap as "You cannot change Me"
                    reference s2 pointing "You cannot change Me"
                    second object is not created in SCP coz "You cannot change Me" reference is already their

                   Answer:- s1==s2 is false coz both s1 and s2 pointing different address.

             s3--> No Object formed in SCP coz "You cannot change Me" reference is already their.
                   yes s3 address pointing "You cannot change Me" in SCP.

                  Answer:-  s1==s3 output is false coz both s1 and s3 pointing different address
                   s1 address has heap space while s3 address has SCP.

            s4-->  No Object formed in SCP coz "You cannot change Me" reference is already their.
                   yes s4 address pointing "You cannot change Me" in SCP.

                  Answer:-  s3==s4 output is true coz both are pointing same address

           s5--> Both are taken as constant so data operation is done at compile time by the JVM,
                  that is why no Object is formed one again.
                  s5 pointing the same address as s4 and s3.

                  Answer:- s4==s5 is true. coz both are pointing the same address

           s6--> one object is formed in SCP as "You cannot"
                 s6 pointing the address in SCP "You cannot"

           s7--> Two Object is formed in SCP. "You cannot change me" in SCP area with s7 reference and
                        "change Me" with no reference.
                        s7 pointing "You cannot change Me"

                        Answer:- s4==s7 false. coz both are pointing the different address

            s8--> No object is formed coz "You Cannot " is already in SCP.
            s9--> No object is formed once again coz JVM take two constant.
               s9 pointing the same address as the s3, s4, s5 pointing .

               Answer s4==s9 true. s9 pointing the same address as the s3, s4, s5 pointing .
        *
        *

        */




    }
}
