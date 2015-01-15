package com.twuAssignementsPart1;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {







    public static void welcomeMessage(){

        Scanner scanner = new Scanner(System.in);
       String userName =  scanner.nextLine();

        System.out.println("Hello " + userName + "!" + " Welcome on Biblioteca !");
    }



    public static List<Book> bookListing(){

        //List<String> list = Arrays.asList("The Art Of Winning An Unfair Game", "All Light we cannot see", "Java head first");

        return Arrays.asList(new Book("Moneyball: The Art Of Winning An Unfair Game", "Michael Lewis", 2003), new Book("All Light we cannot see", "Anthony Doerr", 2014), new Book("Java head first", "Bert Bates, Kathy Sierra", 2004));
    }











}