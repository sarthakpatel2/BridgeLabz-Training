import java.util.*;
public class GCDAndLCM{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        int gcd=findGCD(num1, num2);
        int lcm=findLCM(num1,num2);
        System.out.println("GCD= "+gcd);
        System.out.println("LCM= "+lcm);
    }
    //calculate GCD using Euclidean Algorithm
    static int findGCD(int x,int y){
        while (y!=0) {
            int temp=y;
            y=x %y;
            x=temp;
        }
        return x;
    }
    // calculates LCM
    static int findLCM(int x, int y) {
        return (x*y)/findGCD(x,y);
    }
}
