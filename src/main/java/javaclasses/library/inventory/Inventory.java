package javaclasses.library.inventory;

import javaclasses.library.Reservation;
import javaclasses.library.Status;
import javaclasses.library.tinytype.BookId;
import javaclasses.library.tinytype.InventoryId;
import javaclasses.library.tinytype.InventoryItemId;
import javaclasses.library.tinytype.UserId;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private final InventoryId inventoryId;
    private final BookId bookId;
    private final Map<InventoryItemId, Status> inventoryItems = new HashMap<>();
    private final List<Reservation> reservations = new ArrayList<>();

    public Inventory(InventoryId inventoryId, BookId bookId) {
        this.inventoryId = inventoryId;
        this.bookId = bookId;
    }

    public InventoryId getInventoryId() {
        return inventoryId;
    }

    public BookId getBookId() {
        return bookId;
    }

    public Map<InventoryItemId, Status> getInventoryItems() {
        return inventoryItems;
    }

    public List<Reservation> getReservations() {
        return reservations;
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
