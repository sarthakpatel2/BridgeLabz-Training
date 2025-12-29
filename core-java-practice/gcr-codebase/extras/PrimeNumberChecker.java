import java.util.*;
public class PrimeNumberChecker{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if (isPrime(num)){
            System.out.println(num+" is a Prime number");
        } else{
            System.out.println(num+" is not a Prime number");
        }
    }
    //checks if number is prime
    static boolean isPrime(int n) {
        if (n<=1) return false;

        for (int i=2;i<=n/2;i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }
}
