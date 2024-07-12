package FullStringConcept;

public class string23 {
    public static void main(String[] args) {

        //Method chaining is possible and from left to right

        StringBuilder sb = new StringBuilder();
        sb.append("rehan").append("solution").reverse().insert(2, "xyz").delete(1,4);
        System.out.println(sb);



    }
}
