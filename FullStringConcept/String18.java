package FullStringConcept;

public class String18 {
    public static void main(String[] args) {

        //Important constructor of String buffer

        //1st
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //output: 16

        //2nd
        StringBuffer sb1 = new StringBuffer(1000);
        System.out.println(sb1.capacity()); //output: 1000

        //3rd
        StringBuffer sb2 = new StringBuffer("abcd");
        System.out.println(sb2.capacity()); //output: 20
        //Capacity = s.length + 16

    }
}
