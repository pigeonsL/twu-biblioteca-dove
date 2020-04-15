package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private int yearPublish;
    private boolean checkOut;

    public Book(String title, String author, int yearPublish, boolean checkOut){
        this.title=title;
        this.author=author;
        this.yearPublish=yearPublish;
        this.checkOut=checkOut;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }
}
