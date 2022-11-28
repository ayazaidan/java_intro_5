package projects.Project07_Biography;

import java.awt.print.Book;

public class book extends Book {
    public book() {
    }

    public book(String name, String genre, int totalPages) {
        this.name = name;
        this.genre = genre;
        this.totalPages = totalPages;
    }

    public String name;
    public String genre;
    public int totalPages;

    public static final String askBook = "Would you like enter book information? (Y/N)";
    public static final String bookName = "What is the book name?";
    public static final String bookGenre = "What is genre of the book?";
    public static final String pages = "How many pages does book have?";

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPages=" + totalPages +
                '}';
    }
}