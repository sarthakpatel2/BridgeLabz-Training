import java.util.*;
class IntOperation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // first number input
        int a=sc.nextInt();
        // second number input
        int b=sc.nextInt();
        // third number input
        int c=sc.nextInt();
        //operations
        int operation1=a+b*c;
        int operation2=a*b+c;
        int operation3=c+a/b;
        int operation4=a%b+c;
        //output
        System.out.println("The result of  Int operations are:"+operation1+","+operation2+","+operation3+" and "+operation4);
    }
}