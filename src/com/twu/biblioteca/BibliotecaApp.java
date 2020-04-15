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
            switch (in.nextInt()){
                case 1://list
                    mainMenu.showBookList();
                    mainMenu.showOptions();
                    break;
                case 2://check out
                    mainMenu.showBookList();
                    mainMenu.showCheckoutBookMes();
                    mainMenu.showOptions();
                    break;
                case 3://return a book
                    mainMenu.showBookList();
                    mainMenu.showReturnBook();
                    mainMenu.showOptions();
                    break;
                case 4://quit
                    flag=false;
                    break;
                default:
                    mainMenu.showInvalidInput();
                    break;
            }
        }

    }
}
