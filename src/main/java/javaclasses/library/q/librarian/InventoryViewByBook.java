package javaclasses.library.q.librarian;

import java.util.List;

public class InventoryViewByBook {

    private final InventoryDetails inventory;
    private final List<LoanDetails> loan;

    public InventoryViewByBook(InventoryDetails inventory, List<LoanDetails> loan) {
        this.inventory = inventory;
        this.loan = loan;
    }
}
