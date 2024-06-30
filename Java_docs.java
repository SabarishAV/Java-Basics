/**
 * This is a demo how to create java documentation using javadocs
 * This is <i>italic</i> word <p>This is a new paragraph</p>
 @author Sabarish
 @version 0.1
 @since 2024
 @see <a href="https://docs.oracle.com/en/java/javase/22/docs/api/index.html" target="_blank" >Java Docs</a>
 @param args These are the arguments supplied to the command line
*/
public class Java_docs {
    /**
     * You can use this method to add to integers a and b
     * @param a This is the first number to add
     * @param b This is the second number to add
     * @return Returns sum of a and b
     * @throws Exception if a or b is 0
     * @deprecated This method is deprecated. Please use + operator.
     */
    public static int add(int a,int b) throws Exception{
        if(a==0 || b==0){
            throw new Exception();
        }
        return a+b;
    }
    public static void subtract(int a,int b){
        System.out.println("Difference is " + (a-b));
    }

    public static void main(String[] args) {
        System.out.println("This is main method");
    }
}
