import java.util.*;
class TotalPrice{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // item price
        int itemPrice=sc.nextInt();
        // quantity
        int quantity=sc.nextInt();
        // total price
        int totalPrice=itemPrice*quantity;
        // print output
        System.out.print("The total purchase is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+itemPrice);
    }
}