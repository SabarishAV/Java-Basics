public class staticMethod {

    // static is used when the method is in same class and an object of the method is not made
    static int sum(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        int a=1,b=2;
        System.out.println(sum(a,b));
    }
}
