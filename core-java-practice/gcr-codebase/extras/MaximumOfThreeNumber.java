import java.util.*;
public class MaximumOfThreeNumber{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int a=takeInput();
        int b=takeInput();
        int c=takeInput();
        int max=findMax(a,b,c);
        System.out.println("Maximum number is: "+max);
    }
    //takes integer input
    static int takeInput(){
        System.out.print("Enter number: ");
        return sc.nextInt();
    }
    //finds maximum of three numbers
    static int findMax(int x,int y,int z){
        int max=x;
        if (y>max) max=y;
        if (z>max) max=z;
        return max;
    }
}
