package Function;

class Functionn {
    public static void main(String[] args) {
        String str = "Md Reeehannnn Shakeeeeel";

        System.out.println(str.length()); //Total Length
        System.out.println(str.charAt(4)); // give char
        System.out.println(str.indexOf("R")); // Give index
        System.out.println(str.compareTo("e"));
        // 24
        //e
        //3
        //-24
        System.out.println("\nHere we are playing with compareTo");
        System.out.println("Lexicographically come into the game With this method\n");
        String gtr1 = "Hello";
        String gtr2 = "Zello";
        System.out.println(gtr1.compareTo(gtr2));
        // For Equal result is zero
        // For Lexicographically greater result Positive
        // For Lexicographically smaller result Positive

    }
}
