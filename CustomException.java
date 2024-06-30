class Custom_Exception extends Exception{
    @Override
    public String toString(){
        return "I am a custom Exception toString";
    }

    @Override
    public String getMessage(){
        return "I am custom Exception getMessage";
    }
}

public class CustomException {
    public static void main(String[] args) {
        int num;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number:\t");
        num = sc.nextInt();
        if(num < 100){
            try{
                throw new Custom_Exception();
//                throw new ArithmeticException("this is an arithmetc exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e); // toString will run
                e.printStackTrace(); // This will print error
            }
        }
    }
}
