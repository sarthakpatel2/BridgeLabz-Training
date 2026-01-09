//node class
class Item{
    int itemId;
    String itemName;
    int quantity;
    double price;
    Item next;
    Item(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
// Singly Linked List class
class InventoryList {
    private Item head;
    //add at beginning
    void addAtBeginning(int id, String name, int qty, double price) {
        Item newItem = new Item(id, name, qty, price);
        newItem.next = head;
        head = newItem;
    }
    //add at end
    void addAtEnd(int id, String name, int qty, double price) {
        Item newItem = new Item(id, name, qty, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }
    //add at specific position
    void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, qty, price);
            return;
        }
        Item temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Item newItem = new Item(id, name, qty, price);
        newItem.next = temp.next;
        temp.next = newItem;
    }
    //remove item by ID
    void removeById(int id) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        if (head.itemId == id) {
            head = head.next;
            System.out.println("Item removed successfully.");
            return;
        }
        Item prev = head;
        Item curr = head.next;
        while (curr != null) {
            if (curr.itemId == id) {
                prev.next = curr.next;
                System.out.println("Item removed successfully.");
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Item not found.");
    }
    // update quantity by ID
    void updateQuantity(int id, int newQty) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println("Quantity updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }
    //search by ID
    void searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }
    //search by Name
    void searchByName(String name) {
        Item temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("Item not found.");
    }
    //calculate total inventory value
    void calculateTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: ₹" + total);
    }
    //display inventory
    void displayAll() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Item temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }
    //merge Sort entry
    void sortByName(boolean ascending) {
        head = mergeSort(head, true, ascending);
    }
    void sortByPrice(boolean ascending) {
        head = mergeSort(head, false, ascending);
    }
    // Merge Sort logic
    private Item mergeSort(Item h, boolean sortByName, boolean asc) {
        if (h == null || h.next == null)
            return h;
        Item middle = getMiddle(h);
        Item nextOfMiddle = middle.next;
        middle.next = null;
        Item left = mergeSort(h, sortByName, asc);
        Item right = mergeSort(nextOfMiddle, sortByName, asc);
        return sortedMerge(left, right, sortByName, asc);
    }
    private Item sortedMerge(Item a, Item b, boolean sortByName, boolean asc) {
        if (a == null) return b;
        if (b == null) return a;
        boolean condition;
        if (sortByName) {
            condition = asc ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                            : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        } else {
            condition = asc ? a.price <= b.price : a.price > b.price;
        }
        Item result;
        if (condition) {
            result = a;
            result.next = sortedMerge(a.next, b, sortByName, asc);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, sortByName, asc);
        }
        return result;
    }
    private Item getMiddle(Item head) {
        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //helper
    void displayItem(Item i) {
        System.out.println("ID: " + i.itemId +", Name: " + i.itemName +", Qty: " + i.quantity +", Price: ₹" + i.price);
    }
}
// main class
public class InventoryManagementSystem{
    public static void main(String[] args){
        InventoryList inventory = new InventoryList();
        inventory.addAtEnd(101, "Laptop", 5, 60000);
        inventory.addAtBeginning(102, "Mouse", 20, 500);
        inventory.addAtEnd(103, "Keyboard", 10, 1500);
        inventory.addAtPosition(2, 104, "Monitor", 7, 12000);
        System.out.println("\nInventory List:");
        inventory.displayAll();
        System.out.println("\nSearch by ID:");
        inventory.searchById(103);
        System.out.println("\nUpdate Quantity:");
        inventory.updateQuantity(102, 25);
        System.out.println("\nTotal Inventory Value:");
        inventory.calculateTotalValue();
        System.out.println("\nSort by Name (Ascending):");
        inventory.sortByName(true);
        inventory.displayAll();
        System.out.println("\nSort by Price (Descending):");
        inventory.sortByPrice(false);
        inventory.displayAll();
    }
}
