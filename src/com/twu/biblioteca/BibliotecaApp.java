package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    private static MainMenu mainMenu=new MainMenu();
    public static void main(String[] args) {
        mainMenu.showWelcome();
        mainMenu.showOptions();
        chose();
    }
    public static void chose(){
        Scanner in = new Scanner(System.in);
        boolean flag=true;
        while (flag){
            if(in.hasNext()){
                switch (in.nextInt()){
                    case 1://list of books
                        mainMenu.showBookList();
                        mainMenu.showOptions();
                        break;
                    case 2://check out book
                        mainMenu.showBookList();
                        mainMenu.showCheckoutBookMes();
                        mainMenu.showOptions();
                        break;
                    case 3://return a book
                        mainMenu.showBookList();
                        mainMenu.showReturnBook();
                        mainMenu.showOptions();
                        break;
                    case 4: //list of movies
                        mainMenu.showMovieList();
                        mainMenu.showOptions();
                        break;
                    case 5://checkout movie
                        mainMenu.showMovieList();
                        mainMenu.showCheckoutMovieMes();
                        mainMenu.showOptions();
                        break;
                    case 6:
                        flag=false;
                        mainMenu.showQuitMes();
                        break;
                    default:
                        mainMenu.showInvalidInput();
                        break;
                }
            }
            else
                break;
        }

    }
}
