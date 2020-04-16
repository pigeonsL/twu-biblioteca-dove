package com.twu.biblioteca.User;

import com.twu.biblioteca.IO.Input;

import java.io.PrintStream;
import java.util.ArrayList;

public class UserManage {
    private User curUser;
    private ArrayList<User> userList;

    private static final String LOGIN_MES="Logged in successfully";
    private static final String INVALID_LOGIN_MES="Invalid login";
    private static final String ALREADY_LOGIN_MES="Already logged in";
    private static final String LOGOUT_MES="Logged out successfully";
    private static final String NOT_LOGIN_MES="No user is logged in";
    private static final String ACCOUNT_MES="Your Account:";
    private static final String PASSWD_MES="Your Password:";

    public UserManage(ArrayList<User> userList) {
        this.userList = userList;
    }

    public User getCurUser() {
        return curUser;
    }
    public boolean isLoggedIn(){
        return curUser != null;
    }
    public void logIn(PrintStream ps){
        if(isLoggedIn()){
            ps.println(ALREADY_LOGIN_MES);
            return;
        }
        curUser = matchUser(Input.getInput(ACCOUNT_MES),Input.getInput(PASSWD_MES));
        if(isLoggedIn())
            ps.print(LOGIN_MES);
        else
            ps.print(INVALID_LOGIN_MES);
    }
    public void logOut(PrintStream ps){
        if(!isLoggedIn()){
            ps.print(NOT_LOGIN_MES);
            return;
        }
        curUser=null;
        ps.print(LOGOUT_MES);
    }
    private User matchUser(String account,String pwd){
        for(User u:userList){
            if(UserVerified(u,account,pwd))
                return u;
        }
        return null;
    }
    private boolean UserVerified(User user,String account,String pwd){
        return user.getAccount().equals(account) && user.getPasswd().equals(pwd);
    }
}
