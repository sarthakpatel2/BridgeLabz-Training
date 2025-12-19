import java.util.*;
class FactorialUsingFor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input
        int number=sc.nextInt();
        //check natural number
        if(number>0){
            int factorial=1;
            //calculate factorial
            for(int i=1;i<=number;i++){
                factorial=factorial*i;
            }
            //print result
            System.out.print("Factorial of "+number+" is: "+factorial);
        }
    }
}