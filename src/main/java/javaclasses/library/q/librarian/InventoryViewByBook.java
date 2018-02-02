package javaclasses.library.q.librarian;

import javaclasses.library.q.librarian.valueobject.InventoryDetails;
import javaclasses.library.q.librarian.valueobject.LoanDetails;

import java.util.List;

public class InventoryViewByBook {

    private final InventoryDetails inventory;
    private final List<LoanDetails> loan;

    public InventoryViewByBook(InventoryDetails inventory, List<LoanDetails> loan) {
        this.inventory = inventory;
        this.loan = loan;
    }
}
