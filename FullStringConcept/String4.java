package FullStringConcept;

public class String4 {
    public static void main(String[] args) {

        String s1 = new String("Rehan");
        String s2 = new String("Rehan");

        System.out.println(s1==s2); //false coz different address.

        String s3 = "Rehan";
        String s4 = "Rehan";

        System.out.println(s3==s4); //Output: true coz same address
        System.out.println(s1==s3); //output: false coz diff address
        System.out.println(s2==s4); //output: false coz diff address

      /*
             Only three Object is created Two in heap one in SCP.

             for s1--> Two Object is created one in heap and other in SCP area.
             for s2--> Only one Object is created in the heap. Object not created in SCP area
                         coz already in the SCP area their reference is presence.

             for s3--> no Object is formed coz already their reference is presence in SCP area.
             for s4 --> no object is formed same reason as s3

             Note: In the SCP area with same reference no new Object will be created.



       */

    }
}
