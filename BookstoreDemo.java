

import java.util.Scanner;

public class BookstoreDemo {
    public static void main(String[] args){
        System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][]");
        System.out.println("[][]                                              [][]");
        System.out.println("[][]         Welcome to WCUPA Bookstore!          [][]");
        System.out.println("[][]                                              [][]");
        System.out.println("[][][][][][][][][][][][][][][][][][][][][][][][][][][]");
        System.out.println();

        Bookstore myBookStore = new Bookstore();
        Scanner kbd = new Scanner(System.in);
        String toDo;

        do{
            System.out.println("=====================================================");
            System.out.println("What would you like to do today?");
            System.out.println("1) Add a book to the stock");
            System.out.println("2) Sell a book in the stock");
            System.out.println("3) List the titles of all book in the stock (in the Bookstore object)");
            System.out.println("4) List all of the information about the book in stock (in the Bookstore object)");
            System.out.println("5) Print out the gross income of the bookstore");
            System.out.println("6) Quit");
            toDo = kbd.nextLine();

        switch(toDo){
            case "1":
               System.out.print("What is the title of the book? ");
               String tempTitle = kbd.nextLine();
               if(myBookStore.inStock(tempTitle, 1)){
                   System.out.print("Quantity? ");
                   int tempAddQuantity = kbd.nextInt();
                   kbd.nextLine();
                   myBookStore.addBookQuantity(tempTitle, tempAddQuantity);
               }
               else{
               System.out.print("How many pages is it? ");
               int tempPages = kbd.nextInt();
               System.out.print("What is the price? ");
               double tempPrice = kbd.nextDouble();
               System.out.print("Quantity? ");
               int tempQuantity = kbd.nextInt();
               kbd.nextLine();
               Book newBook = new Book(tempTitle, tempPages, tempPrice, tempQuantity);
               myBookStore.addNewBook(newBook);
               }
               System.out.println();
               break;
            case "2":
               System.out.print("Which book would you like to sell? ");
               String sellBookTitle = kbd.nextLine();
               if(myBookStore.inStock(sellBookTitle, 1)){
                   System.out.print("How many copies will be sold? ");
                    int sellQuantity = kbd.nextInt();
                    kbd.nextLine();
                    if(myBookStore.inStock(sellBookTitle, sellQuantity) == true){
                    myBookStore.sellBook(sellBookTitle, sellQuantity);
                    System.out.println("Success! You have sold " + sellQuantity + " copies of " + sellBookTitle);}
               else
                      System.out.println("Not enough books in stock to sell.");
               }
               else
                    System.out.println("Book is not in stock.");
               System.out.println();
               break;
            case "3":
                System.out.println("Titles of Books");
                System.out.println("===============");
                myBookStore.listTitles();
                System.out.println();
               break;
            case "4":
                System.out.println("List of Books");
                System.out.println("=============");
                myBookStore.listBooks();
               break;
            case "5":
                System.out.println("Gross Income: $" + myBookStore.getIncome());
                System.out.println();
               break;
            case "6":
                System.out.println("We hope to see you again!");
                break;
            default:
                System.out.println("Invalid input. Please try again.");
                System.out.println();
        }
        } while(!toDo.equals("6"));
    }
}
