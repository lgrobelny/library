package com.atlassian.tutorial.ao.todo;

import IO.DataREader;
import Model.Book;
import Model.Library;

public class LibraryControl {

    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int PRINT_BOOKS = 2;

    private DataREader dataReader = new DataREader();
    private Library library = new Library();

    public void controlLoop(){
        int option;

        do{
            printOptions();
            option = dataReader.getInt();
            switch (option){
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case EXIT:
                    exit();
            }

        }while (option != EXIT);
    }

    private void exit(){
        System.out.println("Kobiec programu");
        dataReader.close();
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book =  dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Wybierz opcje");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - dodanie nowej książki");
        System.out.println("2 - wyświetl książki");
    }

}
