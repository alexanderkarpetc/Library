package javaclasses.librarian.q.librarian.projection;

import javaclasses.librarian.c.book.Category;

import java.util.Collection;

/**
 * {@code AddBookView} there view for adding book.
 * <p>
 * View consist of fields for writing book details.
 */
public class AddBookView {

    private final Collection<Category> categories;

    public AddBookView(Collection<Category> categories) {
        this.categories = categories;
    }
}
