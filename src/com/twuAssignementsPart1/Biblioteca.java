package com.twuAssignementsPart1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    //Attributes
    private static  int chosenBookID;
    static List<Book> nonCheckedOutBooks = new ArrayList<Book>();
    static List<Book> checkedBooks = new ArrayList<Book>();


    //Methods
    public static String welcomeMessage(String userName) {
        return "Hello " + userName + "!" + " Welcome on Biblioteca.";
    }



    public static List<Book> initializeLibrary(){

        nonCheckedOutBooks.add(new Book(1, " Moneyball: The Art Of Winning An Unfair Game", "Michael Lewis", 2003, false));
        nonCheckedOutBooks.add(new Book(2, " All Light we cannot see", "Anthony Doerr", 2014, false));
        nonCheckedOutBooks.add(new Book(3, " Java head first", "Bert Bates, Kathy Sierra", 2004, false));


        return nonCheckedOutBooks;
    }

    public static void printBooksTitleOnTheLibrary() {
        for (Book book : nonCheckedOutBooks) {
          //  if(!book.isCheckedOut()){
                System.out.println(book.getBookID() + ": " + book.getTitle());
           // }
        }
    }


    public static Book printChosenBooksDetails() {
        Scanner scannChosenBookID = new Scanner(System.in);
        chosenBookID = scannChosenBookID.nextInt();
        if(chosenBookID <= 0 || chosenBookID > nonCheckedOutBooks.size()){
            System.err.println("Please enter a valid number!\n");
            printChosenBooksDetails();
        return null;
        }

       /* System.out.println("Author : " + Biblioteca.initializeLibrary().get(chosenBookID -1).getAuthor() +
                "\nPublished : "+ Biblioteca.initializeLibrary().get(chosenBookID -1).getPublishedYear());
*/
        return nonCheckedOutBooks.get(chosenBookID-1);
    }

    public static int mainMenu() {

        System.out.println("Pleas select a menu item from the menu bar");
        Scanner scannMenuItem = new Scanner(System.in);
        int menuItem = scannMenuItem.nextInt();

        if(menuItem < 1 || menuItem > 5){
            System.err.println("Pleas select a valid number!");
            mainMenu();
            return 0;
        }

        return menuItem;
    }




    public static void checkOutBook(Book checkedBook){
       boolean possibleToCheck =  nonCheckedOutBooks.remove(checkedBook);
        if(possibleToCheck) {
            checkedBooks.add(checkedBook);
            System.out.println(checkedBook.getTitle() + " is successfully checked out");
        }else System.out.println(checkedBook.getTitle()+ ": check out is unsuccessful");

    }





}