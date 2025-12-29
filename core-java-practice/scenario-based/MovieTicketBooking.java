import java.util.*;
public class MovieTicketBooking{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean moreCustomers = true;
        while (moreCustomers){
            int ticketPrice=0;
            int snacksPrice=0;
            // Movie type selection
            System.out.println("\nSelect Movie Type:");
            System.out.println("1. Regular");
            System.out.println("2. 3D");
            System.out.println("3. IMAX");
            System.out.print("Enter choice: ");
            int movieType=sc.nextInt();
            switch (movieType) {
                case 1:
                    ticketPrice=150;
                    break;
                case 2:
                    ticketPrice=250;
                    break;
                case 3:
                    ticketPrice=350;
                    break;
                default:
                    System.out.println("Invalid movie type");
                    continue;
            }
            // seat type selection
            System.out.print("Enter seat type(gold/silver): ");
            String seatType = sc.next().toLowerCase();
            if (seatType.equals("gold")) {
                ticketPrice+=100;
            } else if(seatType.equals("silver")) {
                ticketPrice+=50;
            } else{
                System.out.println("Invalid seat type");
                continue;
            }
            // Snacks option
            System.out.print("Do you want snacks?(yes/no): ");
            String snacks=sc.next().toLowerCase();
            if (snacks.equals("yes")) {
                snacksPrice=80;
            }
            int totalAmount=ticketPrice+snacksPrice;
            System.out.println("Total Ticket Price: ₹"+totalAmount);
            //loop for multiple customers
            System.out.print("\nNext customer? (yes/no): ");
            String choice = sc.next().toLowerCase();
            if (!choice.equals("yes")) {
                moreCustomers=false;
            }
        }
        System.out.println("\nBooking closed");
    }
}
