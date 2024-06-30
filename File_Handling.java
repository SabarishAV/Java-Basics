import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {
        File file = new File("NewTextFile.txt");

        //create new file
        try{
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        // write a file
        try{
            FileWriter fileWriter = new FileWriter("NewTextFile.txt");
            fileWriter.write("Hello\nHii");
            fileWriter.close(); // if did not close file-writer, the txt file will not be written
        }catch (IOException e){
            e.printStackTrace();
        }


        // read file
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        // delete file
        if(file.delete()){
            System.out.println(file.getName() + " has been deleted");
        }else{
            System.out.println("Unable to delete file " + file.getName());
        }
    }
}
