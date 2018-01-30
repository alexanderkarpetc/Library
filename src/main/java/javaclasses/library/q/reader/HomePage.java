package javaclasses.library.q.reader;

import javaclasses.library.c.ItemStatus;
import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookVO;

import java.util.Map;
import java.util.TreeMap;

/**
 * Represents home page. Books are sorted according to their status:
 * <li>
 *     <ul>first overdue</ul>
 *     <ul>second borrowed</ul>
 *     <ul>third reserved</ul>
 * </li>
 * (or maybe some more sorting: for example for new hot books)
 */
public class HomePage {
    private Map<BookVO, ItemStatus> books = new TreeMap<>();
    private Collection<Category> categories; //???
    private UserId currentUser;//???

}
