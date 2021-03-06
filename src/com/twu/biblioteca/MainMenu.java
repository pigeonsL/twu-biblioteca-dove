package com.twu.biblioteca;

import com.twu.biblioteca.User.UserManage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainMenu {
    private UserManage userManage;
    private static final String LOGIN_WARN = "Please login...";
    private ArrayList<String> options = new ArrayList<String>(Arrays.asList(
            "1.List of books",
            "2.List of movies",
            "3.Checkout a book",
            "4.Checkout a movie",
            "5.Return a book",
            "6.Return a movie",
            "7.Log in",
            "8.Log out",
            "9.User Information",
            "10.Quit"));

    private ArrayList<Book> books=new ArrayList<Book>(Arrays.asList(
            new Book("C++ Primer","Stanley B. Lippman",2013,false),
            new Book("Clean Code","Robert C. Martin",2012,false),
            new Book("The Better Angels of Our Nature","Steven Pinker",2015,false)));
    private ArrayList<Movie> movies=new ArrayList<Movie>(Arrays.asList(
            new Movie("The Two Popes",2019,"Fernando Meirelles",8.6f,false),
            new Movie("The Irishman",2019,"Martin Scorsese",8.9f,false),
            new Movie("Gisaengchung",2019,"Joon-ho Bong",8.7f,false)));
    public void showWelcome(){
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
        System.out.println("============================================================================");
    }
    public void showOptions(){
        System.out.print("Please select an option from the following:\n");
        for(String ops:options){
            System.out.println(ops);
        }
        System.out.println("============================================================================");
    }
    public void showBookList(){
        for(int i=0;i<this.books.size();i++){
            Book temp=this.books.get(i);
            System.out.print(i+1);
            //为了便于测试，取消了格式控制输出
            System.out.printf("\t%-35s%-20s%-10s%-10s\n",temp.getTitle(),temp.getAuthor(),temp.getYearPublish(),temp.isCheckOut());
            //System.out.println(temp.getTitle()+temp.getAuthor()+temp.getYearPublish()+temp.isCheckOut());
        }
    }
    public void showMovieList(){
        for(int i=0;i<this.movies.size();i++){
            Movie temp=this.movies.get(i);
            System.out.print(i+1);
            System.out.printf("\t%-20s%-10s%-20s%-20s\n",temp.getName(),temp.getYear(),temp.getDirector(),temp.getRating());
            //System.out.println(temp.getName()+temp.getYear()+temp.getDirector()+temp.getRating()+temp.isCheckOut());
        }
    }
    public void showInvalidInput(){
        System.out.println("Please select a valid option!");
    }
    public void showQuitMes(){
        System.out.println("Goodbye!");
    }
    //借书
    public void showCheckoutBookMes(){
        System.out.println("Enter the number of the book you want to checkout:");
        Scanner bookin = new Scanner(System.in);
        int index = bookin.nextInt()-1;

        if(checkAvaiBook(index)){
            System.out.println("Thank you! Enjoy the book.");
        }
        else{
            System.out.println("Sorry,that book is not available!");
        }
    }
    //是否可借
    public boolean checkAvaiBook(int index){
        //输入不合法
        if(index<0 || index>this.books.size()-1){
            return false;
        }
        Book temp = this.books.get(index);
        if(temp.isCheckOut()==false){
            temp.setCheckOut(true);//借出
            return true;
        }
        else
            return false;
    }
    //checkout movie
    public void showCheckoutMovieMes(){
        System.out.println("Enter the number of the movie you want to checkout:");
        Scanner moviein = new Scanner(System.in);
        int index = moviein.nextInt()-1;

        if(checkAvaiMovie(index)){
            System.out.println("Thank you! Enjoy the Movie.");
        }
        else{
            System.out.println("Sorry,that movie is not available!");
        }
    }
    //是否可借
    public boolean checkAvaiMovie(int index){
        //输入不合法
        if(index<0 || index>this.movies.size()-1){
            return false;
        }
        Movie temp = this.movies.get(index);
        if(temp.isCheckOut()==false){
            temp.setCheckOut(true);//借出
            return true;
        }
        else
            return false;
    }
    //还书
    public void showReturnBook(){
        System.out.println("Enter the number of the book you want to return:");
        Scanner rebook = new Scanner(System.in);
        int index = rebook.nextInt()-1;
        if(returnAvaiBook(index)){
            System.out.println("Thank you for returning the book.");
        }
        else{
            System.out.println("That is not a valid book to return.");
        }
    }
    //还书是否可行
    public boolean returnAvaiBook(int index){
        //输入不合法
        if(index<0 || index>this.books.size()-1){
            return false;
        }
        Book temp = this.books.get(index);
        if(temp.isCheckOut()){
            temp.setCheckOut(false);//还书成功
            return true;
        }
        else
            return false;//还书失败
    }

    public void showReturnMovie(){
        System.out.println("Enter the number of the Movie you want to return:");
        Scanner removie = new Scanner(System.in);
        int index = removie.nextInt()-1;
        if(returnAvaiMovie(index)){
            System.out.println("Thank you for returning the movie.");
        }
        else{
            System.out.println("That is not a valid movie to return.");
        }
    }
    public boolean returnAvaiMovie(int index){
        //输入不合法
        if(index<0 || index>this.movies.size()-1){
            return false;
        }
        Movie temp = this.movies.get(index);
        if(temp.isCheckOut()){
            temp.setCheckOut(false);
            return true;
        }
        else
            return false;
    }

}
