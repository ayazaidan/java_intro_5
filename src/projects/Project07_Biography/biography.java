package projects.Project07_Biography;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class biography {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(author.askFirstName);
        String firstName = scan.nextLine();
        System.out.println(author.askLastName);
        String lastName = scan.nextLine();
        System.out.println(author.askCountry);
        String country = scan.nextLine();
        System.out.println(author.isAuthorAlive);
        boolean isAlive = scan.nextLine().toLowerCase().startsWith("y");

        ArrayList<Book> booksList = new ArrayList<>();
        ArrayList<author> authors = new ArrayList<>();
        String enterInfo;

        if (isAlive) {
            System.out.println(author.askAge);
            int age = scan.nextInt();
            scan.nextLine();
        }
        do {
            System.out.println(book.askBook);
            enterInfo = scan.nextLine();
            if (enterInfo.toLowerCase().equals("y")) {
                System.out.println(book.askBook);
                String name = scan.nextLine();
                System.out.println(book.bookGenre);
                String genre = scan.nextLine();
                System.out.println(book.pages);
                int totalPages = scan.nextInt();
                scan.nextLine();

                book books = new book(name,genre,totalPages);
                booksList.add(books);
            }else System.out.println("THE END RESULT OF ABOVE PROGRAM");
        } while (enterInfo.toLowerCase().equals("y"));

        int age = 0;

        author author = new author(firstName,lastName,country,isAlive,age,booksList);
        authors.add(author);
        System.out.println("Author's information = " + authors);
        System.out.println("Author's books are as listed below: ");
        for (Book b : booksList) {
            System.out.println(b);
        }

    }
}