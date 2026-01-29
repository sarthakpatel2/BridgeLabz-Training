package futurelogistics;

import java.util.Scanner;
public class UserInterface{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Utility utility=new Utility();
        System.out.println("Enter the Goods Transport details");
        String input =sc.nextLine();
        GoodsTransport transport=utility.parseDetails(input);
        if (transport== null)
            return;
        System.out.println("\nTransporter id : "+ transport.getTransportId());
        System.out.println("Date of transport : "+transport.getTransportDate());
        System.out.println("Rating of the transport : "+transport.getTransportRating());
        if (transport instanceof BrickTransport){
            BrickTransport bt=(BrickTransport) transport;
            System.out.println("Quantity of bricks : "+bt.getBrickQuantity());
            System.out.println("Brick price : "+bt.getBrickPrice());
        }
        if (transport instanceof TimberTransport){
            TimberTransport tt =(TimberTransport) transport;
            System.out.println("Type of the timber : "+tt.getTimberType());
            System.out.println("Timber price per kilo : "+tt.getTimberPrice());
        }
        System.out.println("Vehicle for transport : "+transport.vehicleSelection());
        System.out.println("Total charge : "+transport.calculateTotalCharge());
    }
}
