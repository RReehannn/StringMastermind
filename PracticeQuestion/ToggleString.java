package PracticeQuestion;

public class ToggleString {
    public static void main(String[] args) {
        String str = "PhYSics";
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true; // true -> capital
            char ch = str.charAt(i); // Eg: A
            if (ch== ' ') continue; //For contouring Space
            int asci = (int)ch; //65
            if (asci>=97) flag = false; //small
            if (flag==true){ // capital
                asci += 32;
                char dh = (char)asci; //a
                //
                str = str.substring(0,i) + dh + str.substring(i+1);
            } else { //small
                asci -=32;
                char dh = (char)asci;
                str = str.substring(0,i) + dh + str.substring(i+1);

            }

        }
        System.out.println(str);
    }
}
