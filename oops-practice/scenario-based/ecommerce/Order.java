package ecommerce;
public class Order{
    private int orderId;
    private Customer customer;
    private Product product;
    private String status;
    public Order(int orderId, Customer customer, Product product){
        this.orderId=orderId;
        this.customer=customer;
        this.product=product;
        this.status="placed";
    }
    public void cancelOrder(){
        status="cancelled";
        System.out.println("Order "+orderId+" has been cancelled");
    }
    public void trackOrder(){
        System.out.println("Order "+orderId+" status: "+status);
    }
    public double getOrderAmount(){
        return product.getPrice();
    }
    @Override
    public String toString(){
        return "Order ID: "+orderId+", Customer: "+customer.getName()+", Product: "+product+", Status: " +status;
    }
}
