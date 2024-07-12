package FullStringConcept;

public class String9 {
    public static void main(String[] args) {
        String s = "Rehan";
        System.out.println(s.charAt(0));
        //R
//        System.out.println(s.charAt(20));
        //StringIndexOutOfBoundsException

        String s1 ="Faizan";
        s1 = s1.concat("Software");
        s1 += "Bihar" ;
        System.out.println(s1); //FaizanSoftwareBihar


        String s3 = "Durga";
        System.out.println(s3.equals("durga")); //false
        System.out.println(s3.equalsIgnoreCase("durga")); //true

        String s4 = "";
        System.out.println(s4.isEmpty()); //true
        System.out.println(s3.isEmpty()); //false
        System.out.println(s3.length()); //5
      //  System.out.println(s3.length); //error coz applicable for Array only

        String s5 = "ababab";
        System.out.println(s5.replace('a', 'x')); //xbxbxb

        String s6 = "abcdefg";
        System.out.println(s6.substring(3)); //defg
        System.out.println(s6.substring(3,6)); //def

        System.out.println(s6.indexOf('d')); //3
        System.out.println(s6.indexOf('z')); //if specifies char is not found we get -1

        String s7 = "REhAn";
        System.out.println(s7.toLowerCase()); //rehan
        System.out.println(s7.toUpperCase()); //REHAN

        String s8 = "Rehan   shakeel";
        System.out.println(s8.length()); //15
        System.out.println(s8.trim().length()); //15 --> coz trim not remove between space

        System.out.println("To string..........");

        String s11 = "durga";
       System.out.println(s11);
        String s12 = s11.toString();
       System.out.println(s12);






    }
}
