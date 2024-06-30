import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> d1 = new ArrayDeque<>();
        d1.add(1);
        d1.add(2);

        d1.addFirst(0);
        d1.addLast(3);

        System.out.println(d1.getFirst()); // gets first elementD
        System.out.println(d1.getLast()); // gets last elementD

        System.out.println();

        for (int e: d1){
            System.out.println(e);
        }
    }
}
