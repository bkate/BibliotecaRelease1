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

        //List<String> list = Arrays.asList("The Art Of Winning An Unfair Game", "All Light we cannot see", "Java head first");

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
        if(chosenBookID <= 0){
            System.err.println("Please enter a valid number!\n");
            printChosenBooksDetails();}

        System.out.println("Author : " + Biblioteca.bookListing().get(chosenBookID -1).getAuthor() +
                "\nPublished : "+ Biblioteca.bookListing().get(chosenBookID -1).getPublishedYear() );
    }


    public static int getChosenBookID() {
        return chosenBookID;
    }
}