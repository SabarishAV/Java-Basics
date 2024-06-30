public class Annotations_demo {
    /*
    @Override
    @SuppressWarnings
    @Deprecated
    @FunctionalInterface - will contain only one method and will be abstract
     */

    @FunctionalInterface
    interface Func_Interface{
        void Method1();
    }

    @Deprecated
    public static void Hello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
//        @SuppressWarnings("deprication");
        Hello();
    }
}
