package StringBuilder;

public class builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");

        str.append(" World");
        System.out.println(str);
        // Output: Hello World

        str.setCharAt(0,'M');
        System.out.println(str);
        // Output: Mello World

        str.insert(2, 'y');
        System.out.println(str);
        // Output: Meyllo World

        str.deleteCharAt(0);
        System.out.println(str);
        // Output: eyllo World

        System.out.println("\nGoing to test Reverse\n");


        StringBuilder sb = new StringBuilder("Physics");
        sb.reverse();
        System.out.println(sb);
        // Output: scisyhP

        sb.delete(2,4);
        System.out.println(sb);
        //Output: scyhP || 2 to 3 delete



    }
}
