package PlayingWithString;

public class Equal {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1==s2); //Output:- True || Address same
        System.out.println(s1==s3); //Output:- False || Address not same
        // Coz we all know == operator indicate address rather than Value

        System.out.println(s1.equals(s3)); //Output:- True || Coz its check value
        System.out.println(s1.equals(s2)); //Output:- True || Coz its check value
    }
}
