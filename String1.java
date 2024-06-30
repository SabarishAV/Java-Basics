public class String1 {
    public static void main(String[] args) {
        String name = new String("Hello");
        System.out.println(name);

        String place = "Kerala";
        System.out.println(place);
        // A string cannot be changed (immutable)

        int a=5;
        float b=1.25f;
        System.out.printf("a = %d and b = %f",a,b);
        System.out.format("a = %d and b = %f",a,b);
        // both are same
    }
}
