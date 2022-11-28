package projects.Project07_Biography;

import java.awt.print.Book;
import java.util.ArrayList;

public class author {


    public author (String firstName, String lastName, String country, boolean isAlive, int age, ArrayList<Book> booksList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        this.booksList = booksList;
    }

    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public int age;
    public ArrayList<Book> booksList;

    public static final String askFirstName = "What is your favorite author’s first name?";
    public static final String askLastName = "What is your favorite author’s last name?";
    public static final String askCountry = "Where is your favorite author from?";
    public static final String isAuthorAlive = "Is your favorite author alive? Y/N";
    public static final String askAge = "How old is your favorite author?";

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                (age == 0 ? "" : ", age='" + age + '\'') +
                '}';
    }
}

