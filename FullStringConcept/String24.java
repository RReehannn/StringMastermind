package FullStringConcept;

public class String24 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(5);
        String s = "";

        if (sb.equals(s)){
            System.out.println("Match 1");
        } else if (sb.toString().equals(s.toString())) {
            System.out.println("Match 2");

        } else {
            System.out.println("No Match");
        }

    } //output: "Match 2"
}




/*
 The equals() method is overridden in the String class to compare the contents of two strings,
 but it's not overridden in the StringBuffer class.

In String, the equals() method is overridden to compare the characters of two strings,
so that two strings are considered equal if they have the same sequence of characters,
regardless of their memory addresses.

However, in StringBuffer, the equals() method is not overridden,
so it inherits the default implementation from the Object class,
which only checks for reference equality (i.e., whether the two objects are the same instance).
This means that two StringBuffer objects are only considered equal if they are the same instance,
not if they have the same contents.

This is because StringBuffer is a mutable class, and its contents can change over time,
so it's not as meaningful to compare their contents as it is with immutable strings.
Instead, you can use the toString() method to convert the StringBuffer to a String and
then compare the strings.

The equals() method in the Object class is implemented to behave like the == operator,
which checks for reference equality.

*
*
* */
