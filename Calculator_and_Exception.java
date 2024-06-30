/*
       Exercise 6: You have to create a custom calculator with following operations:
       1. + -> Addition
       2. - -> Subtraction
       3. * -> Multiplication
       4. / -> Division
       which throws the following exceptions:
       1. Invalid input Exception ex: 8 & 9
       2. Cannot divide by 0 Exception
       3. Max Input Exception if any of the inputs is greater than 100000
       4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
        */

import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "Invalid input";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Input must be smaller";
    }
}
class ZeroDivisionException extends Exception{
    @Override
    public String toString(){
        return "Divisor must not be zero";
    }
}
class MaxMultiplierException extends Exception{
    @Override
    public String toString(){
        return "The numbers must be below 7000";
    }
}

public class Calculator_and_Exception {
    public static int a,b;
    public static boolean isValid=false;
    private static Scanner sc = new Scanner(System.in);
    public static int Menu(){
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. EXIT");
        System.out.print("Choose an option:\t");
        return sc.nextInt();
    }
    public static void getInput(){
        isValid=false;
        try{
            System.out.print("Enter first number:\t");
            if (sc.hasNextInt()){
                a = sc.nextInt();
            }else {
                sc.next();
                throw new InvalidInputException();
            }
            System.out.print("Enter second number:\t");
            if (sc.hasNextInt()){
                b = sc.nextInt();
            }else {
                sc.next();
                throw new InvalidInputException();
            }
            if(a>100000 || b>100000){
                throw new MaxInputException();
            }
            isValid = true;
        }catch (InvalidInputException e){
            System.out.println(e.toString());
        }catch (MaxInputException e){
            System.out.println(e.toString());
        }
    }
    public static void add(){
        getInput();
        if(isValid){
            System.out.format("%d + %d = %d",a,b,a+b);
        }
    }public static void subtract(){
        getInput();

        if (isValid) {
            System.out.format("%d - %d = %d",a,b,a-b);
        }
    }
    public  static void divide() {
        try {
            getInput();
            if (b == 0) {
                throw new ZeroDivisionException();
            } else {
                if (isValid) {
                    System.out.format("%d / %d = %d", a, b, a / b);
                }
            }
        } catch (ZeroDivisionException e) {
            System.out.println(e.toString());
        }
    }
    public  static void multiply() {
        try {
            getInput();
            if (a>7000 || b>7000) {
                throw new MaxMultiplierException();
            } else {
                if (isValid) {
                    System.out.format("%d * %d = %d", a, b, a * b);
                }
            }
        } catch (MaxMultiplierException e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        int choice=0;
        while(choice!=5){
            choice = Menu();
            switch (choice){
                case 1: add();
                break;
                case 2: subtract();
                break;
                case 3: multiply();
                break;
                case 4: divide();
                break;
                case 5:
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Enter a valid input");
                    break;

            }
        }
    }
}
