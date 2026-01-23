import java.util.*;
public class SmartCheckout{
    static Queue<String> customerQueue =new LinkedList<>();
    static HashMap<String, Integer> priceMap =new HashMap<>();
    static HashMap<String, Integer> stockMap=new HashMap<>();
    // Add customer
    public static void addCustomer(String name){
        customerQueue.add(name);
        System.out.println(name+" added to queue");
    }
    // Process customer
    public static void processCustomer(String item, int quantity){
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }
        String customer= customerQueue.poll();
        int price=priceMap.get(item);
        int stock=stockMap.get(item);
        if (stock <quantity) {
            System.out.println("Insufficient stock for " +item);
            return;
        }
        int bill= price* quantity;
        stockMap.put(item, stock -quantity);
        System.out.println(customer +" purchased " + quantity + " " + item);
        System.out.println("Bill Amount: "+bill);
    }
    public static void main(String[] args){
        // Initialize price and stock
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 30);
        stockMap.put("Milk", 20);
        stockMap.put("Bread", 20);
        addCustomer("Sanjh");
        addCustomer("Ayushi");
        processCustomer("Milk", 2);
        processCustomer("Bread", 3);
        System.out.println("Remaining Stock: " +stockMap);
    }
}
