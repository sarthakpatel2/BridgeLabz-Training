import java.util.*;
class QuotientAndRemainder{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // first number input
        System.out.print("Enter the first number:");
        int number1=sc.nextInt();
        // second number input
        System.out.print("Enter the second number:");
        int number2=sc.nextInt();
        // quotient calculation
        int quotient=number1/number2;
        // remainder calculation
        int remainder=number1%number2;
        // output
        System.out.print("The quotient is "+quotient+" and remainder is "+remainder);
    }
}