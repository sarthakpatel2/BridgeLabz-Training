import java.util.*;
class SumOfNumbersUntil0{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //total
        double total = 0.0;
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        // loop until 0
        while (number!=0){
            //add total
            total=total+number; 
            //take input again
            System.out.print("Enter a number: ");
            number=sc.nextDouble();
        }
        // result
        System.out.println(total);
    }
}
