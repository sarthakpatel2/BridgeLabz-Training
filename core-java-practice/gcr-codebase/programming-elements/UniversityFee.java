import java.util.*;
class UniversityFee{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // total fee
        int fee=sc.nextInt();
        // discount percentage
        int discountPercent=sc.nextInt();
        // discount calculation
        int discount=(fee*discountPercent)/100;
        // payable fee calculation
        int payableFee=fee-discount;
        // print output
        System.out.print("The discounted amount is INR "+discount+" and final discounted fee is INR "+payableFee);
    }
}