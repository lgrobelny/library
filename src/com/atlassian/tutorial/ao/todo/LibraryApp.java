package com.atlassian.tutorial.ao.todo;

import IO.DataREader;
import Model.Book;

import java.util.Scanner;

public class LibraryApp {

    private static final String APP_NAME = "Biblioteka ver 1.0";

    public static void main(String[] args) {

        System.out.println(APP_NAME);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();


        // write your code here
    }
}
