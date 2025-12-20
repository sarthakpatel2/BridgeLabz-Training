import java.util.Scanner;
class MultipleOfNumberUsingWhile{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input
        System.out.print("Enter a number");
        int number=sc.nextInt();
        // Check for positive integer less than 100
        if (number<=0 || number>=100) {
            System.out.println("Enter a positive number below 100");
            return;
        }
        int counter=number-1;
        System.out.println("Numbers that perfectly divide "+number);
        // While loop
        while (counter>1) {
            if (number%counter==0) {
                System.out.println(counter);
            }
            counter--;
        }
    }
}
