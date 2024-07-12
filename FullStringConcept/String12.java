package FullStringConcept;

public class String12 {
    public static void main(String[] args) {
        Test t1 = new Test(10);
        Test t2 = t1.modify(100);
        Test t3 = t1.modify(10);

        System.out.println(t1 == t2); //false-->  new object is created
        System.out.println(t1 == t3); //true ---> no new Object is created

    }
}

//This is our own Immutable class
//Every method present in the String class is implemented like this code, that is why string is immutable.
// class is not allow to change that why string is final class

final class Test {
    private int i;

    Test(int i) {
        this.i = i;

    }

    public Test modify(int i){

        if (this.i==i){
            return this;
        }
        else {
            return new Test(i);
        }
    }
}

/*Immutability:- Once we create an object we can't change the object, if we try to change
                object with those change new object is created.
                If no change in the object existing object is reuse.
*
*
* */


