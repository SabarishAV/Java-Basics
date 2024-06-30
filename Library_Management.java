import java.math.BigInteger;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Book1{
    String name;
    String author;
    boolean isAvailable=true;
    String issuedTo=null;
    String issuedOn=null;

    Book1(String name, String author){
        this.name=name;
        this.author=author;
    }
}
class User{
    String name;
    BigInteger phoneNumber;
    User(String name, BigInteger phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
}

public class Library_Management {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Book1> bookShelf = new ArrayList<>();
    private static ArrayList<User> registeredUsers = new ArrayList<>();

    Library_Management(){
        Book1 b0 = new Book1("A Brief History of Time","Stephen Hawking");
        Book1 b1 = new Book1("The Selfish Gene","Richard Dawkins");
        Book1 b2 = new Book1("Sapiens: A Brief History of Humankind","Yuval Noah Harari");
        Book1 b3 = new Book1("The Elegant Universe: Superstrings, Hidden Dimensions, and the Quest for the Ultimate Theory","Brian Greene");
        Book1 b4 = new Book1("The Gene: An Intimate History","Siddhartha Mukherjee");

        bookShelf.add(b0);
        bookShelf.add(b1);
        bookShelf.add(b2);
        bookShelf.add(b3);
        bookShelf.add(b4);

        BigInteger tempNumber = new BigInteger("5469856325");
        User admin = new User("admin",tempNumber);
        registeredUsers.add(admin);
    }

    public static int Menu(){
        System.out.println("\n1. Add User");
        System.out.println("2. Add Book");
        System.out.println("3. Issue Book");
        System.out.println("4. Return Book");
        System.out.println("5. Show Available Books");
        System.out.println("6. EXIT");
        System.out.print("Enter your choice:\t");
        return sc.nextInt();
    }

//    User
    public static void addUser(){
        try{
            System.out.println("Add User:");
            System.out.print("Enter your Name:\t");
            String newUserName = sc.next();
            sc.nextLine();
            System.out.print("Enter your Phone Number:\t");
            BigInteger newUserPh = sc.nextBigInteger();
            if(String.valueOf(newUserPh).length()!=10){
                throw new InputMismatchException();
            }
            User newUser = new User(newUserName,newUserPh);
            registeredUsers.add(newUser);
            System.out.println(newUserName + " has been registered");
        }
        catch(InputMismatchException e){
            System.out.println("The phone number must be of 10 digits");
        }
        catch(Exception e){
            System.out.println("User registration failed\n");
        }
    }

//    Books
    public static void addBook(){
        try{
            System.out.print("Enter book name:\t");
            String newBookName = sc.next();
            sc.nextLine();
            System.out.print("Enter book author:\t");
            String newBookAuthor = sc.nextLine();
            Book1 newBook = new Book1(newBookName,newBookAuthor);
            bookShelf.add(newBook);
            System.out.println(newBookName + " has been added to the Library\n");
        }catch (Exception e){
            System.out.println("Request failed!!\n");
        }
    }

    public static void availableBooks(){
        try{
            if(bookShelf.get(0)==null){
                throw new IndexOutOfBoundsException();
            }
            System.out.println("Available books:");
            for(int i=0;i<bookShelf.size();i++){
                if(bookShelf.get(i).isAvailable){
                    System.out.println(i+1 + ". " + bookShelf.get(i).name);
                }
            }
            System.out.println();
        }catch (IndexOutOfBoundsException e){
            System.out.println("No books are available\n");
        }

    }

    public static void issueBook(){
        boolean userFoundFlag=false;
        availableBooks();
        System.out.print("Enter the book number you want:\t");
        int selectedBook = sc.nextInt();
        sc.nextLine();
        selectedBook--;
        if(bookShelf.get(selectedBook).isAvailable){
            System.out.print("Please enter your name: ");
            String userName = sc.nextLine().trim();
            for (User user:registeredUsers){
                if(user.name.equalsIgnoreCase(userName.trim())){
                    userFoundFlag=true;
                    bookShelf.get(selectedBook).isAvailable=false;
                    bookShelf.get(selectedBook).issuedTo=userName;
                    LocalDateTime dt = LocalDateTime.now();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s a  dd-MM-yyyy");
                    String dateTime = dt.format(dtf);
                    bookShelf.get(selectedBook).issuedOn=dateTime;
                    System.out.format("%s has been issued to %s successfully on %s\n\n",bookShelf.get(selectedBook).name,userName,dateTime);
                    return;
                }
            }
            if(!userFoundFlag){
                System.out.println("You are not registered in the Library\n");
            }

        }else{
            System.out.println("This book is not available");
        }
    }

    public static void returnBook(){
        boolean userFoundFlag=false;
        System.out.println("Issued books:-");
        for(int i=0;i<bookShelf.size();i++){
            if(!bookShelf.get(i).isAvailable){
                System.out.println(i+1 + ". " + bookShelf.get(i).name);
            }
        }
        System.out.print("Enter the book number that you are returning:\t");
        int returnBookNumber = sc.nextInt();
        sc.nextLine();
        returnBookNumber--;
        if(bookShelf.get(returnBookNumber).isAvailable){
            System.out.println("This book was not issued\n");
            return;
        }
        System.out.print("Enter your name: ");
        String returnUserName=sc.nextLine().trim();
        for (User user:registeredUsers){
            if(user.name.equalsIgnoreCase(returnUserName.trim())){
                userFoundFlag=true;
                bookShelf.get(returnBookNumber).isAvailable=true;
                bookShelf.get(returnBookNumber).issuedTo=null;
                bookShelf.get(returnBookNumber).issuedOn=null;
                System.out.format("%s has been returned successfully by %s\n\n",bookShelf.get(returnBookNumber).name,returnUserName);
                break;
            }
        }
        if(!userFoundFlag){
            System.out.println("You are not registered in the Library\n");
        }
    }


    public static void main(String[] args) {
        new Library_Management();
        int choice=0;
        while(choice!=6){
            choice=Menu();
            switch (choice){
                case 1:addUser();
                break;
                case 2: addBook();
                break;
                case 3: issueBook();
                break;
                case 4: returnBook();
                break;
                case 5: availableBooks();
                break;
                case 6: break;
                default:
                    System.out.println("Enter a valid number");
            }
        }
        System.out.println("\nEXIT\n");

    }
}
