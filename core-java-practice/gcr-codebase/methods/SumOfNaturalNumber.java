import java.util.*;
public class SumOfNaturalNumber{
	public static int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            //calculate sum
            sum +=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //input number
        System.out.print("Enter number ");
        int number= input.nextInt();
        int sum=sum(number);
        System.out.println("Sum of first "+number+" natural numbers is "+sum);
    }

}

