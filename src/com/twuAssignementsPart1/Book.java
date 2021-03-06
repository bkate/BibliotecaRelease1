package com.twuAssignementsPart1;


public class Book {

    private String title;
    private String author;
    private int publishedYear;
    private int bookID;
    private boolean checkedOut;


    public Book(int _bookID, String _title, String _author, int _publishedYear, boolean _checkedOut){
        setBookID(_bookID);
        setTitle(_title);
        setAuthor(_author);
       setPublishedYear(_publishedYear);
        setCheckedOut(_checkedOut);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void setBookID(int bookID) {this.bookID = bookID;}

    public int getPublishedYear() {
        return publishedYear;
    }

    public String getTitle() {return title;}

    public String getAuthor() {return author;}

    public int getBookID() {return bookID; }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}
