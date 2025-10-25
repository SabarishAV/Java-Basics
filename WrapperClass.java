public class WrapperClass {
    public static void main(String[] args) {
        
        int num = 7;
        // Integer num1 = new Integer(num);     // boxing
        Integer num1 = num;    // autoboxing

        // int num2 = num1.intValue();    // unboxing
        int num2 = num1.intValue();    // newer versions of java supports this, als ocalled auto-unboxing

        System.out.println(num1 + ", " + num2);
        

    }
}
