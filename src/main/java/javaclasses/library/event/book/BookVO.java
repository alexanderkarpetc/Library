package javaclasses.library.event.book;

import javaclasses.library.tinytype.*;
import javafx.scene.image.Image;

import java.util.List;

public class BookVO {
    final private BookId id;
    final private ISBN isbn;
    final private Image cover;
    final private BookTitle title;
    final private BookAuthor author;
    final private BookDescription description;
    final private List<String> category;

    public BookVO(BookId id, ISBN isbn, Image cover, BookTitle title, BookAuthor author, BookDescription description, List<String> category) {
        this.id = id;
        this.isbn = isbn;
        this.cover = cover;
        this.title = title;
        this.author = author;
        this.description = description;
        this.category = category;
    }
}
