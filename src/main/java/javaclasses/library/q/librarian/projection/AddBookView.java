package javaclasses.library.q.librarian.projection;

import javaclasses.library.c.book.*;

import java.time.Year;
import java.util.Collection;

public class AddBookView {

    private final Collection<Category> categories;

    public AddBookView(Collection<Category> categories) {
        this.categories = categories;
    }
}
