package FullStringConcept;

public class String21 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("rohitBhaiyaa");

       // System.out.println(sb.reverse()); //aayiahBtihor

        sb.setLength(4);
        System.out.println(sb); //ihor

        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb1.capacity()); //16

        sb1.ensureCapacity(1000);
        System.out.println(sb1.capacity()); //1000

        StringBuffer sb2 = new StringBuffer(1000);
        sb2.append("xyz");
        System.out.println(sb2.capacity()); //1000
        sb2.trimToSize();
        System.out.println(sb2.capacity()); //3




    }
}
