public class ThrowVsThrows{
    // method declared exception using throws
    static double calculateInterest(double amount, double rate, int years)throws IllegalArgumentException{
        // explicitly throwing exception using throw
        if (amount <0|| rate<0){
            throw new IllegalArgumentException("Invalid input");
        }
        return (amount*rate*years)/100;
    }
    public static void main(String[] args){
        try {
            double interest=calculateInterest(15000,7,3);
            System.out.println("Calculated Interest: "+interest);
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid input");
        }
    }
}
