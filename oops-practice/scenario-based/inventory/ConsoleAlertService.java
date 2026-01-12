package inventory;
public class ConsoleAlertService implements AlertService{
    @Override
    public void sendLowStockAlert(Product product) {
        System.out.println("low stock: " +
                product.name + " (Stock: "+product.stock + ")");
    }
}
