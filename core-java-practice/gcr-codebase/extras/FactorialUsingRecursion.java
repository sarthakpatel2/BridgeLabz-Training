import java.util.*;
public class FactorialUsingRecursion{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int num=takeInput();
        long result=factorial(num);
        displayResult(num,result);
    }
    // takes input
    static int takeInput(){
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }
    //recursive factorial calculation
    static long factorial(int n) {
        if (n== 0||n== 1)
            return 1;
        return n*factorial(n-1);
    }
    // displays output
    static void displayResult(int num, long result) {
        System.out.println("Factorial of "+num+" = "+result);
    }
}
