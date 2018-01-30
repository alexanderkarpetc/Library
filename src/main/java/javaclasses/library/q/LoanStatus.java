package javaclasses.library.q;

import javaclasses.library.c.book.BookId;
import javaclasses.library.c.inventory.Inventory;
import javaclasses.library.c.inventory.InventoryId;

public class LoanStatus {

        private final LoanCondition condition;
        private InventoryId inventoryId;

        public LoanStatus(LoanCondition condition) {
            this.condition = condition;
        }

        public LoanStatus(InventoryId inventoryId, LoanCondition condition) {
            this.inventoryId = inventoryId;
            this.condition = condition;
        }

        public InventoryId getInventoryId() {
            return inventoryId;
        }

        public LoanCondition getCondition() {
            return condition;
        }
}
