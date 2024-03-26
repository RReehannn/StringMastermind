package PlayingWithString;

public class Performance {
    public static void main(String[] args) {
        String str = "";
        for (int i=1; i<=10; i++){
            str = str + i;
        }
        // "" "1" "12" new string Formation like this, that why performance is not considered good.
        System.out.println(str);
    }

}
