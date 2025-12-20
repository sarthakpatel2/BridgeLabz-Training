import java.util.*;
class MultiplicationTableOfNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // take integer input
        System.out.print("Enter a number ");
        int number = sc.nextInt();
        //define integer array to store results
        int[] multiplicationResult = new int[4];
        //using for loop to calculate multiplication 
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }
        //display the result
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number+" * "+i+" = "+multiplicationResult[index]);
            index++;
        }
    }
}
