package com.twuAssignementsPart1;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class BibliotecaTest {

  /*  @Test
    public final void testWelcomeMessage() {
        String data = "John";
        InputStream stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            Biblioteca.welcomeMessage();
        } finally {
            System.setIn(stdin);
        }
    }*/

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStream(){

        System.setOut(new PrintStream(outContent));
    }
    @After
    public void cleanUpStream(){

        System.setOut(null);
    }

    @Test
    public final void testWelcomeMessage(){

        System.out.print("Hello John! Welcome on Biblioteca.");
       String tmp =  Biblioteca.welcomeMessage("John");
        Assert.assertEquals(tmp, outContent.toString());
    }




    @Test
    public final void testingIfTheListIsEmpty() {
        Assert.assertTrue(!Biblioteca.initializeLibrary().isEmpty());
    }

    @Test
    public final void testingChosenBooksID() {

        Integer chosenBooksID = 1;
        InputStream stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(chosenBooksID.toString().getBytes()));
            Biblioteca.initializeLibrary();
        } finally {
            System.setIn(stdin);
        }


        //  Assert.assertTrue(Biblioteca.getChosenBookID() > 0);

    }
}