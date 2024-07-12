package FullStringConcept;

public class String6 {
    public static void main(String[] args) {

        String s1 = new String("Spring");
        s1.concat("Fall");

        String s2 = s1.concat("Winter");
        s2.concat("Summer");

        System.out.println(s1); //Output: Spring

        System.out.println(s2); //Output: SpringWinter

        /* How many Object?
           Total 8 Object will be created = 4 in Heap + 4 in SCP.
        *
        *   Line6 --> Two Object is created one in heap as "Spring" and second in SCP as "Spring"
        *   Line7 --> Two Object is created one in heap "SpringFall" and second in SCP "Fall"
        *             but due to no reference heap object "SpringFall" is eligible for garbage collection.

            Line9 --> Two Object is created one in heap as reference s2 is "SpringWinter" and second in SCP is "Winter"
            Line10 --> Two Object is created one in heap "SpringWinterSummer" and second in SCP as "Summer"
                        but due to no reference heap object "SpringWinterSummer" is eligible for garbage collection.
        *
        *
        * */


    }
}
