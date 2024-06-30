import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// writes the multiplication table of specified number to a file
public class Multiplication_Table_to_File {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("MultiplicationTable.txt");
        try{
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Something went wrong...|nUnable to create new file");
        }catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println("Enter the number of which multiplication table is required");
        int multiplicant = sc.nextInt();
        try{
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            for(int i=1;i<=10;i++){
                fileWriter.write(String.format("%d * %d = %d",i,multiplicant,i*multiplicant));
                if(i!=10){
                    fileWriter.write("\n");
                }
            }
            fileWriter.close();
            System.out.println("Multiplication table generated successfully");
        }catch (IOException e){
            System.out.println("Unable to write on file " + file.getName());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

/*
another method

        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }

        At the end of the for loop the variable table will contain the multiplication table
        Then it need to be copied to file only once
 */
