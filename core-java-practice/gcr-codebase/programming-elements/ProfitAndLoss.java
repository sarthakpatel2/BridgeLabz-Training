class ProfitAndLoss{
    public static void main(String[] args){
        // cost price
        int costPrice=129;
        // selling price
        int sellingPrice=191;
        // profit calculation
        int profit=sellingPrice-costPrice;
        // profit percentage calculation
        double profitPercentage=(profit*100)/costPrice;
        // print output
        System.out.print("The Cost Price is INR"+costPrice+"and selling price is INR"+sellingPrice);
        System.out.println("The Profit is INR"+profit+"and the profit percentage is "+profitPercentage);

    }
}