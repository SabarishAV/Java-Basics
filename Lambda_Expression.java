@FunctionalInterface
interface Interface1{
    void method1();
}
@FunctionalInterface
interface Interface123{
    void method123(int a);
}

public class Lambda_Expression {
    public static void main(String[] args) {
        Interface1 i1 = ()->{
            System.out.println("I am method1");
        };
        i1.method1();

        Interface123 i2 = (arg)->{
            System.out.println("Interface 123 , " + arg);
        };
        i2.method123(5);
    }
}
