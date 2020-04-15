package com.twu.biblioteca;

public class BibliotecaApp {

    private static MainMenu mainMenu=new MainMenu();
    public static void main(String[] args) {
        mainMenu.showWelcome();
        mainMenu.showBookList();

    }
}
