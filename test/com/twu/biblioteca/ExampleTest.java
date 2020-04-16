package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    MainMenu mainMenu;
    ByteArrayOutputStream output;
    @Before
    public void setUp(){
        mainMenu = new MainMenu();
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }
    @Test //1.1 welcome
    public void testWelcome() {
        mainMenu.showWelcome();
        assertEquals("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!"+
                System.getProperty("line.separator"), output.toString());
    }

    @Test //1.4 main menu
    public void testOptions(){
        mainMenu.showOptions();
        assertEquals("Please select an option from the following:\n"+
                        "1.List of books\r\n"+
                        "2.Checkout a book\r\n"+
                        "3.Return a book\r\n"+
                        "4.Quit\r\n"
                        , output.toString());
    }
    @Test //1.5 invalid option
    public void testInvalidOption(){
        System.setIn(new ByteArrayInputStream((5+ System.getProperty("line.separator")).getBytes()));
        BibliotecaApp.chose();
        assertEquals("Please select a valid option!" +
                System.getProperty("line.separator"), output.toString());

    }
    @Test //1.7 checkout success
    public void testCheckOutSuccess(){
        System.setIn(new ByteArrayInputStream((2+ System.getProperty("line.separator")).getBytes()));
        mainMenu.showCheckoutBookMes();
        assertEquals("Enter the number of the book you want to checkout:" +
                System.getProperty("line.separator") + "Thank you! Enjoy the book." +
                System.getProperty("line.separator"), output.toString());
    }
    @Test //1.10 Return a book
    public void testReturnBook(){
        System.setIn(new ByteArrayInputStream((2+ System.getProperty("line.separator")).getBytes()));
        mainMenu.showReturnBook();
        assertEquals("Enter the number of the book you want to return:" +
                System.getProperty("line.separator") + "Thank you for returning the book." +
                System.getProperty("line.separator"), output.toString());
    }
}
