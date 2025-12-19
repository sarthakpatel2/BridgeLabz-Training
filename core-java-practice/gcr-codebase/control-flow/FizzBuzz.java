import java.util.*;
class FizzBuzz{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input
        int number=sc.nextInt();
        //check natural number
        if(number<0){
            System.out.println("Enter a positive number");
        }else{
            //fizzbuzz
            for(int i=1;i<=number;i++){
                //divisible by 3 and 5 both
                if(i%3==0 && i%5==0){
                    System.out.print("FizzBuzz ");
                }
                //divisible by 3
                else if(i%3==0){
                    System.out.print("Fizz");
                }
                //divisible by 5
                else if(i%5==0){
                    System.out.print("Buzz ");
                }
                //divisible by none
                else{
                    System.out.print(i);
                }
            }
        }

    }
}
