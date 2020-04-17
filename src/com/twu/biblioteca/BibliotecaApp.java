package com.twu.biblioteca;

import com.twu.biblioteca.User.UserManage;

import java.util.Scanner;

public class BibliotecaApp {

    private static MainMenu mainMenu=new MainMenu();
    private static UserManage userManage = new UserManage();

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
                    case 2: //list of movies
                        mainMenu.showMovieList();
                        mainMenu.showOptions();
                        break;
                    case 3://check out book
                        mainMenu.showBookList();
                        mainMenu.showCheckoutBookMes();
                        mainMenu.showOptions();
                        break;
                    case 4://checkout movie
                        mainMenu.showMovieList();
                        mainMenu.showCheckoutMovieMes();
                        mainMenu.showOptions();
                        break;
                    case 5://return a book
                        mainMenu.showBookList();
                        mainMenu.showReturnBook();
                        mainMenu.showOptions();
                        break;
                    case 6://return a movie
                        mainMenu.showMovieList();
                        mainMenu.showReturnMovie();
                        mainMenu.showOptions();
                        break;
                    case 7://log in
                        userManage.logIn();
                        mainMenu.showOptions();
                        break;
                    case 8://log out
                        userManage.logOut();
                        mainMenu.showOptions();
                        break;
                    case 9://user info
                        userManage.showUserInfo();
                        mainMenu.showOptions();
                        break;
                    case 10://quit
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
