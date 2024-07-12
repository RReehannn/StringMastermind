package FullStringConcept;

public class String27{
    public static String mask(String creditCard){

        String x = "XXXX-XXXX-XXXX-";
//        StringBuilder sb = new StringBuilder(creditCard);
//        sb.substring(15,19); //not worked
//        return x + creditCard.substring(15,19); //work
        StringBuilder sb = new StringBuilder(x);
        sb.append(creditCard, 15,19);
        return sb.toString(); //work/ output: XXXX-XXXX-XXXX-5979


    }

    public static void main(String[] args) {
        System.out.println(mask("1234-5678-9101-5979"));

    }
}
