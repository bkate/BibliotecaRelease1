package com.twuAssignementsPart1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    //Attributes
    private static  int chosenBookID;
    List<Book> nonCheckedOutBooks = new ArrayList<Book>();
   // static Scanner scanner = new Scanner(System.in);

    //Methods
    public static String welcomeMessage(String userName) {

      // String userName =  scanner.nextLine();

      // System.out.println("Hello " + userName + "!" + " Welcome on Biblioteca !");

        return "Hello " + userName + "!" + " Welcome on Biblioteca.";
    }



    public static List<Book> initializeLibrary(){
        return Arrays.asList(new Book(1, " Moneyball: The Art Of Winning An Unfair Game", "Michael Lewis", 2003, false),
                new Book(2, " All Light we cannot see", "Anthony Doerr", 2014, true),
                new Book(3, " Java head first", "Bert Bates, Kathy Sierra", 2004, false));
       // for (Book book : )
    }

    public static void printBooksTitleOnTheLibrary() {
        for (Book book : Biblioteca.initializeLibrary()) {
            if(!book.isCheckedOut()){
                System.out.println(book.getBookID() + ": " + book.getTitle());
            }
        }
    }


    public static Book printChosenBooksDetails() {
        Scanner scannChosenBookID = new Scanner(System.in);
        chosenBookID = scannChosenBookID.nextInt();
        if(chosenBookID <= 0 || chosenBookID > Biblioteca.initializeLibrary().size()){
            System.err.println("Please enter a valid number!\n");
            printChosenBooksDetails();
        return null;
        }

       /* System.out.println("Author : " + Biblioteca.initializeLibrary().get(chosenBookID -1).getAuthor() +
                "\nPublished : "+ Biblioteca.initializeLibrary().get(chosenBookID -1).getPublishedYear());
*/
        return Biblioteca.initializeLibrary().get(chosenBookID-1);
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


       /* switch (menuItem){
            case 1:
                System.out.println("\nThe Biblioteca has following books, for more details please choose a book's ID");
                Biblioteca.printBooksTitleOnTheLibrary();
                Biblioteca.printChosenBooksDetails();
                Biblioteca.checkOutBook();
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
                Biblioteca.printChosenBooksDetails();
        }*/


    public static int checkOutBook(){

      /*  System.out.println("\nFor check out please enter : 1\n" +
                            "Return to library please enter : 0 ");
*/
        Scanner scannClientSelection = new Scanner(System.in);
      //  int clientSelection = scannClientSelection.nextInt();

        return scannClientSelection.nextInt();
      /*  switch (clientSelection){
            case 1 :
                Biblioteca.printChosenBooksDetails().setCheckedOut(true);
                System.out.println(Biblioteca.printChosenBooksDetails().isCheckedOut());
                Biblioteca.mainMenu();

                break;
            case 0 :
                Biblioteca.printBooksTitleOnTheLibrary();
                break;
            default:
        }
*/
    }




    //Getter and Setter
  /*  public static int getChosenBookID() {
        return chosenBookID;
    }*/
}