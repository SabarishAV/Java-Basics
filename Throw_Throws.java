class NegativeNumberException extends Exception{
    @Override
    public String toString(){
        return "Radius can't be negative";
    }
    @Override
    public String getMessage(){
        return "Radius can't be negative";
    }
}

public class Throw_Throws {

    public static int divide(int a, int b) throws ArithmeticException{
        // This indicated that this method may throw an Arithmetic Exception
        return a/b;
    }
    public static double area(int r) throws NegativeNumberException{
        if(r<0){
            throw new NegativeNumberException();
        }
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        try{
            System.out.println(divide(3,0));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        try{
            System.out.println(area(-2));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
