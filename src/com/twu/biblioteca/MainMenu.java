package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;

public class MainMenu {


    private ArrayList<Book> books=new ArrayList<Book>(Arrays.asList(
            new Book("C++ Primer","Stanley B. Lippman",2013,false),
            new Book("Clean Code","Robert C. Martin",2012,false),
            new Book("The Better Angels of Our Nature","Steven Pinker",2015,false)));
    public void showWelcome(){
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }
    public void showBookList(){
        for(int i=0;i<this.books.size();i++){
            Book temp=this.books.get(i);
            System.out.printf("%-35s%-20s%s\n",temp.getTitle(),temp.getAuthor(),temp.getYearPublish());
        }
    }
}
