package javaclasses.library.c.book;

import javafx.scene.image.Image;

import java.util.Collection;

public class Book {

    final private BookId id;
    final private ISBN isbn;
    final private Image cover;
    final private BookTitle title;
    final private Author author;
    final private BookDescription description;
    final private Collection<Category> category;

    public Book(BookId id, ISBN isbn, Image cover, BookTitle title, Author author, BookDescription description, Collection<Category> category) {
        this.id = id;
        this.isbn = isbn;
        this.cover = cover;
        this.title = title;
        this.author = author;
        this.description = description;
        this.category = category;
    }
}
