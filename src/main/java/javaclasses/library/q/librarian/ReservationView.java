package javaclasses.library.q.librarian;

import javaclasses.library.c.book.Author;
import javaclasses.library.c.book.BookTitle;
import javaclasses.library.c.book.Image;
import javaclasses.library.q.librarian.valueobjects.ReservationVO;

public class ReservationView {

    private final Image image;
    private final ReservationVO reservation;

    public ReservationView(Image image, ReservationVO reservation) {
        this.image = image;
        this.reservation = reservation;
    }
}
