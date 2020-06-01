package com.atlassian.tutorial.ao.todo;

import IO.DataREader;
import Model.Book;
import Model.Library;

public class LibraryControl {

    private final int exit = 0;
    private final int addBook = 1;
    private final int printBooks = 2;

    private DataREader dataReader = new DataREader();
    private Library library = new Library();

    public void controlLoop(){
        int option;

        do{
            printOptions();
            option = dataReader.getInt();
            switch (option){
                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                case exit:
                    exit();
            }

        }while (option != exit);
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
