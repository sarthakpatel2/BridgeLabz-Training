package shopping;
public class Main{
    public static void main(String[] args){
        ShoppingCart cart =new ShoppingCart();
        cart.addProduct("Laptop",70000);
        cart.addProduct("Mouse", 2000);
        cart.addProduct("Keyboard",3500);
        cart.addProduct("Monitor",22000);
        cart.displayCart();
        cart.displaySortedByPrice();
        System.out.println("\nTotal Amount: " + cart.calculateTotal());
        cart.removeProduct("Mouse");
        System.out.println("\nRemoving Mouse---");
        cart.displayCart();
        System.out.println("\nUpdated Total: " + cart.calculateTotal());
    }
}
