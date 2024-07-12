package FullStringConcept;

public class String1 {
    public static void main(String[] args) {
        String s = new String("durga");
        s.concat("software");
        System.out.println(s);

        // Output: durga coz String class is immutable
        //Immutable mean not changed

        System.out.println("..................");

        StringBuffer st = new StringBuffer("durga");
         st.append("software");
        System.out.println(st);

        //Output: durgasoftware coz StringBuffer is mutable or changeable
    }
}

/*Immutability:- Once we create an object we can't change the object, if we try to change
                object with those change new object is created.
                If no change in the object existing object is reuse.

 */
