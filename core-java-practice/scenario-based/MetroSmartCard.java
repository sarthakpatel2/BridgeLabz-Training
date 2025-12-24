import java.util.*;
public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double balance=200.0; //initial balance
        while (balance> 0) {
            System.out.println("\nCurrent Balance: ₹"+balance);
            System.out.print("Enter distance in km (0 to quit): ");
            int distance = sc.nextInt();
            //exit condition
            if (distance == 0) {
                break;
            }
            //fare calculation using ternary operator
            double fare=(distance<= 5)?10 :(distance<=15)?20:30;
            if (fare <=balance) {
                balance-= fare;
                System.out.println("Fare deducted: ₹"+fare);
            } else {
                System.out.println("Insufficient balance");
                break;
            }
        }
        System.out.println("\nJourney Ended. Final Balance: ₹"+balance);
        sc.close();
    }
}
