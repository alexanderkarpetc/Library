package javaclasses.library.q.librarian.valueobject;

import javaclasses.library.c.UserId;
import javaclasses.library.c.book.Author;
import javaclasses.library.c.book.BookTitle;

import java.util.Date;
import java.util.List;

public class ReservationVO {

    private final BookTitle title;
    private final List<Author> authors;
    private final UserId userId;
    private final Date madeON;

    public ReservationVO(BookTitle title, List<Author> authors, UserId userId, Date madeON) {
        this.title = title;
        this.authors = authors;
        this.userId = userId;
        this.madeON = madeON;
    }

}
