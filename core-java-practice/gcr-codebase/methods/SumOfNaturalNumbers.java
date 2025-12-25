import java.util.*;
public class SumOfNaturalNumbers{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number ");
        int n=sc.nextInt();
        // Check for natural number
        if (n<=0) {
            System.out.println("Please enter a valid natural number");
            return;
        }
        int recSum=sumRecursion(n);
        int formulaSum=sumFormula(n);
        System.out.println("Sum using recursion "+recSum);
        System.out.println("Sum using formula "+formulaSum);
        //compare results
        if (recSum==formulaSum) {
            System.out.println("Both results are correct and matched");
        } else {
            System.out.println("Results are not matching");
        }
    }
    // Recursive method to find sum of n natural numbers
    static int sumRecursion(int n) {
        if (n ==1) {
            return 1;
        }
        return n+sumRecursion(n-1);
    }
    //method to find sum using formula n*(n+1)/2
    static int sumFormula(int n) {
        return n*(n+1)/2;
    }
}
