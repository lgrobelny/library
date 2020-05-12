package com.atlassian.tutorial.ao.todo;

import IO.DataREader;
import Model.Book;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String appName = "v 2.0";
        Scanner scan = new Scanner(System.in);
        Book book = new Book();

        Book[] books = new Book[1000];
        DataREader dataREader = new DataREader();
        for(int i = 0; i < books.length; i++){
            if(books[i] == null){
                book = books[i];
            }
        }
        System.out.println("Tytuł");
        String title = scan.nextLine();
        System.out.println("Autor");
        String author = scan.nextLine();
        System.out.println("Wydawnicto");
        String wydawnictwo = scan.nextLine();
        System.out.println("Isbn");
        String isbn = scan.nextLine();
        System.out.println("Rok wydania");
        int yearRelease = scan.nextInt();
        scan.nextLine();
        System.out.println("Liczba stron");
        int pages = scan.nextInt();
        scan.nextLine();

        System.out.println(appName);
        books[0].printInfo();
        for(int i = 0; i< books.length; i++){
            books[i].printInfo();
        }



      
	// write your code here
    }
}
