import java.util.Random;
import java.util.Scanner;

 class guessNumber{
     int randomNumber;
     int noOfGuess=0;
     int inputNumber;
    guessNumber(){
        Random random = new Random();
        this.randomNumber = random.nextInt(10);
        System.out.println("Guess the Number between 1 to 10 \n" );
    }

    int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your guess:\t");
        this.inputNumber = sc.nextInt();
        return this.inputNumber;
    }
    boolean isCorrectNumber(){
        this.noOfGuess++;
        if(this.randomNumber==this.inputNumber){
            System.out.format("You have found the correct number %d in %d attempts",this.randomNumber,this.noOfGuess);
            return true;
        } else if (this.inputNumber < this.randomNumber) {
            System.out.println("Your number is smaller");
        }else if(this.inputNumber > this.randomNumber){
            System.out.println("Your number is bigger");
        }
        return false;
    }
}

public class guessTheNumber {

    public static void main(String[] args) {
        guessNumber a = new guessNumber();
        boolean findNumber=false;
        while(!findNumber){
            int inputNumber = a.takeUserInput();
            findNumber = a.isCorrectNumber();
        }
    }
}
