package FullStringConcept;

public class String5 {
    public static void main(String[] args) {


        String s = new String("Rehan");
        s.concat("Software");
        s = s.concat("Solution");

        System.out.println(s);
        // Output: RehanSolution

        /* How many Object is created?

          6 Object is created = 3 in heap + 3 in SCP

          7Line --> Two object is created One in Heap "Rehan" and Second in SCP "Rehan".
          8Line --> Two Object is created one in heap "RehanSoftware" and one in SCP "Software" but in heap
                    area eligible for garbage Collection coz no reference exits.
          9Line --> Two Object created one in heap "RehanSolution" and other in SCP "Solution".
                    now new Reference of s is "RehanSolution"

          so, Line 7 heap and line 8 Object of heap is eligible for garbage collection.
                  new now new Reference of s is "RehanSolution".
              SCP object is maintain by JVM so, It is not eligible for garbage collection.
        *
        *
        *
        *
        *
        *
        * */
    }
}
