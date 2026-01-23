package shopping;
import java.util.*;
public class ShoppingCart{
    private Map<String, Double> productPriceMap = new HashMap<>();
    private Map<String, Double> cartOrderMap=new LinkedHashMap<>();
    // Add product
    public void addProduct(String product, double price) {
        productPriceMap.put(product, price);
        cartOrderMap.put(product, price);
    }
    // Remove product
    public void removeProduct(String product) {
        productPriceMap.remove(product);
        cartOrderMap.remove(product);
    }
    //display cart items
    public void displayCart() {
        System.out.println("Cart Items (Insertion Order):");
        for (Map.Entry<String, Double> entry : cartOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
    //display items sorted by price
    public void displaySortedByPrice(){
        System.out.println("\nCart Items (Sorted by Price):");
        // TreeMap with price as key
        TreeMap<Double, List<String>> sortedMap=new TreeMap<>();
        for (Map.Entry<String, Double> entry : cartOrderMap.entrySet()) {
            sortedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        for (Map.Entry<Double, List<String>> entry : sortedMap.entrySet()) {
            for (String product :entry.getValue()) {
                System.out.println(product +" - " + entry.getKey());
            }
        }
    }
    //calculate total price
    public double calculateTotal(){
        double total =0;
        for (double price : cartOrderMap.values()) {
            total +=price;
        }
        return total;
    }
}
