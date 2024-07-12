package FullStringConcept;

public class String17 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //output: 16
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity()); //output: 16
        sb.append("q");
        System.out.println(sb.capacity()); //output: 34
        sb.append("abcdefghijklmnopq");
        System.out.println(sb.capacity()); //output: 34
        sb.append("r");
        System.out.println(sb.capacity()); //output: 70

        // StringBuffer is mutable default capacity is 16.
        // If capacity is increase to 17 new Object is formed. old object is ready for garbage collection.
        //New Capacity is (oldObject capacity + 1 )*2...........here {16+1}*2
    }
}
