package javaclasses.library.q.librarian;

import javaclasses.library.c.book.BookCoverURL;

public class ReservationView {

    private final BookCoverURL bookCoverURL;
    private final ReservationDetails reservation;

    public ReservationView(BookCoverURL bookCoverURL, ReservationDetails reservation) {
        this.bookCoverURL = bookCoverURL;
        this.reservation = reservation;
    }
}
