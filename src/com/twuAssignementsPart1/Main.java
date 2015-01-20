package com.twuAssignementsPart1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Biblioteca.initializeLibrary();
        System.out.println("Please enter your name :");
        Scanner scannUserName = new Scanner(System.in);
        String userName = scannUserName.nextLine();

        System.out.println(Biblioteca.welcomeMessage(userName));

        handlerMethod();
    }


        public static void handlerMethod(){
        System.out.println("Pleas select a menu item from the menu bar");
        System.out.println("Main menu :\n" +
                "1. List Book----\n" +
                "2. Loans--------\n" +
                "3. Reservations-\n" +
                "4. Costs--------\n" +
                "5. Password-----");

        int selectedMenu = Biblioteca.mainMenu();


        switch (selectedMenu) {
            case 1:
                System.out.println("\nThe Biblioteca has following books, for more details please choose a book's ID");
                Biblioteca.printBooksTitleOnTheLibrary();
                Book chosenBookID =  Biblioteca.printChosenBooksDetails();


                System.out.println("Author : " + chosenBookID.getAuthor() +
                        "\nPublished : "+ chosenBookID.getPublishedYear());

                System.out.println("\nFor check out please enter : 1\n" +
                        "Return to library please enter : 0 ");

                Scanner scannCheckOutDecision = new Scanner(System.in);
                int checkOutDecision = scannCheckOutDecision.nextInt();


                if (checkOutDecision == 1){
                    Biblioteca.checkOutBook(chosenBookID);
                    handlerMethod();
                }else handlerMethod();




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
                /*System.out.println("\nThe Biblioteca has following books, for more details please choose a book's ID");
                Biblioteca.printBooksTitleOnTheLibrary();
                Biblioteca.printChosenBooksDetails();*/


        }

    }

    }





