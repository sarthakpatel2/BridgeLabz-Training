package inventory;
public class Main{
    public static void main(String[] args){
        AlertService alertService = new ConsoleAlertService();
        Inventory inventory = new Inventory(alertService);
        try{
            inventory.addProduct(new Product(101, "Laptop", 10));
            inventory.addProduct(new Product(102, "Mouse", 4));
            inventory.showInventory();
            inventory.updateStock(102, -2);
            inventory.updateStock(102, -2); //low stock alert
            inventory.updateStock(102, -5); // exception
        } catch (OutOfStockException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (Exception e){
            System.out.println("File Error: "+e.getMessage());
        }
    }
}
