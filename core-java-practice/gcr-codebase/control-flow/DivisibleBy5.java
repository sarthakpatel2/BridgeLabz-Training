import java.util.*;
class DivisibleBy5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // input number
        int number=sc.nextInt();
        // check divisibility by 5
        if(number%5==0){
            System.out.println( "The number "+number+" is divisible by 5");
        }
        else{
            System.out.println("The number "+number+" is not divisible by 5");
        }
    }
}