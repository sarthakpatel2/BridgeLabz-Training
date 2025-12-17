import java.util.*;
class AverageOfThreeNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //first number input
        System.out.println("Enter number 1:");
        Double num1=sc.nextDouble();
        //second number input
        System.out.println("Enter number 2:");
        Double num2=sc.nextDouble();
        //third number input
        System.out.println("Enter number 3:");
        Double num3=sc.nextDouble();
        //average calculation
        Double avg=(num1+num2+num3)/3;
        System.out.println("Average:"+avg);
    }
}