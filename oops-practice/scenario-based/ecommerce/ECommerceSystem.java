package ecommerce;
import java.util.*;
public class ECommerceSystem{
    public static void main(String[] args){
        List<Product> products=new ArrayList<>();
        products.add(new Product(101,"Laptop",69000));
        products.add(new Product(102,"Smartphone",24000));
        products.add(new Product(103,"Headphones",7000));
        Customer customer=new Customer(1,"Sarthak");
        System.out.println("Available Products:-");
        for(Product p:products){
            System.out.println(p);
        }
        Order order=new Order(001,customer, products.get(1));
        System.out.println("\nOrder Placed:-");
        System.out.println(order);
        Payment payment=new UPIPayment();
        try{
            payment.pay(order.getOrderAmount());
            System.out.println("Payment successful");
        }catch (PaymentFailedException e){
            System.out.println("Payment Failed: "+e.getMessage());
        }
        order.trackOrder();
        order.cancelOrder();
        order.trackOrder();
    }
}
