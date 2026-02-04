interface PaymentProcessor{
    void pay(double amount);
    //new feature added later
    default boolean refund(double amount){
        System.out.println("Default refund processed for amount: "+amount);
        return true;
    }
}
class UPIProcessor implements PaymentProcessor{
    public void pay(double amount){
        System.out.println("Paid "+amount+" using UPI");
    }
}
class CreditCardProcessor implements PaymentProcessor{
    public void pay(double amount){
        System.out.println("Paid "+amount+" using Credit Card");
    }
    //overriding default method
    public boolean refund(double amount){
        System.out.println("Credit Card refund processed: "+ amount);
        return true;
    }
}
public class PaymentGateway{
    public static void main(String[] args){
        PaymentProcessor p1=new UPIProcessor();
        PaymentProcessor p2=new CreditCardProcessor();
        p1.pay(1000);
        p1.refund(500);
        p2.pay(1000);
        p2.refund(600);
    }
}
