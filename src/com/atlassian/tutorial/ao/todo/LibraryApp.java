package com.atlassian.tutorial.ao.todo;

import Model.Library;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka 1.1";
        System.out.println(appName);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();

    }
}
