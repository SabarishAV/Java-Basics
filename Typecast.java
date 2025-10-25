
class A {

    void show1() {
        System.out.println("In A");
    }
}

class B extends A {

    void show2() {
        System.out.println("In B");
    }
}

public class Typecast {
    public static void main(String args[]){

        // upcast
        A obj = new B();
        obj.show1();

        // downcast
        B obj1 = (B) obj;
        obj1.show2();

    }
}
