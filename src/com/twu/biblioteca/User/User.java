package com.twu.biblioteca.User;

public class User {
    private String name;
    private String email;
    private String phone;
    private String account;
    private String passwd;

    private static final String USER_INFO="USER INFORMATION";

    public User(String name, String email, String phone, String account, String passwd) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.account = account;
        this.passwd = passwd;
    }

    public String getAccount() {
        return account;
    }

    public String getPasswd() {
        return passwd;
    }
    public void showUserInfo(){
        System.out.println(USER_INFO);
        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
        System.out.println("Phone:"+phone);
    }
}
