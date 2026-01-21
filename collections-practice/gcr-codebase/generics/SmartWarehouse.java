import java.util.*;
//abstract base class
abstract class WarehouseItem{
    String name;
    int quantity;
    WarehouseItem(String name,int quantity){
        this.name =name;
        this.quantity=quantity;
    }
    abstract void displayDetails();
}
//electronics class
class Electronics extends WarehouseItem{
    Electronics(String name,int quantity){
        super(name,quantity);
    }
    void displayDetails(){
        System.out.println("Electronics: "+name+", Qty: "+quantity);
    }
}
// groceries class
class Groceries extends WarehouseItem{
    Groceries(String name,int quantity){
        super(name,quantity);
    }
    void displayDetails(){
        System.out.println("Groceries: "+name+", Qty: "+quantity);
    }
}
//furniture class
class Furniture extends WarehouseItem{
    Furniture(String name, int quantity){
        super(name, quantity);
    }
    void displayDetails(){
        System.out.println("Furniture: "+name+", Qty: "+quantity);
    }
}
//generic storage class
class Storage<T extends WarehouseItem> {
    private List<T> items=new ArrayList<>();
    void addItem(T item){
        items.add(item);
    }
    List<T> getItems(){
        return items;
    }
}
//utility class using Wildcard
class WarehouseUtils {
    static void displayItems(List<? extends WarehouseItem> items){
        for (WarehouseItem item :items){
            item.displayDetails();
        }
    }
}
// main class
public class SmartWarehouse{
    public static void main(String[] args){
        Storage<Electronics> electronics=new Storage<>();
        electronics.addItem(new Electronics("Laptop", 10));
        Storage<Groceries> groceries=new Storage<>();
        groceries.addItem(new Groceries("Rice", 50));
        Storage<Furniture> furniture=new Storage<>();
        furniture.addItem(new Furniture("Chair", 20));
        System.out.println("Warehouse Items ----");
        WarehouseUtils.displayItems(electronics.getItems());
        WarehouseUtils.displayItems(groceries.getItems());
        WarehouseUtils.displayItems(furniture.getItems());
    }
}
