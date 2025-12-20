import java.util.Scanner;
class MultiplicationTable{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //integer input
        System.out.println("Enter a number");
        int number= sc.nextInt();
        //define array to store multiplication results
        int[] table= new int[10];
        //store results in the array
        for (int i=1;i<= 10;i++) {
            table[i-1]=number* i;
        }
        // Display the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number+ " * " +i+ " = " +table[i - 1]);
        }
    }
}
