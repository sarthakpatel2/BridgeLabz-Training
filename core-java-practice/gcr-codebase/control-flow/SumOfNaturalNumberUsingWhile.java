import java.util.*;
class SumOfNaturalNumberUsingWhile{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //check natural number
        if (n<=0) {
            System.out.println("Enter a natural number");
        } else {
            // sum using while
            int sumUsingWhile=0;
            int i=1;
            while (i<=n) {
                sumUsingWhile=sumUsingWhile+i;
                i++;
            }
            // sum using formula
            int sumFormula=n*(n+1)/2;
            // display results
            System.out.println("Sum using while loop= " +sumUsingWhile);
            System.out.println("Sum using formula= " +sumFormula);
            // compare results
            if (sumUsingWhile==sumFormula) {
                System.out.println("Both results are equal");
            } else {
                System.out.println("Results are not equal");
            }
        }
    }
}
