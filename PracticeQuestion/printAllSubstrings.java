package PracticeQuestion;

class printAllSubstrings {
    public static void main(String[] args) {
        // Print all the subset of the string "abcd"?
        String str1 = "abcd"; //index 0 to 3

        for (int i = 0; i <= 3; i++){
            for (int j=i+1; j<=4; j++)
            System.out.println(str1.substring(i,j)+ " ");
        }
        // Output: a ab abc abcd b bc bcd c cd d

    }

}
