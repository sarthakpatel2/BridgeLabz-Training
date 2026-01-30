import java.util.*;
public class CreditCardValidator{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String cardNumber=sc.nextLine();
        String cardRegex ="^(4\\d{15}|5\\d{15})$";
        if(cardNumber.matches(cardRegex)) {
            System.out.println("Valid card number");
        }else{
            System.out.println("Invalid card number");
        }
    }
}
