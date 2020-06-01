package IO;

import Model.Book;

import java.util.Scanner;

public class DataREader {
    private Scanner sc = new Scanner(System.in);

    public Book readAndCreateBook(){
        System.out.println("Tytuł");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.println("Autor");
        String author = sc.nextLine();
        System.out.println("Wydawnicto");
        String wydawnictwo = sc.nextLine();
        System.out.println("Isbn");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania");
        int yearRelease = sc.nextInt();
        sc.nextLine();
        System.out.println("Liczba stron");
        int pages = sc.nextInt();
        sc.nextLine();

        return new Book(title, author, yearRelease, pages, wydawnictwo, isbn);
    }

    public int getInt(){
        int number = sc.nextInt();
        return number;
    }

    public void close(){
        sc.close();
    }
}
