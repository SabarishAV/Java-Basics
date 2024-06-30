// inheritance in interface


interface anInterface{
    void method1();
    void method2();
}
interface childInterface extends anInterface{
    void method3();
    void method4();
}

class sampleClass implements childInterface{
    @Override
    public void method1() {
        System.out.println("This is method 1");
    }

    @Override
    public void method2() {
        System.out.println("This is method 2");
    }

    @Override
    public void method3() {
        System.out.println("This is method 3");
    }

    @Override
    public void method4() {
        System.out.println("This is method 4");
    }
}

public class Interface3 {
    public static void main(String[] args) {
        sampleClass sampleclass = new sampleClass();
        sampleclass.method1();
        sampleclass.method2();
        sampleclass.method3();
        sampleclass.method4();
    }
}
