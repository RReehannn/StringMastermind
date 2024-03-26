package PracticeQuestion;

class first {
    public static void main(String[] args) {
        // What is the output?
        String s = "physics";
        for (int j = 2; j < 4; j++) {
            System.out.print(s.substring(j));

            //Output: ysicssics
            // Coz substring print including all along with his index. loop run 2 times here due to condition.

        }

    }
}
