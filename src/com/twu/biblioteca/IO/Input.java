package com.twu.biblioteca.IO;

import java.util.Scanner;

public class Input {
    public static String getInput(String mes){
        Scanner in = new Scanner(System.in);
        System.out.print(mes);
        return in.nextLine().trim();
    }
}
