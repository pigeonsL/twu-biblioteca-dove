package com.twu.biblioteca.User;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class UserTest {
    private User user;
    ByteArrayOutputStream output;

    @Before
    public void setUp(){
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        user = new User("dove","dove@mail.com","123-4567","dove","dove");
    }

    @Test //account
    public void testAccount(){
        assertEquals("dove",user.getAccount());
    }
    @Test //pwd
    public void testPwd(){
        assertEquals("dove",user.getPasswd());
    }
    @Test //user info
    public void testUserInfo(){
        user.printUserInfo();
        assertEquals("USER INFORMATION\r\n"+"Name:dove\r\n"+"Email:dove@mail.com\r\n"+"Phone:123-4567\r\n",output.toString());
    }
}
