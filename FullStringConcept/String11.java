package FullStringConcept;

public class String11 {
    public static void main(String[] args) {

/*        String s1 = new String("rehan");

        String s2 = s1.toUpperCase();
        String s3 = s1.toLowerCase();


        System.out.println(s1==s2); //false ... If their will be change new Object is created in Heap.
        System.out.println(s1==s3); //true... If not no new Object formation will be happened.*/


        System.out.println("--------------");

        String s1 = "durga";
        String s2 = s1.toString();
        String s3 = s1.toLowerCase();
        String s4 = s1.toUpperCase();

        System.out.println(s1==s2); //true coz No change in the content no object formation in SCP memory area.
        System.out.println(s1==s3); //true coz No change in the content no object formation in SCP memory area.
        System.out.println(s1==s4); //false content change so new Object formation is happened.

      //   Note:- Once we create our Object no one is allows to change its content. If Any person trying to change content
     //             with those changes new Object is created. If no changes in object existing object is reuses.





    }
}
