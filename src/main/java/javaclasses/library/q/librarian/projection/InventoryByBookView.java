package javaclasses.library.q.librarian.projection;

import javaclasses.library.q.librarian.InventoryDetails;
import javaclasses.library.q.librarian.LoanDetails;

import java.util.List;

public class InventoryByBookView {

    private final InventoryDetails inventory;
    private final List<LoanDetails> loan;

    public InventoryByBookView(InventoryDetails inventory, List<LoanDetails> loan) {
        this.inventory = inventory;
        this.loan = loan;
    }
}
