import java.util.*;
class DoubleOperation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // first number input
        double a=sc.nextDouble();
        // second number input
        double b=sc.nextDouble();
        // third number input
        double c=sc.nextDouble();
        //operations
        double operation1=a+b*c;
        double operation2=a*b+c;
        double operation3=c+a/b;
        double operation4=a%b+c;
        //output
        System.out.println("The result of  Double operations are:"+operation1+","+operation2+","+operation3+" , and "+operation4);
    }
}