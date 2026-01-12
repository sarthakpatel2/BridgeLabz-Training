package inventory;
import java.io.*;
import java.util.*;
public class Inventory {
    private static final String FILE_NAME = "inventory.txt";
    private static final int LOW_STOCK_LIMIT = 5;
    private AlertService alertService;
    public Inventory(AlertService alertService) {
        this.alertService = alertService;
    }
    public void addProduct(Product product) throws IOException {
        FileWriter fw =new FileWriter(FILE_NAME, true);
        fw.write(product.toString() + "\n");
        fw.close();
        System.out.println("Product added: " + product.name);
    }
    public List<Product> loadProducts() throws IOException {
        List<Product> products = new ArrayList<>();
        File file=new File(FILE_NAME);
        if (!file.exists()) return products;
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            products.add(Product.fromString(line));
        }
        br.close();
        return products;
    }
    public void updateStock(int productId, int quantity)
            throws IOException, OutOfStockException {
        List<Product> products =loadProducts();
        boolean found =false;
        for (Product p : products) {
            if (p.id ==productId) {
                found=true;
                if (p.stock+quantity <0) {
                    throw new OutOfStockException("Insufficient stock for "+p.name);
                }
                p.stock+=quantity;
                System.out.println("Updated stock for "+p.name + "- " + p.stock);
                if (p.stock <= LOW_STOCK_LIMIT) {
                    alertService.sendLowStockAlert(p);
                }
            }
        }
        if (!found) {
            System.out.println("Product not found");
            return;
        }
        FileWriter fw = new FileWriter(FILE_NAME);
        for (Product p: products) {
            fw.write(p.toString() + "\n");
        }
        fw.close();
    }
    public void showInventory() throws IOException {
        List<Product> products = loadProducts();
        System.out.println("\nINVENTORY STATUS :---");
        for (Product p : products) {
            System.out.println(p.id + " | " + p.name +" | Stock: " + p.stock);
        }
    }
}
