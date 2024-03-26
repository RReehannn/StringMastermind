package Function;

public class SubString {
    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(str.substring(0,3)); //Output: abc (Include first index but exclude last index)
        System.out.println(str.substring(0,4)); //Output: abcd
        System.out.println(str.substring(0,1)); //Output: a
        System.out.println(str.substring(0,0)); //Output: Nothing included or exclude


        System.out.println(str.substring(0)); //Output: abcde (include First  index and print remaining)
        System.out.println(str.substring(2)); //Output: cde
        System.out.println(str.substring(3)); //Output: de

        // All Sunset of abcde are:-
        // a, ab, abc, abcd, abcde, b, bc, bcd, bcde, c, cd, cde, d, de, e

    }

}
