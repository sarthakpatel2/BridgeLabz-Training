import java.util.*;
class PositiveNegativeOrZero{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //define array
        int[] number=new int[5];
        //take user input
        System.out.println("Enter 5 numbers:");
        for (int i= 0;i <number.length;i++) {
            number[i]= sc.nextInt();
        }
        //check each number
        for (int i= 0;i< number.length;i++) {
            int num= number[i];
            //for positive odd or even
            if (num> 0) {
                if (num %2== 0) {
                    System.out.println("Positive and Even");
                }else {
                    System.out.println("Positive and Odd");
                }
            }
            //for negative
            else if (num <0) {
                System.out.println("Negative");
            } 
            //for Zero
            else {
                System.out.println("Zero");
            }
        }
        //compare first and last element
        //if equal
        if (number[0]== number[number.length-1]) {
            System.out.println("Equal");
        } 
        //if greater
        else if (number[0] >number[number.length- 1]) {
            System.out.println("Greater");
        } 
        //if less
        else {
            System.out.println("Less");
        }
    }
}
