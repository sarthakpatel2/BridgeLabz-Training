import java.util.*;
public class FibonacciSequence{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number for fibonacci sequence: ");
        int n=sc.nextInt();
        printFibonacci(n);
    }
    // calculate and print Fibonacci sequence
    static void printFibonacci(int n){
        int a=0, b=1;
        System.out.print("Fibonacci Series is: ");
        for (int i =1;i<=n;i++) {
            System.out.print(a+" ");
            int temp=a+b;
            a=b;
            b=temp;
        }
    }
}
