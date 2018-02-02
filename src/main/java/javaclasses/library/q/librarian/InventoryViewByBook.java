package javaclasses.library.q.librarian;

import javaclasses.library.q.librarian.valueobject.InventoryVO;
import javaclasses.library.q.librarian.valueobject.LoanDetails;

import java.util.List;

public class InventoryViewByBook {

    private final InventoryVO inventory;
    private final List<LoanDetails> loan;

    public InventoryViewByBook(InventoryVO inventory, List<LoanDetails> loan) {
        this.inventory = inventory;
        this.loan = loan;
    }
}
