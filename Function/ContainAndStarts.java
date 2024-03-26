package Function;

import java.util.Scanner;

public class ContainAndStarts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "Physics Wallah";
        System.out.println(str.contains("alla")); // result : true| coz "alla" contains in str
        System.out.println(str.contains("rrre")); //  result : false| coz "rrre" don't contains in str
        System.out.println(str.startsWith("Phy")); // result : true
    }
}
