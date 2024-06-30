import java.util.HashSet;

public class HashSet_demo {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();// initial capacity is 16 by default and can be changed by passing a number as constructor argument
        // load factor (float) can also be passed as second constructor argument. 0.75 is default

        h1.add(1);
        h1.add(2);
        h1.add(3);
        h1.add(3);
        System.out.println(h1);
    }
}
