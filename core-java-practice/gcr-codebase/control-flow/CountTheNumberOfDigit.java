import java.util.Scanner;
class CountTheNumberOfDigit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //integer input
        System.out.print("Enter a number:");
        int number =sc.nextInt();
        //initialize count
        int count= 0;
        //loop until number becomes 0
        while (number!= 0) {
            //remove last digit
            number=number/10;
            //increase count
            count++;
        }
        //display result
        System.out.println("Number of digits:"+count);
    }
}
