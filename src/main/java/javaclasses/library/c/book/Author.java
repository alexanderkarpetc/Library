package javaclasses.library.c.book;

import java.util.Collection;

public class Author {

    private final String firstName;
    private final String lastName;
    private final Collection<Book> books;

    public Author(String firstName, String lastName, Collection<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }
}
