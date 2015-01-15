package com.twuAssignementsPart1;


import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class BibliotecaTest {

    @Test
    public final  void welcomeMessageTesting(){

        String data = "John";
        InputStream stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            /*Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();*/

            Biblioteca.welcomeMessage();
        }finally {
            System.setIn(stdin);
        }

    }

    @Test
    public final void testingIfTheListIsEmpty()
    {
       // List<String> list = Arrays.asList("The Art Of Winning An Unfair Game", "All Light we cannot see", "Java head first");
       // String listToString = Biblioteca.bookListing().toString();
       // Assert.assertTrue(listToString.contains("[The Art Of Winning An Unfair Game, All Light we cannot see, Java head first]"));   // passes

        Assert.assertTrue(!Biblioteca.bookListing().isEmpty());
    }


}