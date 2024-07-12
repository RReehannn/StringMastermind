package FullStringConcept;

public class String26 {
    public static void main(String[] args) {

        System.out.println("Hello " + new StringBuilder("Java SE 8"));
        System.out.println("Hello " + new MyString("Java SE 8"));

//        output: Hello Java SE 8
//                Hello Revision.MyString@5b480cf9
    }

}

class MyString {

    String msg;

    MyString(String msg) {
        this.msg = msg;
    }
}

//    @Override
//    public String toString() {
//
//        return msg;
//    }
//}



/* In string, StringBuffer, Wrapper , collection classes to string method is overridden for meaningful value
  while in object class to string return class name with hashcode.
*
*
* */
