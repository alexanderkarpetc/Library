package javaclasses.library.q.librarian;

import javaclasses.library.c.book.BookCoverURL;
import javaclasses.library.q.librarian.valueobject.ReservationVO;

public class ReservationView {

    private final BookCoverURL bookCoverURL;
    private final ReservationVO reservation;

    public ReservationView(BookCoverURL bookCoverURL, ReservationVO reservation) {
        this.bookCoverURL = bookCoverURL;
        this.reservation = reservation;
    }
}
