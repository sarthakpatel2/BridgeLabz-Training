import java.util.*;
class FizzBuzzUsingWhile{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input
        int number=sc.nextInt();
        //check for natural number
        if(number<=0){
            System.out.println("Enter a positive number");
        }else{
        int i=1;
        //loop until number
            while(i<=number){
                //check divisible by 3 and 5
                if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
                //check divisible by 3
                else if(i%3==0){
                    System.out.println("Fizz");
                }
                //check divisible by 5
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}