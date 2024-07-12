package FullStringConcept;

public class String13 {

    public static void main(String[] args) {

        final StringBuffer sb = new StringBuffer("rehan");
         sb.append("Shakeel");
         System.out.println(sb);
//        sb = new StringBuffer("jj");


       /* output: rehanShakeel : This is not Immutability behaviour
        Here the significance of this final is to we cannot reassign the reference variable
         here reference variable is 'sb'

         */
    }



}

//final vs Immutability
//Final is different and Immutability is different
//Immutability is related to Object while Final related to reference variable

// Terminology:-
// Final Variable and immutable object.
