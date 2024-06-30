import java.util.Scanner;
import java.util.Random;

public class rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Rock","Paper","Scissor"};
        int compScore=0,userScore=0,choice,rounds;
        System.out.println("Enter the number of rounds");
        rounds = sc.nextInt();
        while (compScore<rounds && userScore<rounds){
            System.out.println("1. Rock\n2. Paper\n3. Scissor\nEnter your choice:\t");
            choice = sc.nextInt();
            choice--;
            System.out.println("You chose " + options[choice]);
            int compChoice = random.nextInt(3);
            System.out.println("Computer chose " + options[compChoice]);
            if(choice == compChoice){
                System.out.println("Its a tie");
            } else if (choice == 0 && compChoice == 2 || choice==1 && compChoice==0 || choice==2 && compChoice==1) {
                System.out.println("You scored");
                userScore++;
            }else{
                System.out.println("Computer scored");
                compScore++;
            }
            System.out.printf("\nScore:\nYour Score : %d\nComputer Score : %d\n",userScore,compScore);
        }
        if(compScore>userScore){
            System.out.println("Computer won the game");
        }else{
            System.out.println("You won the game");
        }
    }
}
