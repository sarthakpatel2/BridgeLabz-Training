import java.util.*;
public class AbundantNumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //take input
        int number=sc.nextInt();
        //initial sum value
        int sum = 0;
        //check if number is divisible by i
        for (int i=1;i<number;i++) {
            if (number%i==0) {
                sum=sum+i;
            }
        }
        //compare sum and number
        if (sum>number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
    }
}