package com.twu.biblioteca.User;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class UserManageTest {
    private User user1;
    private User user2;
    private UserManage userManage;
    ByteArrayOutputStream output;
    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp(){
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        user1 = mock(User.class);
        when(user1.getAccount()).thenReturn("dove");
        when(user1.getPasswd()).thenReturn("dove");
        user2 = mock(User.class);
        when(user2.getAccount()).thenReturn("rain");
        when(user2.getPasswd()).thenReturn("rain");
        ArrayList<User> userList = new ArrayList<User>(Arrays.asList(user1,user2));
        userManage = new UserManage(userList);
    }

    @Test //login
    public void testLogin(){
        systemInMock.provideLines("dove","dove");
        userManage.logIn();
        assertEquals(user1,userManage.getCurUser());
        assertTrue(userManage.isLoggedIn());
    }
    @Test //logout
    public void testLogOut(){
        systemInMock.provideLines("dove","dove");
        userManage.logIn();
        userManage.logOut();
        assertEquals("Your Account:" + "Your Password:" + "Logged in successfully\r\n"
                +"Logged out successfully\r\n", output.toString());
    }
    @Test //login error
    public void testInvalidLogin(){
        systemInMock.provideLines("dfa","dfa");
        userManage.logIn();
        assertEquals("Your Account:" + "Your Password:" + "Invalid login\r\n", output.toString());
    }
    @Test //re-login
    public void testReLogin(){
        systemInMock.provideLines("dove","dove");
        userManage.logIn();
        userManage.logIn();
        assertEquals("Your Account:" + "Your Password:" + "Logged in successfully\r\n"+
                "Already logged in\r\n", output.toString());
    }
    @Test //logout error
    public void testInvalidLogout(){
        userManage.logOut();
        assertEquals("No user is logged in\r\n", output.toString());
    }

}
