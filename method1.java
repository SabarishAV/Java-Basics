public class method1 {

    // here static is not used because the object of the class is made and the method is called from the object
     int sum(int x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        int a=1,b=2;
        method1 obj = new method1();
        System.out.println(obj.sum(a,b));
    }
}
