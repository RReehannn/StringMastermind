package FullStringConcept;

public class String3 {
    public static void main(String[] args) {

        String s1 = new String("Rehan");
        // Two Object will be Created one in heap and one in SCP (String Constant Pool) for future purpose.


        String s2 = "Rehan";
        // No Object is created in SCP area coz "Rehan " this reference is already their

        System.out.println(s1==s2); //false coz both address is different one have Heap address other have SCP
    }
}
