package com.twu.biblioteca;

public class Movie {
    private String name;
    private int year;
    private String director;
    private float rating;
    private boolean checkOut;

    public Movie(String name, int year, String director, float rating, boolean checkOut) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.checkOut = checkOut;
    }

    public String getName() {
        return name;
    }

    public void setCheckOut(boolean checkout) {
        this.checkOut = checkout;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public float getRating() {
        return rating;
    }
}
