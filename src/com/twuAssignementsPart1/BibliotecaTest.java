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
            Biblioteca.welcomeMessage();
        }finally {
            System.setIn(stdin);
        }
    }

    @Test
    public final void testingIfTheListIsEmpty() {Assert.assertTrue(!Biblioteca.bookListing().isEmpty());}

    @Test
    public final void testingChosenBooksID(){

        Integer chosenBooksID = 1;
        InputStream stdin = System.in;

        try {
            System.setIn(new ByteArrayInputStream(chosenBooksID.toString().getBytes()));
            Biblioteca.bookListing();
        }finally {
            System.setIn(stdin);
        }


      //  Assert.assertTrue(Biblioteca.getChosenBookID() > 0);

    }

   // @Test
  /*  public final void testDummy(){
        Biblioteca.printChosenBooksDetails();
        Assert.assertTrue(Biblioteca.getChosenBookID() > 0);
    }*/




}