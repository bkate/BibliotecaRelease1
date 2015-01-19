package com.twuAssignementsPart1;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {




    private static  int chosenBookID;



    public static void welcomeMessage(){

        System.out.println("Please enter your name :");
        Scanner scanner = new Scanner(System.in);
       String userName =  scanner.nextLine();

        System.out.println("Hello " + userName + "!" + " Welcome on Biblioteca !");
    }



    public static List<Book> bookListing(){
        return Arrays.asList(new Book(1, " Moneyball: The Art Of Winning An Unfair Game", "Michael Lewis", 2003),
                new Book(2, " All Light we cannot see", "Anthony Doerr", 2014),
                new Book(3, " Java head first", "Bert Bates, Kathy Sierra", 2004));
    }

    public static void printBooksTitleOnTheLibrary() {
        for (Book book : Biblioteca.bookListing()) {
            System.out.println(book.getBookID() + ": " + book.getTitle());
        }
    }


    public static void printChosenBooksDetails() {
        Scanner scannChosenBookID = new Scanner(System.in);
        chosenBookID = scannChosenBookID.nextInt();
        if(chosenBookID <= 0 || chosenBookID > Biblioteca.bookListing().size()){
            System.err.println("Please enter a valid number!\n");
            printChosenBooksDetails();
        return;
        }

        System.out.println("Author : " + Biblioteca.bookListing().get(chosenBookID -1).getAuthor() +
                "\nPublished : "+ Biblioteca.bookListing().get(chosenBookID -1).getPublishedYear() );
    }



    public static void mainMenu(){
        System.out.println("Main menu :\n" +
                "1. List Book----\n" +
                "2. Loans--------\n" +
                "3. Reservations-\n"+
                "4. Costs--------\n" +
                "5. Password-----");

        System.out.println("Pleas select a menu item from the menu bar");
        Scanner scannMenuItem = new Scanner(System.in);
        int menuItem = scannMenuItem.nextInt();

        switch (menuItem){
            case 1:
                System.out.println("\nThe Biblioteca has following books, for more details please choose a book's ID");
                Biblioteca.printBooksTitleOnTheLibrary();
                break;
            case 2:
                System.out.println("Nothing to do");
                break;
            case 3:
                System.out.println("Nothing to do");
                break;
            case 4:
                System.out.println("Nothing to do");
                break;
            case 5:
                System.out.println("Nothing to do");
                break;
            default:
                System.out.println("\nThe Biblioteca has following books, for more details please choose a book's ID");
                Biblioteca.printBooksTitleOnTheLibrary();

        }
    }


    //Getter and Setter
    public static int getChosenBookID() {
        return chosenBookID;
    }
}