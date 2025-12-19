import java.util.*;
class SumOfNaturalNumberUsingFor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //check natural number
        if (n<=0) {
            System.out.println("Enter a natural number");
        } else {
            // sum using for
            int sumUsingFor=0;
            for (int i=1; i<=n; i++) {
                sumUsingFor=sumUsingFor+i;
            }
            // sum using formula
            int sumFormula=n*(n+1)/2;
            // display results
            System.out.println("Sum using while loop= " +sumUsingFor);
            System.out.println("Sum using formula= " +sumFormula);
            // compare results
            if (sumUsingFor==sumFormula) {
                System.out.println("Both results are equal");
            } else {
                System.out.println("Results are not equal");
            }
        }
    }
}
