import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Order{
    String customer;
    double totalAmount;
    Order(String customer, double totalAmount) {
        this.customer=customer;
        this.totalAmount=totalAmount;
    }
    String getCustomer(){
        return customer;
    }
    double getTotalAmount(){
        return totalAmount;
    }
}
public class OrderRevenueSummary{
    public static void main(String[] args){
        List<Order> orders =Arrays.asList(
            new Order("Sanjh", 2500.50),
            new Order("Ayushi", 1800.00),
            new Order("Pragati", 1200.75),
            new Order("Akriti", 700.25),
            new Order("Saumya", 3000.00)
        );
        Map<String, Double> revenuePerCustomer=
            orders.stream()
                  .collect(Collectors.groupingBy(
                      Order::getCustomer,
                      Collectors.summingDouble(Order::getTotalAmount)
                  ));
        System.out.println(revenuePerCustomer);
    }
}
