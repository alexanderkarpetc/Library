package javaclasses.library.book;

import javaclasses.library.tinytype.BookDescription;
import javaclasses.library.tinytype.BookId;

import java.util.List;

public class BookUpdated {


    final private BookId id;
    final private BookDescription newDescription;
    final private List<String> category;

    public BookUpdated(BookId id, BookDescription newDescription, List<String> category) {
        this.id = id;
        this.newDescription = newDescription;
        this.category = category;
    }

    public BookId getId() {
        return id;
    }

    public BookDescription getNewDescription() {
        return newDescription;
    }

    public List<String> getCategory() {
        return category;
    }
}
