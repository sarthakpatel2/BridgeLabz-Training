import java.util.*;
class CheckTheLargestNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // input first number
        int number1=sc.nextInt();
        // input second number
        int number2=sc.nextInt();
        // input third number
        int number3=sc.nextInt();
        //compare for largest number
        //check for first number
        if(number1>number2 && number1>number3){
            System.out.println("Yes the first number is largest");
        }
        //check for second number
        else if(number2>number1 && number2>number3){
            System.out.println("Yes the second number is largest");

        }
        // else third number is largest
        else{
            System.out.println("Yes the third number is largest");
        }
    }
}