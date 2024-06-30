public class varargs {

    /* static int sum (int x, int ...arr){
    int res=x;
        for(int a: arr){
        res+=a;
    }
        return res;
}
    With this atleast one argument for the method is necessary */

    static int sum(int ...arr){ // it will take all arguments of the method into an array
        int res=0;
        for(int a: arr){
            res+=a;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4,5));
    }
}
