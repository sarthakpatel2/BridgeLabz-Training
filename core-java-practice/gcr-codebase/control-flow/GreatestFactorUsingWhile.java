import java.util.*;
class GreatestFactorOfNumberUsingWhile{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //take input
        int number=sc.nextInt();
        //initialize greatest factor
        int greatestFactor=1;
        //finding greatest factor other than itself using while
        int i=number-1;
        while(i>=1){
            if(number%i==0){
                greatestFactor=i;
                break;
            }
            i--;
        }
        //print result
        System.out.print("Greatest factor of "+number+" is: "+greatestFactor);
    }
}