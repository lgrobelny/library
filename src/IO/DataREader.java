package IO;

import Model.Book;

import java.util.Scanner;

public class DataREader {
    private Scanner scan = new Scanner(System.in);

    public Book readAndCreateBook(){
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

        return new Book(title, author, yearRelease, pages, wydawnictwo, isbn);
    }

    public int getInt(){
        int number = scan.nextInt();
        return number;
    }

    public void close(){
        scan.close();
    }
}
