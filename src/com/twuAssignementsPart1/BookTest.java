package com.twuAssignementsPart1;

import org.junit.Assert;
import org.junit.Test;

//import static org.junit.Assert.*;

public class BookTest {


    @Test
    public final void publishedYearInTheFutur(){

        Assert.assertTrue( (new Book(1, " Moneyball: The Art Of Winning An Unfair Game", "Michael Lewis", 2003,false).getPublishedYear() <= 2015));
    }

    @Test
    public final void bookHasNoTitle(){

        Assert.assertTrue(new Book(1, " Moneyball: The Art Of Winning An Unfair Game", "Michael Lewis", 2003, false).getTitle() != null);
    }

    @Test
    public final void bookHasNoAuthor(){

        Assert.assertTrue(new Book(1, " Moneyball: The Art Of Winning An Unfair Game", "Michael Lewis", 2003, false).getAuthor() != null);

    }

}