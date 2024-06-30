interface Demo_Interface{
    void meth1();
    void meth2();
}
public class Anonymous_Classes {
    public static void main(String[] args) {
        Demo_Interface di = new Demo_Interface() { // This class is anonymous and have no name, only the object
            @Override
            public void meth1() {
                System.out.println("Meth1");
            }

            @Override
            public void meth2() {
                System.out.println("Meth2");
            }
        };
        di.meth1();
        di.meth2();
    }
}
