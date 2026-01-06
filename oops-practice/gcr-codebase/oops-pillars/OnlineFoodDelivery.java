import java.util.*;
interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    abstract double calculateTotalPrice();
    void getItemDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
    }
}
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }
    public void getDiscountDetails() {
        System.out.println("Discount    : 10% on Veg Item");
    }
}
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    public double calculateTotalPrice() {
        double basePrice = getPrice() * getQuantity();
        return basePrice +50; // extra non-veg charge
    }
    public double applyDiscount() {
        return calculateTotalPrice() * 0.25; // 5% discount
    }
    public void getDiscountDetails(){
        System.out.println("Discount : 25% on Non-Veg Item");
    }
}
public class OnlineFoodDelivery{
    public static void main(String[] args) {
        List<FoodItem> orderList = new ArrayList<>();
        FoodItem f1 = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 1);
        orderList.add(f1);
        orderList.add(f2);
        // Polymorphism
        for (FoodItem item : orderList){
            System.out.println();
            item.getItemDetails();
            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price : " + totalPrice);
            Discountable d = (Discountable) item;
            d.getDiscountDetails();
            double discount = d.applyDiscount();
            System.out.println("Discount Amt: " + discount);
            System.out.println("Final Price : " +(totalPrice - discount));
        }
    }
}
