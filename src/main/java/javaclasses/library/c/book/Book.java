package javaclasses.library.c.book;

import java.util.List;

public class Book {
    final private BookId id;
    final private ISBN isbn;
    final private Image cover;
    final private BookTitle title;
    final private Author author;
    final private BookDescription description;
    final private List<String> category;

    public Book(BookId id, ISBN isbn, Image cover, BookTitle title, Author author, BookDescription description, List<String> category) {
        this.id = id;
        this.isbn = isbn;
        this.cover = cover;
        this.title = title;
        this.author = author;
        this.description = description;
        this.category = category;
    }
}
