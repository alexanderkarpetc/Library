package javaclasses.librarian.q.librarian.projection;

import javaclasses.librarian.c.book.Category;

import java.util.Collection;

public class AddBookView {

    private final Collection<Category> categories;

    public AddBookView(Collection<Category> categories) {
        this.categories = categories;
    }
}
