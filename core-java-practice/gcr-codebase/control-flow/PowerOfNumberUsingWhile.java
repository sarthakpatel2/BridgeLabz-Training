import java.util.Scanner;
class PowerOfNumberUsingWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input number
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        //enter power
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        //initial value
        int result = 1;
        //counter variable
        int counter = 0;
        // While loop to calculate power
        while (counter < power) {
            result = result * number;
            counter++;
        }
        // Print result
        System.out.println(number+"^" +power+"=" + result);
    }
}
