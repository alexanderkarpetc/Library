package javaclasses.librarian.q.librarian.projection;

import javaclasses.librarian.q.librarian.LoanDetails;

import java.util.List;

/**
 * Opened book report in inventory.
 * <p>
 * Click on book in inventory.
 */
public class ExtendedInventoryView {

    private final List<LoanDetails> loans;


    public ExtendedInventoryView(List<LoanDetails> loans) {
        this.loans = loans;
    }
}
