package ecommerce;
public class UPIPayment implements Payment{
    @Override
    public void pay(double amount) throws PaymentFailedException{
        if (amount>25000){
            throw new PaymentFailedException("UPI transaction limit exceeded");
        }
        System.out.println("Payment of "+amount+ " successful via UPI");
    }
}
