class FeeDiscount{
    public static void main(String[] args){
        // total fee
        int fee=125000;
        // discount percentage
        int discountPercent=10;
        // discount calculation
        int discount=(fee*discountPercent)/100;
        // payable fee calculation
        int payableFee=fee-discount;
        // print output
        System.out.print("The discounted amount is INR "+discount+" and final discounted fee is INR "+payableFee);
    }
}