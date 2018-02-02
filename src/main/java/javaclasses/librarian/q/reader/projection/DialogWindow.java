package javaclasses.librarian.q.reader.projection;

import javaclasses.librarian.q.reader.BookView;

/**
 * Dialog window with book information.
 *
 * When user scans the book to borrow or to return depending of his actions he can see next variants:
 * <li>
 *     <ul>User tries to borrow book the first time -> welcome page with license confirmation.</ul>
 *     <ul>User tries to borrow book -> success borrowing page with OK button.</ul>
 *     <ul>User tries to borrow unavailable book -> cannot borrow book page with explanation.</ul>
 *     <ul>User tries to return borrowed book -> successful return page.</ul>
 * </li>
 */
public class DialogWindow {

    private final BookView book;

    public DialogWindow(BookView book) {
        this.book = book;
    }
}
