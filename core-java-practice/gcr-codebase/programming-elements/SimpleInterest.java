import java.util.*;
class SimpleInterest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //principal amount input
        double p=sc.nextDoublr();
        //rate of interest input
        double r=sc.nextDouble();
        // time input
        double t=sc.nextDouble();
        //formula
        double si=(p*r*t)/100;
        //simple interest amount
        System.out.println("Simple Interest:"+si);
    }
}