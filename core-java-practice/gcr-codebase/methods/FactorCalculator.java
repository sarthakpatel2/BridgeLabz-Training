import java.util.*;
public class FactorCalculator{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number ");
        int number =sc.nextInt();
        int[] factorArray= getFactors(number);
        System.out.println("Factors of "+number +" are");
        for (int i =0;i< factorArray.length; i++) {
            System.out.print(factorArray[i]+" ");
        }
        System.out.println("Sum of factors " + calculateSum(factorArray));
        System.out.println("Product of factors " + calculateProduct(factorArray));
        System.out.println("Sum of squares of factors " + calculateSquareSum(factorArray));
    }
    // finds all factors of the number and returns them in an array
    static int[] getFactors(int num) {
        int totalFactors =0;
        //first loop to count factors
        for (int i =1;i<= num;i++) {
            if (num%i==0) {
                totalFactors++;
            }
        }
        int[] factors= new int[totalFactors];
        int position =0;
        // second loop to store factors
        for (int i =1;i<= num;i++) {
            if (num %i == 0) {
                factors[position] = i;
                position++;
            }
        }
        return factors;
    }
    //calculates sum of factors
    static int calculateSum(int[] arr) {
        int sum =0;
        for (int i= 0; i < arr.length;i++) {
            sum +=arr[i];
        }
        return sum;
    }
    //calculates product of factors
    static long calculateProduct(int[] arr) {
        long product = 1;
        for (int i = 0;i<arr.length;i++) {
            product *=arr[i];
        }
        return product;
    }
    //calculate sum of squares of factors
    static int calculateSquareSum(int[] arr) {
        int squareSum= 0;
        for (int i= 0;i< arr.length; i++) {
            squareSum+= (int) Math.pow(arr[i], 2);
        }
        return squareSum;
    }
}
