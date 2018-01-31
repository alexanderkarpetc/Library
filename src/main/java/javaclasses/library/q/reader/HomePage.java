package javaclasses.library.q.reader;

import javaclasses.library.c.book.Category;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Represents home page. Books are sorted according to their status:
 * <li>
 * <ul>first overdue</ul>
 * <ul>second borrowed</ul>
 * <ul>third reserved</ul>
 * </li>
 * (or maybe some more sorting: for example for new hot books)
 */
public class HomePage {

    private final List<BookView> books = new ArrayList<>();
    private final Collection<Category> categories;

    public HomePage(Collection<Category> categories) {
        this.categories = categories;
    }
}
