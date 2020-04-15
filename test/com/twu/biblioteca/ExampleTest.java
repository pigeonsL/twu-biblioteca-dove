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

}
