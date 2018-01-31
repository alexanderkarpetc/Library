package javaclasses.library.c.inventory;

import javaclasses.library.c.ItemStatus;
import javaclasses.library.c.Reservation;
import javaclasses.library.c.UserId;
import javaclasses.library.c.book.BookId;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

    private final InventoryId inventoryId;
    private final BookId bookId;
    private final Map<InventoryItemId, ItemStatus> inventoryItems = new HashMap<>();
    private final List<Reservation> reservations = new ArrayList<>();

    public Inventory(InventoryId inventoryId, BookId bookId) {
        this.inventoryId = inventoryId;
        this.bookId = bookId;
    }

    public boolean borrowBook(UserId userId, InventoryItemId inventoryItemId) {
        throw new UnsupportedOperationException();
    }

    public boolean returnBook(InventoryItemId inventoryItemId) {
        throw new UnsupportedOperationException();
    }

    public boolean addReservation(UserId userId) {
        throw new UnsupportedOperationException();
    }

    public boolean removeReservation(UserId userId) {
        throw new UnsupportedOperationException();
    }

    public boolean appendInventory(InventoryItemId inventoryItemId) {
        throw new UnsupportedOperationException();
    }

    public boolean decreaseInventory(InventoryItemId inventoryItemId) {
        throw new UnsupportedOperationException();
    }
}
