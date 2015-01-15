package com.twuAssignementsPart1;


public class Book {

    private String title;
    private String author;
    private int publishedYear;


    public Book(String _title, String _author, int _publishedYear){
        setTitle(_title);
        setAuthor(_author);
       setPublishedYear(_publishedYear);
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

    public int getPublishedYear() {
        return publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
