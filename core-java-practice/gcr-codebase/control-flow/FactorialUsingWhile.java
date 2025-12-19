import java.util.*;
class FactorialUsingWhile{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // take input
        int number=sc.nextInt();
        // calculate factorial
        int factorial=1;
        int i=1;
        while(i<number){
            factorial=factorial*i;
            i++;
        }
        System.out.print("Factorial of "+number+" is: "+factorial);
    }
}