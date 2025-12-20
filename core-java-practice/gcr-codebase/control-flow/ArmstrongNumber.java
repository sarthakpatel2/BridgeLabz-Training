import java.util.Scanner;
class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        //////initialize values
        // store original number
        int originalNumber=number;
        // to store sum of cubes
        int sum=0;    
        //use while loop till originalNumber becomes 0
        while (originalNumber!=0) {
            //find the last digit
            int digit=originalNumber%10;
            //find cube of the digit and add to sum
            sum=sum+(digit*digit*digit);
            //remove last digit from originalNumber
            originalNumber=originalNumber/10;
        }
        //check if number and sum are equal
        if (sum == number) {
            System.out.println(number+" is an Armstrong Number");
        } else {
            System.out.println(number+" is NOT an Armstrong Number");
        }
    }
}
