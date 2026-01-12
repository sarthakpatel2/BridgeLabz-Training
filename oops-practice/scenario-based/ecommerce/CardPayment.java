package ecommerce;
public class CardPayment implements Payment{
    @Override
    public void pay(double amount) throws PaymentFailedException{
        if (amount>100000){
            throw new PaymentFailedException("Card limit exceeded");
        }
        System.out.println("Payment of "+amount+"successful via Card");
    }
}
