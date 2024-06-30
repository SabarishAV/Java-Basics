import java.util.Scanner;

class Book{
    String name;
   String author;
   boolean isAvailable;
   Book(String name, String author){
       this.name=name;
       this.author=author;
       this.isAvailable = true;
   }
}

public class LibraryExercise {
    Book [] BookShelf = new Book[20];
    Book b1 = new Book("Fortune's FollyFortune's Folly","Miranda Gold");
    Book b2 = new Book("The Wealth Paradox","Benjamin Sterling");
    Book b3 = new Book("Gilded Greed","Victoria Chase");
    Book b4 = new Book("Silver Linings: A Tale of Capital and Conscience","Jameson Blake");
    Book b5 = new Book("Copper Dreams","Evelyn Rivers");

    LibraryExercise(){
        BookShelf[0] = b1;
        BookShelf[1] = b2;
        BookShelf[2] = b3;
        BookShelf[3] = b4;
        BookShelf[4] = b5;
    }

    static int menu(){
        System.out.println("1. Add Book");
        System.out.println("2. Issue Book");
        System.out.println("3. Return Book");
        System.out.println("4. Show Available Books");
        System.out.println("5. EXIT");
        System.out.print("Enter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
    public void addBook(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Book name:\t");
        String bName = sc.nextLine();
        System.out.print("Enter Book Author name\t");
        String bAuthor = sc.nextLine();
        Book newBook = new Book(bName,bAuthor);
        for(int i=0;i<BookShelf.length;i++){
            if(i==BookShelf.length-1){
                System.out.println("Library is full\nAdding books is not possible");
                return;
            }else if(BookShelf[i]==null){
                BookShelf[i] = newBook;
                System.out.println("New Book " + bName + "has been added");
                return;
            }
        }
    }
    public void showAvailabeBooks(){
        int i=0;
        if(BookShelf[i]==null){
            System.out.println("Library is empty");
            return;
        }
        System.out.println("Availabe books:");
        while(BookShelf[i]!=null && BookShelf[i].isAvailable){
            System.out.println((i+1) + ". " + BookShelf[i].name + " - " + BookShelf[i].author );
            i++;
        }
    }
    public void issueBook(){
        Scanner sc = new Scanner(System.in);
        showAvailabeBooks();
        System.out.print("Which book do you want?(Enter Number):\t");
        int issuingBook = sc.nextInt();
        issuingBook--;
        if(BookShelf[issuingBook]==null || issuingBook<0 || issuingBook>BookShelf.length){
            System.out.println("Wrong input\nPlease Enter the correct number");
            issueBook();
        }
        System.out.println("ThankYou or purchasing the book");
        BookShelf[issuingBook].isAvailable = false;
    }
    public void retunBook(){
        int count=0,i=0;
        while(BookShelf[i]!=null){
            if(!BookShelf[i].isAvailable){
                System.out.println((i+1) + ". " + BookShelf[i].name + " - " + BookShelf[i].author );
                count++;
            }
            i++;
        }
        if(count==0){
            System.out.println("No books to return");
        }else{
            System.out.print("Which book do you want to return?:\t");
            Scanner sc = new Scanner(System.in);
            int returningBook = sc.nextInt();
            returningBook--;
            if(!BookShelf[returningBook].isAvailable){
                System.out.println("ThankYou for returning the book");
                BookShelf[returningBook].isAvailable=true;
            }else{
                System.out.println("Wrong Input");
                retunBook();
            }
        }
    }

    public static void main(String[] args) {
        LibraryExercise lib = new LibraryExercise();
        boolean ch=true;
        while(ch){
            int choice = menu();
            switch (choice){
                case 1: lib.addBook();
                break;
                case 2: lib.issueBook();
                break;
                case 3:lib.retunBook();
                break;
                case 4:lib.showAvailabeBooks();
                break;
                case 5:
                    System.out.println("Exiting Library");
                    ch=false;
                    break;
                default:
                    System.out.println("Wrong Input\nTry Again");
            }
        }
    }
}
