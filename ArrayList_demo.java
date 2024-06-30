import java.util.ArrayList;

public class ArrayList_demo {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();// initial capacity can be added, by constructor
        a1.add(1);// add element
        a1.add(2);
        a1.add(3);
        a1.add(2,6);// adds element at specified index, adds 6 at index 2
        System.out.println("Size of arraylist is " + a1.size());
        for(int element:a1){
            System.out.println(element);
        }

        System.out.println();

        //prints elements
        for(int i=0;i<a1.size();i++){
            System.out.println(a1.get(i));
        }

        ArrayList<Integer> a2 = new ArrayList<>(2);// 2 is the initial capacity
        a2.add(33);
        a2.add(45);
        a2.add(1);

        System.out.println();

        //joining a2 with a1
        a1.addAll(0,a2);// values of l2 will be appended at 0th position
        // If there is only one argument which is an arraylist then it will be appended last
        for (int element: a1){
            System.out.println(element);
        }

        System.out.println();

//        a1.clear(); //delets all elements of the arraylist
        System.out.println(a1.contains(1));// returns true if arraylist contains the passed element
        System.out.println(a1.indexOf(1));// returns the value of passed index
        System.out.println(a1.lastIndexOf(1));// returns the highest index of the passed elements
        // for example 1 is at index 2 and 3, this will return 3 since it is the highest

        System.out.println();

        a1.set(0,1); // changes the value at 0 to 1
        for (int element: a1){
            System.out.println(element);
        }

    }
}
