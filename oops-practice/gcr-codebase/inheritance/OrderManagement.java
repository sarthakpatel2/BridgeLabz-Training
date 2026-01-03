class Order{
    int orderId;
    String orderDate;
    //constructor of parent
    Order(int orderId, String orderDate){
        //initialize the properties
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    String getOrderStatus() {
        return "Order Placed";
    }
}
// first level subclass
class ShippedOrder extends Order{
    String trackNumber;
     //constructor of subclass
    ShippedOrder(int orderId,String orderDate,String trackNumber){
        //call parent constructor
        super(orderId,orderDate);
        //initailize subclass properties
        this.trackNumber=trackNumber;
    }
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}
//second level subclass
class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
     //constructor of subclass
    DeliveredOrder(int orderId,String orderDate,String trackNumber,String deliveryDate){
        super(orderId,orderDate,trackNumber);
        this.deliveryDate=deliveryDate;
    }
    @Override
    String getOrderStatus(){
        return "Order Delivered";
    }
}
// main class
public class OrderManagement{
    public static void main(String[] args){
        //create objects
        Order o1=new Order(101,"01-01-2026");
        Order o2=new ShippedOrder(102,"02-01-2026","12345");
        Order o3=new DeliveredOrder(103,"03-01-2026","67890","05-01-2026");
        //display order status
        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
